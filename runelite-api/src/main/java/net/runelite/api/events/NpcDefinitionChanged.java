package net.runelite.api.events;

import lombok.Value;
import net.runelite.api.NPC;

/**
 * Fires after the composition of an {@link NPC} changes.
 */
@Value
public class NpcDefinitionChanged
{
	/**
	 * The NPC of which the composition changed.
	 */
	private final NPC npc;
}
