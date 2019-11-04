package net.runelite.client.plugins.hidersn;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("hidersn")
public interface HideRsnConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "hideRSN",
			name = "Hide your and clanmates RSN from appearing in the chatbox",
			description = "Configures whether your/clan mates rsn will be visible in the chatbox"
	)
	default boolean hideRSN()
	{
		return false;
	}
}
