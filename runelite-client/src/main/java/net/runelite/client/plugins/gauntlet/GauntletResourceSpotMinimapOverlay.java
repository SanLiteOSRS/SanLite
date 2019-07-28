package net.runelite.client.plugins.gauntlet;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.GameObject;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.*;

@Slf4j
public class GauntletResourceSpotMinimapOverlay extends Overlay
{
	private final GauntletPlugin plugin;
	private final GauntletConfig config;

	@Inject
	private GauntletResourceSpotMinimapOverlay(GauntletPlugin plugin, GauntletConfig config)
	{
		this.plugin = plugin;
		this.config = config;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (config.showResourceSpotsOnMinimap())
		{
			for (GameObject gameObject : plugin.getResourceSpots())
			{

				if (GauntletResourceSpot.getSPOTS().get(gameObject.getId()) == null)
				{
					continue;
				}
				renderResourceSpotOverlay(graphics, gameObject, plugin.getResourceSpotColor(gameObject.getId()));
			}
		}

		return null;
	}

	private void renderResourceSpotOverlay(Graphics2D graphics, GameObject gameObject, Color color)
	{
		Point minimapLocation = gameObject.getMinimapLocation();
		if (minimapLocation != null)
		{
			OverlayUtil.renderMinimapLocation(graphics, minimapLocation, color.darker());
		}
	}
}
