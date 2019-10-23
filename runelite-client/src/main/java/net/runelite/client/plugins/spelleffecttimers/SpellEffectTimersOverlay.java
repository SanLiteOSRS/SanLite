/*
 * Copyright (c) 2019, Siraz, Jajack
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.spelleffecttimers;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.*;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class SpellEffectTimersOverlay extends Overlay
{
	private final SpellEffectTimersPlugin plugin;
	private SpellEffectTimersConfig config;

	@Inject
	public SpellEffectTimersOverlay(final SpellEffectTimersPlugin plugin, SpellEffectTimersConfig config)
	{
		this.plugin = plugin;
		this.config = config;
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
		if (!config.showFreezeTimersOverlay() && !config.showTeleblockTimersOverlay() && !config.showVengTimersOverlay() && !config.showVengActiveOverlay())
		{
			return null;
		}

		for (SpellEffectInfo spellEffectInfo : plugin.getSpellEffects())
		{
			if (config.showFreezeTimersOverlay())
			{
				if (spellEffectInfo.getSpellEffect().getSpellType().equals(SpellEffectType.FREEZE) ||
						spellEffectInfo.getSpellEffect().getSpellType().equals(SpellEffectType.FREEZE_IMMUNITY))
				{
					drawSpellEffectOverlay(graphics, spellEffectInfo);
				}
			}
			if (config.showTeleblockTimersOverlay())
			{
				if (spellEffectInfo.getSpellEffect().getSpellType().equals(SpellEffectType.TELEBLOCK) ||
						spellEffectInfo.getSpellEffect().getSpellType().equals(SpellEffectType.TELEBLOCK_IMMUNITY))
				{
					drawSpellEffectOverlay(graphics, spellEffectInfo);
				}
			}
			if (config.showVengTimersOverlay())
			{
				if (spellEffectInfo.getSpellEffect().equals(SpellEffect.VENGEANCE))
				{
					drawSpellEffectOverlay(graphics, spellEffectInfo);
				}
			}
			if (config.showVengActiveOverlay())
			{
				if (spellEffectInfo.getSpellEffect().equals(SpellEffect.VENGEANCE_ACTIVE))
				{
					drawSpellEffectOverlay(graphics, spellEffectInfo);
				}
			}
		}
		return null;
	}

	private void drawSpellEffectOverlay(Graphics2D graphics, SpellEffectInfo spellEffectInfo)
	{
		Actor actor = spellEffectInfo.getActor();
		String text = Math.abs(spellEffectInfo.getRemainingTime() / 10) + "." + (Math.abs(spellEffectInfo.getRemainingTime()) % 10);
		Point actorTextPoint = actor.getCanvasTextLocation(graphics, text, 0);

		if (actorTextPoint == null)
		{
			return;
		}

		List<SpellEffectInfo> actorSpellEffects = plugin.getSpellEffects().stream()
				.filter(x -> x.getActor().equals(actor))
				.collect(Collectors.toList());
		final int yOffset = actorSpellEffects.indexOf(spellEffectInfo) * 14;

		if (config.showSpellImage())
		{
			BufferedImage image = getSpellEffectIcon(spellEffectInfo.getSpellEffect());
			if (image != null)
			{
				int offset = 4;
				if (spellEffectInfo.getSpellEffect().getSpellLength() == -1)
				{
					graphics.drawImage(image, actorTextPoint.getX(), actorTextPoint.getY() + yOffset - 14, null);
				}
				else
				{
					graphics.drawImage(image, actorTextPoint.getX(), actorTextPoint.getY() + yOffset - 14, null);
					Point textLocation = new Point(actorTextPoint.getX() + image.getWidth() + offset, actorTextPoint.getY());
					OverlayUtil.renderTextLocation(graphics, text, config.getTimersFontSize(),
							config.getTimersFontStyle().getFont(), config.getTimersFontColor(), textLocation, false, yOffset);
				}
			}
			else
			{
				log.warn("Could not load spell effect icon for {}", spellEffectInfo.getSpellEffect().getName());
				OverlayUtil.renderTextLocation(graphics, text, config.getTimersFontSize(),
						config.getTimersFontStyle().getFont(), config.getTimersFontColor(), actorTextPoint, false, yOffset);
			}
		}
		else
		{
			OverlayUtil.renderTextLocation(graphics, text, config.getTimersFontSize(),
					config.getTimersFontStyle().getFont(), config.getTimersFontColor(), actorTextPoint, false, yOffset);
		}
	}
}
