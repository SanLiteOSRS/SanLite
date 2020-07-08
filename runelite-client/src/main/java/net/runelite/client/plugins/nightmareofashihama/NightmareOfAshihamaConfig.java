package net.runelite.client.plugins.nightmareofashihama;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("nightmareofashihama")
public interface NightmareOfAshihamaConfig extends Config
{
	@ConfigSection(
			name = "Current attack style",
			description = "Options for The Nightmare's current attack style highlight",
			position = 0
	)
	String currentAttackStyleSection = "currentAttackStyle";

	@ConfigSection(
			name = "Notifications",
			description = "Options for plugins notifications",
			position = 14
	)
	String notificationsSection = "notifications";

	@ConfigSection(
			name = "Colors",
			description = "Options for colors used throughout the plugin",
			position = 14
	)
	String colorsSection = "colors";

	@ConfigItem(
			keyName = "displayCurrentAttack",
			name = "Display current attack",
			description = "Displays the attack above The Nightmare when it does it. Useful for playing without sound",
			section = currentAttackStyleSection,
			position = 1
	)
	default boolean displayCurrentAttack()
	{
		return true;
	}

	@Range(
			min = -125,
			max = 65
	)
	@ConfigItem(
			keyName = "currentAttackHeight",
			name = "Icon height",
			description = "The height of the current attack icon that is display on The Nightmare",
			section = currentAttackStyleSection,
			position = 2
	)
	default int getCurrentAttackHeight()
	{
		return 30;
	}

	@ConfigItem(
			keyName = "displayPrayersCursedTimer",
			name = "Display prayers cursed timer",
			description = "Displays a timer with the remaining duration of the prayers shuffle curse",
			position = 3
	)
	default boolean displayPrayersCursedTimer()
	{
		return true;
	}

	@ConfigItem(
			keyName = "notifyOnPrayersShuffled",
			name = "Notify on prayers shuffled",
			description = "Sends a notification when The Nightmare shuffles your prayers",
			section = notificationsSection,
			position = 4
	)
	default boolean notifyOnPrayersShuffled()
	{
		return false;
	}

	@ConfigItem(
			keyName = "notifyOnParasite",
			name = "Notify on parasite",
			description = "Sends a notification when a parasite impregnates you",
			section = notificationsSection,
			position = 5
	)
	default boolean notifyOnParasite()
	{
		return true;
	}

	@ConfigItem(
			keyName = "notifyOnDrowsy",
			name = "Notify on drowsy",
			description = "Sends a notification when you get affected by the drowsy effect",
			section = notificationsSection,
			position = 6
	)
	default boolean notifyOnDrowsy()
	{
		return false;
	}

	@ConfigItem(
			keyName = "highlightActiveTotems",
			name = "Highlight active totems",
			description = "Highlight The Nightmare's totems when they are damageable",
			position = 7
	)
	default boolean highlightActiveTotems()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "activeTotemColor",
			name = "Active totem color",
			description = "Color of The Nightmare's active totems",
			section = colorsSection,
			position = 8
	)
	default Color getActiveTotemColor()
	{
		return new Color(219, 217, 0);
	}

	@ConfigItem(
			keyName = "highlightGhostAttackTiles",
			name = "Highlight ghost attack tiles",
			description = "Highlight the tiles for The Nightmare's ghost attacks",
			position = 9
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
			section = colorsSection,
			position = 10
	)
	default Color getGhostAttackColor()
	{
		return new Color(180, 18, 24);
	}

	@ConfigItem(
			keyName = "highlightInfectiousSpores",
			name = "Highlight infectious spores",
			description = "Highlight the tiles for The Nightmare's infectious spores",
			position = 11
	)
	default boolean highlightInfectiousSpores()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "infectiousSporesColor",
			name = "Infectious spore marker",
			description = "Color of The Nightmare's infectious spore tile marker",
			section = colorsSection,
			position = 12
	)
	default Color getInfectiousSporesColor()
	{
		return new Color(105, 81, 71);
	}

	@ConfigItem(
			keyName = "tileMarkersLineSize",
			name = "Tile markers line size",
			description = "The size of the outside line for tile markers",
			position = 13
	)
	default StrokeSize getTileMarkersLineSize()
	{
		return StrokeSize.NORMAL;
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays plugin debug overlay. This displays variables that the plugin uses to function",
			position = 14
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
