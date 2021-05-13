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

import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.sanlite.client.ui.overlay.OverlayUtil2;

import javax.inject.Inject;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class GauntletOverlay extends Overlay
{

	private static final Color COLOR_ICON_BACKGROUND = new Color(0, 0, 0, 128);
	private static final Color COLOR_ICON_BORDER = new Color(0, 0, 0, 255);
	private static final Color COLOR_ICON_BORDER_FILL = new Color(219, 175, 0, 255);
	private static final int ICON_WIDTH = 25;
	private static final int ICON_HEIGHT = 25;
	private static final int OVERLAY_ICON_DISTANCE = 60;
	private static final int OVERLAY_ICON_MARGIN = 12;

	private Client client;
	private GauntletPlugin plugin;

	@Inject
	private GauntletConfig config;

	@Inject
	private SkillIconManager iconManager;


	@Inject
	public GauntletOverlay(Client client, GauntletPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
	}

	private BufferedImage getIcon(GauntletBoss.AttackStyle attackStyle)
	{
		switch (attackStyle)
		{
			case RANGED:
				return iconManager.getSkillImage(Skill.RANGED);
			case MAGIC:
				return iconManager.getSkillImage(Skill.MAGIC);
		}
		return null;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		GauntletBoss gauntletBoss = plugin.getGauntletBoss();
		if (gauntletBoss != null && gauntletBoss.getCurrentAttackStyle() != null)
		{
			if (config.highlightCrystalAttackTiles())
			{
				renderCrystalEffects(graphics, gauntletBoss);
			}

			if (config.showAttackStyleCounter())
			{
				LocalPoint localPoint = gauntletBoss.getNpc().getLocalLocation();
				if (localPoint != null)
				{
					Point point = Perspective.localToCanvas(client, localPoint, client.getPlane(),
							gauntletBoss.getNpc().getLogicalHeight() + 16);
					if (point != null)
					{
						point = new Point(point.getX(), point.getY());
						List<BufferedImage> icons = new ArrayList<>();
						int totalWidth = OVERLAY_ICON_MARGIN;

						GauntletBoss.AttackStyle attackStyle = gauntletBoss.getCurrentAttackStyle();
						if (attackStyle != null)
						{
							BufferedImage currentAttackStyleIcon = getIcon(attackStyle);
							icons.add(currentAttackStyleIcon);
							totalWidth += ICON_WIDTH;
						}
						int bgPadding = 4;
						int currentPosX = 0;
						for (BufferedImage icon : icons)
						{
							graphics.setStroke(new BasicStroke(2));
							graphics.setColor(COLOR_ICON_BACKGROUND);
							graphics.fillOval(
									point.getX() - totalWidth / 2 + currentPosX - bgPadding,
									point.getY() - ICON_HEIGHT / 2 - OVERLAY_ICON_DISTANCE - bgPadding,
									ICON_WIDTH + bgPadding * 2,
									ICON_HEIGHT + bgPadding * 2);

							graphics.setColor(COLOR_ICON_BORDER);
							graphics.drawOval(
									point.getX() - totalWidth / 2 + currentPosX - bgPadding,
									point.getY() - ICON_HEIGHT / 2 - OVERLAY_ICON_DISTANCE - bgPadding,
									ICON_WIDTH + bgPadding * 2,
									ICON_HEIGHT + bgPadding * 2);

							graphics.drawImage(
									icon,
									point.getX() - totalWidth / 2 + currentPosX,
									point.getY() - ICON_HEIGHT / 2 - OVERLAY_ICON_DISTANCE,
									null);

							graphics.setColor(COLOR_ICON_BORDER_FILL);

							Arc2D.Double arc = new Arc2D.Double(
									point.getX() - totalWidth / 2 + currentPosX - bgPadding,
									point.getY() - ICON_HEIGHT / 2 - OVERLAY_ICON_DISTANCE - bgPadding,
									ICON_WIDTH + bgPadding * 2,
									ICON_HEIGHT + bgPadding * 2,
									90.0,
									-360.0 * (GauntletBoss.ATTACKS_PER_SWITCH -
											gauntletBoss.getAttacksUntilSwitch()) / GauntletBoss.ATTACKS_PER_SWITCH,
									Arc2D.OPEN);
							graphics.draw(arc);
							currentPosX += ICON_WIDTH + OVERLAY_ICON_MARGIN;
						}
					}
				}
			}
		}
		return null;
	}

	private void renderCrystalEffects(Graphics2D graphics, GauntletBoss gauntletBoss)
	{
		for (NPC npc : gauntletBoss.getCrystalEffects())
		{
			LocalPoint localPoint = npc.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (gauntletBoss.isNpcCrystalAttack(npc.getId()))
				{
					OverlayUtil2.renderPolygon(graphics, polygon, config.getCrystalAttackColor(),
							config.getTileMarkersLineSize().getSize());
				}
			}
		}
	}
}