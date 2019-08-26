package net.runelite.client.plugins.theatreofblood.encounters;

import net.runelite.api.GraphicID;
import net.runelite.client.plugins.theatreofblood.TheatreOfBloodEncounterRegions;

public class Xarpus extends TheatreOfBloodEncounter
{
	public Xarpus(TheatreOfBloodEncounterRegions region, TheatreOfBloodEncounters encounter)
	{
		super(region, encounter);
	}

	public boolean isPoisonAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.XARPUS_POISON_SPLAT_ON_LANDING;
	}
}
