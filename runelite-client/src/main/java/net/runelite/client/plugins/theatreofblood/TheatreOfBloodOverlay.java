package net.runelite.client.plugins.theatreofblood;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.plugins.theatreofblood.encounters.*;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.*;

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
					renderXarpusPoisonAttackLandingAoeEffects(graphics, (Xarpus) encounter);
				}

				if (config.highlightXarpusPoisonAttackTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.XARPUS)
				{
					renderXarpusPoisonTileObjects(graphics, (Xarpus) encounter);
				}

				if (config.highlightXarpusHealingPoolTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.XARPUS)
				{
					renderXarpusHealingPoolTileObjects(graphics, (Xarpus) encounter);
				}

				// Verzik Vitur
				if (config.highlightVerzikSkullAttackTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.VERZIK)
				{
					renderVerzikSkullAoeEffects(graphics, (Verzik) encounter);
				}

				if (config.highlightVerzikGreenOrbPoolTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.VERZIK)
				{
					renderVerzikGreenOrbPoolAoeEffects(graphics, (Verzik) encounter);
				}
			}
			// Nylocas - does not always have a boss npc
			if (config.highlightAggressiveNylocas() && encounter.getEncounter() == TheatreOfBloodEncounters.NYLOCAS)
			{
				renderAggressiveNylocasHighlights(graphics, (Nylocas) encounter);
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

	private void renderSotetsegMazeTiles(Graphics2D graphics, Sotetseg sotetseg)
	{
		for (GameObject gameObject : sotetseg.getActiveMazeTiles())
		{
			LocalPoint localPoint = gameObject.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				OverlayUtil.renderPolygon(graphics, polygon, config.getSotetsegMazeTileColor());
			}
		}
	}

	private void renderXarpusPoisonAttackLandingAoeEffects(Graphics2D graphics, Xarpus xarpus)
	{
		for (GraphicsObject graphicsObject : xarpus.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (xarpus.isPoisonAttackLanding(graphicsObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getXarpusPoisonAttackColor());
				}
			}
		}
	}

	private void renderXarpusPoisonTileObjects(Graphics2D graphics, Xarpus xarpus)
	{
		for (GameObject gameObject : xarpus.getGameObjects())
		{
			LocalPoint localPoint = gameObject.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (xarpus.isPoisonTileObject(gameObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getXarpusPoisonAttackColor());
				}
			}
		}
	}

	private void renderXarpusHealingPoolTileObjects(Graphics2D graphics, Xarpus xarpus)
	{
		for (GameObject gameObject : xarpus.getGameObjects())
		{
			LocalPoint localPoint = gameObject.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (xarpus.isHealingPoolTileObject(gameObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getXarpusHealingPoolColor());
				}
			}
		}
	}

	private void renderVerzikSkullAoeEffects(Graphics2D graphics, Verzik verzik)
	{
		for (GraphicsObject graphicsObject : verzik.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (verzik.isSkullAttack(graphicsObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getVerzikSkullAttackColor());
				}
			}
		}
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