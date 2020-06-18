package net.runelite.rs.api;

import net.runelite.api.FriendsChatManager;
import net.runelite.mapping.Import;

public interface RSFriendsChatManager extends FriendsChatManager
{
	@Import("owner")
	String getOwner();

	@Import("name")
	String getName();
}
