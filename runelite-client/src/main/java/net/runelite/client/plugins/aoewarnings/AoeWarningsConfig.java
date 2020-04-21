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
			keyName = "displayRemainingProjectileDuration",
			name = "Show remaining projectile duration",
			description = "Display the remaining time until a projectile hits the target area."
	)
	default boolean displayRemainingProjectileDuration()
	{
		return true;
	}

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
			keyName = "highlightDerangedArchaeologistBookAttackTiles",
			name = "Highlight book attack tiles",
			description = "Highlight the tiles for the Deranged Archaeologist's book attack",
			group = "Deranged Archaeologist"
	)
	default boolean highlightDerangedArchaeologistBookAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "derangedArchaeologistBookAttackColor",
			name = "Book attack marker",
			description = "Color of the Deranged Archaeologist's book attack tile marker",
			group = "Deranged Archaeologist"
	)
	default Color getDerangedArchaeologistBookAttackColor()
	{
		return new Color(113, 107, 107);
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
		return new Color(113, 107, 107);
	}

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
