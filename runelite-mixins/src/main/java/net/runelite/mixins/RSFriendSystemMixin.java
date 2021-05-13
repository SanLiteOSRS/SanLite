package net.runelite.mixins;

import net.runelite.api.Friend;
import net.runelite.api.Ignore;
import net.runelite.api.events.AddedFriend;
import net.runelite.api.events.RemovedFriend;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSFriendSystem;

@Mixin(RSFriendSystem.class)
public abstract class RSFriendSystemMixin implements RSFriendSystem
{
	@Shadow("client")
	private static RSClient client;

	@MethodHook("addFriend")
	@Inject
	public void rl$addFriend(String friendName)
	{
		Friend friend = this.getFriendContainer().findByName(friendName);
		if (friend != null)
		{
			client.getCallbacks().post(new AddedFriend(friend));
		}
	}

	@MethodHook("removeFriend")
	@Inject
	public void rl$removeFriend(String friendName)
	{
		Friend friend = this.getFriendContainer().findByName(friendName);
		if (friend != null)
		{
			client.getCallbacks().post(new RemovedFriend(friend));
		}
	}

	@MethodHook("addIgnore")
	@Inject
	public void rl$addIgnore(String ignoreName)
	{
		Ignore ignore = this.getIgnoreContainer().findByName(ignoreName);
		if (ignore != null)
		{
			client.getCallbacks().post(new AddedFriend(ignore));
		}
	}

	@MethodHook("removeIgnore")
	@Inject
	public void rl$removeIgnore(String ignoreName)
	{
		Ignore ignore = this.getIgnoreContainer().findByName(ignoreName);
		if (ignore != null)
		{
			client.getCallbacks().post(new RemovedFriend(ignore));
		}
	}
}
