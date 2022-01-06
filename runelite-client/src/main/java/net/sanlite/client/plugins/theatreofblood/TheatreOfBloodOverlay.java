/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
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
package net.sanlite.client.plugins.theatreofblood;

import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.util.ImageUtil;
import net.sanlite.client.plugins.theatreofblood.encounters.*;
import net.sanlite.client.ui.overlay.OverlayUtil2;
import net.sanlite.client.util.TickUtil;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class TheatreOfBloodOverlay extends Overlay
{
	private static final int IMAGE_HEIGHT_OFFSET = 15;
	private static final int TIMER_TEXT_WIDTH_OFFSET = 4;

	private final Client client;
	private final TheatreOfBloodPlugin plugin;

	@Inject
	private TheatreOfBloodConfig config;

	@Inject
	public TheatreOfBloodOverlay(Client client, TheatreOfBloodPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.UNDER_WIDGETS);
		this.client = client;
		this.plugin = plugin;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		TheatreOfBloodEncounter encounter = plugin.getCurrentEncounter();
		if (encounter != null)
		{
			if (encounter.getNpc() != null)
			{
				// Sugadinti Maiden
				if (config.highlightBloodSplatAttackTiles() && encounter.getEncounter().equals(TheatreOfBloodEncounters.SUGADINTI_MAIDEN))
					renderMaidenBloodSplatAoeEffects(graphics, (SugadintiMaiden) encounter);

				if (config.highlightBloodSpawnTiles() && encounter.getEncounter().equals(TheatreOfBloodEncounters.SUGADINTI_MAIDEN))
					renderMaidenBloodSpawnAoeEffects(graphics, (SugadintiMaiden) encounter);

				// Pestilent Bloat
				if (config.highlightBloatHandAttackTiles() && encounter.getEncounter().equals(TheatreOfBloodEncounters.PESTILENT_BLOAT))
					renderBloatHandAoeEffects(graphics, (PestilentBloat) encounter);

				if (config.highlightBloatStatus() && encounter.getEncounter().equals(TheatreOfBloodEncounters.PESTILENT_BLOAT))
					renderPestilentBloatHull(graphics, (PestilentBloat) encounter);

				if (config.displayBloatSleepTimer() && encounter.getEncounter().equals(TheatreOfBloodEncounters.PESTILENT_BLOAT))
					renderPestilentBloatTimerText(graphics, (PestilentBloat) encounter);

				// Sotetseg
				if (config.highlightSotetsegRedMazeTiles() && encounter.getEncounter().equals(TheatreOfBloodEncounters.SOTETSEG))
					renderSotetsegMazeTiles(graphics, (Sotetseg) encounter);

				// Xarpus
				if (config.highlightXarpusPoisonAttackTiles() && encounter.getEncounter().equals(TheatreOfBloodEncounters.XARPUS))
					renderXarpusPoisonTileObjects(graphics, (Xarpus) encounter);

				if (config.highlightXarpusHealingPoolTiles() && encounter.getEncounter().equals(TheatreOfBloodEncounters.XARPUS))
					renderXarpusHealingPoolTileObjects(graphics, (Xarpus) encounter);

				if (config.displayXarpusTurnTimer() && encounter.getEncounter().equals(TheatreOfBloodEncounters.XARPUS))
					renderXarpusTurnTimer(graphics, (Xarpus) encounter);

				// Verzik Vitur
				if (config.highlightVerzikGreenOrbPoolTiles() && encounter.getEncounter().equals(TheatreOfBloodEncounters.VERZIK_VITUR))
					renderVerzikGreenOrbPoolAoeEffects(graphics, (Verzik) encounter);

				if (config.displayVerzikP1AttackTimer() && encounter.getEncounter().equals(TheatreOfBloodEncounters.VERZIK_VITUR) &&
						encounter.castToVerzik().getVerzikPhase() == 1)
					renderVerzikAttackTimerText(graphics, (Verzik) encounter);

				if (config.displayVerzikP2AttackTimer() && encounter.getEncounter().equals(TheatreOfBloodEncounters.VERZIK_VITUR) &&
						encounter.castToVerzik().getVerzikPhase() == 2)
					renderVerzikAttackTimerText(graphics, (Verzik) encounter);

				if (config.displayVerzikP3AttackTimer() && encounter.getEncounter().equals(TheatreOfBloodEncounters.VERZIK_VITUR) &&
						encounter.castToVerzik().getVerzikPhase() >= 3)
					renderVerzikAttackTimerText(graphics, (Verzik) encounter);

				if (config.displayVerzikNylocasAggression() && encounter.getEncounter().equals(TheatreOfBloodEncounters.VERZIK_VITUR))
					renderVerzikNylocasAggressionText(graphics, (Verzik) encounter);
			}

			// Nylocas - does not always have a boss npc
			if (config.highlightAggressiveNylocas() && encounter.getEncounter().equals(TheatreOfBloodEncounters.NYLOCAS))
				renderAggressiveNylocasHighlights(graphics, (Nylocas) encounter);

			if (config.displayNylocasLifeTimerText() && encounter.getEncounter().equals(TheatreOfBloodEncounters.NYLOCAS))
				renderNylocasLifeTimer(graphics, (Nylocas) encounter);
		}
		return null;
	}

	private void renderMaidenBloodSplatAoeEffects(Graphics2D graphics, SugadintiMaiden sugadintiMaiden)
	{
		for (GraphicsObject graphicsObject : sugadintiMaiden.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);
			if (polygon != null)
			{
				if (sugadintiMaiden.isBloodSplatAttack(graphicsObject.getId()))
				{
					OverlayUtil2.renderPolygon(graphics, polygon, config.getBloodSplatAttackColor(), config.borderWidth());
				}
			}
		}
	}

	private void renderMaidenBloodSpawnAoeEffects(Graphics2D graphics, SugadintiMaiden sugadintiMaiden)
	{
		for (GameObject gameObject : sugadintiMaiden.getGameObjects())
		{
			LocalPoint localPoint = gameObject.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);
			if (polygon != null)
			{
				if (sugadintiMaiden.isBloodSpawnBloodTile(gameObject.getId()))
				{
					OverlayUtil2.renderPolygon(graphics, polygon, config.getBloodSpawnBloodColor(), config.borderWidth());
				}
			}
		}
	}

	private void renderBloatHandAoeEffects(Graphics2D graphics, PestilentBloat pestilentBloat)
	{
		for (GraphicsObject graphicsObject : pestilentBloat.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (pestilentBloat.isHandAttack(graphicsObject.getId()))
				{
					OverlayUtil2.renderPolygon(graphics, polygon, config.getBloatHandAttackColor(), config.borderWidth());
				}
			}
		}
	}

	private void renderPestilentBloatHull(Graphics2D graphics, PestilentBloat pestilentBloat)
	{
		Shape objectClickbox = pestilentBloat.getNpc().getConvexHull();

		if (objectClickbox == null)
		{
			return;
		}

		Color color;
		if (pestilentBloat.isAsleep())
		{
			color = config.getBloatAsleepColor();
		}
		else if (pestilentBloat.getHandFallCycleCount() == 7 || pestilentBloat.getHandFallCycleCount() == 8 ||
				pestilentBloat.getHandFallCycleCount() > 15)
		{
			color = config.getBloatWarningColor();
		}
		else
		{
			color = config.getBloatAwakeColor();
		}
		OverlayUtil2.renderPolygon(graphics, objectClickbox, color, config.borderWidth());
	}

	private void renderPestilentBloatTimerText(Graphics2D graphics, PestilentBloat pestilentBloat)
	{
		if (pestilentBloat.getRemainingSleepClientTicks() < 0)
		{
			return;
		}

		String text = TickUtil.convertTimerFormat(pestilentBloat.getRemainingSleepClientTicks(), config.getTimerFormat());

		Point textLocation = pestilentBloat.getNpc().getCanvasTextLocation(graphics, text, 0);
		if (textLocation == null)
		{
			return;
		}

		OverlayUtil.renderTextLocation(graphics, textLocation, text, Color.WHITE);
	}

	private void renderAggressiveNylocasHighlights(Graphics2D graphics, Nylocas nylocas)
	{
		if (nylocas.getHighlightedNylocasNpcs() == null)
		{
			return;
		}

		for (NPC npc : nylocas.getHighlightedNylocasNpcs())
		{
			Shape npcClickbox = npc.getConvexHull();
			if (npcClickbox != null)
			{
				OverlayUtil2.renderPolygon(graphics, npcClickbox, config.getAggressiveNylocasColor(), config.borderWidth());
			}
		}
	}

	private void renderNylocasLifeTimer(Graphics2D graphics, Nylocas nylocasEncounter)
	{
		if (nylocasEncounter.getAliveNylocas() == null)
		{
			return;
		}

		for (NPC nylocas : new ArrayList<>(nylocasEncounter.getAliveNylocas().keySet()))
		{
			if (nylocasEncounter.isNylocasAlmostExploding(nylocas))
			{
				List<Integer> timers = nylocasEncounter.getAliveNylocas().get(nylocas);
				String text = TickUtil.convertTimerFormat(timers.get(2), config.getTimerFormat());

				BufferedImage image = ImageUtil.loadImageResource(TheatreOfBloodPlugin.class, "explosion.png");
				Point textLocation = nylocas.getCanvasTextLocation(graphics, text, 0);
				if (textLocation == null)
				{
					continue;
				}

				OverlayUtil2.renderImageAndTextLocation(graphics, image, textLocation, text, IMAGE_HEIGHT_OFFSET,
						TIMER_TEXT_WIDTH_OFFSET, Color.WHITE);

				if (!config.displayNylocasLExplosiveRadius())
				{
					continue;
				}

				LocalPoint npcLocalPoint = nylocas.getLocalLocation();
				Polygon polygon = Perspective.getCanvasTileAreaPoly(client, npcLocalPoint, 3);
				if (polygon == null)
				{
					continue;
				}

				OverlayUtil2.renderPolygon(graphics, polygon, config.getNylocasExplosiveRadiusColor(), config.borderWidth());
			}
		}
	}

	private void renderSotetsegMazeTiles(Graphics2D graphics, Sotetseg sotetseg)
	{
		if (sotetseg.getActiveMazeTiles() == null)
		{
			return;
		}

		for (GroundObject groundObject : sotetseg.getActiveMazeTiles())
		{
			LocalPoint localPoint = groundObject.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				OverlayUtil2.renderPolygon(graphics, polygon, config.getSotetsegMazeTileColor(), config.borderWidth());
			}
		}
	}

	private void renderXarpusPoisonTileObjects(Graphics2D graphics, Xarpus xarpus)
	{
		for (GroundObject groundObject : xarpus.getGroundObjects())
		{
			LocalPoint localPoint = groundObject.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (xarpus.isPoisonTileObject(groundObject.getId()))
				{
					OverlayUtil2.renderPolygon(graphics, polygon, config.getXarpusPoisonAttackColor(), config.borderWidth());
				}
			}
		}
	}

	private void renderXarpusHealingPoolTileObjects(Graphics2D graphics, Xarpus xarpus)
	{
		for (GroundObject groundObject : xarpus.getGroundObjects())
		{
			LocalPoint localPoint = groundObject.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (xarpus.isHealingPoolTileObject(groundObject.getId()))
				{
					OverlayUtil2.renderPolygon(graphics, polygon, config.getXarpusHealingPoolColor(), config.borderWidth());
				}
			}
		}
	}

	private void renderXarpusTurnTimer(Graphics2D graphics, Xarpus xarpus)
	{
		if (xarpus.getRemainingTurnTime() <= 0)
		{
			return;
		}

		String text = TickUtil.convertTimerFormat(xarpus.getRemainingTurnTime(), config.getTimerFormat());

		BufferedImage image = ImageUtil.loadImageResource(TheatreOfBloodPlugin.class, "xarpus_turn.png");
		Point textLocation = xarpus.getNpc().getCanvasTextLocation(graphics, text, 0);
		if (textLocation == null)
		{
			return;
		}

		OverlayUtil2.renderImageAndTextLocation(graphics, image, textLocation, text, IMAGE_HEIGHT_OFFSET,
				TIMER_TEXT_WIDTH_OFFSET, Color.WHITE);
	}

	private void renderVerzikAttackTimerText(Graphics2D graphics, Verzik verzik)
	{
		if (verzik.getPhaseTimeTillNextAttack() < 0)
		{
			return;
		}

		String text = TickUtil.convertTimerFormat(verzik.getPhaseTimeTillNextAttack(), config.getTimerFormat());

		BufferedImage image = ImageUtil.loadImageResource(getClass(), "/skill_icons_small/attack.png");
		Point imageLocation = verzik.getNpc().getCanvasTextLocation(graphics, text, 0);
		if (imageLocation == null || image == null)
		{
			return;
		}

		OverlayUtil2.renderImageAndTextLocation(graphics, image, imageLocation, text,
				IMAGE_HEIGHT_OFFSET, TIMER_TEXT_WIDTH_OFFSET, Color.WHITE);
	}

	private void renderVerzikGreenOrbPoolAoeEffects(Graphics2D graphics, Verzik verzik)
	{
		for (GraphicsObject graphicsObject : verzik.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (verzik.isGreenOrbPool(graphicsObject.getId()))
				{
					OverlayUtil2.renderPolygon(graphics, polygon, config.getVerzikGreenOrbPoolColor(), config.borderWidth());
				}
			}
		}
	}

	private void renderVerzikNylocasAggressionText(Graphics2D graphics, Verzik verzik)
	{
		for (NPC npc : verzik.getNylocas())
		{
			if (npc.getInteracting() == null)
			{
				return;
			}

			String text = npc.getInteracting().getName();
			Point textLocation = npc.getCanvasTextLocation(graphics, text, 0);

			if (text == null || textLocation == null)
			{
				return;
			}

			Actor localPlayer = client.getLocalPlayer();
			if (localPlayer == null)
			{
				return;
			}

			Color color = text.equals(localPlayer.getName()) ? Color.RED : Color.WHITE;

			OverlayUtil.renderTextLocation(graphics, textLocation, text, color);
		}
	}
}