package net.sanlite.client.plugins.gauntlet.id;

import lombok.extern.slf4j.Slf4j;
import net.sanlite.client.plugins.gauntlet.GauntletBoss;

@Slf4j
public final class GauntletPlayerId
{
	public static boolean isPlayerAttack(int animationId)
	{
		return isRangedAttack(animationId) || isMagicAttack(animationId) || isMeleeAttack(animationId);
	}

	public static boolean isRangedAttack(int animationId)
	{
		return animationId == Anim.BOW_ATTACK;
	}

	public static boolean isMagicAttack(int animationId)
	{
		return animationId == Anim.STAFF_ATTACK;
	}

	public static boolean isMeleeAttack(int animationId)
	{
		return animationId == Anim.HALBERD_ATTACK ||
				animationId == Anim.SCEPTRE_ATTACK ||
				animationId == Anim.PUNCH_ATTACK ||
				animationId == Anim.KICK_ATTACK;
	}

	public static GauntletBoss.ProtectionPrayer getProtectedStyleForAnimation(int animationId)
	{
		switch (animationId)
		{
			case Anim.BOW_ATTACK:
				return GauntletBoss.ProtectionPrayer.RANGED;
			case Anim.HALBERD_ATTACK:
			case Anim.SCEPTRE_ATTACK:
			case Anim.PUNCH_ATTACK:
			case Anim.KICK_ATTACK:
				return GauntletBoss.ProtectionPrayer.MELEE;
			case Anim.STAFF_ATTACK:
				return GauntletBoss.ProtectionPrayer.MAGIC;
			default:
				log.warn("Could not determine gauntlet player protected style. Animation id: {}", animationId);
				return null;
		}
	}

	public static class Anim
	{
		public static final int PUNCH_ATTACK = 422;
		public static final int KICK_ATTACK = 423;
		public static final int SCEPTRE_ATTACK = 401;
		public static final int BOW_ATTACK = 426;
		public static final int HALBERD_ATTACK = 440;
		public static final int STAFF_ATTACK = 1167;
		public static final int DEATH = 836;
	}
}
