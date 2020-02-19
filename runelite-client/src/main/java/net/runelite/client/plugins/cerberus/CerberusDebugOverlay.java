package net.runelite.client.plugins.cerberus;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

public class CerberusDebugOverlay extends Overlay
{
	private final Client client;
	private final CerberusPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	CerberusDebugOverlay(Client client, CerberusPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(260, 0));
		setPosition(OverlayPosition.TOP_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Cerberus cerberus = plugin.getCerberus();
		if (plugin.validateInstanceAndNpc())
		{
			panelComponent.getChildren().clear();

			panelComponent.getChildren().add(TitleComponent.builder()
					.text("Cerberus debug")
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Game tick")
					.right("" + client.getTickCount())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Next Attack")
					.right("" + cerberus.getCurrentAttack())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Attack count")
					.right("" + cerberus.getAttackCount())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Cerberus HP")
					.right("" + cerberus.getHealth())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Ghosts List Size")
					.right("" + cerberus.getGhosts().size())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Ghosts Cycle Count")
					.right("" + cerberus.getGhostsCycleCount())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("NPC ID at list location 0")
					.right("" + cerberus.getGhosts().get(0).getId())
					.build());


			return panelComponent.render(graphics);
		}
		return null;
	}
}
