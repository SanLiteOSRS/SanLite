/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
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
package net.sanlite.client.ui.overlay;

import com.google.common.base.Strings;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.util.ColorUtil;


/**
 * Created by Kyle Fricilone on Jun 09, 2017.
 */
public class OverlayUtil2
{
	private static final int MINIMAP_DOT_RADIUS = 4;
	private static final double UNIT = Math.PI / 1024.0d;

	public static void renderPolygon(Graphics2D graphics, Shape poly, Color color)
	{
		graphics.setColor(color);
		final Stroke originalStroke = graphics.getStroke();
		graphics.setStroke(new BasicStroke(2));
		graphics.draw(poly);
		graphics.setColor(new Color(0, 0, 0, 50));
		graphics.fill(poly);
		graphics.setStroke(originalStroke);
	}

	public static void renderPolygon(Graphics2D graphics, Shape poly, Color color, int strokeSize)
	{
		graphics.setColor(color);
		final Stroke originalStroke = graphics.getStroke();
		graphics.setStroke(new BasicStroke(strokeSize));
		graphics.draw(poly);
		graphics.setColor(new Color(0, 0, 0, 50));
		graphics.fill(poly);
		graphics.setStroke(originalStroke);
	}

	public static void renderPolygon(Graphics2D graphics, Shape poly, Color color, double strokeSize)
	{
		graphics.setColor(color);
		final Stroke originalStroke = graphics.getStroke();
		graphics.setStroke(new BasicStroke((float) strokeSize));
		graphics.draw(poly);
		graphics.setColor(new Color(0, 0, 0, 50));
		graphics.fill(poly);
		graphics.setStroke(originalStroke);
	}

	/**
	 * Renders polygon with the given color as the alpha fill.
	 * @param graphics graphics object
	 * @param poly polygon
	 * @param color	color
	 * @param strokeSize outer stroke size
	 */
	public static void renderPolygonAlpha(Graphics2D graphics, Shape poly, Color color, double strokeSize)
	{
		graphics.setColor(color);
		graphics.setStroke(new BasicStroke((float) strokeSize));
		graphics.draw(poly);
		graphics.setColor(ColorUtil.colorWithAlpha(color, 20));
		graphics.fill(poly);
	}

	public static void renderMinimapLocation(Graphics2D graphics, Point mini, Color color)
	{
		graphics.setColor(Color.BLACK);
		graphics.fillOval(mini.getX() - MINIMAP_DOT_RADIUS / 2, mini.getY() - MINIMAP_DOT_RADIUS / 2 + 1, MINIMAP_DOT_RADIUS, MINIMAP_DOT_RADIUS);
		graphics.setColor(ColorUtil.colorWithAlpha(color, 0xFF));
		graphics.fillOval(mini.getX() - MINIMAP_DOT_RADIUS / 2, mini.getY() - MINIMAP_DOT_RADIUS / 2, MINIMAP_DOT_RADIUS, MINIMAP_DOT_RADIUS);
	}

	public static void renderMinimapRect(Client client, Graphics2D graphics, Point center, int width, int height, Color color)
	{
		double angle = client.getMapAngle() * UNIT;

		graphics.setColor(color);
		graphics.rotate(angle, center.getX(), center.getY());
		graphics.drawRect(center.getX() - width / 2, center.getY() - height / 2, width, height);
		graphics.rotate(-angle , center.getX(), center.getY());
	}

	public static void renderTextLocation(Graphics2D graphics, Point txtLoc, String text, Color color)
	{
		if (Strings.isNullOrEmpty(text))
		{
			return;
		}

		int x = txtLoc.getX();
		int y = txtLoc.getY();

		graphics.setColor(Color.BLACK);
		graphics.drawString(text, x + 1, y + 1);

		graphics.setColor(ColorUtil.colorWithAlpha(color, 0xFF));
		graphics.drawString(text, x, y);
	}

	public static void renderImageLocation(Client client, Graphics2D graphics, LocalPoint localPoint, BufferedImage image, int zOffset)
	{
		net.runelite.api.Point imageLocation = Perspective.getCanvasImageLocation(client, localPoint, image, zOffset);
		if (imageLocation != null)
		{
			renderImageLocation(graphics, imageLocation, image);
		}
	}

	public static void renderImageAndTextLocation(Graphics2D graphics, BufferedImage image, Point imageLoc,
													String text, int imageYOffset, int textXOffset, Color color)
	{
		graphics.drawImage(image, imageLoc.getX(), imageLoc.getY() - imageYOffset, null);
		Point textLocation = new Point(imageLoc.getX() + image.getWidth() + textXOffset, imageLoc.getY());
		OverlayUtil2.renderTextLocation(graphics, textLocation, text, color);
	}

	public static void renderImageLocation(Graphics2D graphics, Point imgLoc, BufferedImage image)
	{
		int x = imgLoc.getX();
		int y = imgLoc.getY();

		graphics.drawImage(image, x, y, null);
	}

	public static void renderActorOverlay(Graphics2D graphics, Actor actor, String text, Color color)
	{
		Polygon poly = actor.getCanvasTilePoly();
		if (poly != null)
		{
			renderPolygon(graphics, poly, color);
		}

		Point textLocation = actor.getCanvasTextLocation(graphics, text, actor.getLogicalHeight() + 40);
		if (textLocation != null)
		{
			renderTextLocation(graphics, textLocation, text, color);
		}
	}

