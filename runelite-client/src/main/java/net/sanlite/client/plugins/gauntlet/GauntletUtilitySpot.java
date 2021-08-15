/*
 * Copyright (c) 2021, Siraz <https://github.com/Sirazzz>
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
package net.sanlite.client.plugins.gauntlet;

import com.google.common.collect.ImmutableMap;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ObjectID;

import java.awt.*;
import java.util.Arrays;
import java.util.Map;

import static net.runelite.api.ObjectID.*;

@Slf4j
@Getter
public enum GauntletUtilitySpot
{
	SINGING_BOWL("Singing bowl", ObjectID.SINGING_BOWL_36063, ObjectID.SINGING_BOWL_35966),
	COOKING_RANGE("Cooking range", ObjectID.RANGE_36077, ObjectID.RANGE_35980),
	WATER_PUMP("Water pump", WATER_PUMP_36078, ObjectID.WATER_PUMP_35981);

	@Getter
	static final Map<Integer, GauntletUtilitySpot> SPOTS;

	static
	{
		ImmutableMap.Builder<Integer, GauntletUtilitySpot> builder = new ImmutableMap.Builder<>();

		for (GauntletUtilitySpot spot : values())
		{
			for (int spotId : spot.getIds())
			{
				builder.put(spotId, spot);
			}
		}

		SPOTS = builder.build();
	}

	private final String name;
	private final int[] ids;

	GauntletUtilitySpot(String spot, int... ids)
	{
		this.name = spot;
		this.ids = ids;
	}

	static boolean matches(int gameObjectId)
	{
		return SPOTS.containsKey(gameObjectId);
	}

	static boolean isUtilitySpot(int gameObjectId, GauntletUtilitySpot utilitySpot)
	{
		return Arrays.stream(utilitySpot.getIds()).anyMatch((id) -> id == gameObjectId);
	}

	static boolean isEnabled(int gameObjectId, GauntletConfig config)
	{
		for (Map.Entry<Integer, GauntletUtilitySpot> entry : SPOTS.entrySet())
		{
			if (entry.getKey() != gameObjectId)
			{
				continue;
			}

			switch (entry.getValue())
			{
				case SINGING_BOWL:
					return config.highlightSingingBowl();
				case COOKING_RANGE:
					return config.highlightCookingRange();
				case WATER_PUMP:
					return config.highlightWaterPump();
				default:
					log.warn("Unknown gauntlet utility spot {}", entry.getValue());
					return false;
			}
		}

		return false;
	}

	static Color getColor(int gameObjectId, GauntletConfig config)
	{
		for (Map.Entry<Integer, GauntletUtilitySpot> entry : SPOTS.entrySet())
		{
			if (entry.getKey() != gameObjectId)
			{
				continue;
			}

			switch (entry.getValue())
			{
				case SINGING_BOWL:
					return config.getSingingBowlHighlightColor();
				case COOKING_RANGE:
					return config.getCookingRangeHighlightColor();
				case WATER_PUMP:
					return config.getWaterPumpHighlightColor();
				default:
					log.warn("Unknown gauntlet utility spot {}", entry.getValue());
					return Color.GRAY;
			}
		}

		return null;
	}
}