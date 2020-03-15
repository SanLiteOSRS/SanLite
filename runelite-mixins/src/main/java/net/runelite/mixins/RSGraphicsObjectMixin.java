package net.runelite.mixins;

import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.GraphicsObjectDespawned;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSGraphicsObject;

@Mixin(RSGraphicsObject.class)
public abstract class RSGraphicsObjectMixin implements RSGraphicsObject
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	RSGraphicsObjectMixin()
	{
		final GraphicsObjectCreated event = new GraphicsObjectCreated(this);
		client.getCallbacks().post(event);
	}

	@Override
	@Inject
	public LocalPoint getLocation()
	{
		return new LocalPoint(this.getX(), this.getY());
	}

	@FieldHook("isFinished")
	@Inject
	public void onGraphicsObjectDespawned(int idx)
	{
		if (!this.isFinished())
		{
			return;
		}
		
		client.getCallbacks().post(new GraphicsObjectDespawned(this));
	}
}
