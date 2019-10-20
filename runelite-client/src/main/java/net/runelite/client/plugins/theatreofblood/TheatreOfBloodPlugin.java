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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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


	// TODO: Does not contain nylocas encounter npc's
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
		clientThread.invoke(this::reset);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
		reset();
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

	private void reset()
	{
		currentEncounter = null;
		log.debug("Current encounter reset");
	}

	private void checkGraphicObjects()
	{
		if (currentEncounter != null && currentEncounter.getNpc() != null)
		{
			switch (currentEncounter.getNpc().getId())
			{
				case NpcID.THE_MAIDEN_OF_SUGADINTI:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8361:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8362:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8363:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8364:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8365:
					SugadintiMaiden sugadintiMaiden = (SugadintiMaiden) currentEncounter;
					currentEncounter.setAoeEffects(
							client.getGraphicsObjects().stream()
									.filter(x -> sugadintiMaiden.isBloodSplatAttack(x.getId()))
									.collect(Collectors.toList()));
					break;
				case NpcID.PESTILENT_BLOAT:
					PestilentBloat pestilentBloat = (PestilentBloat) currentEncounter;
					currentEncounter.setAoeEffects(
							client.getGraphicsObjects().stream()
									.filter(x -> pestilentBloat.isHandAttack(x.getId()))
									.collect(Collectors.toList()));
					break;
				case NpcID.XARPUS:
				case NpcID.XARPUS_8339:
				case NpcID.XARPUS_8340:
				case NpcID.XARPUS_8341:
					Xarpus xarpus = (Xarpus) currentEncounter;
					currentEncounter.setAoeEffects(
							client.getGraphicsObjects().stream()
									.filter(x -> xarpus.isPoisonAttackLanding(x.getId()))
									.collect(Collectors.toList()));
					break;
				case NpcID.VERZIK_VITUR:
				case NpcID.VERZIK_VITUR_8369:
				case NpcID.VERZIK_VITUR_8370:
				case NpcID.VERZIK_VITUR_8371:
				case NpcID.VERZIK_VITUR_8372:
				case NpcID.VERZIK_VITUR_8373:
				case NpcID.VERZIK_VITUR_8374:
				case NpcID.VERZIK_VITUR_8375:
					Verzik verzik = (Verzik) currentEncounter;
					currentEncounter.setAoeEffects(
							client.getGraphicsObjects().stream()
									.filter(x -> verzik.isGreenOrbPool(x.getId()))
									.collect(Collectors.toList()));
					break;
			}
		}
	}

	private void checkGameObjects()
	{
		if (currentEncounter != null && currentEncounter.getNpc() != null)
		{
			switch (currentEncounter.getNpc().getId())
			{
				case NpcID.THE_MAIDEN_OF_SUGADINTI:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8361:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8362:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8363:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8364:
				case NpcID.THE_MAIDEN_OF_SUGADINTI_8365:
					SugadintiMaiden sugadintiMaiden = (SugadintiMaiden) currentEncounter;
					currentEncounter.setGameObjects(
							getClientGameObjects().stream()
									.filter(x -> sugadintiMaiden.isBloodSpawnBloodTile(x.getId()))
									.collect(Collectors.toList()));
					break;
				case NpcID.SOTETSEG:
				case NpcID.SOTETSEG_8388:
					checkMazeTiles((Sotetseg) currentEncounter);
					break;
				case NpcID.XARPUS:
				case NpcID.XARPUS_8339:
				case NpcID.XARPUS_8340:
				case NpcID.XARPUS_8341:
					for (GroundObject groundObject : getClientGroundObjects()) // TODO: Remove
					{
						log.debug("groundObject id: {}", groundObject.getId());
						if (groundObject.getId() == ObjectID.EXHUMED || groundObject.getId() == ObjectID.ACIDIC_MIASMA)
						{
							log.debug("groundObject contain Xarpus object | id: {}", groundObject.getId());
						} // TODO: This only sees the game objects highlighted and not ground objects for Xarpus
					}


					Xarpus xarpus = (Xarpus) currentEncounter;
					xarpus.setGroundObjects(
							getClientGroundObjects().stream()
									.filter(x -> xarpus.isPoisonTileObject(x.getId()) || xarpus.isHealingPoolTileObject(x.getId()))
									.collect(Collectors.toList()));
					break;
			}
		}
	}

	private void checkBloatStatus()
	{
		PestilentBloat pestilentBloat = (PestilentBloat) currentEncounter;
		if (pestilentBloat.isAsleep() && client.getGameCycle() > pestilentBloat.getLastSleepEndClientTick() + 250)
		{
			if (pestilentBloat.getRemainingSleepClientTicks() == -1)
			{
				pestilentBloat.sleep(client.getGameCycle());
			}
			else if (pestilentBloat.getRemainingSleepClientTicks() <= 0)
			{
				pestilentBloat.wakeUp(client.getGameCycle());
			}
			else
			{
				pestilentBloat.updateSleepDurationTimer(client.getGameCycle());
			}
		}
	}

	private void checkNylocasAggressiveNpcs()
	{
		Nylocas nylocas = (Nylocas) currentEncounter;
		nylocas.setHighlightedNylocasNpcs(
				client.getNpcs().stream()
						.filter(x -> nylocas.isNylocasNpc(x.getId()) &&
								nylocas.isNylocasNpcAggressive(x, client.getPlayers()))
						.collect(Collectors.toList()));
	}

	private void checkMazeTiles(Sotetseg sotetseg)
	{
		if (sotetseg.isMazeActive(getClientGameObjects()))
		{
			if (sotetseg.getActiveMazeTiles() == null)
			{
				sotetseg.activateMaze();
			}

			getClientGameObjects().stream()
					.filter(x -> sotetseg.isRedMazeTileObject(x.getId()) && !sotetseg.getActiveMazeTiles().contains(x))
					.forEach((x) ->
					{
						sotetseg.getActiveMazeTiles().add(x);
					});
		}
		else if (!sotetseg.isMazeActive(getClientGameObjects()))
		{
			if (sotetseg.getActiveMazeTiles() != null)
			{
				sotetseg.resetMaze();
			}
		}
	}

	private List<GameObject> getClientGameObjects()
	{
		Scene scene = client.getScene();
		Tile[][][] tiles = scene.getTiles();

		int z = client.getPlane();

		List<GameObject> gameObjectsList = new ArrayList<>();
		for (int x = 0; x < Constants.SCENE_SIZE; ++x)
		{
			for (int y = 0; y < Constants.SCENE_SIZE; ++y)
			{
				Tile tile = tiles[z][x][y];

				if (tile == null)
				{
					continue;
				}

				Player player = client.getLocalPlayer();
				if (player == null)
				{
					continue;
				}

				GameObject[] gameObjects = tile.getGameObjects();
				if (gameObjects != null)
				{
					for (GameObject gameObject : gameObjects)
					{
						if (gameObject != null)
						{
							gameObjectsList.add(gameObject);
						}
					}
				}
			}
		}
		return gameObjectsList;
	}

	private List<GroundObject> getClientGroundObjects()
	{
		Scene scene = client.getScene();
		Tile[][][] tiles = scene.getTiles();

		int z = client.getPlane();

		List<GroundObject> groundObjectsList = new ArrayList<>();
		for (int x = 0; x < Constants.SCENE_SIZE; ++x)
		{
			for (int y = 0; y < Constants.SCENE_SIZE; ++y)
			{
				Tile tile = tiles[z][x][y];

				if (tile == null)
				{
					continue;
				}

				Player player = client.getLocalPlayer();
				if (player == null)
				{
					continue;
				}

				GroundObject groundObject = tile.getGroundObject();
				if (groundObject != null)
				{
					groundObjectsList.add(groundObject);
				}
			}
		}
		return groundObjectsList;
	}

	/**
	 * Checks the current world region and NPC id and sets the encounter based on it.
	 *
	 * @param npcId current world region(s)
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
			if (npcId == NpcID.THE_MAIDEN_OF_SUGADINTI || npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8361 ||
					npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8362 || npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8363 ||
					npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8364 || npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8365)
			{
				currentEncounter = new SugadintiMaiden(TheatreOfBloodEncounterRegions.MAIDEN_REGIONS, TheatreOfBloodEncounters.SUGADINTI_MAIDEN);
				log.debug("Current encounter set to maiden: {}", currentEncounter);
			}
			else if (npcId == NpcID.PESTILENT_BLOAT)
			{
				currentEncounter = new PestilentBloat(TheatreOfBloodEncounterRegions.BLOAT_REGIONS, TheatreOfBloodEncounters.PESTILENT_BLOAT);
				log.debug("Current encounter set to bloat: {}", currentEncounter);
			}
			else if (Arrays.equals(worldRegion, NYLOCAS_REGIONS))
			{
				currentEncounter = new Nylocas(TheatreOfBloodEncounterRegions.NYLOCAS_REGIONS, TheatreOfBloodEncounters.NYLOCAS);
				log.debug("Current encounter set to nylocas: {}", currentEncounter);
			}
			else if (npcId == NpcID.SOTETSEG || npcId == NpcID.SOTETSEG_8388)
			{
				currentEncounter = new Sotetseg(TheatreOfBloodEncounterRegions.SOTETSEG_REGIONS, TheatreOfBloodEncounters.SOTETSEG);
				log.debug("Current encounter set to sotetseg: {}", currentEncounter);
			}
			else if (npcId == NpcID.XARPUS || npcId == NpcID.XARPUS_8339 || npcId == NpcID.XARPUS_8340 || npcId == NpcID.XARPUS_8341)
			{
				currentEncounter = new Xarpus(TheatreOfBloodEncounterRegions.XARPUS_REGIONS, TheatreOfBloodEncounters.XARPUS);
				log.debug("Current encounter set to xarpus: {}", currentEncounter);
			}
			else if (npcId == NpcID.VERZIK_VITUR_8369 || npcId == NpcID.VERZIK_VITUR_8370 || npcId == NpcID.VERZIK_VITUR_8371 ||
					npcId == NpcID.VERZIK_VITUR_8372 || npcId == NpcID.VERZIK_VITUR_8373 || npcId == NpcID.VERZIK_VITUR_8374 ||
					npcId == NpcID.VERZIK_VITUR_8375)
			{
				currentEncounter = new Verzik(TheatreOfBloodEncounterRegions.VERZIK_REGIONS, TheatreOfBloodEncounters.VERZIK);
				log.debug("Current encounter set to verzik: {}", currentEncounter);
			}
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		GameState gameState = event.getGameState();
		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			reset();
		}
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (currentEncounter == null)
		{
			updateCurrentEncounter(event.getNpc().getId());
		}

		if (currentEncounter != null)
		{
			NPC npc = event.getNpc();
			if (isNpcTheatreOfBloodEncounter(npc.getId()))
			{
				currentEncounter.setNpc(npc);
				log.debug("Current encounter npc set: {}", npc.getName());
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		NPC npc = event.getNpc();
		if (isNpcTheatreOfBloodEncounter(npc.getId()))
		{
			log.debug("Encounter ended because of npc despawn | id: {}", event.getNpc().getId());
			reset();
		}
	}

	@Subscribe
	protected void onClientTick(ClientTick event)
	{
		if (currentEncounter != null && client.isInInstancedRegion())
		{
			checkGraphicObjects();
			checkGameObjects();

			switch (currentEncounter.getEncounter())
			{
				case PESTILENT_BLOAT:
					checkBloatStatus();
					break;
				case NYLOCAS:
					checkNylocasAggressiveNpcs();
					break;
			}
		}
	}
}
