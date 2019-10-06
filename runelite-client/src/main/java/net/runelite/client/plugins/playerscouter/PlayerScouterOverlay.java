package net.runelite.client.plugins.playerscouter;

import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import javax.inject.Inject;
import java.awt.*;

public class PlayerScouterOverlay extends Overlay
{
	private final PlayerScouterPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	PlayerScouterOverlay(PlayerScouterPlugin plugin)
	{
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(260, 0));
		setPosition(OverlayPosition.TOP_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		panelComponent.getChildren().clear();

		panelComponent.getChildren().add(TitleComponent.builder()
				.text("Player Scouter")
				.build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("Number of times spotted:")
				.right(" " + plugin.getSeenCounter())
				.build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("Time last spotted (local time):")
				.right(" " + plugin.getLastSeen())
				.build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("Currently spotted:")
				.right(" " + plugin.isSpotted())
				.build());

		return panelComponent.render(graphics);

	}
}
