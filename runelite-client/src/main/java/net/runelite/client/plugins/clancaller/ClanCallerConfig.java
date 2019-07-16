package net.runelite.client.plugins.clancaller;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("clancaller")
public interface ClanCallerConfig extends Config
{
	@ConfigItem(
		position = 1,
		keyName = "highlightCallers",
		name = "Highlight callers characters",
		description = "Configures whether or not callers should be highlighted"
	)
	default boolean highlightCallers()
	{
		return false;
	}

	@ConfigItem(
		position = 2,
		keyName = "highlightCallersPile",
		name = "Highlight callers targets characters",
		description = "Configures whether or not callers targets characters should be highlighted"
	)
	default boolean highlightCallersPile()
	{
		return false;
	}

	@ConfigItem(
		position = 3,
		keyName = "callersRsns",
		name = "Callers RSN(s)",
		description = "Configures the callers RSNs. Separate by commas"
	)
	default String getCallerRsns()
	{
		return "";
	}

	@ConfigItem(
		position = 4,
		keyName = "colorPlayerMenu",
		name = "Colorize player menu",
		description = "Color right click menu for players"
	)
	default boolean colorPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
		position = 5,
		keyName = "callerNamePosition",
		name = "Caller name position",
		description = "Configures the position of drawn caller player names, or if they should be disabled",
		group = "Caller(s) highlight"
	)
	default PlayerNameLocation callerNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
		position = 6,
		keyName = "drawCallerPlayerTiles",
		name = "Draw tiles under callers characters",
		description = "Configures whether or not tiles under callers characters should be drawn",
		group = "Caller(s) highlight"
	)
	default boolean drawCallerTiles()
	{
		return false;
	}

	@ConfigItem(
		position = 7,
		keyName = "drawCallerMinimapNames",
		name = "Draw caller names on minimap",
		description = "Configures whether or not minimap names for callers characters with rendered names should be drawn",
		group = "Caller(s) highlight"
	)
	default boolean drawCallerMinimapNames()
	{
		return false;
	}

	@ConfigItem(
		position = 8,
		keyName = "pileNamePosition",
		name = "Piles name position",
		description = "Configures the position of drawn pile player names, or if they should be disabled",
		group = "Pile highlight"
	)
	default PlayerNameLocation pileNamePosition()
	{
		return PlayerNameLocation.ABOVE_HEAD;
	}

	@ConfigItem(
		position = 9,
		keyName = "drawPilePlayerTiles",
		name = "Draw tiles under piles characters",
		description = "Configures whether or not tiles under piles characters should be drawn",
		group = "Pile highlight"
	)
	default boolean drawPileTiles()
	{
		return false;
	}

	@ConfigItem(
		position = 10,
		keyName = "drawPileMinimapNames",
		name = "Draw piles names on minimap",
		description = "Configures whether or not minimap names for piles characters with rendered names should be drawn",
		group = "Pile highlight"
	)
	default boolean drawPileMinimapNames()
	{
		return false;
	}

	@ConfigItem(
		position = 11,
		keyName = "callerNameColor",
		name = "Caller color",
		description = "Color of callers",
		group = "Highlight caller settings"
	)
	default Color getCallerColor()
	{
		return new Color(255, 246, 112);
	}

	@ConfigItem(
		position = 12,
		keyName = "callerPileColor",
		name = "Callers pile color",
		description = "Color of callers pile",
		group = "Highlight pile settings"
	)
	default Color getCallerPileColor()
	{
		return new Color(244, 0, 0);
	}
}
