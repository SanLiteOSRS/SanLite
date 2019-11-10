/*
 * Copyright (c) 2019, Siraz
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
package net.runelite.client.plugins.theatreofblood;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.plugins.theatreofblood.encounters.*;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class TheatreOfBloodOverlay extends Overlay
{

	private Client client;
	private TheatreOfBloodPlugin plugin;

	@Inject
	private TheatreOfBloodConfig config;

	@Inject
	public TheatreOfBloodOverlay(Client client, TheatreOfBloodPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
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
				if (config.highlightBloodSplatAttackTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.SUGADINTI_MAIDEN)
				{
					renderMaidenBloodSplatAoeEffects(graphics, (SugadintiMaiden) encounter);
				}

				if (config.highlightBloodSpawnTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.SUGADINTI_MAIDEN)
				{
					renderMaidenBloodSpawnAoeEffects(graphics, (SugadintiMaiden) encounter);
				}

				// Pestilent Bloat
				if (config.highlightBloatHandAttackTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.PESTILENT_BLOAT)
				{
					renderBloatHandAoeEffects(graphics, (PestilentBloat) encounter);
				}

				if (config.highlightBloatStatus() && encounter.getEncounter() == TheatreOfBloodEncounters.PESTILENT_BLOAT)
				{
					renderPestilentBloatHull(graphics, (PestilentBloat) encounter);
				}

				if (config.displayBloatSleepTimer() && encounter.getEncounter() == TheatreOfBloodEncounters.PESTILENT_BLOAT)
				{
					renderPestilentBloatTimerText(graphics, (PestilentBloat) encounter);
				}

				// Sotetseg
				if (config.highlightSotetsegRedMazeTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.SOTETSEG)
				{
					renderSotetsegMazeTiles(graphics, (Sotetseg) encounter);
				}

				// Xarpus
				if (config.highlightXarpusPoisonAttackTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.XARPUS)
				{
					renderXarpusPoisonTileObjects(graphics, (Xarpus) encounter);
				}

				if (config.highlightXarpusHealingPoolTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.XARPUS)
				{
					renderXarpusHealingPoolTileObjects(graphics, (Xarpus) encounter);
				}

				if (config.displayXarpusTurnTimer() && encounter.getEncounter() == TheatreOfBloodEncounters.XARPUS)
				{
					renderXarpusTurnTimerText(graphics, (Xarpus) encounter);
				}

				// Verzik Vitur
				if (config.highlightVerzikGreenOrbPoolTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.VERZIK_VITUR)
				{
					renderVerzikGreenOrbPoolAoeEffects(graphics, (Verzik) encounter);
				}
			}
			// Nylocas - does not always have a boss npc
			if (config.highlightAggressiveNylocas() && encounter.getEncounter() == TheatreOfBloodEncounters.NYLOCAS)
			{
				renderAggressiveNylocasHighlights(graphics, (Nylocas) encounter);
			}
			if (config.displayNylocasLifeTimerText() && encounter.getEncounter() == TheatreOfBloodEncounters.NYLOCAS)
			{
				renderNylocasLifeTimerText(graphics, (Nylocas) encounter);
			}
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
					OverlayUtil.renderPolygon(graphics, polygon, config.getBloodSplatAttackColor());
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
					OverlayUtil.renderPolygon(graphics, polygon, config.getBloodSpawnBloodColor());
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
					OverlayUtil.renderPolygon(graphics, polygon, config.getBloatHandAttackColor());
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
		else
		{
			color = config.getBloatAwakeColor();
		}
		OverlayUtil.renderPolygon(graphics, objectClickbox, color);
	}

	private void renderPestilentBloatTimerText(Graphics2D graphics, PestilentBloat pestilentBloat)
	{
		if (pestilentBloat.getRemainingSleepClientTicks() < 0)
		{
			return;
		}

		int remainingDuration = pestilentBloat.getRemainingSleepClientTicks() / 5;
		String text = Math.abs(remainingDuration / 10) + "." + (Math.abs(remainingDuration) % 10);

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
				OverlayUtil.renderPolygon(graphics, npcClickbox, config.getAggressiveNylocasColor());
			}
		}
	}

	private void renderNylocasLifeTimerText(Graphics2D graphics, Nylocas nylocas)
	{
		if (nylocas.getAliveNylocas() == null)
		{
			return;
		}

		for (NPC aliveNylocas : new ArrayList<>(nylocas.getAliveNylocas().keySet()))
		{
			List<Integer> timers = nylocas.getAliveNylocas().get(aliveNylocas);

			//if (timers.get(2) < 500)
			//{
				int remainingDuration = timers.get(2) / 5;
				String text = Math.abs(remainingDuration / 10) + "." + (Math.abs(remainingDuration) % 10);

				Point textLocation = aliveNylocas.getCanvasTextLocation(graphics, text, 0);
				if (textLocation == null)
				{
					return;
				}

				OverlayUtil.renderTextLocation(graphics, textLocation, text, Color.WHITE);
			//}
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
				OverlayUtil.renderPolygon(graphics, polygon, config.getSotetsegMazeTileColor());
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
					OverlayUtil.renderPolygon(graphics, polygon, config.getXarpusPoisonAttackColor());
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
					OverlayUtil.renderPolygon(graphics, polygon, config.getXarpusHealingPoolColor());
				}
			}
		}
	}

	private void renderXarpusTurnTimerText(Graphics2D graphics, Xarpus xarpus)
	{
		if (xarpus.getRemainingTurnTime() <= 0)
		{
			return;
		}

		int remainingDuration = xarpus.getRemainingTurnTime() / 5;
		String text = Math.abs(remainingDuration / 10) + "." + (Math.abs(remainingDuration) % 10);

		Point textLocation = xarpus.getNpc().getCanvasTextLocation(graphics, text, 0);
		if (textLocation == null)
		{
			return;
		}

		OverlayUtil.renderTextLocation(graphics, textLocation, text, Color.WHITE);
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
					OverlayUtil.renderPolygon(graphics, polygon, config.getVerzikGreenOrbPoolColor());
				}
			}
		}
	}
}