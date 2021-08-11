package net.runelite.mixins;

import net.runelite.api.HeadIcon;

import static net.runelite.api.HeadIcon.MAGIC;
import static net.runelite.api.HeadIcon.MELEE;
import static net.runelite.api.HeadIcon.RANGED;
import static net.runelite.api.HeadIcon.RANGE_MAGE;

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
		switch (getRsOverheadIcon())
		{
			case 0:
				return MELEE;
			case 1:
				return RANGED;
			case 2:
				return MAGIC;
			case 6:
				return RANGE_MAGE;
			default:
				return null;
		}
	}

	@Inject
	public HeadIcon getOverheadIcon(int headIcon)
	{
		switch (headIcon)
		{
			case 0:
				return MELEE;
			case 1:
				return RANGED;
			case 2:
				return MAGIC;
			case 6:
				return RANGE_MAGE;
			default:
				return null;
		}
	}

	@Inject
	@FieldHook("headIconPrayer")
	public void overheadChanged(int idx)
	{
		if (getRsOverheadIcon() != oldOverheadIcon)
		{
			final HeadIcon headIcon = getOverheadIcon();
			client.getCallbacks().post(new NpcOverheadChanged(this, getOverheadIcon(oldOverheadIcon), headIcon));
		}

		oldOverheadIcon = getRsOverheadIcon();
	}
}
