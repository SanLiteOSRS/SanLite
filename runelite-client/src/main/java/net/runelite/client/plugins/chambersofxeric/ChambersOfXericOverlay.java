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
package net.runelite.client.plugins.chambersofxeric;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.game.AreaOfEffectProjectile;
import net.runelite.client.plugins.chambersofxeric.encounters.ChambersOfXericRaid;
//import net.runelite.client.plugins.chambersofxeric.encounters.VasaNistirio;
import net.runelite.client.plugins.chambersofxeric.encounters.Vanguard;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.util.TickUtil;
import net.runelite.client.util.TimerFormat;

import javax.inject.Inject;
import java.awt.*;
import java.util.List;

@Slf4j
public class ChambersOfXericOverlay extends Overlay
{
	private static final int VERZIK_ATTACK_TIMER_IMAGE_HEIGHT_OFFSET = 15;
	private static final int VERZIK_ATTACK_TIMER_TEXT_WIDTH_OFFSET = 4;
	private static final int VASA_NISTIRIO_BOULDER_CORRECTION_CLIENT_TICKS = 20;

	private Client client;
	private ChambersOfXericPlugin plugin;

	@Inject
	private ChambersOfXericConfig config;

	@Inject
	public ChambersOfXericOverlay(Client client, ChambersOfXericPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!plugin.validateRaidPresence())
		{
			return null;
		}

		ChambersOfXericRaid raid = plugin.getCurrentRaid();
		renderAreaOfEffectProjectiles(graphics, raid.getAreaOfEffectProjectiles());
		renderVasaBoulderProjectiles(graphics, raid.getAreaOfEffectProjectiles());
		renderNpcHighlights(graphics, raid.getHighlightedNpcs());
//		renderVasaDamageArea(graphics, raid.getHighlightedNpcs());
		renderGraphicsObjects(graphics, raid.getGraphicObjects());
//		renderGlowingCrystalDuration(graphics, raid);
		renderVanguardsInformation(graphics, raid);
		return null;
	}

	private void renderAreaOfEffectProjectiles(Graphics2D graphics, List<AreaOfEffectProjectile> areaOfEffectProjectiles)
	{
		if (areaOfEffectProjectiles == null)
		{
			return;
		}

		for (AreaOfEffectProjectile projectile : areaOfEffectProjectiles)
		{
			if (projectile.getTargetPoint() == null || projectile.getProjectile().getId() == ProjectileID.VASA_RANGED_BOULDER_AOE)
			{
				continue;
			}

			if (projectile.getEndCycle() < client.getGameCycle())
			{
				areaOfEffectProjectiles.remove(projectile);
				continue;
			}

			Polygon polygon = Perspective.getCanvasTileAreaPoly(client, projectile.getTargetPoint(), projectile.getTileSize());
			if (polygon == null)
			{
				continue;
			}

			OverlayUtil.renderPolygon(graphics, polygon, projectile.getHighlightColor());

			if (!config.displayRemainingProjectileDuration())
			{
				continue;
			}

			String remainingCycles = TickUtil.convertTimerFormat(projectile.getEndCycle() - client.getGameCycle(),
					TimerFormat.SECONDS_MILLISECONDS);
			Point textPoint = Perspective.getCanvasTextLocation(client, graphics, projectile.getTargetPoint(), remainingCycles, 0);
			if (textPoint == null)
			{
				continue;
			}

			OverlayUtil.renderTextLocation(graphics, textPoint, remainingCycles, Color.WHITE);
		}
	}

	private void renderVasaBoulderProjectiles(Graphics2D graphics, List<AreaOfEffectProjectile> areaOfEffectProjectiles)
	{
		if (areaOfEffectProjectiles == null)
		{
			return;
		}

		for (AreaOfEffectProjectile projectile : areaOfEffectProjectiles)
		{
			if (projectile.getTargetPoint() == null || projectile.getProjectile().getId() != ProjectileID.VASA_RANGED_BOULDER_AOE)
			{
				continue;
			}

			// Vasa Nistirio's boulder attack land around 400ms before the projectiles end cycle
			int adjustedRemainingCycles = (projectile.getEndCycle() - client.getGameCycle()) - VASA_NISTIRIO_BOULDER_CORRECTION_CLIENT_TICKS;
			if (adjustedRemainingCycles <= 0)
			{
				areaOfEffectProjectiles.remove(projectile);
				continue;
			}

			Polygon polygon = Perspective.getCanvasTileAreaPoly(client, projectile.getTargetPoint(), projectile.getTileSize());
			if (polygon == null)
			{
				continue;
			}
			OverlayUtil.renderPolygon(graphics, polygon, projectile.getHighlightColor());

			if (!config.displayRemainingProjectileDuration())
			{
				continue;
			}

			String remainingDuration = TickUtil.convertTimerFormat(adjustedRemainingCycles, TimerFormat.SECONDS_MILLISECONDS);
			Point textPoint = Perspective.getCanvasTextLocation(client, graphics, projectile.getTargetPoint(), remainingDuration, 0);
			if (textPoint == null)
			{
				continue;
			}
			OverlayUtil.renderTextLocation(graphics, textPoint, remainingDuration, Color.WHITE);
		}
	}

	private void renderGraphicsObjects(Graphics2D graphics, List<GraphicsObject> graphicsObjects)
	{
		if (graphicsObjects == null)
		{
			return;
		}

		for (GraphicsObject graphicsObject : graphicsObjects)
		{
			Color color;
			switch (graphicsObject.getId())
			{
				case GraphicID.OLM_BLUE_HEAL_POOL:
					color = config.getOlmHealingPoolsColor();
					break;
				case GraphicID.OLM_LIGHTNING:
					color = config.getOlmLightningColor();
					break;
				default:
					continue;
			}

			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);
			if (polygon == null)
			{
				return;
			}

			OverlayUtil.renderPolygon(graphics, polygon, color);
		}
	}

	private void renderNpcHighlights(Graphics2D graphics, List<NPC> highlightedNpcs)
	{
		if (highlightedNpcs == null)
		{
			return;
		}

		for (NPC npc : highlightedNpcs)
		{
			Color color;
			switch (npc.getId())
			{
				case NpcID.GLOWING_CRYSTAL:
					color = config.getVasaActiveCrystalColor();
					break;
				default:
					continue;
			}

			Shape npcClickbox = npc.getConvexHull();
			if (npcClickbox != null)
			{
				OverlayUtil.renderPolygon(graphics, npcClickbox, color);
			}
		}
	}

