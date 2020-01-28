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

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

import java.awt.*;

@ConfigGroup("Vorkath")
public interface VorkathConfig extends Config
{
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
			group = "Colors",
			position = 2
	)
	default Color getAttackTimerTextColor()
	{
		return new Color(255, 255, 255);
	}

	@ConfigItem(
			keyName = "highlightFirebombTiles",
			name = "Highlight firebomb tiles",
			description = "Highlight the tiles where Vorkath's firebomb is going to land",
			position = 3
	)
	default boolean highlightFirebombTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "firebombMarkerColor",
			name = "Firebomb tile marker",
			description = "Color of Vorkath's firebomb markers",
			group = "Colors",
			position = 4
	)
	default Color getFirebombMarkerColor()
	{
		return new Color(226, 126, 35);
	}

	@ConfigItem(
			keyName = "highlightAcidPoolTiles",
			name = "Highlight acid pool tiles",
			description = "Highlight the acid pool tiles during Vorkath's acid phase",
			position = 5
	)
	default boolean highlightAcidPoolTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "acidPoolColor",
			name = "Acid pool tile marker",
			description = "Color of acid pool tile markers",
			group = "Colors",
			position = 6
	)
	default Color getAcidPoolColor()
	{
		return new Color(74, 178, 23);
	}

	@ConfigItem(
			keyName = "highlightZombifiedSpawn",
			name = "Highlight zombified spawn",
			description = "Highlight the zombified spawn when summoned by Vorkath",
			position = 7
	)
	default boolean highlightZombifiedSpawn()
	{
		return true;
	}

	@ConfigItem(
			keyName = "zombifiedSpawnColor",
			name = "Zombified spawn color",
			description = "Color of the highlight on the zombified spawn summoned by Vorkath",
			group = "Colors",
			position = 8
	)
	default Color getZombifiedSpawnColor()
	{
		return new Color(80, 147, 133);
	}

	@ConfigItem(
			keyName = "notifyOnFirebomb",
			name = "Notify on firebomb",
			description = "Receive a notification when Vorkath launches a firebomb",
			group = "Notifications",
			position = 9
	)
	default boolean notifyOnFirebomb()
	{
		return true;
	}

	@ConfigItem(
			keyName = "notifyOnAcidPhase",
			name = "Notify on acid phase",
			description = "Receive a notification when Vorkath uses his acid phase special attack",
			group = "Notifications",
			position = 10
	)
	default boolean notifyOnAcidPhase()
	{
		return false;
	}

	@ConfigItem(
			keyName = "notifyOnZombifiedSpawn",
			name = "Notify on spawn",
			description = "Receive a notification when Vorkath summons a zombified spawn",
			group = "Notifications",
			position = 11
	)
	default boolean notifyOnZombifiedSpawn()
	{
		return false;
	}

	@ConfigItem(
			keyName = "notifyOnlyOutOfFocus",
			name = "Only notify out of focus",
			description = "Only send notifications when the client is out of focus",
			group = "Notifications",
			position = 12
	)
	default boolean notifyOnlyOutOfFocus()
	{
		return false;
	}

	@ConfigItem(
			keyName = "displayAcidPhasePath",
			name = "Display closest acid phase path",
			description = "Displays the most efficient acid free path during Vorkath's acid phase",
			position = 13
	)
	default boolean displayAcidPhasePath()
	{
		return true;
	}

	@Range(
			min = 4,
			max = 16
	)
	@ConfigItem(
			keyName = "minimumAcidPhasePathLength",
			name = "Minimum path length",
			description = "The minimum length in tiles of the displayed path during Vorkath's acid phase",
			position = 14
	)
	default int getMinimumAcidPhasePathLength()
	{
		return 7;
	}

	@ConfigItem(
			keyName = "acidPhasePathColor",
			name = "Acid phase path",
			description = "Color of the tile markers highlighting the most efficient acid free path during Vorkath's acid phase",
			group = "Colors",
			position = 15
	)
	default Color getAcidPhasePathColor()
	{
		return new Color(30, 70, 115);
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays plugin debug overlay. This contains variables that the plugin uses to function",
			position = 16
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
