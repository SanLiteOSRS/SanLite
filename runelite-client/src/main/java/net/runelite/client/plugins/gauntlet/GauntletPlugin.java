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
package net.runelite.client.plugins.gauntlet;

import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.*;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static net.runelite.api.ObjectID.*;

@Slf4j
@PluginDescriptor(
		name = "The Gauntlet",
		description = "Assists with The Gauntlet minigame",
		tags = {"combat", "overlay", "pve", "pvm", "gauntlet", "crystal", "hunllef", "custom", "minigame", "sanlite"},
		enabledByDefault = false
)
public class GauntletPlugin extends Plugin
{

	private static final int[] GAUNTLET_REGION = {
			7512
	};

	private static final int[] CORRUPTED_GAUNTLET_REGION = {
			7768
	};

	@Inject
	private Client client;

	@Inject
	private GauntletConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private GauntletOverlay overlay;

	@Inject
	private GauntletResourceSpotOverlay resourceSpotOverlay;

	@Inject
	private GauntletResourceSpotMinimapOverlay resourceSpotMinimapOverlay;

	@Inject
	private GauntletDebugOverlay debugOverlay;

	@Inject
	private ClientThread clientThread;

	@Getter
	private GauntletBoss gauntletBoss;

	@Getter(AccessLevel.PACKAGE)
	private List<GameObject> resourceSpots = new ArrayList<>();

	private static boolean isNpcGauntletBoss(int npcId)
	{
		return npcId == NpcID.CRYSTALLINE_HUNLLEF || npcId == NpcID.CRYSTALLINE_HUNLLEF_9022 ||
				npcId == NpcID.CRYSTALLINE_HUNLLEF_9023 || npcId == NpcID.CRYSTALLINE_HUNLLEF_9024 ||
				npcId == NpcID.CORRUPTED_HUNLLEF || npcId == NpcID.CORRUPTED_HUNLLEF_9036 ||
				npcId == NpcID.CORRUPTED_HUNLLEF_9037 || npcId == NpcID.CORRUPTED_HUNLLEF_9038;
	}

