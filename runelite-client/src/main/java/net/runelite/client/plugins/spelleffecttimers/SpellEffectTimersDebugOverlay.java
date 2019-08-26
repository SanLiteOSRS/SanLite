package net.runelite.client.plugins.spelleffecttimers;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class SpellEffectTimersDebugOverlay extends Overlay
{
	private final Client client;
	private final SpellEffectTimersPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:SS");

	@Inject
	SpellEffectTimersDebugOverlay(Client client, SpellEffectTimersPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(260, 0));
		setPosition(OverlayPosition.TOP_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (plugin.getSpellEffects() != null)
		{
			panelComponent.getChildren().clear();

			panelComponent.getChildren().add(TitleComponent.builder()
					.text("Spell Effect Timers debug")
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Game tick (600ms)")
					.right("" + client.getTickCount())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Client tick (20ms)")
					.right("" + client.getGameCycle())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("System time")
					.right("" + simpleDateFormat.format(new Date(System.currentTimeMillis())))
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Spell effects size")
					.right("" + plugin.getSpellEffects().size())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Local player interacting with")
					.right(client.getLocalPlayer().getInteracting() != null ? client.getLocalPlayer().getInteracting().getName() : "null")
					.build());

			return panelComponent.render(graphics);
		}
		return null;
	}
}
