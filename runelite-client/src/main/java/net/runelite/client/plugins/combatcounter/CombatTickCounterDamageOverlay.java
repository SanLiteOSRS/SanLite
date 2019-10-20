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
class CombatTickCounterDamageOverlay extends Overlay
{
	private final Client client;

	private final CombatTickCounterPlugin plugin;

	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	public CombatTickCounterDamageOverlay(final Client client, final CombatTickCounterPlugin plugin)
	{
		super(plugin);

		setPosition(OverlayPosition.DYNAMIC);
		setPosition(OverlayPosition.DETACHED);
		setPosition(OverlayPosition.BOTTOM_RIGHT);

		this.client = client;
		this.plugin = plugin;

		getMenuEntries().add(new OverlayMenuEntry(RUNELITE_OVERLAY_CONFIG, OPTION_CONFIGURE, "Damage Counter Overlay"));
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (plugin.isShowDamageCounter())
		{
			panelComponent.getChildren().clear();

			Player local = client.getLocalPlayer();
			if (local == null || local.getName() == null)
			{
				return null;
			}
			panelComponent.setBackgroundColor(plugin.getBgColor());
			panelComponent.getChildren().add(TitleComponent.builder().text("Damage Counter").color(plugin.getTitleColor()).build());

			TableComponent tableComponent = new TableComponent();
			tableComponent.setColumnAlignments(TableAlignment.LEFT, TableAlignment.RIGHT);

			if (plugin.getCounter().isEmpty())
			{
				tableComponent.addRow(local.getName(), "0");
			}
			else
			{
				Map<String, Double> map = this.plugin.playerDamage;
				if (map == null)
				{
					return null;
				}

				for (Map.Entry<String, Double> damage : map.entrySet())
				{
					String val = String.format("%.1f", damage.getValue());
					if (client.getLocalPlayer().getName().contains(damage.getKey()))
					{
						tableComponent.addRow(ColorUtil.prependColorTag(damage.getKey(), plugin.getSelfColor()), ColorUtil.prependColorTag(val, plugin.getSelfColor()));
					}
					else
					{
						tableComponent.addRow(ColorUtil.prependColorTag(damage.getKey(), plugin.getOtherColor()), ColorUtil.prependColorTag(val, plugin.getOtherColor()));
					}
				}

				if (!map.containsKey(local.getName()))
				{
					tableComponent.addRow(ColorUtil.prependColorTag(local.getName(), plugin.getSelfColor()), ColorUtil.prependColorTag("0", plugin.getSelfColor()));
				}
			}

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