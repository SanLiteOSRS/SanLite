package net.runelite.client.config;

import java.awt.Font;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FontStyle
{
	BOLD("Bold", Font.BOLD),
	ITALIC("Italic", Font.ITALIC),
	PLAIN("Plain", Font.PLAIN);

	private String name;
	private int font;

	@Override
	public String toString()
	{
		return getName();
	}
}