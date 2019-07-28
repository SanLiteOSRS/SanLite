package net.runelite.client.plugins.gauntlet;

import com.google.common.collect.ImmutableMap;
import lombok.Getter;
import net.runelite.api.ItemID;

import java.util.Map;

import static net.runelite.api.ObjectID.*;

@Getter
public enum GauntletResourceSpot
{
	PADDLEFISH("Paddlefish", ItemID.RAW_PADDLEFISH,
			GAUNTLET_FISHING_SPOT, CORRUPTED_GAUNTLET_FISHING_SPOT
	),
	CRYSTAL_DEPOSIT("Crystal Deposit", ItemID.CRYSTAL_ORE,
			GAUNTLET_CRYSTAL_DEPOSIT
	),
	CORRUPT_DEPOSIT("Corrupt Deposit", ItemID.CORRUPT_ORE,
			CORRUPTED_GAUNTLET_CORRUPTED_DEPOSIT
	),
	GRYM_ROOT("Grym Root", ItemID.GRYM_LEAF,
			GAUNTLET_GRYM_ROOT
	),
	CORRUPT_GRYM_ROOT("Grym Root", ItemID.CORRUPTED_GRYM_LEAF,
			CORRUPTED_GAUNTLET_GRYM_ROOT
	),
	PHREN_ROOTS("Phren Roots", ItemID.PHREN_BARK,
			GAUNTLET_PHREN_ROOTS
	),
	CORRUPT_PHREN_ROOTS("Phren Roots", ItemID.CORRUPT_PHREN_BARK,
			CORRUPTED_GAUNTLET_PHREN_ROOTS
	),
	LINUM_TIRINUM("Linum Tirinum", ItemID.LINUM_TIRINUM,
			GAUNTLET_LINUM_TIRINUM
	),
	CORRUPT_LINUM_TIRINUM("Linum Tirinum", ItemID.CORRUPTED_LINUM_TIRINUM,
			CORRUPTED_GAUNTLET_LINUM_TIRINUM
	);

	@Getter
	private static final Map<Integer, GauntletResourceSpot> SPOTS;

	private final String name;
	private final int resourceSpriteId;
	private final int[] ids;

	static
	{
		ImmutableMap.Builder<Integer, GauntletResourceSpot> builder = new ImmutableMap.Builder<>();

		for (GauntletResourceSpot spot : values())
		{
			for (int spotId : spot.getIds())
			{
				builder.put(spotId, spot);
			}
		}

		SPOTS = builder.build();
	}

	GauntletResourceSpot(String spot, int resourceSpriteId, int... ids)
	{
		this.name = spot;
		this.resourceSpriteId = resourceSpriteId;
		this.ids = ids;
	}
}