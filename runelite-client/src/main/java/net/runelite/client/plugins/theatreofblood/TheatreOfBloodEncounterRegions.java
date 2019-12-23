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
package net.runelite.client.plugins.theatreofblood;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public enum TheatreOfBloodEncounterRegions
{
	MAIDEN_REGIONS(12613, 12869),
	BLOAT_REGIONS(13125),
	NYLOCAS_REGIONS(13122),
	SOTETSEG_ENTRANCE_REGION(13123),
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
