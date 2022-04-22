package net.runelite.mixins;

import net.runelite.api.MenuAction;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.widgets.Widget;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSRuneLiteMenuEntry;

@Mixin(RSRuneLiteMenuEntry.class)
public abstract class RuneLiteMenuEntryMixin implements RSRuneLiteMenuEntry
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public int getItemId()
	{
		MenuAction menuAction = this.getType();
		if (menuAction == MenuAction.CC_OP || menuAction == MenuAction.CC_OP_LOW_PRIORITY)
		{
			int param1 = this.getParam1();
			int param0 = this.getParam0();
			if (param1 == 9764864)
			{
				Widget widget = client.getWidget(param1);
				if (widget != null && param0 != -1)
				{
					widget = widget.getChild(param0);
					if (widget != null)
					{
						return widget.getItemId();
					}
				}
			}
		}

		return -1;
	}

	@Inject
	@Override
	public Widget getWidget()
	{
		int param1 = this.getParam1();
		int param0 = this.getParam0();

		Widget widget = client.getWidget(param1);
		if (widget == null)
		{
			return null;
		}

		if (param0 != -1)
		{
			Widget child = widget.getChild(param0);
			if (child != null)
			{
				return child;
			}
		}

		return widget;
	}
}
