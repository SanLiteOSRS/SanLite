/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
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
package net.sanlite.client.plugins.gauntlet;


import net.runelite.api.Client;
import net.runelite.api.NPCComposition;
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
		Gauntlet gauntlet = plugin.getGauntlet();
		if (gauntlet == null)
		{
			return null;
		}

		panelComponent.getChildren().clear();

		panelComponent.getChildren().add(TitleComponent.builder()
				.color(Color.CYAN.darker())
				.text("Gauntlet")
				.build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("Game tick")
				.right("" + client.getTickCount())
				.build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("Final room entered")
				.right("" + plugin.getGauntlet().isInBossRoom())
				.build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("Number of resource spots")
				.right("" + plugin.getGauntlet().getResourceSpots().size())
				.build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("Number of demi bosses visible")
				.right("" + plugin.getGauntlet().getDemiBosses().size())
				.build());

		GauntletBoss gauntletBoss = gauntlet.getBoss();
		if (gauntlet.getBoss() != null)
		{
			panelComponent.getChildren().add(TitleComponent.builder()
					.color(Color.RED.darker())
					.text("Boss")
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Current attack style")
					.right("" + gauntletBoss.getCurrentAttackStyle())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Current protected style")
					.right("" + gauntletBoss.getCurrentProtectionPrayer())
					.build());

			NPCComposition bossComposition = gauntletBoss.getNpc().getComposition();
			if (bossComposition != null)
			{
				panelComponent.getChildren().add(LineComponent.builder()
						.left("Real time protected style")
						.right("" + bossComposition.getOverheadIcon())
						.build());
			}

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Attacks until switch")
					.right("" + gauntletBoss.getAttacksUntilSwitch())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Attacks until overhead switch")
					.right("" + gauntletBoss.getAttacksUntilOverheadSwitch())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Next attack tick")
					.right("" + gauntletBoss.getNextAttackTick())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last attack tick")
					.right("" + gauntletBoss.getLastAttackTick())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last projectile")
					.right("" + gauntletBoss.getLastProjectileId())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last attack animation")
					.right("" + gauntletBoss.getLastAttackAnimationId())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Number of crystals")
					.right("" + gauntletBoss.getCrystals().size())
					.build());

			panelComponent.getChildren().add(TitleComponent.builder()
					.color(Color.ORANGE)
					.text("Player")
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last attacked style")
					.right("" + gauntletBoss.getLastAttackedStyle())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last attacked tick")
					.right("" + gauntletBoss.getLastAttackedTick())
					.build());
		}

		return panelComponent.render(graphics);
	}
}
