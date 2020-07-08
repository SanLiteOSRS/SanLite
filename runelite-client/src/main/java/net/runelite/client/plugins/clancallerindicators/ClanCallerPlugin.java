/*
 * Copyright (c) 2019, Jajack
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
package net.runelite.client.plugins.clancallerindicators;

import com.google.inject.Provides;
import com.google.inject.Singleton;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.MenuEntry;
import net.runelite.api.Player;
import net.runelite.client.events.ConfigChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.FriendChatManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ColorUtil;
import net.runelite.client.util.Text;

import javax.inject.Inject;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static net.runelite.api.MenuAction.*;

@PluginDescriptor(
		name = "Clan Caller Indicators",
		description = "Highlight players that your clans caller is hitting",
		tags = {"highlight", "minimap", "overlay", "players", "clan", "caller", "pile", "rsb", "rsc", "sanlite"},
		enabledByDefault = false
)

@Singleton
public class ClanCallerPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private ClanCallerConfig config;

	@Inject
	private ClanCallerOverlay clanCallerOverlay;

	@Inject
	private ClanCallerTileOverlay clanCallerTileOverlay;

	@Inject
	private ClanCallerMinimapOverlay clanCallerMinimapOverlay;

	@Inject
	private Client client;

	@Inject
	private FriendChatManager friendsChatManager;

	@Getter
	private List<Player> callersList = new ArrayList<>();

	@Getter
	private List<Player> pilesList = new ArrayList<>();

	private List<String> callersListString = new ArrayList<>();

	@Provides
	ClanCallerConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ClanCallerConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(clanCallerOverlay);
		overlayManager.add(clanCallerTileOverlay);
		overlayManager.add(clanCallerMinimapOverlay);
		getCallerRSNs();
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(clanCallerOverlay);
		overlayManager.remove(clanCallerTileOverlay);
		overlayManager.remove(clanCallerMinimapOverlay);
	}

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		pilesList.clear();
		for (Player player : client.getPlayers())
		{
			String name = player.getName();

			// Checks if player is currently a caller or pile
			if (!callersList.contains(player) && !pilesList.contains(player))
			{
				// If it is a clan member, it can only be a caller
				if (friendsChatManager.isMember(name))
				{
					for (String caller : callersListString)
					{
						if (caller.equals(name) && !callersList.contains(player))
						{
							callersList.add(player);
						}
					}
				}
				// If it is not a clan member, it can only be a pile
				else if (!friendsChatManager.isMember(name))
				{
					for (Player caller : callersList)
					{
						if (caller.getInteracting() != null)
						{
							String callerName = caller.getInteracting().getName();
							if (callerName == null)
							{
								continue;
							}

							if (callerName.equals(name))
							{
								pilesList.add(player);
							}
						}
					}
				}
			}
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged configChanged)
	{
		if (configChanged.getGroup().equals("clancallerindicators") && configChanged.getKey().equals("callersRsns"))
		{
			callersList.clear();
			getCallerRSNs();
		}
	}

	@Subscribe
	public void onPlayerDespawned(PlayerDespawned playerDespawned)
	{
		if (callersList == null || callersList.isEmpty())
		{
			return;
		}

		callersList.removeIf(x -> x.equals(playerDespawned.getPlayer()));
	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded menuEntryAdded)
	{
		if (config.colorPlayerMenu())
		{
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

				Color color = null;

				if (callersList.contains(player) && config.highlightCallers())
				{
					color = config.getCallerColor();
				}
				else if (pilesList.contains(player) && config.highlightCallersPile())
				{
					color = config.getCallerPileColor();
				}

				if (color != null)
				{
					MenuEntry[] menuEntries = client.getMenuEntries();
					MenuEntry lastEntry = menuEntries[menuEntries.length - 1];
					String target = lastEntry.getTarget();
					int idx = target.indexOf('>');

					if (idx != -1)
					{
						target = target.substring(idx + 1);
					}

					lastEntry.setTarget(ColorUtil.prependColorTag(target, color));
					client.setMenuEntries(menuEntries);
				}
			}
		}
	}

	private void getCallerRSNs()
	{
		callersListString = Text.fromCSV(config.getCallerRsns());
	}
}
