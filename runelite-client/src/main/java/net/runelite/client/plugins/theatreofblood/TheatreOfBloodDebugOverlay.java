/*
 * Copyright (c) 2019, Siraz
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.theatreofblood;

import net.runelite.api.Client;
import net.runelite.client.plugins.theatreofblood.encounters.Nylocas;
import net.runelite.client.plugins.theatreofblood.encounters.PestilentBloat;
import net.runelite.client.plugins.theatreofblood.encounters.Sotetseg;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

public class TheatreOfBloodDebugOverlay extends Overlay
{
	private final Client client;
	private final TheatreOfBloodPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	TheatreOfBloodDebugOverlay(Client client, TheatreOfBloodPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(300, 0));
		setPosition(OverlayPosition.TOP_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (plugin.getCurrentEncounter() != null)
		{
			panelComponent.getChildren().clear();

			panelComponent.getChildren().add(TitleComponent.builder()
					.text("Theatre of Blood debug")
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Game tick")
					.right("" + client.getTickCount())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Current encounter")
					.right("" + plugin.getCurrentEncounter().getEncounter())
					.build());

			if (plugin.getCurrentEncounter().getNpc() != null)
			{
				panelComponent.getChildren().add(LineComponent.builder()
						.left("Current encounter npc")
						.right("" + plugin.getCurrentEncounter().getNpc().getName())
						.build());
			}

			if (plugin.getCurrentEncounter().getAoeEffects() != null)
			{
				panelComponent.getChildren().add(LineComponent.builder()
						.left("Number of AoE effects")
						.right("" + plugin.getCurrentEncounter().getAoeEffects().size())
						.build());
			}

			if (plugin.getCurrentEncounter().getGameObjects() != null)
			{
				panelComponent.getChildren().add(LineComponent.builder()
						.left("Number of encounter game objects")
						.right("" + plugin.getCurrentEncounter().getGameObjects().size())
						.build());
			}

			switch (plugin.getCurrentEncounter().getEncounter())
			{
				case PESTILENT_BLOAT:
					PestilentBloat pestilentBloat = (PestilentBloat) plugin.getCurrentEncounter();
					panelComponent.getChildren().add(LineComponent.builder()
							.left("Remaining sleep client ticks")
							.right("" + pestilentBloat.getRemainingSleepClientTicks())
							.build());
					break;
				case NYLOCAS:
					Nylocas nylocas = (Nylocas) plugin.getCurrentEncounter();
					panelComponent.getChildren().add(LineComponent.builder()
							.left("Number of npcs")
							.right("" + client.getNpcs().size())
							.build());
					panelComponent.getChildren().add(LineComponent.builder()
							.left("Number of highlighted Nylocas npcs")
							.right("" + nylocas.getHighlightedNylocasNpcs().size())
							.build());
					break;
				case SOTETSEG:
					Sotetseg sotetseg = (Sotetseg) plugin.getCurrentEncounter();
					panelComponent.getChildren().add(LineComponent.builder()
							.left("Maze Active")
							.right("" + sotetseg.isMazeActive())
							.build());
					panelComponent.getChildren().add(LineComponent.builder()
							.left("Number of active red maze tiles")
							.right(sotetseg.getActiveMazeTiles() != null ? "" + sotetseg.getActiveMazeTiles().size() : "null")
							.build());
			}

			return panelComponent.render(graphics);
		}
		return null;
	}
}
