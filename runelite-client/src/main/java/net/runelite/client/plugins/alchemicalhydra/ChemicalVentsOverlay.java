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

	private final Client client;
	private final AlchemicalHydraPlugin plugin;

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
		if (alchemicalHydra.isWeakened() || alchemicalHydra.getCurrentPhase().equals(AlchemicalHydra.Phase.JAD))
		{
			return;
		}

		Collection<WorldPoint> poolWorldPoints = WorldPoint.toLocalInstance(client,
				ChemicalVents.getChemicalVentWorldPointForPhase(alchemicalHydra.getCurrentPhase()));
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
		int remainingRoomEnteredGraceTick = chemicalVents.getRoomEnteredGraceExpiredTick() - client.getTickCount();
		int ticksTillVentActivation = chemicalVents.getNextVentEntityChangeTick() - client.getTickCount();
		if (alchemicalHydra.getCurrentPhase().equals(AlchemicalHydra.Phase.JAD) || ticksTillVentActivation < 0 ||
				remainingRoomEnteredGraceTick > 0)
		{
			return;
		}

		String text = String.valueOf(ticksTillVentActivation);

		AlchemicalHydra.Phase phase = alchemicalHydra.isWeakened()
				? alchemicalHydra.getNextPhase(alchemicalHydra.getCurrentPhase())
				: alchemicalHydra.getCurrentPhase();

		GameObject chemicalVent = chemicalVents.getChemicalVents().get(phase);
		if (chemicalVent == null)
		{
			return;
		}

		BufferedImage image = getChemicalVentIcon(phase);
		Point imageLocation = chemicalVent.getCanvasTextLocation(graphics, text, 0);
		if (imageLocation == null || image == null)
		{
			return;
		}

		OverlayUtil.renderImageAndTextLocation(graphics, image, imageLocation, text,
				VENT_TIMER_IMAGE_HEIGHT_OFFSET, VENT_TIMER_TEXT_WIDTH_OFFSET, Color.WHITE);
	}
}
