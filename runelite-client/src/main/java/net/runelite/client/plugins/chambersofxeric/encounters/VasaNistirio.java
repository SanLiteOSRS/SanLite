package net.runelite.client.plugins.chambersofxeric.encounters;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.ProjectileID;

@Slf4j
public class VasaNistirio
{
	private static final int VASA_NISTIRIO_INITIAL_HEALING_CYCLES = 2000;

	@Getter
	private int startVasaCrystalCycle;

	@Getter
	private int startVasaHealingCycle;

	@Getter
	private int remainingVasaHealingCycles;

	public VasaNistirio()
	{
		this.remainingVasaHealingCycles = 2520;
	}

	public static boolean isNpcGlowingCrystal(int npcId)
	{
		return npcId == NpcID.GLOWING_CRYSTAL;
	}

	public static boolean isNpcVasaNistirio(int npcId)
	{
		return npcId == NpcID.VASA_NISTIRIO || npcId == NpcID.VASA_NISTIRIO_7567;
	}

	public static boolean isVasaRockProjectileId(int projectileId)
	{
		return projectileId == ProjectileID.VASA_RANGED_BOULDER_AOE;
	}

	public static boolean isVasaTeleportProjectileId(int projectileId)
	{
		return projectileId == ProjectileID.VASA_TELEPORT_AOE;
	}

	public void onVasaHealingStart(int cycle)
	{
		startVasaHealingCycle = cycle;
		log.debug("CT: {} | Vasa healing started | remaining cycles: {}", cycle, remainingVasaHealingCycles);
	}

	public void onVasaHealingEnd(int cycle)
	{
		int duration = cycle - startVasaHealingCycle;
		remainingVasaHealingCycles -= duration;
		log.debug("CT: {} | Vasa healing ended | duration: {}", cycle, duration);
	}

	public void resetHealingCycles(int cycle, NPC npc)
	{
		int crystalDuration = cycle - startVasaCrystalCycle;
		if (remainingVasaHealingCycles <= 0)
		{
			remainingVasaHealingCycles = VASA_NISTIRIO_INITIAL_HEALING_CYCLES;
			log.debug("Reset Vasa remaining healing cycles to {} cycles", VASA_NISTIRIO_INITIAL_HEALING_CYCLES);
			log.debug("CT: {} | Vasa glowing crystal despawned | duration: {} | loc: {}", cycle, crystalDuration, npc.getLocalLocation());
		}
	}

}
