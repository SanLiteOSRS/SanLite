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
package net.sanlite.client.plugins.nightmareofashihama;

import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.sanlite.client.plugins.nightmareofashihama.id.AnimationID;
import net.sanlite.client.ui.overlay.OverlayUtil2;

import javax.inject.Inject;
import java.awt.*;

public class NightmareOfAshihamaOverlay extends Overlay
{
	private final Client client;
	private final NightmareOfAshihamaPlugin plugin;

	@Inject
	private NightmareOfAshihamaConfig config;

	@Inject
	public NightmareOfAshihamaOverlay(Client client, NightmareOfAshihamaPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		NightmareOfAshihama nightmare = plugin.getNightmare();
		if (nightmare != null)
		{
			if (config.highlightActiveTotems())
			{
				renderActiveTotemsHighlights(graphics, nightmare);
			}

			if (config.highlightGhostAttackTiles())
			{
				renderGhostAttackTileMarkers(graphics, nightmare);
			}

			if (config.highlightInfectiousSpores())
			{
				renderInfectiousSporesTileMarkers(graphics, nightmare);
			}
		}
		return null;
	}

	private void renderActiveTotemsHighlights(Graphics2D graphics, NightmareOfAshihama nightmare)
	{
		for (NPC activeTotem : nightmare.getActiveTotems())
		{
			Shape objectClickbox = activeTotem.getConvexHull();

			if (objectClickbox == null)
			{
				continue;
			}
			OverlayUtil.renderPolygon(graphics, objectClickbox, config.getActiveTotemColor());
		}
	}

	private void renderGhostAttackTileMarkers(Graphics2D graphics, NightmareOfAshihama nightmare)
	{
		NPC nightmareNpc = nightmare.getNpc();
		if (nightmare.getNpc().getAnimation() == AnimationID.NIGHTMARE_GHOST_AOE_ATTACK)
		{
			LocalPoint localPoint = nightmareNpc.getLocalLocation();
			Polygon areaPolygon = Perspective.getCanvasTileAreaPoly(client, localPoint, 5);
			if (areaPolygon == null)
			{
				return;
			}

			OverlayUtil2.renderPolygon(graphics, areaPolygon, config.getGhostAttackColor(), config.borderWidth());
		}

		for (GraphicsObject graphicsObject : nightmare.getGraphicObjects())
		{
			if (!nightmare.isGhostAttackGraphicsObjectId(graphicsObject.getId()))
			{
				return;
			}

			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);
			if (polygon == null)
			{
				return;
			}

			OverlayUtil2.renderPolygon(graphics, polygon, config.getGhostAttackColor(),  config.borderWidth());
		}
	}

	private void renderInfectiousSporesTileMarkers(Graphics2D graphics, NightmareOfAshihama nightmare)
	{
		for (GameObject gameObject : nightmare.getGameObjects())
		{
			if (!nightmare.isInfectiousSporeGameObjectId(gameObject.getId()))
			{
				return;
			}

			LocalPoint localPoint = gameObject.getLocalLocation();
			Polygon areaPolygon = Perspective.getCanvasTileAreaPoly(client, localPoint, 3);
			if (areaPolygon == null)
			{
				return;
			}

			OverlayUtil2.renderPolygon(graphics, areaPolygon, config.getInfectiousSporesColor(), config.borderWidth());
		}
	}
}
