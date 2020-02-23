package net.runelite.client.plugins.attacktimer;


import com.google.inject.Provides;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.AnimationID;
import net.runelite.api.Client;
import net.runelite.api.VarPlayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.kit.KitType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.*;

@Slf4j
@PluginDescriptor(
		name = "Attack Timer",
		description = "Shows when your next attack tick is",
		tags = {"attack", "combat", "timer", "tick", "ticks", "counter"},
		type = PluginType.SANLITE
)
@Singleton
public class AttackTimerPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private AttackTimerOverlay overlay;

	@Inject
	private Client client;

	@Getter
	private int ticksTillNextAttack;

	private boolean firstTick;

	@Getter
	private boolean isBlowpipe;

	@Getter
	private int blowpipeTicks;

	private ArrayList<Weapon> weaponInfo = new ArrayList<>();


	@Provides
	AttackTimerConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(AttackTimerConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
		populateWeaponInfo();
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		if (event.getActor().equals(client.getLocalPlayer()))
		{
			for (Weapon weapon : weaponInfo)
			{
				if (weapon.getAnimationID().contains(event.getActor().getAnimation()))
				{
					//Barrage/Blitz
					if (event.getActor().getAnimation() == AnimationID.BARRAGE_ANIMATION || event.getActor().getAnimation() == AnimationID.BLITZ_ANIMATION)
					{
						ticksTillNextAttack = weapon.getAttackSpeed().get(0);
						firstTick = true;
					}
					else if (weapon.getWeaponID().contains(client.getLocalPlayer().getPlayerAppearance().getEquipmentId(KitType.WEAPON)))
					{
						//Blowpipe rapid check (2tick animation)
						if (weapon.getAnimationID().contains(AnimationID.BLOWPIPE_ATTACK) && client.getVar(VarPlayer.ATTACK_STYLE) != 3)
						{
							isBlowpipe = true;
						}
						//Ranged weapons
						else if (weapon.getAttackStyle().size() > 1)
						{
							isBlowpipe = false;
							int attackStyle = client.getVar(VarPlayer.ATTACK_STYLE);

							//Check if rapid
							if (attackStyle == 1)
							{
								ticksTillNextAttack = weapon.getAttackSpeed().get(1);
							}
							else
							{
								ticksTillNextAttack = weapon.getAttackSpeed().get(0);
							}
							firstTick = true;
						}
						// Melee and mage
						else
						{
							ticksTillNextAttack = weapon.getAttackSpeed().get(0);
							firstTick = true;
						}

					}
				}
				else if (event.getActor().getAnimation() != AnimationID.BLOWPIPE_ATTACK)
				{
					isBlowpipe = false;
				}
			}
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (isBlowpipe)
		{
			blowpipeTicks++;
			ticksTillNextAttack = ((blowpipeTicks % 2) % 2) + 1;
		}
		else if (ticksTillNextAttack > 0 && !firstTick)
		{
			ticksTillNextAttack--;
		}

		if (!isBlowpipe)
		{
			blowpipeTicks = 0;
		}

		if (firstTick) firstTick = false;
	}

	private void populateWeaponInfo()
	{
		// Weapon ID, Animation ID, Attack Style, Speed

		//Melee
		//Rapier (Stab and slash)
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(22324)), new ArrayList<>(Arrays.asList(8145, 390)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(4))));
		//Scythe (All styles)
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(22325)), new ArrayList<>(Arrays.asList(8056)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(5))));
		//Whip (All styles)
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(4151, 12006, 12773, 12774)), new ArrayList<>(Arrays.asList(1658)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(4))));
		//Dragonhunter lance (swipe/block/lunge,block)
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(22978)), new ArrayList<>(Arrays.asList(8288, 8289, 8290)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(4))));
		//Dragon warhammer pound/pummel/block, spec
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(13576)), new ArrayList<>(Arrays.asList(401, 1378)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(6))));
		//Dragon claws chop/slash/block, lunge, spec
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(13652)), new ArrayList<>(Arrays.asList(393, 1067, 7514)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(4))));
		//Elder maul (all styles)
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(21003)), new ArrayList<>(Arrays.asList(7516)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(6))));
		//Dragon scim chop/slash/block, lunge
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(4587)), new ArrayList<>(Arrays.asList(390, 386)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(4))));
		//Crystal hally jab/fed, swipe, spec
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(23987)), new ArrayList<>(Arrays.asList(428, 440, 1203)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(7))));
		//Zammy hasta lunge/block, pound, swipe
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(11889)), new ArrayList<>(Arrays.asList(381, 419, 440)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(4))));
		//Armadyl godsword chop/slash, smash, block, spec
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(11802)), new ArrayList<>(Arrays.asList(7045, 7054, 7055, 7644)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(6))));
		//Bandos godsword chop/slash, smash, block, spec
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(11804)), new ArrayList<>(Arrays.asList(7045, 7054, 7055, 7642)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(6))));
		//Guthans warspear lunge/block, swipe, pound
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(4726, 4910)), new ArrayList<>(Arrays.asList(2080, 2081, 2082)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(5))));
		//Dharoks axe chop/hack/block, smash
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(4718, 4886)), new ArrayList<>(Arrays.asList(2067, 2066)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(7))));
		//Veracs flail (all styles)
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(4718, 4982)), new ArrayList<>(Arrays.asList(2062)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(5))));
		//Zamorak spear (all styles)
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(11824)), new ArrayList<>(Arrays.asList(1710, 1711, 1712)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(4))));


		//Ranged
		//Acb Accurate > Rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(11785)), new ArrayList<>(Arrays.asList(7552)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(6, 5))));
		//Rcb Accurate > Rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(9185)), new ArrayList<>(Arrays.asList(7552)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(6, 5))));
		//Dcb Accurate > Rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(21902)), new ArrayList<>(Arrays.asList(7552)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(6, 5))));
		//Dhcb Accurate > Rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(21012)), new ArrayList<>(Arrays.asList(7552)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(6, 5))));
		//Twisted bow Accurate > Rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(20997)), new ArrayList<>(Arrays.asList(426)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(6, 5))));
		//Blowpipe Accurate > Rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(12926)), new ArrayList<>(Arrays.asList(5061)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(3, 2))));
		//Ballista Accurate > Rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(19481, 19478)), new ArrayList<>(Arrays.asList(7555)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(7, 6))));
		//Msb + msb (i) Accurate > Rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(861, 12788)), new ArrayList<>(Arrays.asList(426)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(4, 3))));
		//Magic longbow Accurate > Rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(859)), new ArrayList<>(Arrays.asList(426)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(6, 5))));
		//Grey, red and black chin, Accurate > Rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(10033, 10034, 11959)), new ArrayList<>(Arrays.asList(7618)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(6, 5))));
		//Dark bow Accurate > rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(11235, 12765, 12766, 12767, 12768)), new ArrayList<>(Arrays.asList(426)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(8, 7))));
		//Karils bow Accurate > rapid
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(4734, 4934)), new ArrayList<>(Arrays.asList(2075)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD, AttackStyle.RAPID)), new ArrayList<>(Arrays.asList(4, 3))));


		//Magic
		//Ancients Barrage. Normal casting > defensive casting
		weaponInfo.add(new Weapon(null, new ArrayList<>(Arrays.asList(1979)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(5))));
		//Ancients Blitz
		weaponInfo.add(new Weapon(null, new ArrayList<>(Arrays.asList(1978)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(5))));
		//Trident/Toxic trident/Sang
		weaponInfo.add(new Weapon(new ArrayList<>(Arrays.asList(11905, 11907, 12899, 22323)), new ArrayList<>(Arrays.asList(1167)), new ArrayList<>(Arrays.asList(AttackStyle.STANDARD)), new ArrayList<>(Arrays.asList(4))));
	}
}
