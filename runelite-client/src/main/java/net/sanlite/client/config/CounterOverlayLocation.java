package net.sanlite.client.config;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CounterOverlayLocation
{
	ABOVE_HEAD("Above head"),
	FIXED("Fixed overlay"),
	BOTH("Both");

	private final String name;

	@Override
	public String toString()
	{
		return name;
	}
}
