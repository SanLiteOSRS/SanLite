/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2019, Jajack
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
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
package net.sanlite.client.plugins.playerindicatorsextended;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Player;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Slf4j
@Singleton
public class PlayerIndicatorsExtendedMinimapOverlay extends Overlay
{
	private final PlayerIndicatorsExtendedService playerIndicatorsService;
	private final PlayerIndicatorsExtendedConfig config;

	@Inject
	private PlayerIndicatorsExtendedMinimapOverlay(PlayerIndicatorsExtendedConfig config, PlayerIndicatorsExtendedService playerIndicatorsService)
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
		if (!config.drawOwnPlayerMinimapName() && !config.drawFriendMinimapNames() && !config.drawFriendsChatMemberMinimapNames() &&
				!config.drawTeamMinimapNames() && !config.drawOthersMinimapNames() && !config.drawListOneMinimapName() &&
				!config.drawListTwoMinimapName() && !config.drawListThreeMinimapName() && !config.drawListFourMinimapName() &&
				!config.drawListFiveMinimapName())
		{
			return null;
		}

		playerIndicatorsService.forEachPlayer((player, type) -> renderPlayerOverlay(graphics, player, type));
		return null;
	}

	private void renderPlayerOverlay(Graphics2D graphics, Player player, PlayerIndicatorType type)
	{
		switch (type)
		{
			case LOCAL:
				renderMinimapOverlay(graphics, player, config.getOwnPlayerColor(), config.drawOwnPlayerMinimapName());
				break;
			case FRIEND:
				renderMinimapOverlay(graphics, player, config.getFriendColor(), config.drawFriendMinimapNames());
				break;
			case CUSTOM_LIST_1:
				renderMinimapOverlay(graphics, player, config.getListOneColor(), config.drawListOneMinimapName());
				break;
			case CUSTOM_LIST_2:
				renderMinimapOverlay(graphics, player, config.getListTwoColor(), config.drawListTwoMinimapName());
				break;
			case CUSTOM_LIST_3:
				renderMinimapOverlay(graphics, player, config.getListThreeColor(), config.drawListThreeMinimapName());
				break;
			case CUSTOM_LIST_4:
				renderMinimapOverlay(graphics, player, config.getListFourColor(), config.drawListFourMinimapName());
				break;
			case CUSTOM_LIST_5:
				renderMinimapOverlay(graphics, player, config.getListFiveColor(), config.drawListFiveMinimapName());
				break;
			case FRIENDS_CHAT:
				renderMinimapOverlay(graphics, player, config.getFriendsChatMemberColor(), config.drawFriendsChatMemberMinimapNames());
				break;
			case TEAM_CAPE:
				renderMinimapOverlay(graphics, player, config.getTeamMemberColor(), config.drawTeamMinimapNames());
				break;
			case OTHER:
				renderMinimapOverlay(graphics, player, config.getOthersColor(), config.drawOthersMinimapNames());
				break;
			default:
				log.warn("Tried rendering minimap name for player: {} with unknown PlayerIndicatorType: {}", player.getName(), type);
		}
	}

	private void renderMinimapOverlay(Graphics2D graphics, Player actor, Color color, boolean drawMinimapName)
	{
		final String name = actor.getName();
		if (name == null)
		{
			return;
		}

		final String cleanedName = name.replace('\u00A0', ' ');
		if (drawMinimapName)
		{
			final net.runelite.api.Point minimapLocation = actor.getMinimapLocation();

			if (minimapLocation != null)
			{
				OverlayUtil.renderTextLocation(graphics, minimapLocation, cleanedName, color);
			}
		}
	}
}