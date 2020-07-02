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
package net.runelite.client.plugins.vorkath;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("Vorkath")
public interface VorkathConfig extends Config
{
	@ConfigSection(
			name = "Colors",
			description = "Options for colors used throughout the plugin",
			position = 99
	)
	String colorsSection = "colors";

	@ConfigSection(
			name = "Notifications",
			description = "Options for plugins notifications",
			position = 99
	)
	String notificationsSection = "notifications";

	@ConfigItem(
			keyName = "displayRemainingAttacksTillSpecial",
			name = "Display attacks till next special",
			description = "Displays the remaining attacks till Vorkath's next special attack",
			position = 0
	)
	default boolean displayRemainingAttacksTillSpecial()
	{
		return true;
	}

	@ConfigItem(
			keyName = "displayAttackTimer",
			name = "Display attack timer",
			description = "Displays a timer which shows the ticks until Vorkath's next attack",
			position = 1
	)
	default boolean displayAttackTimer()
	{
		return true;
	}

	@ConfigItem(
			keyName = "attackTimerTextColor",
			name = "Attack timer text color",
			description = "Color of attack timer text",
			section = colorsSection,
			position = 2
	)
	default Color getAttackTimerTextColor()
	{
		return new Color(255, 255, 255);
	}

	@ConfigItem(
			keyName = "highlightAcidPoolTiles",
			name = "Highlight acid pool tiles",
			description = "Highlight the acid pool tiles during Vorkath's acid phase",
			position = 6
	)
	default boolean highlightAcidPoolTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "acidPoolColor",
			name = "Acid pool tile marker",
			description = "Color of acid pool tile markers",
			section = colorsSection,
			position = 7
	)
	default Color getAcidPoolColor()
	{
		return new Color(74, 178, 23);
	}

	@ConfigItem(
			keyName = "highlightZombifiedSpawn",
			name = "Highlight zombified spawn",
			description = "Highlight the zombified spawn when summoned by Vorkath",
			position = 8
	)
	default boolean highlightZombifiedSpawn()
	{
		return true;
	}

	@ConfigItem(
			keyName = "zombifiedSpawnColor",
			name = "Zombified spawn color",
			description = "Color of the highlight on the zombified spawn summoned by Vorkath",
			section = colorsSection,
			position = 9
	)
	default Color getZombifiedSpawnColor()
	{
		return new Color(80, 147, 133);
	}

	@ConfigItem(
			keyName = "notifyOnFirebomb",
			name = "Notify on firebomb",
			description = "Receive a notification when Vorkath launches a firebomb",
			section = notificationsSection,
			position = 10
	)
	default boolean notifyOnFirebomb()
	{
		return true;
	}

	@ConfigItem(
			keyName = "notifyOnAcidPhase",
			name = "Notify on acid phase",
			description = "Receive a notification when Vorkath uses his acid phase special attack",
			section = notificationsSection,
			position = 11
	)
	default boolean notifyOnAcidPhase()
	{
		return false;
	}

	@ConfigItem(
			keyName = "notifyOnZombifiedSpawn",
			name = "Notify on spawn",
			description = "Receive a notification when Vorkath summons a zombified spawn",
			section = notificationsSection,
			position = 12
	)
	default boolean notifyOnZombifiedSpawn()
	{
		return false;
	}

	@ConfigItem(
			keyName = "notifyOnlyOutOfFocus",
			name = "Only notify out of focus",
			description = "Only send notifications when the client is out of focus",
			section = notificationsSection,
			position = 13
	)
	default boolean notifyOnlyOutOfFocus()
	{
		return false;
	}

	@ConfigItem(
			keyName = "displayAcidPhasePath",
			name = "Display closest acid phase path",
			description = "Displays the most efficient acid free path during Vorkath's acid phase",
			position = 14
	)
	default boolean displayAcidPhasePath()
	{
		return false;
	}

	@Range(
			min = 4,
			max = 16
	)
	@ConfigItem(
			keyName = "minimumAcidPhasePathLength",
			name = "Minimum path length",
			description = "The minimum length in tiles of the displayed path during Vorkath's acid phase",
			position = 15
	)
	default int getMinimumAcidPhasePathLength()
	{
		return 7;
	}

	@ConfigItem(
			keyName = "acidPhasePathColor",
			name = "Acid phase path",
			description = "Color of the tile markers highlighting the most efficient acid free path during Vorkath's acid phase",
			section = colorsSection,
			position = 16
	)
	default Color getAcidPhasePathColor()
	{
		return new Color(35, 83, 133);
	}

	@ConfigItem(
			keyName = "tileMarkersLineSize",
			name = "Tile markers line size",
			description = "The size of the outside line for tile markers",
			position = 17
	)
	default StrokeSize getTileMarkersLineSize()
	{
		return StrokeSize.NORMAL;
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays plugin debug overlay. This contains variables that the plugin uses to function",
			position = 18
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
