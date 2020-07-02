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

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("playerindicators")
public interface PlayerIndicatorsConfig extends Config
{
	@ConfigSection(
			name = "Own player options",
			description = "Highlight options your own player character",
			closedByDefault = true,
			position = 99
	)
	String ownPlayerSection = "ownPlayer";

	@ConfigSection(
			name = "Friends",
			description = "Highlight options for your friends",
			closedByDefault = true,
			position = 99
	)
	String friendsSection = "friends";

	@ConfigSection(
			name = "Friends chat members",
			description = "Highlight options for friends chat members",
			closedByDefault = true,
			position = 99
	)
	String friendsChatMembersSection = "friendsChatMembers";

	@ConfigSection(
			name = "Team cape members",
			description = "Highlight options for team cape members",
			closedByDefault = true,
			position = 99
	)
	String teamCapeMembersSection = "teamCapeMembers";

	@ConfigSection(
			name = "Others",
			description = "Highlight options for other players",
			closedByDefault = true,
			position = 99
	)
	String othersSection = "others";

	@ConfigSection(
			name = "Player spawn notifications",
			description = "Options for player spawn notifications",
			closedByDefault = true,
			position = 99
	)
	String playerSpawnNotificationsSection = "playerSpawnNotificationsSection";

	@ConfigItem(
			position = 0,
			keyName = "drawOwnName",
			name = "Highlight own player",
			description = "Configures whether or not your own player should be highlighted",
			section = ownPlayerSection
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
			section = ownPlayerSection
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
			section = ownPlayerSection
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
			section = ownPlayerSection
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
			section = ownPlayerSection
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
			section = friendsSection
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
			section = friendsSection
	)
	default boolean highlightOfflineFriends()
	{
		return true;
	}

	@ConfigItem(
			position = 7,
			keyName = "disableFriendHighlightIfClanMember",
			name = "Do not highlight friends chat members",
			description = "Configures whether or not friends who are also in your friends chat should be highlighted as a friend",
			section = friendsSection
	)
	default boolean disableFriendHighlightIfFriendsChatMember()
	{
		return false;
	}

