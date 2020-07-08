package net.runelite.client.plugins.usernamechanger;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("usernameChanger")
public interface UsernameChangerConfig extends Config
{
	@ConfigItem(
			keyName = "customUsername",
			name = "Custom username",
			description = "Custom username to replace your own with, this is only visible on your client",
			position = 0
	)
	default String getCustomUsername()
	{
		return "";
	}
}
