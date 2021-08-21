package net.sanlite.client.plugins.gauntlet.id;

import net.runelite.api.NpcID;

public class GauntletNpc
{
	/**
	 * Checks if the npc id is a gauntlet demi boss that drops a tier 3 weapon upgrade.
	 *
	 * @param npcId npc id
	 * @return if npc is a gauntlet demi boss
	 */
	public static boolean isDemiBoss(int npcId)
	{
		return isRangedDemiBoss(npcId) || isMagicDemiBoss(npcId) || isMeleeDemiBoss(npcId);
	}

	public static boolean isRangedDemiBoss(int npcId)
	{
		return npcId == NpcID.CRYSTALLINE_DARK_BEAST || npcId == NpcID.CORRUPTED_DARK_BEAST;
	}

	public static boolean isMagicDemiBoss(int npcId)
	{
		return npcId == NpcID.CRYSTALLINE_DRAGON || npcId == NpcID.CORRUPTED_DRAGON;
	}

	public static boolean isMeleeDemiBoss(int npcId)
	{
		return npcId == NpcID.CRYSTALLINE_BEAR || npcId == NpcID.CORRUPTED_BEAR;
	}
}
