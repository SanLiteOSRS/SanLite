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
package net.runelite.client.plugins.theatreofblood.encounters;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.GroundObject;
import net.runelite.api.ObjectID;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Sotetseg extends TheatreOfBloodEncounter
{
	private List<GroundObject> activeMazeTiles;

	@Getter
	@Setter
	private boolean isMazeActive;

	public Sotetseg(TheatreOfBloodEncounters encounter)
	{
		super(encounter);
	}

	private boolean isActiveMazeTileObject(int objectId)
	{
		return objectId == ObjectID.TILE_33034;
	}

	private boolean isRedMazeTileObject(int objectId)
	{
		return objectId == ObjectID.TILE_33035;
	}

	/**
	 * Initializes the active maze tiles list
	 */
	private void activateMaze()
	{
		if (activeMazeTiles == null)
		{
			log.debug("initialising array");
			activeMazeTiles = new ArrayList<>();
		}
	}

	/**
	 * Resets the active maze tiles list
	 */
	public void resetMaze()
	{
		if (activeMazeTiles != null)
		{
			log.debug("resetting array");
			activeMazeTiles = null;
		}
	}

	public List<GroundObject> getActiveMazeTiles()
	{
		return activeMazeTiles;
	}

	/**
	 * Activates/deactivates the Sotetseg maze and adds red maze tiles to the active maze tiles list
	 *
	 * @param groundObject      ground object that triggered the function call
	 */
	public void checkMazeTile(GroundObject groundObject)
	{
		if (!isActiveMazeTileObject(groundObject.getId()) && !isRedMazeTileObject(groundObject.getId()))
		{
			log.debug("Tile already highlighted");
			return;
		}

		if (isMazeActive)
		{
			if (getActiveMazeTiles() == null)
			{
				activateMaze();
			}
			if (isRedMazeTileObject(groundObject.getId()) && !getActiveMazeTiles().contains(groundObject))
			{
				log.debug("Adding tile");
				getActiveMazeTiles().add(groundObject);
			}
		}
		else
		{
			resetMaze();
		}
	}
}
