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
package net.runelite.client.plugins.alchemicalhydra;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayMenuEntry;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

import static net.runelite.api.MenuAction.RUNELITE_OVERLAY_CONFIG;
import static net.runelite.client.ui.overlay.OverlayManager.OPTION_CONFIGURE;

public class AlchemicalHydraDebugOverlay extends Overlay
{
	private final Client client;
	private final AlchemicalHydraPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	AlchemicalHydraDebugOverlay(Client client, AlchemicalHydraPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(260, 0));
		getMenuEntries().add(new OverlayMenuEntry(RUNELITE_OVERLAY_CONFIG, OPTION_CONFIGURE, "Alchemical Hydra debug overlay"));
		setPosition(OverlayPosition.TOP_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		panelComponent.getChildren().clear();

		AlchemicalHydra alchemicalHydra = plugin.getAlchemicalHydra();
		if (alchemicalHydra != null)
		{
			panelComponent.getChildren().add(TitleComponent.builder()
					.color(Color.GREEN)
					.text("Alchemical Hydra debug")
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Game tick")
					.right("" + client.getTickCount())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Phase")
					.right("" + alchemicalHydra.getCurrentPhase())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Current attack style")
					.right("" + alchemicalHydra.getCurrentAttackStyle())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last attack style")
					.right("" + alchemicalHydra.getLastAttackStyle())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Current special attack style")
					.right("" + alchemicalHydra.getCurrentSpecialAttackStyle())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Is weakened")
					.right("" + alchemicalHydra.isWeakened())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Attacks until switch")
					.right("" + alchemicalHydra.getAttacksUntilSwitch())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Attacks until special attack")
					.right("" + alchemicalHydra.getAttacksUntilSpecialAttack())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Next attack tick")
					.right("" + alchemicalHydra.getNextAttackTick())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last attack tick")
					.right("" + alchemicalHydra.getLastAttackTick())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last animation id")
					.right("" + alchemicalHydra.getLastAnimationId())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Number of AoE effects")
					.right("" + alchemicalHydra.getAoeEffects().size())
					.build());
		}

		ChemicalVents chemicalVents = plugin.getChemicalVents();
		if (chemicalVents != null)
		{
			panelComponent.getChildren().add(LineComponent.builder()
					.left("Chemical vent active")
					.right("" + chemicalVents.isChemicalVentsActive())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Next entity change tick")
					.right("" + chemicalVents.getNextVentEntityChangeTick())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Ticks till next vent active")
					.right("" + (chemicalVents.getNextVentEntityChangeTick() - client.getTickCount()))
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Number of chemical vents")
					.right("" + chemicalVents.getChemicalVents().size())
					.build());
		}
		return panelComponent.render(graphics);
	}
}
