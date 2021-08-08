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
package net.sanlite.client.plugins.gauntlet;

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
import net.runelite.client.ui.overlay.OverlayManager;
import net.sanlite.client.plugins.gauntlet.id.GauntletBossId;
import net.sanlite.client.plugins.gauntlet.id.GauntletId;

import javax.inject.Inject;
import java.awt.*;
import java.util.Map;

import static java.util.Map.entry;
import static net.runelite.api.ObjectID.*;
import static net.runelite.api.Varbits.*;

@Slf4j
@PluginDescriptor(
		name = "The Gauntlet",
		description = "Assists with The Gauntlet minigame",
		tags = {"combat", "overlay", "pve", "pvm", "gauntlet", "crystal", "hunllef", "custom", "minigame", "sanlite"},
		enabledByDefault = false
)
public class GauntletPlugin extends Plugin
{
	private Map<GauntletResourceSpot, Boolean> resourceSpotEnabledConfigs;
	private Map<GauntletResourceSpot, Color> resourceSpotColorConfigs;

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
	@Getter
	private Gauntlet gauntlet;

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
		resourceSpotEnabledConfigs = Map.ofEntries(
				entry(GauntletResourceSpot.PADDLEFISH, config.showPaddlefishSpots()),
				entry(GauntletResourceSpot.CRYSTAL_DEPOSIT, config.showCrystalDeposits()),
				entry(GauntletResourceSpot.GRYM_ROOT, config.showGrymRoots()),
				entry(GauntletResourceSpot.PHREN_ROOTS, config.showPhrenRoots()),
				entry(GauntletResourceSpot.LINUM_TIRINUM, config.showLinumTirinum())
		);

		resourceSpotColorConfigs = Map.ofEntries(
				entry(GauntletResourceSpot.PADDLEFISH, config.getPaddlefishSpotColor()),
				entry(GauntletResourceSpot.CRYSTAL_DEPOSIT, config.getCrystalDepositColor()),
				entry(GauntletResourceSpot.GRYM_ROOT, config.getGrymRootColor()),
				entry(GauntletResourceSpot.PHREN_ROOTS, config.getPhrenRootsColor()),
				entry(GauntletResourceSpot.LINUM_TIRINUM, config.getLinumTirinumColor())
		);

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
		if (!event.getGroup().equals(GauntletConfig.GROUP))
		{
			return;
		}

		for (GauntletResourceSpot resourceSpot : GauntletResourceSpot.values())
		{
			if (resourceSpotEnabledConfigs.get(resourceSpot))
			{
				gauntlet.resourceSpotDisabled(resourceSpot);
			}
		}

		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		} else if (!config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
	}

	private void reset()
	{
		gauntlet = null;
		log.debug("Gauntlet session reset");

		gauntletBoss = null;
	}

	private void checkGauntletStatus()
	{
		boolean isGauntletEntered = Gauntlet.isGauntletEntered(client.getVar(GAUNTLET_ENTERED));
		if (gauntlet != null && !isGauntletEntered)
		{
			reset();
		} else if (gauntlet == null && isGauntletEntered)
		{
			gauntlet = new Gauntlet();
			log.debug("Gauntlet session started");
		}
	}

	@Subscribe
	protected void onVarbitChanged(VarbitChanged event)
	{
		if (!GauntletId.inGauntletRegion(client.getMapRegions(), client.isInInstancedRegion()))
		{
			return;
		}

		checkGauntletStatus();

		if (gauntlet == null)
		{
			return;
		}

		gauntlet.checkFinalRoomEntered(client.getVar(GAUNTLET_FINAL_ROOM_ENTERED));
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		GameState gameState = event.getGameState();

		// Clear resource spots when a new gauntlet room is loaded
		if (gameState == GameState.LOADING && gauntlet != null)
		{
			gauntlet.newRoomLoading();
		}

		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			reset();
		}
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		if (!GauntletId.inGauntletRegion(client.getMapRegions(), client.isInInstancedRegion()) || gauntletBoss == null)
		{
			return;
		}

//		int animationId = event.getActor().getAnimation();
//		if (!alchemicalHydra.isAlchemicalHydraAnimation(animationId))
//		{
//			return;
//		}
//
//		// Phase switch
//		if (alchemicalHydra.isPhaseSwitchAnimation(animationId))
//		{
//			alchemicalHydra.checkAlchemicalHydraPhaseSwitch(animationId, client.getTickCount());
//			return;
//		}
//
//		// Special attacks
//		if (alchemicalHydra.getAttacksUntilSpecialAttack() == 0 && alchemicalHydra.isSpecialAttackAnimation(animationId))
//		{
//			alchemicalHydra.onSpecialAttack(animationId, client.getTickCount());
//			return;
//		}
//
//		// Allow the second part of the fire special attack
//		if (animationId == AnimationID.ALCHEMICAL_HYDRA_RED_PHASE_FIRE_ATTACK)
//		{
//			alchemicalHydra.onSpecialAttack(animationId, client.getTickCount());
//			return;
//		}
//
//		// Regular attacks
//		if (alchemicalHydra.isRegularAttackAnimation(animationId))
//		{
//			alchemicalHydra.onAttack(animationId, client.getTickCount(), false);
//		}
	}

