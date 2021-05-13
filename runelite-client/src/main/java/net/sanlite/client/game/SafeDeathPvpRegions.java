package net.sanlite.client.game;

import com.google.common.collect.ImmutableList;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;

import java.util.Collection;

/**
 * Contains region ID's for safe death PvP regions.
 * These regions are identified by the special attack minimap orb being disabled.
 */
public class SafeDeathPvpRegions
{
	public static final Collection<Integer> ALL = ImmutableList.of(
			13362,
			9520,
			13914, 13915, 13658, 13659,
			9552,
			13130, 13131, 13386, 13387,
			13134, 13135,
			13133,
			13646,
			13647,
			12622, 12623,
			12621,
			13645,
			13644,
			13899, 13900, 14155, 14156,
			13390,
			13641, 13642
	);

	public static final Collection<Integer> DUEL_ARENA = ImmutableList.of(
			13362
	);

	public static final Collection<Integer> CASTLE_WARS = ImmutableList.of(
			9520
	);

	public static final Collection<Integer> LAST_MAN_STANDING = ImmutableList.of(
			13914, 13915, 13658, 13659
	);

	public static final Collection<Integer> TZHAAR_FIGHT_PITS = ImmutableList.of(
			9552
	);

	public static final Collection<Integer> WHITE_PORTAL = ImmutableList.of(
			13130, 13131, 13386, 13387
	);

	public static final Collection<Integer> WASTELAND_CWA = ImmutableList.of(
			13134, 13135
	);

	public static final Collection<Integer> PLATEAU_CWA = ImmutableList.of(
			13133
	);

	public static final Collection<Integer> SYLVAN_GLADE_CWA = ImmutableList.of(
			13646
	);

	public static final Collection<Integer> FORSAKEN_QUARRY_CWA = ImmutableList.of(
			13647
	);

	public static final Collection<Integer> TURRETS_CWA = ImmutableList.of(
			12622, 12623
	);

	public static final Collection<Integer> CLAN_CUP_ARENA_CWA = ImmutableList.of(
			12621
	);

	public static final Collection<Integer> SOGGY_AND_GHASTLY_SWAMP_CWA = ImmutableList.of(
			13645
	);

	public static final Collection<Integer> NORTHLEACH_QUELL_CWA = ImmutableList.of(
			13644
	);

	public static final Collection<Integer> GRIDLOCK_CWA = ImmutableList.of(
			13899, 13900, 14155, 14156
	);

	public static final Collection<Integer> ETHEREAL_CWA = ImmutableList.of(
			13390
	);

	public static final Collection<Integer> CLASSIC_CWA = ImmutableList.of(
			13641, 13642
	);

	public static boolean inSafeDeathPvpArea(Client client)
	{
		Player localPlayer = client.getLocalPlayer();
		if (localPlayer == null) return false;

		for (int regionId : SafeDeathPvpRegions.ALL)
		{
			if (regionId == WorldPoint.fromLocalInstance(client, localPlayer.getLocalLocation()).getRegionID())
			{
				return true;
			}
		}
		return false;
	}
}
