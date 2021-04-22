package net.sanlite.client.plugins.alchemicalhydra;

import net.runelite.client.ui.overlay.OverlayMenuEntry;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.ComponentOrientation;
import net.runelite.client.ui.overlay.components.ImageComponent;
import net.runelite.client.ui.overlay.components.LineComponent;

import javax.inject.Inject;
import java.awt.*;

import static net.runelite.api.MenuAction.RUNELITE_OVERLAY_CONFIG;
import static net.runelite.client.ui.overlay.OverlayManager.OPTION_CONFIGURE;

public class FixedAttackStyleOverlay extends OverlayPanel
{
	private final AlchemicalHydraPlugin plugin;

	@Inject
	private FixedAttackStyleOverlay(AlchemicalHydraPlugin plugin)
	{
		super(plugin);
		this.plugin = plugin;
		setPosition(OverlayPosition.BOTTOM_RIGHT);
		panelComponent.setPreferredSize(new Dimension(140, 0));
		panelComponent.setOrientation(ComponentOrientation.HORIZONTAL);
		getMenuEntries().add(new OverlayMenuEntry(RUNELITE_OVERLAY_CONFIG, OPTION_CONFIGURE, "Alchemical Hydra overlay"));
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		AlchemicalHydra alchemicalHydra = plugin.getAlchemicalHydra();
		if (alchemicalHydra == null || alchemicalHydra.getCurrentAttackStyle() == null)
			return null;

		if (alchemicalHydra.getCurrentSpecialAttackStyle() != null)
			panelComponent.getChildren().add(
					new ImageComponent(plugin.getAttackStyleIcon(alchemicalHydra.getCurrentSpecialAttackStyle())));

		int attacksLeft = !alchemicalHydra.getCurrentPhase().equals(AlchemicalHydra.Phase.JAD) ?
				alchemicalHydra.getAttacksUntilSwitch() : 1;

		panelComponent.getChildren().add(new ImageComponent(plugin.getAttackStyleIcon(alchemicalHydra.getCurrentAttackStyle())));
		panelComponent.getChildren().add(LineComponent.builder()
				.rightColor(Color.YELLOW)
				.right(Integer.toString(attacksLeft))
				.build());
		return super.render(graphics);
	}
}
