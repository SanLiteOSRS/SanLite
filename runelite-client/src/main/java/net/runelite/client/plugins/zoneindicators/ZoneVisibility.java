package net.runelite.client.plugins.zoneindicators;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ZoneVisibility
{
	HIDE("Hide"),
	SHOW_IN_PVP("Show in PvP"),
	SHOW_EVERYWHERE("Show everywhere");

	private final String visibility;

	@Override
	public String toString()
	{
		return visibility;
	}
}