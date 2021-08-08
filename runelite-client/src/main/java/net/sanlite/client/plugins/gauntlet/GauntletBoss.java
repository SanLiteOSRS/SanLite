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
import net.sanlite.client.plugins.gauntlet.id.GauntletBossId;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class GauntletBoss
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
	private int recentProjectileId;
	@Getter
	@Setter
	private int remainingProjectileCount;
	@Getter
	@Setter
	private boolean changedAttackStyleThisTick;
	@Getter
	@Setter
	private boolean changedAttackStyleLastTick;
	@Getter
	@Setter
	private int lastTickAnimation;

	GauntletBoss(NPC npc)
	{
		this.npc = npc;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.recentProjectileId = -1;
		this.attacksUntilSwitch = ATTACKS_PER_SWITCH;
		this.currentAttackStyle = AttackStyle.RANGED;
		this.crystals = new ArrayList<>();
	}

	static AttackStyle getAttackStyle(int projectileId)
	{
		switch (projectileId)
		{
			case GauntletBossId.Proj.MAGIC:
			case GauntletBossId.Proj.CORRUPTED_MAGIC:
			case GauntletBossId.Proj.DISABLE_PRAYER:
			case GauntletBossId.Proj.CORRUPTED_DISABLE_PRAYER:
				return AttackStyle.MAGIC;
			case GauntletBossId.Proj.RANGED:
			case GauntletBossId.Proj.CORRUPTED_RANGED:
				return AttackStyle.RANGED;
			default:
				log.warn("Could not determine gauntlet boss attack style. Projectile id: {}", projectileId);
				return null;
		}
	}

	/**
	 * Sets the remaining hits for the current Gauntlet boss attack style.
	 *
	 * @param attackStyle Ranged or magic
	 */
	public void basicAttack(final AttackStyle attackStyle, int tickCount)
	{
		setAttacksUntilSwitch(getAttacksUntilSwitch() - 1);
		checkAttackStyleSwitch(attackStyle);
		setNextAttackTick(tickCount + GauntletBoss.ATTACK_RATE);
	}

	public void crystalSpawned(NPC npc)
	{
		crystals.add(npc);
	}

	public void crystalDespawned(NPC npc)
	{
		crystals.remove(npc);
	}

	/**
	 * Checks what the next the attack style should be.
	 *
	 * @param attackStyle Ranged or magic
	 */
	public void checkAttackStyleSwitch(final GauntletBoss.AttackStyle attackStyle)
	{
		// Check if attack style is not a special attack
		if (attackStyle != GauntletBoss.AttackStyle.MAGIC && attackStyle != GauntletBoss.AttackStyle.RANGED)
		{
			return;
		}

		// Sets the gauntlets boss starting attack style
		if (getCurrentAttackStyle() == null)
		{
			setCurrentAttackStyle(attackStyle);
		} else if (getAttacksUntilSwitch() <= 0 && getCurrentAttackStyle() == GauntletBoss.AttackStyle.MAGIC)
		{
			log.debug("Switch to ranged: " + getAttacksUntilSwitch());
			setCurrentAttackStyle(GauntletBoss.AttackStyle.RANGED);
			setAttacksUntilSwitch(GauntletBoss.ATTACKS_PER_SWITCH);
			setChangedAttackStyleThisTick(true);
		} else if (getAttacksUntilSwitch() <= 0 && getCurrentAttackStyle() == GauntletBoss.AttackStyle.RANGED)
		{
			log.debug("Switch to magic: " + getAttacksUntilSwitch());
			setCurrentAttackStyle(GauntletBoss.AttackStyle.MAGIC);
			setAttacksUntilSwitch(GauntletBoss.ATTACKS_PER_SWITCH);
			setChangedAttackStyleThisTick(true);
		}
		// Correct attacks until switch when de-sync might occur (eg. plugin enabled during kill)
		else if (getAttacksUntilSwitch() > 0 && getCurrentAttackStyle() != attackStyle)
		{
			log.debug("De-sync switch to: " + attackStyle + " | Attacks left: " + getAttacksUntilSwitch());
			setCurrentAttackStyle(attackStyle);
			setAttacksUntilSwitch(GauntletBoss.ATTACKS_PER_SWITCH - 1);
			setChangedAttackStyleThisTick(true);
		}
	}

	public enum AttackStyle
	{
		MAGIC,
		RANGED
	}
}
