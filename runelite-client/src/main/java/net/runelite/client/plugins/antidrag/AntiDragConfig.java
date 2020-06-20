/*
 * Copyright (c) 2018, DennisDeV <https://github.com/DevDennis>
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
package net.runelite.client.plugins.antidrag;

import net.runelite.api.Constants;
import net.runelite.client.config.*;

import java.awt.event.KeyEvent;

@ConfigGroup(AntiDragPlugin.CONFIG_GROUP)
public interface AntiDragConfig extends Config
{
	@ConfigItem(
			keyName = "dragDelay",
			name = "Drag delay",
			description = "Configures the inventory drag delay in client ticks (20ms)",
			position = 1
	)
	default int dragDelay()
	{
		return Constants.GAME_TICK_LENGTH / Constants.CLIENT_TICK_LENGTH; // one game tick
	}

	@ConfigItem(
			keyName = "onKeybindOnly",
			name = "On keybind only",
			description = "Configures whether to only adjust the delay while holding an anti drag keybind",
			position = 2
	)
	default boolean onKeybindOnly()
	{
		return true;
	}

	@ConfigItem(
			keyName = "enableIgnoreKeybind",
			name = "Enable ignore keybind",
			description = "Configures whether to ignore the delay while holding the ignore keybind",
			position = 3
	)
	default boolean enableIgnoreKeybind()
	{
		return true;
	}

	@ConfigItem(
			keyName = "keybind1",
			name = "Keybind 1",
			description = "First key that when held down delays dragging items",
			position = 4
	)
	default AllKeyCodeKeybind keybind1()
	{
		return new AllKeyCodeKeybind(KeyEvent.VK_SHIFT, 0);
	}

	@ConfigItem(
			keyName = "keybind2",
			name = "Keybind 2",
			description = "Second key that when held down delays dragging items",
			position = 5
	)
	default AllKeyCodeKeybind keybind2()
	{
		return new AllKeyCodeKeybind(KeyEvent.VK_CONTROL, 0);
	}

	@ConfigItem(
			keyName = "ignoreKeybind",
			name = "Ignore keybind",
			description = "Key that when held down will disable dragging delay on items",
			position = 6
	)
	default AllKeyCodeKeybind ignoreKeybind()
	{
		return new AllKeyCodeKeybind(KeyEvent.VK_UNDEFINED, 0);
	}
}
