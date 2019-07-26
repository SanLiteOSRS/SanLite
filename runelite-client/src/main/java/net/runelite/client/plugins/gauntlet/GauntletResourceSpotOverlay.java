package net.runelite.client.plugins.gauntlet;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.GameObject;
import net.runelite.api.Point;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;

@Slf4j
public class GauntletResourceSpotOverlay extends Overlay
{

	private final GauntletPlugin plugin;
	private final GauntletConfig config;
	private final ItemManager itemManager;

	@Inject
	private GauntletResourceSpotOverlay(GauntletPlugin plugin, GauntletConfig config, ItemManager itemManager)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.plugin = plugin;
		this.config = config;
		this.itemManager = itemManager;
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

			if (config.showResourceSpotsTiles())
			{
				Polygon poly = gameObject.getCanvasTilePoly();
				if (poly != null)
				{
					OverlayUtil.renderPolygon(graphics, poly, color);
				}
			}

			if (config.showResourceSpotsIcons())
			{
				BufferedImage resourceImage = itemManager.getImage(resourceSpot.getResourceSpriteId());

				if (resourceImage != null)
				{
					Point imageLocation = gameObject.getCanvasLocation(); // TODO:
					if (imageLocation != null)
					{
						OverlayUtil.renderImageLocation(graphics, imageLocation, resourceImage);
					}
				}
			}

			if (config.showResourceSpotsNames())
			{
				String text = resourceSpot.getName();

				Point textLocation = gameObject.getCanvasTextLocation(graphics, text, 40); // TODO:

				if (textLocation != null)
				{
					OverlayUtil.renderTextLocation(graphics, textLocation, text, color.darker());
				}
			}
		}

		return null;
	}
}
