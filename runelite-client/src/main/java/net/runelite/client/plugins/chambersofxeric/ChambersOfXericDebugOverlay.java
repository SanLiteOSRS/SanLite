/*
 * Copyright (c) 2020, Siraz <https://github.com/Sirazzz>
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
package net.runelite.client.plugins.chambersofxeric;

import net.runelite.api.Client;
import net.runelite.client.plugins.theatreofblood.encounters.*;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

public class ChambersOfXericDebugOverlay extends Overlay
{
	private final Client client;
	private final ChambersOfXericPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	ChambersOfXericDebugOverlay(Client client, ChambersOfXericPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(300, 0));
		setPosition(OverlayPosition.TOP_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (plugin.isInChambersOfXeric())
		{
			panelComponent.getChildren().clear();

			panelComponent.getChildren().add(TitleComponent.builder()
					.text("Chambers of Xeric debug")
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Game tick")
					.right("" + client.getTickCount())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Client Tick")
					.right("" + client.getGameCycle())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("In Chambers of Xeric")
					.right("" + plugin.isInChambersOfXeric())
					.build());

			if (plugin.getCurrentEncounter() != null)
			{
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
							.left("Number of graphics objects")
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
			}
			return panelComponent.render(graphics);
		}
		return null;
	}
}
