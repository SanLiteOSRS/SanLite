package net.sanlite.client.plugins.areaofeffectindicators;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

public class AreaOfEffectIndicatorsDebugOverlay extends Overlay
{
	private final Client client;
	private final AreaOfEffectIndicatorsPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	AreaOfEffectIndicatorsDebugOverlay(Client client, AreaOfEffectIndicatorsPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(300, 0));
		setPosition(OverlayPosition.TOP_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		panelComponent.getChildren().clear();

		panelComponent.getChildren().add(TitleComponent.builder()
				.color(Color.BLUE.darker())
				.text("AoE indicators debug")
				.build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("Game tick")
				.right("" + client.getTickCount())
				.build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("AoE projectiles")
				.right("" + plugin.getAreaOfEffectProjectiles().size())
				.build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("AoE game objects")
				.right("" + plugin.getAreaOfEffectGameObjects().size())
				.build());

		return panelComponent.render(graphics);
	}
}
