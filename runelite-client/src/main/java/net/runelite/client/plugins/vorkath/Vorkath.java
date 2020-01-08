/*
 * Copyright (c) 2020, Siraz <https://github.com/Sirazzz>
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
package net.runelite.client.plugins.vorkath;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class Vorkath {
	static final int[] VORKATH_REGION = {
			9023
	};
	static final int ATTACK_RATE = 5; // 5 ticks between each attack
	private static final int ATTACKS_PER_SPECIAL_ATTACK = 6; // 6 attacks per special attack

	enum SpecialAttackStyle {
		ACID,
		ZOMBIFIED_SPAWN
	}

	@Getter
	private NPC npc;

	@Getter
	@Setter
	private boolean isAwake;

	@Getter
	@Setter
	private Vorkath.SpecialAttackStyle currentSpecialAttackStyle;

	@Getter
	@Setter
	private int attacksUntilSpecialAttack;

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
	private List<GameObject> gameObjects;

	Vorkath(NPC npc) {
		this.npc = npc;
		this.isAwake = false;
		this.attacksUntilSpecialAttack = ATTACKS_PER_SPECIAL_ATTACK;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.recentProjectileId = -1;
		this.gameObjects = new ArrayList<>();
	}

	static boolean isNpcVorkath(int npcId) {
		return npcId == NpcID.VORKATH ||
				npcId == NpcID.VORKATH_8058 ||
				npcId == NpcID.VORKATH_8059 ||
				npcId == NpcID.VORKATH_8060 ||
				npcId == NpcID.VORKATH_8061;
	}

	static boolean isNpcZombifiedSpawn(int npcId) {
		return npcId == NpcID.ZOMBIFIED_SPAWN ||
				npcId == NpcID.ZOMBIFIED_SPAWN_8063;
	}

	private boolean isAcidPoolTileObject(int objectId) {
		return objectId == ObjectID.ACID_POOL_32000;
	}

	boolean isVorkathProjectile(int projectileId) {
		return projectileId == ProjectileID.VORKATH_DRAGON_BREATH ||
				projectileId == ProjectileID.VORKATH_ICE_BREATH ||
				projectileId == ProjectileID.VORKATH_VENOM_BREATH ||
				projectileId == ProjectileID.VORKATH_PRAYER_DISABLE ||
				projectileId == ProjectileID.VORKATH_RANGED ||
				projectileId == ProjectileID.VORKATH_MAGIC ||
				projectileId == ProjectileID.VORKATH_FIREBOMB ||
				projectileId == ProjectileID.VORKATH_ACID_PHASE_FIREBALL ||
				projectileId == ProjectileID.VORKATH_ACID ||
				projectileId == ProjectileID.VORKATH_SPAWN;
	}

	boolean isVorkathRegularProjectile(int projectileId) {
		return projectileId == ProjectileID.VORKATH_DRAGON_BREATH ||
				projectileId == ProjectileID.VORKATH_ICE_BREATH ||
				projectileId == ProjectileID.VORKATH_VENOM_BREATH ||
				projectileId == ProjectileID.VORKATH_PRAYER_DISABLE ||
				projectileId == ProjectileID.VORKATH_FIREBOMB ||
				projectileId == ProjectileID.VORKATH_RANGED ||
				projectileId == ProjectileID.VORKATH_MAGIC;
	}

	boolean isVorkathSpecialProjectile(int projectileId) {
		return projectileId == ProjectileID.VORKATH_ICE_BREATH ||
				projectileId == ProjectileID.VORKATH_PRAYER_DISABLE ||
				projectileId == ProjectileID.VORKATH_FIREBOMB ||
				projectileId == ProjectileID.VORKATH_ACID ||
				projectileId == ProjectileID.VORKATH_SPAWN;
	}

	boolean isVorkathRegularAttackProjectile(int projectileId) {
		return projectileId == ProjectileID.VORKATH_DRAGON_BREATH ||
				projectileId == ProjectileID.VORKATH_RANGED ||
				projectileId == ProjectileID.VORKATH_MAGIC;
	}

	void addAcidPoolObject(GameObject gameObject) {
		if (gameObject == null) {
			return;
		}

		if (isAcidPoolTileObject(gameObject.getId())) {
			getGameObjects().add(gameObject);
		}
	}

	void removeAcidPoolObject(GameObject gameObject) {
		if (gameObject == null) {
			return;
		}

		if (isAcidPoolTileObject(gameObject.getId())) {
			getGameObjects().remove(gameObject);
		}
	}

	void onRegularAttack(int attackGameTick) {
		log.debug("Vorkath regular attack at game tick {}", attackGameTick);
		setAttacksUntilSpecialAttack(getAttacksUntilSpecialAttack() - 1);
		setLastAttackTick(attackGameTick);
		setNextAttackTick(attackGameTick + ATTACK_RATE);
	}

	void resetFight()
	{
		this.isAwake = false;
		this.attacksUntilSpecialAttack = ATTACKS_PER_SPECIAL_ATTACK;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.recentProjectileId = -1;
		this.gameObjects.clear();
	}
}
