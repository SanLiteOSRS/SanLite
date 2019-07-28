/*
 * Copyright (c) 2018, Matthew Steglinski <https://github.com/sainttx>
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
package net.runelite.client.plugins.gauntlet;


import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

public class GauntletDebugOverlay extends Overlay
{
	private final Client client;
	private final GauntletPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	GauntletDebugOverlay(Client client, GauntletPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(260, 0));
		setPosition(OverlayPosition.TOP_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (plugin.getGauntletBoss() != null)
		{
			panelComponent.getChildren().clear();

			panelComponent.getChildren().add(TitleComponent.builder()
					.text("Gauntlet boss debug")
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Game tick")
					.right("" + client.getTickCount())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Current attack style")
					.right("" + plugin.getGauntletBoss().getCurrentAttackStyle())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Attacks until switch")
					.right("" + plugin.getGauntletBoss().getAttacksUntilSwitch())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Next attack tick")
					.right("" + plugin.getGauntletBoss().getNextAttackTick())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last attack tick")
					.right("" + plugin.getGauntletBoss().getLastAttackTick())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Recent projectile id")
					.right("" + plugin.getGauntletBoss().getRecentProjectileId())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Remaining projectile count")
					.right("" + plugin.getGauntletBoss().getRemainingProjectileCount())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Number of AoE effects")
					.right("" + plugin.getGauntletBoss().getCrystalEffects().size())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Number of resource spots")
					.right("" + plugin.getResourceSpots().size())
					.build());

			return panelComponent.render(graphics);
		}
		return null;
	}
}
