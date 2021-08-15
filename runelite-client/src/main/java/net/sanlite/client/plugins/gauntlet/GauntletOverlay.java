/*
 * Copyright (c) 2021, Siraz <https://github.com/Sirazzz>
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

public class GauntletOverlay extends Overlay
{
	private final Client client;
	private final GauntletPlugin plugin;
	private final ModelOutlineRenderer modelOutlineRenderer;

	@Inject
	private GauntletConfig config;

	@Inject
	private SkillIconManager iconManager;

	@Inject
	public GauntletOverlay(Client client, GauntletPlugin plugin, ModelOutlineRenderer modelOutlineRenderer)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
		this.modelOutlineRenderer = modelOutlineRenderer;
	}

	private BufferedImage getIcon(GauntletUtilitySpotType utilitySpotType)
	{
		switch (utilitySpotType)
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
		if (gauntlet == null)
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

		for (GameObject gameObject : gauntlet.getUtilitySpots())
		{
			GauntletUtilitySpotType type = GauntletUtilitySpot.getTypeForId(gameObject.getId(), plugin.getUtilitySpotsConfig());
			if (type == null)
			{
				continue;
			}

			if (plugin.isHighlightEnabledForUtilitySpot(type))
			{
				renderUtilitySpotHighlight(graphics, gameObject, type);
			}
		}

		return null;
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

	private void renderUtilitySpotHighlight(Graphics2D graphics, GameObject gameObject, GauntletUtilitySpotType type)
	{
		Color color = plugin.getUtilitySpotsConfig().get(type).getColor();
		Point imageLocation = gameObject.getCanvasLocation();
		Shape poly = gameObject.getConvexHull();
		if (imageLocation == null || poly == null)
		{
			return;
		}

		OverlayUtil2.renderPolygon(graphics, poly, color, config.getBorderWidth());
		OverlayUtil.renderImageLocation(graphics, imageLocation, getIcon(type));
	}
}