/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
 * Copyright (c) 2019, Jajack
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
package net.runelite.client.plugins.theatreofblood.encounters;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Constants;
import net.runelite.api.GroundObject;
import net.runelite.api.ObjectID;

import java.util.ArrayList;
import java.util.List;

public class Xarpus extends TheatreOfBloodEncounter
{
	@Getter
	@Setter
	private List<GroundObject> groundObjects;

	@Getter
	@Setter
	private Boolean isStaring = false;

	private final static int TURN_DURATION = 4800;

	@Setter
	@Getter
	private int lastTurnTime;

	@Getter
	private int nextTurnTime;

	@Getter
	private int remainingTurnTime;


	public Xarpus(TheatreOfBloodEncounters encounter)
	{
		super(encounter);
		groundObjects = new ArrayList<>();
		lastTurnTime = -1;
	}

	public boolean isHealingPoolTileObject(int objectId)
	{
		return objectId == ObjectID.EXHUMED;
	}

	public boolean isPoisonTileObject(int objectId)
	{
		return objectId == ObjectID.ACIDIC_MIASMA;
	}

	/**
	 * Adds ground object to the ground objects list if it matches one of Xarpus objects id's
	 *
	 * @param groundObject ground object
	 */
	public void addGroundObject(GroundObject groundObject)
	{
		if (groundObject == null)
		{
			return;
		}

		if (isPoisonTileObject(groundObject.getId()) || isHealingPoolTileObject(groundObject.getId()))
		{
			groundObjects.add(groundObject);
		}
	}

	/**
	 * Removes ground object from the ground objects list if it matches one of Xarpus objects id's
	 *
	 * @param groundObject ground object
	 */
	public void removeGroundObject(GroundObject groundObject)
	{
		if (groundObject == null)
		{
			return;
		}

		if (isPoisonTileObject(groundObject.getId()) || isHealingPoolTileObject(groundObject.getId()))
		{
			groundObjects.remove(groundObject);
		}
	}

	public void checkTurnTimer(int clientTick)
	{
		if (nextTurnTime <= clientTick)
		{
			lastTurnTime = clientTick;
			nextTurnTime = lastTurnTime + TURN_DURATION / Constants.CLIENT_TICK_LENGTH;
		}
		else
		{
			remainingTurnTime = nextTurnTime - clientTick;
		}
	}

	public void checkOverheadTextPhaseChange(String overheadText, int gameCycle)
	{
		if (overheadText.equals("Screeeeech!"))
		{
			setIsStaring(true);
			setLastTurnTime(gameCycle);
		}
	}
}
