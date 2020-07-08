package net.runelite.client.plugins.nightmareofashihama;

import net.runelite.api.*;
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
			if (config.highlightActiveTotems())
			{
				renderActiveTotemsHighlights(graphics, nightmare);
			}

			if (config.highlightGhostAttackTiles())
			{
				renderGhostAttackTileMarkers(graphics, nightmare);
			}

			if (config.highlightInfectiousSpores())
			{
				renderInfectiousSporesTileMarkers(graphics, nightmare);
			}
		}
		return null;
	}

	private void renderActiveTotemsHighlights(Graphics2D graphics, NightmareOfAshihama nightmare)
	{
		for (NPC activeTotem : nightmare.getActiveTotems())
		{
			Shape objectClickbox = activeTotem.getConvexHull();

			if (objectClickbox == null)
			{
				continue;
			}
			OverlayUtil.renderPolygon(graphics, objectClickbox, config.getActiveTotemColor());
		}
	}

	private void renderGhostAttackTileMarkers(Graphics2D graphics, NightmareOfAshihama nightmare)
	{
		NPC nightmareNpc = nightmare.getNpc();
		if (nightmare.getNpc().getAnimation() == AnimationID.NIGHTMARE_GHOST_AOE_ATTACK)
		{
			LocalPoint localPoint = nightmareNpc.getLocalLocation();
			Polygon areaPolygon = Perspective.getCanvasTileAreaPoly(client, localPoint, 5);
			if (areaPolygon == null)
			{
				return;
			}

			OverlayUtil.renderPolygon(graphics, areaPolygon, config.getGhostAttackColor(),
					config.getTileMarkersLineSize().getSize());
		}

		for (GraphicsObject graphicsObject : nightmare.getGraphicObjects())
		{
			if (!nightmare.isGhostAttackGraphicsObjectId(graphicsObject.getId()))
			{
				return;
			}

			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);
			if (polygon == null)
			{
				return;
			}

			OverlayUtil.renderPolygon(graphics, polygon, config.getGhostAttackColor(),
					config.getTileMarkersLineSize().getSize());
		}
	}

	private void renderInfectiousSporesTileMarkers(Graphics2D graphics, NightmareOfAshihama nightmare)
	{
		for (GameObject gameObject : nightmare.getGameObjects())
		{
			if (!nightmare.isInfectiousSporeGameObjectId(gameObject.getId()))
			{
				return;
			}

			LocalPoint localPoint = gameObject.getLocalLocation();
			Polygon areaPolygon = Perspective.getCanvasTileAreaPoly(client, localPoint, 3);
			if (areaPolygon == null)
			{
				return;
			}

			OverlayUtil.renderPolygon(graphics, areaPolygon, config.getInfectiousSporesColor(),
					config.getTileMarkersLineSize().getSize());
		}
	}
}
