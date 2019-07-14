/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
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
package net.runelite.client.plugins.playerindicators;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("playerindicators")
public interface PlayerIndicatorsConfig extends Config
{

	@ConfigItem(
		position = 0,
		keyName = "highlightSelf",
		name = "Highlight own character",
		description = "Configures whether or not your own character should be highlighted"
	)
	default boolean highlightSelf()
	{
		return false;
	}

	@ConfigItem(
			position = 1,
			keyName = "highlightFriends",
			name = "Highlight friends characters",
			description = "Configures whether or not your friends characters should be highlighted"
	)
	default boolean highlightFriends()
	{
		return false;
	}

	@ConfigItem(
		position = 2,
		keyName = "highlightOfflineFriends",
		name = "Highlight friends appearing offline characters",
		description = "Configures whether or not your friends characters should be highlighted despite appearing offline"
	)
	default boolean highlightOfflineFriends()
	{
		return false;
	}

	@ConfigItem(
		position = 3,
		keyName = "highlightClanMembers",
		name = "Highlight clan members characters",
		description = "Configures whether or not your clan members characters should be highlighted"
	)
	default boolean highlightClanMembers()
	{
		return false;
	}

	@ConfigItem(
		position = 4,
		keyName = "highlightNonClanMembers",
		name = "Highlight non-clan members characters",
		description = "Configures whether or not non-clan members characters should be highlighted"
	)
	default boolean highlightNonClanMembers()
	{
		return false;
	}

	@ConfigItem(
		position = 5,
		keyName = "highlightCallers",
		name = "Highlight callers characters",
		description = "Configures whether or not callers' characters should be highlighted",
		group = "Caller"
	)
	default boolean highlightCallers()
	{
		return false;
	}

	@ConfigItem(
		position = 6,
		keyName = "highlightCallersPile",
		name = "Highlight callers targets characters",
		description = "Configures whether or not callers' target's characters should be highlighted",
		group = "Caller"
	)
	default boolean highlightCallersPile()
	{
		return false;
	}

	@ConfigItem(
		position = 7,
		keyName = "callersRsns",
		name = "Callers RSNs, separated by commas",
		description = "Configures the callers RSNs",
		group = "Caller"
	)
	default String getCallerRsns()
	{
		return "";
	}

	@ConfigItem(
		position = 8,
		keyName = "playerNamePosition",
		name = "Name position",
		description = "Configures the position of drawn player names, or if they should be disabled"
	)
	default PlayerNameLocation playerNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
		position = 9,
		keyName = "colorPlayerMenu",
		name = "Colorize player menu",
		description = "Color right click menu for players"
	)
	default boolean colorPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
		position = 10,
		keyName = "drawPlayerTiles",
		name = "Draw tiles under characters",
		description = "Configures whether or not tiles under highlighted characters should be drawn"
	)
	default boolean drawTiles()
	{
		return false;
	}

	@ConfigItem(
		position = 11,
		keyName = "drawMinimapNames",
		name = "Draw names on minimap",
		description = "Configures whether or not minimap names for characters with rendered names should be drawn"
	)
	default boolean drawMinimapNames()
	{
		return false;
	}

	@ConfigItem(
		position = 12,
		keyName = "clanMenuIcons",
		name = "Show clan ranks",
		description = "Add clan rank to right click menu and next to player names"
	)
	default boolean showClanRanks()
	{
		return true;
	}

	@ConfigItem(
		position = 13,
		keyName = "ownPlayerColor",
		name = "Own player color",
		description = "Color of own players name"
	)
	default Color getOwnColor()
	{
		return new Color(0, 216, 212);
	}

	@ConfigItem(
		position = 14,
		keyName = "friendNameColor",
		name = "Friend color",
		description = "Color of friend names"
	)
	default Color getFriendColor()
	{
		return new Color(0, 200, 83);
	}

	@ConfigItem(
		position = 15,
		keyName = "clanMemberColor",
		name = "Clan member color",
		description = "Color of clan members"
	)
	default Color getClanMemberColor()
	{
		return new Color(170, 0, 255);
	}

	@ConfigItem(
		position = 16,
		keyName = "nonClanMemberColor",
		name = "Non-clan member color",
		description = "Color of non-clan members"
	)
	default Color getNonClanMemberColor()
	{
		return new Color(19, 110, 247);
	}

	@ConfigItem(
		position = 17,
		keyName = "callerNameColor",
		name = "Caller color",
		description = "Color of callers",
		group = "Caller"
	)
	default Color getCallerColor()
	{
		return new Color(244, 119, 66);
	}

	@ConfigItem(
		position = 18,
		keyName = "callerPileColor",
		name = "Callers' pile color",
		description = "Color of callers' pile",
		group = "Caller"
	)
	default Color getCallerPileColor()
	{
		return new Color(244, 0, 0);
	}
}