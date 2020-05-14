/*
 * Copyright (c) 2017, Tyler <https://github.com/tylerthardy>
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
package net.runelite.client.config;

import java.awt.Dimension;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import net.runelite.api.Constants;
import net.runelite.client.Notifier;
import net.runelite.client.ui.ContainableFrame;

@ConfigGroup(RuneLiteConfig.GROUP_NAME)
public interface RuneLiteConfig extends Config
{
	String GROUP_NAME = "runelite";

	@ConfigItem(
		keyName = "gameSize",
		name = "Game size",
		description = "The game will resize to this resolution upon starting the client",
		position = 10
	)
	default Dimension gameSize()
	{
		return Constants.GAME_FIXED_SIZE;
	}

	@ConfigItem(
		keyName = "automaticResizeType",
		name = "Resize type",
		description = "Choose how the window should resize when opening and closing panels",
		position = 11
	)
	default ExpandResizeType automaticResizeType()
	{
		return ExpandResizeType.KEEP_GAME_SIZE;
	}

	@ConfigItem(
		keyName = "lockWindowSize",
		name = "Lock window size",
		description = "Determines if the window resizing is allowed or not",
		position = 12
	)
	default boolean lockWindowSize()
	{
		return false;
	}

	@ConfigItem(
		keyName = "containInScreen2",
		name = "Contain in screen",
		description = "Makes the client stay contained in the screen when attempted to move out of it.<br>Note: 'Always' only works if custom chrome is enabled.",
		position = 13
	)
	default ContainableFrame.Mode containInScreen()
	{
		return ContainableFrame.Mode.RESIZING;
	}

	@ConfigItem(
		keyName = "rememberScreenBounds",
		name = "Remember client position",
		description = "Save the position and size of the client after exiting",
		position = 14
	)
	default boolean rememberScreenBounds()
	{
		return true;
	}

	@ConfigItem(
		keyName = "uiEnableCustomChrome",
		name = "Enable custom window chrome",
		description = "Use SanLite's custom window title and borders.",
		warning = "Please restart your client after changing this setting",
		position = 15
	)
	default boolean enableCustomChrome()
	{
		return true;
	}

	@ConfigItem(
		keyName = "gameAlwaysOnTop",
		name = "Enable client always on top",
		description = "The game will always be on the top of the screen",
		position = 16
	)
	default boolean gameAlwaysOnTop()
	{
		return false;
	}

	@ConfigItem(
		keyName = "warningOnExit",
		name = "Display warning on exit",
		description = "Toggles a warning popup when trying to exit the client",
		position = 17
	)
	default WarningOnExit warningOnExit()
	{
		return WarningOnExit.LOGGED_IN;
	}

	@ConfigItem(
		keyName = "usernameInTitle",
		name = "Show display name in title",
		description = "Toggles displaying of local player's display name in client title",
		position = 18
	)
	default boolean usernameInTitle()
	{
		return true;
	}

	@ConfigItem(
		keyName = "notificationTray",
		name = "Enable tray notifications",
		description = "Enables tray notifications",
		position = 20,
		group = "Notifications"
	)
	default boolean enableTrayNotifications()
	{
		return true;
	}

	@ConfigItem(
		keyName = "notificationRequestFocus",
		name = "Request focus on notification",
		description = "Configures the window focus request type on notification",
		position = 21,
		group = "Notifications"
	)
	default RequestFocusType notificationRequestFocus()
	{
		return RequestFocusType.OFF;
	}

	@ConfigItem(
		keyName = "notificationSound",
		name = "Notification sound",
		description = "Enables the playing of a beep sound when notifications are displayed",
		position = 22,
		group = "Notifications"
	)
	default Notifier.NativeCustomOff notificationSound()
	{
		return Notifier.NativeCustomOff.NATIVE;
	}

	@ConfigItem(
		keyName = "notificationGameMessage",
		name = "Enable game message notifications",
		description = "Puts a notification message in the chatbox",
		position = 23,
		group = "Notifications"
	)
	default boolean enableGameMessageNotification()
	{
		return false;
	}

	@ConfigItem(
		keyName = "flashNotification",
		name = "Flash notification",
		description = "Flashes the game frame as a notification",
		position = 24,
		group = "Notifications"
	)
	default FlashNotification flashNotification()
	{
		return FlashNotification.DISABLED;
	}

	@ConfigItem(
		keyName = "notificationFocused",
		name = "Send notifications when focused",
		description = "Toggles all notifications for when the client is focused",
		position = 25,
		group = "Notifications"
	)
	default boolean sendNotificationsWhenFocused()
	{
		return false;
	}

	@ConfigItem(
		keyName = "fontType",
		name = "Dynamic Overlay Font",
		description = "Configures what font type is used for in-game overlays such as player name, ground items, etc.",
		position = 30,
		group = "Font"
	)
	default FontType fontType()
	{
		return FontType.SMALL;
	}

	@ConfigItem(
		keyName = "tooltipFontType",
		name = "Tooltip Font",
		description = "Configures what font type is used for in-game tooltips such as food stats, NPC names, etc.",
		position = 31,
		group = "Font"
	)
	default FontType tooltipFontType()
	{
		return FontType.SMALL;
	}

	@ConfigItem(
		keyName = "interfaceFontType",
		name = "Interface Overlay Font",
		description = "Configures what font type is used for in-game interface overlays such as panels, opponent info, clue scrolls etc.",
		position = 32,
		group = "Font"
	)
	default FontType interfaceFontType()
	{
		return FontType.REGULAR;
	}

	@ConfigItem(
		keyName = "menuEntryShift",
		name = "Require Shift for overlay menu",
		description = "Overlay right-click menu will require shift to be added",
		position = 33
	)
	default boolean menuEntryShift()
	{
		return true;
	}

	@ConfigItem(
		keyName = "tooltipPosition",
		name = "Tooltip Position",
		description = "Configures whether to show the tooltip above or under the cursor",
		position = 35
	)
	default TooltipPositionType tooltipPosition()
	{
		return TooltipPositionType.UNDER_CURSOR;
	}

	@ConfigItem(
		keyName = "infoBoxVertical",
		name = "Display infoboxes vertically",
		description = "Toggles the infoboxes to display vertically",
		position = 40,
		group = "Infobox"
	)
	default boolean infoBoxVertical()
	{
		return false;
	}

	@ConfigItem(
		keyName = "infoBoxSize",
		name = "Infobox size",
		description = "Configures the size of each infobox in pixels",
		position = 42,
		group = "Infobox"
	)
	@Units(Units.PIXELS)
	default int infoBoxSize()
	{
		return 35;
	}

	@ConfigItem(
		keyName = "blockExtraMouseButtons",
		name = "Block Extra Mouse Buttons",
		description = "Blocks extra mouse buttons (4 and above)",
		position = 43
	)
	default boolean blockExtraMouseButtons()
	{
		return true;
	}

	@ConfigItem(
		keyName = "sidebarToggleKey",
		name = "Sidebar Toggle Key",
		description = "The key that will toggle the sidebar (accepts modifiers)",
		position = 44
	)
	default Keybind sidebarToggleKey()
	{
		return new Keybind(KeyEvent.VK_F11, InputEvent.CTRL_DOWN_MASK);
	}

	@ConfigItem(
		keyName = "panelToggleKey",
		name = "Plugin Panel Toggle Key",
		description = "The key that will toggle the current or last opened plugin panel (accepts modifiers)",
		position = 45
	)
	default Keybind panelToggleKey()
	{
		return new Keybind(KeyEvent.VK_F12, InputEvent.CTRL_DOWN_MASK);
	}
}