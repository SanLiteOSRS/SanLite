package net.runelite.client.plugins.nightmareofashihama;

import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;

public class NightmareOfAshihamaOverlay extends Overlay
{
	private static final Color COLOR_ICON_BACKGROUND = new Color(0, 0, 0, 128);
	private static final Color COLOR_ICON_BORDER = new Color(0, 0, 0, 255);
	private static final int ICON_WIDTH = 25;
	private static final int ICON_HEIGHT = 25;
	private static final int OVERLAY_ICON_DISTANCE = 30;
	private static final int OVERLAY_ICON_MARGIN = 12;

	private Client client;
	private NightmareOfAshihamaPlugin plugin;

	@Inject
	private NightmareOfAshihamaConfig config;

	@Inject
	private SkillIconManager iconManager;

	@Inject
	public NightmareOfAshihamaOverlay(Client client, NightmareOfAshihamaPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
	}

	private BufferedImage getAttackStyleIcon(NightmareOfAshihama.AttackStyle attackStyle)
	{
		switch (attackStyle)
		{
			case MELEE:
				return iconManager.getSkillImage(Skill.ATTACK);
			case RANGED:
				return ImageUtil.resizeImage(iconManager.getSkillImage(Skill.RANGED), 25, 23);
			case MAGIC:
				return iconManager.getSkillImage(Skill.MAGIC);
		}
		return null;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		NightmareOfAshihama nightmare = plugin.getNightmare();
		if (nightmare != null)
		{
			if (config.displayCurrentAttack())
			{
				renderCurrentAttackOverhead(graphics, nightmare);
			}

			if (config.highlightActiveTotems())
			{
				renderActiveTotemsHighlights(graphics, nightmare);
			}

			if (config.highlightGhostAttackTiles())
			{
				renderGhostAttackTileMarkers(graphics, nightmare);
			}
		}
		return null;
	}

	private void renderCurrentAttackOverhead(Graphics2D graphics, NightmareOfAshihama nightmare)
	{
		if (nightmare.getCurrentAttackStyle() == null)
		{
			return;
		}

		LocalPoint localPoint = nightmare.getNpc().getLocalLocation();
		if (localPoint != null)
		{
			net.runelite.api.Point point = Perspective.localToCanvas(client, localPoint, client.getPlane(),
					nightmare.getNpc().getLogicalHeight() + 16);

			if (point != null)
			{
				point = new Point(point.getX(), point.getY());
				int totalWidth = OVERLAY_ICON_MARGIN;
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
						getAttackStyleIcon(nightmare.getCurrentAttackStyle()),
						point.getX() - totalWidth / 2 + currentPosX,
						point.getY() - ICON_HEIGHT / 2 - OVERLAY_ICON_DISTANCE,
						null);
			}
		}
	}

	private void renderActiveTotemsHighlights(Graphics2D graphics, NightmareOfAshihama nightmare)
	{
		for (NPC activeTotem : nightmare.getActiveTotems())
		{
			Shape objectClickbox = activeTotem.getConvexHull();

			if (objectClickbox == null)
			{
				continue;
			}
			OverlayUtil.renderPolygon(graphics, objectClickbox, config.getActiveTotemColor());
		}
	}

	private void renderGhostAttackTileMarkers(Graphics2D graphics, NightmareOfAshihama nightmare)
	{
		for (GraphicsObject graphicsObject : nightmare.getGraphicObjects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon == null)
			{
				return;
			}

			if (nightmare.isGhostAttackGraphicsObjectId(graphicsObject.getId()))
			{
				OverlayUtil.renderPolygon(graphics, polygon, config.getGhostAttackColor());
			}
		}
	}
}
