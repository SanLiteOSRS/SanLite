package net.runelite.client.plugins.nightmareofashihama;

import com.google.inject.Provides;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.events.*;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.Arrays;

@PluginDescriptor(
		name = "Nightmare of Ashihama",
		description = "Helps with the various mechanics in the Nightmare of Ashihama encounter",
		tags = {"combat", "overlay", "pve", "pvm", "the nightmare", "boss", "group", "timer", "encounter"},
		enabledByDefault = false,
		type = PluginType.SANLITE_USE_AT_OWN_RISK
)
public class NightmareOfAshihamaPlugin extends Plugin
{
	private static final int[] ENCOUNTER_REGIONS = {
			// TODO: Add encounter regions
	};

	@Inject
	private Client client;

	@Inject
	private NightmareOfAshihamaConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private NightmareOfAshihamaOverlay nightmareOverlay;

	@Inject
	private NightmareOfAshihamaDebugOverlay debugOverlay;

	@Inject
	private ClientThread clientThread;

	@Getter
	private NightmareOfAshihama nightmare;

	@Provides
	NightmareOfAshihamaConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(NightmareOfAshihamaConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(nightmareOverlay);
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}
		clientThread.invoke(this::reset);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(nightmareOverlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
		nightmare = null;
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
		nightmare = null;
	}

	private boolean inEncounterInstance()
	{
		return Arrays.equals(client.getMapRegions(), ENCOUNTER_REGIONS) && client.isInInstancedRegion();
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		if (!inEncounterInstance() || nightmare == null)
		{
			return;
		}

		int animationId = event.getActor().getAnimation();
		if (!event.getActor().equals(nightmare.getNpc()))
		{
			return;
		}

		nightmare.onAttack(animationId, client.getTickCount());
	}

	@Subscribe
	public void onProjectileMoved(ProjectileMoved event)
	{
		if (inEncounterInstance() && nightmare != null)
		{
			Projectile projectile = event.getProjectile();
			int projectileId = projectile.getId();

			if (!NightmareOfAshihama.isNightmareProjectile(projectileId))
			{
				return;
			}

			// The event fires once before the projectile starts moving,
			// and we only want to check each projectile once
			if (client.getGameCycle() >= projectile.getStartMovementCycle())
			{
				return;
			}

			nightmare.onProjectile(projectileId, client.getTickCount());
		}
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (inEncounterInstance())
		{
			NPC npc = event.getNpc();
			if (NightmareOfAshihama.isNpcNightmare(npc.getId()))
			{
				nightmare = new NightmareOfAshihama(npc);
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		if (NightmareOfAshihama.isNpcNightmare(event.getNpc().getId()))
		{
			reset();
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
	protected void onClientTick(ClientTick event)
	{
		if (!inEncounterInstance() || nightmare == null)
		{
			return;
		}

		nightmare.checkGraphicObjects(client.getGraphicsObjects());
	}
}
