/*
 * Copyright (c) 2019, Siraz
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
package net.runelite.client.plugins.theatreofblood;

import com.google.inject.Provides;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.theatreofblood.encounters.*;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.Arrays;

@Slf4j
@PluginDescriptor(
		name = "Theatre of Blood",
		description = "Helps with the various boss mechanics in the Theatre of Blood",
		tags = {"tob", "raids", "theatre", "blood", "theatre of blood", "pvm", "overlay", "boss"},
		type = PluginType.SANLITE
)
public class TheatreOfBloodPlugin extends Plugin
{
	private static final int[] NYLOCAS_REGIONS = {
			13122
	};

	@Inject
	private Client client;

	@Inject
	private TheatreOfBloodConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private TheatreOfBloodOverlay overlay;

	@Inject
	private TheatreOfBloodDebugOverlay debugOverlay;

	@Inject
	private ClientThread clientThread;

	@Getter
	private TheatreOfBloodEncounter currentEncounter;

	@Provides
	TheatreOfBloodConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(TheatreOfBloodConfig.class);
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

	private boolean isNpcTheatreOfBloodEncounter(int npcId)
	{
		return npcId == NpcID.THE_MAIDEN_OF_SUGADINTI ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8361 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8362 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8363 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8364 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8365 ||
				npcId == NpcID.PESTILENT_BLOAT ||
				npcId == NpcID.NYLOCAS_VASILIAS ||
				npcId == NpcID.NYLOCAS_VASILIAS_8355 ||
				npcId == NpcID.NYLOCAS_VASILIAS_8356 ||
				npcId == NpcID.NYLOCAS_VASILIAS_8357 ||
				npcId == NpcID.SOTETSEG ||
				npcId == NpcID.SOTETSEG_8388 ||
				npcId == NpcID.XARPUS ||
				npcId == NpcID.XARPUS_8339 ||
				npcId == NpcID.XARPUS_8340 ||
				npcId == NpcID.XARPUS_8341 ||
				npcId == NpcID.VERZIK_VITUR ||
				npcId == NpcID.VERZIK_VITUR_8369 ||
				npcId == NpcID.VERZIK_VITUR_8370 ||
				npcId == NpcID.VERZIK_VITUR_8371 ||
				npcId == NpcID.VERZIK_VITUR_8372 ||
				npcId == NpcID.VERZIK_VITUR_8373 ||
				npcId == NpcID.VERZIK_VITUR_8374 ||
				npcId == NpcID.VERZIK_VITUR_8375;
	}

	private boolean isInstanceTheatreOfBloodRegion(int[] regions)
	{
		for (int[] regions1 : TheatreOfBloodEncounterRegions.getTOB_REGIONS())
		{
			if (Arrays.equals(regions1, regions) && client.isInInstancedRegion())
			{
				return true;
			}
		}
		return false;
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

	/**
	 * Validates if the player is in a Theatre of Blood map region and the current encounter is not null
	 *
	 * @return player in Theatre of Blood room and has a current encounter
	 */
	private boolean validateRegionAndCurrentEncounter()
	{
		return isInstanceTheatreOfBloodRegion(client.getMapRegions()) && currentEncounter != null &&
				currentEncounter.getEncounter() != null;
	}

	@Subscribe
	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		if (!validateRegionAndCurrentEncounter())
		{
			return;
		}

		final GameObject object = event.getGameObject();
		switch (currentEncounter.getEncounter())
		{
			case SUGADINTI_MAIDEN:
				currentEncounter.castToMaiden().addBloodSpawnBloodObject(object);
				break;
			case SOTETSEG:
				currentEncounter.castToSotetseg().checkMazeTiles(object, false);
				break;
		}
	}

	@Subscribe
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		if (!validateRegionAndCurrentEncounter())
		{
			return;
		}

		final GameObject object = event.getGameObject();
		switch (currentEncounter.getEncounter())
		{
			case SUGADINTI_MAIDEN:
				currentEncounter.castToMaiden().removeBloodSpawnBloodObject(object);
				break;
			case SOTETSEG:
				currentEncounter.castToSotetseg().checkMazeTiles(object, true);
				break;
		}
	}

	@Subscribe
	public void onGroundObjectSpawned(GroundObjectSpawned event)
	{
		if (!validateRegionAndCurrentEncounter())
		{
			return;
		}

		final GroundObject object = event.getGroundObject();
		if (currentEncounter.getEncounter() == TheatreOfBloodEncounters.XARPUS)
		{
			currentEncounter.castToXarpus().addGroundObject(object);
		}
	}

	@Subscribe
	public void onGroundObjectDespawned(GroundObjectDespawned event)
	{
		if (!validateRegionAndCurrentEncounter())
		{
			return;
		}

		final GroundObject object = event.getGroundObject();
		if (currentEncounter.getEncounter() == TheatreOfBloodEncounters.XARPUS)
		{
			currentEncounter.castToXarpus().removeGroundObject(object);
		}
	}

	/**
	 * Checks the current world region and NPC id and sets the encounter based on it.
	 *
	 * @param npcId npc identifier
	 */
	private void updateCurrentEncounter(int npcId)
	{
		if (currentEncounter != null)
		{
			return;
		}

		int[] worldRegion = client.getMapRegions();
		if (worldRegion == null)
		{
			return;
		}

		if (isInstanceTheatreOfBloodRegion(worldRegion))
		{
			// Nylocas room boss npc only spawns at the end so we check the region instead
			if (Arrays.equals(worldRegion, NYLOCAS_REGIONS))
			{
				currentEncounter = new Nylocas(TheatreOfBloodEncounters.NYLOCAS);
				log.debug("Current encounter set to nylocas: {}", currentEncounter);
			}

			switch (npcId)
			{
				case NpcID.THE_MAIDEN_OF_SUGADINTI:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8361:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8362:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8363:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8364:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8365:
					currentEncounter = new SugadintiMaiden(TheatreOfBloodEncounters.SUGADINTI_MAIDEN);
					log.debug("Current encounter set to maiden: {}", currentEncounter);
					break;
				case NpcID.PESTILENT_BLOAT:
					currentEncounter = new PestilentBloat(TheatreOfBloodEncounters.PESTILENT_BLOAT);
					log.debug("Current encounter set to bloat: {}", currentEncounter);
					break;
				case NpcID.SOTETSEG:
				case NpcID.SOTETSEG_8388:
					currentEncounter = new Sotetseg(TheatreOfBloodEncounters.SOTETSEG);
					log.debug("Current encounter set to sotetseg: {}", currentEncounter);
					break;
				case NpcID.XARPUS:
				case NpcID.XARPUS_8339:
				case NpcID.XARPUS_8340:
				case NpcID.XARPUS_8341:
					currentEncounter = new Xarpus(TheatreOfBloodEncounters.XARPUS);
					log.debug("Current encounter set to xarpus: {}", currentEncounter);
					break;
				case NpcID.VERZIK_VITUR:
				case NpcID.VERZIK_VITUR_8369:
				case NpcID.VERZIK_VITUR_8370:
				case NpcID.VERZIK_VITUR_8371:
				case NpcID.VERZIK_VITUR_8372:
				case NpcID.VERZIK_VITUR_8373:
				case NpcID.VERZIK_VITUR_8374:
				case NpcID.VERZIK_VITUR_8375:
					currentEncounter = new Verzik(TheatreOfBloodEncounters.VERZIK_VITUR);
					log.debug("Current encounter set to verzik: {}", currentEncounter);
					break;
			}
		}
	}

	/**
	 * Sets the current encounter and encounter npc if the spawned npc is a Theatre of Blood npc
	 *
	 * @param event npc spawned event
	 */
	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		NPC npc = event.getNpc();
		if (!isNpcTheatreOfBloodEncounter(npc.getId()) && !Nylocas.isNylocasNpc(npc.getId()))
		{
			return;
		}

		if (currentEncounter == null)
		{
			updateCurrentEncounter(npc.getId());
		}

		if (currentEncounter != null && !Nylocas.isNylocasNpc(npc.getId()))
		{
			currentEncounter.setNpc(npc);
			log.debug("Current encounter npc set: {}", npc.getName());
		}
	}

	/**
	 * Resets the current encounter if the despawned npc is a Theatre of Blood npc
	 *
	 * @param event npc despawned event
	 */
	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		NPC npc = event.getNpc();
		if (isNpcTheatreOfBloodEncounter(npc.getId()))
		{
			log.debug("Encounter ended because of npc despawn | id: {}", event.getNpc().getId());
			resetCurrentEncounter();
		}
	}

	/**
	 * Resets the current encounter on login, connection lost and hopping
	 *
	 * @param event gamestate event
	 */
	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		GameState gameState = event.getGameState();
		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			resetCurrentEncounter();
		}
	}

	@Subscribe
	protected void onClientTick(ClientTick event)
	{
		if (client.isInInstancedRegion() && currentEncounter != null && currentEncounter.getEncounter() != null)
		{
			checkGraphicObjects();
			switch (currentEncounter.getEncounter())
			{
				case PESTILENT_BLOAT:
					currentEncounter.castToBloat().checkBloatStatus(client.getGameCycle());
					break;
				case NYLOCAS:
					currentEncounter.castToNylocas().checkNylocasAggressiveNpcs(client.getNpcs(), client.getPlayers());
					break;
			}
		}
	}
}
