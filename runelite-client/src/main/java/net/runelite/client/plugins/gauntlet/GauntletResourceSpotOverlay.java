package net.runelite.client.plugins.gauntlet;

import net.runelite.api.GameObject;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.*;

public class GauntletResourceSpotOverlay extends Overlay
{

	private final GauntletPlugin plugin;
	private final GauntletConfig config;

	@Inject
	private GauntletResourceSpotOverlay(GauntletPlugin plugin, GauntletConfig config)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.plugin = plugin;
		this.config = config;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		for (GameObject gameObject : plugin.getResourceSpots())
		{
			GauntletResourceSpot resourceSpot = GauntletResourceSpot.getSPOTS().get(gameObject.getId());

			if (resourceSpot == null)
			{
				continue;
			}

			Color color = plugin.getResourceSpotColor(gameObject.getId());

			if (config.showResourceSpotsObjectMarkers())
			{
				Polygon poly = gameObject.getConvexHull();
				if (poly != null)
				{
					OverlayUtil.renderPolygon(graphics, poly, color);
				}
			}

			if (config.showResourceSpotsTiles())
			{
				Polygon poly = gameObject.getCanvasTilePoly();
				if (poly != null)
				{
					OverlayUtil.renderPolygon(graphics, poly, color);
				}
			}

			if (config.showResourceSpotsNames())
			{
				String text = resourceSpot.getName();

				Point textLocation = gameObject.getCanvasTextLocation(graphics, text, 40);

				if (textLocation != null)
				{
					OverlayUtil.renderTextLocation(graphics, textLocation, text, color.darker());
				}
			}
		}

		return null;
	}
}
