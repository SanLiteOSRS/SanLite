package net.runelite.client.plugins.combattickcounter;

import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("Combat Tick Counter")
public interface CombatTickCounterConfig extends Config
{
	@ConfigItem(
			keyName = "Show Tick Counter",
			name = "Show Tick Counter",
			description = "Display the tick counter overlay",
			position = 1
	)
	default boolean showTickCounter()
	{
		return true;
	}

	@ConfigItem(
			keyName = "Reset on New Instance",
			name = "Reset On New Instance",
			description = "Resets counter when entering a new instance",
			position = 2
	)
	default boolean resetOnNewInstance()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "selfColor",
			name = "Your color",
			description = "Color of your own name on the overlay",
			position = 3
	)
	default Color selfColor()
	{
		return new Color(45, 203, 255);
	}

	@Alpha
	@ConfigItem(
			keyName = "totalColor",
			name = "Total color",
			description = "Color of total on the overlay",
			position = 4
	)
	default Color totalColor()
	{
		return new Color(245, 189, 19);
	}

	@Alpha
	@ConfigItem(
			keyName = "otherColor",
			name = "Other players color",
			description = "Color of other players names on the overlay",
			position = 5
	)
	default Color otherColor()
	{
		return Color.white;
	}

	@Alpha
	@ConfigItem(
			keyName = "backgroundColor",
			name = "Background color",
			description = "Overlay background color",
			position = 6
	)
	default Color backgroundColor()
	{
		return new Color(70, 61, 50, 156);
	}

	@Alpha
	@ConfigItem(
			keyName = "titleColor",
			name = "Title color",
			description = "Overlay title color",
			position = 7
	)
	default Color titleColor()
	{
		return Color.white;
	}
}