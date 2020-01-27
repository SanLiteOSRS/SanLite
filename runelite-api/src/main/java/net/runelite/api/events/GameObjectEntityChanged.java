package net.runelite.api.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.runelite.api.Entity;
import net.runelite.api.GameObject;

/**
 * An event where the {@link Entity} of a {@link GameObject} has been replaced.
 */
@Data
@AllArgsConstructor
public class GameObjectEntityChanged
{
	/**
	 * The game object that had their entity changed.
	 */
	private GameObject gameObject;
}
