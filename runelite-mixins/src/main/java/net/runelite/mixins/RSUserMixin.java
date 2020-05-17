package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSUser;

@Mixin(RSUser.class)
public abstract class RSUserMixin implements RSUser
{
	@Inject
	@Override
	public String getName()
	{
		return getRsName().getName();
	}

	@Inject
	@Override
	public String getPrevName()
	{
		return getRsPrevName().getName();
	}
}
