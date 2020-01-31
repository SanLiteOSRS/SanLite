package net.runelite.client.plugins.transmog;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("Transmog")
public interface TransmogConfig extends Config
{
	String CONFIG_GROUP = "transmog";
	String EQUIPMENT_SETS = "equipmentsets";

	@ConfigItem(
			keyName = "displayDebugOverlay",
			name = "Display debug overlay",
			description = "Display debug overlay",
			position = 10
	)
	default boolean displayDebugOverlay()
	{
		return false;
	}
}
