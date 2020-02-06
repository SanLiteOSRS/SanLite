package net.runelite.client.plugins.nightmareofashihama;

import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("nightmareofashihama")
public interface NightmareOfAshihamaConfig extends Config
{
	@ConfigItem(
			keyName = "highlightGhostAttackTiles",
			name = "Highlight ghost attack tiles",
			description = "Highlight the tiles for The Nightmare's ghost attacks",
			position = 1
	)
	default boolean highlightGhostAttackTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "ghostAttackColor",
			name = "Ghost attack marker",
			description = "Color of The Nightmare's ghost attack marker",
			group = "Colors",
			position = 2
	)
	default Color getGhostAttackColor()
	{
		return new Color(153, 0, 11);
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays plugin debug overlay. This displays variables that the plugin uses to function",
			position = 20
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
