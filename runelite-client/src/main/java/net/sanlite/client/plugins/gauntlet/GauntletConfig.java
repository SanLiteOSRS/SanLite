/*
 * Copyright (c) 2021, Siraz <https://github.com/Sirazzz>
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
package net.sanlite.client.plugins.gauntlet;

import net.runelite.client.config.*;
import net.sanlite.client.config.FontStyle;

import java.awt.*;

@ConfigGroup(GauntletConfig.GROUP)
public interface GauntletConfig extends Config
{
	String GROUP = "gauntlet";

	@ConfigSection(
			name = "Boss",
			description = "Options for the encounter with the gauntlet boss",
			position = 0
	)
	String bossSection = "boss";

	@ConfigSection(
			name = "Regular monsters",
			description = "Options for the regular monsters within the gauntlet",
			position = 1
	)
	String regularMonstersSection = "regularMonsters";

	@ConfigSection(
			name = "Environment",
			description = "Options for the environment in the gauntlet",
			position = 2
	)
	String environmentSection = "environment";

	@ConfigSection(
			name = "Sounds",
			description = "Options for sounds used throughout the plugin",
			position = 3
	)
	String soundsSection = "sounds";

	@ConfigSection(
			name = "Text",
			description = "Options for text used throughout the plugin",
			position = 4
	)
	String textSection = "text";

	@ConfigSection(
			name = "Highlight style",
			description = "The render style of highlights such as tile markers",
			position = 5
	)
	String highlightStyleSection = "highlightStyle";

	@ConfigSection(
			name = "Colors",
			description = "Options for colors used throughout the plugin",
			position = 6
	)
	String colorsSection = "colors";

	@ConfigItem(
			position = 1,
			keyName = "showAttackStyleCounter",
			name = "Show attack style counter",
			description = "Displays the Gauntlet boss next attack above it's health bar",
			section = bossSection
	)
	default boolean showAttackStyleCounter()
	{
		return true;
	}

	@ConfigItem(
			position = 2,
			keyName = "showProtectionPrayerCounter",
			name = "Show protection prayer counter",
			description = "Displays a count until the the gauntlet boss next switches it's protection prayer",
			section = bossSection
	)
	default boolean showProtectionPrayerCounter()
	{
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "highlightCrystalAttackTiles",
			name = "Highlight crystals tiles",
			description = "Highlight the tiles for the Gauntlet boss crystals",
			section = bossSection
	)
	default boolean highlightCrystalAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "highlightBossTrampleArea",
			name = "Highlight trample area",
			description = "Highlight the tiles in which the gauntlet boss will use it's trample attack",
			section = bossSection
	)
	default boolean highlightBossTrampleArea()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			position = 10,
			keyName = "bossTrampleAreaColor",
			name = "Boss trample area",
			description = "Color of trample area highlight for the gauntlet boss",
			section = colorsSection
	)
	default Color getBossTrampleAreaColor()
	{
		return new Color(9, 255, 199, 150);
	}

	@Alpha
	@ConfigItem(
			position = 4,
			keyName = "crystalAttackColor",
			name = "Crystals marker",
			description = "Color of Gauntlet boss crystals marker",
			section = colorsSection
	)
	default Color getCrystalAttackColor()
	{
		return new Color(166, 5, 219);
	}

	@ConfigItem(
			position = 4,
			keyName = "highlightSingingBowl",
			name = "Highlight singing bowl",
			description = "Highlights the singing bowl (crafting spot) in the gauntlet",
			section = environmentSection
	)
	default boolean highlightSingingBowl()
	{
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "highlightCookingRange",
			name = "Highlight cooking range",
			description = "Highlights the cooking range in the gauntlet",
			section = environmentSection
	)
	default boolean highlightCookingRange()
	{
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "highlightWaterPump",
			name = "Highlight water pump",
			description = "Highlights the water pump in the gauntlet",
			section = environmentSection
	)
	default boolean highlightWaterPump()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			position = 4,
			keyName = "singingBowlHighlightColor",
			name = "Singing bowl highlight",
			description = "Color of the singing bowl (crafting spot) highlight in the gauntlet",
			section = colorsSection
	)
	default Color getSingingBowlHighlightColor()
	{
		return new Color(124, 78, 9);
	}

	@Alpha
	@ConfigItem(
			position = 4,
			keyName = "cookingRangeHighlightColor",
			name = "Cooking range highlight",
			description = "Color of the cooking range highlight in the gauntlet",
			section = colorsSection
	)
	default Color getCookingRangeHighlightColor()
	{
		return new Color(207, 181, 15);
	}

	@Alpha
	@ConfigItem(
			position = 4,
			keyName = "waterPumpHighlightColor",
			name = "Water pump highlight",
			description = "Color of the water pump highlight in the gauntlet",
			section = colorsSection
	)
	default Color getWaterPumpHighlightColor()
	{
		return new Color(59, 185, 255);
	}

	@ConfigItem(
			position = 5,
			keyName = "showResourceSpotsObjectMarkers",
			name = "Display resource spot object marker",
			description = "Configures whether the resource spots objects are highlighted",
			section = environmentSection
	)
	default boolean showResourceSpotsObjectMarkers()
	{
		return true;
	}

	@ConfigItem(
			position = 6,
			keyName = "showResourceSpotsTiles",
			name = "Display resource spot tiles",
			description = "Configures whether tiles for resource spots are highlighted",
			section = environmentSection
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
			section = environmentSection
	)
	default boolean showResourceSpotsNames()
	{
		return false;
	}

	@ConfigItem(
			position = 8,
			keyName = "showResourceSpotsOnMinimap",
			name = "Display resource spots on minimap",
			description = "Configures whether resource spots are displayed on the minimap",
			section = environmentSection
	)
	default boolean showResourceSpotsOnMinimap()
	{
		return true;
	}

	@ConfigItem(
			position = 8,
			keyName = "showUtilitySpotsOnMinimap",
			name = "Display utility spots on minimap",
			description = "Configures whether utility spots are displayed on the minimap",
			section = environmentSection
	)
	default boolean showUtilitySpotsOnMinimap()
	{
		return true;
	}

	@ConfigItem(
			position = 9,
			keyName = "showPaddlefishSpots",
			name = "Display paddlefish markers",
			description = "Configures whether paddlefish spots are displayed with the resource spot markers",
			section = environmentSection
	)
	default boolean showPaddlefishSpots()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			position = 10,
			keyName = "paddlefishSpotColor",
			name = "Paddlefish spot color",
			description = "Color of paddlefish fishing spots resource spot markers",
			section = colorsSection
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
			section = environmentSection
	)
	default boolean showCrystalDeposits()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			position = 12,
			keyName = "crystalDepositColor",
			name = "Crystal deposit color",
			description = "Color of crystal deposit spots resource spot markers",
			section = colorsSection
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
			section = environmentSection
	)
	default boolean showGrymRoots()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			position = 14,
			keyName = "grymRootColor",
			name = "Grym root color",
			description = "Color of grym root spots resource spot markers",
			section = colorsSection
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
			section = environmentSection
	)
	default boolean showPhrenRoots()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			position = 16,
			keyName = "phrenRootsColor",
			name = "Phren roots color",
			description = "Color of phren roots spots resource spot markers",
			section = colorsSection
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
			section = environmentSection
	)
	default boolean showLinumTirinum()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			position = 18,
			keyName = "linumTirinumColor",
			name = "Linum Tirinum color",
			description = "Color of linum tirinum spots resource spot markers",
			section = colorsSection
	)
	default Color getLinumTirinumColor()
	{
		return new Color(235, 237, 226);
	}

	@ConfigItem(
			position = 19,
			keyName = "borderWidth",
			name = "Border width",
			description = "Width of the highlight borders such as tile markers",
			section = highlightStyleSection
	)
	default double getBorderWidth()
	{
		return 2;
	}

	@ConfigItem(
			position = 6,
			keyName = "outlineFeather",
			name = "Outline feather",
			description = "Specify between 0-4 how much of the model outline should be faded",
			section = highlightStyleSection
	)
	@Range(
			min = 0,
			max = 4
	)
	default int outlineFeather()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "playSoundOnAttackStyleSwitch",
			name = "Play attack style switch sound",
			description = "Plays a sound for the respective attack style when the gauntlet boss switches attack style",
			section = soundsSection,
			position = 20
	)
	default boolean playSoundOnAttackStyleSwitch()
	{
		return true;
	}

	@ConfigItem(
			keyName = "playSoundOnDisablePrayerAttack",
			name = "Play prayers disabled sound",
			description = "Plays a sound when the gauntlet boss uses it's prayer disabling attack",
			section = soundsSection,
			position = 21
	)
	default boolean playSoundOnDisablePrayerAttack()
	{
		return true;
	}

	@ConfigItem(
			keyName = "playSoundOnCrystalAttack",
			name = "Play crystals spawn sound",
			description = "Plays a sound when the gauntlet boss uses it's crystal spawn attack",
			section = soundsSection,
			position = 22
	)
	default boolean playSoundOnCrystalAttack()
	{
		return true;
	}

	@ConfigItem(
			keyName = "playSoundOnOverheadSwitch",
			name = "Play protection prayer switch sound",
			description = "Plays a sound when the gauntlet boss switches it's overhead protection prayer style",
			section = soundsSection,
			position = 23
	)
	default boolean playSoundOnOverheadSwitch()
	{
		return true;
	}

	@ConfigItem(
			keyName = "playSoundOnPlayerDeath",
			name = "Play player death sound",
			description = "Plays a 'sound effect' when the player dies in the gauntlet",
			section = soundsSection,
			position = 24
	)
	default boolean playSoundOnPlayerDeath()
	{
		return true;
	}

	@ConfigItem(
			keyName = "hideNpcDeathAnimations",
			name = "Hide NPC death animations",
			description = "Hides death animations for regular NPC's in the gauntlet",
			section = regularMonstersSection,
			position = 25
	)
	default boolean hideNpcDeathAnimations()
	{
		return true;
	}

	@ConfigItem(
			keyName = "highlightBearDemiBoss",
			name = "Highlight bear demi boss",
			description = "Highlights bear demi boss location and outline in the gauntlet",
			section = regularMonstersSection,
			position = 26
	)
	default boolean highlightBearDemiBoss()
	{
		return false;
	}

	@ConfigItem(
			keyName = "highlightDragonDemiBoss",
			name = "Highlight dragon demi boss",
			description = "Highlights dragon demi boss location and outline in the gauntlet",
			section = regularMonstersSection,
			position = 27
	)
	default boolean highlightDragonDemiBoss()
	{
		return true;
	}

	@ConfigItem(
			keyName = "highlightDarkBeastDemiBoss",
			name = "Highlight dark beast demi boss",
			description = "Highlights dark beast demi boss location and outline in the gauntlet",
			section = regularMonstersSection,
			position = 28
	)
	default boolean highlightDarkBeastDemiBoss()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			position = 14,
			keyName = "demiBossHighlightColor",
			name = "Demi boss highlight",
			description = "Color of demi boss highlight outline in the gauntlet",
			section = colorsSection
	)
	default Color getDemiBossHighlightColor()
	{
		return Color.ORANGE;
	}

	@ConfigItem(
			keyName = "hideBigTreeObjects",
			name = "Hide big tree objects",
			description = "Hides the big tree objects on the walls in the gauntlet",
			section = environmentSection,
			position = 33
	)
	default boolean hideBigTreeObjects()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hideWallObjects",
			name = "Hide wall objects",
			description = "Hide the wall objects in the gauntlet",
			section = environmentSection,
			position = 34
	)
	default boolean hideWallObjects()
	{
		return false;
	}

	@ConfigItem(
			position = 35,
			keyName = "fontSize",
			name = "Font size",
			description = "Font size for text",
			section = textSection
	)
	default int getFontSize()
	{
		return 16;
	}

	@ConfigItem(
			position = 36,
			keyName = "fontStyle",
			name = "Font style",
			description = "Font style for text. Choose between bold, italics or plain",
			section = textSection
	)
	default FontStyle getFontStyle()
	{
		return FontStyle.BOLD;
	}

	@Alpha
	@ConfigItem(
			position = 37,
			keyName = "protectionPrayCountFontColor",
			name = "Protection prayer count font",
			description = "Color of protection prayer counter font for the gauntlet boss",
			section = colorsSection
	)
	default Color getProtectionPrayCountFontColor()
	{
		return new Color(0, 255, 0);
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays Gauntlet boss debug overlay. This contains variables that the plugin uses to function",
			position = 38
	)
	default boolean showDebugOverlay()
	{
		return false;
	}

	// TODO: Tidy up config

	// TODO: Fix icon centering for craft room highlights
}
