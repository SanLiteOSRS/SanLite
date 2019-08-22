package net.runelite.client.plugins.theatreofblood.encounters;

import net.runelite.api.GraphicID;
import net.runelite.client.plugins.theatreofblood.TheatreOfBloodEncounterRegions;

public class SugadintiMaiden extends TheatreOfBloodEncounter
{
	public SugadintiMaiden(TheatreOfBloodEncounterRegions region, TheatreOfBloodEncounters encounter)
	{
		super(region, encounter);
	}

	public boolean isBloodAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.MAIDEN_BLOOD_SPLAT_ATTACK;
	}
}
