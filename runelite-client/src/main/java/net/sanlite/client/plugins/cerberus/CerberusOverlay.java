/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
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
package net.sanlite.client.plugins.cerberus;

import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.util.ImageUtil;
import net.sanlite.client.ui.overlay.OverlayUtil2;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.awt.image.BufferedImage;

@Singleton
public class CerberusOverlay extends Overlay
{
	private static final Color COLOR_ICON_BACKGROUND = new Color(0, 0, 0, 128);
	private static final Color COLOR_ICON_BORDER = new Color(0, 0, 0, 255);
	private static final int ICON_WIDTH = 25;
	private static final int ICON_HEIGHT = 25;
	private static final int OVERLAY_ICON_MARGIN = 12;

	@Inject
	private Client client;

	@Inject
	private CerberusPlugin plugin;

	@Inject
	private CerberusConfig config;

	@Inject
	private SkillIconManager iconManager;

	@Inject
	CerberusOverlay(final CerberusPlugin plugin, final Client client)
	{
		this.plugin = plugin;
		this.client = client;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.UNDER_WIDGETS);
	}

	private BufferedImage getAttackStyleIcon(Cerberus.AttackStyle attackStyle)
	{
		switch (attackStyle)
		{
			case MELEE:
				return iconManager.getSkillImage(Skill.ATTACK);
			case RANGE:
				return ImageUtil.resizeImage(iconManager.getSkillImage(Skill.RANGED), 25, 23);
			case MAGE:
				return iconManager.getSkillImage(Skill.MAGIC);
		}
		return null;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Cerberus cerberus = plugin.getCerberus();
		if (cerberus != null)
		{
			if (config.showAttackStyleCounter())
			{
				renderCurrentAttackOverhead(graphics, cerberus);
			}

			if (config.highlightLavaPoolTiles())
			{
				renderPoolsTileMarkers(graphics, cerberus);
			}
		}
		return null;
	}

	private void renderPoolsTileMarkers(Graphics2D graphics, Cerberus cerberus)
	{
		for (GraphicsObject graphicsObject : cerberus.getPoolsGraphicObjects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon areaPolygon = Perspective.getCanvasTileAreaPoly(client, localPoint, 3);

			if (areaPolygon == null)
			{
				return;
			}

			OverlayUtil2.renderPolygon(graphics, areaPolygon, config.getLavaPoolColor(), config.borderWidth());
		}
	}

	private void renderCurrentAttackOverhead(Graphics2D graphics, Cerberus cerberus)
	{
		if (cerberus.getCurrentAttackStyle() == null)
		{
			return;
		}

		LocalPoint localPoint = cerberus.getNpc().getLocalLocation();
		if (localPoint != null)
		{
			net.runelite.api.Point point = Perspective.localToCanvas(client, localPoint, client.getPlane(),
					cerberus.getNpc().getLogicalHeight() + 16);

			if (point != null)
			{
				point = new Point(point.getX(), point.getY());
				int totalWidth = OVERLAY_ICON_MARGIN;
				totalWidth += ICON_WIDTH;

				int bgPadding = 4;
				int currentPosX = 0;

				int overlayIconDistance = 30;
				graphics.setStroke(new BasicStroke(2));
				graphics.setColor(COLOR_ICON_BACKGROUND);
				graphics.fillOval(
						point.getX() - totalWidth / 2 + currentPosX - bgPadding,
						point.getY() - ICON_HEIGHT / 2 - overlayIconDistance - bgPadding,
						ICON_WIDTH + bgPadding * 2,
						ICON_HEIGHT + bgPadding * 2);

				graphics.setColor(COLOR_ICON_BORDER);
				graphics.drawOval(
						point.getX() - totalWidth / 2 + currentPosX - bgPadding,
						point.getY() - ICON_HEIGHT / 2 - overlayIconDistance - bgPadding,
						ICON_WIDTH + bgPadding * 2,
						ICON_HEIGHT + bgPadding * 2);

				graphics.drawImage(
						getAttackStyleIcon(cerberus.getCurrentAttackStyle()),
						point.getX() - totalWidth / 2 + currentPosX,
						point.getY() - ICON_HEIGHT / 2 - overlayIconDistance,
						null);
			}
		}
	}
}
