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
package net.runelite.client.plugins.aoewarnings;

import com.google.inject.Provides;
import lombok.Getter;
import net.runelite.api.GameState;
import net.runelite.api.Projectile;
import net.runelite.api.ProjectileID;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.AreaOfEffectProjectile;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@PluginDescriptor(
		name = "Area Of Effect Warnings",
		description = "Highlights tiles of area of effect projectiles",
		tags = {"aoe", "projectiles", "highlight", "pvm", "overlay", "boss", "encounter"},
		type = PluginType.SANLITE_USE_AT_OWN_RISK
)
public class AoeWarningsPlugin extends Plugin
{

	@Inject
	private AoeWarningsConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private AoeWarningsOverlay overlay;

	@Inject
	private AoeWarningsDebugOverlay debugOverlay;

	@Getter
	private List<AreaOfEffectProjectile> areaOfEffectProjectiles;

	@Provides
	AoeWarningsConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(AoeWarningsConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}
		areaOfEffectProjectiles = new CopyOnWriteArrayList<>();
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
		areaOfEffectProjectiles = null;
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		GameState gameState = event.getGameState();
		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			areaOfEffectProjectiles.clear();
		}
	}

	@Subscribe
	public void onProjectileMoved(ProjectileMoved event)
	{
		Projectile projectile = event.getProjectile();
		if (projectile.getInteracting() != null)
		{
			return;
		}

		onAreaOfEffectProjectile(projectile, event.getPosition());
	}

	public void onAreaOfEffectProjectile(Projectile projectile, LocalPoint targetPoint)
	{
		switch (projectile.getId())
		{
			case ProjectileID.CORPOREAL_BEAST_AOE:
				if (config.highlightCorporealBeastAttackTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getCorporealBeastSplashAttackColor()));
				break;
			case ProjectileID.DERANGED_ARCHAEOLOGIST_BOOK_AOE:
				if (config.highlightDerangedArchaeologistBookAttackTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getDerangedArchaeologistBookAttackColor()));
				break;
			case ProjectileID.BASILISK_KNIGHT_STONE_ENTOMB_AOE:
				if (config.highlightBasiliskKnightEntombAttackTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getBasiliskKnightsEntombAttackColor()));
				break;
			case ProjectileID.TEKTON_METEOR_AOE:
				if (config.highlightTektonMeteors())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getTektonMeteorsColor()));
				break;
		}
	}


}
