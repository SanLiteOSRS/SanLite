package net.sanlite.client.plugins.gauntlet.event;

import lombok.Getter;
import net.sanlite.client.plugins.gauntlet.GauntletBoss.ProtectionPrayer;

public class BossProtectionPrayerSwitched extends GauntletEvent
{
	@Getter
	private final ProtectionPrayer newProtectionPrayer;

	public BossProtectionPrayerSwitched(ProtectionPrayer newProtectionPrayer)
	{
		super(GauntletEventType.PROTECTION_PRAYER_SWITCHED);
		this.newProtectionPrayer = newProtectionPrayer;
	}
}
