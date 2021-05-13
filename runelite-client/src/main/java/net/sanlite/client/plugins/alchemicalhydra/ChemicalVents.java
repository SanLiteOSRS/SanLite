/*
 * Copyright (c) 2020, Siraz <https://github.com/Sirazzz>
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
package net.sanlite.client.plugins.alchemicalhydra;

import com.google.common.collect.ImmutableList;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.GameObject;
import net.runelite.api.ObjectID;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.runelite.api.Constants.CHUNK_SIZE;

@Slf4j
public class ChemicalVents
{
	// Chemical vent game object entity change cycle starts with a 5 tick interval
	// The next change will be 3 ticks later after which the cycle will restart
	private static final int TICKS_BETWEEN_CHEMICAL_VENT_ENTITY_CHANGE = 5;

	// The grace period when the player first enters the encounter room where
	// the vent timers will not display. This is done to prevent inaccuracies
	private static final int ROOM_ENTERED_GRACE_PERIOD_TICKS = 7;

	// Entered the instance from the east side (tiles will be in chunk 6, 7)
	private static final List<Point> ROOM_OUTSIDE_DOOR_SCENE_LOCATION_1 = ImmutableList.of(
			new Point(51, 59), new Point(51, 58));
	private static final List<Point> ROOM_INSIDE_DOOR_SCENE_LOCATION_1 = ImmutableList.of(
			new Point(52, 59), new Point(52, 58), new Point(53, 59),
			new Point(53, 58), new Point(52, 60), new Point(53, 60));

	// Entered the instance from the west side (tiles will be in chunk 7, 7)
	private static final List<Point> ROOM_OUTSIDE_DOOR_SCENE_LOCATION_2 = ImmutableList.of(
			new Point(59, 59), new Point(59, 58));
	private static final List<Point> ROOM_INSIDE_DOOR_SCENE_LOCATION_2 = ImmutableList.of(
			new Point(60, 59), new Point(60, 58), new Point(61, 59),
			new Point(61, 58), new Point(60, 60), new Point(61, 60));

	@Getter
	@Setter
	private boolean chemicalVentsActive;

	@Getter
	@Setter
	private int nextVentEntityChangeTick;

	@Getter
	@Setter
	private int roomEnteredGraceExpiredTick;

	@Getter
	@Setter
	private Map<AlchemicalHydra.Phase, GameObject> chemicalVents;

	public ChemicalVents()
	{
		this.nextVentEntityChangeTick = -100;
		this.chemicalVents = new HashMap<>();
	}

	static boolean isChemicalVentObject(int gameObjectId)
	{
		return gameObjectId == ObjectID.CHEMICAL_VENT_GREEN ||
				gameObjectId == ObjectID.CHEMICAL_VENT_BLUE ||
				gameObjectId == ObjectID.CHEMICAL_VENT_RED;
	}

	static WorldPoint getChemicalVentWorldPointForPhase(AlchemicalHydra.Phase phase)
	{
		switch (phase)
		{
			case GREEN:
				return new WorldPoint(1371, 10263, 0);
			case BLUE:
				return new WorldPoint(1371, 10272, 0);
			case RED:
				return new WorldPoint(1362, 10272, 0);
			default:
				log.warn("Tried retrieving chemical vent world point for unknown phase: {}", phase);
				return null;
		}
	}

	void checkChemicalVentStatus(int tickCount)
	{
		if (!isChemicalVentsActive())
		{
			return;
		}

		if (tickCount >= nextVentEntityChangeTick)
		{
			nextVentEntityChangeTick = tickCount + TICKS_BETWEEN_CHEMICAL_VENT_ENTITY_CHANGE;
		}
	}

	void checkInEncounterRoom(Player localPlayer, int tickCount)
	{
		if (localPlayer == null)
		{
			return;
		}

		LocalPoint localPoint = localPlayer.getLocalLocation();
		Point playerScenePoint = new Point(localPoint.getSceneX(), localPoint.getSceneY());
		Point currentChunk = new Point(localPoint.getSceneX() / CHUNK_SIZE, localPoint.getSceneY() / CHUNK_SIZE);

		if (currentChunk.equals(new Point(6, 7)))
		{
			if (ROOM_OUTSIDE_DOOR_SCENE_LOCATION_1.contains(playerScenePoint) && chemicalVentsActive)
			{
				chemicalVentsActive = false;
			}
			else if (ROOM_INSIDE_DOOR_SCENE_LOCATION_1.contains(playerScenePoint) && !chemicalVentsActive)
			{
				chemicalVentsActive = true;
				roomEnteredGraceExpiredTick = tickCount + ROOM_ENTERED_GRACE_PERIOD_TICKS;
			}
			return;
		}

		if (ROOM_OUTSIDE_DOOR_SCENE_LOCATION_2.contains(playerScenePoint) && chemicalVentsActive)
		{
			chemicalVentsActive = false;
		}
		else if (ROOM_INSIDE_DOOR_SCENE_LOCATION_2.contains(playerScenePoint) && !chemicalVentsActive)
		{
			chemicalVentsActive = true;
			roomEnteredGraceExpiredTick = tickCount + ROOM_ENTERED_GRACE_PERIOD_TICKS;
		}
	}
}
