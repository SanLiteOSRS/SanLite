package net.runelite.client.plugins.zoneindicators;

import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.events.ConfigChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.geometry.Geometry;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.MapLocations;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Arrays;

@PluginDescriptor(
		name = "Zone Indicators",
		description = "Show borders of multi combat zones, wilderness levels and PvP/Deadman safezones",
		tags = {"multi combat", "lines", "pvp", "deadman", "safezones", "wilderness", "overlay", "sanlite"},
		enabledByDefault = false
)
@Singleton
public class ZoneIndicatorsPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private ZoneIndicatorsConfig config;

	@Inject
	private ZoneIndicatorsOverlay overlay;

	@Inject
	private ZoneIndicatorsMinimapOverlay minimapOverlay;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private EventBus eventBus;

	@Getter(AccessLevel.PACKAGE)
	private GeneralPath[] multiCombatPathToDisplay;

	@Getter(AccessLevel.PACKAGE)
	private GeneralPath[] pvpPathToDisplay;

	@Getter(AccessLevel.PACKAGE)
	private GeneralPath[] wildernessLevelLinesPathToDisplay;

	@Getter(AccessLevel.PACKAGE)
	private boolean inPvp;

	@Getter(AccessLevel.PACKAGE)
	private boolean inDeadman;

	private int currentPlane;

	@Getter(AccessLevel.PACKAGE)
	private ZoneVisibility multiCombatZoneVisibility;
	@Getter(AccessLevel.PACKAGE)
	private boolean showPvpSafeZones;
	@Getter(AccessLevel.PACKAGE)
	private boolean showDeadmanSafeZones;
	@Getter(AccessLevel.PACKAGE)
	private boolean showWildernessLevelLines;
	@Getter(AccessLevel.PACKAGE)
	private boolean showMinimapLines;
	@Getter(AccessLevel.PACKAGE)
	private Color multiCombatColor;
	@Getter(AccessLevel.PACKAGE)
	private Color safeZoneColor;
	@Getter(AccessLevel.PACKAGE)
	private Color wildernessLevelLinesColor;
	@Getter(AccessLevel.PACKAGE)
	private boolean thinnerLines;

	@Provides
	ZoneIndicatorsConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ZoneIndicatorsConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		updateConfig();

		overlayManager.add(overlay);
		overlayManager.add(minimapOverlay);

		initializePaths();

		clientThread.invokeLater(() ->
		{
			if (client.getGameState() == GameState.LOGGED_IN)
			{
				findLinesInScene();
			}
		});
	}

	@Override
	protected void shutDown() throws Exception
	{
		eventBus.unregister(this);

		overlayManager.remove(overlay);
		overlayManager.remove(minimapOverlay);

		uninitializePaths();
	}


	private void initializePaths()
	{
		multiCombatPathToDisplay = new GeneralPath[Constants.MAX_Z];
		pvpPathToDisplay = new GeneralPath[Constants.MAX_Z];
		wildernessLevelLinesPathToDisplay = new GeneralPath[Constants.MAX_Z];
	}

	private void uninitializePaths()
	{
		multiCombatPathToDisplay = null;
		pvpPathToDisplay = null;
		wildernessLevelLinesPathToDisplay = null;
	}

	// sometimes the lines get offset (seems to happen when there is a delay
	// due to map reloading when walking/running "Loading - please wait")
	// resetting the lines generation logic fixes this

	public void update()
	{
		if (client.getGameState() == GameState.LOGGED_IN)
		{
			clientThread.invokeLater(this::findLinesInScene);
		}

	}

	private void transformWorldToLocal(float[] coords)
	{
		LocalPoint lp = LocalPoint.fromWorld(client, (int) coords[0], (int) coords[1]);
		if (lp != null)
		{
			coords[0] = lp.getX() - Perspective.LOCAL_TILE_SIZE / 2f;
			coords[1] = lp.getY() - Perspective.LOCAL_TILE_SIZE / 2f;
		}
	}

	private boolean isOpenableAt(WorldPoint wp)
	{
		int sceneX = wp.getX() - client.getBaseX();
		int sceneY = wp.getY() - client.getBaseY();

		Tile tile = client.getScene().getTiles()[wp.getPlane()][sceneX][sceneY];
		if (tile == null)
		{
			return false;
		}

		WallObject wallObject = tile.getWallObject();
		if (wallObject == null)
		{
			return false;
		}

		ObjectComposition objectComposition = client.getObjectDefinition(wallObject.getId());

		if (objectComposition == null)
		{
			return false;
		}

		String[] actions = objectComposition.getActions();
		if (actions == null)
		{
			return false;
		}

		return Arrays.stream(actions).anyMatch(x -> x != null && x.toLowerCase().equals("open"));
	}

	private boolean collisionFilter(float[] p1, float[] p2)
	{
		int x1 = (int) p1[0];
		int y1 = (int) p1[1];
		int x2 = (int) p2[0];
		int y2 = (int) p2[1];

		if (x1 > x2)
		{
			int temp = x1;
			x1 = x2;
			x2 = temp;
		}
		if (y1 > y2)
		{
			int temp = y1;
			y1 = y2;
			y2 = temp;
		}
		int dx = x2 - x1;
		int dy = y2 - y1;
		WorldArea wa1 = new WorldArea(new WorldPoint(
				x1, y1, currentPlane), 1, 1);
		WorldArea wa2 = new WorldArea(new WorldPoint(
				x1 - dy, y1 - dx, currentPlane), 1, 1);

		if (isOpenableAt(wa1.toWorldPoint()) || isOpenableAt(wa2.toWorldPoint()))
		{
			// When there's something with the open option (e.g. a door) on the tile,
			// we assume it can be opened and walked through afterwards. Without this
			// check, the line for that tile wouldn't render with collision detection
			// because the collision check isn't done if collision data changes.
			return true;
		}

		boolean b1 = wa1.canTravelInDirection(client, -dy, -dx);
		boolean b2 = wa2.canTravelInDirection(client, dy, dx);
		return b1 && b2;
	}

	private void findLinesInScene()
	{
		inDeadman = client.getWorldType().stream().anyMatch(x -> x == WorldType.DEADMAN);
		inPvp = client.getWorldType().stream().anyMatch(x -> x == WorldType.PVP || x == WorldType.HIGH_RISK);

		Rectangle sceneRect = new Rectangle(
				client.getBaseX() + 1, client.getBaseY() + 1,
				Constants.SCENE_SIZE - 2, Constants.SCENE_SIZE - 2);

		// Generate lines for multi combat zones
		if (this.multiCombatZoneVisibility == ZoneVisibility.HIDE)
		{
			Arrays.fill(multiCombatPathToDisplay, null);
		}
		else
		{
			for (int i = 0; i < multiCombatPathToDisplay.length; i++)
			{
				currentPlane = i;

				GeneralPath lines = new GeneralPath(MapLocations.getMultiCombat(sceneRect, i));
				lines = Geometry.clipPath(lines, sceneRect);
				if (this.multiCombatZoneVisibility == ZoneVisibility.SHOW_IN_PVP &&
						!isInDeadman() && !isInPvp())
				{
					lines = Geometry.clipPath(lines, MapLocations.getWilderness(i));
				}
				lines = Geometry.splitIntoSegments(lines, 1);
				if (useCollisionLogic())
				{
					lines = Geometry.filterPath(lines, this::collisionFilter);
				}
				lines = Geometry.transformPath(lines, this::transformWorldToLocal);
				multiCombatPathToDisplay[i] = lines;
			}
		}

		// Generate safezone lines for deadman/pvp worlds
		for (int i = 0; i < pvpPathToDisplay.length; i++)
		{
			currentPlane = i;

			GeneralPath safeZonePath = null;
			if (this.showDeadmanSafeZones && isInDeadman())
			{
				safeZonePath = new GeneralPath(MapLocations.getDeadmanSafeZones(sceneRect, i));
			}
			else if (this.showPvpSafeZones && isInPvp())
			{
				safeZonePath = new GeneralPath(MapLocations.getPvpSafeZones(sceneRect, i));
			}
			GeneralPath transformedSafezonePath = transformZoneLines(safeZonePath, sceneRect);
			if (transformedSafezonePath != null)
			{
				safeZonePath = transformedSafezonePath;
			}
			pvpPathToDisplay[i] = safeZonePath;
		}

		// Generate wilderness level lines
		for (int i = 0; i < wildernessLevelLinesPathToDisplay.length; i++)
		{
			currentPlane = i;

			GeneralPath wildernessLevelLinesPath = null;
			if (this.showWildernessLevelLines)
			{
				wildernessLevelLinesPath = new GeneralPath(MapLocations.getWildernessLevelLines(sceneRect, i));
			}
			GeneralPath transformedWildernessLevelPath = transformZoneLines(wildernessLevelLinesPath, sceneRect);
			if (transformedWildernessLevelPath != null)
			{
				wildernessLevelLinesPath = transformedWildernessLevelPath;
			}
			wildernessLevelLinesPathToDisplay[i] = wildernessLevelLinesPath;
		}
	}

	private GeneralPath transformZoneLines(GeneralPath zonePath, Rectangle sceneRect)
	{
		if (zonePath != null)
		{
			zonePath = Geometry.clipPath(zonePath, sceneRect);
			zonePath = Geometry.splitIntoSegments(zonePath, 1);
			if (useCollisionLogic())
			{
				zonePath = Geometry.filterPath(zonePath, this::collisionFilter);
			}
			return Geometry.transformPath(zonePath, this::transformWorldToLocal);
		}
		return null;
	}

	private boolean useCollisionLogic()
	{
		// currently prevents overlay lines from showing up if this is ever enabled right now
		return false;
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("Zone Indicators"))
		{
			return;
		}

		updateConfig();

		if (event.getKey().equals("collisionDetection") ||
				event.getKey().equals("multiCombatZoneVisibility") ||
				event.getKey().equals("deadmanSafeZones") ||
				event.getKey().equals("pvpSafeZones") ||
				event.getKey().equals("wildernessLevelLines"))
		{
			findLinesInScene();
		}
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGGED_IN)
		{
			findLinesInScene();
		}
	}

	private void updateConfig()
	{
		this.multiCombatZoneVisibility = config.multiCombatZoneVisibility();
		this.showPvpSafeZones = config.showPvpSafeZones();
		this.showDeadmanSafeZones = config.showDeadmanSafeZones();
		this.showWildernessLevelLines = config.showWildernessLevelLines();
		this.showMinimapLines = config.showMinimapLines();
		this.multiCombatColor = config.multiCombatColor();
		this.safeZoneColor = config.safeZoneColor();
		this.wildernessLevelLinesColor = config.wildernessLevelLinesColor();
		this.thinnerLines = config.thinnerLines();
	}
}