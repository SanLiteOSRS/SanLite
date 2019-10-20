package net.runelite.client.plugins.theatreofblood.encounters;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.GameObject;
import net.runelite.api.ObjectID;
import net.runelite.client.plugins.theatreofblood.TheatreOfBloodEncounterRegions;

import java.util.ArrayList;
import java.util.List;

public class Sotetseg extends TheatreOfBloodEncounter
{
	@Getter
	@Setter
	private List<GameObject> activeMazeTiles;

	public Sotetseg(TheatreOfBloodEncounterRegions region, TheatreOfBloodEncounters encounter)
	{
		super(region, encounter);
	}

	public boolean isMazeActive(List<GameObject> gameObjects)
	{
		return gameObjects.stream().anyMatch(x -> x.getId() == ObjectID.TILE_33034);
	}

	public boolean isRedMazeTileObject(int objectId)
	{
		return objectId == ObjectID.TILE_33035;
	}

	public void activateMaze()
	{
		if (activeMazeTiles == null)
		{
			activeMazeTiles = new ArrayList<>();
		}
	}

	public void resetMaze()
	{
		if (activeMazeTiles != null)
		{
			activeMazeTiles = null;
		}
	}
}
