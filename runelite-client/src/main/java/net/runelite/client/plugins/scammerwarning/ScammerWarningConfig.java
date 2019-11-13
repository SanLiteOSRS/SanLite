package net.runelite.client.plugins.scammerwarning;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("scammerwarning")
public interface ScammerWarningConfig extends Config
{
	@ConfigItem(
			position = 1,
			keyName = "bannedPlayers",
			name = "Manual Scammer List",
			description = "Manually add players separated by commas that you wish to be warned about while in a clan/cox/tob party",
			group = "Ban lists"
	)
	default String getBannedPlayers()
	{
		return "";
	}

	@ConfigItem(
			position = 2,
			keyName = "enableWDRScam",
			name = "WeDoRaids Scammer List",
			description = "Incorporate WDR Scammer list",
			group = "Ban lists"
	)
	default boolean enableWDRScam()
	{
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "enableWDRToxic",
			name = "WeDoRaids Toxic List",
			description = "Incorporate WDR Toxic list",
			group = "Ban lists"
	)
	default boolean enableWDRToxic()
	{
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "enableRuneWatch",
			name = "RuneWatch Scammer List",
			description = "Incorporate RuneWatch potential scammer list",
			group = "Ban lists"
	)
	default boolean enableRuneWatch()
	{
		return true;
	}

	@ConfigItem(
			position = 5,
			keyName = "highlightInClan",
			name = "Highlight red in clan chat",
			description = "Highlights Scammer\'s name in your current clan chat.",
			group = "Highlight"
	)
	default boolean highlightInClan()
	{
		return true;
	}

	@ConfigItem(
			position = 6,
			keyName = "highlightInTrade",
			name = "Highlight red in trade screen",
			description = "Highlights Scammer\'s name in your trade window",
			group = "Highlight"
	)
	default boolean highlightInTrade()
	{
		return true;
	}
}