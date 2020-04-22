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

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("aoewarnings")
public interface AoeWarningsConfig extends Config
{
	@ConfigItem(
			keyName = "highlightCorporealBeastSplashAttackTiles",
			name = "Highlight splash attack tiles",
			description = "Highlight the tiles for the Corporeal Beast's splash attack",
			group = "Corporeal Beast"
	)
	default boolean highlightCorporealBeastAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "corporealBeastSplashAttackColor",
			name = "Splash attack marker",
			description = "Color of the Corporeal Beast's splash attack tile marker",
			group = "Corporeal Beast"
	)
	default Color getCorporealBeastSplashAttackColor()
	{
		return new Color(230, 228, 225);
	}

	@ConfigItem(
			keyName = "highlightDarkCoreLandingSpot",
			name = "Highlight dark core landing spot",
			description = "Highlight the landing spot when the Dark Core jumps during the Corporeal Beast encounter",
			group = "Corporeal Beast"
	)
	default boolean highlightDarkCoreLandingSpot()
	{
		return true;
	}

	@ConfigItem(
			keyName = "darkCoreLandingSpotColor",
			name = "Splash attack marker",
			description = "Color of the landing spot marker when the Dark Core jumps during the Corporeal Beast encounter",
			group = "Corporeal Beast"
	)
	default Color getDarkCoreLandingSpotColor()
	{
		return Color.RED;
	}

	@ConfigItem(
			keyName = "highlightDerangedArchaeologistBookAttackTiles",
			name = "Highlight book attack tiles",
			description = "Highlight the tiles for the Crazy/deranged Archaeologist's book attack",
			group = "Crazy/deranged Archaeologist"
	)
	default boolean highlightDerangedArchaeologistBookAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "derangedArchaeologistBookAttackColor",
			name = "Book attack marker",
			description = "Color of the Crazy/deranged Archaeologist's book attack tile marker",
			group = "Crazy/deranged Archaeologist"
	)
	default Color getDerangedArchaeologistBookAttackColor()
	{
		return new Color(253, 162, 0);
	}

	@ConfigItem(
			keyName = "highlightBasiliskKnightEntombAttackTiles",
			name = "Highlight entomb attack tiles",
			description = "Highlight the tiles for Basilisk Knights entomb attack",
			group = "Basilisk Knights"
	)
	default boolean highlightBasiliskKnightEntombAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "basiliskKnightsEntombAttackColor",
			name = "Entomb attack marker",
			description = "Color of Basilisk Knights entomb attack tile marker",
			group = "Basilisk Knights"
	)
	default Color getBasiliskKnightsEntombAttackColor()
	{
		return new Color(216, 47, 27);
	}

	@ConfigItem(
			keyName = "highlightShamansAcidAttackTiles",
			name = "Highlight acid attack tiles",
			description = "Highlight the tiles for the Lizardman Shamans acid attack",
			group = "Lizardman Shamans"
	)
	default boolean highlightShamansAcidAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "shamansAcidAttackColor",
			name = "Acid attack marker",
			description = "Color of Lizardman Shamans acid attack marker",
			group = "Lizardman Shamans"
	)
	default Color getShamansAcidAttackColor()
	{
		return new Color(82, 164, 101);
	}

	@ConfigItem(
			keyName = "highlightTektonMeteors",
			name = "Highlight meteors",
			description = "Highlight Tekton's meteor attack during the Anvil phase",
			group = "Chambers of Xeric"
	)
	default boolean highlightTektonMeteors()
	{
		return true;
	}

	@ConfigItem(
			keyName = "tektonMeteorsColor",
			name = "Meteors color",
			description = "Color of Tekton's meteor attack tile marker during the Anvil phase",
			group = "Chambers of Xeric"
	)
	default Color getTektonMeteorsColor()
	{
		return new Color(177, 86, 26);
	}

	@ConfigItem(
			keyName = "highlightIceDemonIceBoulders",
			name = "Highlight ice barrage attack",
			description = "Highlight Ice Demon's ice barrage attack",
			group = "Chambers of Xeric"
	)
	default boolean highlightIceDemonIceBarrage()
	{
		return true;
	}

	@ConfigItem(
			keyName = "iceDemonIceBarrageColor",
			name = "Ice barrage color",
			description = "Color of Ice Demon's ice barrage attack tile marker",
			group = "Chambers of Xeric"
	)
	default Color getIceDemonIceBarrageColor()
	{
		return new Color(224, 226, 230);
	}

	@ConfigItem(
			keyName = "highlightIceDemonIceBoulders",
			name = "Highlight ice boulders",
			description = "Highlight Ice Demon's ice boulder attack",
			group = "Chambers of Xeric"
	)
	default boolean highlightIceDemonIceBoulders()
	{
		return true;
	}

	@ConfigItem(
			keyName = "iceDemonIceBoulderColor",
			name = "Ice boulder color",
			description = "Color of Ice Demon's ice boulder attack tile marker",
			group = "Chambers of Xeric"
	)
	default Color getIceDemonIceBoulderColor()
	{
		return new Color(224, 226, 230);
	}

	@ConfigItem(
			keyName = "highlightGuardiansFallingRocks",
			name = "Highlight falling rocks",
			description = "Highlight the Guardians falling rock attack",
			group = "Chambers of Xeric"
	)
	default boolean highlightGuardiansFallingRocks()
	{
		return true;
	}

	@ConfigItem(
			keyName = "guardiansFallingRocksColor",
			name = "Falling rocks color",
			description = "Color of the Guardians falling rock tile marker",
			group = "Chambers of Xeric"
	)
	default Color getGuardiansFallingRocksColor()
	{
		return new Color(64, 104, 62);
	}

	@ConfigItem(
			keyName = "highlightVasaTeleportAttackTiles",
			name = "Highlight teleport attack tiles",
			description = "Highlight the tiles of Vasa Nistirio's teleport explosion attack",
			group = "Chambers of Xeric"
	)
	default boolean highlightVasaTeleportAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "vasaTeleportAttackColor",
			name = "Teleport attack marker",
			description = "Color of Vasa Nistirio teleport explosion attack marker",
			group = "Chambers of Xeric"
	)
	default Color getVasaTeleportAttackColor()
	{
		return new Color(150, 132, 222);
	}

	@ConfigItem(
			keyName = "highlightVasaBoulderAttackTiles",
			name = "Highlight boulder attack tiles",
			description = "Highlight the boulder attack tiles during the Vasa Nistirio encounter",
			group = "Chambers of Xeric"
	)
	default boolean highlightVasaBoulderAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "vasaBoulderAttackColor",
			name = "Boulder attack marker",
			description = "Color of Vasa Nistirio boulder attack marker",
			group = "Chambers of Xeric"
	)
	default Color getVasaBoulderAttackColor()
	{
		return new Color(113, 107, 107);
	}

	@ConfigItem(
			keyName = "highlightOlmFallingCrystals",
			name = "Highlight falling crystals",
			description = "Highlight the tiles of the falling crystals during the last phase of the Great Olm encounter",
			group = "Chambers of Xeric"
	)
	default boolean highlightOlmFallingCrystals()
	{
		return true;
	}

	@ConfigItem(
			keyName = "olmFallingCrystalsColor",
			name = "Falling crystal color",
			description = "Color of the falling crystals tile markers during the last phase of the Great Olm encounter",
			group = "Chambers of Xeric"
	)
	default Color getOlmFallingCrystalsColor()
	{
		return new Color(138, 173, 38);
	}

	@ConfigItem(
			keyName = "highlightOlmFallingSpikes",
			name = "Highlight falling spikes",
			description = "Highlight the tiles of the falling spikes during the Great Olm encounter",
			group = "Chambers of Xeric"
	)
	default boolean highlightOlmFallingSpikes()
	{
		return true;
	}

	@ConfigItem(
			keyName = "olmFallingSpikesColor",
			name = "Falling spike color",
			description = "Color of the falling spike attack tile markers during the Great Olm encounter",
			group = "Chambers of Xeric"
	)
	default Color getOlmFallingSpikesColor()
	{
		return new Color(167, 67, 45);
	}

	@ConfigItem(
			keyName = "highlightOlmHealingPools",
			name = "Highlight healing pools",
			description = "Highlight the tiles of healing pools during the Great Olm encounter",
			group = "Chambers of Xeric"
	)
	default boolean highlightOlmHealingPools()
	{
		return true;
	}

	@ConfigItem(
			keyName = "olmHealingPoolsColor",
			name = "Healing pools color",
			description = "Color of the of healing pools tile markers during the Great Olm encounter",
			group = "Chambers of Xeric"
	)
	default Color getOlmHealingPoolsColor()
	{
		return new Color(143, 197, 203);
	}

	@ConfigItem(
			keyName = "highlightOlmAcidPools",
			name = "Highlight acid pools",
			description = "Highlight the tiles of acid pools during the Great Olm encounter",
			group = "Chambers of Xeric"
	)
	default boolean highlightOlmAcidPools()
	{
		return true;
	}

	@ConfigItem(
			keyName = "olmAcidPoolsColor",
			name = "Healing pools color",
			description = "Color of the of acid pools tile markers during the Great Olm encounter",
			group = "Chambers of Xeric"
	)
	default Color getOlmAcidPoolsColor()
	{
		return new Color(68, 126, 45);
	}

	@ConfigItem(
			keyName = "highlightVorkathFirebombTiles",
			name = "Highlight firebomb attack",
			description = "Highlight the tiles where Vorkath's firebomb is going to land",
			group = "Vorkath"
	)
	default boolean highlightVorkathFirebombTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "vorkathFirebombMarkerColor",
			name = "Firebomb tile marker",
			description = "Color of Vorkath's firebomb markers",
			group = "Vorkath"
	)
	default Color getVorkathFirebombMarkerColor()
	{
		return new Color(226, 126, 35);
	}

	@ConfigItem(
			keyName = "highlightVorkathFireballTiles",
			name = "Highlight fireball attack",
			description = "Highlight the landing spot tiles for Vorkath's acid phase fireball attack",
			group = "Vorkath"
	)
	default boolean highlightVorkathFireballTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "vorkathFireballMarkerColor",
			name = "Firebomb tile marker",
			description = "Color of Vorkath's fireball markers during the acid phase",
			group = "Vorkath"
	)
	default Color getVorkathFireballMarkerColor()
	{
		return new Color(237, 190, 36);
	}

	@ConfigItem(
			keyName = "highlightVorkathAcidPhaseTiles",
			name = "Highlight acid phase attack",
			description = "Highlight the landing spot tiles for Vorkath's acid phase attack",
			group = "Vorkath"
	)
	default boolean highlightVorkathAcidPhaseTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "vorkathAcidPhaseMarkerColor",
			name = "Acid phase tile marker",
			description = "Color of Vorkath's acid attack markers at the start of the acid phase",
			group = "Vorkath"
	)
	default Color getVorkathAcidPhaseMarkerColor()
	{
		return new Color(74, 178, 23);
	}

	@ConfigItem(
			keyName = "highlightVorkathZombifiedSpawnTiles",
			name = "Highlight zombified spawn attack",
			description = "Highlight the landing spot tiles for Vorkath's zombified spawn",
			group = "Vorkath"
	)
	default boolean highlightVorkathZombifiedSpawnTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "vorkathZombifiedSpawnMarkerColor",
			name = "Zombified spawn marker",
			description = "Color of Vorkath's initial zombified spawn marker",
			group = "Vorkath"
	)
	default Color getVorkathZombifiedSpawnMarkerColor()
	{
		return new Color(80, 147, 133);
	}

	@ConfigItem(
			keyName = "highlightVorkathZombifiedSpawnTiles",
			name = "Highlight falling mines",
			description = "Highlight the landing spot tiles for Galvek's falling mine attack",
			group = "Galvek"
	)
	default boolean highlightGalvekMine()
	{
		return true;
	}

	@ConfigItem(
			keyName = "galvekMineColor",
			name = "Falling mine color",
			description = "Color of Galvek's falling mine attack marker",
			group = "Galvek"
	)
	default Color getGalvekMineColor()
	{
		return new Color(84, 48, 46);
	}

	@ConfigItem(
			keyName = "highlightGalvekFirebomb",
			name = "Highlight firebomb",
			description = "Highlight the landing spot tiles for Galvek's firebomb attack",
			group = "Galvek"
	)
	default boolean highlightGalvekFirebomb()
	{
		return true;
	}

	@ConfigItem(
			keyName = "galvekFirebombColor",
			name = "Firebomb color",
			description = "Color of Galvek's firebomb attack marker",
			group = "Galvek"
	)
	default Color getGalvekFirebombColor()
	{
		return new Color(226, 126, 35);
	}

	@ConfigItem(
			keyName = "highlightWintertodtSnowfall",
			name = "Highlight snowfall",
			description = "Highlight the tiles for the snowfall attack during the Wintertodt encounter",
			group = "Wintertodt"
	)
	default boolean highlightWintertodtSnowfall()
	{
		return true;
	}

	@ConfigItem(
			keyName = "wintertodtSnowfallColor",
			name = "snowfall color",
			description = "Color of snowfall attack marker during the Wintertodt encounter",
			group = "Wintertodt"
	)
	default Color getWintertodtSnowfallColor()
	{
		return new Color(0, 196, 226);
	}

	@ConfigItem(
			keyName = "highlightMarbleGargoyleStoneBall",
			name = "Highlight marble gargoyle stone ball",
			description = "Highlight the tile for the Marble Gargoyle's stone ball attack",
			group = "Slayer"
	)
	default boolean highlightMarbleGargoyleStoneBall()
	{
		return true;
	}

	@ConfigItem(
			keyName = "marbleGargoyleStoneBallColor",
			name = "Stone ball color",
			description = "Color of the tile marker for the Marble Gargoyle's stone ball attack",
			group = "Slayer"
	)
	default Color getMarbleGargoyleStoneBallColor()
	{
		return new Color(122, 44, 30);
	}

	@ConfigItem(
			keyName = "highlightAdamantDragonPoisonAttack",
			name = "Highlight adamant dragon poison attack",
			description = "Highlight the tiles for adamant dragon poison attacks",
			group = "Slayer"
	)
	default boolean highlightAdamantDragonPoisonAttack()
	{
		return true;
	}

	@ConfigItem(
			keyName = "adamantDragonPoisonAttackColor",
			name = "Poison attack color",
			description = "Color of the adamant dragon poison attack tile marker",
			group = "Slayer"
	)
	default Color getAdamantDragonPoisonAttackColor()
	{
		return new Color(97, 170, 108);
	}

	@ConfigItem(
			keyName = "highlightDrakeFireBreath",
			name = "Highlight drake fire breath",
			description = "Highlight the tiles for drake fire breath attacks",
			group = "Slayer"
	)
	default boolean highlightDrakeFireBreath()
	{
		return true;
	}

	@ConfigItem(
			keyName = "drakeFireBreathColor",
			name = "Fire breath color",
			description = "Color of the tile marker for drake fire breath attacks",
			group = "Slayer"
	)
	default Color getDrakeFireBreathColor()
	{
		return new Color(217, 110, 33);
	}

	@ConfigItem(
			keyName = "highlightCerberusLavaPool",
			name = "Highlight lava pool attack",
			description = "Highlight the tiles for Cerberus's lava pool attack",
			group = "Cerberus"
	)
	default boolean highlightCerberusLavaPool()
	{
		return true;
	}

	@ConfigItem(
			keyName = "cerberusLavaPoolAttackColor",
			name = "Lava pool color",
			description = "Color of the tile marker for Cerberus's lava pool attack",
			group = "Cerberus"
	)
	default Color getCerberusLavaPoolAttackColor()
	{
		return new Color(214, 93, 29);
	}

	@ConfigItem(
			keyName = "highlightChaosFanaticGreenOrbs",
			name = "Highlight green orbs attack",
			description = "Highlight the tiles for the Chaos Fanatic's green orbs attack",
			group = "Chaos Fanatic"
	)
	default boolean highlightChaosFanaticGreenOrbs()
	{
		return true;
	}

	@ConfigItem(
			keyName = "chaosFanaticGreenOrbsColor",
			name = "Green orbs color",
			description = "Color of the tile marker for the Chaos Fanatic's green orbs attack",
			group = "Chaos Fanatic"
	)
	default Color getChaosFanaticGreenOrbsColor()
	{
		return new Color(43, 203, 99);
	}

	@ConfigItem(
			keyName = "highlightVetionLightning",
			name = "Highlight lightning attack",
			description = "Highlight the tiles for Vetion's lightning attack",
			group = "Vetion"
	)
	default boolean highlightVetionLightning()
	{
		return true;
	}

	@ConfigItem(
			keyName = "vetionLightningAttackColor",
			name = "Lightning attack color",
			description = "Color of the tile marker for the Chaos Fanatic's green orbs attack",
			group = "Vetion"
	)
	default Color getVetionLightningAttackColor()
	{
		return new Color(167, 192, 209);
	}

	@ConfigItem(
			keyName = "highlightDemonicGorillaBoulder",
			name = "Highlight boulder attack",
			description = "Highlight the tiles for Demonic Gorillas boulder attacks",
			group = "Demonic Gorillas"
	)
	default boolean highlightDemonicGorillaBoulder()
	{
		return true;
	}

	@ConfigItem(
			keyName = "demonicGorillasBoulderColor",
			name = "Boulder attack color",
			description = "Color of the tile marker for Demonic Gorillas boulder attacks",
			group = "Demonic Gorillas"
	)
	default Color getDemonicGorillasBoulderColor()
	{
		return new Color(100, 100, 80);
	}

	@ConfigItem(
			keyName = "highlightZalcanoGolemSpawn",
			name = "Highlight golem spawn",
			description = "Highlight the tiles for Zalcano's golem spawn",
			group = "Zalcano"
	)
	default boolean highlightZalcanoGolemSpawn()
	{
		return true;
	}

	@ConfigItem(
			keyName = "zalcanoGolemSpawnColor",
			name = "Golem spawn color",
			description = "Color of Zalcano's golem spawn tile marker",
			group = "Zalcano"
	)
	default Color getZalcanoGolemSpawnColor()
	{
		return new Color(232, 59, 35);
	}

	@ConfigItem(
			keyName = "highlightZulrahPoisonCloud",
			name = "Highlight poison clouds",
			description = "Highlight the tiles for Zulrah's poison clouds",
			group = "Zulrah"
	)
	default boolean highlightZulrahPoisonCloud()
	{
		return true;
	}

	@ConfigItem(
			keyName = "zulrahPoisonCloudsColor",
			name = "Poison clouds color",
			description = "Color of Zulrah's poison clouds tile marker",
			group = "Zulrah"
	)
	default Color getZulrahPoisonCloudsColor()
	{
		return new Color(56, 130, 110);
	}

	@ConfigItem(
			keyName = "highlightZulrahSnakelingSpawn",
			name = "Highlight snakeling spawns",
			description = "Highlight the tiles for Zulrah's snakeling spawns",
			group = "Zulrah"
	)
	default boolean highlightZulrahSnakelingSpawn()
	{
		return false;
	}

	@ConfigItem(
			keyName = "zulrahSnakelingSpawnColor",
			name = "Snakeling spawn color",
			description = "Color of Zulrah's snakeling spawns tile marker",
			group = "Zulrah"
	)
	default Color getZulrahSnakelingSpawnColor()
	{
		return new Color(200, 199, 171);
	}

	@ConfigItem(
			keyName = "highlightMaidenBloodSplatAttack",
			name = "Highlight blood splat attack",
			description = "Highlight the tiles for the Sugadinti Maiden's blood splat attack",
			group = "Theatre of Blood"
	)
	default boolean highlightMaidenBloodSplatAttack()
	{
		return false;
	}

	@ConfigItem(
			keyName = "maidenBloodSplatAttackColor",
			name = "Blood splat color",
			description = "Color of the Sugadinti Maiden's blood splat attack tile marker",
			group = "Theatre of Blood"
	)
	default Color getMaidenBloodSplatAttackColor()
	{
		return new Color(163, 12, 12);
	}

	@ConfigItem(
			keyName = "displayRemainingProjectileDuration",
			name = "Show remaining projectile duration",
			description = "Display the remaining time until a projectile hits the target area."
	)
	default boolean displayRemainingProjectileDuration()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays debug overlay. This contains information that plugin functions on",
			position = 28
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
