package net.runelite.client.plugins.combattickcounter;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.events.ConfigChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.kit.KitType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.util.List;
import java.util.*;

import static java.util.Collections.reverseOrder;
import static net.runelite.api.AnimationID.BLOWPIPE_ATTACK;

@PluginDescriptor(
		name = "Combat Tick Counter",
		description = "Count the amount of perfect combat ticks performed by each player",
		tags = {"combat", "counter", "tick", "pvm", "overlay", "boss", "sanlite"},
		enabledByDefault = false
)
@Singleton
@Slf4j
public class CombatTickCounterPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private CombatTickCounterOverlay tickOverlay;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private CombatTickCounterConfig config;

	@Inject
	private EventBus eventBus;

	private boolean instanced = false;
	@Setter(AccessLevel.PACKAGE)
	@Getter(AccessLevel.PACKAGE)
	private Map<String, Long> counter = new HashMap<>();

	private final Map<String, Long> blowpipe = new HashMap<>();

	@Getter(AccessLevel.PACKAGE)
	private boolean showTickCounter;
	private boolean resetOnNewInstance;
	@Getter(AccessLevel.PACKAGE)
	private Color selfColor;
	@Getter(AccessLevel.PACKAGE)
	private Color totalColor;
	@Getter(AccessLevel.PACKAGE)
	private Color otherColor;
	@Getter(AccessLevel.PACKAGE)
	private Color backgroundColor;
	@Getter(AccessLevel.PACKAGE)
	private Color titleColor;

	@Provides
	CombatTickCounterConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(CombatTickCounterConfig.class);
	}

	private static final Map<Integer, Integer> VARIABLES = ImmutableMap.<Integer, Integer>builder()
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


	private static final Set<Integer> MELEE_ANIMATIONS = ImmutableSet.<Integer>builder()
			.add(422) // Unarmed Punch, Block
			.add(423) // Unarmed Kick

			.add(8145) // Rapier Stab, Lunge, Block
			.add(390) // Rapier Slash

			.add(401) // Dragon Warhammer Pound, Pummel, Block
			.add(1378) // Dragon Warhammer Special

			.add(393) // Dragon Claws Chop, Slash, Block
			.add(1067) // Dragon Claws Lunge
			.add(7514) // Dragon Claws Special

			.add(8288) // Dragon Hunter Lance Lunge, Block
			.add(8289) // Dragon Hunter Lance Swipe
			.add(8290) // Dragon Hunter Lance Pound

			.add(7516) // Elder maul Pound, Pummel, Block

			.add(8056) // Scythe of Vitur Reap, Chop, Jab, Block

			.add(7045) // Bandos Godsword Chop, Slash
			.add(7054) // Bandos Godsword Smash
			.add(7055) // Bandos Godsword Block
			.add(7642) // Bandos Godsword Special
			.add(7643) // Bandos Godsword Special (Ornate)

			.add(414) // Kodai Bash, Pound, Focus

			.add(428) // Staff of Light Jab
			.add(440) // Staff of Light Swipe
			.add(419) // Staff of Light Fend

			.add(428) // Crystal Halberd Jab, Fend
			.add(419) // Crystal Halberd Swipe
			.add(1203) // Crystal Halberd Special

			.add(1658) // Whip Flick, Lash, Deflect
			.build();

	private static final Set<Integer> RANGE_ANIMATIONS = ImmutableSet.of(
			7552, // Armadyl Crossbow Accurate, Rapid, Longrange, Special
			426, // Twisted Bow Accurate, Rapid, Longrange
			7618, // Chinchompa Short, Medium, Long Fuse
			7555 // Ballista Accurate, Rapid, Longrange
	);

	private static final Set<Integer> MAGE_ANIMATIONS = ImmutableSet.of(
			1167, // Trident Accurate, Accurate, Longrange
			1978, // Ancient Magicks Blitz
			1979 // Ancient Magicks Barrage
	);

	@Override
	protected void startUp() throws Exception
	{
		updateConfig();

		overlayManager.add(tickOverlay);

		reset();
	}

	@Override
	protected void shutDown() throws Exception
	{
		eventBus.unregister(this);

		overlayManager.remove(tickOverlay);

		reset();
	}

	private void reset()
	{
		this.counter.clear();
		this.blowpipe.clear();
	}

	@Subscribe
	private void onAnimationChanged(AnimationChanged event)
	{
		Actor actor = event.getActor();

		if (actor instanceof Player)
		{
			Player player = (Player) actor;
			String name = actor.getName();
			if (name != null)
			{
				int animation = player.getAnimation();
				if (animation != -1)
				{
					if (VARIABLES.containsKey(animation))
					{
						long ticks = VARIABLES.get(animation);
						if (((Player) actor).getPlayerComposition().getEquipmentId(KitType.WEAPON) == 23360)
						{
							ticks = 3;
						}
						if (counter.containsKey(name))
						{
							ticks += counter.get(name);
						}
						counter.put(name, ticks);
						counter = sortByValue(counter);

						if (animation == BLOWPIPE_ATTACK)
						{
							this.blowpipe.put(name, -4L);
						}
					}
				}
				else
				{
					this.blowpipe.remove(name);
				}
			}
		}
	}

	@Subscribe
	private void onGameTick(GameTick event)
	{
		if (this.resetOnNewInstance)
		{
			boolean prevInstance = instanced;
			instanced = client.isInInstancedRegion();
			if (!prevInstance && instanced)
			{
				this.counter.clear();
				this.blowpipe.clear();
			}
		}

		Map<String, Player> visible = new HashMap<>();
		for (Player player : this.client.getPlayers())
		{
			if (player.getName() != null)
			{
				visible.put(player.getName(), player);
			}
		}

		for (String user : new ArrayList<>(blowpipe.keySet()))
		{
			if (visible.containsKey(user))
			{
				long count = blowpipe.get(user);
				count++;
				blowpipe.replace(user, count);

				if (count % 2 == 0 && count >= 0 && counter.containsKey(user))
				{
					long ticks = counter.get(user);
					counter.replace(user, ticks + 2);
					counter = sortByValue(counter);
				}
			}
			else
			{
				blowpipe.remove(user);
			}
		}
	}


	private <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map)
	{
		List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
		list.sort(reverseOrder(Map.Entry.comparingByValue()));

		Map<K, V> result = new LinkedHashMap<>();
		for (Map.Entry<K, V> entry : list)
		{
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		GameState gameState = event.getGameState();
		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			reset();
		}
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("Combat Tick Counter"))
		{
			updateConfig();
		}
	}

	private void updateConfig()
	{
		this.showTickCounter = config.showTickCounter();
		this.resetOnNewInstance = config.resetOnNewInstance();
		this.selfColor = config.selfColor();
		this.totalColor = config.totalColor();
		this.otherColor = config.otherColor();
		this.backgroundColor = config.backgroundColor();
		this.titleColor = config.titleColor();
	}
}