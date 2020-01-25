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
package net.runelite.client.plugins.alchemicalhydra;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.GraphicID;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.ProjectileID;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class AlchemicalHydra
{
	static final int ATTACK_RATE = 6; // 6 ticks between each attack
	static final int ENRAGED_ATTACK_RATE = 4; // 4 ticks between each attack during jad phase
	static final int ATTACKS_PER_SWITCH = 3; // 3 attacks per style switch
	static final int ATTACKS_PER_SPECIAL_ATTACK = 9; // 9 attacks per special attack
	static final int ATTACKS_PER_INITIAL_SPECIAL_ATTACK = 3; // 3 attacks per initial phase special attack

	enum AttackStyle
	{
		MAGIC,
		RANGED,
		POISON,
		LIGHTNING,
		FIRE
	}

	enum Phase
	{
		GREEN,
		BLUE,
		RED,
		JAD
	}

	@Getter
	private NPC npc;

	@Getter
	@Setter
	private Phase currentPhase;

	@Getter
	@Setter
	private AlchemicalHydra.AttackStyle currentAttackStyle;

	@Getter
	@Setter
	private AlchemicalHydra.AttackStyle currentSpecialAttackStyle;

	@Getter
	@Setter
	private List<GraphicsObject> aoeEffects;

	@Getter
	@Setter
	private boolean isWeakened;

	@Getter
	@Setter
	private int attacksUntilSwitch;

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
	private boolean changedAttackStyleThisTick;

	@Getter
	@Setter
	private boolean changedAttackStyleLastTick;

	@Getter
	@Setter
	private int lastTickAnimation;

	AlchemicalHydra(NPC npc)
	{
		this.npc = npc;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.recentProjectileId = -1;
		this.attacksUntilSwitch = ATTACKS_PER_SWITCH;
		this.attacksUntilSpecialAttack = ATTACKS_PER_INITIAL_SPECIAL_ATTACK;
		this.currentPhase = Phase.GREEN;
		this.aoeEffects = new ArrayList<>();
	}

	static boolean isAlchemicalHydraProjectile(int projectileId)
	{
		return projectileId == ProjectileID.ALCHEMICAL_HYDRA_RANGED ||
				projectileId == ProjectileID.ALCHEMICAL_HYDRA_MAGIC ||
				projectileId == ProjectileID.ALCHEMICAL_HYDRA_POISON ||
				projectileId == ProjectileID.ALCHEMICAL_HYDRA_LIGHTNING ||
				projectileId == ProjectileID.ALCHEMICAL_HYDRA_FIRE;
	}

	static boolean isAlchemicalHydraSpecialAttackProjectile(int projectileId)
	{
		return projectileId == ProjectileID.ALCHEMICAL_HYDRA_POISON ||
				projectileId == ProjectileID.ALCHEMICAL_HYDRA_LIGHTNING ||
				projectileId == ProjectileID.ALCHEMICAL_HYDRA_FIRE;
	}

	boolean isSpecialAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_BEFORE_LANDING ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_1 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_2 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_3 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_4 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_5 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_6 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_7 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_8 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_LIGHTNING_ATTACK_1 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_LIGHTNING_ATTACK_2 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_FIRE_ATTACK;
	}

	boolean isPoisonSplatSpecialAttackBeforeLanding(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_BEFORE_LANDING;
	}

	boolean isPoisonSplatSpecialAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_BEFORE_LANDING ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_1 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_2 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_3 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_4 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_5 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_6 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_7 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_8;
	}

	boolean isLightningSpecialAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_LIGHTNING_ATTACK_1 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_LIGHTNING_ATTACK_2;
	}

	boolean isFireSpecialAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_FIRE_ATTACK;
	}

	void switchCurrentAttackStyle(AttackStyle newAttackStyle, int attackUntilSwitch)
	{
		setCurrentAttackStyle(newAttackStyle);
		setAttacksUntilSwitch(attackUntilSwitch);
		setChangedAttackStyleThisTick(true);
	}

	void switchPhase(AlchemicalHydra.Phase newPhase, int tickCount)
	{
		log.debug("Tick: {} | Hydra switch phase to {} | Next: {}", tickCount, newPhase, nextAttackTick);
		switch (newPhase)
		{
			case BLUE:
				setCurrentPhase(AlchemicalHydra.Phase.BLUE);
				setAttacksUntilSpecialAttack(AlchemicalHydra.ATTACKS_PER_INITIAL_SPECIAL_ATTACK);
				setWeakened(false);
				break;
			case RED:
				setCurrentPhase(AlchemicalHydra.Phase.RED);
				setAttacksUntilSpecialAttack(AlchemicalHydra.ATTACKS_PER_INITIAL_SPECIAL_ATTACK);
				setWeakened(false);
				break;
			case JAD:
				// Determine which attack style the Jad phase will start with
				if (getCurrentAttackStyle() == AlchemicalHydra.AttackStyle.MAGIC &&
						getAttacksUntilSwitch() != AlchemicalHydra.ATTACKS_PER_SWITCH)
				{
					setCurrentAttackStyle(AlchemicalHydra.AttackStyle.RANGED);
				}
				else if (getCurrentAttackStyle() == AlchemicalHydra.AttackStyle.RANGED &&
						getAttacksUntilSwitch() != AlchemicalHydra.ATTACKS_PER_SWITCH)
				{
					setCurrentAttackStyle(AlchemicalHydra.AttackStyle.MAGIC);
				}

				setCurrentPhase(AlchemicalHydra.Phase.JAD);
				setAttacksUntilSwitch(AlchemicalHydra.ATTACKS_PER_SWITCH);
				setAttacksUntilSpecialAttack(AlchemicalHydra.ATTACKS_PER_SPECIAL_ATTACK);
				setChangedAttackStyleThisTick(true);
				break;
		}
	}

	void onAttack(int projectileId, int tickCount)
	{
		log.debug("Tick: {} | Phase: {} | Regular attack: {} | Next: {}", tickCount, currentPhase,
				projectileIdToAttackStyle(projectileId), nextAttackTick);

		recentProjectileId = projectileId;
		lastAttackTick = tickCount;
		nextAttackTick = tickCount + ATTACK_RATE;

		// Count ranged & magic attacks as three attacks during jad phase (attack style switches every other attack)
		if (currentPhase == Phase.JAD)
		{
			attacksUntilSwitch -= 3;
			attacksUntilSpecialAttack -= 3;
			checkAttackStyleSwitch(projectileIdToAttackStyle(projectileId));
			return;
		}

		// All other ranged/magic attacks
		attacksUntilSwitch--;
		attacksUntilSpecialAttack--;
		checkAttackStyleSwitch(projectileIdToAttackStyle(projectileId));
	}

	void onSpecialAttack(int projectileId, int tickCount)
	{
		log.debug("Tick: {} | Phase: {} | Special attack: {} | Next: {}", tickCount, currentPhase,
				projectileIdToAttackStyle(projectileId), nextAttackTick);
		if (currentPhase == Phase.JAD)
		{
			attacksUntilSpecialAttack = AlchemicalHydra.ATTACKS_PER_SPECIAL_ATTACK * 3;
		}
		else
		{
			attacksUntilSpecialAttack = AlchemicalHydra.ATTACKS_PER_SPECIAL_ATTACK;
		}
		recentProjectileId = projectileId;
		lastAttackTick = tickCount;
		currentSpecialAttackStyle = null;
	}

	/**
	 * Checks what the next the attack style should be.
	 *
	 * @param attackStyle Ranged or magic
	 */
	private void checkAttackStyleSwitch(final AlchemicalHydra.AttackStyle attackStyle)
	{
		// Check if attack style is not a special attack
		if (attackStyle != AlchemicalHydra.AttackStyle.MAGIC && attackStyle != AlchemicalHydra.AttackStyle.RANGED)
		{
			return;
		}

		// Sets the alchemical hydra's starting attack style
		if (currentAttackStyle == null)
		{
			currentAttackStyle = attackStyle;
		}
		else if (attacksUntilSwitch <= 0 && currentAttackStyle == AlchemicalHydra.AttackStyle.MAGIC)
		{
			switchCurrentAttackStyle(AlchemicalHydra.AttackStyle.RANGED, AlchemicalHydra.ATTACKS_PER_SWITCH);
		}
		else if (attacksUntilSwitch <= 0 && currentAttackStyle == AlchemicalHydra.AttackStyle.RANGED)
		{
			switchCurrentAttackStyle(AlchemicalHydra.AttackStyle.MAGIC, AlchemicalHydra.ATTACKS_PER_SWITCH);
		}
		// Correct attacks until switch value when de-sync might occur (eg. plugin enabled during kill)
		else if (attacksUntilSwitch > 0 && currentAttackStyle != attackStyle)
		{
			log.warn("De-sync switch to: {} | Attacks left: {}", attackStyle, attacksUntilSwitch);
			switchCurrentAttackStyle(attackStyle, AlchemicalHydra.ATTACKS_PER_SWITCH - 1);
		}
	}

	private AttackStyle projectileIdToAttackStyle(int projectileId)
	{
		switch (projectileId)
		{
			case ProjectileID.ALCHEMICAL_HYDRA_RANGED:
				return AttackStyle.RANGED;
			case ProjectileID.ALCHEMICAL_HYDRA_MAGIC:
				return AttackStyle.MAGIC;
			case ProjectileID.ALCHEMICAL_HYDRA_POISON:
				return AttackStyle.POISON;
			case ProjectileID.ALCHEMICAL_HYDRA_LIGHTNING:
				return AttackStyle.LIGHTNING;
			case ProjectileID.ALCHEMICAL_HYDRA_FIRE:
				return AttackStyle.FIRE;
			default:
				return null;
		}
	}
}
