package net.runelite.client.plugins.friendfinder;

import net.runelite.api.Player;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Singleton
public class FriendFinderMinimapOverlay extends Overlay
{
	private final FriendFinderService friendFinderService;
	private final FriendFinderConfig config;

	@Inject
	private FriendFinderMinimapOverlay(FriendFinderConfig config, FriendFinderService friendFinderService)
	{
		this.config = config;
		this.friendFinderService = friendFinderService;
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.HIGH);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		friendFinderService.forEachPlayer((player, color) -> renderPlayerOverlay(graphics, player, color));
		return null;
	}

	private void renderPlayerOverlay(Graphics2D graphics, Player actor, Color color)
	{
		final String name = actor.getName().replace('\u00A0', ' ');

		if (config.drawMinimapNames())
		{
			final net.runelite.api.Point minimapLocation = actor.getMinimapLocation();

			if (minimapLocation != null)
			{
				OverlayUtil.renderTextLocation(graphics, minimapLocation, name, color);
			}
		}
	}
}