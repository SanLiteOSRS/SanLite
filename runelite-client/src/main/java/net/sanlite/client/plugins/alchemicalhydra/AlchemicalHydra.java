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
package net.sanlite.client.plugins.alchemicalhydra;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Deque;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.sanlite.client.plugins.alchemicalhydra.id.AnimationID;
import net.sanlite.client.plugins.alchemicalhydra.id.GraphicID;
import net.sanlite.client.plugins.alchemicalhydra.id.ProjectileID;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
	private final AlchemicalHydraPlugin plugin;
	@Getter
	private final NPC npc;
	@Getter
	@Setter
	private Phase currentPhase;
	@Getter
	@Setter
	private AttackStyle currentAttackStyle;
	@Getter
	@Setter
	private AttackStyle lastAttackStyle;
	@Getter
	@Setter
	private AttackStyle currentSpecialAttackStyle;
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
	private int lastAnimationId;

	AlchemicalHydra(AlchemicalHydraPlugin plugin, NPC npc)
	{
		this.plugin = plugin;
		this.npc = npc;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.lastAnimationId = -1;
		this.attacksUntilSwitch = ATTACKS_PER_SWITCH;
		this.attacksUntilSpecialAttack = ATTACKS_PER_INITIAL_SPECIAL_ATTACK;
		this.currentPhase = Phase.GREEN;
		this.aoeEffects = new ArrayList<>();
	}

	static boolean isAlchemicalHydraRegularAttackProjectile(int projectileId)
	{
		return projectileId == ProjectileID.ALCHEMICAL_HYDRA_RANGED ||
				projectileId == ProjectileID.ALCHEMICAL_HYDRA_MAGIC;
	}

	boolean isSpecialAttackGraphicsObject(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_ON_LANDING ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_1 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_2 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_3 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_4 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_5 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_6 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_7 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_8 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_FLOATING_LIGHTNING_ORB ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_LIGHTNING_ATTACK ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_FIRE_ATTACK;
	}

	boolean isAlchemicalHydraAnimation(int animationId)
	{
		return isSpecialAttackAnimation(animationId) || isRegularAttackAnimation(animationId) ||
				isPhaseSwitchAnimation(animationId);
	}

	boolean isSpecialAttackAnimation(int animationId)
	{
		return animationId == AnimationID.ALCHEMICAL_HYDRA_GREEN_PHASE_POISON_ATTACK ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_BLUE_PHASE_LIGHTNING_ATTACK ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_RED_PHASE_FIRE_ATTACK ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_JAD_PHASE_RANGED_OR_POISON_ATTACK;
	}

	boolean isRegularAttackAnimation(int animationId)
	{
		return animationId == AnimationID.ALCHEMICAL_HYDRA_GREEN_PHASE_MAGIC_ATTACK ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_GREEN_PHASE_RANGED_ATTACK ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_BLUE_PHASE_MAGIC_ATTACK ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_BLUE_PHASE_RANGED_ATTACK ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_RED_PHASE_MAGIC_ATTACK ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_RED_PHASE_RANGED_ATTACK ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_JAD_PHASE_MAGIC_ATTACK ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_JAD_PHASE_RANGED_OR_POISON_ATTACK;
	}

	boolean isPhaseSwitchAnimation(int animationId)
	{
		return animationId == AnimationID.ALCHEMICAL_HYDRA_SWITCH_TO_BLUE_PHASE ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_SWITCH_TO_RED_PHASE ||
				animationId == AnimationID.ALCHEMICAL_HYDRA_SWITCH_TO_JAD_PHASE;
	}

	boolean isPoisonSplatSpecialAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_1 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_2 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_3 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_4 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_5 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_6 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_7 ||
				graphicsObjectId == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_8;
	}

	boolean isSpecialAttackStyle(AttackStyle attackStyle)
	{
		switch (attackStyle)
		{
			case POISON:
			case LIGHTNING:
			case FIRE:
				return true;
			default:
				return false;
		}
	}

	void switchCurrentAttackStyle(AttackStyle newAttackStyle, int attackUntilSwitch)
	{
		currentAttackStyle = newAttackStyle;
		this.attacksUntilSwitch = attackUntilSwitch;
		plugin.playAttackStyleSwitchSound(newAttackStyle);
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
				switchCurrentAttackStyle(determineInitialJadPhaseAttackStyle(lastAttackStyle), ATTACKS_PER_SWITCH);
				currentPhase = Phase.JAD;
				attacksUntilSpecialAttack = ATTACKS_PER_SPECIAL_ATTACK;
				nextAttackTick = tickCount + SWITCH_TO_JAD_ATTACK_DELAY;
				break;
		}
		currentSpecialAttackStyle = null;
	}

	private AttackStyle determineInitialJadPhaseAttackStyle(AttackStyle attackStyle)
	{
		if (attackStyle == AttackStyle.MAGIC)
		{
			return AttackStyle.RANGED;
		}
		else if (attackStyle == AttackStyle.RANGED)
		{
			return AttackStyle.MAGIC;
		}
		log.warn("Could not determine initial jad attack | Next: {}", nextAttackTick);
		return null;
	}

	void onAttack(int animationId, int tickCount, boolean fallbackAttack)
	{
		lastAnimationId = animationId;
		lastAttackTick = tickCount;
		lastAttackStyle = animationIdToAttackStyle(animationId);

		// Count ranged & magic attacks as three attacks during jad phase (attack style switches every other attack)
		if (currentPhase == Phase.JAD)
		{
			if (fallbackAttack)
			{
				// Redetermine the initial jad attack since the fallback attack occurred after the phase switch
				currentAttackStyle = determineInitialJadPhaseAttackStyle(lastAttackStyle);
				return;
			}
			updateAttackValues(tickCount + ENRAGED_ATTACK_RATE, attacksUntilSwitch - 3, attacksUntilSpecialAttack - 3, animationId);
			return;
		}

		// All other ranged/magic attacks
		// When a fallback attack is triggered the next attack tick is already increased by the phase switch
		int attackRate = fallbackAttack ? 0 : ATTACK_RATE;
		int attacksTillSpecial = fallbackAttack ? attacksUntilSpecialAttack : attacksUntilSpecialAttack - 1;
		updateAttackValues(tickCount + attackRate, attacksUntilSwitch - 1, attacksTillSpecial, animationId);
	}

	private void updateAttackValues(int nextAttackTick, int attacksUntilSwitch, int attacksTillSpecial, int animationId)
	{
		this.nextAttackTick = nextAttackTick;
		this.attacksUntilSwitch = attacksUntilSwitch;
		this.attacksUntilSpecialAttack = attacksTillSpecial;
		checkAttackStyleSwitch(animationIdToAttackStyle(animationId));
	}

	/**
	 * Handles the Alchemical Hydra's special attack for the current phase.
	 *
	 * @param animationId animation id
	 * @param tickCount   current game tick
	 */
	void onSpecialAttack(int animationId, int tickCount)
	{
		switch (animationId)
		{
			case AnimationID.ALCHEMICAL_HYDRA_GREEN_PHASE_POISON_ATTACK:
			case AnimationID.ALCHEMICAL_HYDRA_BLUE_PHASE_LIGHTNING_ATTACK:
			case AnimationID.ALCHEMICAL_HYDRA_JAD_PHASE_RANGED_OR_POISON_ATTACK:
				// Jad phase has a faster attack rate
				resetSpecialAttack(
						currentPhase.equals(Phase.JAD) ? ATTACKS_PER_SPECIAL_ATTACK * 3 : ATTACKS_PER_SPECIAL_ATTACK,
						currentPhase.equals(Phase.JAD) ? tickCount + ENRAGED_ATTACK_RATE : tickCount + ATTACK_RATE,
						tickCount, animationId);
				break;
			case AnimationID.ALCHEMICAL_HYDRA_RED_PHASE_FIRE_ATTACK:
				// Initial fire special to spawn the fire prison
				if (lastAnimationId != AnimationID.ALCHEMICAL_HYDRA_RED_PHASE_FIRE_ATTACK)
				{
					resetSpecialAttack(ATTACKS_PER_SPECIAL_ATTACK, tickCount + ATTACK_RATE, tickCount, animationId);
					return;
				}

				// Ignore second fire prison attack
				if (tickCount - lastAttackTick < 5)
				{
					return;
				}

				// Second fire special that follows the player
				lastAttackTick = tickCount;
				nextAttackTick = tickCount + DELAY_AFTER_FIRE_SPECIAL_ATTACK;
				lastAnimationId = animationId;
				break;
		}
	}

	void resetSpecialAttack(int attacksTillSpecial, int nextAttackTick, int tickCount, int animationId)
	{
		attacksUntilSpecialAttack = attacksTillSpecial;
		this.nextAttackTick = nextAttackTick;
		lastAttackTick = tickCount;
		lastAnimationId = animationId;
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
			plugin.playAttackStyleSwitchSound(attackStyle);
		}
		// Correct attacks until switch value when de-sync might occur (eg. plugin enabled during kill)
		else if (currentAttackStyle != attackStyle)
		{
			int attacksPerSwitch = currentPhase.equals(Phase.JAD) ? ATTACKS_PER_SWITCH : ATTACKS_PER_SWITCH - 1;
			AttackStyle newJadPhaseAttackStyle = attackStyle.equals(AttackStyle.MAGIC) ? AttackStyle.RANGED : AttackStyle.MAGIC;

			switchCurrentAttackStyle(currentPhase.equals(Phase.JAD) ? newJadPhaseAttackStyle : attackStyle, attacksPerSwitch);
			log.warn("De-sync switch to: {} | Attacks left: {}", currentPhase.equals(Phase.JAD) ?
					newJadPhaseAttackStyle : attackStyle, attacksUntilSwitch);
		}
		else if (attacksUntilSwitch <= 0 && currentAttackStyle == AttackStyle.MAGIC)
		{
			switchCurrentAttackStyle(AttackStyle.RANGED, ATTACKS_PER_SWITCH);
		}
		else if (attacksUntilSwitch <= 0)
		{
			switchCurrentAttackStyle(AttackStyle.MAGIC, ATTACKS_PER_SWITCH);
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

			plugin.playAttackStyleSwitchSound(currentSpecialAttackStyle);
		}
	}

	/**
	 * Checks what the next phase is for the given animation id
	 *
	 * @param animationId phase switch animation id
	 * @param tickCount   current game tick
	 */
	void checkAlchemicalHydraPhaseSwitch(int animationId, int tickCount)
	{
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
	void checkGraphicObjects(Deque<GraphicsObject> graphicsObjects)
	{
		aoeEffects = StreamSupport
				.stream(graphicsObjects.spliterator(), false)
				.filter(graphicsObject -> isSpecialAttackGraphicsObject(graphicsObject.getId()))
				.collect(Collectors.toList());
	}

	/**
	 * Get an Alchemical Hydra attack style based on the given animationId id.
	 *
	 * @param animationId alchemical hydra animation id
	 * @return Alchemical Hydra attack style
	 */
	private AttackStyle animationIdToAttackStyle(int animationId)
	{
		switch (animationId)
		{
			case AnimationID.ALCHEMICAL_HYDRA_GREEN_PHASE_RANGED_ATTACK:
			case AnimationID.ALCHEMICAL_HYDRA_BLUE_PHASE_RANGED_ATTACK:
			case AnimationID.ALCHEMICAL_HYDRA_RED_PHASE_RANGED_ATTACK:
			case AnimationID.ALCHEMICAL_HYDRA_JAD_PHASE_RANGED_OR_POISON_ATTACK:
				return AttackStyle.RANGED;
			case AnimationID.ALCHEMICAL_HYDRA_GREEN_PHASE_MAGIC_ATTACK:
			case AnimationID.ALCHEMICAL_HYDRA_BLUE_PHASE_MAGIC_ATTACK:
			case AnimationID.ALCHEMICAL_HYDRA_RED_PHASE_MAGIC_ATTACK:
			case AnimationID.ALCHEMICAL_HYDRA_JAD_PHASE_MAGIC_ATTACK:
				return AttackStyle.MAGIC;
			default:
				return null;
		}
	}

	int projectileIdToAnimationId(int projectileId)
	{
		switch (projectileId)
		{
			case ProjectileID.ALCHEMICAL_HYDRA_MAGIC:
				return AnimationID.ALCHEMICAL_HYDRA_GREEN_PHASE_MAGIC_ATTACK;
			case ProjectileID.ALCHEMICAL_HYDRA_RANGED:
				return AnimationID.ALCHEMICAL_HYDRA_GREEN_PHASE_RANGED_ATTACK;
			default:
				return -1;
		}
	}

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
}
