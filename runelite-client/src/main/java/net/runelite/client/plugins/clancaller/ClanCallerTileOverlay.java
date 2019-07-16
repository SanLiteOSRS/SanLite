package net.runelite.client.plugins.clancaller;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.inject.Inject;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

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

			if (clanCallerService.playerIdentity(player) == "caller" && config.drawCallerTiles())
			{
				if (poly != null)
				{
					OverlayUtil.renderPolygon(graphics, poly, color);
				}
			}
			if (clanCallerService.playerIdentity(player) == "pile" && config.drawPileTiles())
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
