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
package net.runelite.client.plugins.areaofeffectindicators;

import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.util.TickUtil;
import net.runelite.client.util.TimerFormat;

import javax.inject.Inject;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class AreaOfEffectIndicatorsOverlay extends Overlay
{
	private Client client;
	private AreaOfEffectIndicatorsPlugin plugin;

	@Inject
	private AreaOfEffectIndicatorsConfig config;

	@Inject
	public AreaOfEffectIndicatorsOverlay(Client client, AreaOfEffectIndicatorsPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		List<AreaOfEffectProjectile> areaOfEffectProjectiles = plugin.getAreaOfEffectProjectiles();
		if (areaOfEffectProjectiles == null)
		{
			return null;
		}

		renderAreaOfEffectProjectiles(graphics, areaOfEffectProjectiles);
		return null;
	}

	private void renderAreaOfEffectProjectiles(Graphics2D graphics, List<AreaOfEffectProjectile> areaOfEffectProjectiles)
	{
		if (areaOfEffectProjectiles == null)
		{
			return;
		}

		for (AreaOfEffectProjectile projectile : areaOfEffectProjectiles)
		{
			if (projectile.getTargetPoint() == null)
			{
				continue;
			}

			if (projectile.getEndCycle() < client.getGameCycle())
			{
				areaOfEffectProjectiles.remove(projectile);
				continue;
			}

			Polygon polygon = Perspective.getCanvasTileAreaPoly(client, projectile.getTargetPoint(), projectile.getTileSize());
			if (polygon == null)
			{
				continue;
			}

			OverlayUtil.renderPolygon(graphics, polygon, projectile.getHighlightColor(), config.getTileMarkersLineSize().getSize());

			if (!config.displayRemainingProjectileDuration())
			{
				continue;
			}

			// Do not render text if there is another projectile hitting the target point before this one
			List<AreaOfEffectProjectile> filteredProjectiles = getSameTargetProjectiles(areaOfEffectProjectiles, projectile);
			if (!filteredProjectiles.isEmpty() && shouldSkipRenderText(filteredProjectiles, projectile))
			{
				continue;
			}

			String remainingCycles = TickUtil.convertTimerFormat(projectile.getEndCycle() - client.getGameCycle(), TimerFormat.SECONDS_MILLISECONDS);
			Point textPoint = Perspective.getCanvasTextLocation(client, graphics, projectile.getTargetPoint(), remainingCycles, 0);
			if (textPoint == null)
			{
				continue;
			}

			OverlayUtil.renderTextLocation(graphics, textPoint, remainingCycles, Color.WHITE);
		}
	}

	/**
	 * Get all projectiles that have the same target point and do not have the same end cycle.
	 *
	 * @param areaOfEffectProjectiles area of effect projectiles
	 * @param projectile              area of effect projectile to compare with
	 * @return filtered projectiles list
	 */
	private List<AreaOfEffectProjectile> getSameTargetProjectiles(List<AreaOfEffectProjectile> areaOfEffectProjectiles, AreaOfEffectProjectile projectile)
	{
		return areaOfEffectProjectiles.stream()
				.filter(x -> !x.equals(projectile) && x.getTargetPoint().equals(projectile.getTargetPoint()) &&
						x.getEndCycle() != projectile.getEndCycle())
				.collect(Collectors.toList());
	}

	private boolean shouldSkipRenderText(List<AreaOfEffectProjectile> areaOfEffectProjectiles, AreaOfEffectProjectile projectile)
	{
		return areaOfEffectProjectiles.stream()
				.allMatch(x -> x.getEndCycle() < projectile.getEndCycle());
	}
}
