package net.runelite.client.plugins.nightmareofashihama;

import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.*;

public class NightmareOfAshihamaOverlay extends Overlay
{
	private Client client;
	private NightmareOfAshihamaPlugin plugin;

	@Inject
	private NightmareOfAshihamaConfig config;

	@Inject
	public NightmareOfAshihamaOverlay(Client client, NightmareOfAshihamaPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		NightmareOfAshihama nightmare = plugin.getNightmare();
		if (nightmare != null)
		{
			// TODO: Add config checks & render methods
			if (config.highlightGhostAttackTiles())
			{
				renderGhostAttackTileMarkers(graphics, nightmare);
			}
		}
		return null;
	}

	private void renderGhostAttackTileMarkers(Graphics2D graphics, NightmareOfAshihama nightmare)
	{
		for (GraphicsObject graphicsObject : nightmare.getGraphicObjects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);
			Polygon areaPolygon = Perspective.getCanvasTileAreaPoly(client, localPoint, 3);

			if (polygon == null || areaPolygon == null)
			{
				return;
			}

			// TODO: Add id check
			if (nightmare.isGhostAttackGraphicsObjectId(graphicsObject.getId()))
			{
				// TODO: Add color
				OverlayUtil.renderPolygon(graphics, areaPolygon, config.getGhostAttackColor());
			}
		}
	}
}
