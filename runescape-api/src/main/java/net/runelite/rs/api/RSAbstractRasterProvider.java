package net.runelite.rs.api;

import net.runelite.api.BufferProvider;
import net.runelite.mapping.Import;

public interface RSAbstractRasterProvider extends BufferProvider
{
	@Import("pixels")
	@Override
	int[] getPixels();

	@Import("width")
	@Override
	int getWidth();

	@Import("height")
	@Override
	int getHeight();

	@Import("apply")
	void setRaster();
}
