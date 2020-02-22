package net.runelite.client.plugins.attacktimer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.FontStyle;

import java.awt.*;

@ConfigGroup("attacktimer")
public interface AttackTimerConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "timerFontSize",
			name = "Font size",
			description = "Font size for timer"
	)
	default int getTimerFontSize()
	{
		return 16;
	}

	@ConfigItem(
			position = 1,
			keyName = "timerFontStyle",
			name = "Font style",
			description = "Font style for timer. Choose between bold, italics or plain"
	)
	default FontStyle getTimerFontStyle()
	{
		return FontStyle.PLAIN;
	}

	@ConfigItem(
			position = 2,
			keyName = "timerFontColor",
			name = "Font color",
			description = "Color of timer font"
	)
	default Color getTimerFontColor()
	{
		return new Color(255, 255, 255, 255);
	}

	@ConfigItem(
			position = 3,
			keyName = "timerZOffset",
			name = "Timer Z Offset",
			description = "Z Offset for timer"
	)
	default int getZOffset()
	{
		return 0;
	}
}
