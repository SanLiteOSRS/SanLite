package net.runelite.client.plugins.theatreofblood.encounters;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.client.plugins.theatreofblood.TheatreOfBloodEncounterRegions;

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

	public PestilentBloat(TheatreOfBloodEncounterRegions region, TheatreOfBloodEncounters encounter)
	{
		super(region, encounter);
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

	public void sleep(int initialHitClientTick)
	{
		this.wakeUpClientTick = initialHitClientTick + SLEEP_DURATION / Constants.CLIENT_TICK_LENGTH;
		this.remainingSleepClientTicks = wakeUpClientTick - initialHitClientTick;
	}

	public void wakeUp(int sleepEndClientTick)
	{
		this.wakeUpClientTick = -1;
		this.lastSleepEndClientTick = sleepEndClientTick;
		this.remainingSleepClientTicks = -1;
	}

	public void updateSleepDurationTimer(int clientTick)
	{
		setRemainingSleepClientTicks(wakeUpClientTick - clientTick);
	}
}
