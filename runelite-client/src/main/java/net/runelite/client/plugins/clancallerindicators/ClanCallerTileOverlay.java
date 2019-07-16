package net.runelite.client.plugins.clancallerindicators;

import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import java.awt.*;

public class ClanCallerTileOverlay extends Overlay
{
	private final ClanCallerService clanCallerService;
	private final ClanCallerConfig config;

	@Inject
	private ClanCallerTileOverlay(ClanCallerConfig config, ClanCallerService clanCallerService)
	{
		this.config = config;
		this.clanCallerService = clanCallerService;
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.MED);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!config.drawCallerTiles() && !config.drawPileTiles())
		{
			return null;
		}

		clanCallerService.forEachPlayer((player, color) ->
		{
			final Polygon poly = player.getCanvasTilePoly();

			if (clanCallerService.getPlayerIdentity(player).equals("caller") && config.drawCallerTiles())
			{
				if (poly != null)
				{
					OverlayUtil.renderPolygon(graphics, poly, color);
				}
			}
			if (clanCallerService.getPlayerIdentity(player).equals("pile") && config.drawPileTiles())
			{
				if (poly != null)
				{
					OverlayUtil.renderPolygon(graphics, poly, color);
				}
			}
		});

		return null;
	}
}
