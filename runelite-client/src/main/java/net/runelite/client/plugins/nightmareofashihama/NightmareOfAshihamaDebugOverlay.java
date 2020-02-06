package net.runelite.client.plugins.nightmareofashihama;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

public class NightmareOfAshihamaDebugOverlay extends Overlay
{
	private final Client client;
	private final NightmareOfAshihamaPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	NightmareOfAshihamaDebugOverlay(Client client, NightmareOfAshihamaPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(260, 0));
		setPosition(OverlayPosition.TOP_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		panelComponent.getChildren().clear();

		NightmareOfAshihama nightmare = plugin.getNightmare();
		if (nightmare != null)
		{
			panelComponent.getChildren().add(TitleComponent.builder()
					.text("Nightmare of Ashihama debug")
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Game tick")
					.right("" + client.getTickCount())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Phase")
					.right("" + nightmare.getCurrentPhase())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Current attack style")
					.right("" + nightmare.getCurrentAttackStyle())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last attack style")
					.right("" + nightmare.getLastAttackStyle())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Next attack tick")
					.right("" + nightmare.getNextAttackTick())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last attack tick")
					.right("" + nightmare.getLastAttackTick())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last animation id")
					.right("" + nightmare.getLastAnimationId())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Number of active totems")
					.right("" + nightmare.getActiveTotems().size())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Number of graphic effects")
					.right("" + nightmare.getGraphicObjects().size())
					.build());
		}
		return panelComponent.render(graphics);
	}
}
