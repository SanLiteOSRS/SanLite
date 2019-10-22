package net.runelite.client.plugins.spelleffecttimers;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.FontStyle;

import java.awt.*;

@ConfigGroup("spelleffecttimers")
public interface SpellEffectTimersConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "showFreezeTimersOverlay",
			name = "Show freeze timers",
			description = "Configures if freeze timers are shown"
	)
	default boolean showFreezeTimersOverlay()
	{
		return true;
	}

	@ConfigItem(
			position = 1,
			keyName = "showTeleblockTimersOverlay",
			name = "Show teleblock timers",
			description = "Configures if teleblock timers are shown"
	)
	default boolean showTeleblockTimersOverlay()
	{
		return true;
	}

	@ConfigItem(
			position = 2,
			keyName = "showVengTimersOverlay",
			name = "Show vengeance timers",
			description = "Configures if vengeance timers are shown"
	)
	default boolean showVengTimersOverlay()
	{
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "showVengActivatedOverlay",
			name = "Show vengeance acivated",
			description = "Configures if vengeance timers are shown"
	)
	default boolean showVengActivatedOverlay()
	{
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "showSpellImage",
			name = "Show spell image",
			description = "Configures if spell images are displayed on spell effect timers"
	)
	default boolean showSpellImage()
	{
		return true;
	}

	@ConfigItem(
			position = 5,
			keyName = "timersFontSize",
			name = "Text size",
			description = "Text size for timers"
	)
	default int getTimersFontSize()
	{
		return 16;
	}

	@ConfigItem(
			position = 6,
			keyName = "timersFontStyle",
			name = "Font style",
			description = "Font style for timers. Choose between bold, italics or plain"
	)
	default FontStyle getTimersFontStyle()
	{
		return FontStyle.PLAIN;
	}

	@ConfigItem(
			position = 7,
			keyName = "timersFontColor",
			name = "Font color",
			description = "Color of timers font"
	)
	default Color getTimersFontColor()
	{
		return new Color(255, 255, 255, 255);
	}
}
