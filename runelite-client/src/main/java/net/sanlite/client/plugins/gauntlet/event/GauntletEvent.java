package net.sanlite.client.plugins.gauntlet.event;

import lombok.Getter;

public class GauntletEvent
{
	@Getter
	private final GauntletEventType type;

	public GauntletEvent(GauntletEventType type)
	{
		this.type = type;
	}
}
