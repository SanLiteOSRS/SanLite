/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
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
package net.runelite.client.plugins.theatreofblood;

import com.google.inject.Provides;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.theatreofblood.encounters.*;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.Text;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.regex.Pattern;

import static net.runelite.api.Varbits.TOB_ENCOUNTER_STATE;

@Slf4j
@PluginDescriptor(
		name = "Theatre of Blood",
		description = "Helps with the various boss mechanics in the Theatre of Blood",
		tags = {"tob", "raids", "theatre", "blood", "theatre of blood", "pvm", "overlay", "boss", "sanlite"},
		enabledByDefault = false
)
public class TheatreOfBloodPlugin extends Plugin
{
	private static final int[] NYLOCAS_REGIONS = {
			13122
	};

	private static final int[] THEATRE_OF_BLOOD_OUTSIDE_REGIONS = {
			14385, 14386, 14387, 14641, 14642, 14643, 14897, 14898, 14899
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

	/**
	 * Checks game object spawned for various encounter objects
	 *
	 * @param event game object spawned
	 */
	@Subscribe
	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		if (!validateRegionAndCurrentEncounter())
		{
			return;
		}
		final GameObject object = event.getGameObject();
		if (currentEncounter.getEncounter() == TheatreOfBloodEncounters.SUGADINTI_MAIDEN)
		{
			currentEncounter.castToMaiden().addBloodSpawnBloodObject(object);
		}
	}

	/**
	 * Checks game object despawned for various encounter objects
	 *
	 * @param event game object despawned
	 */
	@Subscribe
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		if (!validateRegionAndCurrentEncounter())
		{
			return;
		}

