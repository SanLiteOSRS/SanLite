package net.runelite.mixins;

import net.runelite.api.ClanMember;
import net.runelite.api.ClanMemberManager;
import net.runelite.api.events.ClanMemberJoined;
import net.runelite.api.events.ClanMemberLeft;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.*;

@Mixin(RSClanMemberManager.class)
public abstract class RSClanMemberManagerMixin implements ClanMemberManager
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	public void rl$add(RSUsername name, RSUsername prevName)
	{
		ClanMember member = findByName(name.getName());
		if (member == null)
		{
			return;
		}

		ClanMemberJoined event = new ClanMemberJoined(member);
		client.getCallbacks().postDeferred(event);
	}

	@Inject
	public void rl$remove(RSUser nameable)
	{
		ClanMember member = findByName(nameable.getName());
		if (member == null)
		{
			return;
		}

		ClanMemberLeft event = new ClanMemberLeft(member);
		client.getCallbacks().postDeferred(event);
	}
}
