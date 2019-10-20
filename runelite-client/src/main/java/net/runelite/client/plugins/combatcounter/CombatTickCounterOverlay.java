package net.runelite.client.plugins.combatcounter;

import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayMenuEntry;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.runelite.client.ui.overlay.components.table.TableAlignment;
import net.runelite.client.ui.overlay.components.table.TableComponent;
import net.runelite.client.util.ColorUtil;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.util.Map;

import static net.runelite.api.MenuAction.RUNELITE_OVERLAY_CONFIG;
import static net.runelite.client.ui.overlay.OverlayManager.OPTION_CONFIGURE;

@Singleton
class CombatTickCounterOverlay extends Overlay
{
	private final Client client;
	private final CombatTickCounterPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	public CombatTickCounterOverlay(final Client client, final CombatTickCounterPlugin plugin)
	{
		super(plugin);

		setPosition(OverlayPosition.DYNAMIC);
		setPosition(OverlayPosition.DETACHED);
		setPosition(OverlayPosition.BOTTOM_RIGHT);

		this.client = client;
		this.plugin = plugin;

		getMenuEntries().add(new OverlayMenuEntry(RUNELITE_OVERLAY_CONFIG, OPTION_CONFIGURE, "Combat Tick Counter"));
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (plugin.isShowTickCounter())
		{
			panelComponent.getChildren().clear();

			Player local = client.getLocalPlayer();
			if (local == null || local.getName() == null)
			{
				return null;
			}
			panelComponent.setBackgroundColor(plugin.getBgColor());
			panelComponent.getChildren().add(TitleComponent.builder().text("Combat Tick Counter").color(plugin.getTitleColor()).build());
			int total = 0;

			TableComponent tableComponent = new TableComponent();
			tableComponent.setColumnAlignments(TableAlignment.LEFT, TableAlignment.RIGHT);

			if (plugin.getCounter().isEmpty())
			{
				tableComponent.addRow(local.getName(), "0");
			}
			else
			{
				Map<String, Long> map = this.plugin.getCounter();
				if (map == null)
				{
					return null;
				}

				for (Map.Entry<String, Long> counter : map.entrySet())
				{
					String name = counter.getKey();
					if (client.getLocalPlayer().getName().contains(name))
					{
						tableComponent.addRow(ColorUtil.prependColorTag(name, plugin.getSelfColor()), ColorUtil.prependColorTag(Long.toString(counter.getValue()), plugin.getSelfColor()));
					}
					else
					{
						tableComponent.addRow(ColorUtil.prependColorTag(name, plugin.getOtherColor()), ColorUtil.prependColorTag(Long.toString(counter.getValue()), plugin.getOtherColor()));
					}
					total += counter.getValue();
				}

				if (!map.containsKey(local.getName()))
				{
					tableComponent.addRow(ColorUtil.prependColorTag(local.getName(), plugin.getSelfColor()), ColorUtil.prependColorTag("0", plugin.getSelfColor()));
				}
			}

			tableComponent.addRow(ColorUtil.prependColorTag("Total", plugin.getTotalColor()), ColorUtil.prependColorTag(String.valueOf(total), plugin.getTotalColor()));

			if (!tableComponent.isEmpty())
			{
				panelComponent.getChildren().add(tableComponent);
			}

			return panelComponent.render(graphics);
		}
		else
		{
			return null;
		}
	}
}