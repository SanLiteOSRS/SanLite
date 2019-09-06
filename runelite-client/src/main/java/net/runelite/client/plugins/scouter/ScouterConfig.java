package net.runelite.client.plugins.scouter;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("playerscouter")
public interface ScouterConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "playerRSN",
			name = "Enter RSN of player to scout",
			description = "RSN of just one player."
	)
	default String getPlayerRSN()
	{
		return "";
	}

	@ConfigItem(
			position = 1,
			keyName = "notificationsEnabled",
			name = "Display windows notifications if the player is spotted.",
			description = "Will send a windows notification if notifications are enabled in client settings."
	)
	default boolean getNotificationsEnabled()
	{
		return true;
	}
}
