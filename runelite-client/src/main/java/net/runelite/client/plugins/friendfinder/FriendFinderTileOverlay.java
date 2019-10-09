package net.runelite.client.plugins.friendfinder;

import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import java.awt.*;

public class FriendFinderTileOverlay extends Overlay
{
	private final FriendFinderService friendFinderService;
	private final FriendFinderConfig config;

	@Inject
	private FriendFinderTileOverlay(FriendFinderConfig config, FriendFinderService friendFinderService)
	{
		this.config = config;
		this.friendFinderService = friendFinderService;
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.MED);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!config.drawTiles())
		{
			return null;
		}

		friendFinderService.forEachPlayer((player, color) ->
		{
			final Polygon poly = player.getCanvasTilePoly();

			if (poly != null)
			{
				OverlayUtil.renderPolygon(graphics, poly, color);
			}
		});

		return null;
	}
}
