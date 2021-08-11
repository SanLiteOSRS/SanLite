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
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class GauntletBoss
{
	static final int ATTACK_RATE = 5; // 5 ticks between each attack
	static final int ATTACKS_PER_SWITCH = 4; // 4 attacks per style switch
	static final int ATTACKS_PER_OVERHEAD_SWITCH = 6; // 6 attacks per overhead switch
	@Getter
	private final NPC npc;
	@Getter
	private AttackStyle currentAttackStyle;
	@Getter
	private ProtectedStyle currentProtectedStyle;
	@Getter
	private final List<NPC> crystals;
	@Getter
	private int attacksUntilSwitch;
	@Getter
	private int attacksUntilOverheadSwitch;
	@Getter
	private int nextAttackTick;
	@Getter
	private int lastAttackTick;
	@Getter
	private int lastAttackedTick;
	@Getter
	private ProtectedStyle lastAttackedStyle;
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
		this.lastAttackedTick = -100;
		this.lastProjectileId = -1;
		this.lastAttackAnimationId = -1;
		this.attacksUntilSwitch = ATTACKS_PER_SWITCH;
		this.attacksUntilOverheadSwitch = ATTACKS_PER_OVERHEAD_SWITCH;
		this.currentAttackStyle = GauntletBoss.AttackStyle.RANGED;
		this.currentProtectedStyle = getProtectedStyle(npc);
		this.lastAttackedStyle = null;
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
		if (nextAttackTick != -100 && tickCount != nextAttackTick)
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
			switchAttackStyle();
		}
	}

	public void attacked(ProtectedStyle attackStyle, int tickCount)
	{
		if (lastAttackedTick >= tickCount)
		{
			log.warn("Ignored early player {} attack at tick {} while last attack tick was {}", attackStyle, tickCount, lastAttackedTick);
			return;
		}

		log.debug("Gauntlet boss was attacked with {} on protect {} at tick {}", attackStyle, currentProtectedStyle, tickCount);
		lastAttackedStyle = attackStyle;

		if (attackStyle != currentProtectedStyle)
		{
			lastAttackedTick = tickCount;
			attacksUntilOverheadSwitch = attacksUntilOverheadSwitch - 1;
		}

		if (attacksUntilOverheadSwitch <= 0)
		{
			log.debug("Gauntlet boss protected style should change");
		}
	}

	public void switchProtectedStyle(HeadIcon overheadIcon)
	{
		currentProtectedStyle = getProtectedStyle(overheadIcon);
		attacksUntilOverheadSwitch = GauntletBoss.ATTACKS_PER_OVERHEAD_SWITCH;
		log.debug("Gauntlet boss switched protect style to: {}", currentProtectedStyle);
	}

	private void switchAttackStyle()
	{
		AttackStyle newAttackStyle = getNextAttackStyle();
		currentAttackStyle = newAttackStyle;
		attacksUntilSwitch = GauntletBoss.ATTACKS_PER_SWITCH;
		log.debug("Gauntlet boss switched attack style to: {}", newAttackStyle);
	}

	public void verifyAttackStyleSwitch(AttackStyle attackStyle, int tickCount)
	{
		if (attacksUntilSwitch == GauntletBoss.ATTACKS_PER_SWITCH && attackStyle == currentAttackStyle)
		{
			return;
		}

		log.warn("Style switched to: {} at tick {} before remaining {} attacks occurred", attackStyle, tickCount, attacksUntilSwitch);
		switchAttackStyle();
	}

	public void crystalSpawned(NPC npc)
	{
		crystals.add(npc);
	}

	public void crystalDespawned(NPC npc)
	{
		crystals.remove(npc);
	}

	public static ProtectedStyle getProtectedStyle(NPC npc)
	{
		NPCComposition composition = npc.getComposition();
		if (composition == null)
		{
			log.warn("Could not determine protected style because NPC: {} has null composition", npc.getName());
			return null;
		}

		HeadIcon overheadIcon = composition.getOverheadIcon();
		if (overheadIcon == null)
		{
			log.warn("Could not determine protected style because NPC: {} has null overhead icon", npc.getName());
			return null;
		}

		return getProtectedStyle(overheadIcon);
	}

	public static ProtectedStyle getProtectedStyle(HeadIcon overheadIcon)
	{
		switch (overheadIcon)
		{
			case RANGED:
				return ProtectedStyle.RANGED;
			case MELEE:
				return ProtectedStyle.MELEE;
			case MAGIC:
				return ProtectedStyle.MAGIC;
			default:
				log.warn("Could not determine gauntlet boss protected style. Head icon ordinal: {}", overheadIcon.ordinal());
				return null;
		}
	}

	private AttackStyle getNextAttackStyle()
	{
		if (currentAttackStyle == GauntletBoss.AttackStyle.RANGED)
		{
			return GauntletBoss.AttackStyle.MAGIC;
		}

		return GauntletBoss.AttackStyle.RANGED;
	}

	public enum AttackStyle
	{
		MAGIC,
		RANGED
	}

	public enum ProtectedStyle
	{
		MAGIC,
		RANGED,
		MELEE
	}
}
