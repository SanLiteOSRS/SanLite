/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.gauntlet;

import com.google.common.collect.ImmutableMap;
import lombok.Getter;
import net.runelite.api.ItemID;
import net.runelite.api.ObjectID;

import java.util.Map;

import static net.runelite.api.ObjectID.*;

@Getter
public enum GauntletResourceSpot
{
	PADDLEFISH("Paddlefish", ItemID.RAW_PADDLEFISH,
			FISHING_SPOT_36068, FISHING_SPOT_35971
	),
	CRYSTAL_DEPOSIT("Crystal Deposit", ItemID.CRYSTAL_ORE,
			ObjectID.CRYSTAL_DEPOSIT
	),
	CORRUPT_DEPOSIT("Corrupt Deposit", ItemID.CORRUPTED_ORE,
			ObjectID.CORRUPT_DEPOSIT
	),
	GRYM_ROOT("Grym Root", ItemID.GRYM_LEAF_23875,
			GRYM_ROOT_36070
	),
	CORRUPT_GRYM_ROOT("Grym Root", ItemID.GRYM_LEAF,
			ObjectID.GRYM_ROOT
	),
	PHREN_ROOTS("Phren Roots", ItemID.PHREN_BARK_23878,
			PHREN_ROOTS_36066
	),
	CORRUPT_PHREN_ROOTS("Phren Roots", ItemID.PHREN_BARK,
			ObjectID.PHREN_ROOTS
	),
	LINUM_TIRINUM("Linum Tirinum", ItemID.LINUM_TIRINUM_23876,
			LINUM_TIRINUM_36072
	),
	CORRUPT_LINUM_TIRINUM("Linum Tirinum", ItemID.LINUM_TIRINUM,
			ObjectID.LINUM_TIRINUM
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