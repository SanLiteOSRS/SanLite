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
		if (plugin.isEncounter())
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
					.right("" + plugin.getNextAttack())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Attack count")
					.right("" + plugin.getAttackCount())
					.build());


			return panelComponent.render(graphics);
		}
		return null;
	}
}
