/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2019, Jajack
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
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

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.PlayerNameLocation;

import java.awt.*;

@ConfigGroup("playerindicators")
public interface PlayerIndicatorsConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "drawOwnName",
			name = "Highlight own player",
			description = "Configures whether or not your own player should be highlighted",
			group = "Own player"
	)
	default boolean highlightOwnPlayer()
	{
		return false;
	}

	@ConfigItem(
			position = 1,
			keyName = "ownPlayerColor",
			name = "Own player color",
			description = "Color of your own player",
			group = "Own player"
	)
	default Color getOwnPlayerColor()
	{
		return new Color(0, 184, 212);
	}

	@ConfigItem(
			position = 2,
			keyName = "drawOwnPlayerTiles",
			name = "Draw tiles under own player",
			description = "Configures whether or not tiles under own player should be drawn",
			group = "Own player"
	)
	default boolean drawOwnPlayerTiles()
	{
		return false;
	}

	@ConfigItem(
			position = 3,
			keyName = "ownPlayerNamePosition",
			name = "Name position",
			description = "Configures the position of drawn own player name, or if they should be disabled",
			group = "Own player"
	)
	default PlayerNameLocation getOwnPlayerNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
			position = 4,
			keyName = "drawOwnPlayerMinimapName",
			name = "Draw own player name on minimap",
			description = "Configures whether or not minimap names for own player with rendered names should be drawn",
			group = "Own player"
	)
	default boolean drawOwnPlayerMinimapName()
	{
		return false;
	}

	@ConfigItem(
			position = 5,
			keyName = "drawFriendNames",
			name = "Highlight friends",
			description = "Configures whether or not friends should be highlighted",
			group = "Friends"
	)
	default boolean highlightFriends()
	{
		return true;
	}

	@ConfigItem(
			position = 6,
			keyName = "drawOfflineFriendNames",
			name = "Highlight appear offline friends",
			description = "Configures if friends who do not appear logged in (private off/friends) should be highlighted",
			group = "Friends"
	)
	default boolean highlightOfflineFriends()
	{
		return true;
	}

	@ConfigItem(
			position = 7,
			keyName = "disableFriendHighlightIfClanMember",
			name = "Do not highlight clan members",
			description = "Configures whether or not friends who are also in your clan chat should be highlighted as a friend",
			group = "Friends"
	)
	default boolean disableFriendHighlightIfClanMember()
	{
		return false;
	}

	@ConfigItem(
			position = 8,
			keyName = "friendNameColor",
			name = "Friend color",
			description = "Color of friend names",
			group = "Friends"
	)
	default Color getFriendColor()
	{
		return new Color(0, 200, 83);
	}

	@ConfigItem(
			position = 9,
			keyName = "drawFriendTiles",
			name = "Draw tiles under friends",
			description = "Configures whether or not tiles under highlighted friends should be drawn",
			group = "Friends"
	)
	default boolean drawFriendTiles()
	{
		return false;
	}

	@ConfigItem(
			position = 10,
			keyName = "friendPlayerNamePosition",
			name = "Name position",
			description = "Configures the position of drawn friend names, or if they should be disabled",
			group = "Friends"
	)
	default PlayerNameLocation getFriendPlayerNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
			position = 11,
			keyName = "drawFriendMinimapNames",
			name = "Draw friends names on minimap",
			description = "Configures whether or not minimap names for friends with rendered names should be drawn",
			group = "Friends"
	)
	default boolean drawFriendMinimapNames()
	{
		return false;
	}

	@ConfigItem(
			position = 12,
			keyName = "colorFriendPlayerMenu",
			name = "Colorize player menu for friends",
			description = "Color right click menu for players",
			group = "Friends"
	)
	default boolean colorFriendPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
			position = 13,
			keyName = "drawClanMemberNames",
			name = "Highlight clan members",
			description = "Configures whether or clan members should be highlighted",
			group = "Clan members"
	)
	default boolean highlightClanMembers()
	{
		return true;
	}

	@ConfigItem(
			position = 14,
			keyName = "clanMemberColor",
			name = "Clan member color",
			description = "Color of clan members",
			group = "Clan members"
	)
	default Color getClanMemberColor()
	{
		return new Color(170, 0, 255);
	}

	@ConfigItem(
			position = 15,
			keyName = "drawClanMemberTiles",
			name = "Draw tiles under clan members",
			description = "Configures whether or not tiles under highlighted clan members should be drawn",
			group = "Clan members"
	)
	default boolean drawClanMemberTiles()
	{
		return false;
	}

	@ConfigItem(
			position = 16,
			keyName = "clanPlayerNamePosition",
			name = "Name position",
			description = "Configures the position of drawn clan member names, or if they should be disabled",
			group = "Clan members"
	)
	default PlayerNameLocation getClanMemberPlayerNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
			position = 17,
			keyName = "drawClanMinimapNames",
			name = "Draw clan member names on minimap",
			description = "Configures whether or not minimap names for clan members with rendered names should be drawn",
			group = "Clan members"
	)
	default boolean drawClanMemberMinimapNames()
	{
		return false;
	}

	@ConfigItem(
			position = 18,
			keyName = "colorClanPlayerMenu",
			name = "Colorize player menu for clan members",
			description = "Color right click menu for clan members",
			group = "Clan members"
	)
	default boolean colorClanMemberPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
			position = 19,
			keyName = "drawTeamMemberNames",
			name = "Highlight team members",
			description = "Configures whether or not team members should be highlighted",
			group = "Team cape members"
	)
	default boolean highlightTeamMembers()
	{
		return true;
	}

	@ConfigItem(
			position = 20,
			keyName = "teamMemberColor",
			name = "Team member color",
			description = "Color of team members",
			group = "Team cape members"
	)
	default Color getTeamMemberColor()
	{
		return new Color(19, 110, 247);
	}

	@ConfigItem(
			position = 21,
			keyName = "drawTeamTiles",
			name = "Draw tiles under team members",
			description = "Configures whether or not tiles under highlighted team members should be drawn",
			group = "Team cape members"
	)
	default boolean drawTeamMemberTiles()
	{
		return false;
	}

	@ConfigItem(
			position = 22,
			keyName = "teamPlayerNamePosition",
			name = "Name position",
			description = "Configures the position of drawn team member names, or if they should be disabled",
			group = "Team cape members"
	)
	default PlayerNameLocation getTeamPlayerNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
			position = 23,
			keyName = "drawTeamMinimapNames",
			name = "Draw team member names on minimap",
			description = "Configures whether or not minimap names for team members with rendered names should be drawn",
			group = "Team cape members"
	)
	default boolean drawTeamMinimapNames()
	{
		return false;
	}

	@ConfigItem(
			position = 24,
			keyName = "colorTeamPlayerMenu",
			name = "Colorize player menu for team members",
			description = "Color right click menu for team members",
			group = "Team cape members"
	)
	default boolean colorTeamMemberPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
			position = 25,
			keyName = "drawNonClanMemberNames",
			name = "Highlight non-clan members",
			description = "Configures whether or not non-clan members should be highlighted",
			group = "Non-clan members"
	)
	default boolean highlightNonClanMembers()
	{
		return false;
	}

	@ConfigItem(
			position = 26,
			keyName = "nonClanMemberColor",
			name = "Non-clan member color",
			description = "Color of non-clan member names",
			group = "Non-clan members"
	)
	default Color getNonClanMemberColor()
	{
		return Color.RED;
	}

	@ConfigItem(
			position = 27,
			keyName = "drawNonClanTiles",
			name = "Draw tiles under non-clan members",
			description = "Configures whether or not tiles under highlighted non-clan members should be drawn",
			group = "Non-clan members"
	)
	default boolean drawNonClanMemberTiles()
	{
		return false;
	}

	@ConfigItem(
			position = 28,
			keyName = "nonClanPlayerNamePosition",
			name = "Name position",
			description = "Configures the position of drawn non-clan member names, or if they should be disabled",
			group = "Non-clan members"
	)
	default PlayerNameLocation getNonClanPlayerNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
			position = 29,
			keyName = "drawNonClanMinimapNames",
			name = "Draw non clan member names on minimap",
			description = "Configures whether or not minimap names for non-clan members with rendered names should be drawn",
			group = "Non-clan members"
	)
	default boolean drawNonClanMemberMinimapNames()
	{
		return false;
	}

	@ConfigItem(
			position = 30,
			keyName = "colorNonClanPlayerMenu",
			name = "Colorize player menu for non clan members",
			description = "Color right click menu for non-clan members",
			group = "Non-clan members"
	)
	default boolean colorNonClanMemberPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
			position = 31,
			keyName = "notifyOnNonClanMemberSpawned",
			name = "Notify on non-clan member spawn",
			description = "Receive a notification when a non-clan member appears by logging in or running into the " +
					"player render range in a PvP zone. Notifications will not be triggered in safe death PvP areas",
			group = "Player spawn notifications"
	)
	default boolean notifyOnNonClanMemberSpawned()
	{
		return false;
	}

	@ConfigItem(
			position = 32,
			keyName = "delayBetweenPlayerSpawnedNotifications",
			name = "Notification cooldown",
			description = "Configures the minimum game ticks between player spawned notifications (600ms per tick)",
			group = "Player spawn notifications"
	)
	default int delayBetweenPlayerSpawnedNotifications()
	{
		return 3;
	}

	@ConfigItem(
			position = 33,
			keyName = "ignoredPlayerNames",
			name = "Ignored players",
			description = "Configures players that will be ignored by player spawn notifications. Format: (name), (name)",
			group = "Player spawn notifications"
	)
	default String getIgnoredPlayerNames()
	{
		return "";
	}


	@ConfigItem(
			position = 34,
			keyName = "clanMenuIcons",
			name = "Show clan ranks",
			description = "Add clan rank to right click menu and next to player names",
			group = "Clan members"
	)
	default boolean showClanRanks()
	{
		return true;
	}
}