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
package net.sanlite.client.plugins.vorkath;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.util.ImageUtil;
import net.sanlite.client.ui.overlay.OverlayUtil2;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

@Slf4j
public class VorkathOverlay extends Overlay
{
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
				return ImageUtil.loadImageResource(Vorkath.class, "unknown_special.png");
			case ACID:
				return ImageUtil.loadImageResource(Vorkath.class, "acid_attack.png");
			case ZOMBIFIED_SPAWN:
				return ImageUtil.loadImageResource(Vorkath.class, "zombified_spawn.png");
		}
		return null;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Vorkath vorkath = plugin.getVorkath();
		if (vorkath != null && vorkath.isAwake())
		{
			if (config.highlightAcidPoolTiles())
			{
				renderAcidPoolTileMarkers(graphics, vorkath);
			}

			if (config.displayAcidPhasePath())
			{
				renderAcidPhasePath(graphics, vorkath);
			}

			if (config.highlightZombifiedSpawn())
			{
				renderZombifiedSpawnHighlight(graphics, vorkath);
			}

			if (config.displayRemainingAttacksTillSpecial())
			{
				renderRemainingAttacksTillSpecial(graphics, vorkath);
			}

			if (config.displayAttackTimer())
			{
				renderAttackTimer(graphics, vorkath);
			}
		}
		return null;
	}

	private void renderAcidPoolTileMarkers(Graphics2D graphics, Vorkath vorkath)
	{
		for (GameObject gameObject : vorkath.getGameObjects())
		{
			Polygon polygon = Perspective.getCanvasTilePoly(client, gameObject.getLocalLocation());
			if (polygon != null)
			{
				OverlayUtil2.renderPolygon(graphics, polygon, config.getAcidPoolColor(), config.borderWidth());
			}
		}
	}

	private void renderAcidPhasePath(Graphics2D graphics, Vorkath vorkath)
	{
		List<WorldPoint> acidPathPoints = vorkath.getAcidPhasePathPoints();
		if (!acidPathPoints.isEmpty())
		{
			for (WorldPoint acidFreeWorldPoint : acidPathPoints)
			{
				LocalPoint acidFreeLocalPoint = LocalPoint.fromWorld(client, acidFreeWorldPoint);
				if (acidFreeLocalPoint == null)
				{
					continue;
				}

				OverlayUtil2.renderPolygon(graphics, Perspective.getCanvasTilePoly(client,
						acidFreeLocalPoint), config.getAcidPhasePathColor(), config.borderWidth());
			}
		}
	}

	private void renderZombifiedSpawnHighlight(Graphics2D graphics, Vorkath vorkath)
	{
		if (vorkath.getZombifiedSpawn() != null)
		{
			final BufferedImage spriteCrumbleUndead = spriteManager.getSprite(SpriteID.SPELL_CRUMBLE_UNDEAD, 0);
			if (spriteCrumbleUndead == null)
			{
				return;
			}

			OverlayUtil.renderActorOverlayImage(graphics, vorkath.getZombifiedSpawn(), spriteCrumbleUndead,
					config.getZombifiedSpawnColor(), 0);
		}
	}

	private void renderRemainingAttacksTillSpecial(Graphics2D graphics, Vorkath vorkath)
	{
		LocalPoint localPoint = vorkath.getNpc().getLocalLocation();
		if (localPoint != null)
		{
			net.runelite.api.Point point = Perspective.localToCanvas(client, localPoint, client.getPlane(),
					vorkath.getNpc().getLogicalHeight() + 16);

			OverlayUtil2.renderCountCircle(graphics, Vorkath.ATTACKS_PER_SPECIAL_ATTACK,
					vorkath.getAttacksUntilSpecialAttack(), point,
					getSpecialAttackIcon(vorkath.getNextSpecialAttackStyle()), OVERLAY_ICON_MARGIN, ICON_WIDTH,
					ICON_HEIGHT, OVERLAY_ICON_DISTANCE);

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
				: String.valueOf(ticksTillNextAttack);

		BufferedImage image = vorkath.getRemainingAcidPhaseAttacks() != -1
				? spriteManager.getSprite(SpriteID.SPELL_FIRE_SURGE, 0)
				: ImageUtil.loadImageResource(getClass(), "/skill_icons_small/attack.png");
		Point imageLocation = vorkath.getNpc().getCanvasTextLocation(graphics, text, 0);
		if (imageLocation == null || image == null)
		{
			return;
		}

		OverlayUtil2.renderImageAndTextLocation(graphics, image, imageLocation, text,
				ATTACK_TIMER_IMAGE_HEIGHT_OFFSET, ATTACK_TIMER_TEXT_WIDTH_OFFSET, config.getAttackTimerTextColor());
	}
}
