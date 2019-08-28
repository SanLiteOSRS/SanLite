package net.runelite.client.plugins.theatreofblood.encounters;

import net.runelite.api.GraphicID;
import net.runelite.api.ObjectID;
import net.runelite.client.plugins.theatreofblood.TheatreOfBloodEncounterRegions;

public class Xarpus extends TheatreOfBloodEncounter
{
	public Xarpus(TheatreOfBloodEncounterRegions region, TheatreOfBloodEncounters encounter)
	{
		super(region, encounter);
	}

	public boolean isPoisonAttackLanding(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.XARPUS_POISON_SPLAT_ON_LANDING;
	}

	public boolean isHealingPoolTileObject(int objectId)
	{
		return objectId == ObjectID.EXHUMED;
	}

	public boolean isPoisonTileObject(int objectId)
	{
		return objectId == ObjectID.ACIDIC_MIASMA;
	}
}
