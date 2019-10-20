package net.runelite.client.plugins.zoneindicators;

import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.geometry.Geometry;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.awt.geom.GeneralPath;

@Singleton
public class ZoneIndicatorsMinimapOverlay extends Overlay
{
	private final static int MAX_LOCAL_DRAW_LENGTH = 20 * Perspective.LOCAL_TILE_SIZE;

	@Inject
	private Client client;

	@Inject
	private ZoneIndicatorsPlugin plugin;

	@Inject
	public ZoneIndicatorsMinimapOverlay()
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ALWAYS_ON_TOP);
		setPriority(OverlayPriority.LOW);
	}

	private Color getTransparentColorVersion(Color c)
	{
		return new Color(c.getRed(), c.getGreen(), c.getBlue(), 192);
	}

	private void renderPath(Graphics2D graphics, GeneralPath path, Color color)
	{
		if (client.getLocalPlayer() == null)
		{
			return;
		}

		final LocalPoint playerLp = client.getLocalPlayer().getLocalLocation();
		final Rectangle viewArea = new Rectangle(
				playerLp.getX() - MAX_LOCAL_DRAW_LENGTH,
				playerLp.getY() - MAX_LOCAL_DRAW_LENGTH,
				MAX_LOCAL_DRAW_LENGTH * 2,
				MAX_LOCAL_DRAW_LENGTH * 2);

		graphics.setColor(color);

		path = Geometry.clipPath(path, viewArea);
		path = Geometry.filterPath(path, (p1, p2) ->
				Perspective.localToMinimap(client, new LocalPoint((int) p1[0], (int) p1[1])) != null &&
						Perspective.localToMinimap(client, new LocalPoint((int) p2[0], (int) p2[1])) != null);
		path = Geometry.transformPath(path, coords ->
		{
			final Point point = Perspective.localToMinimap(client, new LocalPoint((int) coords[0], (int) coords[1]));
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
		if (!plugin.isShowMinimapLines())
		{
			return null;
		}

		final Widget widget;
		if (client.getWidget(WidgetInfo.FIXED_VIEWPORT_MINIMAP_DRAW_AREA) != null)
		{
			widget = client.getWidget(WidgetInfo.FIXED_VIEWPORT_MINIMAP_DRAW_AREA);
		}
		else
		{
			widget = client.getWidget(WidgetInfo.RESIZABLE_MINIMAP_STONES_DRAW_AREA);
		}

		if (widget == null)
		{
			return null;
		}

		final Rectangle minimapClip = widget.getBounds();

		graphics.setClip(minimapClip);

		final GeneralPath multiCombatPath = plugin.getMultiCombatPathToDisplay()[client.getPlane()];
		final GeneralPath pvpPath = plugin.getPvpPathToDisplay()[client.getPlane()];
		final GeneralPath wildernessLevelLinesPath = plugin.getWildernessLevelLinesPathToDisplay()[client.getPlane()];

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