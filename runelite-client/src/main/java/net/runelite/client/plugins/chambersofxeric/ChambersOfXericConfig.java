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
package net.runelite.client.plugins.chambersofxeric;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("chambersofxeric")
public interface ChambersOfXericConfig extends Config
{
	@ConfigItem(
			keyName = "highlightShamansAcidAttackTiles",
			name = "Highlight acid attack tiles",
			description = "Highlight the acid attacks tiles during the Lizardman Shamans encounter",
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

//	@ConfigItem(
//			keyName = "displayVasaNistirioAttackTimer",
//			name = "Display attack timer",
//			description = "Displays a timer which shows the ticks until Vasa Nistirio's next attack",
//			group = "Vasa Nistirio"
//	)
//	default boolean displayAttackTimer()
//	{
//		return true;
//	}

	@ConfigItem(
			keyName = "highlightVasaBoulderAttackTiles",
			name = "Highlight boulder attack tiles",
			description = "Highlight the boulder attack tiles during the Vasa Nistirio encounter",
			group = "Vasa Nistirio"
	)
	default boolean highlightVasaBoulderAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "boulderAttackColor",
			name = "Boulder attack marker",
			description = "Color of Vasa Nistirio boulder attack marker",
			group = "Vasa Nistirio"
	)
	default Color getVasaBoulderAttackColor()
	{
		return new Color(113, 107, 107);
	}

	@ConfigItem(
			keyName = "highlightVasaTeleportAttackTiles",
			name = "Highlight teleport attack tiles",
			description = "Highlight the tiles of Vasa Nistirio's teleport explosion attack",
			group = "Vasa Nistirio"
	)
	default boolean highlightVasaTeleportAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "vasaTeleportAttackColor",
			name = "Teleport attack marker",
			description = "Color of Vasa Nistirio teleport explosion attack marker",
			group = "Vasa Nistirio"
	)
	default Color getVasaTeleportAttackColor()
	{
		return new Color(150, 132, 222);
	}

	@ConfigItem(
			keyName = "highlightVasaActiveCrystal",
			name = "Highlight active crystal",
			description = "Highlight the active crystal during the Vasa Nistirio encounter",
			group = "Vasa Nistirio"
	)
	default boolean highlightVasaActiveCrystal()
	{
		return true;
	}

	@ConfigItem(
			keyName = "activeCrystalColor",
			name = "Active crystal color",
			description = "Color of the active crystal during the Vasa Nistirio encounter",
			group = "Vasa Nistirio"
	)
	default Color getVasaActiveCrystalColor()
	{
		return new Color(91, 51, 231);
	}

//	@ConfigItem(
//			keyName = "displayRemainingActiveCrystalDuration",
//			name = "Show remaining crystal duration",
//			description = "Display the remaining duration of the active crystal during the Vasa Nistirio encounter",
//			group = "Vasa Nistirio"
//	)
//	default boolean displayRemainingActiveCrystalDuration()
//	{
//		return true;
//	}
//
//	@ConfigItem(
//			keyName = "highlightVasaNistirioDamageArea",
//			name = "Highlight Vasa Nistirio damage area",
//			description = "Highlight the tiles in which Vasa Nistirio will damage you for walking under him",
//			group = "Vasa Nistirio"
//	)
//	default boolean highlightVasaNistirioDamageArea()
//	{
//		return true;
//	}

//	@ConfigItem(
//			keyName = "vasaNistirioDamageAreaColor",
//			name = "Damage area color",
//			description = "Color of the area marker in which Vasa Nistirio will damage you for walking under him",
//			group = "Vasa Nistirio"
//	)
//	default Color getVasaNistirioDamageAreaColor()
//	{
//		return new Color(171, 0, 10);
//	}

	@ConfigItem(
			keyName = "highlightGuardiansFallingRocks",
			name = "Highlight falling rocks",
			description = "Highlight the Guardians falling rock attack",
			group = "Guardians"
	)
	default boolean highlightGuardiansFallingRocks()
	{
		return true;
	}

	@ConfigItem(
			keyName = "guardiansFallingRocksColor",
			name = "Falling rocks color",
			description = "Color of the Guardians falling rock tile marker",
			group = "Guardians"
	)
	default Color getGuardiansFallingRocksColor()
	{
		return new Color(64, 104, 62);
	}

