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

import com.google.inject.Provides;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.ClanMemberRank;
import static net.runelite.api.ClanMemberRank.UNRANKED;
import net.runelite.api.Client;
import static net.runelite.api.MenuAction.*;
import net.runelite.api.MenuEntry;
import net.runelite.api.Player;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ClanManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ColorUtil;
import net.runelite.client.util.Text;

@PluginDescriptor(
	name = "Player Indicators",
	description = "Highlight players on-screen and/or on the minimap",
	tags = {"highlight", "minimap", "overlay", "players"},
	type = PluginType.SANLITE
)
public class PlayerIndicatorsPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private PlayerIndicatorsConfig config;

	@Inject
	private PlayerIndicatorsOverlay playerIndicatorsOverlay;

	@Inject
	private PlayerIndicatorsTileOverlay playerIndicatorsTileOverlay;

	@Inject
	private PlayerIndicatorsMinimapOverlay playerIndicatorsMinimapOverlay;

	@Inject
	private Client client;

	@Inject
	private ClanManager clanManager;

	@Provides
	PlayerIndicatorsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PlayerIndicatorsConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(playerIndicatorsOverlay);
		overlayManager.add(playerIndicatorsTileOverlay);
		overlayManager.add(playerIndicatorsMinimapOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(playerIndicatorsOverlay);
		overlayManager.remove(playerIndicatorsTileOverlay);
		overlayManager.remove(playerIndicatorsMinimapOverlay);
	}


	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded menuEntryAdded)
	{
		List<Player> callerList = new ArrayList<Player>();
		int type = menuEntryAdded.getType();

		if (type >= 2000)
		{
			type -= 2000;
		}

		int identifier = menuEntryAdded.getIdentifier();
		if (type == FOLLOW.getId() || type == TRADE.getId()
			|| type == SPELL_CAST_ON_PLAYER.getId() || type == ITEM_USE_ON_PLAYER.getId()
			|| type == PLAYER_FIRST_OPTION.getId()
			|| type == PLAYER_SECOND_OPTION.getId()
			|| type == PLAYER_THIRD_OPTION.getId()
			|| type == PLAYER_FOURTH_OPTION.getId()
			|| type == PLAYER_FIFTH_OPTION.getId()
			|| type == PLAYER_SIXTH_OPTION.getId()
			|| type == PLAYER_SEVENTH_OPTION.getId()
			|| type == PLAYER_EIGTH_OPTION.getId()
			|| type == RUNELITE.getId())
		{
			Player[] players = client.getCachedPlayers();
			Player player = null;

			if (identifier >= 0 && identifier < players.length)
			{
				player = players[identifier];
			}

			if (player == null)
			{
				return;
			}

			int image = -1;
			Color color = null;
			final List<String> callerRSNs = Text.fromCSV(config.getCallerRsns());


			if (config.highlightCallers() || config.highlightCallersPile())
			{
				for (String rsn : callerRSNs)
				{
					if (player.getName().equals(rsn))
					{
						if (config.highlightCallersPile())
						{
							callerList.add(player);
						}
						if (config.highlightCallers())
						{
							color = config.getCallerColor();
						}
					}
				}
			}
			if (config.highlightCallersPile())
			{
				for (Player caller : callerList)
				{
					if (caller.getInteracting().getName().equals(player.getName()))
					{
						color = config.getCallerPileColor();
					}
				}
			}
			if (config.highlightSelf() && player == client.getLocalPlayer())
			{
				color = config.getOwnColor();
			}
			else if (config.highlightFriends() && player.isFriend())
			{
				color = config.getFriendColor();
			}
			else if (config.highlightClanMembers() && player.isClanMember())
			{
				color = config.getClanMemberColor();

				ClanMemberRank rank = clanManager.getRank(player.getName());
				if (rank != UNRANKED)
				{
					image = clanManager.getIconNumber(rank);
				}
			}
			else if (config.highlightNonClanMembers() && !player.isClanMember())
			{
				color = config.getNonClanMemberColor();
			}

			if (image != -1 || color != null)
			{
				MenuEntry[] menuEntries = client.getMenuEntries();
				MenuEntry lastEntry = menuEntries[menuEntries.length - 1];

				if (color != null && config.colorPlayerMenu())
				{
					// strip out existing <col...
					String target = lastEntry.getTarget();
					int idx = target.indexOf('>');
					if (idx != -1)
					{
						target = target.substring(idx + 1);
					}

					lastEntry.setTarget(ColorUtil.prependColorTag(target, color));
				}
				if (image != -1 && config.showClanRanks())
				{
					lastEntry.setTarget("<img=" + image + ">" + lastEntry.getTarget());
				}
				client.setMenuEntries(menuEntries);
			}
		}
	}
}