	@ConfigItem(
			position = 8,
			keyName = "friendNameColor",
			name = "Friend color",
			description = "Color of friend names",
			section = friendsSection
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
			section = friendsSection
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
			section = friendsSection
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
			section = friendsSection
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
			section = friendsSection
	)
	default boolean colorFriendPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
			position = 13,
			keyName = "drawClanMemberNames",
			name = "Highlight friends chat members",
			description = "Configures if friends chat members should be highlighted",
			section = friendsChatMembersSection
	)
	default boolean highlightFriendsChatMembers()
	{
		return true;
	}

	@ConfigItem(
			position = 14,
			keyName = "clanMemberColor",
			name = "Friends chat member color",
			description = "Color of friends chat members",
			section = friendsChatMembersSection
	)
	default Color getFriendsChatMemberColor()
	{
		return new Color(170, 0, 255);
	}

	@ConfigItem(
			position = 15,
			keyName = "drawClanMemberTiles",
			name = "Draw tiles under friends chat members",
			description = "Configures whether or not tiles under highlighted friends chat members should be drawn",
			section = friendsChatMembersSection
	)
	default boolean drawFriendsChatMemberTiles()
	{
		return false;
	}

	@ConfigItem(
			position = 16,
			keyName = "clanPlayerNamePosition",
			name = "Name position",
			description = "Configures the position of drawn friends chat member names, or if they should be disabled",
			section = friendsChatMembersSection
	)
	default PlayerNameLocation getFriendsChatMemberPlayerNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
			position = 17,
			keyName = "drawClanMinimapNames",
			name = "Draw friends chat member names on minimap",
			description = "Configures whether or not minimap names for friends chat members with rendered names should be drawn",
			section = friendsChatMembersSection
	)
	default boolean drawFriendsChatMemberMinimapNames()
	{
		return false;
	}

	@ConfigItem(
			position = 18,
			keyName = "colorClanPlayerMenu",
			name = "Colorize player menu for friends chat members",
			description = "Color right click menu for friends chat members",
			section = friendsChatMembersSection
	)
	default boolean colorFriendsChatMemberPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
			position = 19,
			keyName = "drawTeamMemberNames",
			name = "Highlight team members",
			description = "Configures whether or not team members should be highlighted",
			section = teamCapeMembersSection
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
			section = teamCapeMembersSection
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
			section = teamCapeMembersSection
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
			section = teamCapeMembersSection
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
			section = teamCapeMembersSection
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
			section = teamCapeMembersSection
	)
	default boolean colorTeamMemberPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
			position = 25,
			keyName = "drawNonClanMemberNames",
			name = "Highlight others",
			description = "Configures whether or not other players should be highlighted",
			section = othersSection
	)
	default boolean highlightOthers()
	{
		return false;
	}

	@ConfigItem(
			position = 26,
			keyName = "nonClanMemberColor",
			name = "Others color",
			description = "Color of other players names",
			section = othersSection
	)
	default Color getOthersColor()
	{
		return Color.RED;
	}

	@ConfigItem(
			position = 27,
			keyName = "drawNonClanTiles",
			name = "Draw tiles under other players",
			description = "Configures whether or not tiles under highlighted other players should be drawn",
			section = othersSection
	)
	default boolean drawOthersTiles()
	{
		return false;
	}

	@ConfigItem(
			position = 28,
			keyName = "nonClanPlayerNamePosition",
			name = "Name position",
			description = "Configures the position of drawn other player names, or if they should be disabled",
			section = othersSection
	)
	default PlayerNameLocation getOthersPlayerNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
			position = 29,
			keyName = "drawNonClanMinimapNames",
			name = "Draw other player names on minimap",
			description = "Configures whether or not minimap names for other players with rendered names should be drawn",
			section = othersSection
	)
	default boolean drawOthersMinimapNames()
	{
		return false;
	}

	@ConfigItem(
			position = 30,
			keyName = "colorNonClanPlayerMenu",
			name = "Colorize player menu for other players",
			description = "Color right click menu for other players",
			section = othersSection
	)
	default boolean colorOthersPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
			position = 31,
			keyName = "notifyOnNonClanMemberSpawned",
			name = "Notify on other player spawn",
			description = "Receive a notification when a other player appears by logging in or running into the " +
					"player render range in a PvP zone. Notifications will not be triggered in safe death PvP areas",
			section = playerSpawnNotificationsSection
	)
	default boolean notifyOnOtherPlayerSpawned()
	{
		return false;
	}

	@ConfigItem(
			position = 32,
			keyName = "notifyOnlyOnSkulledPlayers",
			name = "Notify only on skulled players",
			description = "Only receive player spawn notifications for skulled players",
			section = playerSpawnNotificationsSection
	)
	default boolean notifyOnlyOnSkulledPlayers()
	{
		return false;
	}

	@Units(Units.TICKS)
	@ConfigItem(
			position = 33,
			keyName = "delayBetweenPlayerSpawnedNotifications",
			name = "Notification cooldown",
			description = "Configures the minimum game ticks between player spawned notifications (600ms per tick)",
			section = playerSpawnNotificationsSection
	)
	default int delayBetweenPlayerSpawnedNotifications()
	{
		return 3;
	}

	@ConfigItem(
			position = 34,
			keyName = "ignoredPlayerNames",
			name = "Ignored players",
			description = "Configures players that will be ignored by player spawn notifications. Format: (name), (name)",
			section = playerSpawnNotificationsSection
	)
	default String getIgnoredPlayerNames()
	{
		return "";
	}

	@ConfigItem(
			position = 35,
			keyName = "clanMenuIcons",
			name = "Show friends chat ranks",
			description = "Add friends chat rank to right click menu and next to player names",
			section = friendsChatMembersSection
	)
	default boolean showFriendsChatRanks()
	{
		return true;
	}
}