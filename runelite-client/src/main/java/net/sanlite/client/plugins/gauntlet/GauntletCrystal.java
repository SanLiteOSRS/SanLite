package net.sanlite.client.plugins.gauntlet;

import lombok.Getter;
import net.runelite.api.NPC;

public class GauntletCrystal
{

	@Getter
	private final NPC npc;
	private final int spawnTick;

	GauntletCrystal(NPC npc, int spawnTick)
	{
		this.npc = npc;
		this.spawnTick = spawnTick;
	}

	int getRemainingDuration(int tickCount)
	{
		int duration = 21; // 21 ticks before a crystal despawns
		return (spawnTick + duration) - tickCount;
	}
}
