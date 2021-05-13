package net.runelite.mixins;

import net.runelite.api.events.NameableNameChanged;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSNameable;
import net.runelite.rs.api.RSUsername;

@Mixin(RSNameable.class)
public abstract class RSNameableMixin implements RSNameable
{
	@Shadow("client")
	private static RSClient client;

	@Override
	@Inject
	public String getName()
	{
		return getRsName().getName();
	}

	@Override
	@Inject
	public String getPrevName()
	{
		RSUsername prevName = getRsPrevName();
		return prevName == null ? null : prevName.getName();
	}

	@Inject
	@FieldHook("previousUsername")
	public void onNameableNameChanged(int idx)
	{
		client.getCallbacks().post(new NameableNameChanged(this));
	}
}
