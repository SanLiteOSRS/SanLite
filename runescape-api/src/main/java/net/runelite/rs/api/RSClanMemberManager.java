package net.runelite.rs.api;

import net.runelite.api.ClanMemberManager;
import net.runelite.mapping.Import;

public interface RSClanMemberManager extends ClanMemberManager
{
	@Import("owner")
	String getClanOwner();

	@Import("name")
	String getClanChatName();
}
