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

import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.outline.ModelOutlineRenderer;
import net.sanlite.client.ui.overlay.OverlayUtil2;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GauntletEnvironmentOverlay extends Overlay
{

	private final Client client;
	private final GauntletPlugin plugin;
	private final GauntletConfig config;
	private final SkillIconManager iconManager;
	private final ModelOutlineRenderer modelOutlineRenderer;

	@Inject
	private GauntletEnvironmentOverlay(Client client, GauntletPlugin plugin, GauntletConfig config,
										SkillIconManager iconManager, ModelOutlineRenderer modelOutlineRenderer)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
		this.config = config;
		this.iconManager = iconManager;
		this.modelOutlineRenderer = modelOutlineRenderer;
	}

	private BufferedImage getIcon(GauntletUtilitySpot utilitySpot)
	{
		switch (utilitySpot)
		{
			case SINGING_BOWL:
				return iconManager.getSkillImage(Skill.CRAFTING);
			case COOKING_RANGE:
				return iconManager.getSkillImage(Skill.COOKING);
			case WATER_PUMP:
				return iconManager.getSkillImage(Skill.FARMING);
		}
		return null;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Gauntlet gauntlet = plugin.getGauntlet();
		if (gauntlet == null || gauntlet.isInBossRoom())
		{
			return null;
		}

		for (NPC demiBoss : gauntlet.getDemiBosses())
		{
			if (plugin.isHighlightEnabledForDemiBoss(demiBoss.getId()))
			{
				renderDemiBossHighlight(demiBoss);
			}
		}

		renderResourceSpots(graphics);
		renderUtilitySpots(graphics);

		return null;
	}

	private void renderResourceSpots(Graphics2D graphics)
	{
		for (GameObject gameObject : plugin.getGauntlet().getResourceSpots())
		{
			GauntletResourceSpot resourceSpot = GauntletResourceSpot.getSPOTS().get(gameObject.getId());
			if (resourceSpot == null)
			{
				continue;
			}

			boolean isEnabled = GauntletResourceSpot.isEnabled(gameObject.getId(), config);
			if (!isEnabled)
			{
				continue;
			}

			Color color = GauntletResourceSpot.getColor(gameObject.getId(), config);
			if (config.showResourceSpotsObjectMarkers())
			{
				Shape poly = gameObject.getConvexHull();
				if (poly != null)
				{
					OverlayUtil2.renderPolygon(graphics, poly, color, config.getBorderWidth());
				}
			}

			if (config.showResourceSpotsTiles())
			{
				Polygon poly = gameObject.getCanvasTilePoly();
				if (poly != null)
				{
					OverlayUtil2.renderPolygon(graphics, poly, color, config.getBorderWidth());
				}
			}

			if (config.showResourceSpotsNames())
			{
				String text = resourceSpot.getName();

				Point textLocation = gameObject.getCanvasTextLocation(graphics, text, 40);
				if (textLocation != null)
				{
					OverlayUtil2.renderTextLocation(graphics, text, config.getFontSize(), config.getFontStyle().getFont(),
							color, textLocation, false, 0);
				}
			}
		}
	}

	private void renderUtilitySpots(Graphics2D graphics)
	{
		for (GameObject gameObject : plugin.getGauntlet().getUtilitySpots())
		{
			GauntletUtilitySpot utilitySpot = GauntletUtilitySpot.getSPOTS().get(gameObject.getId());
			if (utilitySpot == null)
			{
				continue;
			}

			boolean isEnabled = GauntletUtilitySpot.isEnabled(gameObject.getId(), config);
			if (!isEnabled)
			{
				continue;
			}

			Color color = GauntletUtilitySpot.getColor(gameObject.getId(), config);
			Shape poly = gameObject.getConvexHull();
			if (poly != null)
			{
				OverlayUtil2.renderPolygon(graphics, poly, color, config.getBorderWidth());
			}


			BufferedImage icon = getIcon(utilitySpot);
			if (icon == null)
			{
				continue;
			}

			Point imageLocation = Perspective.getCanvasImageLocation(client, gameObject.getLocalLocation(), icon, 75);
			if (imageLocation != null)
			{
				OverlayUtil.renderImageLocation(graphics, imageLocation, icon);
			}
		}
	}

	private void renderDemiBossHighlight(NPC demiBoss)
	{
		NPCComposition npcComposition = demiBoss.getTransformedComposition();
		if (npcComposition == null || !npcComposition.isInteractible() || (demiBoss.isDead()))
		{
			return;
		}

		int size = npcComposition.getSize();
		LocalPoint localPoint = demiBoss.getLocalLocation();
		Polygon polygon = Perspective.getCanvasTileAreaPoly(client, localPoint, size);
		if (polygon == null)
		{
			return;
		}

		modelOutlineRenderer.drawOutline(demiBoss, (int) config.getBorderWidth(), config.getDemiBossHighlightColor(),
				config.outlineFeather());
	}
}
