package net.runelite.client.plugins.alchemicalhydra;

import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Collection;

import static net.runelite.api.Perspective.getCanvasTileAreaPoly;

public class ChemicalVentsOverlay extends Overlay
{
	private static final int VENT_TIMER_IMAGE_HEIGHT_OFFSET = 15;
	private static final int VENT_TIMER_TEXT_WIDTH_OFFSET = 4;

	@Inject
	private AlchemicalHydraConfig config;

	private Client client;
	private AlchemicalHydraPlugin plugin;

	@Inject
	public ChemicalVentsOverlay(Client client, AlchemicalHydraPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
	}

	private BufferedImage getChemicalVentIcon(AlchemicalHydra.Phase phase)
	{
		switch (phase)
		{
			case GREEN:
				return ImageUtil.getResourceStreamFromClass(AlchemicalHydraPlugin.class, "chemical_vent_red.png");
			case BLUE:
				return ImageUtil.getResourceStreamFromClass(AlchemicalHydraPlugin.class, "chemical_vent_green.png");
			case RED:
				return ImageUtil.getResourceStreamFromClass(AlchemicalHydraPlugin.class, "chemical_vent_blue.png");
		}
		return null;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		ChemicalVents chemicalVents = plugin.getChemicalVents();
		AlchemicalHydra alchemicalHydra = plugin.getAlchemicalHydra();
		if (chemicalVents != null && alchemicalHydra != null)
		{
			if (config.highlightChemicalVentStatus())
			{
				renderChemicalPoolsStatus(graphics, alchemicalHydra);
			}

			if (config.displayChemicalVentsTimer())
			{
				renderChemicalPoolsTickTimer(graphics, chemicalVents, alchemicalHydra);
			}
		}
		return null;
	}

	private void renderChemicalPoolsStatus(Graphics2D graphics, AlchemicalHydra alchemicalHydra)
	{
		if (alchemicalHydra.isWeakened())
		{
			return;
		}

		Collection<WorldPoint> poolWorldPoints = WorldPoint.toLocalInstance(client,
				ChemicalVents.getChemicalPoolWorldPointForPhase(alchemicalHydra.getCurrentPhase()));
		if (poolWorldPoints.size() > 1)
		{
			return;
		}

		WorldPoint worldPoint = null;
		for (WorldPoint point : poolWorldPoints)
		{
			worldPoint = point;
		}

		LocalPoint localPoint = worldPoint != null ? LocalPoint.fromWorld(client, worldPoint) : null;
		if (localPoint == null)
		{
			return;
		}

		final Polygon polygon = getCanvasTileAreaPoly(client, localPoint, 4);
		if (polygon == null)
		{
			return;
		}

		Color color = alchemicalHydra.getNpc().getWorldArea().intersectsWith(
				new WorldArea(worldPoint, 1, 1)) ? config.getOnChemicalPoolColor() : config.getNotOnChemicalPoolColor();
		graphics.setColor(color);
		graphics.setStroke(new BasicStroke(3));
		graphics.draw(polygon);
	}

	private void renderChemicalPoolsTickTimer(Graphics2D graphics, ChemicalVents chemicalVents, AlchemicalHydra alchemicalHydra)
	{
		int ticksTillVentActivation = chemicalVents.getNextVentEntityChangeTick() - client.getTickCount();
		if (alchemicalHydra.isWeakened() || alchemicalHydra.getCurrentPhase().equals(AlchemicalHydra.Phase.JAD) ||
				ticksTillVentActivation < 0)
		{
			return;
		}

		String text = String.valueOf(ticksTillVentActivation);
		GameObject chemicalVent = chemicalVents.getChemicalVents().get(alchemicalHydra.getCurrentPhase());
		if (chemicalVent == null)
		{
			return;
		}

		BufferedImage image = getChemicalVentIcon(alchemicalHydra.getCurrentPhase());
		Point imageLocation = chemicalVent.getCanvasTextLocation(graphics, text, 0);
		if (imageLocation == null || image == null)
		{
			return;
		}

		OverlayUtil.renderImageAndTextLocation(graphics, image, imageLocation, text,
				VENT_TIMER_IMAGE_HEIGHT_OFFSET, VENT_TIMER_TEXT_WIDTH_OFFSET, Color.WHITE);
	}
}
