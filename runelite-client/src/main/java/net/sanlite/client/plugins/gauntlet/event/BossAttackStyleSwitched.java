package net.sanlite.client.plugins.gauntlet.event;

import lombok.Getter;
import net.sanlite.client.plugins.gauntlet.GauntletBoss.AttackStyle;

public class BossAttackStyleSwitched extends GauntletEvent
{
	@Getter
	private final AttackStyle newAttackStyle;

	public BossAttackStyleSwitched(AttackStyle newAttackStyle)
	{
		super(GauntletEventType.ATTACK_STYLE_SWITCHED);
		this.newAttackStyle = newAttackStyle;
	}
}
