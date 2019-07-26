package net.runelite.client.plugins.gauntlet;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.GameObject;
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
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.plugin = plugin;
		this.config = config;
	}

	// TODO: Fix minimap dots not showing (might be wrong coords or instance)
	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!config.showResourceSpotsOnMinimap())
		{
			return null;
		}

		for (GameObject gameObject : plugin.getResourceSpots())
		{
			GauntletResourceSpot resourceSpot = GauntletResourceSpot.getSPOTS().get(gameObject.getId());

			if (resourceSpot == null)
			{
				continue;
			}

			Color color = plugin.getResourceSpotColor(gameObject.getId());

			net.runelite.api.Point minimapLocation = gameObject.getMinimapLocation();
			if (minimapLocation != null)
			{
				OverlayUtil.renderMinimapLocation(graphics, minimapLocation, color);
			}
		}

		return null;
	}
}
