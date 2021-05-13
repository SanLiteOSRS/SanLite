package net.runelite.api.events;

import lombok.Value;
import net.runelite.api.Nameable;

/**
 * An event where a request to add a friend is sent to the server.
 */
@Value
public class AddedFriend
{
	/**
	 * The name of the added friend.
	 */
	Nameable nameable;
}
