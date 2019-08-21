package net.runelite.client.plugins.theatreofblood;

import lombok.extern.slf4j.Slf4j;
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

@Slf4j
public class TheatreOfBloodOverlay extends Overlay
{

	private Client client;
	private TheatreOfBloodPlugin plugin;

	@Inject
	private TheatreOfBloodConfig config;

	@Inject
	public TheatreOfBloodOverlay(Client client, TheatreOfBloodPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		SugadintiMaiden sugadintiMaiden = plugin.getSugadintiMaiden();
		if (sugadintiMaiden != null)
		{
			if (config.highlightBloodSplatAttackTiles())
			{
				renderAoeEffects(graphics, sugadintiMaiden);
			}
		}
		return null;
	}

	private void renderAoeEffects(Graphics2D graphics, SugadintiMaiden sugadintiMaiden)
	{
		for (GraphicsObject graphicsObject : sugadintiMaiden.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (sugadintiMaiden.isBloodAttack(graphicsObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getBloodSplatAttackColor());
				}
			}
		}
	}
}