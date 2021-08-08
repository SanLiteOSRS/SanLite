package net.sanlite.client.plugins.gauntlet.id;

public final class GauntletBossId
{
	public static boolean isRangedAttack(int projectileId)
	{
		return projectileId == Proj.RANGED || projectileId == Proj.CORRUPTED_RANGED;
	}

	public static boolean isMagicAttack(int projectileId)
	{
		return projectileId == Proj.MAGIC ||
				projectileId == Proj.DISABLE_PRAYER ||
				projectileId == Proj.CORRUPTED_MAGIC ||
				projectileId == Proj.CORRUPTED_DISABLE_PRAYER;
	}

	public static boolean isCrystalNpc(int npcId)
	{
		return npcId == NPC.CRYSTAL || npcId == NPC.CORRUPTED_CRYSTAL;
	}

	public static class Proj
	{
		public static final int MAGIC = 1707;
		public static final int RANGED = 1711;
		public static final int DISABLE_PRAYER = 1713;

		public static final int CORRUPTED_MAGIC = 1708;
		public static final int CORRUPTED_RANGED = 1712;
		public static final int CORRUPTED_DISABLE_PRAYER = 1714;
	}

	public static class Anim
	{
		public static final int SUMMON_CRYSTAL_NPC = 8418;
		public static final int PROJECTILE_ATTACK = 8419;
		public static final int TRAMPLE_ATTACK = 8420;
		public static final int SWITCH_TO_MAGIC = 8754;
		public static final int SWITCH_TO_RANGED = 8755;
	}

	public static class NPC
	{
		public static final int CRYSTAL = 9025;
		public static final int CORRUPTED_CRYSTAL = 9039;
	}
}
