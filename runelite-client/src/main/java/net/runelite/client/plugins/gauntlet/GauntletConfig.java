/*
 * Copyright (c) 2018, Cas <https://github.com/casvandongen>
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
package net.runelite.client.plugins.gauntlet;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("Gauntlet Boss")
public interface GauntletConfig extends Config
{
	@ConfigItem(
			keyName = "showAttackStyleCounter",
			name = "Show attack style counter",
			description = "Displays the Gauntlet boss next attack above it's health bar",
			position = 1
	)
	default boolean showAttackStyleCounter()
	{
		return true;
	}

	@ConfigItem(
			keyName = "highlightCrystalAttackTiles",
			name = "Highlight crystals tiles",
			description = "Highlight the tiles for the Gauntlet boss crystals",
			position = 2
	)
	default boolean highlightCrystalAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "crystalAttackColor",
			name = "Crystals marker",
			description = "Color of Gauntlet boss crystals marker",
			position = 3
	)
	default Color getCrystalAttackColor()
	{
		return new Color(166, 5, 219);
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays Gauntlet boss debug overlay. This contains variables that the plugin uses to function",
			position = 4
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
