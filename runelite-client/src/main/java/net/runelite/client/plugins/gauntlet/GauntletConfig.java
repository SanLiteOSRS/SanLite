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
package net.runelite.client.plugins.gauntlet;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("Gauntlet Boss")
public interface GauntletConfig extends Config
{
	@ConfigSection(
			name = "Resource spots",
			description = "Options for highlighting resource spots in the Gauntlet",
			position = 20
	)
	String resourceSpotsSection = "resourceSpots";

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
			section = resourceSpotsSection
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
			section = resourceSpotsSection
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
			section = resourceSpotsSection
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
			section = resourceSpotsSection
	)
	default boolean showResourceSpotsOnMinimap()
	{
		return true;
	}

	@ConfigItem(
			position = 9,
			keyName = "showPaddlefishSpots",
			name = "Display paddlefish markers",
			description = "Configures whether paddlefish spots are displayed with the resource spot markers",
			section = resourceSpotsSection
	)
	default boolean showPaddlefishSpots()
	{
		return true;
	}

	@ConfigItem(
			position = 10,
			keyName = "paddlefishSpotColor",
			name = "Paddlefish spot color",
			description = "Color of paddlefish fishing spots resource spot markers",
			section = resourceSpotsSection
	)
	default Color getPaddlefishSpotColor()
	{
		return new Color(14, 189, 185);
	}


	@ConfigItem(
			position = 11,
			keyName = "showCrystalDeposits",
			name = "Display crystal deposit markers",
			description = "Configures whether crystal deposits are displayed with the resource spot markers",
			section = resourceSpotsSection
	)
	default boolean showCrystalDeposits()
	{
		return true;
	}

	@ConfigItem(
			position = 12,
			keyName = "crystalDepositColor",
			name = "Crystal deposit color",
			description = "Color of crystal deposit spots resource spot markers",
			section = resourceSpotsSection
	)
	default Color getCrystalDepositColor()
	{
		return new Color(189, 144, 101);
	}

	@ConfigItem(
			position = 13,
			keyName = "showGrymRoots",
			name = "Display Grym roots markers",
			description = "Configures whether Grym roots are displayed with the resource spot markers",
			section = resourceSpotsSection
	)
	default boolean showGrymRoots()
	{
		return true;
	}

	@ConfigItem(
			position = 14,
			keyName = "grymRootColor",
			name = "Grym root color",
			description = "Color of grym root spots resource spot markers",
			section = resourceSpotsSection
	)
	default Color getGrymRootColor()
	{
		return new Color(160, 10, 10);
	}


	@ConfigItem(
			position = 15,
			keyName = "showPhrenRoots",
			name = "Display Phren roots markers",
			description = "Configures whether Phren roots are displayed with the resource spot markers",
			section = resourceSpotsSection
	)
	default boolean showPhrenRoots()
	{
		return true;
	}

	@ConfigItem(
			position = 16,
			keyName = "phrenRootsColor",
			name = "Phren roots color",
			description = "Color of phren roots spots resource spot markers",
			section = resourceSpotsSection
	)
	default Color getPhrenRootsColor()
	{
		return new Color(108, 229, 22);
	}

	@ConfigItem(
			position = 17,
			keyName = "showLinumTirinum",
			name = "Display Linum Tirinum markers",
			description = "Configures whether Linum Tirinum are displayed with the resource spot markers",
			section = resourceSpotsSection
	)
	default boolean showLinumTirinum()
	{
		return true;
	}

	@ConfigItem(
			position = 18,
			keyName = "linumTirinumColor",
			name = "Linum Tirinum color",
			description = "Color of linum tirinum spots resource spot markers",
			section = resourceSpotsSection
	)
	default Color getLinumTirinumColor()
	{
		return new Color(235, 237, 226);
	}

	@ConfigItem(
			keyName = "tileMarkersLineSize",
			name = "Tile markers line size",
			description = "The size of the outside line for tile markers",
			position = 19
	)
	default StrokeSize getTileMarkersLineSize()
	{
		return StrokeSize.NORMAL;
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays Gauntlet boss debug overlay. This contains variables that the plugin uses to function",
			position = 20
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