	public static void renderActorOverlayImage(Graphics2D graphics, Actor actor, BufferedImage image, Color color, int zOffset)
	{
		Polygon poly = actor.getCanvasTilePoly();
		if (poly != null)
		{
			renderPolygon(graphics, poly, color);
		}

		Point imageLocation = actor.getCanvasImageLocation(image, zOffset);
		if (imageLocation != null)
		{
			renderImageLocation(graphics, imageLocation, image);
		}
	}

	public static void renderTileOverlay(Graphics2D graphics, TileObject tileObject, String text, Color color)
	{
		Polygon poly = tileObject.getCanvasTilePoly();
		if (poly != null)
		{
			renderPolygon(graphics, poly, color);
		}

		Point minimapLocation = tileObject.getMinimapLocation();
		if (minimapLocation != null)
		{
			renderMinimapLocation(graphics, minimapLocation, color);
		}

		Point textLocation = tileObject.getCanvasTextLocation(graphics, text, 0);
		if (textLocation != null)
		{
			renderTextLocation(graphics, textLocation, text, color);
		}
	}

	public static void renderTileOverlay(Client client, Graphics2D graphics, LocalPoint localLocation, BufferedImage image, Color color)
	{
		Polygon poly = Perspective.getCanvasTilePoly(client, localLocation);
		if (poly != null)
		{
			renderPolygon(graphics, poly, color);
		}

		renderImageLocation(client, graphics, localLocation, image, 0);
	}

	public static void renderHoverableArea(Graphics2D graphics, Shape area, net.runelite.api.Point mousePosition, Color fillColor, Color borderColor, Color borderHoverColor)
	{
		if (area != null)
		{
			if (area.contains(mousePosition.getX(), mousePosition.getY()))
			{
				graphics.setColor(borderHoverColor);
			}
			else
			{
				graphics.setColor(borderColor);
			}

			graphics.draw(area);
			graphics.setColor(fillColor);
			graphics.fill(area);
		}
	}

	public static void renderCountCircle(Graphics2D graphics, int totalCount, int currentCount, Point point,
											BufferedImage image, int imageMargin, int imageWidth, int imageHeight,
											int imageDistance)
	{
		renderCountCircle(graphics, totalCount, currentCount, point, image, imageMargin, imageWidth, imageHeight,
				imageDistance, new Color(219, 175, 0, 255), new Color(0, 0, 0, 128),
				new Color(0, 0, 0, 255));
	}

	public static void renderCountCircle(Graphics2D graphics, int totalCount, int currentCount, Point point,
											BufferedImage image, int imageMargin, int imageWidth, int imageHeight,
											int imageDistance, Color countColor)
	{
		renderCountCircle(graphics, totalCount, currentCount, point, image, imageMargin, imageWidth, imageHeight,
				imageDistance, countColor, new Color(0, 0, 0, 128), new Color(0, 0, 0, 255));
	}

	public static void renderCountCircle(Graphics2D graphics, int totalCount, int currentCount, Point point,
											BufferedImage image, int imageMargin, int imageWidth, int imageHeight,
											int imageDistance, Color countColor, Color innerOvalColor, Color outerOvalColor)
	{
		if (point == null)
		{
			return;
		}

		point = new Point(point.getX(), point.getY());
		int totalWidth = imageMargin;
		totalWidth += imageWidth;

		int bgPadding = 4;
		int currentPosX = 0;

		graphics.setStroke(new BasicStroke(2));
		graphics.setColor(innerOvalColor);
		graphics.fillOval(
				point.getX() - totalWidth / 2 + currentPosX - bgPadding,
				point.getY() - imageHeight / 2 - imageDistance - bgPadding,
				imageWidth + bgPadding * 2,
				imageHeight + bgPadding * 2);

		graphics.setColor(outerOvalColor);
		graphics.drawOval(
				point.getX() - totalWidth / 2 + currentPosX - bgPadding,
				point.getY() - imageHeight / 2 - imageDistance - bgPadding,
				imageWidth + bgPadding * 2,
				imageHeight + bgPadding * 2);

		graphics.drawImage(
				image,
				point.getX() - totalWidth / 2 + currentPosX,
				point.getY() - imageHeight / 2 - imageDistance,
				null);

		graphics.setColor(countColor);

		Arc2D.Double arc = new Arc2D.Double(
				point.getX() - totalWidth / 2 + currentPosX - bgPadding,
				point.getY() - imageHeight / 2 - imageDistance - bgPadding,
				imageWidth + bgPadding * 2,
				imageHeight + bgPadding * 2,
				90.0,
				-360.0 * (totalCount - currentCount) / totalCount,
				Arc2D.OPEN);
		graphics.draw(arc);
	}

	public static void setGraphicProperties(Graphics2D graphics)
	{
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	}

	public static void renderTextLocation(Graphics2D graphics, String txtString, int fontSize, int fontStyle, Color fontColor, Point canvasPoint, boolean shadows, int yOffset)
	{
		graphics.setFont(new Font("RuneScape", fontStyle, fontSize));
		if (canvasPoint != null)
		{
			final Point canvasCenterPoint = new Point(
					canvasPoint.getX(),
					canvasPoint.getY() + yOffset);
			final Point canvasCenterPoint_shadow = new Point(
					canvasPoint.getX() + 1,
					canvasPoint.getY() + 1);
			if (shadows)
			{
				renderTextLocation(graphics, canvasCenterPoint_shadow, txtString, Color.BLACK);
			}
			renderTextLocation(graphics, canvasCenterPoint, txtString, fontColor);
		}
	}
}
