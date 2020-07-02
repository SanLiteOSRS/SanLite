/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
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
package net.runelite.client.plugins.alchemicalhydra;

import com.google.inject.Provides;
import lombok.Getter;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.Arrays;

@PluginDescriptor(
		name = "Alchemical Hydra",
		description = "Displays Alchemical Hydra's next attack style and other encounter mechanics",
		tags = {"combat", "overlay", "pve", "pvm", "hydra", "alchemical", "boss", "slayer", "timer", "sanlite"},
		enabledByDefault = false
)
public class AlchemicalHydraPlugin extends Plugin
{

	private static final int[] HYDRA_REGIONS = {
			5279, 5280,
			5535, 5536
	};

	@Inject
	private Client client;

	@Inject
	private AlchemicalHydraConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private AlchemicalHydraOverlay alchemicalHydraOverlay;

	@Inject
	private ChemicalVentsOverlay chemicalVentsOverlay;

	@Inject
	private AlchemicalHydraDebugOverlay debugOverlay;

	@Inject
	private ClientThread clientThread;

	@Getter
	private AlchemicalHydra alchemicalHydra;

	@Getter
	private ChemicalVents chemicalVents;

	private static boolean isNpcAlchemicalHydra(int npcId)
	{
		return npcId == NpcID.ALCHEMICAL_HYDRA ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8616 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8617 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8618 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8619 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8620 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8621 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8622 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8634;
	}

	@Provides
	AlchemicalHydraConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(AlchemicalHydraConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(alchemicalHydraOverlay);
		overlayManager.add(chemicalVentsOverlay);
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}
		clientThread.invoke(this::reset);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(alchemicalHydraOverlay);
		overlayManager.remove(chemicalVentsOverlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
		alchemicalHydra = null;
		chemicalVents = null;
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
		alchemicalHydra = null;
	}

	private boolean inHydraInstance()
	{
		return Arrays.equals(client.getMapRegions(), HYDRA_REGIONS) && client.isInInstancedRegion();
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		if (inHydraInstance() && alchemicalHydra != null && chemicalVents != null)
		{
			if ("The chemicals neutralise the Alchemical Hydra's defences!".equals(event.getMessage()))
			{
				alchemicalHydra.setWeakened(true);
			}
		}
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		if (!inHydraInstance() || alchemicalHydra == null)
		{
			return;
		}

		int animationId = event.getActor().getAnimation();
		if (!alchemicalHydra.isAlchemicalHydraAnimation(animationId))
		{
			return;
		}

		// Phase switch
		if (alchemicalHydra.isPhaseSwitchAnimation(animationId))
		{
			alchemicalHydra.checkAlchemicalHydraPhaseSwitch(animationId, client.getTickCount());
			return;
		}

		// Special attacks
		if (alchemicalHydra.getAttacksUntilSpecialAttack() == 0 && alchemicalHydra.isSpecialAttackAnimation(animationId))
		{
			alchemicalHydra.onSpecialAttack(animationId, client.getTickCount());
			return;
		}

		// Allow the second part of the fire special attack
		if (animationId == AnimationID.ALCHEMICAL_HYDRA_RED_PHASE_FIRE_ATTACK)
		{
			alchemicalHydra.onSpecialAttack(animationId, client.getTickCount());
			return;
		}

		// Regular attacks
		if (alchemicalHydra.isRegularAttackAnimation(animationId))
		{
			alchemicalHydra.onAttack(animationId, client.getTickCount(), false);
		}
	}

	@Subscribe
	public void onProjectileMoved(ProjectileMoved event)
	{
		// Attack animations can be cancelled by the phase switching animation
		// So we do a backup check to make sure all attacks are registered
		if (inHydraInstance() && alchemicalHydra != null)
		{
			Projectile projectile = event.getProjectile();
			int projectileId = projectile.getId();

			if (!AlchemicalHydra.isAlchemicalHydraRegularAttackProjectile(projectileId))
			{
				return;
			}

			// If no attack was detected 1 tick after the predicted next attack tick use this projectile instead
			if (client.getTickCount() < alchemicalHydra.getLastAttackTick() + AlchemicalHydra.ATTACK_RATE + 1)
			{
				return;
			}

			int ticksSinceLastAttack = client.getTickCount() - alchemicalHydra.getLastAttackTick();
			int attackRate = alchemicalHydra.getCurrentPhase() == AlchemicalHydra.Phase.JAD ?
					AlchemicalHydra.ENRAGED_ATTACK_RATE : AlchemicalHydra.ATTACK_RATE;
			if (ticksSinceLastAttack >= attackRate || alchemicalHydra.getLastAttackTick() == -100)
			{
				alchemicalHydra.onAttack(alchemicalHydra.projectileIdToAnimationId(projectileId), client.getTickCount(), true);
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
			chemicalVents = null;
		}
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (inHydraInstance())
		{
			NPC npc = event.getNpc();
			if (isNpcAlchemicalHydra(npc.getId()))
			{
				alchemicalHydra = new AlchemicalHydra(npc);
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		if (isNpcAlchemicalHydra(event.getNpc().getId()))
		{
			reset();
		}
	}

	@Subscribe
	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		if (inHydraInstance())
		{
			if (chemicalVents == null)
			{
				chemicalVents = new ChemicalVents();
			}

			GameObject gameObject = event.getGameObject();
			switch (gameObject.getId())
			{
				// Each phase requires the counteracting chemical vent to weaken the Alchemical Hydra
				case ObjectID.CHEMICAL_VENT_GREEN:
					chemicalVents.getChemicalVents().put(AlchemicalHydra.Phase.BLUE, gameObject);
					break;
				case ObjectID.CHEMICAL_VENT_BLUE:
					chemicalVents.getChemicalVents().put(AlchemicalHydra.Phase.RED, gameObject);
					break;
				case ObjectID.CHEMICAL_VENT_RED:
					chemicalVents.getChemicalVents().put(AlchemicalHydra.Phase.GREEN, gameObject);
					break;
			}
		}
	}

	@Subscribe
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		if (ChemicalVents.isChemicalVentObject(event.getGameObject().getId()))
		{
			chemicalVents = null;
		}
	}

	@Subscribe
	public void onGameObjectEntityChanged(GameObjectEntityChanged event)
	{
		if (inHydraInstance() && this.alchemicalHydra != null && chemicalVents != null)
		{
			switch (alchemicalHydra.getCurrentPhase())
			{
				case GREEN:
					if (event.getGameObject().getId() == ObjectID.CHEMICAL_VENT_GREEN)
					{
						chemicalVents.checkChemicalVentStatus(client.getTickCount());
					}
					break;
				case BLUE:
					if (event.getGameObject().getId() == ObjectID.CHEMICAL_VENT_BLUE)
					{
						chemicalVents.checkChemicalVentStatus(client.getTickCount());
					}
					break;
				case RED:
					if (event.getGameObject().getId() == ObjectID.CHEMICAL_VENT_RED)
					{
						chemicalVents.checkChemicalVentStatus(client.getTickCount());
					}
					break;
			}
		}
	}

	@Subscribe
	protected void onClientTick(ClientTick event)
	{
		if (inHydraInstance())
		{
			if (alchemicalHydra != null)
			{
				alchemicalHydra.checkGraphicObjects(client.getGraphicsObjects());
				alchemicalHydra.checkAlchemicalHydraSpecialAttacks(client.getTickCount());
			}
			if (chemicalVents != null)
			{
				chemicalVents.checkInEncounterRoom(client.getLocalPlayer(), client.getTickCount());
			}
		}
		else if (chemicalVents != null)
		{
			chemicalVents = null;
		}
	}
}
