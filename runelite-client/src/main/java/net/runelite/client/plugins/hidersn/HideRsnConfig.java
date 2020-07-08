package net.runelite.client.plugins.hidersn;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("hidersnconfig")
public interface HideRsnConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "CustomRsn",
			name = "Custom RSN",
			description = "Custom RSN to replace your own with"
	)
	default String getCustomRSN()
	{
		return "RSNHIDER";
	}
}
