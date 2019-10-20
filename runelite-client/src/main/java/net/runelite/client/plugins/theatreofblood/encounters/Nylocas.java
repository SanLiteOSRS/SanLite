package net.runelite.client.plugins.theatreofblood.encounters;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.Player;
import net.runelite.client.plugins.theatreofblood.TheatreOfBloodEncounterRegions;

import java.util.ArrayList;
import java.util.List;

public class Nylocas extends TheatreOfBloodEncounter
{
	@Getter
	@Setter
	private List<NPC> highlightedNylocasNpcs;

	public Nylocas(TheatreOfBloodEncounterRegions region, TheatreOfBloodEncounters encounter)
	{
		super(region, encounter);
		highlightedNylocasNpcs = new ArrayList<>();
	}

	public boolean isNylocasNpc(int npcId)
	{
		return npcId == NpcID.NYLOCAS_ISCHYROS_8342 || npcId == NpcID.NYLOCAS_TOXOBOLOS_8343 || npcId == NpcID.NYLOCAS_HAGIOS ||
				npcId == NpcID.NYLOCAS_ISCHYROS_8345 || npcId == NpcID.NYLOCAS_TOXOBOLOS_8346 || npcId == NpcID.NYLOCAS_HAGIOS_8347 ||
				npcId == NpcID.NYLOCAS_ISCHYROS_8348 || npcId == NpcID.NYLOCAS_TOXOBOLOS_8349 || npcId == NpcID.NYLOCAS_HAGIOS_8350 ||
				npcId == NpcID.NYLOCAS_ISCHYROS_8351 || npcId == NpcID.NYLOCAS_TOXOBOLOS_8352 || npcId == NpcID.NYLOCAS_HAGIOS_8353;
	}

	public boolean isNylocasNpcAggressive(NPC npc, List<Player> players)
	{
		Actor interactingActor = npc.getInteracting();
		if (interactingActor == null)
		{
			return false;
		}
		return players.stream().anyMatch(interactingActor::equals);
	}
}
