package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSFriendSystem
{
	@Import("friendsList")
	RSFriendsList getFriendContainer();

	@Import("ignoreList")
	RSIgnoreList getIgnoreContainer();

	@Import("isFriended")
	boolean isFriended(RSUsername var1, boolean var2);
}
