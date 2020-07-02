/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
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
package net.runelite.client.plugins.alchemicalhydra;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("Alchemical Hydra")
public interface AlchemicalHydraConfig extends Config
{
	@ConfigSection(
			name = "Colors",
			description = "Options for colors used throughout the plugin",
			position = 11
	)
	String colorsSection = "colors";

	@ConfigItem(
			keyName = "showAttackStyleCounter",
			name = "Show attack style counter",
			description = "Displays the Alchemical Hydra's next attack above it's health bar",
			position = 1
	)
	default boolean showAttackStyleCounter()
	{
		return true;
	}

	@ConfigItem(
			keyName = "displayAttackTimer",
			name = "Display attack timer",
			description = "Displays a timer which shows the ticks until the Alchemical Hydra's next attack",
			position = 2
	)
	default boolean displayAttackTimer()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "attackTimerTextColor",
			name = "Attack timer text color",
			description = "Color of attack timer text",
			section = colorsSection,
			position = 3
	)
	default Color getAttackTimerTextColor()
	{
		return new Color(255, 255, 255);
	}

	@ConfigItem(
			keyName = "highlightSpecialAttackTiles",
			name = "Highlight special attack tiles",
			description = "Highlight the tiles for the Alchemical Hydra's poison, lightning and fire attacks",
			position = 4
	)
	default boolean highlightSpecialAttackTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "poisonAttackColor",
			name = "Poison attack marker",
			description = "Color of Alchemical Hydra's poison special attack marker",
			section = colorsSection,
			position = 4
	)
	default Color getPoisonAttackColor()
	{
		return new Color(159, 219, 0);
	}

	@Alpha
	@ConfigItem(
			keyName = "lightningAttackColor",
			name = "Lightning marker",
			description = "Color of Alchemical Hydra's lightning special attack marker",
			section = colorsSection,
			position = 5
	)
	default Color getLightningAttackColor()
	{
		return new Color(3, 133, 219);
	}

	@Alpha
	@ConfigItem(
			keyName = "fireAttackColor",
			name = "Fire marker",
			description = "Color of Alchemical Hydra's fire special attack marker",
			section = colorsSection,
			position = 6
	)
	default Color getFireAttackColor()
	{
		return new Color(219, 116, 0, 150);
	}

	@Alpha
	@ConfigItem(
			keyName = "notOnChemicalPoolColor",
			name = "Not on fountain marker",
			description = "Color of chemical fountain marker while the Alchemical Hydra is not on it",
			section = colorsSection,
			position = 7
	)
	default Color getNotOnChemicalPoolColor()
	{
		return new Color(Color.RED.getRGB());
	}

	@Alpha
	@ConfigItem(
			keyName = "onChemicalPoolColor",
			name = "On fountain marker",
			description = "Color of chemical fountain marker while the Alchemical Hydra is on it",
			section = colorsSection,
			position = 8
	)
	default Color getOnChemicalPoolColor()
	{
		return new Color(Color.GREEN.getRGB());
	}

	@ConfigItem(
			keyName = "highlightChemicalVentStatus",
			name = "Highlight chemical vent status",
			description = "Highlight the chemical vent area for the current phase and if the boss is in the area",
			position = 5
	)
	default boolean highlightChemicalVentStatus()
	{
		return true;
	}

	@ConfigItem(
			keyName = "displayChemicalVentsTimer",
			name = "Display chemical vents timer",
			description = "Displays a timer to show the time till the next chemical vent activation",
			position = 9
	)
	default boolean displayChemicalVentsTimer()
	{
		return true;
	}

	@ConfigItem(
			keyName = "tileMarkersLineSize",
			name = "Tile markers line size",
			description = "The size of the outside line for tile markers",
			position = 10
	)
	default StrokeSize getTileMarkersLineSize()
	{
		return StrokeSize.NORMAL;
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays plugin debug overlay. This displays variables that the plugin uses to function",
			position = 11
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
