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
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.Arrays;
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

	private static final int[] MAIDEN_REGIONS = {
			12613, 12869
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
	private ClientThread clientThread;

	@Getter
	private SugadintiMaiden sugadintiMaiden;

	private static boolean isNpcSugadintiMaiden(int npcId)
	{
		return npcId == NpcID.THE_MAIDEN_OF_SUGADINTI ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8361 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8362 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8363 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8364 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8365;
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
		clientThread.invoke(this::reset);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		sugadintiMaiden = null;
	}

	private void reset()
	{
		sugadintiMaiden = null;
	}

	/**
	 * Checks if the client graphics objects contain a special attack object and updates the maiden aoeEffects list
	 */
	private void checkGraphicObjects()
	{
		if (sugadintiMaiden != null)
		{
			sugadintiMaiden.setAoeEffects(
					client.getGraphicsObjects().stream()
							.filter(x -> sugadintiMaiden.isBloodAttack(x.getId()))
							.collect(Collectors.toList()));
		}
	}

	private boolean inSugadintiMaidenInstance()
	{
		return Arrays.equals(client.getMapRegions(), MAIDEN_REGIONS) && client.isInInstancedRegion();
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
		if (inSugadintiMaidenInstance())
		{
			NPC npc = event.getNpc();
			if (isNpcSugadintiMaiden(npc.getId()))
			{
				sugadintiMaiden = new SugadintiMaiden(npc);
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		if (isNpcSugadintiMaiden(event.getNpc().getId()))
		{
			reset();
		}
	}

	@Subscribe
	protected void onClientTick(ClientTick event)
	{
		if (inSugadintiMaidenInstance())
		{
			checkGraphicObjects();
		}
	}
}
