package net.runelite.client.plugins.zoneindicators;

import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.geometry.Geometry;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.awt.geom.GeneralPath;

@Singleton
public class ZoneIndicatorsOverlay extends Overlay
{
	private final static int MAX_LOCAL_DRAW_LENGTH = 20 * Perspective.LOCAL_TILE_SIZE;

	@Inject
	private Client client;

	@Inject
	private ZoneIndicatorsPlugin plugin;

	@Inject
	public ZoneIndicatorsOverlay()
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPriority(OverlayPriority.LOW);
	}

	private Color getTransparentColorVersion(Color color)
	{
		// The thin lines are difficult to see with low opacity, but they are visible and less obtrusive with full opacity
		if (plugin.isThinnerLines())
		{
			return color;
		}
		else
		{
			return new Color(color.getRed(), color.getGreen(), color.getBlue(), 92);
		}
	}

	private void renderPath(Graphics2D graphics, GeneralPath path, Color color)
	{
		if (client.getLocalPlayer() == null)
		{
			return;
		}

		LocalPoint playerLp = client.getLocalPlayer().getLocalLocation();
		Rectangle viewArea = new Rectangle(
				playerLp.getX() - MAX_LOCAL_DRAW_LENGTH,
				playerLp.getY() - MAX_LOCAL_DRAW_LENGTH,
				MAX_LOCAL_DRAW_LENGTH * 2,
				MAX_LOCAL_DRAW_LENGTH * 2);

		graphics.setColor(color);
		if (plugin.isThinnerLines())
		{
			graphics.setStroke(new BasicStroke(1));
		}
		else
		{
			graphics.setStroke(new BasicStroke(2));
		}
		path = Geometry.clipPath(path, viewArea);
		path = Geometry.filterPath(path, (p1, p2) ->
				Perspective.localToCanvas(client, new LocalPoint((int) p1[0], (int) p1[1]), client.getPlane()) != null &&
						Perspective.localToCanvas(client, new LocalPoint((int) p2[0], (int) p2[1]), client.getPlane()) != null);
		path = Geometry.transformPath(path, coords ->
		{
			Point point = Perspective.localToCanvas(client, new LocalPoint((int) coords[0], (int) coords[1]), client.getPlane());
			if (point != null)
			{
				coords[0] = point.getX();
				coords[1] = point.getY();
			}
		});

		graphics.draw(path);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		GeneralPath multiCombatPath = plugin.getMultiCombatPathToDisplay()[client.getPlane()];
		GeneralPath pvpPath = plugin.getPvpPathToDisplay()[client.getPlane()];
		GeneralPath wildernessLevelLinesPath = plugin.getWildernessLevelLinesPathToDisplay()[client.getPlane()];

		if (plugin.getMultiCombatZoneVisibility() != ZoneVisibility.HIDE && multiCombatPath != null)
		{
			renderPath(graphics, multiCombatPath, getTransparentColorVersion(plugin.getMultiCombatColor()));
		}
		if ((plugin.isShowPvpSafeZones() || plugin.isShowDeadmanSafeZones()) && pvpPath != null)
		{
			renderPath(graphics, pvpPath, getTransparentColorVersion(plugin.getSafeZoneColor()));
		}
		if (plugin.isShowWildernessLevelLines() && wildernessLevelLinesPath != null)
		{
			renderPath(graphics, wildernessLevelLinesPath, getTransparentColorVersion(plugin.getWildernessLevelLinesColor()));
		}

		return null;
	}
}