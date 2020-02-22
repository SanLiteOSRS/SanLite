package net.runelite.client.plugins.attacktimer;

import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.client.config.FontStyle;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Singleton
public class AttackTimerOverlay extends Overlay
{
	private final AttackTimerPlugin plugin;

	@Inject
	private Client client;

	@Inject
	AttackTimerOverlay(final AttackTimerPlugin plugin, final Client client)
	{
		this.plugin = plugin;
		this.client = client;
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
		Point actorTextPoint = actor.getCanvasTextLocation(graphics, text, 0);

		if (actorTextPoint == null)
		{
			return;
		}

		OverlayUtil.renderTextLocation(graphics, text, 16, FontStyle.BOLD.getFont(), new Color(255, 255, 255, 255), actorTextPoint, false, 0);
	}
}