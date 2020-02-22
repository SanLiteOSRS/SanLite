package net.runelite.client.plugins.attacktimer;


import com.google.common.collect.ImmutableMap;
import com.google.inject.Provides;
import lombok.Getter;
import net.runelite.api.AnimationID;
import net.runelite.api.Client;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.combattickcounter.CombatTickCounterConfig;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Map;

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

	private static final Map<Integer, Integer> ANIMATIONS = ImmutableMap.<Integer, Integer>builder()
			.put(422, 4) // Unarmed Punch, Block
			.put(423, 4) // Unarmed Kick

			.put(8145, 4) // Rapier Stab, Lunge, Block
			.put(390, 4) // Rapier Slash

			.put(7552, 5) // Armadyl Crossbow Accurate, Rapid, Longrange, Special

			.put(1167, 4) // Trident Accurate, Accurate, Longrange

			.put(401, 6) // Dragon Warhammer Pound, Pummel, Block
			.put(1378, 6) // Dragon Warhammer Special

			.put(393, 4) // Dragon Claws Chop, Slash, Block
			.put(1067, 4) // Dragon Claws Lunge
			.put(7514, 4) // Dragon Claws Special

			.put(8288, 4) // Dragon Hunter Lance Lunge, Block
			.put(8289, 4) // Dragon Hunter Lance Swipe
			.put(8290, 4) // Dragon Hunter Lance Pound

			.put(7516, 6) // Elder maul Pound, Pummel, Block

			.put(8056, 5) // Scythe of Vitur Reap, Chop, Jab, Block

			.put(7045, 6) // Bandos Godsword Chop, Slash
			.put(7054, 6) // Bandos Godsword Smash
			.put(7055, 6) // Bandos Godsword Block
			.put(7642, 6) // Bandos Godsword Special
			.put(7643, 6) // Bandos Godsword Special (Ornate)

			.put(426, 5) // Twisted Bow Accurate, Rapid, Longrange

			.put(414, 5) // Kodai Bash, Pound, Focus

			// .put(428, 4) // Staff of Light Jab
			.put(440, 4) // Staff of Light Swipe
			//.put(419, 4) // Staff of Light Fend
			.put(7967, 4) // Staff of Light Special

			.put(428, 7) // Crystal Halberd Jab, Fend
			.put(419, 7) // Crystal Halberd Swipe
			.put(1203, 7) // Crystal Halberd Special

			.put(5061, 2) // Toxic Blowpipe Accurate, Rapid, Longrange, Special

			.put(1979, 5) // Ancient Magicks Barrage
			.put(1978, 5) // Ancient Magicks Blitz

			.put(7618, 3) // Chinchompa Short, Medium, Long Fuse
			.put(1658, 4) // Whip Flick, Lash, Deflect

			.put(7555, 6) // Ballista Accurate, Rapid, Longrange
			.build();

	@Provides
	AttackTimerConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(AttackTimerConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
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
			if (ANIMATIONS.containsKey(event.getActor().getAnimation()))
			{
				if (event.getActor().getAnimation() == AnimationID.BLOWPIPE_ATTACK)
				{
					isBlowpipe = true;
				}
				else
				{
					ticksTillNextAttack = ANIMATIONS.get(event.getActor().getAnimation());
					firstTick = true;
				}
			}
			//Stops timer from continuing to count when walking with blowpipe out
			else if (event.getActor().getAnimation() != AnimationID.BLOWPIPE_ATTACK)
			{
				isBlowpipe = false;
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
}
