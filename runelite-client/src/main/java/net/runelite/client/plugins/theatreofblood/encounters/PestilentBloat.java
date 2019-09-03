package net.runelite.client.plugins.theatreofblood.encounters;

import net.runelite.api.GraphicID;
import net.runelite.client.plugins.theatreofblood.TheatreOfBloodEncounterRegions;

public class PestilentBloat extends TheatreOfBloodEncounter
{
	public PestilentBloat(TheatreOfBloodEncounterRegions region, TheatreOfBloodEncounters encounter)
	{
		super(region, encounter);
	}

	public boolean isHandAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_1 ||
				graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_2 ||
				graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_3 ||
				graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_4;
	}
}
