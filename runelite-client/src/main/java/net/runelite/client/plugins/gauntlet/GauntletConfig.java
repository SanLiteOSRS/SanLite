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
			position = 1,
			keyName = "showAttackStyleCounter",
			name = "Show attack style counter",
			description = "Displays the Gauntlet boss next attack above it's health bar"
	)
	default boolean showAttackStyleCounter()
	{
		return true;
	}

	@ConfigItem(
			position = 2,
			keyName = "highlightCrystalAttackTiles",
			name = "Highlight crystals tiles",
			description = "Highlight the tiles for the Gauntlet boss crystals"
	)
	default boolean highlightCrystalAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "crystalAttackColor",
			name = "Crystals marker",
			description = "Color of Gauntlet boss crystals marker"
	)
	default Color getCrystalAttackColor()
	{
		return new Color(166, 5, 219);
	}

	@ConfigItem(
			position = 4,
			keyName = "showResourceSpotsObjectMarkers",
			name = "Display resource spot object marker",
			description = "Configures whether the resource spots objects are highlighted",
			group = "Resource spots"
	)
	default boolean showResourceSpotsObjectMarkers()
	{
		return true;
	}

	@ConfigItem(
			position = 5,
			keyName = "showResourceSpotsTiles",
			name = "Display resource spot tiles",
			description = "Configures whether tiles for resource spots are highlighted",
			group = "Resource spots"
	)
	default boolean showResourceSpotsTiles()
	{
		return false;
	}

	@ConfigItem(
			position = 7,
			keyName = "showResourceSpotsNames",
			name = "Display resource spot names",
			description = "Configures whether names for resource spots are displayed",
			group = "Resource spots"
	)
	default boolean showResourceSpotsNames()
	{
		return false;
	}

	@ConfigItem(
			position = 8,
			keyName = "showResourceSpotsOnMinimap",
			name = "Display resource spot on minimap",
			description = "Configures whether resource spots are displayed on the minimap",
			group = "Resource spots"
	)
	default boolean showResourceSpotsOnMinimap()
	{
		return true;
	}

	@ConfigItem(
			position = 9,
			keyName = "paddlefishSpotColor",
			name = "Paddlefish spot color",
			description = "Color of paddlefish fishing spots tile markers",
			group = "Resource spots"
	)
	default Color getPaddlefishSpotColor()
	{
		return new Color(0, 162, 162);
	}

	@ConfigItem(
			position = 10,
			keyName = "crystalDepositColor",
			name = "Crystal deposit color",
			description = "Color of crystal deposit spots tile markers",
			group = "Resource spots"
	)
	default Color getCrystalDepositColor()
	{
		return new Color(152, 107, 61);
	}

	@ConfigItem(
			position = 11,
			keyName = "grymRootColor",
			name = "Grym root color",
			description = "Color of grym root spots tile markers",
			group = "Resource spots"
	)
	default Color getGrymRootColor()
	{
		return new Color(11, 102, 15, 255);
	}

	@ConfigItem(
			position = 12,
			keyName = "phrenRootsColor",
			name = "Phren roots color",
			description = "Color of phren roots spots tile markers",
			group = "Resource spots"
	)
	default Color getPhrenRootsColor()
	{
		return new Color(91, 219, 1, 255);
	}

	@ConfigItem(
			position = 13,
			keyName = "linumTirinumColor",
			name = "Linum Tirinum color",
			description = "Color of linum tirinum spots tile markers",
			group = "Resource spots"
	)
	default Color getLinumTirinumColor()
	{
		return new Color(217, 219, 199, 255);
	}

	@ConfigItem(
			position = 14,
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays Gauntlet boss debug overlay. This contains variables that the plugin uses to function"
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
