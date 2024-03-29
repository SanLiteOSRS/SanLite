package net.runelite.rs.api;

import net.runelite.api.ItemLayer;
import net.runelite.mapping.Import;

public interface RSItemLayer extends ItemLayer
{
	@Import("x")
	@Override
	int getX();

	@Import("y")
	@Override
	int getY();

	@Import("z")
	@Override
	int getZ();

	@Import("tag")
	@Override
	long getHash();

	@Import("height")
	int getHeight();

	@Import("first")
	@Override
	RSRenderable getBottom();

	@Import("second")
	@Override
	RSRenderable getMiddle();

	@Import("third")
	@Override
	RSRenderable getTop();

	void setPlane(int plane);
}
