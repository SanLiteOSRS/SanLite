package net.sanlite.client.plugins.gauntlet.event;

import lombok.Getter;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;

public class DemiBossSpawned extends GauntletEvent
{
	@Getter
	private final NPC npc;

	@Getter
	private final WorldPoint worldLocation;

	public DemiBossSpawned(NPC npc, WorldPoint worldLocation)
	{
		super(GauntletEventType.DEMI_BOSS_SPAWNED);
		this.npc = npc;
		this.worldLocation = worldLocation;
	}
}
