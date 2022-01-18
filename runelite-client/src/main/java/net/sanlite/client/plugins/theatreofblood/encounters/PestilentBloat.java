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
import net.runelite.api.Constants;
import net.runelite.api.Deque;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.sanlite.client.plugins.theatreofblood.id.AnimationID;
import net.sanlite.client.plugins.theatreofblood.id.GraphicID;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
public class PestilentBloat extends TheatreOfBloodEncounter
{
	private static final int SLEEP_DURATION = 18000;

	@Getter
	private int wakeUpClientTick;

	@Getter
	private int lastSleepEndClientTick;

	@Getter
	@Setter
	private int remainingSleepClientTicks;

	@Getter
	private int handFallCycleCount;

	@Getter
	private Integer lastHandFallSize;

	public PestilentBloat(TheatreOfBloodEncounters encounter)
	{
		super(encounter);
		wakeUpClientTick = -1;
		lastSleepEndClientTick = 1;
		remainingSleepClientTicks = -1;
		lastHandFallSize = 0;
	}

	public boolean isHandAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_1 ||
				graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_2 ||
				graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_3 ||
				graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_4;
	}

	/**
	 * Checks if the Pestilent Bloat animation id matches the sleep id
	 *
	 * @return is Pestilent Bloat asleep
	 */
	public boolean isAsleep()
	{
		NPC npc = getNpc();
		if (getEncounter() != null && npc != null)
		{
			return npc.getAnimation() == AnimationID.BLOAT_SLEEP;
		}
		return false;
	}

	/**
	 * Initializes the values for the Pestilent Bloat's sleep timer
	 *
	 * @param initialSleepClientTick initial client tick that the sleep animation was detected
	 */
	private void sleep(int initialSleepClientTick)
	{
		this.wakeUpClientTick = initialSleepClientTick + SLEEP_DURATION / Constants.CLIENT_TICK_LENGTH;
		this.remainingSleepClientTicks = wakeUpClientTick - initialSleepClientTick;
	}

	/**
	 * Ends the Pestilent Bloat's sleep timer and sets the last sleep end client tick
	 *
	 * @param sleepEndClientTick the client tick that the Pestilent Bloat woke up
	 */
	private void wakeUp(int sleepEndClientTick)
	{
		this.wakeUpClientTick = -1;
		this.lastSleepEndClientTick = sleepEndClientTick;
		this.remainingSleepClientTicks = -1;
	}

	/**
	 * Checks if the Pestilent Bloat is asleep or awake and updates the timer based on this
	 *
	 * @param clientTick current client tick
	 */
	public void checkBloatStatus(int clientTick)
	{
		// 5 seconds of grace period after bloat wakes up to prevent the timer restarting
		if (isAsleep() && clientTick > getLastSleepEndClientTick() + 250)
		{
			if (getRemainingSleepClientTicks() == -1)
			{
				sleep(clientTick);
			}
			else if (getRemainingSleepClientTicks() <= 0)
			{
				// Reset hand cycle count here as there is a small chance hands can fall the same time bloat sleeps,
				// wait till sleep is over to make sure this doesn't affect the counting
				handFallCycleCount = 0;
				wakeUp(clientTick);
			}
			else
			{
				updateSleepDurationTimer(clientTick);
			}
		}
	}

	/**
	 * Checks the clients graphics objects for the Pestilent Bloat's hand attacks and adds them to to AoE effects list
	 *
	 * @param clientGraphicObjects the clients graphics objects list
	 */
	public void checkHandAttackGraphicObjects(Deque<GraphicsObject> clientGraphicObjects)
	{
		List<GraphicsObject> handAttacks = StreamSupport
				.stream(clientGraphicObjects.spliterator(), false)
				.filter(x -> isHandAttack(x.getId()))
				.collect(Collectors.toList());

		setAoeEffects(handAttacks);

		if (handAttacks.size() != lastHandFallSize)
		{
			if (handAttacks.size() != 0)
			{
				handFallCycleCount++;
			}
			lastHandFallSize = handAttacks.size();
		}
	}

	/**
	 * Updates the remaining sleep duration timer of the Pestilent Bloat
	 *
	 * @param clientTick current client tick
	 */
	private void updateSleepDurationTimer(int clientTick)
	{
		setRemainingSleepClientTicks(wakeUpClientTick - clientTick);
	}
}
