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
package net.runelite.client.plugins.areaofeffectindicators;

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
public class AreaOfEffectIndicatorsPlugin extends Plugin
{

	@Inject
	private AreaOfEffectIndicatorsConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private AreaOfEffectIndicatorsOverlay overlay;

	@Getter
	private List<AreaOfEffectProjectile> areaOfEffectProjectiles;

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
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
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
			// Alchemical Hydra
			case ProjectileID.ALCHEMICAL_HYDRA_POISON_AOE:
				if (config.highlightAlchemicalHydraPoisonAttack())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getAlchemicalHydraPoisonAttackColor()));
				break;

			// Corporeal Beast
			case ProjectileID.CORPOREAL_BEAST_AOE:
				if (config.highlightCorporealBeastAttackTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getCorporealBeastSplashAttackColor()));
				break;
			case ProjectileID.CORPOREAL_BEAST_DARK_CORE_AOE:
				if (config.highlightDarkCoreLandingSpot())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getDarkCoreLandingSpotColor()));
				break;

			// Crazy/deranged archaeologist
			case ProjectileID.CRAZY_AND_DERANGED_ARCHAEOLOGIST_BOOK_AOE:
				if (config.highlightDerangedArchaeologistBookAttackTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getDerangedArchaeologistBookAttackColor()));
				break;

			// Basilisk Knights
			case ProjectileID.BASILISK_KNIGHT_STONE_ENTOMB_AOE:
				if (config.highlightBasiliskKnightEntombAttackTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getBasiliskKnightsEntombAttackColor()));
				break;

			// Lizardman Shamans
			case ProjectileID.LIZARDMAN_SHAMAN_ACID_AOE:
				if (config.highlightShamansAcidAttackTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 5, targetPoint, config.getShamansAcidAttackColor()));
				break;

			// Chambers of Xeric
			case ProjectileID.TEKTON_METEOR_AOE:
				if (config.highlightTektonMeteors())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getTektonMeteorsColor()));
				break;
			case ProjectileID.ICE_DEMON_RANGED_AOE:
				if (config.highlightIceDemonIceBoulders())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getIceDemonIceBoulderColor()));
				break;
			case ProjectileID.ICE_DEMON_ICE_BARRAGE_AOE:
				if (config.highlightIceDemonIceBarrage())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getIceDemonIceBarrageColor()));
				break;
			case ProjectileID.GUARDIANS_ROCK_FALLING_AOE:
				if (config.highlightGuardiansFallingRocks())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getGuardiansFallingRocksColor()));
				break;
			case ProjectileID.MAGE_VANGUARD_METEOR_TARGETED_AND_AOE:
				if (config.highlightMageVanguardMeteors())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getMageVanguardMeteorColor()));
				break;
			case ProjectileID.RANGED_VANGUARD_ROCKS_1_AOE:
			case ProjectileID.RANGED_VANGUARD_ROCKS_2_AOE:
				if (config.highlightRangedVanguardRocks())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getRangedVanguardRocksColor()));
				break;
			case ProjectileID.VESPULA_TOXIC_ATTACK_TARGETED_AND_AOE:
				if (config.highlightVespulaToxicAttack())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getVespulaToxicAttackColor()));
				break;
			case ProjectileID.VASA_AWAKEN_AOE:
				if (config.highlightVasaTeleportAttackTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getVasaTeleportAttackColor()));
				break;
			case ProjectileID.VASA_RANGED_BOULDER_AOE:
				// Vasa Nistirio's boulder attack hits around 400 milliseconds before it ends
				if (config.highlightVasaBoulderAttackTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, projectile.getEndCycle() - 20, 3, targetPoint, config.getVasaBoulderAttackColor()));
				break;
			case ProjectileID.OLM_FALLING_CRYSTAL_AOE:
				if (config.highlightOlmFallingCrystals())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getOlmFallingCrystalsColor()));
				break;
			case ProjectileID.OLM_FALLING_SPIKE_AOE:
				if (config.highlightOlmFallingSpikes())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getOlmFallingSpikesColor()));
				break;
			case ProjectileID.OLM_HEALING_POOL_AOE:
				if (config.highlightOlmHealingPools())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getOlmHealingPoolsColor()));
				break;
			case ProjectileID.OLM_ACID_POOL_AOE:
				if (config.highlightOlmAcidPools())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getOlmAcidPoolsColor()));
				break;

			// Vorkath
			case ProjectileID.VORKATH_FIREBOMB:
				if (config.highlightVorkathFirebombTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getVorkathFirebombMarkerColor()));
				break;
			case ProjectileID.VORKATH_ACID_PHASE_FIREBALL_AOE:
				if (config.highlightVorkathFireballTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getVorkathFireballMarkerColor()));
				break;
			case ProjectileID.VORKATH_ACID_AOE:
				if (config.highlightVorkathAcidPhaseTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getVorkathAcidPhaseMarkerColor()));
				break;
			case ProjectileID.VORKATH_ZOMBIFIED_SPAWN_AOE:
				if (config.highlightVorkathZombifiedSpawnTiles())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getVorkathZombifiedSpawnMarkerColor()));
				break;

			// Galvek
			case ProjectileID.GALVEK_MINE:
				if (config.highlightGalvekMine())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getGalvekMineColor()));
				break;
			case ProjectileID.GALVEK_BOMB:
				if (config.highlightGalvekFirebomb())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getGalvekFirebombColor()));
				break;

			// Wintertodt
			case ProjectileID.WINTERTODT_SNOW_FALL_AOE:
				if (config.highlightWintertodtSnowfall())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getWintertodtSnowfallColor()));
				break;

			// Slayer
			case ProjectileID.MARBLE_GARGOYLE_AOE:
				if (config.highlightMarbleGargoyleStoneBall())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getMarbleGargoyleStoneBallColor()));
				break;
			case ProjectileID.ADAMANT_DRAGON_POISON_AOE:
				if (config.highlightAdamantDragonPoisonAttack())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getAdamantDragonPoisonAttackColor()));
				break;
			case ProjectileID.DRAKE_BREATH_AOE:
				if (config.highlightDrakeFireBreath())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getDrakeFireBreathColor()));
				break;

			// Theatre of Blood
			case ProjectileID.SUGADINTI_MAIDEN_BLOOD_SPLAT_AOE:
				if (config.highlightMaidenBloodSplatAttack())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getMaidenBloodSplatAttackColor()));
				break;
			case ProjectileID.XARPUS_ACID_BALL_AOE:
				if (config.highlightXarpusAcidAttack())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getXarpusAcidAttackColor()));
				break;
			case ProjectileID.VERZIK_SKULL_ATTACK_AOE:
				if (config.highlightVerzikSkullAttack())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getVerzikSkullAttackColor()));
				break;
			case ProjectileID.VERZIK_WEB_ATTACK_AOE:
				if (config.highlightVerzikWebAttack())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getVerzikWebAttackColor()));
				break;

			// Cerberus
			case ProjectileID.CERBERUS_LAVA_POOL_AOE:
				if (config.highlightCerberusLavaPool())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getCerberusLavaPoolAttackColor()));
				break;

			// Grotesque Guardians
			case ProjectileID.DUSK_FALLING_CEILING_DEBRIS_AOE:
				if (config.highlightDuskFallingCeilingDebris())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getDuskFallingCeilingDebrisColor()));
				break;
			case ProjectileID.DAWN_FREEZE_ROCK_AOE:
				if (config.highlightDawnFreezeRock())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getDawnFreezeRockColor()));
				break;

			// Chaos Fanatic
			case ProjectileID.CHAOS_FANATIC_AOE:
				if (config.highlightChaosFanaticGreenOrbs())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getChaosFanaticGreenOrbsColor()));
				break;

			// Vetion
			case ProjectileID.VETION_LIGHTNING_AOE:
				if (config.highlightVetionLightning())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getVetionLightningAttackColor()));
				break;

			// Demonic Gorillas
			case ProjectileID.DEMONIC_GORILLA_BOULDER_AOE:
				if (config.highlightDemonicGorillaBoulder())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getDemonicGorillasBoulderColor()));
				break;

			// Zalcano
			case ProjectileID.ZALCANO_SPAWN_GOLEM_AOE:
				if (config.highlightZalcanoGolemSpawn())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getZalcanoGolemSpawnColor()));
				break;

			// Zulrah
			case ProjectileID.ZULRAH_POISON_CLOUD_AOE:
				if (config.highlightZulrahPoisonCloud())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 4, targetPoint, config.getZulrahPoisonCloudsColor()));
				break;
			case ProjectileID.ZULRAH_SNAKELING_SPAWN_AOE:
				if (config.highlightZulrahSnakelingSpawn())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getZulrahSnakelingSpawnColor()));
				break;

			// Elven Traitor
			case ProjectileID.ELVEN_TRAITOR_EXPLOSIVE_ARROW_AOE:
				if (config.highlightElvenTraitorExplosiveArrow())
					areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getElvenTraitorExplosiveArrowColor()));
				break;
		}
	}


}
