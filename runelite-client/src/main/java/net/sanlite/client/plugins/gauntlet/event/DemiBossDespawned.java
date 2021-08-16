package net.sanlite.client.plugins.gauntlet.event;

import lombok.Getter;
import net.runelite.api.NPC;

public class DemiBossDespawned extends GauntletEvent
{
	@Getter
	private final NPC npc;

	public DemiBossDespawned(NPC npc)
	{
		super(GauntletEventType.DEMI_BOSS_SPAWNED);
		this.npc = npc;
	}
}
