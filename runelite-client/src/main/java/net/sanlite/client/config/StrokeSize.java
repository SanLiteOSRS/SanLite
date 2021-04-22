package net.sanlite.client.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum StrokeSize
{

	THIN("Thin", 1),
	NORMAL("Normal", 2),
	THICK("Thick", 3);

	private final String name;

	@Getter
	private final int size;

	@Override
	public String toString()
	{
		return name;
	}
}
