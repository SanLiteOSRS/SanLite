package net.sanlite.client.plugins.cerberus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.sanlite.client.plugins.cerberus.id.AnimationID;
import net.sanlite.client.plugins.cerberus.id.GraphicID;
import net.sanlite.client.plugins.cerberus.id.ProjectileID;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
class Cerberus
{
	@Getter
	private final List<NPC> ghosts = new ArrayList<>();
	@Getter
	@Setter
	private NPC npc;
	@Getter
	private AttackStyle currentAttackStyle;
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
	@Setter
	private int timeOfLastAnimation;
	@Getter
	private List<GraphicsObject> poolsGraphicObjects = new ArrayList<>();

	Cerberus(NPC npc)
	{
		this.npc = npc;
		this.attackCount = 1;
		this.currentAttack = Attack.TRIPLE;
		this.tripleAttackCount = 0;
		this.tripleAttack = false;
		this.currentAttackStyle = AttackStyle.MAGE;
		this.ghostsCycleCount = 0;
		this.timeOfLastAnimation = 0;
	}

	boolean isCerberusAttack(int animID)
	{
		return animID == AnimationID.CERBERUS_MAGIC_ATTACK || animID == AnimationID.CERBERUS_RANGED_ATTACK ||
				animID == AnimationID.CERBERUS_MELEE_ATTACK || animID == AnimationID.CERBERUS_LAVA_ATTACK ||
				animID == AnimationID.CERBERUS_SUMMON_GHOSTS;
	}

	boolean isCerberusGhost(int npcID)
	{
		return npcID == CerberusGhost.MAGE.getNpcId() || npcID == CerberusGhost.MELEE.getNpcId() ||
				npcID == CerberusGhost.RANGE.getNpcId();
	}

	boolean isGhostProjectile(int projectileID)
	{
		return projectileID == ProjectileID.CERBERUS_GHOST_MAGE || projectileID == ProjectileID.CERBERUS_GHOST_RANGE ||
				projectileID == ProjectileID.CERBERUS_GHOST_MELEE;
	}

	boolean isGhostsOverheadText()
	{
		boolean result = false;
		if (npc.getOverheadText() != null)
		{
			if (npc.getOverheadText().equals("Aaarrrooooooo"))
			{
				result = true;
			}
		}
		return result;
	}

	boolean isCerberusProjectile(int projectileID)
	{
		return projectileID == ProjectileID.CERBERUS_MAGE || projectileID == ProjectileID.CERBERUS_RANGE;
	}

	boolean isPoolGraphicsObject(int graphicsID)
	{
		return graphicsID == GraphicID.CERBERUS_LAVA_POOL;
	}

	boolean isValidCerberusAttack(int clientTick)
	{
		return (clientTick - timeOfLastAnimation) >= 170 || isTripleAttack();
	}

	void setNextPrayer()
	{
		if (ghostsActive && !ghosts.isEmpty())
		{
			if (ghosts.get(ghostsCycleCount - 1).getId() == CerberusGhost.MAGE.getNpcId())
			{
				currentAttackStyle = AttackStyle.MAGE;
			}
			else if (ghosts.get(ghostsCycleCount - 1).getId() == CerberusGhost.RANGE.getNpcId())
			{
				currentAttackStyle = AttackStyle.RANGE;
			}
			else if (ghosts.get(ghostsCycleCount - 1).getId() == CerberusGhost.MELEE.getNpcId())
			{
				currentAttackStyle = AttackStyle.MELEE;
			}
		}
		else if (currentAttack == Attack.DEFAULT)
		{
			currentAttackStyle = AttackStyle.MAGE;
		}
		else
		{
			switch (currentAttack)
			{
				case LAVA:
					currentAttackStyle = AttackStyle.MAGE;
					break;
				case TRIPLE:
					switch (tripleAttackCount)
					{
						case 0:
							currentAttackStyle = AttackStyle.MAGE;
							break;
						case 1:
							currentAttackStyle = AttackStyle.RANGE;
							break;
						case 2:
							currentAttackStyle = AttackStyle.MELEE;
							break;
					}
					break;
			}
		}
	}

	void checkGhostCycle()
	{
		if (ghostsCycleCount == 4)
		{
			ghostsCycleCount = 0;
			ghostsActive = false;
		}
	}

	void checkPoolSpawns(Deque<GraphicsObject> graphicsObjects)
	{
		poolsGraphicObjects = StreamSupport
				.stream(graphicsObjects.spliterator(), false)
				.filter(graphicsObject -> isPoolGraphicsObject(graphicsObject.getId()))
				.collect(Collectors.toList());
	}

	void updateHealth()
	{
		final NPC cerberus = npc;
		final int lastMaxHealth = 600;

		int lastRatio = 0;
		int lastHealthScale = 0;
		if (cerberus.getHealthScale() > 0)
		{
			lastRatio = cerberus.getHealthRatio();
			lastHealthScale = cerberus.getHealthScale();

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
}
