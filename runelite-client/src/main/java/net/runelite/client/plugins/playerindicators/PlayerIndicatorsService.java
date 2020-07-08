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
package net.runelite.client.plugins.playerindicators;

import net.runelite.api.Client;
import net.runelite.api.Player;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.function.BiConsumer;

@Singleton
class PlayerIndicatorsService
{
	private final Client client;
	private final PlayerIndicatorsConfig config;

	@Inject
	private PlayerIndicatorsService(Client client, PlayerIndicatorsConfig config)
	{
		this.config = config;
		this.client = client;
	}

	void forEachPlayer(final BiConsumer<Player, PlayerIndicatorType> consumer)
	{
		if (!config.highlightOwnPlayer() && !config.highlightFriendsChatMembers() && !config.highlightFriends() &&
				!config.highlightOfflineFriends() && !config.highlightOthers() && !config.highlightTeamMembers())
		{
			return;
		}

		final Player localPlayer = client.getLocalPlayer();
		if (localPlayer == null)
		{
			return;
		}

		for (Player player : client.getPlayers())
		{
			if (player == null || player.getName() == null)
			{
				continue;
			}

			// Own player
			if (config.highlightOwnPlayer() && player == localPlayer)
			{
				consumer.accept(player, PlayerIndicatorType.OWN_PLAYER);
				continue;
			}
			else if (player == localPlayer)
			{
				continue;
			}

			final boolean isFriendsChatMember = player.isFriendsChatMember();

			// Friends
			if (config.highlightFriends() && player.isFriend())
			{
				if (config.disableFriendHighlightIfFriendsChatMember() && isFriendsChatMember)
				{
					consumer.accept(player, PlayerIndicatorType.FRIENDS_CHAT_MEMBERS);
					continue;
				}

				consumer.accept(player, PlayerIndicatorType.FRIEND);
				continue;
			}

			// Appear offline friends
			if (config.highlightOfflineFriends() && client.isFriended(player.getName(), false))
			{
				if (config.disableFriendHighlightIfFriendsChatMember() && isFriendsChatMember)
				{
					consumer.accept(player, PlayerIndicatorType.FRIENDS_CHAT_MEMBERS);
					continue;
				}

				consumer.accept(player, PlayerIndicatorType.FRIEND);
				continue;
			}

			// Clan members
			if (config.highlightFriendsChatMembers() && isFriendsChatMember)
			{
				consumer.accept(player, PlayerIndicatorType.FRIENDS_CHAT_MEMBERS);
				continue;
			}

			// Team-cape members
			if (config.highlightTeamMembers() && localPlayer.getTeam() > 0 && localPlayer.getTeam() == player.getTeam())
			{
				consumer.accept(player, PlayerIndicatorType.TEAM_CAPE_MEMBER);
				continue;
			}

			// Non-clan members
			if (config.highlightOthers() && !isFriendsChatMember)
			{
				consumer.accept(player, PlayerIndicatorType.NON_CLAN_MEMBER);
			}
		}
	}

	PlayerIndicatorType getMenuEntryPlayerIndicatorType(Player player)
	{
		if (!config.highlightOwnPlayer() && !config.highlightFriendsChatMembers()
				&& !config.highlightFriends() && !config.highlightOthers() && !config.highlightTeamMembers())
		{
			return null;
		}

		final Player localPlayer = client.getLocalPlayer();
		if (localPlayer == null || player == null || player.getName() == null || localPlayer == player)
		{
			return null;
		}

		final boolean isFriendsChatMember = player.isFriendsChatMember();

		// Friends
		if (config.highlightFriends() && config.colorFriendPlayerMenu() && player.isFriend())
		{
			if (config.disableFriendHighlightIfFriendsChatMember() && isFriendsChatMember)
			{
				return PlayerIndicatorType.FRIENDS_CHAT_MEMBERS;
			}

			return PlayerIndicatorType.FRIEND;
		}

		// Appear offline friends
		if (config.highlightOfflineFriends() && config.colorFriendPlayerMenu() && client.isFriended(player.getName(), false))
		{
			if (config.disableFriendHighlightIfFriendsChatMember() && isFriendsChatMember)
			{
				return PlayerIndicatorType.FRIENDS_CHAT_MEMBERS;
			}

			return PlayerIndicatorType.FRIEND;
		}

		// Clan members
		if (config.highlightFriendsChatMembers() && config.colorFriendsChatMemberPlayerMenu() && isFriendsChatMember)
		{
			return PlayerIndicatorType.FRIENDS_CHAT_MEMBERS;
		}

		// Team-cape members
		if (config.highlightTeamMembers() && config.colorTeamMemberPlayerMenu() && localPlayer.getTeam() > 0 &&
				localPlayer.getTeam() == player.getTeam())
		{
			return PlayerIndicatorType.TEAM_CAPE_MEMBER;
		}

		// Non-clan members
		if (config.highlightOthers() && config.colorOthersPlayerMenu() && !isFriendsChatMember)
		{
			return PlayerIndicatorType.NON_CLAN_MEMBER;
		}
		return PlayerIndicatorType.OTHER_PLAYER;
	}

	PlayerIndicatorType getPlayerIndicatorType(Player player)
	{
		final Player localPlayer = client.getLocalPlayer();
		if (localPlayer == null || player == null || player.getName() == null || localPlayer == player)
		{
			return null;
		}

		final boolean isFriendsChatMember = player.isFriendsChatMember();

		// Friends
		if (player.isFriend())
		{
			if (config.disableFriendHighlightIfFriendsChatMember() && isFriendsChatMember)
			{
				return PlayerIndicatorType.FRIENDS_CHAT_MEMBERS;
			}

			return PlayerIndicatorType.FRIEND;
		}

		// Appear offline friends
		if (client.isFriended(player.getName(), false))
		{
			if (config.disableFriendHighlightIfFriendsChatMember() && isFriendsChatMember)
			{
				return PlayerIndicatorType.FRIENDS_CHAT_MEMBERS;
			}

			return PlayerIndicatorType.FRIEND;
		}

		// Clan members
		if (isFriendsChatMember)
		{
			return PlayerIndicatorType.FRIENDS_CHAT_MEMBERS;
		}

		// Team-cape members
		if (localPlayer.getTeam() > 0 && localPlayer.getTeam() == player.getTeam())
		{
			return PlayerIndicatorType.TEAM_CAPE_MEMBER;
		}
		return PlayerIndicatorType.NON_CLAN_MEMBER;
	}
}