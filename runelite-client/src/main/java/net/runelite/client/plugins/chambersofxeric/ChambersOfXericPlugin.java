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
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.chambersofxeric.encounters.ChambersOfXericRaid;
import net.runelite.client.plugins.chambersofxeric.encounters.Vanguard;
import net.runelite.client.plugins.chambersofxeric.encounters.VasaNistirio;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@Slf4j
@PluginDescriptor(
		name = "CoX Beta",
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
	private ChambersOfXericRaid currentRaid;

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
		clientThread.invoke(this::resetEncounter);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
		resetEncounter();
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

	private void resetEncounter()
	{
		currentRaid = null;
		log.debug("Current encounter reset");
	}

	private boolean checkInChambersOfXeric()
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return false;
		}

		return client.getVar(Varbits.IN_RAID) == 1;
	}

	boolean validateRaidPresence()
	{
		return isInChambersOfXeric && currentRaid != null;
	}

	@Subscribe
	private void onAnimationChanged(AnimationChanged event)
	{
		if (!validateRaidPresence() || !(event.getActor() instanceof NPC))
		{
			return;
		}

		NPC npc = (NPC) event.getActor();
		int npcId = npc.getId();
		if (!ChambersOfXericRaid.isNpcChambersOfXericEncounter(npcId))
		{
			return;
		}

		if (VasaNistirio.isNpcVasaNistirio(npcId))
		{

			switch (npc.getAnimation())
			{
//				case AnimationID.VASA_START_GLOWING_ROCK_CHANNEL:
//					currentRaid.onVasaHealingStart(client.getGameCycle());
//					break;
//				case AnimationID.VASA_END_GLOWING_ROCK_CHANNEL:
//					currentRaid.onVasaHealingEnd(client.getGameCycle());
//					break;
			}
		}
	}

	@Subscribe
	private void onProjectileSpawned(ProjectileSpawned event)
	{
		if (!validateRaidPresence())
		{
			return;
		}

		Projectile projectile = event.getProjectile();
		int projectileId = projectile.getId();
		if (!ChambersOfXericRaid.isCoxAoeProjectile(projectileId))
		{
			return;
		}

		log.debug("CT: {} | Projectile {} spawned", client.getGameCycle(), event.getProjectile().getId());
	}

	@Subscribe
	public void onHitsplatApplied(HitsplatApplied event)
	{
		Player player = client.getLocalPlayer();
		if (player == null)
			return;

		if (event.getActor().equals(player))
		{
			log.debug("CT: {} | Local player hit for {}", client.getGameCycle(), event.getHitsplat().getAmount());
		}
	}

	@Subscribe
	public void onProjectileMoved(ProjectileMoved event)
	{
		if (!validateRaidPresence())
		{
			return;
		}

		Projectile projectile = event.getProjectile();
		if (!ChambersOfXericRaid.isCoxAoeProjectile(projectile.getId()) || projectile.getInteracting() != null)
		{
			return;
		}

		currentRaid.onAreaOfEffectProjectile(projectile, event.getPosition(), config, client.getGameCycle());
	}

	@Subscribe
	public void onGraphicsObjectCreated(GraphicsObjectCreated event)
	{
		if (!validateRaidPresence())
		{
			return;
		}

		log.debug("CT: {} | Gfx object spawned: {}", client.getGameCycle(), event.getGraphicsObject().getId());
		GraphicsObject graphicsObject = event.getGraphicsObject();
		if (!ChambersOfXericRaid.isCoxGraphicsObject(graphicsObject.getId()))
		{
			return;
		}

		currentRaid.onGraphicsObject(graphicsObject, config);
		log.debug("CT: {} | Gfx object added: {}", client.getGameCycle(), event.getGraphicsObject().getId());
	}

	@Subscribe
	public void onGraphicsObjectDespawned(GraphicsObjectDespawned event)
	{
		if (!validateRaidPresence())
		{
			return;
		}

		log.debug("CT: {} | Gfx object despawned: {}", client.getGameCycle(), event.getGraphicsObject().getId());
		GraphicsObject graphicsObject = event.getGraphicsObject();
		if (!ChambersOfXericRaid.isCoxGraphicsObject(graphicsObject.getId()))
		{
			return;
		}

		currentRaid.getGraphicObjects().remove(graphicsObject);
		log.debug("CT: {} | Gfx object removed: {}", client.getGameCycle(), event.getGraphicsObject().getId());
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (!validateRaidPresence())
		{
			return;
		}

		NPC npc = event.getNpc();
		System.out.println(npc.getName() + " spawned" + npc.getId() + " id");
		if (!ChambersOfXericRaid.isNpcChambersOfXericEncounter(npc.getId()))
		{
			return;
		}

		currentRaid.onNpcSpawned(npc, config, client.getGameCycle());
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		if (!validateRaidPresence())
		{
			return;
		}

		NPC npc = event.getNpc();
		if (!ChambersOfXericRaid.isNpcChambersOfXericEncounter(npc.getId()))
		{
			return;
		}

		currentRaid.onNpcDespawned(npc, client.getGameCycle());
	}


	@Subscribe
	public void onVarbitChanged(VarbitChanged event)
	{
		isInChambersOfXeric = checkInChambersOfXeric();
		if (isInChambersOfXeric && currentRaid == null)
		{
			currentRaid = new ChambersOfXericRaid();
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
			resetEncounter();
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (!validateRaidPresence())
		{
			return;
		}

		if (!currentRaid.getAliveVanguards().isEmpty())
		{
			currentRaid.getAliveVanguards().forEach(Vanguard::updateHP);
		}
	}
}
