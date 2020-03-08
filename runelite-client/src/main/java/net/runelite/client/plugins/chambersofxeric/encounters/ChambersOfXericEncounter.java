/*
 * Copyright (c) 2020, Siraz <https://github.com/Sirazzz>
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
package net.runelite.client.plugins.chambersofxeric.encounters;

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
public class ChambersOfXericEncounter
{

	@Getter
	private ChambersOfXericEncounters encounter;

	@Getter
	@Setter
	private NPC npc;

	@Getter
	@Setter
	private List<GraphicsObject> graphicObjects;

	@Getter
	@Setter
	private List<GameObject> gameObjects;

	ChambersOfXericEncounter(ChambersOfXericEncounters encounter)
	{
		this.encounter = encounter;
		this.graphicObjects = new ArrayList<>();
		this.gameObjects = new ArrayList<>();
	}

	/**
	 * Checks if the given npc id is a from any Chambers of Xeric encounter
	 *
	 * @param npcId npc identifier
	 * @return is npc boss from Chambers of Xeric encounter
	 */
	public static boolean isNpcChambersOfXericEncounter(int npcId)
	{
		return npcId == NpcID.LIZARDMAN_SHAMAN_7573 ||
				npcId == NpcID.LIZARDMAN_SHAMAN_7574 ||
				npcId == NpcID.ROCKS_7565 ||
				npcId == NpcID.VASA_NISTIRIO ||
				npcId == NpcID.VASA_NISTIRIO_7567 ||
				npcId == NpcID.GLOWING_CRYSTAL ||
				npcId == NpcID.VANGUARD ||
				npcId == NpcID.VANGUARD_7526 ||
				npcId == NpcID.VANGUARD_7527 ||
				npcId == NpcID.VANGUARD_7528 ||
				npcId == NpcID.VANGUARD_7529 ||
				npcId == NpcID.SKELETAL_MYSTIC ||
				npcId == NpcID.SKELETAL_MYSTIC_7605 ||
				npcId == NpcID.SKELETAL_MYSTIC_7606 ||
				npcId == NpcID.MUTTADILE ||
				npcId == NpcID.MUTTADILE_7562 ||
				npcId == NpcID.MUTTADILE_7563 ||
				npcId == NpcID.TEKTON ||
				npcId == NpcID.TEKTON_7541 ||
				npcId == NpcID.TEKTON_7542 ||
				npcId == NpcID.TEKTON_ENRAGED ||
				npcId == NpcID.TEKTON_ENRAGED_7544 ||
				npcId == NpcID.TEKTON_7545 ||
				npcId == NpcID.VESPULA ||
				npcId == NpcID.VESPULA_7531 ||
				npcId == NpcID.VESPULA_7532 ||
				npcId == NpcID.ABYSSAL_PORTAL ||
				npcId == NpcID.LUX_GRUB ||
				npcId == NpcID.LUX_GRUB_7535 ||
				npcId == NpcID.LUX_GRUB_7536 ||
				npcId == NpcID.LUX_GRUB_7537 ||
				npcId == NpcID.VESPINE_SOLDIER ||
				npcId == NpcID.VESPINE_SOLDIER_7539 ||
				npcId == NpcID.DEATHLY_RANGER ||
				npcId == NpcID.DEATHLY_MAGE ||
				npcId == NpcID.GUARDIAN ||
				npcId == NpcID.GUARDIAN_7570 ||
				npcId == NpcID.GUARDIAN_7571 ||
				npcId == NpcID.GUARDIAN_7572 ||
				npcId == NpcID.JEWELLED_CRAB ||
				npcId == NpcID.JEWELLED_CRAB_RED ||
				npcId == NpcID.JEWELLED_CRAB_GREEN ||
				npcId == NpcID.JEWELLED_CRAB_BLUE ||
				npcId == NpcID.GREAT_OLM_RIGHT_CLAW ||
				npcId == NpcID.GREAT_OLM ||
				npcId == NpcID.GREAT_OLM_LEFT_CLAW ||
				npcId == NpcID.GREAT_OLM_RIGHT_CLAW_7553 ||
				npcId == NpcID.GREAT_OLM_7554 ||
				npcId == NpcID.GREAT_OLM_LEFT_CLAW_7555;
	}
}
