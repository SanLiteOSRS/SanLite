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

import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

@Singleton
public class PlayerIndicatorsMinimapOverlay extends Overlay
{
	private final PlayerIndicatorsService playerIndicatorsService;
	private final PlayerIndicatorsConfig config;
	private final Client client;

	@Inject
	private PlayerIndicatorsMinimapOverlay(PlayerIndicatorsConfig config, PlayerIndicatorsService playerIndicatorsService, Client client)
	{
		this.config = config;
		this.playerIndicatorsService = playerIndicatorsService;
		this.client = client;
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.HIGH);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		playerIndicatorsService.forEachPlayer((player, color) -> renderPlayerOverlay(graphics, player, color));
		return null;
	}

	private void renderPlayerOverlay(Graphics2D graphics, Player actor, Color color)
	{
		final String name = actor.getName().replace('\u00A0', ' ');

		if (!config.drawOwnPlayerMinimapNames()
			|| !config.drawFriendMinimapNames()
			|| !config.drawTeamMinimapNames()
			|| !config.drawClanMinimapNames()
			|| !config.drawNonClanMinimapNames())
		{
			boolean drawMinimapName = false;

			if (config.drawOwnPlayerMinimapNames() && actor == client.getLocalPlayer() && config.highlightOwnPlayer())
			{
				drawMinimapName = true;
			}
			else if (config.drawFriendMinimapNames() && client.isFriended(actor.getName(), false) && config.highlightFriends()  && actor != client.getLocalPlayer())
			{
				if (config.disableFriendHighlightIfClanMember() && !client.isClanMember(actor.getName()))
				{
					drawMinimapName = true;
				}
				else if (!config.disableFriendHighlightIfClanMember())
				{
					drawMinimapName = true;
				}
			}
			else if (config.drawTeamMinimapNames() && actor.getTeam() > 0 && client.getLocalPlayer().getTeam() == actor.getTeam())
			{
				drawMinimapName = true;
			}
			else if (config.drawClanMinimapNames() && client.isClanMember(actor.getName()) && actor != client.getLocalPlayer())
			{
				drawMinimapName = true;
			}
			else if (config.drawNonClanMinimapNames() && !client.isClanMember(actor.getName()) && actor != client.getLocalPlayer())
			{
				drawMinimapName = true;
			}

			//Checked here as if statements follow into friends path but wont highlight clan members if config says not to, in this situation they could be highlighted as clan members
			if (config.disableFriendHighlightIfClanMember() && client.isClanMember(actor.getName()) && config.drawClanMinimapNames() && config.highlightClanMembers() && actor != client.getLocalPlayer())
			{
				drawMinimapName = true;
			}

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
}