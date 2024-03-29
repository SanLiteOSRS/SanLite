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

import net.runelite.api.GameObject;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.*;

public class GauntletEnvironmentMinimapOverlay extends Overlay
{
	private final GauntletPlugin plugin;
	private final GauntletConfig config;

	@Inject
	private GauntletEnvironmentMinimapOverlay(GauntletPlugin plugin, GauntletConfig config)
	{
		this.plugin = plugin;
		this.config = config;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (plugin.getGauntlet() == null)
		{
			return null;
		}

		if (config.showResourceSpotsOnMinimap())
		{
			for (GameObject gameObject : plugin.getGauntlet().getResourceSpots())
			{
				if (GauntletResourceSpot.getSPOTS().get(gameObject.getId()) == null)
				{
					continue;
				}

				Color color = GauntletResourceSpot.getColor(gameObject.getId(), config);
				renderSpotHighlight(graphics, gameObject, color);
			}
		}

		if (config.showUtilitySpotsOnMinimap())
		{
			for (GameObject gameObject : plugin.getGauntlet().getUtilitySpots())
			{
				if (GauntletUtilitySpot.getSPOTS().get(gameObject.getId()) == null)
				{
					continue;
				}

				Color color = GauntletUtilitySpot.getColor(gameObject.getId(), config);
				renderSpotHighlight(graphics, gameObject, color);
			}
		}

		return null;
	}

	private void renderSpotHighlight(Graphics2D graphics, GameObject gameObject, Color color)
	{
		Point minimapLocation = gameObject.getMinimapLocation();
		if (minimapLocation != null)
		{
			OverlayUtil.renderMinimapLocation(graphics, minimapLocation, color);
		}
	}
}
