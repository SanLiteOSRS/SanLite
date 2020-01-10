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

import java.awt.*;

@ConfigGroup("Vorkath")
public interface VorkathConfig extends Config
{
	@ConfigItem(
			keyName = "displayRemainingAttacksTillSpecial",
			name = "Display attacks till next special attack",
			description = "Displays the remaining attacks till Vorkath's next special attack"
	)
	default boolean displayRemainingAttacksTillSpecial()
	{
		return true;
	}

	@ConfigItem(
			keyName = "displayAttackTimer",
			name = "Display attack timer",
			description = "Displays a timer which shows the time until Vorkath's next attack"
	)
	default boolean displayAttackTimer()
	{
		return true;
	}

	@ConfigItem(
			keyName = "attackTimerTextColor",
			name = "Attack timer text color",
			description = "Color of attack timer text"
	)
	default Color getAttackTimerTextColor()
	{
		return new Color(255, 255, 255);
	}

	@ConfigItem(
			keyName = "highlightAcidPoolTiles",
			name = "Highlight acid pool tiles",
			description = "Highlight the acid pool tiles during Vorkath's acid phase"
	)
	default boolean highlightAcidPoolTiles()
	{
		return true;
	}


	@ConfigItem(
			keyName = "acidPoolColor",
			name = "Acid pool marker",
			description = "Color of acid pool tile markers"
	)
	default Color getAcidPoolColor()
	{
		return new Color(74, 178, 23);
	}

	@ConfigItem(
			keyName = "highlightFirebombTiles",
			name = "Highlight firebomb tiles",
			description = "Highlight the tiles where Vorkath's firebomb is going to land"
	)
	default boolean highlightFirebombTiles()
	{
		return true;
	}


	@ConfigItem(
			keyName = "firebombMarkerColor",
			name = "Firebomb marker",
			description = "Color of Vorkath's firebomb markers"
	)
	default Color getFirebombMarkerColor()
	{
		return new Color(226, 126, 35);
	}

	@ConfigItem(
			keyName = "highlightZombifiedSpawn",
			name = "Highlight acid pool tiles",
			description = "Highlight the zombified spawn when summoned by Vorkath"
	)
	default boolean highlightZombifiedSpawn()
	{
		return true;
	}


	@ConfigItem(
			keyName = "zombifiedSpawnColor",
			name = "Zombified spawn color",
			description = "Color of the highlight on the zombified spawn summoned by Vorkath"
	)
	default Color getZombifiedSpawnColor()
	{
		return new Color(80, 147, 133);
	}

	@ConfigItem(
			keyName = "notifyOnAcidPhase",
			name = "Notify on acid phase",
			description = "Receive a notification when Vorkath uses his acid phase special attack",
			group = "Notifications"
	)
	default boolean notifyOnAcidPhase()
	{
		return true;
	}

	@ConfigItem(
			keyName = "notifyOnFirebomb",
			name = "Notify on firebomb",
			description = "Receive a notification when Vorkath launches a firebomb",
			group = "Notifications"
	)
	default boolean notifyOnFirebomb()
	{
		return true;
	}

	@ConfigItem(
			keyName = "notifyOnZombifiedSpawn",
			name = "Notify on spawn",
			description = "Receive a notification when Vorkath summons a zombified spawn",
			group = "Notifications"
	)
	default boolean notifyOnZombifiedSpawn()
	{
		return true;
	}

	@ConfigItem(
			keyName = "notifyOnlyOutOfFocus",
			name = "Only notify out of focus",
			description = "Only send notifications when the client is out of focus",
			group = "Notifications"
	)
	default boolean notifyOnlyOutOfFocus()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays plugin debug overlay. This contains variables that the plugin uses to function"
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
