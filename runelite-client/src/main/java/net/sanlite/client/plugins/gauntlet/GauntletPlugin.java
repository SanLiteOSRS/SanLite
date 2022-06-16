/*
 * Copyright (c) 2021, Siraz <https://github.com/Sirazzz>
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

import com.google.common.collect.ImmutableSet;
import com.google.inject.Provides;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.callback.Hooks;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ImageUtil;
import net.sanlite.client.game.SoundManager;
import net.sanlite.client.plugins.gauntlet.event.BossAttackStyleSwitched;
import net.sanlite.client.plugins.gauntlet.event.DemiBossDespawned;
import net.sanlite.client.plugins.gauntlet.event.DemiBossSpawned;
import net.sanlite.client.plugins.gauntlet.event.GauntletEvent;
import net.sanlite.client.plugins.gauntlet.id.GauntletBossId;
import net.sanlite.client.plugins.gauntlet.id.GauntletId;
import net.sanlite.client.plugins.gauntlet.id.GauntletNpc;
import net.sanlite.client.util.SoundUtil;

import javax.inject.Inject;
import javax.sound.sampled.Clip;
import java.awt.image.BufferedImage;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

import static net.runelite.api.Varbits.*;

@Slf4j
@PluginDescriptor(
		name = "The Gauntlet",
		description = "Assists with the Gauntlet minigame",
		tags = {"combat", "overlay", "pve", "pvm", "gauntlet", "crystal", "hunllef", "custom", "minigame", "sanlite"},
		enabledByDefault = false
)
public class GauntletPlugin extends Plugin
{
	private final Clip magicAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "magic.wav");
	private final Clip rangedAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "ranged.wav");
	private final Clip crystalAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "crystal.wav");
	private final Clip prayerDisabledAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "prayer_disabled.wav");
	private final Clip overheadSwitchAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "switch_weapon.wav");
	private final Clip playerDeathAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "player_death.wav");

	private final BufferedImage rangedStyleIcon = ImageUtil.loadImageResource(GauntletPlugin.class, "ranged_25.png");
	private final BufferedImage magicStyleIcon = ImageUtil.loadImageResource(GauntletPlugin.class, "magic_25.png");
	private final BufferedImage rangedOverheadIcon = ImageUtil.loadImageResource(GauntletPlugin.class, "protect_ranged.png");
	private final BufferedImage magicOverheadIcon = ImageUtil.loadImageResource(GauntletPlugin.class, "protect_magic.png");
	private final BufferedImage meleeOverheadIcon = ImageUtil.loadImageResource(GauntletPlugin.class, "protect_melee.png");

	private final Set<String> hiddenDeadNpcNames = ImmutableSet.of(
			"Crystalline rat",
			"Crystalline spider",
			"Crystalline bat",
			"Crystalline unicorn",
			"Crystalline scorpion",
			"Crystalline wolf",
			"Crystalline bear",
			"Crystalline dragon",
			"Crystalline dark beast",
			"Corrupted rat",
			"Corrupted spider",
			"Corrupted bat",
			"Corrupted unicorn",
			"Corrupted scorpion",
			"Corrupted wolf",
			"Corrupted bear",
			"Corrupted dragon",
			"Corrupted dark beast"
	);
	private final Set<Integer> bigTreeGameObjects = ImmutableSet.of(
			NullObjectID.NULL_36100,
			NullObjectID.NULL_35997
	);
	private final Set<Integer> gauntletWallObjects = ImmutableSet.of(
			NullObjectID.NULL_35995,
			NullObjectID.NULL_35996,
			ObjectID.ILLUMINATED_SYMBOL,
			ObjectID.INACTIVE_SYMBOL,
			NullObjectID.NULL_36000,
			NullObjectID.NULL_36001,
			ObjectID.ILLUMINATED_SYMBOL_36095,
			ObjectID.INACTIVE_SYMBOL_36097,
			NullObjectID.NULL_36098,
			NullObjectID.NULL_36099,
			NullObjectID.NULL_36103,
			NullObjectID.NULL_36104
	);

	@Inject
	private Client client;

	@Inject
	private GauntletConfig config;
	private final Hooks.RenderableDrawListener gauntletNPCDrawListener = this::shouldDrawGauntletNPC;
	@Inject
	private OverlayManager overlayManager;
	@Inject
	private GauntletBossOverlay bossOverlay;
	@Inject
	private GauntletBossProtectionPrayOverlay bossProtectionPrayOverlay;
	@Inject
	private GauntletBossFixedAttackOverlay gauntletFixedAttackOverlay;
	@Inject
	private GauntletBossFixedProtectOverlay gauntletFixedProtectOverlay;
	@Inject
	private GauntletEnvironmentOverlay environmentOverlay;
	@Inject
	private GauntletEnvironmentMinimapOverlay environmentMinimapOverlay;
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
	@Inject
	private Hooks hooks;

	@Provides
	GauntletConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GauntletConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(bossOverlay);
		overlayManager.add(bossProtectionPrayOverlay);
		overlayManager.add(gauntletFixedAttackOverlay);
		overlayManager.add(gauntletFixedProtectOverlay);
		overlayManager.add(environmentOverlay);
		overlayManager.add(environmentMinimapOverlay);
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}

		clientThread.invoke(this::reset);
	}

	@Override
	protected void shutDown() throws Exception
	{
		clientThread.invoke(this::reset);
		overlayManager.remove(bossOverlay);
		overlayManager.remove(bossProtectionPrayOverlay);
		overlayManager.remove(gauntletFixedAttackOverlay);
		overlayManager.remove(gauntletFixedProtectOverlay);
		overlayManager.remove(environmentOverlay);
		overlayManager.remove(environmentMinimapOverlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals(GauntletConfig.GROUP))
		{
			return;
		}

		switch (event.getKey())
		{
			case "hideNpcDeathAnimations":
				if (gauntlet == null)
				{
					return;
				}

				if (config.hideNpcDeathAnimations())
				{
					if (gauntlet == null)
					{
						break;
					}

					hooks.registerRenderableDrawListener(gauntletNPCDrawListener);
					break;
				}

				hooks.unregisterRenderableDrawListener(gauntletNPCDrawListener);
				break;
			case "hideBigTreeObjects":
				if (gauntlet == null)
				{
					return;
				}

				if (config.hideBigTreeObjects())
				{
					clientThread.invoke(() -> bigTreeGameObjects.forEach((id) -> client.getScene().hideGameObjectId(id)));
					break;
				}

				clientThread.invoke(() -> bigTreeGameObjects.forEach((id) -> client.getScene().unhideGameObjectId(id)));
				break;
			case "hideWallObjects":
				if (gauntlet == null)
				{
					return;
				}

				if (config.hideWallObjects())
				{
					clientThread.invoke(() -> gauntletWallObjects.forEach((id) -> client.getScene().hideGameObjectId(id)));
					break;
				}

				clientThread.invoke(() -> gauntletWallObjects.forEach((id) -> client.getScene().unhideGameObjectId(id)));
				break;
			case "highlightBearDemiBoss":
			case "highlightDragonDemiBoss":
			case "highlightDarkBeastDemiBoss":
				if (gauntlet == null)
				{
					return;
				}

				if (!Boolean.parseBoolean(event.getNewValue()))
				{
					client.clearHintArrow();
				}

				break;
			case "showDebugOverlay":
				if (config.showDebugOverlay())
				{
					overlayManager.add(debugOverlay);
					break;
				}

				overlayManager.remove(debugOverlay);
				break;
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
		hooks.unregisterRenderableDrawListener(gauntletNPCDrawListener);

		if (config.hideBigTreeObjects())
		{
			bigTreeGameObjects.forEach((id) -> client.getScene().unhideGameObjectId(id));
		}

		if (config.hideWallObjects())
		{
			gauntletWallObjects.forEach((id) -> client.getScene().unhideGameObjectId(id));
		}

		log.debug("Gauntlet session reset");
	}

	private void updateGauntletStatus(boolean inGauntlet)
	{
		if (gauntlet != null && !inGauntlet)
		{
			reset();
		}
		else if (gauntlet == null && inGauntlet)
		{
			gauntlet = new Gauntlet(this::onGauntletEvent);

			if (config.hideNpcDeathAnimations())
			{
				hooks.registerRenderableDrawListener(gauntletNPCDrawListener);
			}

			if (config.hideBigTreeObjects())
			{
				clientThread.invoke(() -> bigTreeGameObjects.forEach((id) -> client.getScene().hideGameObjectId(id)));
			}

			if (config.hideWallObjects())
			{
				clientThread.invoke(() -> gauntletWallObjects.forEach((id) -> client.getScene().hideGameObjectId(id)));
			}
			log.debug("Gauntlet session started");
		}
	}

	@Subscribe
	protected void onVarbitChanged(VarbitChanged event)
	{
		if (gauntlet == null)
		{
			return;
		}

		gauntlet.checkFinalRoomEntered(client.getVarbitValue(GAUNTLET_FINAL_ROOM_ENTERED));
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		GameState gameState = event.getGameState();

		// Clear resource spots when a new gauntlet room is loaded
		if (gameState == GameState.LOADING)
		{
			boolean inGauntlet = GauntletId.inGauntletRegion(client.getMapRegions(), client.isInInstancedRegion());
			if (inGauntlet && gauntlet != null)
			{
				gauntlet.newRoomLoading();
				return;
			}

			updateGauntletStatus(inGauntlet);
			return;
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

		gauntlet.onProjectile(projectileId, client.getTickCount());
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (gauntlet == null)
		{
			return;
		}

		NPC npc = event.getNpc();
		if (GauntletBossId.isBossNpc(npc.getId()))
		{
			gauntlet.bossSpawned(npc);
			return;
		}

		if (GauntletNpc.isDemiBoss(npc.getId()))
		{
			gauntlet.demiBossSpawned(npc);
			return;
		}

		if (gauntlet.getBoss() == null)
		{
			return;
		}

		if (GauntletBossId.isCrystalNpc(npc.getId()))
		{
			int tickCount = client.getTickCount();
			gauntlet.getBoss().crystalSpawned(npc, tickCount);
			log.debug("Crystal spawned at tick: {}", tickCount);
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
			return;
		}

		if (GauntletNpc.isDemiBoss(npc.getId()))
		{
			gauntlet.demiBossDespawned(npc);
			return;
		}

		if (gauntlet.getBoss() == null)
		{
			return;
		}

		if (GauntletBossId.isCrystalNpc(npc.getId()))
		{
			gauntlet.getBoss().crystalDespawned(npc);
			log.debug("Crystal despawned at tick: {}", client.getTickCount());
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
		if (gameObject == null)
		{
			return;
		}

		if (GauntletResourceSpot.matches(gameObject.getId()))
		{
			gauntlet.resourceSpotSpawned(gameObject);
			return;
		}

		if (GauntletUtilitySpot.matches(gameObject.getId()))
		{
			gauntlet.utilitySpotSpawned(gameObject);
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
		if (gameObject == null)
		{
			return;
		}

		if (GauntletResourceSpot.matches(gameObject.getId()))
		{
			gauntlet.resourceSpotDespawned(gameObject);
			return;
		}

		if (GauntletUtilitySpot.matches(gameObject.getId()))
		{
			gauntlet.utilitySpotDespawned(gameObject);
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (gauntlet == null || gauntlet.getBoss() == null)
		{
			return;
		}

		gauntlet.getBoss().checkProtectionPrayer(client.getTickCount(), gauntlet.isInBossRoom());
	}

	/**
	 * Handles events emitted in the gauntlet
	 *
	 * @param event gauntlet event
	 */
	private void onGauntletEvent(GauntletEvent event)
	{
		switch (event.getType())
		{
			case ATTACK_STYLE_SWITCHED:
				GauntletBoss.AttackStyle newAttackStyle = ((BossAttackStyleSwitched) event).getNewAttackStyle();
				playSoundIfEnabled(getAudioClipForAttackStyle(newAttackStyle), config.playSoundOnAttackStyleSwitch());
				log.debug("{} | Playing attack style switch sound for: {}", client.getTickCount(), newAttackStyle);
				break;
			case PROTECTION_PRAYER_SWITCHED:
				playSoundIfEnabled(overheadSwitchAudioClip, config.playSoundOnOverheadSwitch(), true);
				log.debug("{} | Playing prot prayer switched sound", client.getTickCount());
				break;
			case CRYSTAL_ATTACK:
				playSoundIfEnabled(crystalAudioClip, config.playSoundOnCrystalAttack());
				log.debug("{} | Playing crystal attack sound", client.getTickCount());
				break;
			case PLAYER_PRAYER_DISABLED:
				playSoundIfEnabled(prayerDisabledAudioClip, config.playSoundOnDisablePrayerAttack());
				log.debug("{} | Playing prayer disabled sound", client.getTickCount());
				break;
			case PLAYER_DEATH:
				playSoundIfEnabled(playerDeathAudioClip, config.playSoundOnPlayerDeath());
				break;
			case DEMI_BOSS_SPAWNED:
				DemiBossSpawned demiBossSpawned = ((DemiBossSpawned) event);
				NPC demiBoss = demiBossSpawned.getNpc();
				if (isHighlightEnabledForDemiBoss(demiBoss.getId()))
				{
					client.setHintArrow(demiBossSpawned.getWorldLocation());
				}
				break;
			case DEMI_BOSS_DESPAWNED:
				NPC despawnedDemiBoss = ((DemiBossDespawned) event).getNpc();
				log.debug("Demi boss despawned: {}", despawnedDemiBoss.getId());
				if (isHighlightEnabledForDemiBoss(despawnedDemiBoss.getId()))
				{
					log.debug("Demi boss despawned: {}, arrow cleared", despawnedDemiBoss.getId());
					client.clearHintArrow();
				}
				break;
			case BOSS_ROOM_ENTERED:
				client.clearHintArrow();
				break;
			default:
				log.warn("Unknown gauntlet event: {}", event.getType());
		}
	}

	boolean isHighlightEnabledForDemiBoss(int npcId)
	{
		return (GauntletNpc.isMeleeDemiBoss(npcId) && config.highlightBearDemiBoss()) ||
				(GauntletNpc.isRangedDemiBoss(npcId) && config.highlightDarkBeastDemiBoss()) ||
				(GauntletNpc.isMagicDemiBoss(npcId) && config.highlightDragonDemiBoss());
	}

	private void playSoundIfEnabled(Clip soundClip, boolean isConfigEnabled, boolean shouldPlayLater)
	{
		if (!isConfigEnabled)
		{
			return;
		}

		if (shouldPlayLater)
		{
			scheduledExecutorService.submit(() -> soundManager.playClipLater(soundClip));
			return;
		}

		scheduledExecutorService.submit(() -> soundManager.playClip(soundClip));
	}

	private void playSoundIfEnabled(Clip soundClip, boolean isConfigEnabled)
	{
		playSoundIfEnabled(soundClip, isConfigEnabled, false);
	}

	BufferedImage getAttackStyleIcon(GauntletBoss.AttackStyle attackStyle)
	{
		switch (attackStyle)
		{
			case RANGED:
				return rangedStyleIcon;
			case MAGIC:
				return magicStyleIcon;
		}
		return null;
	}

	BufferedImage getProtectionPrayerIcon(GauntletBoss.ProtectionPrayer protectionPrayer)
	{
		switch (protectionPrayer)
		{
			case RANGED:
				return rangedOverheadIcon;
			case MAGIC:
				return magicOverheadIcon;
			case MELEE:
				return meleeOverheadIcon;
		}
		return null;
	}

	boolean shouldDrawGauntletNPC(Renderable renderable, boolean drawingUI)
	{
		if (!config.hideNpcDeathAnimations())
		{
			return true;
		}

		if (renderable instanceof NPC)
		{
			NPC npc = (NPC) renderable;
			if (hiddenDeadNpcNames.stream().anyMatch((name) -> name.equalsIgnoreCase(npc.getName())))
			{
				return !npc.isDead();
			}
		}

		return true;
	}
}
