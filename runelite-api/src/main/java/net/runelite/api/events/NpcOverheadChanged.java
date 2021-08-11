package net.runelite.api.events;

import lombok.Data;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPCComposition;

/**
 * Posted when a NPC overhead prayer changes.
 */
@Data
public class NpcOverheadChanged
{
	private final NPCComposition npcComposition;
	private final HeadIcon oldOverheadIcon;
	private final HeadIcon newOverheadIcon;
}
