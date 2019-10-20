package net.runelite.client.plugins.theatreofblood.encounters;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.GraphicID;
import net.runelite.api.GroundObject;
import net.runelite.api.ObjectID;
import net.runelite.client.plugins.theatreofblood.TheatreOfBloodEncounterRegions;

import java.util.ArrayList;
import java.util.List;

public class Xarpus extends TheatreOfBloodEncounter
{
	@Getter
	@Setter
	private List<GroundObject> groundObjects;

	public Xarpus(TheatreOfBloodEncounterRegions region, TheatreOfBloodEncounters encounter)
	{
		super(region, encounter);
		groundObjects = new ArrayList<>();
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
