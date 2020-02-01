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
package net.runelite.client.plugins.transmog;

import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

public class TransmogDebugOverlay extends Overlay
{
	private final Client client;
	private final PanelComponent panelComponent = new PanelComponent();
	private final TransmogPlugin plugin;

	@Inject
	TransmogDebugOverlay(Client client, TransmogPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(110, 0));
		setPosition(OverlayPosition.BOTTOM_RIGHT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		panelComponent.getChildren().clear();

		panelComponent.getChildren().add(TitleComponent.builder()
				.text("Transmog debug")
				.build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("Game tick")
				.right("" + client.getTickCount())
				.build());

		Player player = client.getLocalPlayer();
		if (player != null)
		{
			int[] equipmentIds = player.getPlayerAppearance().getEquipmentIds();

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Helmet")
					.right("" + equipmentIds[0])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Cape")
					.right("" + equipmentIds[1])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Amulet")
					.right("" + equipmentIds[2])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Weapon")
					.right("" + equipmentIds[3])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Torso")
					.right("" + equipmentIds[4])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Shield")
					.right("" + equipmentIds[5])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Arms")
					.right("" + equipmentIds[6])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Legs")
					.right("" + equipmentIds[7])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Hair")
					.right("" + equipmentIds[8])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Hands")
					.right("" + equipmentIds[9])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Boots")
					.right("" + equipmentIds[10])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Jaw")
					.right("" + equipmentIds[11])
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Current set active")
					.right("" + plugin.isCurrentEquipmentSetActive())
					.build());

			EquipmentSet equipmentSet = plugin.getCurrentEquipmentSet();
			if (equipmentSet != null)
			{
				panelComponent.getChildren().add(LineComponent.builder()
						.left("Display jaw")
						.right("" + equipmentSet.isJawEnabled())
						.build());

				panelComponent.getChildren().add(LineComponent.builder()
						.left("Display head")
						.right("" + equipmentSet.isHeadEnabled())
						.build());

				panelComponent.getChildren().add(LineComponent.builder()
						.left("Display arms")
						.right("" + equipmentSet.isArmsEnabled())
						.build());

				panelComponent.getChildren().add(LineComponent.builder()
						.left("Display hands")
						.right("" + equipmentSet.isHandsEnabled())
						.build());
			}
		}

		return panelComponent.render(graphics);
	}
}
