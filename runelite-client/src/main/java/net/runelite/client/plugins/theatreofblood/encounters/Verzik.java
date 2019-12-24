/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
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
import net.runelite.api.Constants;
import net.runelite.api.GraphicID;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class Verzik extends TheatreOfBloodEncounter
{
	//P4 = Below 20% HP P3, attack speed increases
	private final int TIME_TILL_P1_START = 11400;
	private final int TIME_TILL_P2_START = 8400;
	private final int TIME_TILL_P3_START = 3600;
	private final int P1_ATTACK_SPEED = 8400;
	private final int P2_ATTACK_SPEED = 2400;
	private final int P3_ATTACK_SPEED = 4200;
	private final int P4_ATTACK_SPEED = 3000;

	@Setter
	@Getter
	int verzikPhase;

	@Getter
	private int attackCount;

	@Getter
	private int phaseStartTime;

	@Getter
	private int phaseLastAttack;

	@Getter
	private int phaseNextAttack;

	@Getter
	private int phaseTimeTillNextAttack;

	private HashMap<String, Boolean> specials;

	@Getter
	private List<NPC> nylocas;

	public Verzik(TheatreOfBloodEncounters encounter)
	{
		super(encounter);
		phaseStartTime = -1;
		phaseLastAttack = -1;
		phaseNextAttack = -1;
		phaseTimeTillNextAttack = -1;
		verzikPhase = 0;
		attackCount = 0;
		nylocas = new ArrayList<>();
		specials = new HashMap<>();
		specials.put("nylocas", false);
		specials.put("webs", false);
		specials.put("pools", false);
		specials.put("ball", false);
	}

	public static boolean isNylocasNpc(int npcId)
	{
		return npcId == 8383 || npcId == 8382 || npcId == 8381;
	}

	public boolean isGreenOrbPool(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.VERZIK_GREEN_ORB_POOL;
	}

	/**
	 * Checks for the graphics objects from Verzik's green orb pool attack
	 *
	 * @param clientGraphicObjects the clients current graphics objects list
	 */
	public void checkGreenOrbPoolGraphicObjects(List<GraphicsObject> clientGraphicObjects)
	{
		setAoeEffects(
				clientGraphicObjects.stream()
						.filter(x -> isGreenOrbPool(x.getId()))
						.collect(Collectors.toList()));
	}

	public void checkAttackTimer(int clientTick)
	{
		int attackSpeed = 0;
		switch (verzikPhase)
		{
			case 0:
				log.debug("Verzik phase not set");
				break;
			case 1:
				attackSpeed = (P1_ATTACK_SPEED / Constants.CLIENT_TICK_LENGTH);
				break;
			case 2:
				attackSpeed = (P2_ATTACK_SPEED / Constants.CLIENT_TICK_LENGTH);
				break;
			case 3:
				attackSpeed = (P3_ATTACK_SPEED / Constants.CLIENT_TICK_LENGTH);
				break;
			case 4:
				attackSpeed = (P4_ATTACK_SPEED / Constants.CLIENT_TICK_LENGTH);
				break;
		}

		if (phaseStartTime != -1)
		{
			phaseLastAttack = clientTick;
			phaseNextAttack = phaseStartTime;
			phaseTimeTillNextAttack = phaseStartTime - phaseLastAttack;
			phaseStartTime = -1;
		}
		else if (specials.get("webs"))
		{
			phaseLastAttack = -1;
			phaseNextAttack = -1;
			phaseTimeTillNextAttack = -1;
			specials.replace("webs", false);
		}
		else if (specials.get("pools"))
		{
			phaseLastAttack = clientTick;
			phaseNextAttack = clientTick + 630;
			phaseTimeTillNextAttack = phaseNextAttack - phaseLastAttack;
			specials.replace("pools", false);
		}
		else if (specials.get("ball"))
		{
			phaseLastAttack = clientTick;
			phaseNextAttack = clientTick + 360;
			phaseTimeTillNextAttack = phaseNextAttack - phaseLastAttack;
			specials.replace("ball", false);
		}
		else if (phaseTimeTillNextAttack <= 0)
		{
			phaseLastAttack = clientTick;
			phaseNextAttack = clientTick + attackSpeed;
			phaseTimeTillNextAttack = phaseNextAttack - phaseLastAttack;
		}
		else
		{
			phaseTimeTillNextAttack = phaseNextAttack - clientTick;
		}
	}

	public void setPhaseStartTime(int clientTick)
	{
		phaseStartTime = clientTick;
		switch (verzikPhase)
		{
			case 0:
				log.debug("Verzik phase not set");
				break;
			case 1:
				phaseStartTime += (TIME_TILL_P1_START / Constants.CLIENT_TICK_LENGTH);
				break;
			case 2:
				phaseStartTime += (TIME_TILL_P2_START / Constants.CLIENT_TICK_LENGTH);
				break;
			case 3:
				phaseStartTime += (TIME_TILL_P3_START / Constants.CLIENT_TICK_LENGTH);
				break;
			default:
				break;

		}
	}

	public void checkAttackCycle()
	{
		if (attackCount == 8)
		{
			//Webs
			specials.replace("webs", true);
		}
		else if (attackCount == 12)
		{
			//Pools
			specials.replace("pools", true);
		}
		else if (attackCount == 17)
		{
			//Ball
			specials.replace("ball", true);
		}
		else if (attackCount == 18)
		{
			//Resets at 18 as ball special uses range attack animation, thanks jagex
			attackCount = 0;
		}

		attackCount++;
	}

	public void addNylocasCrab(NPC npc)
	{
		nylocas.add(npc);
	}

	public void removeNylocasCrab(NPC npc)
	{
		nylocas.remove(npc);
	}

	//Needs to be stand alone method as verzik's distance to the center of the map is random. Meaning the only reliable way to get the end duration is the animation for webs.
	public void addWebAnimation(int clientTick)
	{
		phaseLastAttack = clientTick;
		phaseNextAttack = clientTick + 1200;
		phaseTimeTillNextAttack = phaseNextAttack + phaseLastAttack;
	}
}
