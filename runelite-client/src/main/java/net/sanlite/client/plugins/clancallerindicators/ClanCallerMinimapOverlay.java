/*
 * Copyright (c) 2019, Jajack
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
package net.sanlite.client.plugins.clancallerindicators;

import net.runelite.api.Player;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Singleton
public class ClanCallerMinimapOverlay extends Overlay
{
	private final ClanCallerConfig config;
	private final ClanCallerPlugin plugin;

	@Inject
	private ClanCallerMinimapOverlay(ClanCallerConfig config, ClanCallerPlugin plugin)
	{
		this.config = config;
		this.plugin = plugin;
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.HIGH);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (config.highlightCallers() && config.drawCallerMinimapNames())
		{
			for (Player player : plugin.getCallersList())
			{
				renderPlayerOverlay(graphics, player, config.getCallerColor(), true);
			}
		}
		if (config.highlightCallersPile() && config.drawPileMinimapNames())
		{
			for (Player player : plugin.getPilesList())
			{
				renderPlayerOverlay(graphics, player, config.getCallerPileColor(), false);
			}
		}
		return null;
	}

	private void renderPlayerOverlay(Graphics2D graphics, Player actor, Color color, Boolean isCaller)
	{
		String name;

		if (isCaller)
		{
			name = "Caller";
		}
		else
		{
			String actorName = actor.getName();
			if (actorName == null)
			{
				return;
			}

			name = actorName.replace('\u00A0', ' ');
		}

		final net.runelite.api.Point minimapLocation = actor.getMinimapLocation();

		if (minimapLocation != null)
		{
			OverlayUtil.renderTextLocation(graphics, minimapLocation, name, color);
		}
	}
}
