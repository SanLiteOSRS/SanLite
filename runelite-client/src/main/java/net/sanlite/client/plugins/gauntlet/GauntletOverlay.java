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
import net.sanlite.client.plugins.gauntlet.id.GauntletBossId;
import net.sanlite.client.ui.overlay.OverlayUtil2;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GauntletOverlay extends Overlay
{
	private static final int ICON_WIDTH = 25;
	private static final int ICON_HEIGHT = 25;
	private static final int OVERLAY_ICON_DISTANCE = 50;
	private static final int OVERLAY_ICON_MARGIN = 12;

	private final Client client;
	private final GauntletPlugin plugin;

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

	private BufferedImage getAttackStyleIcon(GauntletBoss.AttackStyle attackStyle)
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

	private BufferedImage getProtectedStyleIcon(GauntletBoss.ProtectedStyle protectedStyle)
	{
		switch (protectedStyle)
		{
			case RANGED:
				return iconManager.getSkillImage(Skill.RANGED);
			case MAGIC:
				return iconManager.getSkillImage(Skill.MAGIC);
			case MELEE:
				return iconManager.getSkillImage(Skill.ATTACK);
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

		GauntletBoss gauntletBoss = gauntlet.getGauntletBoss();
		if (gauntletBoss != null && gauntletBoss.getCurrentAttackStyle() != null)
		{
			if (config.highlightCrystalAttackTiles())
			{
				renderCrystalEffects(graphics, gauntletBoss);
			}

			if (config.showAttackStyleCounter())
			{
				renderAttackStyleCounter(graphics, gauntletBoss);
			}
		}
		return null;
	}

	private void renderAttackStyleCounter(Graphics2D graphics, GauntletBoss gauntletBoss)
	{
		LocalPoint localPoint = gauntletBoss.getNpc().getLocalLocation();
		if (localPoint != null)
		{
			Point point = Perspective.localToCanvas(client, localPoint, client.getPlane(),
					gauntletBoss.getNpc().getLogicalHeight() + 16);

			OverlayUtil2.renderCountCircle(graphics, GauntletBoss.ATTACKS_PER_SWITCH,
					gauntletBoss.getAttacksUntilSwitch(), point,
					getAttackStyleIcon(gauntletBoss.getCurrentAttackStyle()), OVERLAY_ICON_MARGIN, ICON_WIDTH,
					ICON_HEIGHT, OVERLAY_ICON_DISTANCE);
		}
	}

	private void renderCrystalEffects(Graphics2D graphics, GauntletBoss gauntletBoss)
	{
		for (NPC npc : gauntletBoss.getCrystals())
		{
			LocalPoint localPoint = npc.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (GauntletBossId.isCrystalNpc(npc.getId()))
				{
					OverlayUtil2.renderPolygon(graphics, polygon, config.getCrystalAttackColor(),
							config.getTileMarkersLineSize().getSize());
				}
			}
		}
	}
}