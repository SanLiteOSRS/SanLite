package net.runelite.client.plugins.theatreofblood.encounters;

import net.runelite.api.GraphicID;
import net.runelite.client.plugins.theatreofblood.TheatreOfBloodEncounterRegions;

public class Verzik extends TheatreOfBloodEncounter
{
	public Verzik(TheatreOfBloodEncounterRegions region, TheatreOfBloodEncounters encounter)
	{
		super(region, encounter);
	}

	public boolean isSkullAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.VERZIK_SKULL_ATTACK_ON_LANDING;
	}

	public boolean isGreenOrbPool(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.VERZIK_GREEN_ORB_POOL;
	}
}
