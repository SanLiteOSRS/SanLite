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
package net.runelite.client.plugins.vorkath;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;

@Slf4j
public class VorkathOverlay extends Overlay
{
	private static final Color COLOR_ICON_BACKGROUND = new Color(0, 0, 0, 128);
	private static final Color COLOR_ICON_BORDER = new Color(0, 0, 0, 255);
	private static final Color COLOR_ICON_BORDER_FILL = new Color(219, 175, 0, 255);
	private static final int ICON_WIDTH = 25;
	private static final int ICON_HEIGHT = 25;
	private static final int OVERLAY_ICON_DISTANCE = 30;
	private static final int OVERLAY_ICON_MARGIN = 12;
	private static final int ATTACK_TIMER_IMAGE_HEIGHT_OFFSET = 15;
	private static final int ATTACK_TIMER_TEXT_WIDTH_OFFSET = 4;

	private Client client;
	private VorkathPlugin plugin;

	@Inject
	private VorkathConfig config;

	@Inject
	private SpriteManager spriteManager;

	@Inject
	public VorkathOverlay(Client client, VorkathPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
	}

	private BufferedImage getSpecialAttackIcon(Vorkath.SpecialAttackStyle attackStyle)
	{
		switch (attackStyle)
		{
			case UNKNOWN:
				return ImageUtil.getResourceStreamFromClass(Vorkath.class, "unknown_special.png");
			case ACID:
				return ImageUtil.getResourceStreamFromClass(Vorkath.class, "acid_attack.png");
			case ZOMBIFIED_SPAWN:
				return ImageUtil.getResourceStreamFromClass(Vorkath.class, "zombified_spawn.png");
		}
		return null;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Vorkath vorkath = plugin.getVorkath();
		if (vorkath != null && vorkath.isAwake())
		{
			if (config.displayRemainingAttacksTillSpecial())
			{
				renderRemainingAttacksTillSpecial(graphics, vorkath);
			}

			if (config.displayAttackTimer())
			{
				renderAttackTimer(graphics, vorkath);
			}

			if (config.highlightAcidPoolTiles())
			{
				renderAcidPoolTileMarkers(graphics, vorkath);
			}

			if (config.highlightZombifiedSpawn())
			{
				renderZombifiedSpawnHighlight(graphics, vorkath);
			}

			if (config.highlightFirebombTiles())
			{
				renderProjectiles(graphics, vorkath);
			}
		}
		return null;
	}

	private void renderRemainingAttacksTillSpecial(Graphics2D graphics, Vorkath vorkath)
	{
		LocalPoint localPoint = vorkath.getNpc().getLocalLocation();
		if (localPoint != null)
		{
			net.runelite.api.Point point = Perspective.localToCanvas(client, localPoint, client.getPlane(),
					vorkath.getNpc().getLogicalHeight() + 16);
			if (point != null)
			{
				point = new Point(point.getX(), point.getY());
				int totalWidth = OVERLAY_ICON_MARGIN;

				BufferedImage specialAttackStyleIcon = getSpecialAttackIcon(vorkath.getNextSpecialAttackStyle());
				totalWidth += ICON_WIDTH;

				int bgPadding = 4;
				int currentPosX = 0;

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
						specialAttackStyleIcon,
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
						-360.0 * (Vorkath.ATTACKS_PER_SPECIAL_ATTACK -
								vorkath.getAttacksUntilSpecialAttack()) / Vorkath.ATTACKS_PER_SPECIAL_ATTACK,
						Arc2D.OPEN);
				graphics.draw(arc);
			}
		}
	}

	private void renderAttackTimer(Graphics2D graphics, Vorkath vorkath)
	{
		int ticksTillNextAttack = vorkath.getNextAttackTick() - client.getTickCount();
		if (ticksTillNextAttack < 0 && vorkath.getRemainingAcidPhaseAttacks() == -1)
		{
			return;
		}

		String text = vorkath.getRemainingAcidPhaseAttacks() != -1
				? String.valueOf(vorkath.getRemainingAcidPhaseAttacks())
				: String.valueOf(vorkath.getNextAttackTick() - client.getTickCount());

		BufferedImage image = vorkath.getRemainingAcidPhaseAttacks() != -1
				? spriteManager.getSpriteImg(SpriteID.SPELL_FIRE_SURGE, 0)
				: ImageUtil.getResourceStreamFromClass(getClass(), "/skill_icons_small/attack.png");
		Point imageLocation = vorkath.getNpc().getCanvasTextLocation(graphics, text, 0);
		if (imageLocation == null || image == null)
		{
			return;
		}

		OverlayUtil.renderImageAndTextLocation(graphics, image, imageLocation, text,
				ATTACK_TIMER_IMAGE_HEIGHT_OFFSET, ATTACK_TIMER_TEXT_WIDTH_OFFSET, config.getAttackTimerTextColor());
	}

	private void renderAcidPoolTileMarkers(Graphics2D graphics, Vorkath vorkath)
	{
		for (GameObject gameObject : vorkath.getGameObjects())
		{
			Polygon polygon = Perspective.getCanvasTilePoly(client, gameObject.getLocalLocation());
			if (polygon != null)
			{
				OverlayUtil.renderPolygon(graphics, polygon, config.getAcidPoolColor());
			}
		}
	}

	private void renderZombifiedSpawnHighlight(Graphics2D graphics, Vorkath vorkath)
	{
		if (vorkath.getZombifiedSpawn() != null)
		{
			final BufferedImage spriteCrumbleUndead = spriteManager.getSpriteImg(SpriteID.SPELL_CRUMBLE_UNDEAD, 0);
			if (spriteCrumbleUndead == null)
			{
				return;
			}

			OverlayUtil.renderActorOverlayImage(graphics, vorkath.getZombifiedSpawn(), spriteCrumbleUndead,
					config.getZombifiedSpawnColor(), 0);
		}
	}

	private void renderProjectiles(Graphics2D graphics, Vorkath vorkath)
	{
		for (VorkathProjectile projectile : vorkath.getProjectiles())
		{
			if (projectile.getTargetPoint() == null)
			{
				return;
			}

			if (projectile.getEndCycle() < client.getGameCycle())
			{
				vorkath.getProjectiles().remove(projectile);
				return;
			}

			Polygon polygon = Perspective.getCanvasTileAreaPoly(client, projectile.getTargetPoint(), projectile.getTileSize());
			if (polygon != null)
			{
				OverlayUtil.renderPolygon(graphics, polygon, config.getFirebombMarkerColor());
			}
		}
	}
}
