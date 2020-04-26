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

import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("aoewarnings")
public interface AreaOfEffectIndicatorsConfig extends Config
{
	@ConfigItem(
			keyName = "highlightCorporealBeastSplashAttackTiles",
			name = "Highlight splash attack tiles",
			description = "Highlight the tiles for the Corporeal Beast's splash attack",
			group = "Corporeal Beast",
			position = 1
	)
	default boolean highlightCorporealBeastAttackTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "corporealBeastSplashAttackColor",
			name = "Splash attack marker",
			description = "Color of the Corporeal Beast's splash attack tile marker",
			group = "Corporeal Beast",
			position = 2
	)
	default Color getCorporealBeastSplashAttackColor()
	{
		return new Color(230, 228, 225);
	}

	@ConfigItem(
			keyName = "highlightDarkCoreLandingSpot",
			name = "Highlight dark core landing spot",
			description = "Highlight the landing spot when the Dark Core jumps during the Corporeal Beast encounter",
			group = "Corporeal Beast",
			position = 3
	)
	default boolean highlightDarkCoreLandingSpot()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "darkCoreLandingSpotColor",
			name = "Splash attack marker",
			description = "Color of the landing spot marker when the Dark Core jumps during the Corporeal Beast encounter",
			group = "Corporeal Beast",
			position = 4
	)
	default Color getDarkCoreLandingSpotColor()
	{
		return Color.RED;
	}

	@ConfigItem(
			keyName = "highlightDerangedArchaeologistBookAttackTiles",
			name = "Highlight book attack tiles",
			description = "Highlight the tiles for the Crazy/deranged Archaeologist's book attack",
			group = "Crazy/deranged Archaeologist",
			position = 5
	)
	default boolean highlightDerangedArchaeologistBookAttackTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "derangedArchaeologistBookAttackColor",
			name = "Book attack marker",
			description = "Color of the Crazy/deranged Archaeologist's book attack tile marker",
			group = "Crazy/deranged Archaeologist",
			position = 6
	)
	default Color getDerangedArchaeologistBookAttackColor()
	{
		return new Color(253, 162, 0);
	}

	@ConfigItem(
			keyName = "highlightBasiliskKnightEntombAttackTiles",
			name = "Highlight entomb attack tiles",
			description = "Highlight the tiles for Basilisk Knights entomb attack",
			group = "Basilisk Knights",
			position = 7
	)
	default boolean highlightBasiliskKnightEntombAttackTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "basiliskKnightsEntombAttackColor",
			name = "Entomb attack marker",
			description = "Color of Basilisk Knights entomb attack tile marker",
			group = "Basilisk Knights",
			position = 8
	)
	default Color getBasiliskKnightsEntombAttackColor()
	{
		return new Color(216, 47, 27);
	}

	@ConfigItem(
			keyName = "highlightShamansAcidAttackTiles",
			name = "Highlight acid attack tiles",
			description = "Highlight the tiles for the Lizardman Shamans acid attack",
			group = "Lizardman Shamans",
			position = 9
	)
	default boolean highlightShamansAcidAttackTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "shamansAcidAttackColor",
			name = "Acid attack marker",
			description = "Color of Lizardman Shamans acid attack marker",
			group = "Lizardman Shamans",
			position = 10
	)
	default Color getShamansAcidAttackColor()
	{
		return new Color(82, 164, 101);
	}

	@ConfigItem(
			keyName = "highlightTektonMeteors",
			name = "Highlight Tekton meteors",
			description = "Highlight Tekton's meteor attack during the Anvil phase",
			group = "Chambers of Xeric",
			position = 11
	)
	default boolean highlightTektonMeteors()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "tektonMeteorsColor",
			name = "Tekton meteors color",
			description = "Color of Tekton's meteor attack tile marker during the Anvil phase",
			group = "Chambers of Xeric",
			position = 12
	)
	default Color getTektonMeteorsColor()
	{
		return new Color(177, 86, 26);
	}

	@ConfigItem(
			keyName = "highlightIceDemonIceBarrage",
			name = "Highlight Ice Demon barrage",
			description = "Highlight Ice Demon's ice barrage attack",
			group = "Chambers of Xeric",
			position = 13
	)
	default boolean highlightIceDemonIceBarrage()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "iceDemonIceBarrageColor",
			name = "Ice barrage color",
			description = "Color of Ice Demon's ice barrage attack tile marker",
			group = "Chambers of Xeric",
			position = 14
	)
	default Color getIceDemonIceBarrageColor()
	{
		return new Color(133, 135, 133);
	}

	@ConfigItem(
			keyName = "highlightIceDemonIceBoulders",
			name = "Highlight Ice demon boulders",
			description = "Highlight Ice Demon's ice boulder attack",
			group = "Chambers of Xeric",
			position = 15
	)
	default boolean highlightIceDemonIceBoulders()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "iceDemonIceBoulderColor",
			name = "Ice boulder color",
			description = "Color of Ice Demon's ice boulder attack tile marker",
			group = "Chambers of Xeric",
			position = 16
	)
	default Color getIceDemonIceBoulderColor()
	{
		return new Color(224, 226, 230);
	}

	@ConfigItem(
			keyName = "highlightGuardiansFallingRocks",
			name = "Highlight guardians falling rocks",
			description = "Highlight the Guardians falling rock attack",
			group = "Chambers of Xeric",
			position = 17
	)
	default boolean highlightGuardiansFallingRocks()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "guardiansFallingRocksColor",
			name = "Falling rocks color",
			description = "Color of the Guardians falling rock tile marker",
			group = "Chambers of Xeric",
			position = 18
	)
	default Color getGuardiansFallingRocksColor()
	{
		return new Color(64, 104, 62);
	}

	@ConfigItem(
			keyName = "highlightMageVanguardMeteors",
			name = "Highlight mage vanguard meteors",
			description = "Highlight the mage Vanguard's falling meteor attack",
			group = "Chambers of Xeric",
			position = 19
	)
	default boolean highlightMageVanguardMeteors()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "mageVanguardMeteorColor",
			name = "Vanguards meteor color",
			description = "Color of the mage Vanguard's falling meteor attack tile marker",
			group = "Chambers of Xeric",
			position = 20
	)
	default Color getMageVanguardMeteorColor()
	{
		return new Color(199, 69, 21);
	}

	@ConfigItem(
			keyName = "highlightRangedVanguardRocks",
			name = "Highlight ranged vanguard rocks",
			description = "Highlight the ranged Vanguard's thrown rocks attack",
			group = "Chambers of Xeric",
			position = 21
	)
	default boolean highlightRangedVanguardRocks()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "rangedVanguardRocksColor",
			name = "Vanguards rocks color",
			description = "Color of the ranged Vanguard's thrown rocks attack tile marker",
			group = "Chambers of Xeric",
			position = 22
	)
	default Color getRangedVanguardRocksColor()
	{
		return new Color(83, 50, 33);
	}

	@ConfigItem(
			keyName = "highlightVespulaToxicAttack",
			name = "Highlight Vespula toxic attack",
			description = "Highlight Vespula's toxic attack target tiles",
			group = "Chambers of Xeric",
			position = 23
	)
	default boolean highlightVespulaToxicAttack()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "vespulaToxicAttackColor",
			name = "Toxic attack color",
			description = "Color of Vespula's toxic attack tile marker",
			group = "Chambers of Xeric",
			position = 24
	)
	default Color getVespulaToxicAttackColor()
	{
		return new Color(89, 188, 41);
	}

	@ConfigItem(
			keyName = "highlightVasaTeleportAttackTiles",
			name = "Highlight Vasa teleport attack",
			description = "Highlight the tiles of Vasa Nistirio's teleport explosion attack",
			group = "Chambers of Xeric",
			position = 25
	)
	default boolean highlightVasaTeleportAttackTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "vasaTeleportAttackColor",
			name = "Teleport attack marker",
			description = "Color of Vasa Nistirio teleport explosion attack marker",
			group = "Chambers of Xeric",
			position = 26
	)
	default Color getVasaTeleportAttackColor()
	{
		return new Color(150, 132, 222);
	}

	@ConfigItem(
			keyName = "highlightVasaBoulderAttackTiles",
			name = "Highlight Vasa boulder attack",
			description = "Highlight the boulder attack tiles during the Vasa Nistirio encounter",
			group = "Chambers of Xeric",
			position = 27
	)
	default boolean highlightVasaBoulderAttackTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "vasaBoulderAttackColor",
			name = "Boulder attack marker",
			description = "Color of Vasa Nistirio boulder attack marker",
			group = "Chambers of Xeric",
			position = 28
	)
	default Color getVasaBoulderAttackColor()
	{
		return new Color(113, 107, 107);
	}

	@ConfigItem(
			keyName = "highlightOlmFallingCrystals",
			name = "Highlight Olm falling crystals",
			description = "Highlight the tiles of the falling crystals during the last phase of the Great Olm encounter",
			group = "Chambers of Xeric",
			position = 29
	)
	default boolean highlightOlmFallingCrystals()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "olmFallingCrystalsColor",
			name = "Falling crystal color",
			description = "Color of the falling crystals tile markers during the last phase of the Great Olm encounter",
			group = "Chambers of Xeric",
			position = 30
	)
	default Color getOlmFallingCrystalsColor()
	{
		return new Color(138, 173, 38);
	}

	@ConfigItem(
			keyName = "highlightOlmFallingSpikes",
			name = "Highlight Olm falling spikes",
			description = "Highlight the tiles of the falling spikes during the Great Olm encounter",
			group = "Chambers of Xeric",
			position = 31
	)
	default boolean highlightOlmFallingSpikes()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "olmFallingSpikesColor",
			name = "Falling spike color",
			description = "Color of the falling spike attack tile markers during the Great Olm encounter",
			group = "Chambers of Xeric",
			position = 32
	)
	default Color getOlmFallingSpikesColor()
	{
		return new Color(167, 67, 45);
	}

	@ConfigItem(
			keyName = "highlightOlmHealingPools",
			name = "Highlight Olm healing pools",
			description = "Highlight the tiles of healing pools during the Great Olm encounter",
			group = "Chambers of Xeric",
			position = 33
	)
	default boolean highlightOlmHealingPools()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "olmHealingPoolsColor",
			name = "Healing pools color",
			description = "Color of the of healing pools tile markers during the Great Olm encounter",
			group = "Chambers of Xeric",
			position = 34
	)
	default Color getOlmHealingPoolsColor()
	{
		return new Color(143, 197, 203);
	}

	@ConfigItem(
			keyName = "highlightOlmAcidPools",
			name = "Highlight Olm acid pools",
			description = "Highlight the tiles of acid pools during the Great Olm encounter",
			group = "Chambers of Xeric",
			position = 35
	)
	default boolean highlightOlmAcidPools()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "olmAcidPoolsColor",
			name = "Acid pools color",
			description = "Color of the of acid pools tile markers during the Great Olm encounter",
			group = "Chambers of Xeric",
			position = 36
	)
	default Color getOlmAcidPoolsColor()
	{
		return new Color(68, 126, 45);
	}

	@ConfigItem(
			keyName = "highlightVorkathFirebombTiles",
			name = "Highlight firebomb attack",
			description = "Highlight the tiles where Vorkath's firebomb is going to land",
			group = "Vorkath",
			position = 31
	)
	default boolean highlightVorkathFirebombTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "vorkathFirebombMarkerColor",
			name = "Firebomb tile marker",
			description = "Color of Vorkath's firebomb markers",
			group = "Vorkath",
			position = 32
	)
	default Color getVorkathFirebombMarkerColor()
	{
		return new Color(226, 126, 35);
	}

	@ConfigItem(
			keyName = "highlightVorkathFireballTiles",
			name = "Highlight fireball attack",
			description = "Highlight the landing spot tiles for Vorkath's acid phase fireball attack",
			group = "Vorkath",
			position = 33
	)
	default boolean highlightVorkathFireballTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "vorkathFireballMarkerColor",
			name = "Firebomb tile marker",
			description = "Color of Vorkath's fireball markers during the acid phase",
			group = "Vorkath",
			position = 34
	)
	default Color getVorkathFireballMarkerColor()
	{
		return new Color(237, 190, 36);
	}

	@ConfigItem(
			keyName = "highlightVorkathAcidPhaseTiles",
			name = "Highlight acid phase attack",
			description = "Highlight the landing spot tiles for Vorkath's acid phase attack",
			group = "Vorkath",
			position = 35
	)
	default boolean highlightVorkathAcidPhaseTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "vorkathAcidPhaseMarkerColor",
			name = "Acid phase tile marker",
			description = "Color of Vorkath's acid attack markers at the start of the acid phase",
			group = "Vorkath",
			position = 36
	)
	default Color getVorkathAcidPhaseMarkerColor()
	{
		return new Color(74, 178, 23);
	}

	@ConfigItem(
			keyName = "highlightVorkathZombifiedSpawnTiles",
			name = "Highlight zombified spawn attack",
			description = "Highlight the landing spot tiles for Vorkath's zombified spawn",
			group = "Vorkath",
			position = 37
	)
	default boolean highlightVorkathZombifiedSpawnTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "vorkathZombifiedSpawnMarkerColor",
			name = "Zombified spawn marker",
			description = "Color of Vorkath's initial zombified spawn marker",
			group = "Vorkath",
			position = 38
	)
	default Color getVorkathZombifiedSpawnMarkerColor()
	{
		return new Color(80, 147, 133);
	}

	@ConfigItem(
			keyName = "highlightGalvekMine",
			name = "Highlight falling mines",
			description = "Highlight the landing spot tiles for Galvek's falling mine attack",
			group = "Galvek",
			position = 39
	)
	default boolean highlightGalvekMine()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "galvekMineColor",
			name = "Falling mine color",
			description = "Color of Galvek's falling mine attack marker",
			group = "Galvek",
			position = 40
	)
	default Color getGalvekMineColor()
	{
		return new Color(84, 48, 46);
	}

	@ConfigItem(
			keyName = "highlightGalvekFirebomb",
			name = "Highlight firebomb",
			description = "Highlight the landing spot tiles for Galvek's firebomb attack",
			group = "Galvek",
			position = 41
	)
	default boolean highlightGalvekFirebomb()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "galvekFirebombColor",
			name = "Firebomb color",
			description = "Color of Galvek's firebomb attack marker",
			group = "Galvek",
			position = 42
	)
	default Color getGalvekFirebombColor()
	{
		return new Color(226, 126, 35);
	}

	@ConfigItem(
			keyName = "highlightWintertodtSnowfall",
			name = "Highlight snowfall",
			description = "Highlight the tiles for the snowfall attack during the Wintertodt encounter",
			group = "Wintertodt",
			position = 43
	)
	default boolean highlightWintertodtSnowfall()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "wintertodtSnowfallColor",
			name = "Snowfall color",
			description = "Color of snowfall attack marker during the Wintertodt encounter",
			group = "Wintertodt",
			position = 44
	)
	default Color getWintertodtSnowfallColor()
	{
		return new Color(0, 196, 226);
	}

	@ConfigItem(
			keyName = "highlightMarbleGargoyleStoneBall",
			name = "Highlight marble gargoyle stone ball",
			description = "Highlight the tile for the Marble Gargoyle's stone ball attack",
			group = "Slayer",
			position = 45
	)
	default boolean highlightMarbleGargoyleStoneBall()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "marbleGargoyleStoneBallColor",
			name = "Stone ball color",
			description = "Color of the tile marker for the Marble Gargoyle's stone ball attack",
			group = "Slayer",
			position = 46
	)
	default Color getMarbleGargoyleStoneBallColor()
	{
		return new Color(122, 44, 30);
	}

	@ConfigItem(
			keyName = "highlightAdamantDragonPoisonAttack",
			name = "Highlight adamant dragon poison attack",
			description = "Highlight the tiles for adamant dragon poison attacks",
			group = "Slayer",
			position = 47
	)
	default boolean highlightAdamantDragonPoisonAttack()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "adamantDragonPoisonAttackColor",
			name = "Poison attack color",
			description = "Color of the adamant dragon poison attack tile marker",
			group = "Slayer",
			position = 48
	)
	default Color getAdamantDragonPoisonAttackColor()
	{
		return new Color(97, 170, 108);
	}

	@ConfigItem(
			keyName = "highlightDrakeFireBreath",
			name = "Highlight drake fire breath",
			description = "Highlight the tiles for drake fire breath attacks",
			group = "Slayer",
			position = 49
	)
	default boolean highlightDrakeFireBreath()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "drakeFireBreathColor",
			name = "Fire breath color",
			description = "Color of the tile marker for drake fire breath attacks",
			group = "Slayer",
			position = 50
	)
	default Color getDrakeFireBreathColor()
	{
		return new Color(217, 110, 33);
	}

	@ConfigItem(
			keyName = "highlightCerberusLavaPool",
			name = "Highlight lava pool attack",
			description = "Highlight the tiles for Cerberus's lava pool attack",
			group = "Cerberus",
			position = 51
	)
	default boolean highlightCerberusLavaPool()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "cerberusLavaPoolAttackColor",
			name = "Lava pool color",
			description = "Color of the tile marker for Cerberus's lava pool attack",
			group = "Cerberus",
			position = 52
	)
	default Color getCerberusLavaPoolAttackColor()
	{
		return new Color(214, 93, 29);
	}

	@ConfigItem(
			keyName = "highlightChaosFanaticGreenOrbs",
			name = "Highlight green orbs attack",
			description = "Highlight the tiles for the Chaos Fanatic's green orbs attack",
			group = "Chaos Fanatic",
			position = 53
	)
	default boolean highlightChaosFanaticGreenOrbs()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "chaosFanaticGreenOrbsColor",
			name = "Green orbs color",
			description = "Color of the tile marker for the Chaos Fanatic's green orbs attack",
			group = "Chaos Fanatic",
			position = 54
	)
	default Color getChaosFanaticGreenOrbsColor()
	{
		return new Color(43, 203, 99);
	}

	@ConfigItem(
			keyName = "highlightVetionLightning",
			name = "Highlight lightning attack",
			description = "Highlight the tiles for Vetion's lightning attack",
			group = "Vetion",
			position = 55
	)
	default boolean highlightVetionLightning()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "vetionLightningAttackColor",
			name = "Lightning attack color",
			description = "Color of the tile marker for the Chaos Fanatic's green orbs attack",
			group = "Vetion",
			position = 56
	)
	default Color getVetionLightningAttackColor()
	{
		return new Color(167, 192, 209);
	}

	@ConfigItem(
			keyName = "highlightDemonicGorillaBoulder",
			name = "Highlight boulder attack",
			description = "Highlight the tiles for Demonic Gorillas boulder attacks",
			group = "Demonic Gorillas",
			position = 57
	)
	default boolean highlightDemonicGorillaBoulder()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "demonicGorillasBoulderColor",
			name = "Boulder attack color",
			description = "Color of the tile marker for Demonic Gorillas boulder attacks",
			group = "Demonic Gorillas",
			position = 58
	)
	default Color getDemonicGorillasBoulderColor()
	{
		return new Color(100, 100, 80);
	}

	@ConfigItem(
			keyName = "highlightZalcanoGolemSpawn",
			name = "Highlight golem spawn",
			description = "Highlight the tiles for Zalcano's golem spawn",
			group = "Zalcano",
			position = 59
	)
	default boolean highlightZalcanoGolemSpawn()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "zalcanoGolemSpawnColor",
			name = "Golem spawn color",
			description = "Color of Zalcano's golem spawn tile marker",
			group = "Zalcano",
			position = 60
	)
	default Color getZalcanoGolemSpawnColor()
	{
		return new Color(232, 59, 35);
	}

	@ConfigItem(
			keyName = "highlightZulrahPoisonCloud",
			name = "Highlight poison clouds",
			description = "Highlight the tiles for Zulrah's poison clouds",
			group = "Zulrah",
			position = 61
	)
	default boolean highlightZulrahPoisonCloud()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "zulrahPoisonCloudsColor",
			name = "Poison clouds color",
			description = "Color of Zulrah's poison clouds tile marker",
			group = "Zulrah",
			position = 62
	)
	default Color getZulrahPoisonCloudsColor()
	{
		return new Color(56, 130, 110);
	}

	@ConfigItem(
			keyName = "highlightZulrahSnakelingSpawn",
			name = "Highlight snakeling spawns",
			description = "Highlight the tiles for Zulrah's snakeling spawns",
			group = "Zulrah",
			position = 63
	)
	default boolean highlightZulrahSnakelingSpawn()
	{
		return false;
	}

	@Alpha
	@ConfigItem(
			keyName = "zulrahSnakelingSpawnColor",
			name = "Snakeling spawn color",
			description = "Color of Zulrah's snakeling spawns tile marker",
			group = "Zulrah",
			position = 64
	)
	default Color getZulrahSnakelingSpawnColor()
	{
		return new Color(200, 199, 171);
	}

	@ConfigItem(
			keyName = "highlightMaidenBloodSplatAttack",
			name = "Highlight Maiden blood splat attack",
			description = "Highlight the tiles for the Sugadinti Maiden's blood splat attack",
			group = "Theatre of Blood",
			position = 65
	)
	default boolean highlightMaidenBloodSplatAttack()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "maidenBloodSplatAttackColor",
			name = "Blood splat color",
			description = "Color of the Sugadinti Maiden's blood splat attack tile marker",
			group = "Theatre of Blood",
			position = 66
	)
	default Color getMaidenBloodSplatAttackColor()
	{
		return new Color(163, 12, 12);
	}

	@ConfigItem(
			keyName = "highlightXarpusAcidAttack",
			name = "Highlight Xarpus acid ball attack",
			description = "Highlight the tiles for Xarpus's acid ball attacks",
			group = "Theatre of Blood",
			position = 67
	)
	default boolean highlightXarpusAcidAttack()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "xarpusAcidAttackColor",
			name = "Acid attack color",
			description = "Color of Xarpus's acid ball attack tile marker",
			group = "Theatre of Blood",
			position = 68
	)
	default Color getXarpusAcidAttackColor()
	{
		return new Color(185, 205, 22);
	}

	@ConfigItem(
			keyName = "highlightVerzikSkullAttack",
			name = "Highlight Verzik skull attack",
			description = "Highlight the tiles for Verzik Vitur's skull attacks",
			group = "Theatre of Blood",
			position = 69
	)
	default boolean highlightVerzikSkullAttack()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "verzikSkullAttackColor",
			name = "Skull attack color",
			description = "Color of Verzik Vitur's skull attack tile marker",
			group = "Theatre of Blood",
			position = 70
	)
	default Color getVerzikSkullAttackColor()
	{
		return new Color(121, 93, 134);
	}

	@ConfigItem(
			keyName = "highlightVerzikWebAttack",
			name = "Highlight Verzik web attack",
			description = "Highlight the tiles for Verzik Vitur's web attacks",
			group = "Theatre of Blood",
			position = 71
	)
	default boolean highlightVerzikWebAttack()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "verzikWebAttackColor",
			name = "Web attack color",
			description = "Color of Verzik Vitur's web attack tile marker",
			group = "Theatre of Blood",
			position = 72
	)
	default Color getVerzikWebAttackColor()
	{
		return new Color(110, 125, 23);
	}

	@ConfigItem(
			keyName = "highlightDuskFallingCeilingDebris",
			name = "Highlight falling ceiling attack",
			description = "Highlight the tiles for Dusk's falling ceiling debris attack during the Grotesque " +
					"Guardians encounter",
			group = "Grotesque Guardians",
			position = 73
	)
	default boolean highlightDuskFallingCeilingDebris()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "duskFallingCeilingDebrisColor",
			name = "Falling ceiling color",
			description = "Color of Dusk's falling ceiling debris attack tile marker during the Grotesque " +
					"Guardians encounter",
			group = "Grotesque Guardians",
			position = 74
	)
	default Color getDuskFallingCeilingDebrisColor()
	{
		return new Color(42, 96, 42);
	}

	@ConfigItem(
			keyName = "highlightDawnFreezeRock",
			name = "Highlight freeze rock attack",
			description = "Highlight the tiles for Dawn's freeze rock attack during the Grotesque Guardians encounter",
			group = "Grotesque Guardians",
			position = 75
	)
	default boolean highlightDawnFreezeRock()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "dawnFreezeRockColor",
			name = "Freeze rock color",
			description = "Color of Dawn's freeze rock attack tile marker during the Grotesque Guardians encounter",
			group = "Grotesque Guardians",
			position = 76
	)
	default Color getDawnFreezeRockColor()
	{
		return new Color(78, 47, 152);
	}

	@ConfigItem(
			keyName = "highlightAlchemicalHydraPoisonAttack",
			name = "Highlight poison attack",
			description = "Highlight the tiles for the Alchemical Hydra's poison ball attack",
			group = "Alchemical Hydra",
			position = 77
	)
	default boolean highlightAlchemicalHydraPoisonAttack()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "alchemicalHydraPoisonAttackColor",
			name = "Poison attack color",
			description = "Color of the Alchemical Hydra's poison ball attack tile marker",
			group = "Alchemical Hydra",
			position = 78
	)
	default Color getAlchemicalHydraPoisonAttackColor()
	{
		return new Color(159, 219, 0);
	}

	@ConfigItem(
			keyName = "highlightElvenTraitorExplosiveArrow",
			name = "Highlight explosive arrow attack",
			description = "Highlight the tile for the Elven Traitor's explosive arrow attack",
			group = "Elven Traitor",
			position = 79
	)
	default boolean highlightElvenTraitorExplosiveArrow()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "elvenTraitorExplosiveArrowColor",
			name = "Explosive arrow color",
			description = "Color of the Elven Traitor's explosive arrow attack tile marker",
			group = "Elven Traitor",
			position = 80
	)
	default Color getElvenTraitorExplosiveArrowColor()
	{
		return new Color(190, 138, 51);
	}

	@ConfigItem(
			keyName = "displayRemainingProjectileDuration",
			name = "Show remaining projectile duration",
			description = "Display the remaining time until a projectile hits the target area.",
			position = 81
	)
	default boolean displayRemainingProjectileDuration()
	{
		return true;
	}
}
