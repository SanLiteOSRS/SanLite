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
package net.runelite.client.plugins.vorkath;

import com.google.inject.Provides;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.Notifier;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.Arrays;

@Slf4j
@PluginDescriptor(
		name = "Vorkath",
		description = "Helps with Vorkath's various encounter mechanics",
		tags = {"combat", "overlay", "pve", "pvm", "vorkath", "ds2", "boss", "slayer", "dragon"},
		type = PluginType.SANLITE_USE_AT_OWN_RISK
)
public class VorkathPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private VorkathConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private Notifier notifier;

	@Inject
	private VorkathOverlay overlay;

	@Inject
	private VorkathDebugOverlay debugOverlay;

	@Inject
	private ClientThread clientThread;

	@com.google.inject.Inject
	private ClientUI clientUI;

	@Getter
	private Vorkath vorkath;

	@Provides
	VorkathConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(VorkathConfig.class);
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
		vorkath = null;
	}

	private boolean inVorkathInstance()
	{
		return Arrays.equals(client.getMapRegions(), Vorkath.VORKATH_REGION) && client.isInInstancedRegion();
	}

	private boolean validateInstanceAndNpc()
	{
		return Arrays.equals(client.getMapRegions(), Vorkath.VORKATH_REGION) && client.isInInstancedRegion() &&
				vorkath != null;
	}

	private void checkVorkathSpecialAttack(int projectileId)
	{
		if (config.notifyOnlyOutOfFocus() && clientUI.isFocused())
		{
			return;
		}

		switch (projectileId)
		{
			case ProjectileID.VORKATH_FIREBOMB:
				if (config.notifyOnFirebomb())
					notifier.notify("Vorkath launched a firebomb!");
				break;
			case ProjectileID.VORKATH_ICE_BREATH:
				if (vorkath.getRecentProjectileId() == ProjectileID.VORKATH_ICE_BREATH)
				{
					log.debug("Spawn notification already sent, last projectile id: {}", vorkath.getRecentProjectileId());
					return;
				}
				log.debug("Sending spawn notification: {} id: {}", config.notifyOnZombifiedSpawn(), vorkath.getRecentProjectileId());
				if (config.notifyOnZombifiedSpawn())
					notifier.notify("Vorkath is about to summon a zombified spawn!");
				break;
		}
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (inVorkathInstance())
		{
			NPC npc = event.getNpc();
			if (Vorkath.isNpcVorkath(npc.getId()))
			{
				vorkath = new Vorkath(npc);
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		if (Vorkath.isNpcVorkath(event.getNpc().getId()))
		{
			reset();
		}
	}

	@Subscribe
	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		if (!validateInstanceAndNpc())
		{
			return;
		}
		vorkath.addAcidPoolObject(event.getGameObject());
	}

	@Subscribe
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		if (!validateInstanceAndNpc())
		{
			return;
		}
		vorkath.removeAcidPoolObject(event.getGameObject());
	}

	@Subscribe
	public void onProjectileMoved(ProjectileMoved event)
	{
		if (!validateInstanceAndNpc())
		{
			return;
		}

		Projectile projectile = event.getProjectile();
		int projectileId = projectile.getId();

		if (!vorkath.isVorkathProjectile(projectileId))
		{
			return;
		}

		int ticksSinceLastAttack = client.getTickCount() - vorkath.getLastAttackTick();
		if (ticksSinceLastAttack < Vorkath.ATTACK_RATE - 1 && vorkath.getLastAttackTick() != -100)
		{
			return;
		}

		if (vorkath.isVorkathSpecialProjectile(projectileId))
		{
			checkVorkathSpecialAttack(projectileId);
		}

		if (vorkath.isVorkathRegularAttackProjectile(projectileId))
		{
			vorkath.onRegularAttack(client.getTickCount());
		}

		log.debug("Set recent projectile id: {}", projectileId);
		vorkath.setRecentProjectileId(projectile.getId());
		vorkath.setLastAttackTick(client.getTickCount());
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		if (!(event.getActor() instanceof NPC))
		{
			return;
		}

		NPC npc = (NPC) event.getActor();
		if (!Vorkath.isNpcVorkath(npc.getId()))
		{
			return;
		}

		int animationId = npc.getAnimation();
		switch (animationId)
		{
			case AnimationID.VORKATH_WAKE_UP:
				vorkath.setAwake(true);
				break;
			case AnimationID.VORKATH_DEATH:
				vorkath.resetFight();
				break;
			case AnimationID.VORKATH_SLASH_ATTACK:
				log.debug("Vorkath slash attack {}", client.getTickCount());
				vorkath.onRegularAttack(client.getTickCount());
				break;
		}

	}
}
