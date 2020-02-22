package net.runelite.client.plugins.attacktimer;

import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Singleton
public class AttackTimerOverlay extends Overlay
{
	private final AttackTimerPlugin plugin;
	private final AttackTimerConfig config;

	@Inject
	private Client client;

	@Inject
	AttackTimerOverlay(final AttackTimerPlugin plugin, final Client client, final AttackTimerConfig config)
	{
		this.plugin = plugin;
		this.client = client;
		this.config = config;
		setPriority(OverlayPriority.HIGHEST);
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.UNDER_WIDGETS);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (plugin.getTicksTillNextAttack() > 0)
		{
			renderTimeTillNextAttackText(graphics);
		}

		return null;
	}

	private void renderTimeTillNextAttackText(Graphics2D graphics)
	{
		Actor actor = client.getLocalPlayer();
		String text = Integer.toString(plugin.getTicksTillNextAttack());
		Point actorTextPoint = actor.getCanvasTextLocation(graphics, text, config.getZOffset());

		if (actorTextPoint == null)
		{
			return;
		}

		OverlayUtil.renderTextLocation(graphics, text, config.getTimerFontSize(), config.getTimerFontStyle().getFont(), config.getTimerFontColor(), actorTextPoint, false, 0);
	}
}