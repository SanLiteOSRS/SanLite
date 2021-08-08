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

	public static boolean isGauntletAnimation(int animationId)
	{
		return animationId == GauntletBossId.Anim.SWITCH_TO_RANGED ||
				animationId == GauntletBossId.Anim.SWITCH_TO_MAGIC ||
				animationId == GauntletBossId.Anim.TRAMPLE_ATTACK ||
				animationId == GauntletBossId.Anim.PROJECTILE_ATTACK ||
				animationId == GauntletBossId.Anim.SUMMON_CRYSTAL_NPC ||
				animationId == GauntletPlayerId.Anim.BOW_ATTACK ||
				animationId == GauntletPlayerId.Anim.STAFF_ATTACK ||
				animationId == GauntletPlayerId.Anim.HALBERD_ATTACK;
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
