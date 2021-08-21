package net.runelite.api.events;

import lombok.Data;
import net.runelite.api.Player;
import net.runelite.api.SkullIcon;

/**
 * Posted when a player skull changes.
 */
@Data
public class SkullChanged
{
	private final Player player;
	private final SkullIcon oldSkullIcon;
	private final SkullIcon newSkullIcon;
}
