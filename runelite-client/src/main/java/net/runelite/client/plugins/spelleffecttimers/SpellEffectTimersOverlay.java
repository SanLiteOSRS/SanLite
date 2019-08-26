package net.runelite.client.plugins.spelleffecttimers;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.*;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;

@Slf4j
public class SpellEffectTimersOverlay extends Overlay
{
	private final SpellEffectTimersPlugin plugin;

	@Inject
	private SpellEffectTimersConfig config;

	@Inject
	public SpellEffectTimersOverlay(final SpellEffectTimersPlugin plugin)
	{
		this.plugin = plugin;
		setPriority(OverlayPriority.HIGHEST);
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.UNDER_WIDGETS);
	}

	private BufferedImage getSpellEffectIcon(SpellEffect spellEffect)
	{
		if (spellEffect != null && !spellEffect.getSpellIcon().isEmpty())
		{
			return ImageUtil.getResourceStreamFromClass(SpellEffectTimersPlugin.class, spellEffect.getSpellIcon());
		}
		return null;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (config.showFreezeTimersOverlay())
		{
			for (SpellEffectInfo spellEffectInfo : plugin.getSpellEffects())
			{
				drawSpellEffectOverlay(graphics, spellEffectInfo);
			}
		}
		return null;
	}

	// TODO: Add support for multiple spell effects at the same time
	private void drawSpellEffectOverlay(Graphics2D graphics, SpellEffectInfo spellEffectInfo)
	{
		Actor actor = spellEffectInfo.getActor();
		String text = Math.abs(spellEffectInfo.getRemainingTime() / 10) + "." + (Math.abs(spellEffectInfo.getRemainingTime()) % 10);
		Point actorTextPoint = actor.getCanvasTextLocation(graphics, text, 0);

		if (actorTextPoint == null)
		{
			return;
		}

		if (config.showSpellImage())
		{
			BufferedImage image = getSpellEffectIcon(spellEffectInfo.getSpellEffect());
			if (image != null)
			{
				int offset = 4;
				int imageOffsetY = 14;

				graphics.drawImage(image, actorTextPoint.getX(), actorTextPoint.getY() - imageOffsetY, null);
				Point textLocation = new Point(actorTextPoint.getX() + image.getWidth() + offset, actorTextPoint.getY());
				OverlayUtil.renderTextLocation(graphics, text, config.getTimersFontSize(),
						config.getTimersFontStyle().getFont(), config.getTimersFontColor(), textLocation, false, 0);
			}
			else
			{
				log.warn("Could not load spell effect icon for {}", spellEffectInfo.getSpellEffect().getName());
				OverlayUtil.renderTextLocation(graphics, text, config.getTimersFontSize(),
						config.getTimersFontStyle().getFont(), config.getTimersFontColor(), actorTextPoint, false, 0);
			}
		}
		else
		{
			OverlayUtil.renderTextLocation(graphics, text, config.getTimersFontSize(),
					config.getTimersFontStyle().getFont(), config.getTimersFontColor(), actorTextPoint, false, 0);
		}
	}
}
