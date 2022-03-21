package net.runelite.mixins;

import java.awt.Shape;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.geometry.Shapes;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSDecorativeObject;

@Mixin(RSDecorativeObject.class)
public abstract class RSDecorativeObjectMixin implements RSDecorativeObject
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private int decorativeObjectPlane;

	@Inject
	@Override
	public int getPlane()
	{
		return decorativeObjectPlane;
	}

	@Inject
	@Override
	public void setPlane(int plane)
	{
		this.decorativeObjectPlane = plane;
	}

	@Inject
	public RSModel getModel1()
	{
		RSRenderable renderable = getRenderable();
		if (renderable == null)
		{
			return null;
		}

		RSModel model;

		if (renderable instanceof Model)
		{
			model = (RSModel) renderable;
		}
		else
		{
			model = renderable.getModel();
		}

		return model;
	}

	@Inject
	public RSModel getModel2()
	{
		RSRenderable renderable = getRenderable2();
		if (renderable == null)
		{
			return null;
		}

		RSModel model;

		if (renderable instanceof Model)
		{
			model = (RSModel) renderable;
		}
		else
		{
			model = renderable.getModel();
		}

		return model;
	}

	@Inject
	@Override
	public Shape getClickbox()
	{
		Shape clickboxA = Perspective.getClickbox(client, getModel1(), 0, getX() + getXOffset(), getY() + getYOffset(), getZ());
		Shape clickboxB = Perspective.getClickbox(client, getModel2(), 0, getX(), getY(), getZ());

		if (clickboxA == null && clickboxB == null)
		{
			return null;
		}

		if (clickboxA != null && clickboxB != null)
		{
			return new Shapes(new Shape[]{clickboxA, clickboxB});
		}

		if (clickboxA != null)
		{
			return clickboxA;
		}

		return clickboxB;
	}

	@Inject
	@Override
	public Shape getConvexHull()
	{
		RSModel model = getModel1();

		if (model == null)
		{
			return null;
		}

		int tileHeight = Perspective.getTileHeight(client, new LocalPoint(getX(), getY()), client.getPlane());
		return model.getConvexHull(getX() + getXOffset(), getY() + getYOffset(), 0, tileHeight);
	}

	@Inject
	@Override
	public Shape getConvexHull2()
	{
		RSModel model = getModel2();

		if (model == null)
		{
			return null;
		}

		int tileHeight = Perspective.getTileHeight(client, new LocalPoint(getX(), getY()), client.getPlane());
		return model.getConvexHull(getX(), getY(), 0, tileHeight);
	}
}
