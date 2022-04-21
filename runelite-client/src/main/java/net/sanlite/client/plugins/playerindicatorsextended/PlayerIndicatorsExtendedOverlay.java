/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2019, Jordan Atwood <nightfirecat@protonmail.com>
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
import net.runelite.api.FriendsChatRank;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.client.game.ChatIconManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.util.Text;
import net.sanlite.client.config.PlayerNameLocation;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.awt.image.BufferedImage;

@Slf4j
@Singleton
public class PlayerIndicatorsExtendedOverlay extends Overlay
{
	private static final int ACTOR_OVERHEAD_TEXT_MARGIN = 40;
	private static final int ACTOR_HORIZONTAL_TEXT_MARGIN = 10;

	private final PlayerIndicatorsExtendedService playerIndicatorsService;
	private final PlayerIndicatorsExtendedConfig config;
	private final ChatIconManager chatIconManager;

	@Inject
	private PlayerIndicatorsExtendedOverlay(PlayerIndicatorsExtendedConfig config, PlayerIndicatorsExtendedService playerIndicatorsService,
											ChatIconManager chatIconManager)
	{
		this.config = config;
		this.playerIndicatorsService = playerIndicatorsService;
		this.chatIconManager = chatIconManager;
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.MED);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		playerIndicatorsService.forEachPlayer((player, type) -> checkPlayerTypes(graphics, player, type));
		return null;
	}

	private void checkPlayerTypes(Graphics2D graphics, Player player, PlayerIndicatorType type)
	{
		switch (type)
		{
			case LOCAL:
				renderPlayerName(graphics, player, type, config.getOwnPlayerNamePosition(), config.getOwnPlayerColor());
				break;
			case FRIEND:
				renderPlayerName(graphics, player, type, config.getFriendPlayerNamePosition(), config.getFriendColor());
				break;
			case CUSTOM_LIST_1:
				renderPlayerName(graphics, player, type, config.getListOneNamePosition(), config.getListOneColor());
				break;
			case CUSTOM_LIST_2:
				renderPlayerName(graphics, player, type, config.getListTwoNamePosition(), config.getListTwoColor());
				break;
			case CUSTOM_LIST_3:
				renderPlayerName(graphics, player, type, config.getListThreeNamePosition(), config.getListThreeColor());
				break;
			case CUSTOM_LIST_4:
				renderPlayerName(graphics, player, type, config.getListFourNamePosition(), config.getListFourColor());
				break;
			case CUSTOM_LIST_5:
				renderPlayerName(graphics, player, type, config.getListFiveNamePosition(), config.getListFiveColor());
				break;
			case FRIENDS_CHAT:
				renderPlayerName(graphics, player, type, config.getFriendsChatMemberPlayerNamePosition(), config.getFriendsChatMemberColor());
				break;
			case TEAM_CAPE:
				renderPlayerName(graphics, player, type, config.getTeamPlayerNamePosition(), config.getTeamMemberColor());
				break;
			case OTHER:
				renderPlayerName(graphics, player, type, config.getOthersPlayerNamePosition(), config.getOthersColor());
				break;
			default:
				log.warn("Tried rendering name for player: {} with unknown PlayerIndicatorType: {}", player.getName(), type);
		}
	}

	private void renderPlayerName(Graphics2D graphics, Player player, PlayerIndicatorType type, PlayerNameLocation nameLocation, Color color)
	{
		if (nameLocation == PlayerNameLocation.DISABLED)
		{
			return;
		}

		final int zOffset;
		switch (nameLocation)
		{
			case MODEL_CENTER:
			case MODEL_RIGHT:
				zOffset = player.getLogicalHeight() / 2;
				break;
			default:
				zOffset = player.getLogicalHeight() + ACTOR_OVERHEAD_TEXT_MARGIN;
		}

		final String playerName = player.getName();
		if (playerName == null)
		{
			return;
		}

		final String name = Text.sanitize(playerName);
		Point textLocation = player.getCanvasTextLocation(graphics, name, zOffset);

		if (nameLocation == PlayerNameLocation.MODEL_RIGHT)
		{
			textLocation = player.getCanvasTextLocation(graphics, "", zOffset);

			if (textLocation == null)
			{
				return;
			}

			textLocation = new Point(textLocation.getX() + ACTOR_HORIZONTAL_TEXT_MARGIN, textLocation.getY());
		}

		if (textLocation == null)
		{
			return;
		}

		if (config.showFriendsChatRanks() && type == PlayerIndicatorType.FRIENDS_CHAT)
		{
			final FriendsChatRank rank = playerIndicatorsService.getFriendsChatRank(player);
			Point clanRankTextLocation = getNameTextLocationWithClanRank(graphics, rank, textLocation, nameLocation);
			if (clanRankTextLocation != null)
			{
				textLocation = clanRankTextLocation;
			}
		}

		OverlayUtil.renderTextLocation(graphics, textLocation, name, color);
	}

	private Point getNameTextLocationWithClanRank(Graphics2D graphics, FriendsChatRank rank, Point textLocation, PlayerNameLocation nameLocation)
	{
		if (rank != FriendsChatRank.UNRANKED)
		{
			final BufferedImage clanChatImage = chatIconManager.getRankImage(rank);

			if (clanChatImage != null)
			{
				final int clanImageWidth = clanChatImage.getWidth();
				final int clanImageTextMargin;
				final int clanImageNegativeMargin;

				if (nameLocation == PlayerNameLocation.MODEL_RIGHT)
				{
					clanImageTextMargin = clanImageWidth;
					clanImageNegativeMargin = 0;
				}
				else
				{
					clanImageTextMargin = clanImageWidth / 2;
					clanImageNegativeMargin = clanImageWidth / 2;
				}

				final int textHeight = graphics.getFontMetrics().getHeight() - graphics.getFontMetrics().getMaxDescent();
				final Point imageLocation = new Point(textLocation.getX() - clanImageNegativeMargin - 1, textLocation.getY() - textHeight / 2 - clanChatImage.getHeight() / 2);
				OverlayUtil.renderImageLocation(graphics, imageLocation, clanChatImage);

				// move text
				return new Point(textLocation.getX() + clanImageTextMargin, textLocation.getY());
			}
		}
		return null;
	}
}