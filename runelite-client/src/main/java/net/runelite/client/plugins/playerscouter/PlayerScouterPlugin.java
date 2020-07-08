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
package net.runelite.client.plugins.playerscouter;

import com.google.inject.Provides;
import lombok.Getter;
import net.runelite.api.*;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.Notifier;
import javax.inject.Inject;
import java.util.ArrayList;

@PluginDescriptor(
		name = "Player Scouter",
		description = "Assists in scouting a certain player",
		tags = {"scout, scouter, player, finder, overlay, notifications", "sanlite"},
		enabledByDefault = false
)
public class PlayerScouterPlugin extends Plugin
{
	@Inject
	private Notifier notifier;

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private PlayerScouterOverlay scouterOverlay;

	@Inject
	private PlayerScouterConfig playerScouterConfig;

	@Getter
	private String lastSeen = "never";

	@Getter
	private int seenCounter = 0;

	@Getter
	private boolean spotted = false;

	@Provides
	PlayerScouterConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PlayerScouterConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(scouterOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(scouterOverlay);
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		ArrayList<String> playerList = new ArrayList<>();

		for (Player p : client.getPlayers())
		{
			playerList.add(p.getName());
		}

		if (playerList.contains(playerScouterConfig.getPlayerRSN()))
		{
			if (!spotted)
			{
				lastSeen = java.time.LocalTime.now().toString();
				seenCounter++;
				spotted = true;

				if (playerScouterConfig.getNotificationsEnabled())
				{
					notifier.notify(playerScouterConfig.getPlayerRSN() + " spotted!");
				}
			}
		}
		else
		{
			spotted = false;
		}

	}
	public void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("playerscouter") && event.getKey().equals("playerRSN"))
		{
			lastSeen = "never";
			seenCounter = 0;
			spotted = false;
		}
	}
}