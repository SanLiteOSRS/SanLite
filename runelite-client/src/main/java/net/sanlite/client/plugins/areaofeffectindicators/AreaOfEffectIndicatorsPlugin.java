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
package net.sanlite.client.plugins.areaofeffectindicators;

import com.google.inject.Provides;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.*;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@PluginDescriptor(
		name = "Area of Effect Indicators",
		description = "Highlights the target tiles for area of effect projectiles",
		tags = {"aoe", "projectile", "highlight", "pvm", "overlay", "boss", "encounter", "tile", "sanlite"},
		enabledByDefault = false
)
@Slf4j
public class AreaOfEffectIndicatorsPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private AreaOfEffectIndicatorsConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private AreaOfEffectIndicatorsOverlay overlay;

	@Inject
	private AreaOfEffectIndicatorsDebugOverlay debugOverlay;

	@Getter
	private List<AreaOfEffectProjectile> areaOfEffectProjectiles;

	@Getter
	private List<AreaOfEffectGameObject> areaOfEffectGameObjects;

	@Getter
	private List<AreaOfEffectGraphicsObject> areaOfEffectGraphicsObjects;

	@Getter
	private AreaOfEffectConfig aoeConfig;

	@Provides
	AreaOfEffectIndicatorsConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(AreaOfEffectIndicatorsConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
		areaOfEffectProjectiles = new CopyOnWriteArrayList<>();
		areaOfEffectGameObjects = new CopyOnWriteArrayList<>();
		areaOfEffectGraphicsObjects = new CopyOnWriteArrayList<>();

		aoeConfig = new AreaOfEffectConfig(config);
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		areaOfEffectProjectiles = null;
		areaOfEffectGameObjects = null;
		areaOfEffectGraphicsObjects = null;

		aoeConfig = null;
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals(AreaOfEffectIndicatorsConfig.GROUP_NAME))
		{
			return;
		}

		if (event.getKey().equals("showDebugOverlay"))
		{
			if (Boolean.parseBoolean(event.getNewValue()))
			{
				overlayManager.add(debugOverlay);
				return;
			}

			overlayManager.remove(debugOverlay);
			return;
		}

		log.debug("Reinitializing AoE object config. Config value changed: {}", event.getKey());
		aoeConfig = new AreaOfEffectConfig(config);
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		GameState gameState = event.getGameState();
		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			areaOfEffectProjectiles.clear();
			areaOfEffectGameObjects.clear();
		}

		// Clear AoE objects on new area load (i.e. going up a ladder)
		if (gameState == GameState.LOADING)
		{
			areaOfEffectGameObjects.clear();
			areaOfEffectGraphicsObjects.clear();
		}
	}

	@Subscribe
	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		GameObject gameObject = event.getGameObject();
		if (gameObject == null)
		{
			return;
		}

		int id = gameObject.getId();
		if (!aoeConfig.getGameObjects().containsKey(id))
		{
			return;
		}

		log.debug("AoE game object: {} spawned at tick: {}", id, client.getTickCount());
		onAreaOfEffectGameObject(gameObject);
	}

	// TODO: This doesn't work consistently for removing (cached?), so remove after implementation is done
	@Subscribe
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		GameObject gameObject = event.getGameObject();
		if (gameObject == null)
		{
			return;
		}

		int id = gameObject.getId();
		if (!aoeConfig.getGameObjects().containsKey(id))
		{
			return;
		}

		log.debug("AoE Game object: {} despawned at tick: {}", id, client.getTickCount());
	}

	@Subscribe
	public void onGraphicsObjectCreated(GraphicsObjectCreated event)
	{
		GraphicsObject graphicsObject = event.getGraphicsObject();
		if (graphicsObject == null)
		{
			return;
		}

		int id = graphicsObject.getId();
		if (!aoeConfig.getGraphicObjects().containsKey(id))
		{
			return;
		}

		log.debug("AoE graphics object: {} spawned at tick: {}", id, client.getTickCount());
		onAreaOfEffectGraphicsObject(graphicsObject);
	}

	@Subscribe
	public void onProjectileMoved(ProjectileMoved event)
	{
		Projectile projectile = event.getProjectile();
		// Area of effect projectiles don't interact with actors
		if (projectile.getInteracting() != null)
		{
			return;
		}

		onAreaOfEffectProjectile(projectile, event.getPosition());
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		boolean removedGameObjects = areaOfEffectGameObjects.removeIf((aoeObject) -> aoeObject.isDespawned(client.getTickCount()));
		if (removedGameObjects)
		{
			log.debug("Despawned AoE game object(s) removed at tick: {}", client.getTickCount());
		}

		boolean removedGraphicsObjects = areaOfEffectGraphicsObjects.removeIf((aoeObject) -> aoeObject.isDespawned(client.getTickCount()));
		if (removedGraphicsObjects)
		{
			log.debug("Despawned AoE graphics object(s) removed at tick: {}", client.getTickCount());
		}
	}

	@Subscribe
	public void onClientTick(ClientTick event)
	{
		boolean removed = areaOfEffectProjectiles.removeIf((aoeProjectile) -> aoeProjectile.isDespawned(client.getGameCycle()));
		if (removed)
		{
			log.debug("Despawned AoE projectile(s) removed at client tick: {}", client.getGameCycle());
		}
	}

	public void onAreaOfEffectProjectile(Projectile projectile, LocalPoint targetPoint)
	{
		AreaOfEffectConfig.AoeProjectileInfo projectileInfo = aoeConfig.getProjectiles().get(projectile.getId());
		if (projectileInfo.isEnabled())
		{
			int blacklistedRegion = projectileInfo.getBlacklistedRegion();
			if (blacklistedRegion != -1 && isInRegion(blacklistedRegion))
			{
				return;
			}

			areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, targetPoint, projectileInfo.getEndCycleDelay()));
		}
	}

	public void onAreaOfEffectGameObject(GameObject gameObject)
	{
		AreaOfEffectConfig.AoeObjectInfo objectInfo = aoeConfig.getGameObjects().get(gameObject.getId());
		if (objectInfo.isEnabled())
		{
			areaOfEffectGameObjects.add(new AreaOfEffectGameObject(gameObject, client.getTickCount(), objectInfo.getTickDuration()));
		}
	}

	public void onAreaOfEffectGraphicsObject(GraphicsObject graphicsObject)
	{
		AreaOfEffectConfig.AoeObjectInfo objectInfo = aoeConfig.getGraphicObjects().get(graphicsObject.getId());
		if (objectInfo.isEnabled())
		{
			if (objectInfo.getTickDuration() == -1)
			{
				areaOfEffectGraphicsObjects.add(new AreaOfEffectGraphicsObject(graphicsObject, client.getTickCount(), true));
				return;
			}

			areaOfEffectGraphicsObjects.add(new AreaOfEffectGraphicsObject(graphicsObject, client.getTickCount(), objectInfo.getTickDuration()));
		}
	}

	private boolean isInRegion(int regionId)
	{
		final Player player = client.getLocalPlayer();
		if (player == null)
		{
			return false;
		}

		return WorldPoint.fromLocalInstance(client, player.getLocalLocation()).getRegionID() == regionId;
	}
}
