/*
 * Copyright (c) 2019, Siraz
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
package net.runelite.client.plugins.theatreofblood;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("Theatre of Blood")
public interface TheatreOfBloodConfig extends Config
{

	@ConfigItem(
			keyName = "timerFormat",
			name = "Format for boss timers",
			description = "Select the format that certain boss timers will be displayed in",
			position = 0
	)
	default TheatreOfBloodTimerFormat getTimerFormat()
	{
		return TheatreOfBloodTimerFormat.SECONDS_MILLISECONDS;
	}

	@ConfigItem(
			keyName = "highlightBloodSplatAttackTiles",
			name = "Highlight blood splat tiles",
			description = "Highlight the tiles for the Sugadinti maiden's blood splat attacks",
			position = 1,
			group = "Sugadinti Maiden"
	)
	default boolean highlightBloodSplatAttackTiles()
	{
		return true;
	}


	@ConfigItem(
			keyName = "bloodSplatAttackColor",
			name = "Blood splat marker",
			description = "Color of Sugadinti maiden's blood splat attack marker",
			position = 2,
			group = "Sugadinti Maiden"
	)
	default Color getBloodSplatAttackColor()
	{
		return new Color(163, 12, 12);
	}

	@ConfigItem(
			keyName = "highlightBloodSpawnTiles",
			name = "Highlight blood spawn tiles",
			description = "Highlight the tiles of blood left by blood spawns",
			position = 3,
			group = "Sugadinti Maiden"
	)
	default boolean highlightBloodSpawnTiles()
	{
		return true;
	}


	@ConfigItem(
			keyName = "bloodSpawnBloodColor",
			name = "Blood spawn blood marker",
			description = "Color of tiles of blood marker from blood spawns",
			position = 4,
			group = "Sugadinti Maiden"
	)
	default Color getBloodSpawnBloodColor()
	{
		return new Color(119, 11, 11);
	}

	@ConfigItem(
			keyName = "highlightBloatHandAttackTiles",
			name = "Highlight hand attack tiles",
			description = "Highlight the tiles for the Pestilent Bloat's hand attacks",
			position = 5,
			group = "Pestilent Bloat"
	)
	default boolean highlightBloatHandAttackTiles()
	{
		return true;
	}


	@ConfigItem(
			keyName = "bloatHandAttackColor",
			name = "Hand attack marker",
			description = "Color of Pestilent Bloat's hand attack marker",
			position = 6,
			group = "Pestilent Bloat"
	)
	default Color getBloatHandAttackColor()
	{
		return new Color(39, 37, 36);
	}

	@ConfigItem(
			keyName = "highlightBloatStatus",
			name = "Highlight Pestilent Bloat status",
			description = "Highlight the Pestilent Bloat with the color showing if it is disabled",
			position = 7,
			group = "Pestilent Bloat"
	)
	default boolean highlightBloatStatus()
	{
		return true;
	}


	@ConfigItem(
			keyName = "bloatAwakeColor",
			name = "Awake color",
			description = "Color of Pestilent Bloat's highlight when awake",
			position = 8,
			group = "Pestilent Bloat"
	)
	default Color getBloatAwakeColor()
	{
		return Color.RED;
	}

	@ConfigItem(
			keyName = "bloatWarningColor",
			name = "Sleep warning color",
			description = "Color of Pestilent Bloat's highlight when it could sleep",
			position = 9,
			group = "Pestilent Bloat"
	)
	default Color getBloatWarningColor()
	{
		return Color.YELLOW;
	}

	@ConfigItem(
			keyName = "bloatAsleepColor",
			name = "Asleep color",
			description = "Color of Pestilent Bloat's highlight when asleep",
			position = 10,
			group = "Pestilent Bloat"
	)
	default Color getBloatAsleepColor()
	{
		return Color.GREEN;
	}

	@ConfigItem(
			keyName = "displayBloatSleepTimer",
			name = "Display sleep timer",
			description = "Display a timer for the sleep duration of the Pestilent Bloat",
			position = 11,
			group = "Pestilent Bloat"
	)
	default boolean displayBloatSleepTimer()
	{
		return true;
	}

	@ConfigItem(
			keyName = "highlightAggressiveNylocas",
			name = "Highlight aggressive Nylocas",
			description = "Highlights Nylocas that are attacking you or your teammates",
			position = 12,
			group = "Nylocas"
	)
	default boolean highlightAggressiveNylocas()
	{
		return true;
	}

	@ConfigItem(
			keyName = "aggressiveNylocasColor",
			name = "Aggressive Nylocas",
			description = "Color of aggressive Nylocas highlights",
			position = 13,
			group = "Nylocas"
	)
	default Color getAggressiveNylocasColor()
	{
		return Color.RED;
	}

	@ConfigItem(
			keyName = "displayNylocasLifeTimerText",
			name = "Display Nylocas life timers",
			description = "Display Nylocas life timers when time till death is less than 5 seconds",
			position = 14,
			group = "Nylocas"
	)
	default boolean displayNylocasLifeTimerText()
	{
		return true;
	}

	@ConfigItem(
			keyName = "highlightSotetsegRedMazeTiles",
			name = "Highlight red maze tiles",
			description = "Highlight the red tiles during Sotetseg's maze",
			position = 15,
			group = "Sotetseg"
	)
	default boolean highlightSotetsegRedMazeTiles()
	{
		return true;
	}


	@ConfigItem(
			keyName = "sotetsegMazeTileColor",
			name = "Maze tile markers",
			description = "Color of Sotetseg's red maze tile markers",
			position = 16,
			group = "Sotetseg"
	)
	default Color getSotetsegMazeTileColor()
	{
		return new Color(155, 0, 35);
	}

	@ConfigItem(
			keyName = "highlightXarpusPoisonAttackTiles",
			name = "Highlight poison attack tiles",
			description = "Highlight the tiles for Xarpus poison attacks",
			position = 17,
			group = "Xarpus"
	)
	default boolean highlightXarpusPoisonAttackTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "xarpusPoisonAttackColor",
			name = "Poison attack marker",
			description = "Color of Xarpus poison attack marker",
			position = 18,
			group = "Xarpus"
	)
	default Color getXarpusPoisonAttackColor()
	{
		return new Color(159, 219, 0);
	}

	@ConfigItem(
			keyName = "highlightXarpusHealingPoolTiles",
			name = "Highlight healing pool tiles",
			description = "Highlight the healing pool tiles during the Xarpus encounter",
			position = 19,
			group = "Xarpus"
	)
	default boolean highlightXarpusHealingPoolTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "xarpusHealingPoolColor",
			name = "Healing pool marker",
			description = "Color of Xarpus healing pool marker",
			position = 20,
			group = "Xarpus"
	)
	default Color getXarpusHealingPoolColor()
	{
		return new Color(127, 130, 56);
	}

	@ConfigItem(
			keyName = "displayXarpusTurnTimer",
			name = "Xarpus turn timer",
			description = "Displays a timer until Xarpus next turn",
			position = 21,
			group = "Xarpus"
	)
	default boolean displayXarpusTurnTimer()
	{
		return true;
	}

	@ConfigItem(
			keyName = "displayP1AttackTimerText",
			name = "Display Phase 1 Attack Timer",
			description = "Displays a timer showing when verzik's next attack is on phase 1",
			position = 22,
			group = "Verzik Vitur"
	)
	default boolean displayP1AttackTimerText()
	{
		return true;
	}

	@ConfigItem(
			keyName = "displayP2AttackTimerText",
			name = "Display Phase 2 Attack Timer",
			description = "Displays a timer showing when verzik's next attack is on phase 2",
			position = 23,
			group = "Verzik Vitur"
	)
	default boolean displayP2AttackTimerText()
	{
		return true;
	}

	@ConfigItem(
			keyName = "displayP3AttackTimerText",
			name = "Display Phase 3 Attack Timer",
			description = "Displays a timer showing when verzik's next attack is on phase 3",
			position = 24,
			group = "Verzik Vitur"
	)
	default boolean displayP3AttackTimerText()
	{
		return true;
	}

	@ConfigItem(
			keyName = "highlightVerzikGreenOrbPoolTiles",
			name = "Highlight green orb pool tiles",
			description = "Highlight the tiles for Verzik's green orb pools",
			position = 25,
			group = "Verzik Vitur"
	)
	default boolean highlightVerzikGreenOrbPoolTiles()
	{
		return true;
	}

	@ConfigItem(
			keyName = "verzikGreenOrbPoolColor",
			name = "Green orb pool marker",
			description = "Color of Verzik's green orb pool marker",
			position = 26,
			group = "Verzik Vitur"
	)
	default Color getVerzikGreenOrbPoolColor()
	{
		return new Color(164, 172, 32);
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays Theatre of Blood debug overlay. This contains variables that the plugin uses to function",
			position = 27
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
