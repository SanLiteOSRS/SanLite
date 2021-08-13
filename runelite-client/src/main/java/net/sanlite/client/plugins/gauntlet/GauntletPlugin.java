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
import net.sanlite.client.game.SoundManager;
import net.sanlite.client.plugins.gauntlet.id.GauntletBossId;
import net.sanlite.client.plugins.gauntlet.id.GauntletId;
import net.sanlite.client.util.SoundUtil;

import javax.inject.Inject;
import javax.sound.sampled.Clip;
import java.awt.*;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

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
	private final Clip magicAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "magic.wav");
	private final Clip rangedAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "ranged.wav");
	private final Clip disablePrayerAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "prayer_disabled.wav");
	private final Clip overheadSwitchAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "overhead_switch.wav");

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
	private GauntletProtectedStyleOverlay protectedStyleOverlay;

	@Inject
	private GauntletResourceSpotOverlay resourceSpotOverlay;

	@Inject
	private GauntletResourceSpotMinimapOverlay resourceSpotMinimapOverlay;

	@Inject
	private GauntletDebugOverlay debugOverlay;

	@Inject
	private ClientThread clientThread;

	@Inject
	private ScheduledExecutorService scheduledExecutorService;

	@Inject
	private SoundManager soundManager;

	@Getter
	private Gauntlet gauntlet;

	private NPC cachedBossNpc;

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
		overlayManager.add(protectedStyleOverlay);
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
		overlayManager.remove(protectedStyleOverlay);
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
		}
		else if (!config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
	}

	private Clip getAudioClipForAttackStyle(GauntletBoss.AttackStyle attackStyle)
	{
		switch (attackStyle)
		{
			case RANGED:
				return rangedAudioClip;
			case MAGIC:
				return magicAudioClip;
			default:
				return null;
		}
	}

	private void reset()
	{
		gauntlet = null;
		cachedBossNpc = null;
		log.debug("Gauntlet session reset");
	}

	private void updateGauntletStatus()
	{
		boolean isGauntletEntered = Gauntlet.isGauntletEntered(client.getVar(GAUNTLET_ENTERED));
		if (gauntlet != null && !isGauntletEntered)
		{
			reset();
		}
		else if (gauntlet == null && isGauntletEntered)
		{
			Player player = client.getLocalPlayer();
			if (player == null)
			{
				return;
			}

			gauntlet = new Gauntlet(player, cachedBossNpc,
					(attackStyle) -> playAttackStyleSwitchSound(attackStyle, config.playSoundOnAttackStyleSwitch()));
			cachedBossNpc = null;
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

		updateGauntletStatus();
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
		if (gauntlet == null)
		{
			return;
		}

		int animationId = event.getActor().getAnimation();
		if (!GauntletId.isGauntletAnimation(animationId))
		{
			return;
		}

		if (!gauntlet.isInBossRoom())
		{
			return;
		}

		gauntlet.onAnimation(event.getActor(), animationId, client.getTickCount());
	}

	@Subscribe
	public void onProjectileSpawned(ProjectileSpawned event)
	{
		if (gauntlet == null)
		{
			return;
		}

		int projectileId = event.getProjectile().getId();
		if (!GauntletBossId.isBossProjectile(projectileId))
		{
			return;
		}

		gauntlet.onProjectile(projectileId, client.getTickCount(),
				() -> playSoundIfEnabled(disablePrayerAudioClip, config.playSoundOnDisablePrayerAttack()));
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (gauntlet == null && GauntletBossId.isBossNpc(event.getNpc().getId()))
		{
			cachedBossNpc = event.getNpc();
			log.debug("Cached boss spawn: {}", event.getNpc().getId());
		}

		if (gauntlet == null)
		{
			return;
		}

		NPC npc = event.getNpc();
		if (GauntletBossId.isBossNpc(npc.getId()))
		{
			gauntlet.bossSpawned(npc);
		}

		if (gauntlet.getGauntletBoss() == null)
		{
			return;
		}

		if (GauntletBossId.isCrystalNpc(npc.getId()))
		{
			gauntlet.getGauntletBoss().crystalSpawned(npc);
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		if (gauntlet == null)
		{
			return;
		}

		NPC npc = event.getNpc();
		if (GauntletBossId.isBossNpc(npc.getId()))
		{
			gauntlet.bossDespawned();
		}

		if (gauntlet.getGauntletBoss() == null)
		{
			return;
		}

		if (GauntletBossId.isCrystalNpc(npc.getId()))
		{
			gauntlet.getGauntletBoss().crystalDespawned(npc);
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
//				log.debug("Gauntlet resource spot spawned: {}", gameObject.getId());
				gauntlet.resourceSpotSpawned(gameObject, client.getCameraX(), client.getCameraY());
			}
		}

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

//		log.debug("Gauntlet resource spot despawned: {}", gameObject.getId());
		gauntlet.resourceSpotDespawned(gameObject);
	}

	// TODO: Create callback event handler

	@Subscribe
	public void onHitsplatApplied(HitsplatApplied event)
	{
		if (gauntlet == null || gauntlet.getGauntletBoss() == null)
		{
			return;
		}

		final Actor actor = event.getActor();
		if (actor instanceof NPC && GauntletBossId.isBossNpc(((NPC) actor).getId()))
		{
			log.debug("Hitsplat applied on gauntlet boss at tick: {}", client.getTickCount());
			gauntlet.getGauntletBoss().checkProtectedStyle(client.getTickCount());
		}

//
//		log.debug("NPC {} changed overhead from {} to {}", npcComposition.getId(), event.getOldOverheadIcon(), overheadIcon);
//		if (GauntletBossId.isBossNpc(npcComposition.getId()))
//		{
//			gauntlet.getGauntletBoss().switchProtectedStyle(overheadIcon);
//			playSoundIfEnabled(overheadSwitchAudioClip, config.playSoundOnOverheadSwitch());
//		}
	}

	// TODO: use colors config map
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
				log.warn("Unknown gauntlet resource spot with id {}", gameObjectId);
				return Color.GRAY;
		}
	}

	private void playAttackStyleSwitchSound(GauntletBoss.AttackStyle attackStyle, boolean isConfigEnabled)
	{
		playSoundIfEnabled(getAudioClipForAttackStyle(attackStyle), isConfigEnabled);
	}

	private void playSoundIfEnabled(Clip soundClip, boolean isConfigEnabled)
	{
		if (!isConfigEnabled)
		{
			return;
		}

		scheduledExecutorService.submit(() -> soundManager.playCustomSound(soundClip));
	}
}