	@Provides
	GauntletConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GauntletConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
		overlayManager.add(resourceSpotOverlay);
		overlayManager.add(resourceSpotMinimapOverlay);
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
		overlayManager.remove(resourceSpotOverlay);
		overlayManager.remove(resourceSpotMinimapOverlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
		reset();
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{

		if (!config.showPaddlefishSpots())
		{
			resourceSpots.removeIf(spot -> spot.getId() == FISHING_SPOT_36068 ||
					spot.getId() == FISHING_SPOT_35971);
		}

		if (!config.showCrystalDeposits())
		{
			resourceSpots.removeIf(spot -> spot.getId() == CRYSTAL_DEPOSIT ||
					spot.getId() == CORRUPT_DEPOSIT);
		}

		if (!config.showGrymRoots())
		{
			resourceSpots.removeIf(spot -> spot.getId() == GRYM_ROOT_36070 ||
					spot.getId() == GRYM_ROOT);
		}

		if (!config.showPhrenRoots())
		{
			resourceSpots.removeIf(spot -> spot.getId() == PHREN_ROOTS_36066 ||
					spot.getId() == PHREN_ROOTS);
		}

		if (!config.showLinumTirinum())
		{
			resourceSpots.removeIf(spot -> spot.getId() == LINUM_TIRINUM_36072 ||
					spot.getId() == LINUM_TIRINUM);
		}

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
		gauntletBoss = null;
		resourceSpots.clear();
	}

	/**
	 * Checks what the next the attack style should be.
	 *
	 * @param attackStyle Ranged or magic
	 */
	private void checkGauntletBossAttackStyleSwitch(final GauntletBoss.AttackStyle attackStyle)
	{
		// Check if attack style is not a special attack
		if (attackStyle != GauntletBoss.AttackStyle.MAGIC && attackStyle != GauntletBoss.AttackStyle.RANGED)
		{
			return;
		}

		// Sets the gauntlets boss starting attack style
		if (gauntletBoss.getCurrentAttackStyle() == null)
		{
			gauntletBoss.setCurrentAttackStyle(attackStyle);
		}
		else if (gauntletBoss.getAttacksUntilSwitch() <= 0 &&
				gauntletBoss.getCurrentAttackStyle() == GauntletBoss.AttackStyle.MAGIC)
		{
			log.debug("Switch to ranged: " + gauntletBoss.getAttacksUntilSwitch());
			gauntletBoss.setCurrentAttackStyle(GauntletBoss.AttackStyle.RANGED);
			gauntletBoss.setAttacksUntilSwitch(GauntletBoss.ATTACKS_PER_SWITCH);
			gauntletBoss.setChangedAttackStyleThisTick(true);
		}
		else if (gauntletBoss.getAttacksUntilSwitch() <= 0 &&
				gauntletBoss.getCurrentAttackStyle() == GauntletBoss.AttackStyle.RANGED)
		{
			log.debug("Switch to magic: " + gauntletBoss.getAttacksUntilSwitch());
			gauntletBoss.setCurrentAttackStyle(GauntletBoss.AttackStyle.MAGIC);
			gauntletBoss.setAttacksUntilSwitch(GauntletBoss.ATTACKS_PER_SWITCH);
			gauntletBoss.setChangedAttackStyleThisTick(true);
		}
		// Correct attacks until switch when de-sync might occur (eg. plugin enabled during kill)
		else if (gauntletBoss.getAttacksUntilSwitch() > 0 &&
				gauntletBoss.getCurrentAttackStyle() != attackStyle)
		{
			log.debug("De-sync switch to: " + attackStyle + " | Attacks left: " + gauntletBoss.getAttacksUntilSwitch());
			gauntletBoss.setCurrentAttackStyle(attackStyle);
			gauntletBoss.setAttacksUntilSwitch(GauntletBoss.ATTACKS_PER_SWITCH - 1);
			gauntletBoss.setChangedAttackStyleThisTick(true);
		}
	}

	/**
	 * Sets the remaining hits for the current Gauntlet boss attack style.
	 *
	 * @param attackStyle Ranged or magic
	 */
	private void onGauntletBossAttack(final GauntletBoss.AttackStyle attackStyle)
	{

		gauntletBoss.setAttacksUntilSwitch(gauntletBoss.getAttacksUntilSwitch() - 1);
		checkGauntletBossAttackStyleSwitch(attackStyle);
		gauntletBoss.setNextAttackTick(client.getTickCount() + GauntletBoss.ATTACK_RATE);
	}

	/**
	 * Checks if the gauntlets boss recent projectile id matches an attack style.
	 * If this is true onGauntletBossAttack is called and the remainingProjectileCount is
	 * reduced by 1 to prevent more function calls than attacks fired.
	 */
	private void checkGauntletBossAttacks()
	{
		if (gauntletBoss != null)
		{
			int recentProjectileId = gauntletBoss.getRecentProjectileId();

			if (recentProjectileId != -1 && gauntletBoss.getRemainingProjectileCount() > 0)
			{
				switch (recentProjectileId)
				{
					case ProjectileID.GAUNTLET_BOSS_MAGIC:
					case ProjectileID.CORRUPTED_GAUNTLET_BOSS_MAGIC:
						log.debug("onAttack magic: " + gauntletBoss.getRemainingProjectileCount());
						gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() - 1);
						onGauntletBossAttack(GauntletBoss.AttackStyle.MAGIC);
						break;
					case ProjectileID.GAUNTLET_BOSS_MAGIC_DISABLE_PRAYERS:
					case ProjectileID.CORRUPTED_GAUNTLET_BOSS_MAGIC_DISABLE_PRAYERS:
						log.debug("onAttack magic disable prayers: " + gauntletBoss.getRemainingProjectileCount());
						gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() - 1);
						onGauntletBossAttack(GauntletBoss.AttackStyle.MAGIC);
						break;
					case ProjectileID.GAUNTLET_BOSS_RANGED:
					case ProjectileID.CORRUPTED_GAUNTLET_BOSS_RANGED:
						log.debug("onAttack ranged: " + gauntletBoss.getRemainingProjectileCount());
						gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() - 1);
						onGauntletBossAttack(GauntletBoss.AttackStyle.RANGED);
						break;
					default:
						log.warn("Unreachable default case for checkGauntletBossAttacks | projectile id: {}", recentProjectileId);
				}
			}
		}
	}

	private void checkGauntletBossCrystalAttack()
	{
		if (gauntletBoss != null)
		{
			int animationId = gauntletBoss.getNpc().getAnimation();
			if (animationId != gauntletBoss.getLastTickAnimation())
			{
				int ticksSinceLastAttack = client.getTickCount() - gauntletBoss.getLastAttackTick();
				if (animationId == AnimationID.GAUNTLET_BOSS_CRYSTAL_ATTACK && ticksSinceLastAttack >= 4)
				{
					log.debug("onAttack crystal");
					gauntletBoss.setAttacksUntilSwitch(gauntletBoss.getAttacksUntilSwitch() - 1);
					checkGauntletBossAttackStyleSwitch(gauntletBoss.getCurrentAttackStyle());
					gauntletBoss.setLastAttackTick(client.getTickCount());
					gauntletBoss.setNextAttackTick(client.getTickCount() + GauntletBoss.ATTACK_RATE);
				}
			}
		}
	}

	private boolean inGauntletInstance()
	{
		return Arrays.equals(client.getMapRegions(), GAUNTLET_REGION) && client.isInInstancedRegion() ||
				Arrays.equals(client.getMapRegions(), CORRUPTED_GAUNTLET_REGION) && client.isInInstancedRegion();
	}

	@Subscribe
	public void onProjectileMoved(ProjectileMoved event)
	{
		if (inGauntletInstance() && gauntletBoss != null)
		{
			Projectile projectile = event.getProjectile();
			int projectileId = projectile.getId();

			if (!gauntletBoss.isGauntletBossRangedAttack(projectileId) && !gauntletBoss.isGauntletBossMagicAttack(projectileId))
			{
				return;
			}

			// The event fires once before the projectile starts moving,
			// and we only want to check each projectile once
			if (client.getGameCycle() >= projectile.getStartMovementCycle())
			{
				return;
			}

			int ticksSinceLastAttack = client.getTickCount() - gauntletBoss.getLastAttackTick();
			log.debug(client.getTickCount() + " | Projectile | ticks since last attack: " + ticksSinceLastAttack);

			if (ticksSinceLastAttack >= 4 || gauntletBoss.getLastAttackTick() == -100)
			{
				log.debug(client.getTickCount() + " | Projectile confirmed: " + projectileId);
				gauntletBoss.setRecentProjectileId(projectile.getId());
				gauntletBoss.setLastAttackTick(client.getTickCount());
				gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() + 1);
			}
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		GameState gameState = event.getGameState();

		// Clear resource spots when a new gauntlet room is loaded
		if (gameState == GameState.LOADING)
		{
			resourceSpots.clear();
		}

		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			reset();
		}
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (inGauntletInstance())
		{
			NPC npc = event.getNpc();
			if (isNpcGauntletBoss(npc.getId()))
			{
				gauntletBoss = new GauntletBoss(npc);
			}

			if (gauntletBoss == null)
			{
				return;
			}

			if (gauntletBoss.isNpcCrystalAttack(npc.getId()))
			{
				gauntletBoss.getCrystalEffects().add(npc);
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		NPC npc = event.getNpc();
		if (isNpcGauntletBoss(npc.getId()))
		{
			reset();
		}

		if (gauntletBoss == null)
		{
			return;
		}

		if (gauntletBoss.isNpcCrystalAttack(npc.getId()))
		{
			gauntletBoss.getCrystalEffects().remove(npc);
		}
	}

	@Subscribe
	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		final GameObject gameObject = event.getGameObject();
		if (gameObject == null || !GauntletResourceSpot.getSPOTS().containsKey(gameObject.getId()))
		{
			return;
		}

		if (event.getGameObject().getId() == FISHING_SPOT_36068 && !config.showPaddlefishSpots() ||
				event.getGameObject().getId() == FISHING_SPOT_35971 && !config.showPaddlefishSpots())
		{
			return;
		}

		if (event.getGameObject().getId() == CRYSTAL_DEPOSIT && !config.showCrystalDeposits() ||
				event.getGameObject().getId() == CORRUPT_DEPOSIT && !config.showCrystalDeposits())
		{
			return;
		}

		if (event.getGameObject().getId() == GRYM_ROOT_36070 && !config.showGrymRoots() ||
				event.getGameObject().getId() == GRYM_ROOT && !config.showGrymRoots())
		{
			return;
		}

		if (event.getGameObject().getId() == PHREN_ROOTS_36066 && !config.showPhrenRoots() ||
				event.getGameObject().getId() == PHREN_ROOTS && !config.showPhrenRoots())
		{
			return;
		}

		if (event.getGameObject().getId() == LINUM_TIRINUM_36072 && !config.showLinumTirinum() ||
				event.getGameObject().getId() == LINUM_TIRINUM && !config.showLinumTirinum())
		{
			return;
		}

		resourceSpots.add(gameObject);
		inverseSortSpotDistanceFromPlayer();
	}

	@Subscribe
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		final GameObject gameObject = event.getGameObject();

		if (gameObject == null || !GauntletResourceSpot.getSPOTS().containsKey(gameObject.getId()))
		{
			return;
		}

		resourceSpots.remove(gameObject);
	}

	@Subscribe
	protected void onClientTick(ClientTick event)
	{
		if (inGauntletInstance())
		{
			checkGauntletBossAttacks();
			checkGauntletBossCrystalAttack();
		}
	}

	private void inverseSortSpotDistanceFromPlayer()
	{
		final LocalPoint cameraPoint = new LocalPoint(client.getCameraX(), client.getCameraY());
		resourceSpots.sort(Comparator.comparing(spot -> -1 * spot.getLocalLocation().distanceTo(cameraPoint)));
	}

	Color getResourceSpotColor(int gameObjectId)
	{
		switch (gameObjectId)
		{
			case FISHING_SPOT_36068:
			case FISHING_SPOT_35971:
				return config.getPaddlefishSpotColor();
			case CRYSTAL_DEPOSIT:
			case CORRUPT_DEPOSIT:
				return config.getCrystalDepositColor();
			case GRYM_ROOT_36070:
			case GRYM_ROOT:
				return config.getGrymRootColor();
			case PHREN_ROOTS_36066:
			case PHREN_ROOTS:
				return config.getPhrenRootsColor();
			case LINUM_TIRINUM_36072:
			case LINUM_TIRINUM:
				return config.getLinumTirinumColor();
			default:
				log.warn("Unknown Gauntlet resource spot with id {}", gameObjectId);
				return Color.GRAY;
		}
	}
}
