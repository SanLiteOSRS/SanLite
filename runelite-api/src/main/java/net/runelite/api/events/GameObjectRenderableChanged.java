package net.runelite.api.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.runelite.api.Renderable;
import net.runelite.api.GameObject;

/**
 * An event where the {@link Renderable} of a {@link GameObject} has been replaced.
 */
@Data
@AllArgsConstructor
public class GameObjectRenderableChanged
{
	/**
	 * The game object that had their entity changed.
	 */
	private GameObject gameObject;
}
