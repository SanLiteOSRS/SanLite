/*
 * Copyright (c) 2018, Kamiel <https://github.com/Kamielvf>
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

package net.runelite.client.plugins.playerindicators;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Player;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import java.awt.*;

@Slf4j
public class PlayerIndicatorsTileOverlay extends Overlay
{
	private final PlayerIndicatorsService playerIndicatorsService;
	private final PlayerIndicatorsConfig config;

	@Inject
	private PlayerIndicatorsTileOverlay(PlayerIndicatorsConfig config, PlayerIndicatorsService playerIndicatorsService)
	{
		this.config = config;
		this.playerIndicatorsService = playerIndicatorsService;
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.MED);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!config.drawOwnPlayerTiles() && !config.drawFriendTiles() && !config.drawFriendsChatMemberTiles() &&
				!config.drawTeamMemberTiles() && !config.drawOthersTiles())
		{
			return null;
		}

		playerIndicatorsService.forEachPlayer((player, type) ->
		{
			switch (type)
			{
				case OWN_PLAYER:
					renderTileOverlay(graphics, player, config.getOwnPlayerColor(), config.drawOwnPlayerTiles());
					break;
				case FRIEND:
					renderTileOverlay(graphics, player, config.getFriendColor(), config.drawFriendTiles());
					break;
				case FRIENDS_CHAT_MEMBERS:
					renderTileOverlay(graphics, player, config.getFriendsChatMemberColor(), config.drawFriendsChatMemberTiles());
					break;
				case TEAM_CAPE_MEMBER:
					renderTileOverlay(graphics, player, config.getTeamMemberColor(), config.drawTeamMemberTiles());
					break;
				case NON_CLAN_MEMBER:
					renderTileOverlay(graphics, player, config.getOthersColor(), config.drawOthersTiles());
					break;
				default:
					log.warn("Tried rendering tile overlay for player: {} with unknown type: {}", player.getName(), type);
			}
		});

		return null;
	}

	private void renderTileOverlay(Graphics2D graphics, Player player, Color color, boolean drawTileOverlay)
	{
		if (drawTileOverlay)
		{
			final Polygon poly = player.getCanvasTilePoly();
			if (poly != null)
			{
				OverlayUtil.renderPolygon(graphics, poly, color);
			}
		}
	}
}