//	@ConfigItem(
//			keyName = "highlightGuardiansDamageArea",
//			name = "Highlight Vasa Nistirio damage area",
//			description = "Highlight the area in which the Guardians will damage you and drop rocks",
//			group = "Vasa Nistirio"
//	)
//	default boolean highlightGuardiansDamageArea()
//	{
//		return true;
//	}
//
//	@ConfigItem(
//			keyName = "guardiansDamageAreaColor",
//			name = "Damage area color",
//			description = "Color of the area marker in which the Guardians will damage you and drop rocks",
//			group = "Vasa Nistirio"
//	)
//	default Color getGuardiansDamageAreaColor()
//	{
//		return new Color(171, 0, 10);
//	}

	@ConfigItem(
			keyName = "highlightTektonMeteors",
			name = "Highlight meteors",
			description = "Highlight Tekton's meteor attack during the Anvil phase",
			group = "Tekton"
	)
	default boolean highlightTektonMeteors()
	{
		return true;
	}

	@ConfigItem(
			keyName = "tektonMeteorsColor",
			name = "Meteors color",
			description = "Color of Tekton's meteor attack tile marker during the Anvil phase",
			group = "Tekton"
	)
	default Color getTektonMeteorsColor()
	{
		return new Color(177, 86, 26);
	}

	@ConfigItem(
			keyName = "highlightIceDemonIceBoulders",
			name = "Highlight ice boulders",
			description = "Highlight Ice Demon's ice boulder attack",
			group = "Ice Demon"
	)
	default boolean highlightIceDemonIceBoulders()
	{
		return true;
	}

	@ConfigItem(
			keyName = "iceDemonIceBoulderColor",
			name = "Ice boulder color",
			description = "Color of Ice Demon's ice boulder attack tile marker",
			group = "Ice Demon"
	)
	default Color getIceDemonIceBoulderColor()
	{
		return new Color(224, 226, 230);
	}

	@ConfigItem(
			keyName = "highlightOlmFallingCrystals",
			name = "Highlight falling crystals",
			description = "Highlight the tiles of the falling crystals during the last phase of the Great Olm encounter",
			group = "The Great Olm"
	)
	default boolean highlightOlmFallingCrystals()
	{
		return true;
	}

	@ConfigItem(
			keyName = "olmFallingCrystalsColor",
			name = "Falling crystal color",
			description = "Color of the falling crystals tile markers during the last phase of the Great Olm encounter",
			group = "The Great Olm"
	)
	default Color getOlmFallingCrystalsColor()
	{
		return new Color(138, 173, 38);
	}

	@ConfigItem(
			keyName = "highlightOlmFallingSpikes",
			name = "Highlight falling spikes",
			description = "Highlight the tiles of the falling spikes during the Great Olm encounter",
			group = "The Great Olm"
	)
	default boolean highlightOlmFallingSpikes()
	{
		return true;
	}

	@ConfigItem(
			keyName = "olmFallingSpikesColor",
			name = "Falling spike color",
			description = "Color of the falling spike attack tile markers during the Great Olm encounter",
			group = "The Great Olm"
	)
	default Color getOlmFallingSpikesColor()
	{
		return new Color(167, 67, 45);
	}

	@ConfigItem(
			keyName = "highlightOlmHealingPools",
			name = "Highlight healing pools",
			description = "Highlight the tiles of healing pools during the Great Olm encounter",
			group = "The Great Olm"
	)
	default boolean highlightOlmHealingPools()
	{
		return true;
	}

	@ConfigItem(
			keyName = "olmHealingPoolsColor",
			name = "Healing pools color",
			description = "Color of the of healing pools tile markers during the Great Olm encounter",
			group = "The Great Olm"
	)
	default Color getOlmHealingPoolsColor()
	{
		return new Color(143, 197, 203);
	}

	@ConfigItem(
			keyName = "highlightOlmAcidPools",
			name = "Highlight acid pools",
			description = "Highlight the tiles of acid pools during the Great Olm encounter",
			group = "The Great Olm"
	)
	default boolean highlightOlmAcidPools()
	{
		return true;
	}

	@ConfigItem(
			keyName = "olmAcidPoolsColor",
			name = "Healing pools color",
			description = "Color of the of acid pools tile markers during the Great Olm encounter",
			group = "The Great Olm"
	)
	default Color getOlmAcidPoolsColor()
	{
		return new Color(68, 126, 45);
	}

	@ConfigItem(
			keyName = "highlightOlmLightning",
			name = "Highlight lightning",
			description = "Highlight the tiles of lightning during the Great Olm encounter",
			group = "The Great Olm"
	)
	default boolean highlightOlmLightning()
	{
		return true;
	}

	@ConfigItem(
			keyName = "olmLightningColor",
			name = "Healing pools color",
			description = "Color of the of lightning tile markers during the Great Olm encounter",
			group = "The Great Olm"
	)
	default Color getOlmLightningColor()
	{
		return new Color(162, 209, 33);
	}

//	@ConfigItem(
//			keyName = "highlightOlmCrystalGroundSpikes",
//			name = "Highlight crystal ground spikes",
//			description = "Highlight the tiles of crystal ground spikes during the Great Olm encounter",
//			group = "The Great Olm"
//	)
//	default boolean highlightOlmCrystalGroundSpikes()
//	{
//		return true;
//	}
//
//	@ConfigItem(
//			keyName = "olmCrystalGroundSpikesColor",
//			name = "Crystal ground spikes color",
//			description = "Color of the of acid pools during the Great Olm encounter",
//			group = "The Great Olm"
//	)
//	default Color getOlmCrystalGroundSpikesColor()
//	{
//		return new Color(194, 235, 73);
//	}

	@ConfigItem(
			keyName = "displayRemainingProjectileDuration",
			name = "Show remaining projectile duration",
			description = "Display the remaining time until a projectile hits the area."
	)
	default boolean displayRemainingProjectileDuration()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays Chambers of Xeric debug overlay. This contains variables that the plugin uses " +
					"to function",
			position = 28
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
