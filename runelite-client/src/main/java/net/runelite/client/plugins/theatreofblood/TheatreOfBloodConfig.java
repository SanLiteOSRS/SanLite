/*
 * Copyright (c) 2019, Juul <https://github.com/juuldamen>
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
			keyName = "highlightBloatHandAttackTiles",
			name = "Highlight hand attack tiles",
			description = "Highlight the tiles for the Pestilent Bloat's hand attacks",
			position = 3,
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
			position = 4,
			group = "Pestilent Bloat"
	)
	default Color getBloatHandAttackColor()
	{
		return new Color(20, 15, 10);
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays Theatre of Blood debug overlay. This contains variables that the plugin uses to function",
			position = 5
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
