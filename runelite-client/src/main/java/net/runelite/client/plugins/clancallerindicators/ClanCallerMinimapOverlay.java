package net.runelite.client.plugins.clancallerindicators;

import net.runelite.api.Player;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Singleton
public class ClanCallerMinimapOverlay extends Overlay
{
	private final ClanCallerService ClanCallerService;
	private final ClanCallerConfig config;

	@Inject
	private ClanCallerMinimapOverlay(ClanCallerConfig config, ClanCallerService ClanCallerService)
	{
		this.config = config;
		this.ClanCallerService = ClanCallerService;
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.HIGH);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		ClanCallerService.forEachPlayer((player, color) -> renderPlayerOverlay(graphics, player, color));
		return null;
	}

	private void renderPlayerOverlay(Graphics2D graphics, Player actor, Color color)
	{
		final String name = actor.getName().replace('\u00A0', ' ');

		if (ClanCallerService.getPlayerIdentity(actor).equals("pile") && config.drawPileMinimapNames())
		{
			final net.runelite.api.Point minimapLocation = actor.getMinimapLocation();

			if (minimapLocation != null)
			{
				OverlayUtil.renderTextLocation(graphics, minimapLocation, name, color);
			}
		}
		if (ClanCallerService.getPlayerIdentity(actor).equals("caller") && config.drawCallerMinimapNames())
		{
			final net.runelite.api.Point minimapLocation = actor.getMinimapLocation();

			if (minimapLocation != null)
			{
				OverlayUtil.renderTextLocation(graphics, minimapLocation, name, color);
			}
		}
	}
}
