package net.runelite.client.plugins.playerscouter;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("playerscouter")
public interface PlayerScouterConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "playerRSN",
			name = "Enter RSN of player to scout",
			description = "RSN of one player. More than one name will not work."
	)
	default String getPlayerRSN()
	{
		return "";
	}

	@ConfigItem(
			position = 1,
			keyName = "notificationsEnabled",
			name = "Display windows notifications if the player is spotted.",
			description = "Display notification on spot"
	)
	default boolean getNotificationsEnabled()
	{
		return true;
	}
}
