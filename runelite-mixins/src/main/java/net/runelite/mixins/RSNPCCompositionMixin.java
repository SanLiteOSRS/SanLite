package net.runelite.mixins;

import net.runelite.api.HeadIcon;

import net.runelite.api.events.NpcOverheadChanged;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSNPCComposition;

@Mixin(RSNPCComposition.class)
public abstract class RSNPCCompositionMixin implements RSNPCComposition
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private int oldOverheadIcon = -1;

	@Inject
	@Override
	public HeadIcon getOverheadIcon()
	{
		return getOverheadIcon(getRsOverheadIcon());
	}

	@Inject
	public HeadIcon getOverheadIcon(int headIcon)
	{
		switch (headIcon)
		{
			case 0:
				return HeadIcon.MELEE;
			case 1:
				return HeadIcon.RANGED;
			case 2:
				return HeadIcon.MAGIC;
			case 3:
				return HeadIcon.RETRIBUTION;
			case 4:
				return HeadIcon.SMITE;
			case 5:
				return HeadIcon.REDEMPTION;
			case 6:
				return HeadIcon.RANGE_MAGE;
			case 7:
				return HeadIcon.RANGE_MELEE;
			case 8:
				return HeadIcon.MAGE_MELEE;
			case 9:
				return HeadIcon.RANGE_MAGE_MELEE;
			case 10:
				return HeadIcon.WRATH;
			case 11:
				return HeadIcon.SOUL_SPLIT;
			case 12:
				return HeadIcon.DEFLECT_MELEE;
			case 13:
				return HeadIcon.DEFLECT_RANGE;
			case 14:
				return HeadIcon.DEFLECT_MAGE;
			case -1:
				return null;
			default:
				client.getLogger().warn("Could not determine NPC overhead icon: {}", headIcon);
				return null;
		}
	}

	@Inject
	@FieldHook("headIconPrayer")
	public void npcOverheadChanged(int idx)
	{
		if (getRsOverheadIcon() != oldOverheadIcon)
		{
			final HeadIcon headIcon = getOverheadIcon();
			client.getCallbacks().post(new NpcOverheadChanged(this, getOverheadIcon(oldOverheadIcon), headIcon));
		}

		oldOverheadIcon = getRsOverheadIcon();
	}
}
