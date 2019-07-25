package net.runelite.rs.api;

import net.runelite.api.MainBufferProvider;
import java.awt.Component;
import java.awt.Image;
import net.runelite.mapping.Import;

public interface RSRasterProvider extends RSAbstractRasterProvider, MainBufferProvider
{
	@Import("image")
	@Override
	Image getImage();

	@Import("image")
	void setImage(Image image);

	@Import("component")
	Component getCanvas();
}
