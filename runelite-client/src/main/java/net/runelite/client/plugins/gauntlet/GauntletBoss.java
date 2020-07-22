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
package net.runelite.client.plugins.gauntlet;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.NPC;
import net.runelite.api.ProjectileID;

import java.util.ArrayList;
import java.util.List;

class GauntletBoss
{
	private static final int CRYSTALLINE_HUNLLEF_CRYSTAL_ID = 9025;
	private static final int CORRUPTED_HUNLLEF_CRYSTAL_ID = 9039;

	static final int ATTACK_RATE = 5; // 5 ticks between each attack
	static final int ATTACKS_PER_SWITCH = 4; // 4 attacks per style switch

	enum AttackStyle
	{
		MAGIC,
		RANGED
	}

	@Getter
	private NPC npc;

	@Getter
	@Setter
	private GauntletBoss.AttackStyle currentAttackStyle;

	@Getter
	@Setter
	private List<NPC> crystalEffects;

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
		this.crystalEffects = new ArrayList<>();
	}

	boolean isGauntletBossRangedAttack(int projectileId)
	{
		return projectileId == ProjectileID.CRYSTALLINE_HUNLLEF_RANGED_ATTACK ||
				projectileId == ProjectileID.CORRUPTED_HUNLLEF_RANGED_ATTACK;
	}

	boolean isGauntletBossMagicAttack(int projectileId)
	{
		return projectileId == ProjectileID.CRYSTALLINE_HUNLLEF_MAGIC_ATTACK ||
				projectileId == ProjectileID.CRYSTALLINE_HUNLLEF_DISABLE_PRAYERS_ATTACK ||
				projectileId == ProjectileID.CORRUPTED_HUNLLEF_MAGIC_ATTACK ||
				projectileId == ProjectileID.CORRUPTED_HUNLLEF_DISABLE_PRAYERS_ATTACK;
	}

	boolean isNpcCrystalAttack(int npcId)
	{
		return npcId == CRYSTALLINE_HUNLLEF_CRYSTAL_ID || npcId == CORRUPTED_HUNLLEF_CRYSTAL_ID;
	}
}
