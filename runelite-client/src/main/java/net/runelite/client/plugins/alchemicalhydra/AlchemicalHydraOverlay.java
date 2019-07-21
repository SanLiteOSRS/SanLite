package net.runelite.client.plugins.alchemicalhydra;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static net.runelite.api.Perspective.getCanvasTileAreaPoly;

@Slf4j
public class AlchemicalHydraOverlay extends Overlay
{

	private static final Color COLOR_ICON_BACKGROUND = new Color(0, 0, 0, 128);
	private static final Color COLOR_ICON_BORDER = new Color(0, 0, 0, 255);
	private static final Color COLOR_ICON_BORDER_FILL = new Color(219, 175, 0, 255);
	private static final Color COLOR_POISON_MARKER = new Color(159, 219, 0, 255);
	private static final Color COLOR_LIGHTNING_MARKER = new Color(3, 133, 219, 255);
	private static final Color COLOR_FIRE_MARKER = new Color(219, 116, 0, 255);
	private static final int ICON_WIDTH = 25;
	private static final int ICON_HEIGHT = 25;
	private static final int OVERLAY_ICON_DISTANCE = 30;
	private static final int OVERLAY_ICON_MARGIN = 12;

	private Client client;
	private AlchemicalHydraPlugin plugin;

	@Inject
	private AlchemicalHydraConfig config;

	@Inject
	private SkillIconManager iconManager;


	@Inject
	public AlchemicalHydraOverlay(Client client, AlchemicalHydraPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
	}

	private BufferedImage getIcon(AlchemicalHydra.AttackStyle attackStyle)
	{
		switch (attackStyle)
		{
			case RANGED:
				return iconManager.getSkillImage(Skill.RANGED);
			case MAGIC:
				return iconManager.getSkillImage(Skill.MAGIC);
			case POISON:
				return ImageUtil.getResourceStreamFromClass(AlchemicalHydraPlugin.class, "poison_attack.png");
			case LIGHTNING:
				return ImageUtil.getResourceStreamFromClass(AlchemicalHydraPlugin.class, "lightning_attack.png");
			case FIRE:
				return ImageUtil.getResourceStreamFromClass(AlchemicalHydraPlugin.class, "fire_attack.png");
		}
		return null;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		AlchemicalHydra alchemicalHydra = plugin.getAlchemicalHydra();
		if (alchemicalHydra != null && alchemicalHydra.getCurrentAttackStyle() != null)
		{
			if (config.highlightSpecialAttackTiles())
			{
				renderAoeEffects(graphics, alchemicalHydra);
			}

			if (config.highlightChemicalFountainStatus())
			{
				renderChemicalPoolsStatus(graphics, alchemicalHydra);
			}

			if (config.showAttackStyleCounter())
			{
				LocalPoint localPoint = alchemicalHydra.getNpc().getLocalLocation();
				if (localPoint != null)
				{
					net.runelite.api.Point point = Perspective.localToCanvas(client, localPoint, client.getPlane(),
							alchemicalHydra.getNpc().getLogicalHeight() + 16);
					if (point != null)
					{
						point = new Point(point.getX(), point.getY());
						List<BufferedImage> icons = new ArrayList<>();
						int totalWidth = OVERLAY_ICON_MARGIN;

						AlchemicalHydra.AttackStyle specialAttackStyle = alchemicalHydra.getCurrentSpecialAttackStyle();
						if (specialAttackStyle != null)
						{
							BufferedImage specialAttackStyleIcon = getIcon(specialAttackStyle);
							icons.add(specialAttackStyleIcon);
							totalWidth += ICON_WIDTH;
						}

						AlchemicalHydra.AttackStyle attackStyle = alchemicalHydra.getCurrentAttackStyle();
						if (attackStyle != null)
						{
							BufferedImage currentAttackStyleIcon = getIcon(attackStyle);
							icons.add(currentAttackStyleIcon);
							totalWidth += ICON_WIDTH;
						}
						int bgPadding = 4;
						int currentPosX = 0;
						for (int i = 0; i < icons.size(); i++)
						{
							BufferedImage icon = icons.get(i);
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
									icon,
									point.getX() - totalWidth / 2 + currentPosX,
									point.getY() - ICON_HEIGHT / 2 - OVERLAY_ICON_DISTANCE,
									null);

							graphics.setColor(COLOR_ICON_BORDER_FILL);

							// Don't render arc for special attack because special attack icon is always first
							if (icons.size() == 1 || icons.size() == 2 && i == 1)
							{
								Arc2D.Double arc = new Arc2D.Double(
										point.getX() - totalWidth / 2 + currentPosX - bgPadding,
										point.getY() - ICON_HEIGHT / 2 - OVERLAY_ICON_DISTANCE - bgPadding,
										ICON_WIDTH + bgPadding * 2,
										ICON_HEIGHT + bgPadding * 2,
										90.0,
										-360.0 * (AlchemicalHydra.ATTACKS_PER_SWITCH -
												alchemicalHydra.getAttacksUntilSwitch()) / AlchemicalHydra.ATTACKS_PER_SWITCH,
										Arc2D.OPEN);
								graphics.draw(arc);
							}
							currentPosX += ICON_WIDTH + OVERLAY_ICON_MARGIN;
						}
					}
				}
			}
		}
		return null;
	}

	private void renderAoeEffects(Graphics2D graphics, AlchemicalHydra alchemicalHydra)
	{
		for (GraphicsObject graphicsObject : alchemicalHydra.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_BEFORE_LANDING ||
						graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_1 ||
						graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_2 ||
						graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_3 ||
						graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_4 ||
						graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_5 ||
						graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_6 ||
						graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_7 ||
						graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_POISON_SPLAT_8)
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getPoisonAttackColor());
				}
				else if (graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_LIGHTNING_ATTACK_1 ||
						graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_LIGHTNING_ATTACK_2)
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getLightningAttackColor());
				}
				else if (graphicsObject.getId() == GraphicID.ALCHEMICAL_HYDRA_FIRE_ATTACK)
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getFireAttackColor());
				}
			}
		}
	}

	private void renderChemicalPoolsStatus(Graphics2D graphics, AlchemicalHydra alchemicalHydra)
	{
		if (alchemicalHydra.isWeakened())
		{
			return;
		}

		Collection<WorldPoint> poolWorldPoints = WorldPoint.toLocalInstance(client, alchemicalHydra.getChemicalPoolWorldPointForPhase());

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
}