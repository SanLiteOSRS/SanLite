/*
 * Copyright (c) 2018, Kamiel <https://github.com/Kamielvf>
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

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.inject.Inject;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public class PlayerIndicatorsTileOverlay extends Overlay
{
	private final PlayerIndicatorsService playerIndicatorsService;
	private final PlayerIndicatorsConfig config;
	private final Client client;

	@Inject
	private PlayerIndicatorsTileOverlay(PlayerIndicatorsConfig config, PlayerIndicatorsService playerIndicatorsService, Client client)
	{
		this.config = config;
		this.playerIndicatorsService = playerIndicatorsService;
		this.client = client;
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.MED);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!config.drawOwnTiles() && !config.drawFriendTiles() && !config.drawTeamTiles() && !config.drawClanTiles() && !config.drawNonClanTiles())
		{
			return null;
		}

		playerIndicatorsService.forEachPlayer((player, color) ->
		{
			boolean drawTile = false;

			if (config.drawOwnTiles() && player == client.getLocalPlayer() && config.highlightOwnPlayer())
			{
				drawTile = true;
			}
			else if (config.drawFriendTiles() && client.isFriended(player.getName(), false) && config.highlightFriends() && player != client.getLocalPlayer())
			{
				if (config.disableFriendHighlightIfClanMember() && !client.isClanMember(player.getName()))
				{
					drawTile = true;
				}
				else if (!config.disableFriendHighlightIfClanMember())
				{
					drawTile = true;
				}
			}
			else if (config.drawTeamTiles() && player.getTeam() > 0 && client.getLocalPlayer().getTeam() == player.getTeam())
			{
				drawTile = true;
			}
			else if (config.drawClanTiles() && client.isClanMember(player.getName()))
			{
				drawTile = true;
			}
			else if (config.drawNonClanTiles() && !client.isClanMember(player.getName()))
			{
				drawTile = true;
			}

			//Checked here as if statements follow into friends path but wont highlight clan members if config says not to, in this situation they could be highlighted as clan members
			if (config.disableFriendHighlightIfClanMember() && client.isClanMember(player.getName()) && config.drawClanTiles() && config.highlightClanMembers())
			{
				drawTile = true;
			}

			if (drawTile)
			{
				final Polygon poly = player.getCanvasTilePoly();

				if (poly != null)
				{
					OverlayUtil.renderPolygon(graphics, poly, color);
				}
			}
		});

		return null;
	}
}