package net.runelite.rs.api;

import net.runelite.api.WallObject;
import net.runelite.mapping.Import;

public interface RSWallObject extends WallObject
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

	@Import("orientationA")
	@Override
	int getOrientationA();

	@Import("orientationB")
	@Override
	int getOrientationB();

	@Import("renderable1")
	@Override
	RSRenderable getRenderable1();

	@Import("renderable2")
	@Override
	RSRenderable getRenderable2();

	@Import("flags")
	@Override
	int getConfig();

	void setPlane(int plane);
}
