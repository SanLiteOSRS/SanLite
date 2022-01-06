package net.sanlite.client.plugins.cerberus;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("cerberus")
public interface CerberusConfig extends Config
{
	@ConfigItem(
			keyName = "showAttackStyleCounter",
			name = "Show attack style counter",
			description = "Displays Cerberus's next attack above it's health bar, including the souls.",
			position = 1
	)
	default boolean showAttackStyleCounter()
	{
		return true;
	}

	@ConfigItem(
			keyName = "highlightLavaPoolTiles",
			name = "Highlight lava pool tiles",
			description = "Highlight the tiles for the Cerberus's lava pool attack",
			position = 2
	)
	default boolean highlightLavaPoolTiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
			keyName = "lavaPoolColor",
			name = "Lava pool marker",
			description = "Color of Cerberus's lava pool tile markers",
			position = 3
	)
	default Color getLavaPoolColor()
	{
		return new Color(214, 93, 29);
	}

	@ConfigItem(
			keyName = "borderWidth",
			name = "Border Width",
			description = "Width of the highlighted tile border",
			position = 4
	)
	default double borderWidth()
	{
		return 2;
	}

	@ConfigItem(
			keyName = "showDebugOverlay",
			name = "Display debug overlay",
			description = "Displays plugin debug overlay. This displays variables that the plugin uses to function",
			position = 5
	)
	default boolean showDebugOverlay()
	{
		return false;
	}
}
