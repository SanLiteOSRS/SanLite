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
import java.util.stream.Collectors;

@Slf4j
@PluginDescriptor(
		name = "Theatre of Blood",
		description = "Helps with the various boss mechanics in the Theatre of Blood",
		tags = {"tob", "raids", "theatre", "blood", "theatre of blood", "pvm", "overlay", "boss"},
		type = PluginType.SANLITE,
		enabledByDefault = false,
		hidden = true
)
public class TheatreOfBloodPlugin extends Plugin
{
	private static final int[] MAIDEN_REGIONS = {
			12613, 12869
	};
	private static final int[] BLOAT_REGIONS = {
			13125
	};
	private static final int[] NYLOCAS_REGIONS = {
			13122
	};
	private static final int[] SOTETSEG_REGIONS = {
			13123, 13379
	};
	private static final int[] XARPUS_REGIONS = {
			12612
	};
	private static final int[] VERZIK_REGIONS = {
			12611
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
		if (currentEncounter != null && currentEncounter.isStarted() && currentEncounter.getNpc() != null)
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
									.filter(x -> sugadintiMaiden.isBloodAttack(x.getId()))
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
									.filter(x -> xarpus.isPoisonAttack(x.getId()))
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
									.filter(x -> verzik.isSkullAttack(x.getId()) || verzik.isGreenOrbPool(x.getId()))
									.collect(Collectors.toList()));
					break;
			}
		}
	}

	@Subscribe
	public void onWorldRegionChanged(WorldRegionChanged event)
	{
		if (currentEncounter != null)
		{
			return;
		}

		if (isInstanceTheatreOfBloodRegion(event.getWorldRegion()))
		{
			if (Arrays.equals(event.getWorldRegion(), MAIDEN_REGIONS))
			{
				currentEncounter = new SugadintiMaiden(TheatreOfBloodEncounterRegions.MAIDEN_REGIONS, TheatreOfBloodEncounters.SUGADINTI_MAIDEN);
				log.debug("Current encounter set to maiden: {}", currentEncounter);
			}
			else if (Arrays.equals(event.getWorldRegion(), BLOAT_REGIONS))
			{
				currentEncounter = new PestilentBloat(TheatreOfBloodEncounterRegions.BLOAT_REGIONS, TheatreOfBloodEncounters.PESTILENT_BLOAT);
				log.debug("Current encounter set to bloat: {}", currentEncounter);
			}
			else if (Arrays.equals(event.getWorldRegion(), NYLOCAS_REGIONS))
			{
				currentEncounter = new Nylocas(TheatreOfBloodEncounterRegions.NYLOCAS_REGIONS, TheatreOfBloodEncounters.NYLOCAS);
				log.debug("Current encounter set to nylocas: {}", currentEncounter);
			}
			else if (Arrays.equals(event.getWorldRegion(), SOTETSEG_REGIONS))
			{
				currentEncounter = new Sotetseg(TheatreOfBloodEncounterRegions.SOTETSEG_REGIONS, TheatreOfBloodEncounters.SOTETSEG);
				log.debug("Current encounter set to sotetseg: {}", currentEncounter);
			}
			else if (Arrays.equals(event.getWorldRegion(), XARPUS_REGIONS))
			{
				currentEncounter = new Xarpus(TheatreOfBloodEncounterRegions.XARPUS_REGIONS, TheatreOfBloodEncounters.XARPUS);
				log.debug("Current encounter set to xarpus: {}", currentEncounter);
			}
			else if (Arrays.equals(event.getWorldRegion(), VERZIK_REGIONS))
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
		if (isNpcTheatreOfBloodEncounter(event.getNpc().getId()))
		{
			reset();
		}
	}

	@Subscribe
	public void onVarbitChanged(VarbitChanged event)
	{
		if (currentEncounter != null && !currentEncounter.isStarted())
		{
			if (client.getVar(Varbits.TOB_ENCOUNTER_DOOR) == 1)
			{
				currentEncounter.setStarted(true);
			}
		}
	}

	@Subscribe
	protected void onClientTick(ClientTick event)
	{
		if (currentEncounter != null && client.isInInstancedRegion())
		{
			checkGraphicObjects();
		}
	}
}
