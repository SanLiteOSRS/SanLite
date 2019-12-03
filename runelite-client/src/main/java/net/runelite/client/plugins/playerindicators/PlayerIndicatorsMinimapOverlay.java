/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
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
package net.runelite.client.plugins.playerindicators;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Player;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

@Slf4j
@Singleton
public class PlayerIndicatorsMinimapOverlay extends Overlay
{
	private final PlayerIndicatorsService playerIndicatorsService;
	private final PlayerIndicatorsConfig config;

	@Inject
	private PlayerIndicatorsMinimapOverlay(PlayerIndicatorsConfig config, PlayerIndicatorsService playerIndicatorsService)
	{
		this.config = config;
		this.playerIndicatorsService = playerIndicatorsService;
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.HIGH);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		playerIndicatorsService.forEachPlayer((player, type) -> renderPlayerOverlay(graphics, player, type));
		return null;
	}

	private void renderPlayerOverlay(Graphics2D graphics, Player player, PlayerIndicatorType type)
	{
		switch (type)
		{
			case OWN_PLAYER:
				renderMinimapOverlay(graphics, player, config.getOwnPlayerColor(), config.drawOwnPlayerMinimapNames());
				break;
			case FRIEND:
				renderMinimapOverlay(graphics, player, config.getFriendColor(), config.drawFriendMinimapNames());
				break;
			case CLAN_MEMBER:
				renderMinimapOverlay(graphics, player, config.getClanMemberColor(), config.drawClanMinimapNames());
				break;
			case TEAM_CAPE_MEMBER:
				renderMinimapOverlay(graphics, player, config.getTeamMemberColor(), config.drawTeamMinimapNames());
				break;
			case NON_CLAN_MEMBER:
				renderMinimapOverlay(graphics, player, config.getNonClanMemberColor(), config.drawNonClanMinimapNames());
				break;
			default:
				log.warn("Tried rendering minimap name for player: {} with unknown PlayerIndicatorType: {}", player.getName(), type);
		}
	}

	private void renderMinimapOverlay(Graphics2D graphics, Player actor, Color color, boolean drawMinimapName)
	{
		final String name = actor.getName().replace('\u00A0', ' ');

		if (drawMinimapName)
		{
			final net.runelite.api.Point minimapLocation = actor.getMinimapLocation();

			if (minimapLocation != null)
			{
				OverlayUtil.renderTextLocation(graphics, minimapLocation, name, color);
			}
		}
	}
}