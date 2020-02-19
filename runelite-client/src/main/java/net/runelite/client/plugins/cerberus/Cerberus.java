package net.runelite.client.plugins.cerberus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class Cerberus
{
	enum Attack
	{
		DEFAULT,
		TRIPLE,
		GHOSTS,
		LAVA
	}

	enum AttackStyle
	{
		MAGE,
		RANGE,
		MELEE
	}

	@Getter
	@RequiredArgsConstructor
	enum CerberusGhost
	{
		RANGE(NpcID.SUMMONED_SOUL, Skill.RANGED),
		MAGE(NpcID.SUMMONED_SOUL_5868, Skill.MAGIC),
		MELEE(NpcID.SUMMONED_SOUL_5869, Skill.ATTACK);

		private final int npcId;
		private final Skill type;
	}

	@Getter
	@Setter
	private NPC npc;

	@Getter
	@Setter
	private Attack nextAttack;

	@Getter
	private AttackStyle nextAttackStyle;

	@Getter
	@Setter
	private Attack currentAttack;

	@Getter
	@Setter
	private int attackCount;

	@Getter
	private int health;

	@Getter
	@Setter
	private int tripleAttackCount;

	@Getter
	@Setter
	private boolean tripleAttack;

	@Getter
	@Setter
	private boolean ghostsActive;

	@Getter
	@Setter
	private int ghostsCycleCount;

	@Getter
	private final List<NPC> ghosts = new ArrayList<>();

	Cerberus(NPC npc)
	{
		this.npc = npc;
		this.attackCount = 0;
		this.currentAttack = Attack.TRIPLE;
		this.tripleAttackCount = 0;
		this.tripleAttack = false;
		this.nextAttackStyle = AttackStyle.MAGE;
		this.ghostsCycleCount = 0;
	}

	boolean isCerberusAttack(int animID)
	{
		return animID == AnimationID.CERBERUS_MAGE || animID == AnimationID.CERBERUS_RANGE
				|| animID == AnimationID.CERBERUS_MELEE || animID == AnimationID.CERBERUS_GHOSTS
				|| animID == AnimationID.CERBERUS_LAVA;
	}

	boolean isCerberusGhost(int npcID)
	{
		return npcID == CerberusGhost.MAGE.getNpcId() ||
				npcID == CerberusGhost.MELEE.getNpcId() ||
				npcID == CerberusGhost.RANGE.getNpcId();
	}

	boolean isGhostProjectile(int projectileID)
	{
		return projectileID == ProjectileID.CERBERUS_GHOST_MAGE ||
				projectileID == ProjectileID.CERBERUS_GHOST_RANGE ||
				projectileID == ProjectileID.CERBERUS_GHOST_MELEE;
	}

	void setNextPrayer()
	{
		if (isGhostsActive())
		{
			if (getGhosts().get(ghostsCycleCount).getId() == CerberusGhost.MAGE.getNpcId())
			{
				nextAttackStyle = AttackStyle.MAGE;
			}
			else if (getGhosts().get(ghostsCycleCount).getId() == CerberusGhost.RANGE.getNpcId())
			{
				nextAttackStyle = AttackStyle.RANGE;
			}
			else if (getGhosts().get(ghostsCycleCount).getId() == CerberusGhost.MELEE.getNpcId())
			{
				nextAttackStyle = AttackStyle.MELEE;
			}
		}
		else if (currentAttack == Attack.DEFAULT)
		{
			nextAttackStyle = AttackStyle.MAGE;
		}
		else
		{
			switch (currentAttack)
			{
				case LAVA:
					nextAttackStyle = AttackStyle.MAGE;
					break;
				case TRIPLE:
					switch (tripleAttackCount)
					{
						case 0:
							nextAttackStyle = AttackStyle.MAGE;
							break;
						case 1:
							nextAttackStyle = AttackStyle.RANGE;
							break;
						case 2:
							nextAttackStyle = AttackStyle.MELEE;
							break;
					}
					break;
			}
		}
	}

	void checkGhostCycle()
	{
		if (ghostsCycleCount == 2)
		{
			ghostsCycleCount = 0;
			ghostsActive = false;
		}
	}

	void updateHealth()
	{
		final NPC cerberus = npc;
		final int lastMaxHealth = 600;


		int lastRatio = 0;
		int lastHealthScale = 0;
		if (cerberus.getHealth() > 0)
		{
			lastRatio = cerberus.getHealthRatio();
			lastHealthScale = cerberus.getHealth();

		}

		// Health bar
		if (lastRatio >= 0 && lastHealthScale > 0)
		{
			// This is the reverse of the calculation of healthRatio done by the server
			// which is: healthRatio = 1 + (healthScale - 1) * health / maxHealth (if health > 0, 0 otherwise)
			// It's able to recover the exact health if maxHealth <= healthScale.
			int health = 0;
			if (lastRatio > 0)
			{
				int minHealth = 1;
				int maxHealth;
				if (lastHealthScale > 1)
				{
					if (lastRatio > 1)
					{
						// This doesn't apply if healthRatio = 1, because of the special case in the server calculation that
						// health = 0 forces healthRatio = 0 instead of the expected healthRatio = 1
						minHealth = (lastMaxHealth * (lastRatio - 1) + lastHealthScale - 2) / (lastHealthScale - 1);
					}
					maxHealth = (lastMaxHealth * lastRatio - 1) / (lastHealthScale - 1);
					if (maxHealth > lastMaxHealth)
					{
						maxHealth = lastMaxHealth;
					}
				}
				else
				{
					// If healthScale is 1, healthRatio will always be 1 unless health = 0
					// so we know nothing about the upper limit except that it can't be higher than maxHealth
					maxHealth = lastMaxHealth;
				}
				// Take the average of min and max possible healths
				health = (minHealth + maxHealth + 1) / 2;
			}

			// Show both the hitpoint and percentage values if enabled in the config
			this.health = health;
		}
	}
}
