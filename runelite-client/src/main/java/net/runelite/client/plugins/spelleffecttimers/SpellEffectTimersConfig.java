/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
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
package net.runelite.client.plugins.spelleffecttimers;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.FontStyle;

import java.awt.*;

@ConfigGroup("spelleffecttimers")
public interface SpellEffectTimersConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "showFreezeTimersOverlay",
			name = "Show freeze timers",
			description = "Configures if freeze timers are shown"
	)
	default boolean showFreezeTimersOverlay()
	{
		return true;
	}

	@ConfigItem(
			position = 0,
			keyName = "showFreezeTimersOnNpcs",
			name = "Show freeze timers on NPC's",
			description = "Configures if the freeze timer is shown on NPC's"
	)
	default boolean showFreezeTimersOnNpcs()
	{
		return false;
	}

	@ConfigItem(
			position = 0,
			keyName = "showFreezeTimerOnOwnPlayer",
			name = "Show freeze timers on self",
			description = "Configures if the freeze timer is shown on your own player character"
	)
	default boolean showFreezeTimerOnOwnPlayer()
	{
		return false;
	}

	@ConfigItem(
			position = 1,
			keyName = "showTeleblockTimersOverlay",
			name = "Show teleblock timers",
			description = "Configures if teleblock timers are shown"
	)
	default boolean showTeleblockTimersOverlay()
	{
		return true;
	}

	@ConfigItem(
			position = 2,
			keyName = "showVengTimersOverlay",
			name = "Show vengeance timers",
			description = "Configures if vengeance cooldown timers are shown"
	)
	default boolean showVengTimersOverlay()
	{
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "showVengActiveOverlay",
			name = "Show vengeance active",
			description = "Configures if vengeance active icon is shown when a player has the effects of vengeance"
	)
	default boolean showVengActiveOverlay()
	{
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "showSotdSpecActiveOverlay",
			name = "Show SOTD spec active",
			description = "Configures if a duration timer is shown when a player has the effects of the Staff of the" +
					" Dead special attack"
	)
	default boolean showSotdSpecActiveOverlay()
	{
		return true;
	}

	@ConfigItem(
			position = 5,
			keyName = "showSpellImage",
			name = "Show spell image",
			description = "Configures if spell images are displayed on spell effect timers"
	)
	default boolean showSpellImage()
	{
		return true;
	}

	@ConfigItem(
			position = 6,
			keyName = "timersFontSize",
			name = "Text size",
			description = "Text size for timers"
	)
	default int getTimersFontSize()
	{
		return 16;
	}

	@ConfigItem(
			position = 7,
			keyName = "timersFontStyle",
			name = "Font style",
			description = "Font style for timers. Choose between bold, italics or plain"
	)
	default FontStyle getTimersFontStyle()
	{
		return FontStyle.PLAIN;
	}

	@ConfigItem(
			position = 8,
			keyName = "timersFontColor",
			name = "Font color",
			description = "Color of timers font"
	)
	default Color getTimersFontColor()
	{
		return new Color(255, 255, 255, 255);
	}
}
