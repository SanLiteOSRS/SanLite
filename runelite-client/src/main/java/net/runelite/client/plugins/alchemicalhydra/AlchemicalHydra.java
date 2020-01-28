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
import net.runelite.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
class AlchemicalHydra
{
	static final int ATTACK_RATE = 6; // 6 ticks between each attack
	static final int ENRAGED_ATTACK_RATE = 4; // 4 ticks between each attack during jad phase
	static final int ATTACKS_PER_SWITCH = 3; // 3 attacks per style switch
	static final int ATTACKS_PER_SPECIAL_ATTACK = 9; // 9 attacks per special attack
	static final int ATTACKS_PER_INITIAL_SPECIAL_ATTACK = 3; // 3 attacks per initial phase special attack

	static final int SWITCH_TO_BLUE_ATTACK_DELAY = 9; // 9 ticks delay on the next attack when switching to blue phase
	static final int SWITCH_TO_RED_ATTACK_DELAY = 8; // 8 ticks delay on the next attack when switching to red phase
	static final int SWITCH_TO_JAD_ATTACK_DELAY = 7; // 7 ticks delay on the next attack when switching to jad phase

	static final int DELAY_BEFORE_FIRE_SPECIAL_ATTACK = 15; // 15 ticks delay from last attack till the fire special
	static final int DELAY_AFTER_FIRE_SPECIAL_ATTACK = 12; // 12 ticks delay till next attack after the fire special

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
		currentAttackStyle = newAttackStyle;
		this.attacksUntilSwitch = attackUntilSwitch;
	}

	Phase getNextPhase(Phase currentPhase)
	{
		switch (currentPhase)
		{
			case GREEN:
				return Phase.BLUE;
			case BLUE:
				return Phase.RED;
			case RED:
				return Phase.JAD;
			default:
				log.warn("Tried retrieving next phase for phase {} which has none", currentPhase);
				return null;
		}
	}

	void switchPhase(Phase newPhase, int tickCount)
	{
		switch (newPhase)
		{
			case BLUE:
				currentPhase = Phase.BLUE;
				attacksUntilSpecialAttack = ATTACKS_PER_INITIAL_SPECIAL_ATTACK;
				isWeakened = false;
				nextAttackTick = tickCount + SWITCH_TO_BLUE_ATTACK_DELAY;
				break;
			case RED:
				currentPhase = Phase.RED;
				attacksUntilSpecialAttack = ATTACKS_PER_INITIAL_SPECIAL_ATTACK;
				isWeakened = false;
				nextAttackTick = tickCount + SWITCH_TO_RED_ATTACK_DELAY;
				break;
			case JAD:
				// Determine which attack style the Jad phase will start with
				if (currentAttackStyle == AttackStyle.MAGIC && attacksUntilSwitch != ATTACKS_PER_SWITCH)
				{
					currentAttackStyle = AttackStyle.RANGED;
				}
				else if (currentAttackStyle == AttackStyle.RANGED && attacksUntilSwitch != ATTACKS_PER_SWITCH)
				{
					currentAttackStyle = AttackStyle.MAGIC;
				}

				currentPhase = Phase.JAD;
				attacksUntilSwitch = ATTACKS_PER_SWITCH;
				attacksUntilSpecialAttack = ATTACKS_PER_SPECIAL_ATTACK;
				nextAttackTick = tickCount + SWITCH_TO_JAD_ATTACK_DELAY;
				break;
		}
		currentSpecialAttackStyle = null;
	}

	void onAttack(int projectileId, int tickCount)
	{
		recentProjectileId = projectileId;
		lastAttackTick = tickCount;

		// Count ranged & magic attacks as three attacks during jad phase (attack style switches every other attack)
		if (currentPhase == Phase.JAD)
		{
			nextAttackTick = tickCount + ENRAGED_ATTACK_RATE;
			attacksUntilSwitch -= 3;
			attacksUntilSpecialAttack -= 3;
			checkAttackStyleSwitch(projectileIdToAttackStyle(projectileId));
			return;
		}

		// All other ranged/magic attacks
		nextAttackTick = tickCount + ATTACK_RATE;
		attacksUntilSwitch--;
		attacksUntilSpecialAttack--;
		checkAttackStyleSwitch(projectileIdToAttackStyle(projectileId));
	}

	/**
	 * Handles the Alchemical Hydra's special attack for the current phase.
	 *
	 * @param id        projectile/animation id
	 * @param tickCount current game tick
	 */
	void onSpecialAttack(int id, int tickCount)
	{
		// In rare occasions the poison special attack during jad phase will not spawn a projectile
		// So we use the jad phase poison attack animation id instead to make sure the attack is detected
		if (currentPhase == Phase.JAD && id == AnimationID.ALCHEMICAL_HYDRA_JAD_PHASE_POISON_ATTACK)
		{
			// Jad poison attack uses enraged attack rate
			attacksUntilSpecialAttack = ATTACKS_PER_SPECIAL_ATTACK * 3;
			nextAttackTick = tickCount + ENRAGED_ATTACK_RATE;
			recentProjectileId = ProjectileID.ALCHEMICAL_HYDRA_POISON;
			lastAttackTick = tickCount;
			currentSpecialAttackStyle = null;
			return;
		}
		else if (currentPhase == Phase.RED)
		{
			attacksUntilSpecialAttack = ATTACKS_PER_SPECIAL_ATTACK;

			// Initial fire special to spawn the fire prison
			if (recentProjectileId != ProjectileID.ALCHEMICAL_HYDRA_FIRE)
			{
				recentProjectileId = id;
				lastAttackTick = tickCount;
				currentSpecialAttackStyle = null;
				nextAttackTick = tickCount + ATTACK_RATE;
				return;
			}

			// Second fire special that follows the player
			nextAttackTick = tickCount + DELAY_AFTER_FIRE_SPECIAL_ATTACK;
		}
		else
		{
			// Poison & lightning special use regular attack rate
			attacksUntilSpecialAttack = ATTACKS_PER_SPECIAL_ATTACK;
			nextAttackTick = tickCount + ATTACK_RATE;
		}

		recentProjectileId = id;
		lastAttackTick = tickCount;
		currentSpecialAttackStyle = null;
	}

	/**
	 * Checks what the next the attack style should be.
	 *
	 * @param attackStyle Ranged or magic
	 */
	private void checkAttackStyleSwitch(final AttackStyle attackStyle)
	{
		// Check if attack style is not a special attack
		if (attackStyle != AttackStyle.MAGIC && attackStyle != AttackStyle.RANGED)
		{
			return;
		}

		// Sets the alchemical hydra's starting attack style
		if (currentAttackStyle == null)
		{
			currentAttackStyle = attackStyle;
		}
		else if (attacksUntilSwitch <= 0 && currentAttackStyle == AttackStyle.MAGIC)
		{
			switchCurrentAttackStyle(AttackStyle.RANGED, ATTACKS_PER_SWITCH);
		}
		else if (attacksUntilSwitch <= 0 && currentAttackStyle == AttackStyle.RANGED)
		{
			switchCurrentAttackStyle(AttackStyle.MAGIC, ATTACKS_PER_SWITCH);
		}
		// Correct attacks until switch value when de-sync might occur (eg. plugin enabled during kill)
		else if (attacksUntilSwitch > 0 && currentAttackStyle != attackStyle)
		{
			log.warn("De-sync switch to: {} | Attacks left: {}", attackStyle, attacksUntilSwitch);
			switchCurrentAttackStyle(attackStyle, ATTACKS_PER_SWITCH - 1);
		}
	}

	/**
	 * Checks what and when the next special attack should be.
	 */
	void checkAlchemicalHydraSpecialAttacks(int tickCount)
	{
		if (currentSpecialAttackStyle == null && attacksUntilSpecialAttack == 0)
		{
			switch (currentPhase)
			{
				case GREEN:
				case JAD:
					currentSpecialAttackStyle = AttackStyle.POISON;
					break;
				case BLUE:
					currentSpecialAttackStyle = AttackStyle.LIGHTNING;
					break;
				case RED:
					currentSpecialAttackStyle = AttackStyle.FIRE;

					// Only set next attack tick on the tick of the last attack before the fire special
					if (lastAttackTick == tickCount)
					{
						nextAttackTick = tickCount + DELAY_BEFORE_FIRE_SPECIAL_ATTACK;
					}
					break;
			}
		}
	}

	/**
	 * Checks for phase switches through animation id's. If this is the jad phase it will change
	 * the next attack style when necessary.
	 */
	void checkAlchemicalHydraPhaseSwitch(int tickCount)
	{
		int animationId = npc.getAnimation();
		if (animationId == AnimationID.ALCHEMICAL_HYDRA_SWITCH_TO_BLUE_PHASE && currentPhase != Phase.BLUE)
		{
			switchPhase(Phase.BLUE, tickCount);
		}
		else if (animationId == AnimationID.ALCHEMICAL_HYDRA_SWITCH_TO_RED_PHASE && currentPhase != Phase.RED)
		{
			switchPhase(Phase.RED, tickCount);
		}
		else if (animationId == AnimationID.ALCHEMICAL_HYDRA_SWITCH_TO_JAD_PHASE && currentPhase != Phase.JAD)
		{
			switchPhase(Phase.JAD, tickCount);
		}
	}

	/**
	 * Checks if the client graphics objects contain a special attack object and updates the aoe effects list
	 */
	void checkGraphicObjects(List<GraphicsObject> graphicsObjects)
	{
		aoeEffects = graphicsObjects.stream()
				.filter(x -> isSpecialAttack(x.getId()))
				.collect(Collectors.toList());
	}

	/**
	 * Get an Alchemical Hydra attack style based on the given projectile id.
	 *
	 * @param projectileId alchemical hydra projectile id
	 * @return Alchemical Hydra attack style
	 */
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
