package net.sanlite.client.plugins.gauntlet.id;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class GauntletId
{
	public static boolean inGauntletRegion(int[] mapRegions, boolean isInInstancedRegion)
	{
		return Arrays.equals(mapRegions, Region.GAUNTLET) && isInInstancedRegion ||
				Arrays.equals(mapRegions, Region.CORRUPTED_GAUNTLET) && isInInstancedRegion;
	}

	public static class Region
	{
		public static final int[] GAUNTLET = {
				7512
		};
		public static final int[] CORRUPTED_GAUNTLET = {
				7768
		};
	}
}
