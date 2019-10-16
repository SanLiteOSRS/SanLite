package net.runelite.client.plugins.multiindicators;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("multiindicators")
public interface MultiIndicatorsConfig extends Config
{
	@ConfigItem(
			keyName = "multicombatZoneVisibility",
			name = "Multicombat zones",
			description = "Determine where multicombat zones should be shown",
			position = 1
	)
	default ZoneVisibility multicombatZoneVisibility()
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
			description = "Show multicombat and safe zones on the minimap",
			position = 5
	)
	default boolean showMinimapLines()
	{
		return true;
	}

	@ConfigItem(
			keyName = "multicombatColor",
			name = "Multicombat zone color",
			description = "Choose color to use for marking multicombat zones",
			position = 6
	)
	default Color multicombatColor()
	{
		return Color.MAGENTA;
	}

	@ConfigItem(
			keyName = "safeZoneColor",
			name = "Safe zone color",
			description = "Choose color to use for marking safe zones in PvP/Deadman",
			position = 7
	)
	default Color safeZoneColor()
	{
		return Color.GREEN;
	}

	@ConfigItem(
			keyName = "wildernessLevelLinesColor",
			name = "Wilderness level lines color",
			description = "Choose color to use for marking wilderness level lines",
			position = 8
	)
	default Color wildernessLevelLinesColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
			keyName = "thinnerLines",
			name = "Thin lines",
			description = "Render multi lines, safe zone lines, and wildy level lines as 1 pixel wide instead of 2",
			position = 9
	)
	default boolean thinnerLines()
	{
		return false;
	}

}