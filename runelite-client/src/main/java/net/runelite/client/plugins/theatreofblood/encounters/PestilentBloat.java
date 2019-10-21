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
import net.runelite.api.*;

import java.util.List;
import java.util.stream.Collectors;

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

	public PestilentBloat(TheatreOfBloodEncounters encounter)
	{
		super(encounter);
		wakeUpClientTick = -1;
		lastSleepEndClientTick = 1;
		remainingSleepClientTicks = -1;
	}

	public boolean isHandAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_1 ||
				graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_2 ||
				graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_3 ||
				graphicsObjectId == GraphicID.BLOAT_HAND_ATTACK_4;
	}

	public boolean isAsleep()
	{
		NPC npc = getNpc();
		if (getEncounter() != null && npc != null)
		{
			return npc.getAnimation() == AnimationID.BLOAT_SLEEP;
		}
		return false;
	}

	private void sleep(int initialHitClientTick)
	{
		this.wakeUpClientTick = initialHitClientTick + SLEEP_DURATION / Constants.CLIENT_TICK_LENGTH;
		this.remainingSleepClientTicks = wakeUpClientTick - initialHitClientTick;
	}

	private void wakeUp(int sleepEndClientTick)
	{
		this.wakeUpClientTick = -1;
		this.lastSleepEndClientTick = sleepEndClientTick;
		this.remainingSleepClientTicks = -1;
	}

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
				wakeUp(clientTick);
			}
			else
			{
				updateSleepDurationTimer(clientTick);
			}
		}
	}

	public void checkHandAttackGraphicObjects(List<GraphicsObject> clientGraphicObjects)
	{
		setAoeEffects(
				clientGraphicObjects.stream()
						.filter(x -> isHandAttack(x.getId()))
						.collect(Collectors.toList()));
	}

	private void updateSleepDurationTimer(int clientTick)
	{
		setRemainingSleepClientTicks(wakeUpClientTick - clientTick);
	}
}
