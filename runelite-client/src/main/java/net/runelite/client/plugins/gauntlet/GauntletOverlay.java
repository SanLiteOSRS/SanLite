package net.runelite.client.plugins.gauntlet;

import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class GauntletOverlay extends Overlay
{

	private static final Color COLOR_ICON_BACKGROUND = new Color(0, 0, 0, 128);
	private static final Color COLOR_ICON_BORDER = new Color(0, 0, 0, 255);
	private static final Color COLOR_ICON_BORDER_FILL = new Color(219, 175, 0, 255);
	private static final int ICON_WIDTH = 25;
	private static final int ICON_HEIGHT = 25;
	private static final int OVERLAY_ICON_DISTANCE = 60;
	private static final int OVERLAY_ICON_MARGIN = 12;

	private Client client;
	private GauntletPlugin plugin;

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

	private BufferedImage getIcon(GauntletBoss.AttackStyle attackStyle)
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

	@Override
	public Dimension render(Graphics2D graphics)
	{
		GauntletBoss gauntletBoss = plugin.getGauntletBoss();
		if (gauntletBoss != null && gauntletBoss.getCurrentAttackStyle() != null)
		{
			if (config.highlightCrystalAttackTiles())
			{
				renderCrystalEffects(graphics, gauntletBoss);
			}

			if (config.showAttackStyleCounter())
			{
				LocalPoint localPoint = gauntletBoss.getNpc().getLocalLocation();
				if (localPoint != null)
				{
					Point point = Perspective.localToCanvas(client, localPoint, client.getPlane(),
							gauntletBoss.getNpc().getLogicalHeight() + 16);
					if (point != null)
					{
						point = new Point(point.getX(), point.getY());
						List<BufferedImage> icons = new ArrayList<>();
						int totalWidth = OVERLAY_ICON_MARGIN;

						GauntletBoss.AttackStyle attackStyle = gauntletBoss.getCurrentAttackStyle();
						if (attackStyle != null)
						{
							BufferedImage currentAttackStyleIcon = getIcon(attackStyle);
							icons.add(currentAttackStyleIcon);
							totalWidth += ICON_WIDTH;
						}
						int bgPadding = 4;
						int currentPosX = 0;
						for (BufferedImage icon : icons)
						{
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

							Arc2D.Double arc = new Arc2D.Double(
									point.getX() - totalWidth / 2 + currentPosX - bgPadding,
									point.getY() - ICON_HEIGHT / 2 - OVERLAY_ICON_DISTANCE - bgPadding,
									ICON_WIDTH + bgPadding * 2,
									ICON_HEIGHT + bgPadding * 2,
									90.0,
									-360.0 * (GauntletBoss.ATTACKS_PER_SWITCH -
											gauntletBoss.getAttacksUntilSwitch()) / GauntletBoss.ATTACKS_PER_SWITCH,
									Arc2D.OPEN);
							graphics.draw(arc);
							currentPosX += ICON_WIDTH + OVERLAY_ICON_MARGIN;
						}
					}
				}
			}
		}
		return null;
	}

	private void renderCrystalEffects(Graphics2D graphics, GauntletBoss gauntletBoss)
	{
		for (NPC npc : gauntletBoss.getCrystalEffects())
		{
			LocalPoint localPoint = npc.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (gauntletBoss.isNpcCrystalAttack(npc.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getCrystalAttackColor());
				}
			}
		}
	}
}