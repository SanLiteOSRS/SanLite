package net.runelite.client.plugins.friendfinder;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.PlayerNameLocation;

import java.awt.*;

@ConfigGroup("friendfinder")
public interface FriendFinderConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "highlightOfflineFriends",
			name = "Highlight offline friends",
			description = "Configures whether or not friends who have their private off should be highlighted"
	)
	default boolean highlightOfflineFriends()
	{
		return true;
	}

	@ConfigItem(
			position = 1,
			keyName = "disableIfClanMember",
			name = "Disable highlighting if friend is in clan chat",
			description = "Configures whether or not friends who are also in your clan chat should be highlighted"
	)
	default boolean disableIfClanMember()
	{
		return false;
	}

	@ConfigItem(
			position = 2,
			keyName = "playerNamePosition",
			name = "Name position",
			description = "Configures the position of drawn friends names, or if they should be disabled"
	)
	default PlayerNameLocation playerNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
			position = 3,
			keyName = "drawFriendMinimapNames",
			name = "Draw names on minimap",
			description = "Configures whether or not friends names should be drawn on the minimap"
	)
	default boolean drawMinimapNames()
	{
		return false;
	}

	@ConfigItem(
			position = 4,
			keyName = "drawFriendTiles",
			name = "Draw tiles under friends",
			description = "Configures whether or not tiles under highlighted friends should be drawn"
	)
	default boolean drawTiles()
	{
		return false;
	}

	@ConfigItem(
			position = 5,
			keyName = "colorPlayerMenu",
			name = "Colorize player menu",
			description = "Color right click menu for friends"
	)
	default boolean colorPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
			position = 6,
			keyName = "friendNameColor",
			name = "Friend color",
			description = "Color of friend names"
	)
	default Color getFriendColor()
	{
		return new Color(0, 200, 83);
	}
}

