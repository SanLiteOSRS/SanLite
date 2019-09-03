package net.runelite.client.plugins.theatreofblood.encounters;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.client.plugins.theatreofblood.TheatreOfBloodEncounterRegions;

import java.util.ArrayList;
import java.util.List;

public class TheatreOfBloodEncounter
{

	@Getter
	private TheatreOfBloodEncounters encounter;

	@Getter
	private TheatreOfBloodEncounterRegions encounterRegions;

	@Getter
	@Setter
	private boolean isStarted;

	@Getter
	@Setter
	private NPC npc;

	@Getter
	@Setter
	private List<GraphicsObject> aoeEffects;

	TheatreOfBloodEncounter(TheatreOfBloodEncounterRegions regions, TheatreOfBloodEncounters encounter)
	{
		this.encounter = encounter;
		this.encounterRegions = regions;
		this.aoeEffects = new ArrayList<>();
	}

}
