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
package net.sanlite.client.plugins.theatreofblood.encounters;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.sanlite.client.plugins.theatreofblood.id.AnimationID;
import net.sanlite.client.plugins.theatreofblood.id.GraphicID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
public class Verzik extends TheatreOfBloodEncounter
{
	// Verzik attack speeds per phase (in client ticks), P4 = Below 20% HP P3, attack speed increases
	private final static int TIME_TILL_P1_START = 11400;
	private final static int TIME_TILL_P2_START = 8400;
	private final static int TIME_TILL_P3_START = 3600;
	private final static int P1_ATTACK_SPEED = 8400;
	private final static int P2_ATTACK_SPEED = 2400;
	private final static int P3_ATTACK_SPEED = 4200;
	private final static int P4_ATTACK_SPEED = 3000;
	private final HashMap<String, Boolean> specials;
	@Getter
	private final List<NPC> nylocas;
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
		return npcId == NpcID.NYLOCAS_ISCHYROS_8381 || npcId == NpcID.NYLOCAS_TOXOBOLOS_8382 || npcId == NpcID.NYLOCAS_HAGIOS_8383;
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
	public void checkGreenOrbPoolGraphicObjects(Deque<GraphicsObject> clientGraphicObjects)
	{
		setAoeEffects(
				StreamSupport
						.stream(clientGraphicObjects.spliterator(), false)
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

	private void setPhaseStartTime(int clientTick)
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
		}
	}

	private void checkAttackCycle()
	{
		if (attackCount == 8)
		{
			// Webs special
			specials.replace("webs", true);
		}
		else if (attackCount == 12)
		{
			// Pools special
			specials.replace("pools", true);
		}
		else if (attackCount == 17)
		{
			// Ball special
			specials.replace("ball", true);
		}
		else if (attackCount == 18)
		{
			// Resets at 18 as ball special uses range attack animation, thanks jagex
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

	/**
	 * Needs to be stand alone method as Verzik's distance to the center of the map is random.
	 * Meaning the only reliable way to get the end duration is the animation for webs.
	 *
	 * @param clientTick client tick web animation is triggered
	 */
	private void addWebAnimation(int clientTick)
	{
		phaseLastAttack = clientTick;
		phaseNextAttack = clientTick + 1200;
		phaseTimeTillNextAttack = phaseNextAttack + phaseLastAttack;
	}

	public void checkOverheadTextPhaseChange(String overheadText, int gameCycle)
	{
		if (overheadText.equals("You think you can defeat me?") && getVerzikPhase() != 2)
		{
			log.debug("Verzik phase 2 starting");
			setVerzikPhase(2);
			setPhaseStartTime(gameCycle);
		}

		if (overheadText.equals("Behold my true nature!") && getVerzikPhase() != 3)
		{
			log.debug("Verzik phase 3 starting");
			setVerzikPhase(3);
			setPhaseStartTime(gameCycle);
		}

		if (overheadText.equals("I'm not finished with you just yet!") && getVerzikPhase() != 4)
		{
			// P4 = Below 20% HP P3, attack speed increases
			log.debug("Verzik phase 4 starting");
			setVerzikPhase(4);
			setPhaseStartTime(gameCycle);
		}
	}

	public void checkAnimationPhaseChange(int animationId, int gameCycle)
	{
		if (animationId == AnimationID.VERZIK_PHASE_1_MAGIC_ATTACK_CHANNEL && getVerzikPhase() != 1)
		{
			log.debug("Verzik phase 1 starting");
			setVerzikPhase(1);
			setPhaseStartTime(gameCycle);
		}

		if (animationId == AnimationID.VERZIK_PHASE_3_MELEE_ATTACK ||
				animationId == AnimationID.VERZIK_PHASE_3_MAGIC_ATTACK ||
				animationId == AnimationID.VERZIK_PHASE_3_RANGED_ATTACK)
		{
			if (getVerzikPhase() > 2)
			{
				log.debug("{} | Verzik P3 | Checking attack: {}", gameCycle, animationId);
				checkAttackCycle();
			}
		}

		if (animationId == AnimationID.VERZIK_PHASE_3_WEB_ATTACK)
		{
			addWebAnimation(gameCycle);
		}
	}
}
