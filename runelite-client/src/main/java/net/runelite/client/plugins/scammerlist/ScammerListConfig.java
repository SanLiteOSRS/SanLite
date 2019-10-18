package net.runelite.client.plugins.scammerlist;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("scammerlist")
public interface ScammerListConfig extends Config
{
	@ConfigItem(
			position = 1,
			keyName = "bannedPlayers",
			name = "Manual Scammer List",
			description = "Manually add players seperated by commas that you wish to be warned about while in a clan/cox/tob party",
			group = "Lists"
	)
	default String getBannedPlayers()
	{
		return "";
	}

	@ConfigItem(
			position = 2,
			keyName = "enableWDRScam",
			name = "Enable WDR Scammer List",
			description = "Incorporate WDR Scammer list",
			group = "Lists"
	)
	default boolean enableWDRScam()
	{
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "enableWDRToxic",
			name = "Enable WDR Toxic List",
			description = "Incorporate WDR Toxic list",
			group = "Lists"
	)
	default boolean enableWDRToxic()
	{
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "enableRuneWatch",
			name = "Enable RuneWatch List",
			description = "Incorporate RuneWatch potential scammer list",
			group = "Lists"
	)
	default boolean enableRuneWatch()
	{
		return true;
	}

	@ConfigItem(
			position = 5,
			keyName = "highlightInClan",
			name = "Highlight red in Clan Chat",
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