//	/**
//	 * Checks if the gauntlets boss recent projectile id matches an attack style.
//	 * If this is true onGauntletBossAttack is called and the remainingProjectileCount is
//	 * reduced by 1 to prevent more function calls than attacks fired.
//	 */
//	private void checkGauntletBossAttacks()
//	{
//		if (gauntletBoss != null)
//		{
//			int recentProjectileId = gauntletBoss.getRecentProjectileId();
//
//			if (recentProjectileId != -1 && gauntletBoss.getRemainingProjectileCount() > 0)
//			{
//				switch (recentProjectileId)
//				{
//					case GauntletBossId.Proj.MAGIC:
//					case ProjectileID.CORRUPTED_HUNLLEF_MAGIC_ATTACK:
//						log.debug("onAttack magic: " + gauntletBoss.getRemainingProjectileCount());
//						gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() - 1);
//						gauntletBoss.basicAttack(GauntletBoss.AttackStyle.MAGIC, client.getTickCount());
//						break;
//					case ProjectileID.CRYSTALLINE_HUNLLEF_DISABLE_PRAYERS_ATTACK:
//					case ProjectileID.CORRUPTED_HUNLLEF_DISABLE_PRAYERS_ATTACK:
//						log.debug("onAttack magic disable prayers: " + gauntletBoss.getRemainingProjectileCount());
//						gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() - 1);
//						gauntletBoss.basicAttack(GauntletBoss.AttackStyle.MAGIC, client.getTickCount());
//						break;
//					case ProjectileID.CRYSTALLINE_HUNLLEF_RANGED_ATTACK:
//					case ProjectileID.CORRUPTED_HUNLLEF_RANGED_ATTACK:
//						log.debug("onAttack ranged: " + gauntletBoss.getRemainingProjectileCount());
//						gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() - 1);
//						gauntletBoss.basicAttack(GauntletBoss.AttackStyle.RANGED, client.getTickCount());
//						break;
//					default:
//						log.warn("Unreachable default case for checkGauntletBossAttacks | projectile id: {}", recentProjectileId);
//				}
//			}
//		}
//	}

//	private void checkGauntletBossCrystalAttack()
//	{
//		if (gauntletBoss != null)
//		{
//			int animationId = gauntletBoss.getNpc().getAnimation();
//			if (animationId != gauntletBoss.getLastTickAnimation())
//			{
//				int ticksSinceLastAttack = client.getTickCount() - gauntletBoss.getLastAttackTick();
//				if (animationId == AnimationID.HUNLLEF_SUMMON_CRYSTAL_NPC && ticksSinceLastAttack >= 4)
//				{
//					log.debug("onAttack crystal");
//					gauntletBoss.setAttacksUntilSwitch(gauntletBoss.getAttacksUntilSwitch() - 1);
//					gauntletBoss.checkAttackStyleSwitch(gauntletBoss.getCurrentAttackStyle());
//					gauntletBoss.setLastAttackTick(client.getTickCount());
//					gauntletBoss.setNextAttackTick(client.getTickCount() + GauntletBoss.ATTACK_RATE);
//				}
//			}
//		}
//	}

//	@Subscribe
//	public void onProjectileMoved(ProjectileMoved event)
//	{
//		if (inGauntletInstance() && gauntletBoss != null)
//		{
//			Projectile projectile = event.getProjectile();
//			int projectileId = projectile.getId();
//
//			if (!gauntletBoss.isGauntletBossRangedAttack(projectileId) && !gauntletBoss.isGauntletBossMagicAttack(projectileId))
//			{
//				return;
//			}
//
//			// The event fires once before the projectile starts moving,
//			// and we only want to check each projectile once
//			if (client.getGameCycle() >= projectile.getStartMovementCycle())
//			{
//				return;
//			}
//
//			int ticksSinceLastAttack = client.getTickCount() - gauntletBoss.getLastAttackTick();
//			log.debug(client.getTickCount() + " | Projectile | ticks since last attack: " + ticksSinceLastAttack);
//
//			if (ticksSinceLastAttack >= 4 || gauntletBoss.getLastAttackTick() == -100)
//			{
//				log.debug(client.getTickCount() + " | Projectile confirmed: " + projectileId);
//				gauntletBoss.setRecentProjectileId(projectile.getId());
//				gauntletBoss.setLastAttackTick(client.getTickCount());
//				gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() + 1);
//			}
//		}
//	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (GauntletId.inGauntletRegion(client.getMapRegions(), client.isInInstancedRegion()))
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

			if (GauntletBossId.isCrystalNpc(npc.getId()))
			{
				gauntletBoss.crystalSpawned(npc);
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

		if (GauntletBossId.isCrystalNpc(npc.getId()))
		{
			gauntletBoss.crystalDespawned(npc);
		}
	}

	@Subscribe
	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		if (gauntlet == null)
		{
			return;
		}

		final GameObject gameObject = event.getGameObject();
		if (gameObject == null || !GauntletResourceSpot.getSPOTS().containsKey(gameObject.getId()))
		{
			return;
		}

		for (GauntletResourceSpot resourceSpot : GauntletResourceSpot.values())
		{
			if (GauntletResourceSpot.isResourceSpot(gameObject.getId(), resourceSpot) && resourceSpotEnabledConfigs.get(resourceSpot))
			{
				return;
			}
		}

		gauntlet.resourceSpotSpawned(gameObject, client.getCameraX(), client.getCameraY());
	}

	@Subscribe
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		if (gauntlet == null)
		{
			return;
		}

		final GameObject gameObject = event.getGameObject();

		if (gameObject == null || !GauntletResourceSpot.getSPOTS().containsKey(gameObject.getId()))
		{
			return;
		}

		gauntlet.resourceSpotDespawned(gameObject);
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
