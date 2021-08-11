package net.runelite.api.events;

import lombok.Data;
import net.runelite.api.HeadIcon;
import net.runelite.api.Player;

/**
 * Posted when a player overhead prayer changes.
 */
@Data
public class PlayerOverheadChanged
{
	private final Player player;
	private final HeadIcon oldOverheadIcon;
	private final HeadIcon newOverheadIcon;
}
