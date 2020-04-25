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
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class Vorkath
{
	private static final int ATTACK_RATE = 5; // 5 ticks between each attack
	private static final int ACID_PHASE_START_DELAY = 4; // First fireball attack 4 ticks after acid phase start
	private static final int ACID_PHASE_ATTACKS = 25; // 25 attacks per acid phase

	static final int ATTACKS_PER_SPECIAL_ATTACK = 6; // 6 attacks per special attack
	static final int[] VORKATH_REGION = {
			9023
	};

	enum SpecialAttackStyle
	{
		UNKNOWN,
		ACID,
		ZOMBIFIED_SPAWN;
	}

	@Getter
	private NPC npc;

	@Getter
	@Setter
	private boolean isAwake;

	@Getter
	@Setter
	private Vorkath.SpecialAttackStyle nextSpecialAttackStyle;

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
	private NPC zombifiedSpawn;

	@Getter
	@Setter
	private int remainingAcidPhaseAttacks;

	@Getter
	@Setter
	private List<GameObject> gameObjects;

	@Getter
	@Setter
	private List<WorldPoint> acidPhasePathPoints;

	Vorkath(NPC npc)
	{
		this.npc = npc;
		this.isAwake = false;
		this.nextSpecialAttackStyle = SpecialAttackStyle.UNKNOWN;
		this.attacksUntilSpecialAttack = ATTACKS_PER_SPECIAL_ATTACK;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.recentProjectileId = -1;
		this.remainingAcidPhaseAttacks = -1;
		this.gameObjects = new ArrayList<>();
		this.acidPhasePathPoints = new ArrayList<>();
	}

	static boolean isNpcVorkath(int npcId)
	{
		return npcId == NpcID.VORKATH ||
				npcId == NpcID.VORKATH_8058 ||
				npcId == NpcID.VORKATH_8059 ||
				npcId == NpcID.VORKATH_8060 ||
				npcId == NpcID.VORKATH_8061;
	}

	static boolean isNpcZombifiedSpawn(int npcId)
	{
		return npcId == NpcID.ZOMBIFIED_SPAWN ||
				npcId == NpcID.ZOMBIFIED_SPAWN_8063;
	}

	private boolean isAcidPoolTileObject(int objectId)
	{
		return objectId == ObjectID.ACID_POOL_32000;
	}

	boolean isVorkathProjectile(int projectileId)
	{
		return projectileId == ProjectileID.VORKATH_DRAGON_BREATH ||
				projectileId == ProjectileID.VORKATH_ICE_BREATH ||
				projectileId == ProjectileID.VORKATH_VENOM_BREATH ||
				projectileId == ProjectileID.VORKATH_PRAYER_DISABLE ||
				projectileId == ProjectileID.VORKATH_RANGED ||
				projectileId == ProjectileID.VORKATH_MAGIC ||
				projectileId == ProjectileID.VORKATH_FIREBOMB ||
				projectileId == ProjectileID.VORKATH_ACID_PHASE_FIREBALL_AOE ||
				projectileId == ProjectileID.VORKATH_ACID_AOE ||
				projectileId == ProjectileID.VORKATH_ZOMBIFIED_SPAWN_AOE;
	}

	void resetFight()
	{
		this.isAwake = false;
		this.nextSpecialAttackStyle = SpecialAttackStyle.UNKNOWN;
		this.attacksUntilSpecialAttack = ATTACKS_PER_SPECIAL_ATTACK;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.recentProjectileId = -1;
		this.gameObjects.clear();
		log.debug("Vorkath fight reset");
	}

	void addAcidPoolObject(GameObject gameObject)
	{
		if (gameObject == null)
		{
			return;
		}

		if (isAcidPoolTileObject(gameObject.getId()))
		{
			getGameObjects().add(gameObject);
		}
	}

	void removeAcidPoolObject(GameObject gameObject)
	{
		if (gameObject == null)
		{
			return;
		}

		if (isAcidPoolTileObject(gameObject.getId()))
		{
			getGameObjects().remove(gameObject);
		}
	}

	void onRegularAttack(int attackGameTick)
	{
		int attacksUntilSpecial = getAttacksUntilSpecialAttack() - 1;
		if (attacksUntilSpecial < 0)
		{
			log.warn("Attacks until special attack tried going below 0");
			return;
		}

		setAttacksUntilSpecialAttack(getAttacksUntilSpecialAttack() - 1);
		setLastAttackTick(attackGameTick);
		setNextAttackTick(attackGameTick + ATTACK_RATE);
	}

	void onFirebombAttack(VorkathPlugin plugin, int attackGameTick)
	{
		int attacksUntilSpecial = getAttacksUntilSpecialAttack() - 1;
		if (attacksUntilSpecial < 0)
		{
			log.warn("Attacks until special attack tried going below 0");
			return;
		}

		plugin.sendVorkathAttackNotification(ProjectileID.VORKATH_FIREBOMB);
		setAttacksUntilSpecialAttack(getAttacksUntilSpecialAttack() - 1);
		setLastAttackTick(attackGameTick);
		setNextAttackTick(attackGameTick + (ATTACK_RATE));
	}

	void onSpecialAttack(Projectile projectile, VorkathPlugin plugin, int attackGameTick)
	{
		int projectileId = projectile.getId();
		switch (projectile.getId())
		{
			case ProjectileID.VORKATH_ICE_BREATH:
				if (getRecentProjectileId() == ProjectileID.VORKATH_ICE_BREATH)
				{
					return;
				}

				log.debug("{} | Special attack: {} | {}", attackGameTick, projectileId, nextAttackTick);
				plugin.sendVorkathAttackNotification(projectileId);
				setAttacksUntilSpecialAttack(Vorkath.ATTACKS_PER_SPECIAL_ATTACK);
				setNextSpecialAttackStyle(Vorkath.SpecialAttackStyle.ACID);
				setLastAttackTick(attackGameTick);

				// Time till next attack seems to range between 1-6 ticks after getting unfrozen
				// so we wait until the next regular attack to prevent inaccuracies
				setNextAttackTick(-1);
				break;
			case ProjectileID.VORKATH_ACID_AOE:
				if (getRecentProjectileId() == ProjectileID.VORKATH_ACID_AOE)
				{
					return;
				}

				log.debug("{} | Special attack: {} | {}", attackGameTick, projectileId, nextAttackTick);
				plugin.sendVorkathAttackNotification(projectileId);
				setAttacksUntilSpecialAttack(Vorkath.ATTACKS_PER_SPECIAL_ATTACK);
				setRemainingAcidPhaseAttacks(Vorkath.ACID_PHASE_ATTACKS);
				setNextSpecialAttackStyle(Vorkath.SpecialAttackStyle.ZOMBIFIED_SPAWN);
				setLastAttackTick(attackGameTick);
				setNextAttackTick(attackGameTick + ACID_PHASE_START_DELAY);
				log.debug("{} | Set next attack after acid start to tick {}", attackGameTick, nextAttackTick);
				break;
		}
	}

	void onAcidPhaseFireballAttack(int attackGameTick)
	{
		int remainingAttacks = getRemainingAcidPhaseAttacks() - 1;
		if (remainingAttacks < 0)
		{
			log.warn("Remaining acid phase attacks tried going below 0");
			return;
		}

		setRemainingAcidPhaseAttacks(getRemainingAcidPhaseAttacks() - 1);
		setLastAttackTick(attackGameTick);
		setNextAttackTick(attackGameTick + 1);

		if (getRemainingAcidPhaseAttacks() == 0)
		{
			setRemainingAcidPhaseAttacks(-1);
			setNextAttackTick(attackGameTick + ATTACK_RATE);
			getAcidPhasePathPoints().clear();
			log.debug("{} | Acid phase end", attackGameTick);
		}
	}

	/**
	 * Searches an acid free path that is the least amount of clicks for the player
	 * Minimum path length is based on the user's config settings
	 */
	void calculateAcidPhasePath(Actor localPlayer, int minimumPathLength)
	{
		getAcidPhasePathPoints().clear();

		List<WorldPoint> acidSpots = new ArrayList<>();
		getGameObjects().stream()
				.filter((x) -> x.getWorldLocation() != null)
				.forEach((x) -> acidSpots.add(x.getWorldLocation()));


		final int[][][] possiblePathDirections = {{{0, 1}, {0, -1}}, {{1, 0}, {-1, 0}}};

		List<WorldPoint> bestPath = new ArrayList<>();
		double bestClicksRequired = 99;

		if (localPlayer == null)
		{
			return;
		}

		final WorldPoint playerLocation = localPlayer.getWorldLocation();
		final WorldPoint vorkathLocation = getNpc().getWorldLocation();

		final int maxX = vorkathLocation.getX() + 14;
		final int minX = vorkathLocation.getX() - 8;
		final int maxY = vorkathLocation.getY() - 1;
		final int minY = vorkathLocation.getY() - 8;

		// Attempt to search an acid free path, beginning at a location
		// adjacent to the player's location (including diagonals)
		for (int x = -1; x < 2; x++)
		{
			for (int y = -1; y < 2; y++)
			{
				final WorldPoint baseLocation = new WorldPoint(playerLocation.getX() + x,
						playerLocation.getY() + y, playerLocation.getPlane());

				if (acidSpots.contains(baseLocation) || baseLocation.getY() < minY || baseLocation.getY() > maxY)
				{
					continue;
				}

				// Search in X and Y direction
				for (int d = 0; d < possiblePathDirections.length; d++)
				{
					// Calculate the clicks required to start walking on the path
					double currentClicksRequired = Math.abs(x) + Math.abs(y);
					if (currentClicksRequired < 2)
					{
						currentClicksRequired += Math.abs(y * possiblePathDirections[d][0][0]) +
								Math.abs(x * possiblePathDirections[d][0][1]);
					}
					if (d == 0)
					{
						// Prioritize a path in the X direction (sideways)
						currentClicksRequired += 0.5;
					}

					List<WorldPoint> currentPath = new ArrayList<>();
					currentPath.add(baseLocation);

					// Positive X (first iteration) or positive Y (second iteration)
					for (int i = 1; i < 25; i++)
					{
						final WorldPoint testingLocation = new WorldPoint(baseLocation.getX() + i *
								possiblePathDirections[d][0][0], baseLocation.getY() + i *
								possiblePathDirections[d][0][1], baseLocation.getPlane());

						if (acidSpots.contains(testingLocation) || testingLocation.getY() < minY ||
								testingLocation.getY() > maxY || testingLocation.getX() < minX ||
								testingLocation.getX() > maxX)
						{
							break;
						}
						currentPath.add(testingLocation);
					}

					// Negative X (first iteration) or positive Y (second iteration)
					for (int i = 1; i < 25; i++)
					{
						final WorldPoint testingLocation = new WorldPoint(baseLocation.getX() + i *
								possiblePathDirections[d][1][0], baseLocation.getY() + i *
								possiblePathDirections[d][1][1], baseLocation.getPlane());

						if (acidSpots.contains(testingLocation) || testingLocation.getY() < minY ||
								testingLocation.getY() > maxY || testingLocation.getX() < minX ||
								testingLocation.getX() > maxX)
						{
							break;
						}
						currentPath.add(testingLocation);
					}

					if (currentPath.size() >= minimumPathLength && currentClicksRequired < bestClicksRequired ||
							(currentClicksRequired == bestClicksRequired && currentPath.size() > bestPath.size()))
					{
						bestPath = currentPath;
						bestClicksRequired = currentClicksRequired;
					}
				}
			}
		}

		if (bestClicksRequired != 99)
		{
			setAcidPhasePathPoints(bestPath);
		}
	}
}
