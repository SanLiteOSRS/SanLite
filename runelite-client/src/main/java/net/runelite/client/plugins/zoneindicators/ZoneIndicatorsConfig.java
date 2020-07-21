package net.runelite.client.plugins.zoneindicators;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("Zone Indicators")
public interface ZoneIndicatorsConfig extends Config
{
	@ConfigItem(
			keyName = "multiCombatZoneVisibility",
			name = "Multi zones",
			description = "Determine where multi combat zones should be shown",
			position = 1
	)
	default ZoneVisibility getMultiCombatZoneVisibility()
	{
		return ZoneVisibility.SHOW_IN_PVP;
	}

	@ConfigItem(
			keyName = "pvpSafeZones",
			name = "PvP safe zones",
			description = "Show safe zones in PvP worlds",
			position = 2
	)
	default boolean showPvpSafeZones()
	{
		return true;
	}

	@ConfigItem(
			keyName = "deadmanSafeZones",
			name = "Deadman safe zones",
			description = "Show safe zones in Deadman worlds",
			position = 3
	)
	default boolean showDeadmanSafeZones()
	{
		return true;
	}

	@ConfigItem(
			keyName = "wildernessLevelLines",
			name = "Wilderness level lines",
			description = "Show wilderness level lines",
			position = 4
	)
	default boolean showWildernessLevelLines()
	{
		return false;
	}

	@ConfigItem(
			keyName = "showMinimapLines",
			name = "Show on minimap",
			description = "Show multi combat and safe zones on the minimap",
			position = 5
	)
	default boolean showMinimapLines()
	{
		return false;
	}

	@ConfigItem(
			keyName = "multiCombatColor",
			name = "Multi combat zone color",
			description = "Choose color to use for marking multi combat zones",
			position = 6
	)
	default Color getMultiCombatColor()
	{
		return new Color(237, 0, 0);
	}

	@ConfigItem(
			keyName = "safeZoneColor",
			name = "Safe zone color",
			description = "Choose color to use for marking safe zones in PvP/Deadman",
			position = 7
	)
	default Color getSafeZoneColor()
	{
		return Color.GREEN;
	}

	@ConfigItem(
			keyName = "wildernessLevelLinesColor",
			name = "Wilderness level lines",
			description = "Choose color to use for marking wilderness level lines",
			position = 8
	)
	default Color getWildernessLevelLinesColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			keyName = "thinnerLines",
			name = "Thin lines",
			description = "Render multi lines, safe zone lines, and wilderness level lines as 1 pixel wide instead of 2",
			position = 9
	)
	default boolean enableThinnerLines()
	{
		return false;
	}

	@Range(
			min = 15,
			max = 85
	)
	@ConfigItem(
			keyName = "indicatorLinesDrawDistance",
			name = "Lines draw distance",
			description = "Maximum draw distance of indicator lines in tiles",
			position = 10
	)
	default int getIndicatorLinesDrawDistance()
	{
		return 40;
	}

}