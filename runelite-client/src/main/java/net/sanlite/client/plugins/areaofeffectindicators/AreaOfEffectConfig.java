/*
 * Copyright (c) 2022, Siraz <https://github.com/Sirazzz>
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

import com.google.common.collect.ImmutableMap;
import lombok.Getter;
import net.runelite.api.ObjectID;
import net.sanlite.client.plugins.areaofeffectindicators.id.ProjectileID;
import net.sanlite.client.plugins.areaofeffectindicators.id.RegionID;

import java.awt.*;

public class AreaOfEffectConfig
{
	@Getter
	private final ImmutableMap<Integer, AoeProjectileInfo> projectiles;

	@Getter
	private final ImmutableMap<Integer, AoeObjectInfo> gameObjects;

	public AreaOfEffectConfig(AreaOfEffectIndicatorsConfig config)
	{
		projectiles = new ImmutableMap.Builder<Integer, AoeProjectileInfo>()
				// Alchemical Hydra
				.put(ProjectileID.ALCHEMICAL_HYDRA_POISON_AOE, new AoeProjectileInfo(3, config.highlightAlchemicalHydraPoisonAttack(), config.getAlchemicalHydraPoisonAttackColor()))
				// Corporeal Beast
				.put(ProjectileID.CORPOREAL_BEAST_AOE, new AoeProjectileInfo(3, config.highlightCorporealBeastAttackTiles(), config.getCorporealBeastSplashAttackColor()))
				.put(ProjectileID.CORPOREAL_BEAST_DARK_CORE_AOE, new AoeProjectileInfo(3, config.highlightDarkCoreLandingSpot(), config.getDarkCoreLandingSpotColor()))
				// Crazy/deranged archaeologist
				.put(ProjectileID.CRAZY_AND_DERANGED_ARCHAEOLOGIST_BOOK_AOE, new AoeProjectileInfo(3, config.highlightDerangedArchaeologistBookAttackTiles(), config.getDerangedArchaeologistBookAttackColor()))
				// Basilisk Knights
				.put(ProjectileID.BASILISK_KNIGHT_STONE_ENTOMB_AOE, new AoeProjectileInfo(1, config.highlightBasiliskKnightEntombAttackTiles(), config.getBasiliskKnightsEntombAttackColor()))
				// Lizardman Shamans
				.put(ProjectileID.LIZARDMAN_SHAMAN_ACID_AOE, new AoeProjectileInfo(5, config.highlightShamansAcidAttackTiles(), config.getShamansAcidAttackColor()))
				// Chambers of Xeric
				// This projectile is re-used in the Inferno, where it is not helpful to display, so block it
				.put(ProjectileID.TEKTON_METEOR_AOE, new AoeProjectileInfo(3, config.highlightTektonMeteors(), config.getTektonMeteorsColor(), RegionID.INFERNO, 0))
				.put(ProjectileID.ICE_DEMON_RANGED_AOE, new AoeProjectileInfo(3, config.highlightIceDemonIceBoulders(), config.getIceDemonIceBoulderColor()))
				.put(ProjectileID.ICE_DEMON_ICE_BARRAGE_AOE, new AoeProjectileInfo(3, config.highlightIceDemonIceBarrage(), config.getIceDemonIceBarrageColor()))
				.put(ProjectileID.GUARDIANS_ROCK_FALLING_AOE, new AoeProjectileInfo(3, config.highlightGuardiansFallingRocks(), config.getGuardiansFallingRocksColor()))
				.put(ProjectileID.MAGE_VANGUARD_METEOR_TARGETED_AND_AOE, new AoeProjectileInfo(3, config.highlightMageVanguardMeteors(), config.getMageVanguardMeteorColor()))
				.put(ProjectileID.RANGED_VANGUARD_ROCKS_1_AOE, new AoeProjectileInfo(3, config.highlightRangedVanguardRocks(), config.getRangedVanguardRocksColor()))
				.put(ProjectileID.RANGED_VANGUARD_ROCKS_2_AOE, new AoeProjectileInfo(3, config.highlightRangedVanguardRocks(), config.getRangedVanguardRocksColor()))
				.put(ProjectileID.VESPULA_TOXIC_ATTACK_TARGETED_AND_AOE, new AoeProjectileInfo(3, config.highlightVespulaToxicAttack(), config.getVespulaToxicAttackColor()))
				.put(ProjectileID.VASA_AWAKEN_AOE, new AoeProjectileInfo(3, config.highlightVasaTeleportAttackTiles(), config.getVasaTeleportAttackColor()))
				// Vasa Nistirio's boulder attack hits around 400 milliseconds before it ends
				.put(ProjectileID.VASA_RANGED_BOULDER_AOE, new AoeProjectileInfo(3, config.highlightVasaBoulderAttackTiles(), config.getVasaBoulderAttackColor(), 20))
				.put(ProjectileID.OLM_FALLING_CRYSTAL_AOE, new AoeProjectileInfo(3, config.highlightOlmFallingCrystals(), config.getOlmFallingCrystalsColor()))
				.put(ProjectileID.OLM_FALLING_SPIKE_AOE, new AoeProjectileInfo(1, config.highlightOlmFallingSpikes(), config.getOlmFallingSpikesColor()))
				.put(ProjectileID.OLM_HEALING_POOL_AOE, new AoeProjectileInfo(1, config.highlightOlmHealingPools(), config.getOlmHealingPoolsColor()))
				.put(ProjectileID.OLM_ACID_POOL_AOE, new AoeProjectileInfo(1, config.highlightOlmAcidPools(), config.getOlmAcidPoolsColor()))
				// Vorkath
				.put(ProjectileID.VORKATH_FIREBOMB, new AoeProjectileInfo(3, config.highlightVorkathFirebombTiles(), config.getVorkathFirebombMarkerColor()))
				.put(ProjectileID.VORKATH_ACID_PHASE_FIREBALL_AOE, new AoeProjectileInfo(1, config.highlightVorkathFireballTiles(), config.getVorkathFireballMarkerColor()))
				.put(ProjectileID.VORKATH_ACID_AOE, new AoeProjectileInfo(1, config.highlightVorkathAcidPhaseTiles(), config.getVorkathAcidPhaseMarkerColor()))
				.put(ProjectileID.VORKATH_ZOMBIFIED_SPAWN_AOE, new AoeProjectileInfo(1, config.highlightVorkathZombifiedSpawnTiles(), config.getVorkathZombifiedSpawnMarkerColor()))
				// Galvek
				.put(ProjectileID.GALVEK_MINE, new AoeProjectileInfo(3, config.highlightGalvekMine(), config.getGalvekMineColor()))
				.put(ProjectileID.GALVEK_BOMB, new AoeProjectileInfo(3, config.highlightGalvekFirebomb(), config.getGalvekFirebombColor()))
				// Wintertodt
				.put(ProjectileID.WINTERTODT_SNOW_FALL_AOE, new AoeProjectileInfo(3, config.highlightWintertodtSnowfall(), config.getWintertodtSnowfallColor()))
				// Slayer
				.put(ProjectileID.MARBLE_GARGOYLE_AOE, new AoeProjectileInfo(1, config.highlightMarbleGargoyleStoneBall(), config.getMarbleGargoyleStoneBallColor()))
				.put(ProjectileID.ADAMANT_DRAGON_POISON_AOE, new AoeProjectileInfo(3, config.highlightAdamantDragonPoisonAttack(), config.getAdamantDragonPoisonAttackColor()))
				.put(ProjectileID.DRAKE_BREATH_AOE, new AoeProjectileInfo(1, config.highlightDrakeFireBreath(), config.getDrakeFireBreathColor()))
				// Theatre of Blood
				.put(ProjectileID.SUGADINTI_MAIDEN_BLOOD_SPLAT_AOE, new AoeProjectileInfo(1, config.highlightMaidenBloodSplatAttack(), config.getMaidenBloodSplatAttackColor()))
				.put(ProjectileID.XARPUS_ACID_BALL_AOE, new AoeProjectileInfo(3, config.highlightXarpusAcidAttack(), config.getXarpusAcidAttackColor()))
				.put(ProjectileID.VERZIK_SKULL_ATTACK_AOE, new AoeProjectileInfo(1, config.highlightVerzikSkullAttack(), config.getVerzikSkullAttackColor()))
				.put(ProjectileID.VERZIK_WEB_ATTACK_AOE, new AoeProjectileInfo(1, config.highlightVerzikWebAttack(), config.getVerzikWebAttackColor()))
				// Cerberus
				.put(ProjectileID.CERBERUS_LAVA_POOL_AOE, new AoeProjectileInfo(3, config.highlightCerberusLavaPool(), config.getCerberusLavaPoolAttackColor()))
				// Grotesque Guardians
				.put(ProjectileID.DUSK_FALLING_CEILING_DEBRIS_AOE, new AoeProjectileInfo(3, config.highlightDuskFallingCeilingDebris(), config.getDuskFallingCeilingDebrisColor()))
				.put(ProjectileID.DAWN_FREEZE_ROCK_AOE, new AoeProjectileInfo(3, config.highlightDawnFreezeRock(), config.getDawnFreezeRockColor()))
				// Chaos Fanatic
				.put(ProjectileID.CHAOS_FANATIC_AOE, new AoeProjectileInfo(1, config.highlightChaosFanaticGreenOrbs(), config.getChaosFanaticGreenOrbsColor()))
				// Vetion
				.put(ProjectileID.VETION_LIGHTNING_AOE, new AoeProjectileInfo(1, config.highlightVetionLightning(), config.getVetionLightningAttackColor()))
				// Demonic Gorillas
				.put(ProjectileID.DEMONIC_GORILLA_BOULDER_AOE, new AoeProjectileInfo(1, config.highlightDemonicGorillaBoulder(), config.getDemonicGorillasBoulderColor()))
				// Zalcano
				.put(ProjectileID.ZALCANO_SPAWN_GOLEM_AOE, new AoeProjectileInfo(1, config.highlightZalcanoGolemSpawn(), config.getZalcanoGolemSpawnColor()))
				// Zulrah
				.put(ProjectileID.ZULRAH_POISON_CLOUD_AOE, new AoeProjectileInfo(4, config.highlightZulrahPoisonCloud(), config.getZulrahPoisonCloudsColor()))
				.put(ProjectileID.ZULRAH_SNAKELING_SPAWN_AOE, new AoeProjectileInfo(1, config.highlightZulrahSnakelingSpawn(), config.getZulrahSnakelingSpawnColor()))
				// Elven Traitor
				.put(ProjectileID.ELVEN_TRAITOR_EXPLOSIVE_ARROW_AOE, new AoeProjectileInfo(1, config.highlightElvenTraitorExplosiveArrow(), config.getElvenTraitorExplosiveArrowColor()))
				.build();

		gameObjects = new ImmutableMap.Builder<Integer, AoeObjectInfo>()
				// Chambers of Xeric
				.put(ObjectID.SMALL_CRYSTALS, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, 4, config.highlightOlmGroundSpikes(), config.getOlmCrystalGroundSpikesColor()))
				.put(ObjectID.ACID_POOL, new AoeObjectInfo(AoeObjectType.DAMAGE_PER_TICK, 15, config.highlightOlmAcidPools(), config.getOlmAcidPoolsColor()))
				.put(ObjectID.CRYSTAL_BOMB, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, 6, 5, config.highlightOlmCrystalBomb(), config.getOlmCrystalBombColor()))
				// Nex
				.put(ObjectID.SHADOW, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, 6, config.highlightNexShadowAttack(), config.getNexShadowAttackColor()))
				.build();
	}

	enum AoeObjectType
	{
		SINGLE_DAMAGE,
		DAMAGE_PER_TICK
	}

	@Getter
	static class AoeProjectileInfo
	{
		private final int tileSize;
		private final boolean enabled;
		private final Color color;
		private final int blacklistedRegion;
		// Delay in client cycle (i.e. 20 equals 400ms)
		private final int endCycleDelay;

		private AoeProjectileInfo(int tileSize, boolean enabled, Color color)
		{
			this.tileSize = tileSize;
			this.enabled = enabled;
			this.color = color;
			this.blacklistedRegion = -1;
			this.endCycleDelay = 0;
		}

		private AoeProjectileInfo(int tileSize, boolean enabled, Color color, int endCycleDelay)
		{
			this.tileSize = tileSize;
			this.enabled = enabled;
			this.color = color;
			this.blacklistedRegion = -1;
			this.endCycleDelay = endCycleDelay;
		}

		private AoeProjectileInfo(int tileSize, boolean enabled, Color color, int blacklistedRegion, int endCycleDelay)
		{
			this.tileSize = tileSize;
			this.enabled = enabled;
			this.color = color;
			this.blacklistedRegion = blacklistedRegion;
			this.endCycleDelay = endCycleDelay;
		}
	}

	@Getter
	static class AoeObjectInfo
	{
		private final AoeObjectType type;
		private final int tickDuration;
		private final int tileSize;
		private final boolean enabled;
		private final Color color;

		private AoeObjectInfo(AoeObjectType type, int tickDuration, boolean enabled, Color color)
		{
			this.type = type;
			this.tickDuration = tickDuration;
			this.tileSize = 1;
			this.enabled = enabled;
			this.color = color;
		}

		private AoeObjectInfo(AoeObjectType type, int tickDuration, int tileSize, boolean enabled, Color color)
		{
			this.type = type;
			this.tickDuration = tickDuration;
			this.tileSize = tileSize;
			this.enabled = enabled;
			this.color = color;
		}
	}
}
