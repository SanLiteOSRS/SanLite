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
package net.sanlite.client.plugins.areaofeffectindicators;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.sanlite.client.config.TimerFormat;
import net.sanlite.client.ui.overlay.OverlayUtil2;
import net.sanlite.client.util.TickUtil;

import javax.inject.Inject;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class AreaOfEffectIndicatorsOverlay extends Overlay
{
	private final Client client;
	private final AreaOfEffectIndicatorsPlugin plugin;

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
		renderAreaOfEffectProjectiles(graphics, plugin.getAreaOfEffectProjectiles());
		renderAreaOfEffectGameObjects(graphics, plugin.getAreaOfEffectGameObjects());
		renderAreaOfEffectGraphicsObjects(graphics, plugin.getAreaOfEffectGraphicsObjects());
		return null;
	}

	private void renderAreaOfEffectProjectiles(Graphics2D graphics, List<AreaOfEffectProjectile> areaOfEffectProjectiles)
	{
		if (areaOfEffectProjectiles == null)
		{
			return;
		}

		for (AreaOfEffectProjectile aoeProjectile : areaOfEffectProjectiles)
		{
			if (aoeProjectile.getTargetPoint() == null)
			{
				continue;
			}

			AreaOfEffectConfig.AoeProjectileInfo projectileInfo = plugin.getAoeConfig().getProjectiles().get(aoeProjectile.getProjectile().getId());
			Polygon polygon = Perspective.getCanvasTileAreaPoly(client, aoeProjectile.getTargetPoint(), projectileInfo.getTileSize());
			if (polygon == null)
			{
				continue;
			}

			OverlayUtil2.renderPolygon(graphics, polygon, projectileInfo.getColor(), config.borderWidth());

			if (!config.displayRemainingDuration())
			{
				continue;
			}

			// Do not render text if there is another projectile hitting the target point before this one
			List<AreaOfEffectProjectile> filteredProjectiles = getSameTargetProjectiles(areaOfEffectProjectiles, aoeProjectile);
			if (!filteredProjectiles.isEmpty() && shouldSkipRenderText(filteredProjectiles, aoeProjectile))
			{
				continue;
			}

			String remainingCycles = TickUtil.convertTimerFormat(aoeProjectile.getEndCycle() - client.getGameCycle(), TimerFormat.SECONDS_MILLISECONDS);
			Point textPoint = Perspective.getCanvasTextLocation(client, graphics, aoeProjectile.getTargetPoint(), remainingCycles, 0);
			if (textPoint == null)
			{
				continue;
			}

			OverlayUtil.renderTextLocation(graphics, textPoint, remainingCycles, Color.WHITE);
		}
	}

	private void renderAreaOfEffectGameObjects(Graphics2D graphics, List<AreaOfEffectGameObject> areaOfEffectGameObjects)
	{
		if (areaOfEffectGameObjects == null)
		{
			return;
		}

		for (AreaOfEffectGameObject object : areaOfEffectGameObjects)
		{
			LocalPoint localPoint = object.getGameObject().getLocalLocation();
			AreaOfEffectConfig.AoeObjectInfo objectInfo = plugin.getAoeConfig().getGameObjects().get(object.getGameObject().getId());

			int tileSize = objectInfo.getTileSize();
			Polygon polygon = Perspective.getCanvasTileAreaPoly(client, localPoint, tileSize);
			if (polygon == null)
			{
				continue;
			}

			OverlayUtil2.renderPolygon(graphics, polygon, objectInfo.getColor(), config.borderWidth());

			if (!config.displayRemainingDuration())
			{
				continue;
			}

			String remainingTicks = Integer.toString(object.getDespawnTick() - client.getTickCount());
			Point textPoint = Perspective.getCanvasTextLocation(client, graphics, localPoint, remainingTicks, 0);
			if (textPoint == null)
			{
				continue;
			}

			OverlayUtil.renderTextLocation(graphics, textPoint, remainingTicks, Color.WHITE);
		}
	}

	private void renderAreaOfEffectGraphicsObjects(Graphics2D graphics, List<AreaOfEffectGraphicsObject> areaOfEffectGraphicsObjects)
	{
		if (areaOfEffectGraphicsObjects == null)
		{
			return;
		}

		for (AreaOfEffectGraphicsObject object : areaOfEffectGraphicsObjects)
		{
			GraphicsObject graphicsObject = object.getGraphicsObject();
			LocalPoint localPoint = graphicsObject.getLocation();
			if (localPoint == null)
			{
				continue;
			}

			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);
			if (polygon == null)
			{
				continue;
			}

			AreaOfEffectConfig.AoeObjectInfo objectInfo = plugin.getAoeConfig().getGraphicObjects().get(graphicsObject.getId());
			OverlayUtil2.renderPolygon(graphics, polygon, objectInfo.getColor(), config.borderWidth());

			if (!config.displayRemainingDuration() || object.isDynamicDespawnTick())
			{
				continue;
			}

			String remainingTicks = Integer.toString(object.getDespawnTick() - client.getTickCount());
			Point textPoint = Perspective.getCanvasTextLocation(client, graphics, localPoint, remainingTicks, 0);
			if (textPoint == null)
			{
				continue;
			}

			OverlayUtil.renderTextLocation(graphics, textPoint, remainingTicks, Color.WHITE);
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
