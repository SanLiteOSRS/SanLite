/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.runecraft;

import com.google.common.collect.ImmutableList;
import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.Notifier;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static net.runelite.client.plugins.runecraft.AbyssRifts.*;

@PluginDescriptor(
		name = "Runecrafting",
		description = "Show minimap icons, clickboxes for abyssal rifts and left-click swap for pouches in bank",
		tags = {"abyssal", "minimap", "overlay", "rifts", "rc", "runecrafting", "pouch", "rune", "essence", "swap"},
		type = PluginType.SANLITE_USE_AT_OWN_RISK,
		enabledByDefault = false
)
public class RunecraftPlugin extends Plugin
{
	private static final String POUCH_DECAYED_NOTIFICATION_MESSAGE = "Your rune pouch has decayed.";
	private static final String POUCH_DECAYED_MESSAGE = "Your pouch has decayed through use.";
	private static final List<Integer> DEGRADED_POUCHES = ImmutableList.of(
		ItemID.MEDIUM_POUCH_5511,
		ItemID.LARGE_POUCH_5513,
		ItemID.GIANT_POUCH_5515
	);

	@Getter(AccessLevel.PACKAGE)
	private final Set<DecorativeObject> abyssObjects = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private final Set<AbyssRifts> rifts = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private boolean degradedPouchInInventory;

	@Getter(AccessLevel.PACKAGE)
	private NPC darkMage;

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private AbyssOverlay abyssOverlay;

	@Inject
	private AbyssMinimapOverlay abyssMinimapOverlay;

	@Inject
	private RunecraftConfig config;

	@Inject
	private Notifier notifier;

	@Inject
	private MenuManager menuManager;

	@Provides
	RunecraftConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RunecraftConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(abyssOverlay);
		overlayManager.add(abyssMinimapOverlay);
		updateRifts();

		if (config.leftClickEmptyPouch())
		{
			addSwapEmpty();
		}

		if (config.leftClickFillPouchInBank())
		{
			addSwapFillPouchInBank();
		}
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(abyssOverlay);
		overlayManager.remove(abyssMinimapOverlay);
		abyssObjects.clear();
		darkMage = null;
		degradedPouchInInventory = false;

		if (config.leftClickEmptyPouch())
		{
			removeSwapEmpty();
		}

		if (config.leftClickFillPouchInBank())
		{
			removeSwapFillPouchInBank();
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("runecraft"))
		{
			updateRifts();
		}
		if (event.getKey().equals("leftClickEmptyPouch"))
		{
			addSwapEmpty();
		}

		if (event.getKey().equals("leftClickFillPouchInBank"))
		{
			addSwapFillPouchInBank();
		}
	}

	private void addSwapEmpty()
	{
		if (config.leftClickEmptyPouch())
		{
			menuManager.addMenuEntrySwap("fill", "pouch", "empty", "pouch", true, false);
		}
		else
		{
			menuManager.removeMenuEntrySwap("fill", "pouch", "empty", "pouch", true, false);
		}
	}

	private void removeSwapEmpty()
	{
		menuManager.removeMenuEntrySwap("fill", "pouch", "empty", "pouch", true, false);
	}

	private void addSwapFillPouchInBank()
	{
		if (config.leftClickFillPouchInBank())
		{
			menuManager.addMenuEntrySwap("deposit", "pouch", 2, 57, "fill", "pouch", 9, 1007);
		}
		else
		{
			menuManager.removeMenuEntrySwap("deposit", "pouch", 2, 57, "fill", "pouch", 9, 1007);
		}
	}

	private void removeSwapFillPouchInBank()
	{
		menuManager.removeMenuEntrySwap("deposit", "pouch", 2, 57, "fill", "pouch", 9, 1007);
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		if (event.getType() != ChatMessageType.GAMEMESSAGE)
		{
			return;
		}

		if (config.degradingNotification())
		{
			if (event.getMessage().contains(POUCH_DECAYED_MESSAGE))
			{
				notifier.notify(POUCH_DECAYED_NOTIFICATION_MESSAGE);
			}
		}
	}

	@Subscribe
	public void onDecorativeObjectSpawned(DecorativeObjectSpawned event)
	{
		DecorativeObject decorativeObject = event.getDecorativeObject();
		if (AbyssRifts.getRift(decorativeObject.getId()) != null)
		{
			abyssObjects.add(decorativeObject);
		}
	}

	@Subscribe
	public void onDecorativeObjectDespawned(DecorativeObjectDespawned event)
	{
		DecorativeObject decorativeObject = event.getDecorativeObject();
		abyssObjects.remove(decorativeObject);
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		GameState gameState = event.getGameState();
		switch (gameState)
		{
			case LOADING:
				abyssObjects.clear();
				break;
			case CONNECTION_LOST:
			case HOPPING:
			case LOGIN_SCREEN:
				darkMage = null;
				break;
		}
	}

	@Subscribe
	public void onItemContainerChanged(ItemContainerChanged event)
	{
		if (event.getContainerId() != InventoryID.INVENTORY.getId())
		{
			return;
		}

		final Item[] items = event.getItemContainer().getItems();
		degradedPouchInInventory = Stream.of(items).anyMatch(i -> DEGRADED_POUCHES.contains(i.getId()));
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		final NPC npc = event.getNpc();
		if (npc.getId() == NpcID.DARK_MAGE)
		{
			darkMage = npc;
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		final NPC npc = event.getNpc();
		if (npc == darkMage)
		{
			darkMage = null;
		}
	}

	private void updateRifts()
	{
		rifts.clear();
		if (config.showAir())
		{
			rifts.add(AIR_RIFT);
		}
		if (config.showBlood())
		{
			rifts.add(BLOOD_RIFT);
		}
		if (config.showBody())
		{
			rifts.add(BODY_RIFT);
		}
		if (config.showChaos())
		{
			rifts.add(CHAOS_RIFT);
		}
		if (config.showCosmic())
		{
			rifts.add(COSMIC_RIFT);
		}
		if (config.showDeath())
		{
			rifts.add(DEATH_RIFT);
		}
		if (config.showEarth())
		{
			rifts.add(EARTH_RIFT);
		}
		if (config.showFire())
		{
			rifts.add(FIRE_RIFT);
		}
		if (config.showLaw())
		{
			rifts.add(LAW_RIFT);
		}
		if (config.showMind())
		{
			rifts.add(MIND_RIFT);
		}
		if (config.showNature())
		{
			rifts.add(NATURE_RIFT);
		}
		if (config.showSoul())
		{
			rifts.add(SOUL_RIFT);
		}
		if (config.showWater())
		{
			rifts.add(WATER_RIFT);
		}
	}
}
