package net.runelite.client.plugins.alchemicalhydra;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum AttackStyleOverlayLocation
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
