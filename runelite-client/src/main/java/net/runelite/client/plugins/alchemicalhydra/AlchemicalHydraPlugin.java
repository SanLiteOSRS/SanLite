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
package net.runelite.client.plugins.alchemicalhydra;

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
		name = "Alchemical Hydra",
		description = "Displays Alchemical Hydra's next attack style and highlights special attacks",
		tags = {"combat", "overlay", "pve", "pvm", "hydra", "alchemical", "boss", "custom", "slayer"},
		type = PluginType.SANLITE
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
	private AlchemicalHydraOverlay overlay;

	@Inject
	private AlchemicalHydraDebugOverlay debugOverlay;

	@Inject
	private ClientThread clientThread;

	@Getter
	private AlchemicalHydra alchemicalHydra;

	private static boolean isNpcAlchemicalHydra(int npcId)
	{
		return npcId == NpcID.ALCHEMICAL_HYDRA;
	}

	@Provides
	AlchemicalHydraConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(AlchemicalHydraConfig.class);
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
		alchemicalHydra = null;
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

	/**
	 * Checks what the next the attack style should be.
	 *
	 * @param attackStyle Ranged or magic
	 */
	private void checkAlchemicalHydraAttackStyleSwitch(final AlchemicalHydra.AttackStyle attackStyle)
	{
		// Check if attack style is not a special attack
		if (attackStyle != AlchemicalHydra.AttackStyle.MAGIC && attackStyle != AlchemicalHydra.AttackStyle.RANGED)
		{
			return;
		}

		// Sets the alchemical hydra's starting attack style
		if (alchemicalHydra.getCurrentAttackStyle() == null)
		{
			alchemicalHydra.setCurrentAttackStyle(attackStyle);
		}
		else if (alchemicalHydra.getAttacksUntilSwitch() <= 0 &&
				alchemicalHydra.getCurrentAttackStyle() == AlchemicalHydra.AttackStyle.MAGIC)
		{
			log.debug("Switch to ranged: " + alchemicalHydra.getAttacksUntilSwitch());
			alchemicalHydra.setCurrentAttackStyle(AlchemicalHydra.AttackStyle.RANGED);
			alchemicalHydra.setAttacksUntilSwitch(AlchemicalHydra.ATTACKS_PER_SWITCH);
			alchemicalHydra.setChangedAttackStyleThisTick(true);
		}
		else if (alchemicalHydra.getAttacksUntilSwitch() <= 0 &&
				alchemicalHydra.getCurrentAttackStyle() == AlchemicalHydra.AttackStyle.RANGED)
		{
			log.debug("Switch to magic: " + alchemicalHydra.getAttacksUntilSwitch());
			alchemicalHydra.setCurrentAttackStyle(AlchemicalHydra.AttackStyle.MAGIC);
			alchemicalHydra.setAttacksUntilSwitch(AlchemicalHydra.ATTACKS_PER_SWITCH);
			alchemicalHydra.setChangedAttackStyleThisTick(true);
		}
		// Correct attacks until switch when de-sync might occur (eg. plugin enabled during kill)
		else if (alchemicalHydra.getAttacksUntilSwitch() > 0 &&
				alchemicalHydra.getCurrentAttackStyle() != attackStyle)
		{
			log.debug("De-sync switch to: " + attackStyle + " | Attacks left: " + alchemicalHydra.getAttacksUntilSwitch());
			alchemicalHydra.setCurrentAttackStyle(attackStyle);
			alchemicalHydra.setAttacksUntilSwitch(AlchemicalHydra.ATTACKS_PER_SWITCH - 1);
			alchemicalHydra.setChangedAttackStyleThisTick(true);
		}
	}

	/**
	 * Checks what and when the next special attack should be.
	 */
	private void checkAlchemicalHydraSpecialAttack()
	{
		if (alchemicalHydra.getAttacksUntilSpecialAttack() > 0)
		{
			alchemicalHydra.setCurrentSpecialAttackStyle(null);
		}
		else if (alchemicalHydra.getCurrentSpecialAttackStyle() == null && alchemicalHydra.getAttacksUntilSpecialAttack() == 0)
		{
			switch (alchemicalHydra.getCurrentHydraPhase())
			{
				case GREEN:
					alchemicalHydra.setCurrentSpecialAttackStyle(AlchemicalHydra.AttackStyle.POISON);
					alchemicalHydra.setAttacksUntilSpecialAttack(AlchemicalHydra.ATTACKS_PER_SPECIAL_ATTACK);
					break;
				case BLUE:
					alchemicalHydra.setCurrentSpecialAttackStyle(AlchemicalHydra.AttackStyle.LIGHTNING);
					alchemicalHydra.setAttacksUntilSpecialAttack(AlchemicalHydra.ATTACKS_PER_SPECIAL_ATTACK);
					break;
				case RED:
					alchemicalHydra.setCurrentSpecialAttackStyle(AlchemicalHydra.AttackStyle.FIRE);
					alchemicalHydra.setAttacksUntilSpecialAttack(AlchemicalHydra.ATTACKS_PER_SPECIAL_ATTACK);
					break;
				case JAD:
					alchemicalHydra.setCurrentSpecialAttackStyle(AlchemicalHydra.AttackStyle.POISON);
					alchemicalHydra.setAttacksUntilSpecialAttack(AlchemicalHydra.ATTACKS_PER_SPECIAL_ATTACK * 3);
					break;
			}
		}
	}

	/**
	 * Checks attack style and phase to determine the amount of hits.
	 * This is done because the alchemical hydra attacks with multiple
	 * heads and the numbers of attack change per phase.
	 *
	 * @param attackStyle Ranged or magic
	 */
	private void onAlchemicalHydraAttack(final AlchemicalHydra.AttackStyle attackStyle)
	{
		// Count ranged & magic attacks as three attacks during jad phase (attack style switches every other attack)
		if (alchemicalHydra.getCurrentHydraPhase() == AlchemicalHydra.Phase.JAD)
		{
			alchemicalHydra.setAttacksUntilSwitch(alchemicalHydra.getAttacksUntilSwitch() - 3);
			alchemicalHydra.setAttacksUntilSpecialAttack(alchemicalHydra.getAttacksUntilSpecialAttack() - 3);
			checkAlchemicalHydraAttackStyleSwitch(attackStyle);
			checkAlchemicalHydraSpecialAttack();
		}
		// All other ranged/magic attacks by an alchemical hydra head
		else
		{
			alchemicalHydra.setAttacksUntilSwitch(alchemicalHydra.getAttacksUntilSwitch() - 1);
			alchemicalHydra.setAttacksUntilSpecialAttack(alchemicalHydra.getAttacksUntilSpecialAttack() - 1);
			checkAlchemicalHydraAttackStyleSwitch(attackStyle);
			checkAlchemicalHydraSpecialAttack();
		}
		int tickCounter = client.getTickCount();
		alchemicalHydra.setNextAttackTick(tickCounter + AlchemicalHydra.ATTACK_RATE);
	}

	/**
	 * Checks if the alchemical hydra's recent projectile id matches an attack style.
	 * If this is true onAlchemicalHydraAttack is called and the remainingProjectileCount is
	 * reduced by 1 to prevent more function calls than attacks fired.
	 */
	private void checkAlchemicalHydraAttacks()
	{
		if (alchemicalHydra != null)
		{
			int recentProjectileId = alchemicalHydra.getRecentProjectileId();

			if (recentProjectileId != -1 && alchemicalHydra.getRemainingProjectileCount() > 0)
			{
				switch (recentProjectileId)
				{
					case ProjectileID.ALCHEMICAL_HYDRA_MAGIC:
						log.debug("onAttack magic: " + alchemicalHydra.getRemainingProjectileCount());
						alchemicalHydra.setRemainingProjectileCount(alchemicalHydra.getRemainingProjectileCount() - 1);
						onAlchemicalHydraAttack(AlchemicalHydra.AttackStyle.MAGIC);
						break;
					case ProjectileID.ALCHEMICAL_HYDRA_RANGED:
						log.debug("onAttack ranged: " + alchemicalHydra.getRemainingProjectileCount());
						alchemicalHydra.setRemainingProjectileCount(alchemicalHydra.getRemainingProjectileCount() - 1);
						onAlchemicalHydraAttack(AlchemicalHydra.AttackStyle.RANGED);
						break;
					case ProjectileID.ALCHEMICAL_HYDRA_POISON:
						log.debug("onAttack poison: " + alchemicalHydra.getRemainingProjectileCount());
						checkAlchemicalHydraSpecialAttack();

						break;
					case ProjectileID.ALCHEMICAL_HYDRA_LIGHTNING:
						log.debug("onAttack lightning: " + alchemicalHydra.getRemainingProjectileCount());
						checkAlchemicalHydraSpecialAttack();

						break;
					case ProjectileID.ALCHEMICAL_HYDRA_FIRE:
						log.debug("onAttack fire: " + alchemicalHydra.getRemainingProjectileCount());
						checkAlchemicalHydraSpecialAttack();
						break;
					default:
						log.warn("Unreachable default case for checkAlchemicalHydraAttacks");
				}
			}
		}
	}

	/**
	 * Checks for phase switches through animation id's. If this is the jad phase it will change
	 * the next attack style when necessary.
	 */
	private void checkAlchemicalHydraPhaseSwitch()
	{
		if (alchemicalHydra != null)
		{
			int animationId = alchemicalHydra.getNpc().getAnimation();
			if (animationId != alchemicalHydra.getLastTickAnimation())
			{
				if (animationId == AnimationID.ALCHEMICAL_HYDRA_SWITCH_TO_BLUE_PHASE &&
						alchemicalHydra.getCurrentHydraPhase() != AlchemicalHydra.Phase.BLUE)
				{
					alchemicalHydra.setCurrentHydraPhase(AlchemicalHydra.Phase.BLUE);
					alchemicalHydra.setAttacksUntilSpecialAttack(AlchemicalHydra.ATTACKS_PER_INITIAL_SPECIAL_ATTACK);
					alchemicalHydra.setWeakened(false);
				}
				else if (animationId == AnimationID.ALCHEMICAL_HYDRA_SWITCH_TO_RED_PHASE &&
						alchemicalHydra.getCurrentHydraPhase() != AlchemicalHydra.Phase.RED)
				{
					alchemicalHydra.setCurrentHydraPhase(AlchemicalHydra.Phase.RED);
					alchemicalHydra.setAttacksUntilSpecialAttack(AlchemicalHydra.ATTACKS_PER_INITIAL_SPECIAL_ATTACK);
					alchemicalHydra.setWeakened(false);
				}
				else if (animationId == AnimationID.ALCHEMICAL_HYDRA_SWITCH_TO_JAD_PHASE &&
						alchemicalHydra.getCurrentHydraPhase() != AlchemicalHydra.Phase.JAD)
				{
					alchemicalHydra.setCurrentHydraPhase(AlchemicalHydra.Phase.JAD);
					if (alchemicalHydra.getCurrentAttackStyle() == AlchemicalHydra.AttackStyle.MAGIC &&
							alchemicalHydra.getAttacksUntilSwitch() != AlchemicalHydra.ATTACKS_PER_SWITCH)
					{
						alchemicalHydra.setCurrentAttackStyle(AlchemicalHydra.AttackStyle.RANGED);
						alchemicalHydra.setChangedAttackStyleThisTick(true);
					}
					else if (alchemicalHydra.getCurrentAttackStyle() == AlchemicalHydra.AttackStyle.RANGED &&
							alchemicalHydra.getAttacksUntilSwitch() != AlchemicalHydra.ATTACKS_PER_SWITCH)
					{
						alchemicalHydra.setCurrentAttackStyle(AlchemicalHydra.AttackStyle.MAGIC);
						alchemicalHydra.setChangedAttackStyleThisTick(true);
					}
					alchemicalHydra.setAttacksUntilSwitch(AlchemicalHydra.ATTACKS_PER_SWITCH);
					alchemicalHydra.setAttacksUntilSpecialAttack(AlchemicalHydra.ATTACKS_PER_SPECIAL_ATTACK);
				}
			}
		}
	}

	/**
	 * Checks if the client graphics objects contain a special attack object and updates the hydra aoeEffects list
	 */
	private void checkGraphicObjects()
	{
		if (alchemicalHydra != null)
		{
			alchemicalHydra.setAoeEffects(
					client.getGraphicsObjects().stream()
							.filter(x -> alchemicalHydra.isSpecialAttack(x))
							.collect(Collectors.toList()));
		}
	}

	private boolean inHydraInstance()
	{
		return Arrays.equals(client.getMapRegions(), HYDRA_REGIONS) && client.isInInstancedRegion();
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		if (inHydraInstance() && alchemicalHydra != null)
		{
			if (!event.getMessage().equals("The chemicals neutralise the Alchemical Hydra's defences!"))
			{
				return;
			}
			alchemicalHydra.setWeakened(true);
		}
	}

	@Subscribe
	public void onProjectileMoved(ProjectileMoved event)
	{
		if (inHydraInstance() && alchemicalHydra != null)
		{
			Projectile projectile = event.getProjectile();
			int projectileId = projectile.getId();

			if (projectileId == ProjectileID.ALCHEMICAL_HYDRA_POISON ||
					projectileId == ProjectileID.ALCHEMICAL_HYDRA_LIGHTNING ||
					projectileId == ProjectileID.ALCHEMICAL_HYDRA_FIRE)
			{
				checkAlchemicalHydraSpecialAttack();
			}

			if (projectileId != ProjectileID.ALCHEMICAL_HYDRA_RANGED && projectileId != ProjectileID.ALCHEMICAL_HYDRA_MAGIC)
			{
				return;
			}

			// The event fires once before the projectile starts moving,
			// and we only want to check each projectile once
			if (client.getGameCycle() >= projectile.getStartMovementCycle())
			{
				return;
			}

			int ticksSinceLastAttack = client.getTickCount() - alchemicalHydra.getLastAttackTick();
			log.debug(client.getTickCount() + " | Projectile | ticks since last attack: " + ticksSinceLastAttack);

			if (ticksSinceLastAttack >= 4 || alchemicalHydra.getLastAttackTick() == -100)
			{
				log.debug(client.getTickCount() + " | Projectile confirmed: " + projectileId);
				alchemicalHydra.setRecentProjectileId(projectile.getId());
				alchemicalHydra.setLastAttackTick(client.getTickCount());
				alchemicalHydra.setRemainingProjectileCount(alchemicalHydra.getRemainingProjectileCount() + 1);
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
		if (event.getNpc().getId() == NpcID.ALCHEMICAL_HYDRA_8622)
		{
			reset();
		}
	}

	@Subscribe
	protected void onClientTick(ClientTick event)
	{
		if (inHydraInstance())
		{
			checkGraphicObjects();
			checkAlchemicalHydraAttacks();
			checkAlchemicalHydraPhaseSwitch();
		}
	}
}
