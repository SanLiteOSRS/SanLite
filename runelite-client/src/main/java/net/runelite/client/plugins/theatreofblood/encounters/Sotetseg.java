/*
 * Copyright (c) 2019, Siraz
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
import net.runelite.api.GameObject;
import net.runelite.api.ObjectID;

import java.util.ArrayList;
import java.util.List;

public class Sotetseg extends TheatreOfBloodEncounter
{
	@Getter
	@Setter
	private List<GameObject> activeMazeTiles;

	@Getter
	private boolean isMazeActive;

	public Sotetseg(TheatreOfBloodEncounters encounter)
	{
		super(encounter);
	}

	private boolean isMazeActive(GameObject gameObject, boolean isDespawnedObject)
	{
		return gameObject.getId() == ObjectID.TILE_33034 && !isDespawnedObject;
	}

	private boolean isRedMazeTileObject(int objectId)
	{
		return objectId == ObjectID.TILE_33035;
	}

	private void activateMaze()
	{
		if (activeMazeTiles == null)
		{
			activeMazeTiles = new ArrayList<>();
			isMazeActive = true;
		}
	}

	private void resetMaze()
	{
		if (activeMazeTiles != null)
		{
			activeMazeTiles = null;
			isMazeActive = false;
		}
	}

	public void checkMazeTiles(GameObject gameObject, boolean isDespawnedObject)
	{
		if (isMazeActive(gameObject, isDespawnedObject) || getActiveMazeTiles() != null)
		{
			if (getActiveMazeTiles() == null)
			{
				activateMaze();
			}

			if (isRedMazeTileObject(gameObject.getId()))
			{
				getActiveMazeTiles().add(gameObject);
			}
		}
		else if (!isMazeActive(gameObject, isDespawnedObject))
		{
			resetMaze();
		}
	}
}