//	private void renderVasaDamageArea(Graphics2D graphics, List<NPC> highlightedNpcs)
//	{
//		if (highlightedNpcs == null)
//		{
//			return;
//		}
//
//		NPC vasa = highlightedNpcs.stream().filter(x -> VasaNistirio.isNpcVasaNistirio(x.getId())).findFirst().orElse(null);
//		if (vasa == null)
//		{
//			return;
//		}
//
//		LocalPoint localPoint = vasa.getLocalLocation();
//		if (localPoint == null)
//		{
//			return;
//		}
//
//		Polygon polygon = Perspective.getCanvasTileAreaPoly(client, localPoint, vasa.getDefinition().getSize());
//		OverlayUtil.renderPolygon(graphics, polygon, config.getVasaNistirioDamageAreaColor());
//	}

//	private void renderGlowingCrystalDuration(Graphics2D graphics, ChambersOfXericRaid raid)
//	{
//		List<NPC> highlightedNpcs = raid.getHighlightedNpcs();
//		if (highlightedNpcs == null)
//		{
//			return;
//		}
//
//		NPC crystal = highlightedNpcs.stream().filter(x -> VasaNistirio.isNpcGlowingCrystal(x.getId())).findFirst().orElse(null);
//		if (crystal == null)
//		{
//			return;
//		}
//
//		int remainingCycles = (raid.getStartVasaHealingCycle() + raid.getRemainingVasaHealingCycles()) - client.getGameCycle();
//		String remainingDuration = TickUtil.convertTimerFormat(remainingCycles, TimerFormat.SECONDS_MILLISECONDS);
//		if (remainingCycles <= 0)
//		{
//			return;
//		}
//
//		Point point = crystal.getCanvasTextLocation(graphics, String.valueOf(remainingCycles), 0);
//		if (point == null)
//		{
//			return;
//		}
//
//		OverlayUtil.renderTextLocation(graphics, point, remainingDuration, Color.WHITE);
//	}

	private void renderVanguardsInformation(Graphics2D graphics, ChambersOfXericRaid raid)
	{
		List<Vanguard> aliveVanguards = raid.getAliveVanguards();

		if (aliveVanguards.isEmpty())
		{
			return;
		}

		for (Vanguard aliveVanguard : aliveVanguards)
		{
			String text = aliveVanguard.getVangPercent() + "%";

			if (aliveVanguard.getVangPercent() < 0)
			{
				return;
			}

			NPC vanguard = aliveVanguard.getVanguard();

			Point textLocation = vanguard.getCanvasTextLocation(graphics, text, 0);

			if (textLocation == null)
			{
				return;
			}

			Color colour = Color.WHITE;

			switch (aliveVanguard.getVangStyle())
			{
				case MELEE:
					colour = Color.RED;
					break;
				case RANGE:
					colour = Color.GREEN;
					break;
				case MAGE:
					colour = Color.CYAN;
					break;
			}

			OverlayUtil.renderTextLocation(graphics, textLocation, text, colour);
		}
	}
}