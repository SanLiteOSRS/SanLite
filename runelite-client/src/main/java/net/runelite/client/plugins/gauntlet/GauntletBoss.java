package net.runelite.client.plugins.gauntlet;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.ProjectileID;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class GauntletBoss
{
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
		this.crystalEffects = new ArrayList<>();
	}

	boolean isGauntletBossRangedAttack(int projectileId)
	{
		return projectileId == ProjectileID.GAUNTLET_BOSS_RANGED ||
				projectileId == ProjectileID.CORRUPTED_GAUNTLET_BOSS_RANGED;
	}

	boolean isGauntletBossMagicAttack(int projectileId)
	{
		return projectileId == ProjectileID.GAUNTLET_BOSS_MAGIC ||
				projectileId == ProjectileID.GAUNTLET_BOSS_MAGIC_DISABLE_PRAYERS ||
				projectileId == ProjectileID.CORRUPTED_GAUNTLET_BOSS_MAGIC ||
				projectileId == ProjectileID.CORRUPTED_GAUNTLET_BOSS_MAGIC_DISABLE_PRAYERS;
	}

	boolean isNpcCrystalAttack(int npcId)
	{
		return npcId == NpcID.CRYSTALLINE_HUNLLEF_CRYSTAL || npcId == NpcID.CORRUPTED_HUNLLEF_CRYSTAL;
	}
}
