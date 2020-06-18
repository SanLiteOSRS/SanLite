package net.runelite.mixins;

import net.runelite.api.FriendsChatRank;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSFriendsChatMember;

@Mixin(RSFriendsChatMember.class)
public abstract class RSFriendsChatMemberMixin implements RSFriendsChatMember
{
	@Override
	@Inject
	public FriendsChatRank getRank()
	{
		return FriendsChatRank.valueOf(getRSRank());
	}
}
