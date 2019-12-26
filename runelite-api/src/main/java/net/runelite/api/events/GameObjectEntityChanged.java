package net.runelite.api.events;

import lombok.Data;
import net.runelite.api.GameObject;

@Data
public class GameObjectEntityChanged
{
	/**
	 * The game object that had their entity changed.
	 */
	private GameObject gameObject;
}
