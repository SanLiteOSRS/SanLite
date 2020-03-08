/*
 * Copyright (c) 2020, Siraz <https://github.com/Sirazzz>
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
package net.runelite.client.plugins.chambersofxeric;

import com.google.inject.Provides;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Varbits;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.theatreofblood.encounters.TheatreOfBloodEncounter;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.Arrays;

@Slf4j
@PluginDescriptor(
		name = "Chambers",
		description = "Helps with the various boss encounters in the Chambers of Xeric",
		tags = {"cox", "raids", "chambers of xeric", "pvm", "overlay", "boss"},
		type = PluginType.SANLITE_USE_AT_OWN_RISK
)
public class ChambersOfXericPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ChambersOfXericConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private ChambersOfXericOverlay overlay;

	@Inject
	private ChambersOfXericDebugOverlay debugOverlay;

	@Inject
	private ClientThread clientThread;

	@Getter
	private TheatreOfBloodEncounter currentEncounter;

	@Getter
	private boolean isInChambersOfXeric;

	@Provides
	ChambersOfXericConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ChambersOfXericConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}
		clientThread.invoke(this::resetCurrentEncounter);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
		resetCurrentEncounter();
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}
		else if (!config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
	}

	private void resetCurrentEncounter()
	{
		currentEncounter = null;
		log.debug("Current encounter reset");
	}

	/**
	 * Checks for graphic objects depending on the current encounter
	 */
	private void checkGraphicObjects()
	{
		switch (currentEncounter.getEncounter())
		{
			case SUGADINTI_MAIDEN:
				currentEncounter.castToMaiden().checkBloodSplatGraphicObjects(client.getGraphicsObjects());
				break;
			case PESTILENT_BLOAT:
				currentEncounter.castToBloat().checkHandAttackGraphicObjects(client.getGraphicsObjects());
				break;
			case VERZIK_VITUR:
				currentEncounter.castToVerzik().checkGreenOrbPoolGraphicObjects(client.getGraphicsObjects());
				break;
		}
	}

	@Subscribe
	public void onVarbitChanged(VarbitChanged event)
	{
		isInChambersOfXeric = checkInChambersOfXeric();
	}

	private boolean checkInChambersOfXeric()
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return false;
		}

		return client.getVar(Varbits.IN_RAID) == 1;
	}

	/**
	 * Resets the current encounter on login, connection lost and hopping
	 *
	 * @param event gamestate event
	 */
	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
//		GameState gameState = event.getGameState();
//		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
//		{
//			resetCurrentEncounter();
//		}
//
//		if (gameState == GameState.LOADING)
//		{
//			int[] mapRegion = client.getMapRegions();
//			if (mapRegion == null)
//			{
//				return;
//			}
//
//			// Reset encounter when the players leaves the Theatre of Blood
//			if (Arrays.equals(mapRegion, THEATRE_OF_BLOOD_OUTSIDE_REGIONS))
//			{
//				resetCurrentEncounter();
//			}
//		}
	}
}
