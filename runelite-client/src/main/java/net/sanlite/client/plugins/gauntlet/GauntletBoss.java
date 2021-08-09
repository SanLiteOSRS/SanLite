/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
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
package net.sanlite.client.plugins.gauntlet;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.NPC;
import net.sanlite.client.plugins.gauntlet.id.GauntletPlayerId;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class GauntletBoss
{
	static final int ATTACK_RATE = 5; // 5 ticks between each attack
	static final int ATTACKS_PER_SWITCH = 4; // 4 attacks per style switch
	@Getter
	private final NPC npc;
	@Getter
	@Setter
	private GauntletBoss.AttackStyle currentAttackStyle;
	@Getter
	@Setter
	private List<NPC> crystals;
	@Getter
	@Setter
	private int attacksUntilSwitch;
	@Getter
	@Setter
	private int nextAttackTick;
	@Getter
	@Setter
	private int lastAttackTick;
	@Getter
	@Setter
	private int lastProjectileId;
	@Getter
	@Setter
	private int lastAttackAnimationId;

	GauntletBoss(NPC npc)
	{
		this.npc = npc;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.lastProjectileId = -1;
		this.lastAttackAnimationId = -1;
		this.attacksUntilSwitch = ATTACKS_PER_SWITCH;
		this.currentAttackStyle = AttackStyle.RANGED;
		this.crystals = new ArrayList<>();
	}

	/**
	 * Sets the remaining hits for the current Gauntlet boss attack style.
	 *
	 * @param attackStyle Ranged or magic
	 */
	public void basicAttack(final AttackStyle attackStyle, int tickCount)
	{
		log.debug("Gauntlet boss {} attack. Tick: {} ", attackStyle, tickCount);
		attack(tickCount, GauntletBoss.ATTACK_RATE, true);
	}

	// TODO: Separate disable prayer attack

	public void crystalAttack(int tickCount)
	{
		log.debug("Gauntlet boss CRYSTAL attack. Tick: {} ", tickCount);
		attack(tickCount, GauntletBoss.ATTACK_RATE, true);
	}

	public void trample(int tickCount)
	{
		log.debug("Gauntlet boss TRAMPLE attack. Tick: {} ", tickCount);
		// TODO: Get attack rate
		attack(tickCount, 5, false);
	}

	private void attack(int tickCount, int attackTickDelay, boolean isDecrementAttack)
	{
		if (tickCount != nextAttackTick)
		{
			log.warn("Gauntlet boss attack occurred at tick {}, before expected tick {}", tickCount, nextAttackTick);
		}

		lastAttackTick = tickCount;
		nextAttackTick = tickCount + attackTickDelay;
		if (isDecrementAttack)
		{
			attacksUntilSwitch = attacksUntilSwitch - 1;
		}

		if (attacksUntilSwitch <= 0)
		{
			switchStyle();
		}
	}

	public void attacked(GauntletPlayerId.AttackStyle attackStyle, int tickCount)
	{
		// TODO: Implement
		log.debug("Gauntlet boss was attacked with {} at tick {}", attackStyle, tickCount);
	}

	private void switchStyle()
	{
		AttackStyle newAttackStyle = getNextAttackStyle();
		currentAttackStyle = newAttackStyle;
		attacksUntilSwitch = GauntletBoss.ATTACKS_PER_SWITCH;
		log.debug("Gauntlet boss switched attack style to: {}", newAttackStyle);
	}

	public void verifyStyleSwitch(GauntletBoss.AttackStyle attackStyle, int tickCount)
	{
		if (attacksUntilSwitch == GauntletBoss.ATTACKS_PER_SWITCH && attackStyle == currentAttackStyle)
		{
			return;
		}

		log.warn("Style switched to: {} at tick {} before remaining {} attacks occurred", attackStyle, tickCount, attacksUntilSwitch);
		switchStyle();
	}

	public void crystalSpawned(NPC npc)
	{
		crystals.add(npc);
	}

	public void crystalDespawned(NPC npc)
	{
		crystals.remove(npc);
	}

	private AttackStyle getNextAttackStyle()
	{
		if (currentAttackStyle == AttackStyle.RANGED)
		{
			return AttackStyle.MAGIC;
		}

		return AttackStyle.RANGED;
	}

	public enum AttackStyle
	{
		MAGIC,
		RANGED
	}
}
