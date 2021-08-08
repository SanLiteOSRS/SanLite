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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.GameObject;
import net.runelite.api.coords.LocalPoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Slf4j
class Gauntlet
{
	private static final int NOT_IN_BOSS_ROOM = 0;
	private static final int IN_BOSS_ROOM = 1;
	@Getter(AccessLevel.PACKAGE)
	private final List<GameObject> resourceSpots = new ArrayList<>();
	@Getter
	private boolean inBossRoom;


	Gauntlet()
	{
		this.inBossRoom = false;
	}

	static boolean isGauntletEntered(int varbitValue)
	{
		switch (varbitValue)
		{
			case 0:
				return false;
			case 1:
				return true;
			default:
				log.warn("Could not determine gauntlet entered status. Unknown varbit value: {}", varbitValue);
				return false;
		}
	}

	void checkFinalRoomEntered(int varbitValue)
	{
		switch (varbitValue)
		{
			case NOT_IN_BOSS_ROOM:
				if (inBossRoom)
					this.inBossRoom = false;
				break;
			case IN_BOSS_ROOM:
				if (!inBossRoom)
					this.inBossRoom = true;
				break;
			default:
				log.warn("Could not determine gauntlet boss room status. Unknown varbit value: {}", varbitValue);
		}
	}

	void newRoomLoading()
	{
		resourceSpots.clear();
	}

	void resourceSpotSpawned(GameObject gameObject, int cameraX, int cameraY) {
		resourceSpots.add(gameObject);
		inverseSortSpotDistanceFromPlayer(cameraX, cameraY);
	}

	void resourceSpotDespawned(GameObject gameObject) {
		resourceSpots.remove(gameObject);
	}

	void resourceSpotDisabled(GauntletResourceSpot resourceSpot)
	{
		Arrays.stream(resourceSpot.getIds()).forEach(id -> resourceSpots.removeIf(spot -> spot.getId() == id));
	}

	private void inverseSortSpotDistanceFromPlayer(int cameraX, int cameraY)
	{
		final LocalPoint cameraPoint = new LocalPoint(cameraX, cameraY);
		resourceSpots.sort(Comparator.comparing(spot -> -1 * spot.getLocalLocation().distanceTo(cameraPoint)));
	}
}
