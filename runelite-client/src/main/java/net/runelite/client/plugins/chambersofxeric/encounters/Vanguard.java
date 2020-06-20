package net.runelite.client.plugins.chambersofxeric.encounters;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.game.NPCManager;
import net.runelite.client.util.Text;

import javax.inject.Inject;

public class Vanguard
{

	Vanguard(NPC npc)
	{
		this.vanguard = npc;
		this.vangStyle = Style.UNKNOWN;
	}

	public enum Style
	{
		MAGE,
		RANGE,
		MELEE,
		UNKNOWN
	}

	@Inject
	Client client;

	@Getter
	@Setter
	Style vangStyle;

	@Getter
	@Setter
	int vangPercent;

	@Getter
	@Setter
	NPC vanguard;

	@Getter
	int maxHP = 0;


	/*
	public static boolean isMageVanguard(int npcID)
	{
		return npcID == NpcID.VANGUARD_7529;
	}

	public static boolean isRangeVanguard(int npcID)
	{
		return npcID == NpcID.VANGUARD_7528;
	}

	public static boolean isMeleeVanguard(int npcID)
	{
		return npcID == NpcID.VANGUARD_7527;
	}

	 */

	public void setVanguardStyle()
	{
		if (vangStyle.equals(Style.UNKNOWN))
		{
			if (vanguard == null)
			{
				System.out.println("null vang");
			}
			else
			{
				switch (vanguard.getId())
				{
					case NpcID.VANGUARD_7529:
						vangStyle = Style.MAGE;
						System.out.println("Vanguard " + vanguard.getId() + " set to style " + vangStyle);
						break;
					case NpcID.VANGUARD_7528:
						vangStyle = Style.RANGE;
						System.out.println("Vanguard " + vanguard.getId() + " set to style " + vangStyle);
						break;
					case NpcID.VANGUARD_7527:
						vangStyle = Style.MELEE;
						System.out.println("Vanguard " + vanguard.getId() + " set to style " + vangStyle);
						break;
				}
			}
		}
	}

	public void updateHP()
	{
		float percent = (float) vanguard.getHealthRatio() / (float) getHealth() * 100.0F;
		vangPercent = (int) percent;
	}

	private int getHealth()
	{
		int lastMaxHealth;

		if (vanguard != null)
		{
			lastMaxHealth = maxHP;


			int lastRatio = 0;
			int lastHealthScale = 0;
			if (vanguard.getHealthScale() > 0)
			{
				lastRatio = vanguard.getHealthRatio();
				lastHealthScale = vanguard.getHealthScale();

			}

			// Health bar
			if (lastRatio >= 0 && lastHealthScale > 0)
			{
				// This is the reverse of the calculation of healthRatio done by the server
				// which is: healthRatio = 1 + (healthScale - 1) * health / maxHealth (if health > 0, 0 otherwise)
				// It's able to recover the exact health if maxHealth <= healthScale.
				int health = 0;
				if (lastRatio > 0)
				{
					int minHealth = 1;
					int maxHealth;
					if (lastHealthScale > 1)
					{
						if (lastRatio > 1)
						{
							// This doesn't apply if healthRatio = 1, because of the special case in the server calculation that
							// health = 0 forces healthRatio = 0 instead of the expected healthRatio = 1
							minHealth = (lastMaxHealth * (lastRatio - 1) + lastHealthScale - 2) / (lastHealthScale - 1);
						}
						maxHealth = (lastMaxHealth * lastRatio - 1) / (lastHealthScale - 1);
						if (maxHealth > lastMaxHealth)
						{
							maxHealth = lastMaxHealth;
						}
					}
					else
					{
						// If healthScale is 1, healthRatio will always be 1 unless health = 0
						// so we know nothing about the upper limit except that it can't be higher than maxHealth
						maxHealth = lastMaxHealth;
					}
					// Take the average of min and max possible healths
					health = (minHealth + maxHealth + 1) / 2;
				}

				// Show both the hitpoint and percentage values if enabled in the config
				return health;
			}
		}
		return 100;
	}

	public void setMaxHP()
	{
		Widget hpWidget = client.getWidget(WidgetInfo.HEALTH_BAR_HP);
		String hpText = hpWidget.getText();

		hpText = hpText.split("/")[1];
		int hp = Integer.parseInt(Text.sanitize(hpText));

		if (hp > 0)
		{
			this.maxHP = hp;
		}
	}
}
