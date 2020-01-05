/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
 * Copyright (c) 2019, Jajack
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
import net.runelite.api.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Nylocas extends TheatreOfBloodEncounter
{
	@Getter
	@Setter
	private List<NPC> highlightedNylocasNpcs;

	@Getter
	private HashMap<NPC, List<Integer>> aliveNylocas;

	@Getter
	private List<Integer> debuglist;

	private final static int NYLOCAS_LIFE_LENGTH = 31200;

	public Nylocas(TheatreOfBloodEncounters encounter)
	{
		super(encounter);
		highlightedNylocasNpcs = new ArrayList<>();
		aliveNylocas = new HashMap<>();
		debuglist = new ArrayList<>();
	}

	public static boolean isNylocasNpc(int npcId)
	{
		return npcId == NpcID.NYLOCAS_ISCHYROS_8342 || npcId == NpcID.NYLOCAS_TOXOBOLOS_8343 || npcId == NpcID.NYLOCAS_HAGIOS ||
				npcId == NpcID.NYLOCAS_ISCHYROS_8345 || npcId == NpcID.NYLOCAS_TOXOBOLOS_8346 || npcId == NpcID.NYLOCAS_HAGIOS_8347 ||
				npcId == NpcID.NYLOCAS_ISCHYROS_8348 || npcId == NpcID.NYLOCAS_TOXOBOLOS_8349 || npcId == NpcID.NYLOCAS_HAGIOS_8350 ||
				npcId == NpcID.NYLOCAS_ISCHYROS_8351 || npcId == NpcID.NYLOCAS_TOXOBOLOS_8352 || npcId == NpcID.NYLOCAS_HAGIOS_8353;
	}

	/**
	 * Checks if nylocas npc is interacting with any of the players in Theatre of Blood
	 *
	 * @param npc     nylocas npc
	 * @param players list of players
	 * @return is npc interacting with any player from the list
	 */
	private boolean isNylocasNpcAggressive(NPC npc, List<Player> players)
	{
		Actor interactingActor = npc.getInteracting();
		if (interactingActor == null)
		{
			return false;
		}
		return players.stream().anyMatch(interactingActor::equals);
	}

	/**
	 * Adds aggressive nylocas npc's to the highlighted npc's list
	 *
	 * @param clientNpcs    list of npc's from the client
	 * @param clientPlayers list of players from the client
	 */
	public void checkNylocasAggressiveNpcs(List<NPC> clientNpcs, List<Player> clientPlayers)
	{
		setHighlightedNylocasNpcs(
				clientNpcs.stream()
						.filter(x -> isNylocasNpc(x.getId()) && isNylocasNpcAggressive(x, clientPlayers))
						.collect(Collectors.toList()));
	}

	public void addNylocasCrab(NPC npc, int clientTick)
	{
		List<Integer> timers = new ArrayList<>();

		// Spawn time
		timers.add(clientTick);

		// Explode time
		timers.add(clientTick + (NYLOCAS_LIFE_LENGTH / Constants.CLIENT_TICK_LENGTH));

		// Time till explode
		timers.add(timers.get(1) - timers.get(0));

		aliveNylocas.put(npc, timers);
	}

	public void removeNylocasCrab(NPC npc)
	{
		aliveNylocas.remove(npc);
	}

	public void checkNylocasTimers(int clientTick)
	{
		for (NPC nylocas : new ArrayList<>(aliveNylocas.keySet()))
		{
			List<Integer> timers = aliveNylocas.get(nylocas);

			if (clientTick > timers.get(1))
			{
				aliveNylocas.remove(nylocas);
			}
			timers.set(2, (timers.get(1) - clientTick));

			aliveNylocas.replace(nylocas, timers);
		}
	}

	public boolean isNylocasAlmostExploding(NPC nylocas)
	{
		List<Integer> timers = getAliveNylocas().get(nylocas);

		// Check if Nylocas is within 5 seconds of exploding
		return timers.get(2) < (5000 / Constants.CLIENT_TICK_LENGTH);
	}
}
