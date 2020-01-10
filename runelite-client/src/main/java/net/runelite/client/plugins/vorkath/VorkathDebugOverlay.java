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
package net.runelite.client.plugins.vorkath;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

public class VorkathDebugOverlay extends Overlay
{
	private final Client client;
	private final VorkathPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	VorkathDebugOverlay(Client client, VorkathPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
		panelComponent.setPreferredSize(new Dimension(260, 0));
		setPosition(OverlayPosition.TOP_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Vorkath vorkath = plugin.getVorkath();
		if (vorkath != null)
		{
			panelComponent.getChildren().clear();

			panelComponent.getChildren().add(TitleComponent.builder()
					.text("Vorkath debug overlay")
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Game tick")
					.right("" + client.getTickCount())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Awake")
					.right("" + vorkath.isAwake())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Next special attack style")
					.right("" + vorkath.getNextSpecialAttackStyle())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Attacks until special attack")
					.right("" + vorkath.getAttacksUntilSpecialAttack())
					.build());

			if (vorkath.getNextAttackTick() != -100)
			{
				panelComponent.getChildren().add(LineComponent.builder()
						.left("Ticks till next attack")
						.right("" + (vorkath.getNextAttackTick() - client.getTickCount()))
						.build());
			}

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Next attack tick")
					.right("" + vorkath.getNextAttackTick())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Last attack tick")
					.right("" + vorkath.getLastAttackTick())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Recent projectile id")
					.right("" + vorkath.getRecentProjectileId())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Remaining acid phase attacks")
					.right("" + vorkath.getRemainingAcidPhaseAttacks())
					.build());

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Zombified spawn")
					.right("" + vorkath.getZombifiedSpawn())
					.build());

			if (vorkath.getGameObjects() != null)
			{
				panelComponent.getChildren().add(LineComponent.builder()
						.left("Number of encounter game objects")
						.right("" + vorkath.getGameObjects().size())
						.build());
			}

			if (vorkath.getGameObjects() != null)
			{
				panelComponent.getChildren().add(LineComponent.builder()
						.left("Number of active projectiles")
						.right("" + vorkath.getProjectiles().size())
						.build());
			}

			if (vorkath.getAcidPhasePathPoints() != null)
			{
				panelComponent.getChildren().add(LineComponent.builder()
						.left("Number of acid free path points")
						.right("" + vorkath.getAcidPhasePathPoints().size())
						.build());
			}

			return panelComponent.render(graphics);
		}
		return null;
	}
}
