/*
 * Copyright (c) 2019, Jajack
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
package net.runelite.client.plugins.clancallerindicators;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("clancallerindicators")
public interface ClanCallerConfig extends Config
{
	@ConfigSection(
			name = "Caller(s) highlight",
			description = "Highlight options for callers",
			position = 99
	)
	String callersSection = "callers";

	@ConfigSection(
			name = "Pile highlight",
			description = "Highlight options for the pile",
			position = 99
	)
	String pileSection = "pile";

	@ConfigItem(
			position = 1,
			keyName = "highlightCallers",
			name = "Highlight callers characters",
			description = "Configures whether or not callers should be highlighted"
	)
	default boolean highlightCallers()
	{
		return false;
	}

	@ConfigItem(
			position = 2,
			keyName = "highlightCallersPile",
			name = "Highlight callers targets characters",
			description = "Configures whether or not callers targets characters should be highlighted"
	)
	default boolean highlightCallersPile()
	{
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "callersRsns",
			name = "Callers RSN(s)",
			description = "Configures the callers RSNs. Separate by commas"
	)
	default String getCallerRsns()
	{
		return "";
	}

	@ConfigItem(
			position = 4,
			keyName = "colorPlayerMenu",
			name = "Colorize player menu",
			description = "Color right click menu for players"
	)
	default boolean colorPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
			position = 5,
			keyName = "callerNamePosition",
			name = "Caller name position",
			description = "Configures the position of drawn caller player names, or if they should be disabled",
			section = callersSection
	)
	default PlayerNameLocation callerNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
			position = 6,
			keyName = "drawCallerPlayerTiles",
			name = "Draw tiles under callers characters",
			description = "Configures whether or not tiles under callers characters should be drawn",
			section = callersSection
	)
	default boolean drawCallerTiles()
	{
		return false;
	}

	@ConfigItem(
			position = 7,
			keyName = "drawCallerMinimapNames",
			name = "Draw caller names on minimap",
			description = "Configures whether or not minimap names for callers characters with rendered names should be drawn",
			section = callersSection
	)
	default boolean drawCallerMinimapNames()
	{
		return false;
	}

	@ConfigItem(
			position = 8,
			keyName = "pileNamePosition",
			name = "Piles name position",
			description = "Configures the position of drawn pile player names, or if they should be disabled",
			section = pileSection
	)
	default PlayerNameLocation pileNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
			position = 9,
			keyName = "drawPilePlayerTiles",
			name = "Draw tiles under piles characters",
			description = "Configures whether or not tiles under piles characters should be drawn",
			section = pileSection
	)
	default boolean drawPileTiles()
	{
		return true;
	}

	@ConfigItem(
			position = 10,
			keyName = "drawPileMinimapNames",
			name = "Draw piles names on minimap",
			description = "Configures whether or not minimap names for piles characters with rendered names should be drawn",
			section = pileSection
	)
	default boolean drawPileMinimapNames()
	{
		return false;
	}

	@ConfigItem(
			position = 11,
			keyName = "callerNameColor",
			name = "Caller color",
			description = "Color of callers",
			section = callersSection
	)
	default Color getCallerColor()
	{
		return new Color(255, 246, 112);
	}

	@ConfigItem(
			position = 12,
			keyName = "callerPileColor",
			name = "Callers pile color",
			description = "Color of callers pile",
			section = pileSection
	)
	default Color getCallerPileColor()
	{
		return new Color(244, 0, 0);
	}
}
