package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSFriendLoginUpdate;
import net.runelite.rs.api.RSUsername;

@Mixin(RSFriendLoginUpdate.class)
public abstract class RSFriendLoginUpdatesMixin implements RSFriendLoginUpdate
{
	@Inject
	@Override
	public String getName()
	{
		final RSUsername rsName = getRsName();

		if (rsName == null)
		{
			return null;
		}

		String name = rsName.getName();

		if (name == null)
		{
			return null;
		}

		return name.replace('\u00A0', ' ');
	}
}