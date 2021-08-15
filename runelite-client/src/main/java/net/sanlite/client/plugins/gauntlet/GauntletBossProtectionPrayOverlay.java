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

import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.sanlite.client.ui.overlay.OverlayUtil2;

import javax.inject.Inject;
import java.awt.*;

public class GauntletBossProtectionPrayOverlay extends Overlay
{
	private final GauntletPlugin plugin;

	@Inject
	private GauntletConfig config;

	@Inject
	public GauntletBossProtectionPrayOverlay(GauntletPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		this.plugin = plugin;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Gauntlet gauntlet = plugin.getGauntlet();
		if (gauntlet == null)
		{
			return null;
		}

		GauntletBoss gauntletBoss = gauntlet.getBoss();
		if (gauntletBoss == null)
		{
			return null;
		}

		if (config.showProtectionPrayerCounter())
		{
			renderProtectedStyleCounter(graphics, gauntletBoss);
		}

		return null;
	}

	private void renderProtectedStyleCounter(Graphics2D graphics, GauntletBoss gauntletBoss)
	{
		String text = String.valueOf(gauntletBoss.getAttacksUntilOverheadSwitch());
		Point point = gauntletBoss.getNpc().getCanvasTextLocation(graphics, text, 0);
		if (point == null)
		{
			return;
		}

		OverlayUtil2.renderTextLocation(graphics, text, config.getFontSize(), config.getFontStyle().getFont(),
				config.getProtectionPrayCountFontColor(), point, false, 0);
	}
}