		final GameObject object = event.getGameObject();
		if (currentEncounter.getEncounter() == TheatreOfBloodEncounters.SUGADINTI_MAIDEN)
		{
			currentEncounter.castToMaiden().removeBloodSpawnBloodObject(object);
		}
	}

	/**
	 * Checks ground objects spawned for Xarpus healing/acid pools and Sotetseg maze tiles
	 *
	 * @param event ground object spawned event
	 */
	@Subscribe
	public void onGroundObjectSpawned(GroundObjectSpawned event)
	{
		if (!validateRegionAndCurrentEncounter())
		{
			return;
		}

		final GroundObject object = event.getGroundObject();
		switch (currentEncounter.getEncounter())
		{
			case SOTETSEG:
				currentEncounter.castToSotetseg().checkMazeTile(object);
				break;
			case XARPUS:
				currentEncounter.castToXarpus().addGroundObject(object);
				break;
		}
	}

	/**
	 * Checks ground objects despawned for Xarpus healing/acid pools and Sotetseg maze tiles
	 *
	 * @param event ground object despawned event
	 */
	@Subscribe
	public void onGroundObjectDespawned(GroundObjectDespawned event)
	{
		if (!validateRegionAndCurrentEncounter())
		{
			return;
		}

		final GroundObject object = event.getGroundObject();
		switch (currentEncounter.getEncounter())
		{
			case SOTETSEG:
				currentEncounter.castToSotetseg().checkMazeTile(object);
				break;
			case XARPUS:
				currentEncounter.castToXarpus().removeGroundObject(object);
				break;
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
				log.debug("Current encounter set to Nylocas: {}", currentEncounter);
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
					log.debug("Current encounter set to Maiden: {}", currentEncounter);
					break;
				case NpcID.PESTILENT_BLOAT:
					currentEncounter = new PestilentBloat(TheatreOfBloodEncounters.PESTILENT_BLOAT);
					log.debug("Current encounter set to Bloat: {}", currentEncounter);
					break;
				case NpcID.SOTETSEG:
				case NpcID.SOTETSEG_8388:
					currentEncounter = new Sotetseg(TheatreOfBloodEncounters.SOTETSEG);
					log.debug("Current encounter set to Sotetseg: {}", currentEncounter);
					break;
				case NpcID.XARPUS:
				case NpcID.XARPUS_8339:
				case NpcID.XARPUS_8340:
				case NpcID.XARPUS_8341:
					currentEncounter = new Xarpus(TheatreOfBloodEncounters.XARPUS);
					log.debug("Current encounter set to Xarpus: {}", currentEncounter);
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
					log.debug("Current encounter set to Verzik: {}", currentEncounter);
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
		if (!TheatreOfBloodEncounter.isNpcTheatreOfBloodEncounter(npc.getId()) && !Nylocas.isNylocasNpc(npc.getId()) && !Verzik.isNylocasNpc(npc.getId()))
		{
			return;
		}

		if (currentEncounter == null)
		{
			updateCurrentEncounter(npc.getId());
			if (currentEncounter == null)
			{
				return;
			}
		}

		if (!Nylocas.isNylocasNpc(npc.getId()) && !Verzik.isNylocasNpc(npc.getId()))
		{
			currentEncounter.setNpc(npc);
		}

		switch (currentEncounter.getEncounter())
		{
			case NYLOCAS:
				if (Nylocas.isNylocasNpc(npc.getId()))
				{
					currentEncounter.castToNylocas().addNylocasCrab(npc, client.getGameCycle());
				}
				break;
			case VERZIK_VITUR:
				if (Verzik.isNylocasNpc(npc.getId()))
				{
					currentEncounter.castToVerzik().addNylocasCrab(npc);
				}
				break;
		}
	}

	/**
	 * Resets the current encounter npc if the despawned npc is a Theatre of Blood npc
	 *
	 * @param event npc despawned event
	 */
	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		if (!validateRegionAndCurrentEncounter())
		{
			return;
		}

		NPC npc = event.getNpc();
		if (TheatreOfBloodEncounter.isNpcTheatreOfBloodEncounter(npc.getId()))
		{
			currentEncounter.setNpc(null);
			log.debug("Current encounter npc reset due to despawn of npc id: {}", npc.getId());
		}

		switch (currentEncounter.getEncounter())
		{
			case NYLOCAS:
				if (Nylocas.isNylocasNpc(npc.getId()))
				{
					currentEncounter.castToNylocas().removeNylocasCrab(npc);
				}
				break;
			case VERZIK_VITUR:
				if (Verzik.isNylocasNpc(npc.getId()))
				{
					currentEncounter.castToVerzik().removeNylocasCrab(npc);
				}
				break;
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		if (event.getType() != ChatMessageType.GAMEMESSAGE && event.getType() != ChatMessageType.SPAM)
		{
			return;
		}

		if (!validateRegionAndCurrentEncounter())
		{
			return;
		}

		if (Pattern.matches("Wave '.+' complete! Duration: .+", Text.removeTags(event.getMessage())))
		{
			resetCurrentEncounter();
			log.debug("Encounter ended due to wave completion");
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

		if (gameState == GameState.LOADING)
		{
			int[] mapRegion = client.getMapRegions();
			if (mapRegion == null)
			{
				return;
			}

			// Reset encounter when the players leaves the Theatre of Blood
			if (Arrays.equals(mapRegion, THEATRE_OF_BLOOD_OUTSIDE_REGIONS))
			{
				resetCurrentEncounter();
			}
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
					currentEncounter.castToNylocas().checkNylocasTimers(client.getGameCycle());
					break;
				case XARPUS:
					if (currentEncounter.castToXarpus().getIsStaring())
					{
						currentEncounter.castToXarpus().checkTurnTimer(client.getGameCycle());
					}
					break;
				case VERZIK_VITUR:
					if (currentEncounter.castToVerzik().getVerzikPhase() != 0)
					{
						currentEncounter.castToVerzik().checkAttackTimer(client.getGameCycle());
					}
					break;
			}
		}
	}

	@Subscribe
	protected void onVarbitChanged(VarbitChanged varbitChanged)
	{
		if (client.isInInstancedRegion() && currentEncounter != null && currentEncounter.getEncounter() != null)
		{
			if (currentEncounter.getEncounter() == TheatreOfBloodEncounters.SOTETSEG)
			{
				currentEncounter.castToSotetseg().checkMazeActivityChanged(client.getVar(TOB_ENCOUNTER_STATE));
			}
		}
	}

	@Subscribe
	protected void onOverheadTextChanged(OverheadTextChanged overheadTextChanged)
	{
		if (client.isInInstancedRegion() && currentEncounter != null && currentEncounter.getEncounter() != null &&
				overheadTextChanged.getOverheadText() != null)
		{
			switch (currentEncounter.getEncounter())
			{
				case XARPUS:
					currentEncounter.castToXarpus().checkOverheadTextPhaseChange(overheadTextChanged.getOverheadText(),
							client.getGameCycle());
					break;
				case VERZIK_VITUR:
					currentEncounter.castToVerzik().checkOverheadTextPhaseChange(overheadTextChanged.getOverheadText(),
							client.getGameCycle());
					break;
			}
		}
	}

	@Subscribe
	protected void onAnimationChanged(AnimationChanged animationChanged)
	{
		if (validateRegionAndCurrentEncounter())
		{
			if (!(animationChanged.getActor() instanceof NPC))
			{
				return;
			}

			final NPC npc = (NPC) animationChanged.getActor();
			if (currentEncounter.getEncounter() == TheatreOfBloodEncounters.VERZIK_VITUR &&
					TheatreOfBloodEncounter.isNpcTheatreOfBloodEncounter(npc.getId()))
			{
				currentEncounter.castToVerzik().checkAnimationPhaseChange(npc.getAnimation(), client.getGameCycle());
			}
		}
	}
}
