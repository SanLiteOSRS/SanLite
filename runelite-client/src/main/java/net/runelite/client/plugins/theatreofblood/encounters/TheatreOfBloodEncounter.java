/*
 * Copyright (c) 2019, Siraz
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
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.GameObject;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class TheatreOfBloodEncounter
{

	@Getter
	private TheatreOfBloodEncounters encounter;

	@Getter
	@Setter
	private NPC npc;

	@Getter
	@Setter
	private List<GraphicsObject> aoeEffects;

	@Getter
	@Setter
	private List<GameObject> gameObjects;

	TheatreOfBloodEncounter(TheatreOfBloodEncounters encounter)
	{
		this.encounter = encounter;
		this.aoeEffects = new ArrayList<>();
		this.gameObjects = new ArrayList<>();
	}

	/**
	 * Checks if the given npc id is a boss from a Theatre of Blood encounter
	 *
	 * @param npcId npc identifier
	 * @return is npc boss from Theatre of Blood encounter
	 */
	public static boolean isNpcTheatreOfBloodEncounter(int npcId)
	{
		return npcId == NpcID.THE_MAIDEN_OF_SUGADINTI ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8361 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8362 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8363 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8364 ||
				npcId == NpcID.THE_MAIDEN_OF_SUGADINTI_8365 ||
				npcId == NpcID.PESTILENT_BLOAT ||
				npcId == NpcID.NYLOCAS_VASILIAS ||
				npcId == NpcID.NYLOCAS_VASILIAS_8355 ||
				npcId == NpcID.NYLOCAS_VASILIAS_8356 ||
				npcId == NpcID.NYLOCAS_VASILIAS_8357 ||
				npcId == NpcID.SOTETSEG ||
				npcId == NpcID.SOTETSEG_8388 ||
				npcId == NpcID.XARPUS ||
				npcId == NpcID.XARPUS_8339 ||
				npcId == NpcID.XARPUS_8340 ||
				npcId == NpcID.XARPUS_8341 ||
				npcId == NpcID.VERZIK_VITUR ||
				npcId == NpcID.VERZIK_VITUR_8369 ||
				npcId == NpcID.VERZIK_VITUR_8370 ||
				npcId == NpcID.VERZIK_VITUR_8371 ||
				npcId == NpcID.VERZIK_VITUR_8372 ||
				npcId == NpcID.VERZIK_VITUR_8373 ||
				npcId == NpcID.VERZIK_VITUR_8374 ||
				npcId == NpcID.VERZIK_VITUR_8375;
	}

	public SugadintiMaiden castToMaiden()
	{
		if (this.encounter != TheatreOfBloodEncounters.SUGADINTI_MAIDEN)
		{
			log.warn("Tried casting current encounter to {} while it is {}",
					TheatreOfBloodEncounters.SUGADINTI_MAIDEN, encounter);
			return null;
		}
		return (SugadintiMaiden) this;
	}

	public PestilentBloat castToBloat()
	{
		if (this.encounter != TheatreOfBloodEncounters.PESTILENT_BLOAT)
		{
			log.warn("Tried casting current encounter to {} while it is {}",
					TheatreOfBloodEncounters.PESTILENT_BLOAT, encounter);
			return null;
		}
		return (PestilentBloat) this;
	}

	public Nylocas castToNylocas()
	{
		if (this.encounter != TheatreOfBloodEncounters.NYLOCAS)
		{
			log.warn("Tried casting current encounter to {} while it is {}",
					TheatreOfBloodEncounters.NYLOCAS, encounter);
			return null;
		}
		return (Nylocas) this;
	}

	public Sotetseg castToSotetseg()
	{
		if (this.encounter != TheatreOfBloodEncounters.SOTETSEG)
		{
			log.warn("Tried casting current encounter to {} while it is {}",
					TheatreOfBloodEncounters.SOTETSEG, encounter);
			return null;
		}
		return (Sotetseg) this;
	}

	public Xarpus castToXarpus()
	{
		if (this.encounter != TheatreOfBloodEncounters.XARPUS)
		{
			log.warn("Tried casting current encounter to {} while it is {}",
					TheatreOfBloodEncounters.XARPUS, encounter);
			return null;
		}
		return (Xarpus) this;
	}

	public Verzik castToVerzik()
	{
		if (this.encounter != TheatreOfBloodEncounters.VERZIK_VITUR)
		{
			log.warn("Tried casting current encounter to {} while it is {}",
					TheatreOfBloodEncounters.VERZIK_VITUR, encounter);
			return null;
		}
		return (Verzik) this;
	}
}
