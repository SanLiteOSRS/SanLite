package net.sanlite.client.plugins.gauntlet;

import net.runelite.client.ui.overlay.OverlayMenuEntry;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.ComponentOrientation;
import net.runelite.client.ui.overlay.components.ImageComponent;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.sanlite.client.config.CounterOverlayLocation;

import javax.inject.Inject;
import java.awt.*;

import static net.runelite.api.MenuAction.RUNELITE_OVERLAY_CONFIG;
import static net.runelite.client.ui.overlay.OverlayManager.OPTION_CONFIGURE;

public class GauntletBossFixedAttackOverlay extends OverlayPanel
{
	private final GauntletPlugin plugin;
	private final GauntletConfig config;

	@Inject
	private GauntletBossFixedAttackOverlay(GauntletPlugin plugin, GauntletConfig config)
	{
		super(plugin);
		this.plugin = plugin;
		this.config = config;
		setPosition(OverlayPosition.BOTTOM_LEFT);
		panelComponent.setPreferredSize(new Dimension(50, 0));
		panelComponent.setOrientation(ComponentOrientation.HORIZONTAL);
		getMenuEntries().add(new OverlayMenuEntry(
				RUNELITE_OVERLAY_CONFIG, OPTION_CONFIGURE, "Gauntlet boss attack style overlay"));
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Gauntlet gauntlet = plugin.getGauntlet();
		if (gauntlet == null || !gauntlet.isInBossRoom())
		{
			return null;
		}

		boolean isAttackStyleFixedEnabled = config.getAttackStyleCounterLocation() == CounterOverlayLocation.ABOVE_HEAD;
		if ((!config.showAttackStyleCounter() || isAttackStyleFixedEnabled))
		{
			return null;
		}

		GauntletBoss boss = gauntlet.getBoss();
		if (boss != null && boss.getCurrentAttackStyle() != null)
		{
			renderAttackStyleCounter(boss);
		}

		return super.render(graphics);
	}

	private void renderAttackStyleCounter(GauntletBoss boss)
	{
		ImageComponent icon = new ImageComponent(plugin.getAttackStyleIcon(boss.getCurrentAttackStyle()));
		panelComponent.setBackgroundColor(config.getFixedAttackStyleOverlayColor());
		panelComponent.getChildren().add(icon);
		panelComponent.getChildren().add(LineComponent.builder()
				.rightColor(config.getAttackStyleCounterColor())
				.rightFont(new Font("RuneScape", config.getFontStyle().getFont(), config.getFontSize()))
				.right(String.valueOf(boss.getAttacksUntilSwitch()))
				.build());
	}
}
