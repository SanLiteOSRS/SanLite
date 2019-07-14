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
import java.util.List;
import java.util.function.BiConsumer;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.client.util.Text;

@Slf4j
@Singleton
public class PlayerIndicatorsService
{
	private final Client client;
	private final PlayerIndicatorsConfig config;
	private List<Player> pileList;

	@Inject
	private PlayerIndicatorsService(Client client, PlayerIndicatorsConfig config)
	{
		this.config = config;
		this.client = client;
	}

	public void forEachPlayer(final BiConsumer<Player, Color> consumer)
	{
		if (!config.highlightClanMembers() && !config.highlightFriends() && !config.highlightCallers() && !config.highlightCallersPile())
		{
			return;
		}

		final List<String> callerRSNs = Text.fromCSV(config.getCallerRsns());

		for (Player player : client.getPlayers())
		{
			if (player == null || player.getName() == null || player == client.getLocalPlayer())
			{
				continue;
			}

			if (player == client.getLocalPlayer())
			{
				if (config.highlightSelf())
				{
					consumer.accept(player, config.getOwnColor());
				}
			}
			
			if (player.isClanMember())
			{
				if (config.highlightClanMembers())
				{
					consumer.accept(player, config.getClanMemberColor());

				}
			}

			if (client.isFriended(player.getName(), false))
			{
				if (config.highlightFriends() && config.highlightOfflineFriends())
				{
					consumer.accept(player, config.getFriendColor());
				}
				else if (config.highlightFriends() && !config.highlightOfflineFriends())
				{
					if (client.isFriended(player.getName(), true))
					{
						consumer.accept(player, config.getFriendColor());
					}
				}
			}

			if (config.highlightCallers() || config.highlightCallersPile())
			{
				for (String rsn : callerRSNs)
				{
					if (player.getName().equals(rsn))
					{
						if (config.highlightCallers())
						{
							consumer.accept(player, config.getCallerColor());
						}
						if (config.highlightCallersPile())
						{
							if (player.getInteracting() != null || player.getInteracting() != client.getLocalPlayer())
							{
								addPile((Player)player.getInteracting());
								consumer.accept((Player)player.getInteracting(), config.getCallerPileColor());
							}
						}
					}
				}
			}
		}
	}
	public void clearPileList()
	{
		pileList.clear();
	}

	public void addPile(Player pile)
	{
		pileList.add(pile);
	}

	public void removePile(Player pile)
	{
		pileList.remove(pile);
	}
}

