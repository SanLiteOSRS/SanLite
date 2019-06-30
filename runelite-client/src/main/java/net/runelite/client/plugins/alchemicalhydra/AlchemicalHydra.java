package net.runelite.client.plugins.alchemicalhydra;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.GraphicID;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class AlchemicalHydra
{
	static final int ATTACK_RATE = 5; // 5 ticks between each attack
	static final int ATTACKS_PER_SWITCH = 3; // 3 head attacks per style switch
	static final int ATTACKS_PER_SPECIAL_ATTACK = 9; // 9 head attacks per special attack
	static final int ATTACKS_PER_INITIAL_SPECIAL_ATTACK = 3; // 3 head attacks per initial phase special attack

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
	private Phase currentHydraPhase;

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

	AlchemicalHydra(NPC npc)
	{
		this.npc = npc;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.recentProjectileId = -1;
		this.attacksUntilSwitch = ATTACKS_PER_SWITCH;
		this.attacksUntilSpecialAttack = ATTACKS_PER_INITIAL_SPECIAL_ATTACK;
		this.currentHydraPhase = Phase.GREEN;
		this.aoeEffects = new ArrayList<>();
	}

	boolean isSpecialAttack(GraphicsObject graphicsObject)
	{
		return graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_BEFORE_LANDING ||
				graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_1 ||
				graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_2 ||
				graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_3 ||
				graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_4 ||
				graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_5 ||
				graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_LIGHTNING_ATTACK_1 ||
				graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_LIGHTNING_ATTACK_2 ||
				graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_FIRE_ATTACK;
	}

	WorldPoint getChemicalPoolWorldPointForPhase()
	{
		switch (currentHydraPhase)
		{
			case GREEN:
				return new WorldPoint(1371, 10263, 0);
			case BLUE:
				return new WorldPoint(1371, 10272, 0);
			case RED:
				return new WorldPoint(1362, 10272, 0);
			case JAD:
				return null;
			default:
				log.warn("Unreachable default case for getChemicalPoolWorldPointForPhase");
				return null;
		}
	}
}
