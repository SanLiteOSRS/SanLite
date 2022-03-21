package net.runelite.rs.api;

import net.runelite.api.GroundObject;
import net.runelite.mapping.Import;

public interface RSGroundObject extends GroundObject
{
	@Import("tag")
	@Override
	long getHash();

	@Import("x")
	@Override
	int getX();

	@Import("y")
	@Override
	int getY();

	@Import("z")
	@Override
	int getZ();

	@Import("renderable")
	@Override
	RSRenderable getRenderable();

	@Import("flags")
	@Override
	int getConfig();

	void setPlane(int plane);
}
