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
import net.runelite.api.Player;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.Text;

import javax.inject.Inject;
import java.util.*;

import lombok.extern.slf4j.Slf4j;

@PluginDescriptor(
		name = "Clan Caller Indicators",
		description = "Highlight players that your clans caller is hitting",
		tags = {"highlight", "minimap", "overlay", "players", "clan", "caller", "pile", "rsb", "rsc"},
		enabledByDefault = false,
		type = PluginType.SANLITE_USE_AT_OWN_RISK
)

@Slf4j
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
		log.debug("Lists cleared");
		for (Player player : client.getPlayers())
		{
			log.debug("New player");
			if (!client.isClanMember(player.getName()))
			{
				if (!callersList.contains(player.getName()) || !pilesList.contains(player.getName()))
				{
					for (String caller : callersListString)
					{
						if (caller.equals(player.getName()) && !callersList.contains(player))
						{
							log.debug("Caller added to list");
							callersList.add(player);
						}
					}
					for (Player caller : callersList)
					{
						log.debug("Checking for caller:" + caller.getName());
						if (caller.getInteracting() != null)
						{
							log.debug("caller interact: " + caller.getInteracting().getName());
							if (caller.getInteracting().getName().equals(player.getName()))
							{
								pilesList.add(player);
								log.debug("Added to piles object list: " + player.getName());
							}
						}
					}
				}
			}
		}
	}
	private void getCallerRSNs()
	{
		callersListString = Text.fromCSV(config.getCallerRsns());
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged configChanged)
	{
		if (configChanged.getGroup().equals("clancallerindicators") && configChanged.getKey().equals("getCallerRsns"))
		{
			callersList.clear();
			getCallerRSNs();
		}
	}
}
