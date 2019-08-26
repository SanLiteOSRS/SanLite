package net.runelite.client.plugins.theatreofblood;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public enum TheatreOfBloodEncounterRegions
{
	MAIDEN_REGIONS(12613, 12869),
	BLOAT_REGIONS(13125),
	NYLOCAS_REGIONS(13122),
	SOTETSEG_REGIONS(13123, 13379),
	XARPUS_REGIONS(12612),
	VERZIK_REGIONS(12611);

	@Getter
	private static final List<int[]> TOB_REGIONS;

	private final int[] regions;

	static
	{
		List<int[]> tobRegions = new ArrayList<>();

		for (TheatreOfBloodEncounterRegions regions1 : values())
		{
			tobRegions.add(regions1.regions);
		}
		TOB_REGIONS = tobRegions;
	}

	TheatreOfBloodEncounterRegions(int... regions)
	{
		this.regions = regions;
	}
}
