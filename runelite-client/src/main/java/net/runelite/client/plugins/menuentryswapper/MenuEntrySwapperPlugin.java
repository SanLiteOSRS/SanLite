/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Kamiel
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
package net.runelite.client.plugins.menuentryswapper;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Provides;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.ItemDefinition;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.events.ClientTick;
import net.runelite.client.events.ConfigChanged;
import net.runelite.api.events.FocusChanged;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.PostItemDefinition;
import net.runelite.api.events.WidgetMenuOptionClicked;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.input.KeyManager;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.menus.WidgetMenuOption;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.util.Text;
import org.apache.commons.lang3.ArrayUtils;

@PluginDescriptor(
	name = "Menu Entry Swapper",
	description = "Change the default option that is displayed when hovering over objects",
	tags = {"npcs", "inventory", "items", "objects"},
	enabledByDefault = false,
	type = PluginType.SANLITE_USE_AT_OWN_RISK
)
public class MenuEntrySwapperPlugin extends Plugin
{
	private static final String CONFIGURE = "Configure";
	private static final String SAVE = "Save";
	private static final String RESET = "Reset";
	private static final String MENU_TARGET = "Shift-click";

	private static final String CONFIG_GROUP = "shiftclick";
	private static final String ITEM_KEY_PREFIX = "item_";

	private static final WidgetMenuOption FIXED_INVENTORY_TAB_CONFIGURE = new WidgetMenuOption(CONFIGURE,
		MENU_TARGET, WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB);

	private static final WidgetMenuOption FIXED_INVENTORY_TAB_SAVE = new WidgetMenuOption(SAVE,
		MENU_TARGET, WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB);

	private static final WidgetMenuOption RESIZABLE_INVENTORY_TAB_CONFIGURE = new WidgetMenuOption(CONFIGURE,
		MENU_TARGET, WidgetInfo.RESIZABLE_VIEWPORT_INVENTORY_TAB);

	private static final WidgetMenuOption RESIZABLE_INVENTORY_TAB_SAVE = new WidgetMenuOption(SAVE,
		MENU_TARGET, WidgetInfo.RESIZABLE_VIEWPORT_INVENTORY_TAB);

	private static final WidgetMenuOption RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_CONFIGURE = new WidgetMenuOption(CONFIGURE,
		MENU_TARGET, WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_INVENTORY_TAB);

	private static final WidgetMenuOption RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_SAVE = new WidgetMenuOption(SAVE,
		MENU_TARGET, WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_INVENTORY_TAB);

	private static final Set<MenuAction> NPC_MENU_TYPES = ImmutableSet.of(
		MenuAction.NPC_FIRST_OPTION,
		MenuAction.NPC_SECOND_OPTION,
		MenuAction.NPC_THIRD_OPTION,
		MenuAction.NPC_FOURTH_OPTION,
		MenuAction.NPC_FIFTH_OPTION,
		MenuAction.EXAMINE_NPC);

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private MenuEntrySwapperConfig config;

	@Inject
	private ShiftClickInputListener inputListener;

	@Inject
	private ConfigManager configManager;

	@Inject
	private KeyManager keyManager;

	@Inject
	private MenuManager menuManager;

	@Inject
	private ItemManager itemManager;

	@Getter
	private boolean configuringShiftClick = false;

	@Setter
	private boolean shiftModifier = false;

	private final ArrayListMultimap<String, Integer> optionIndexes = ArrayListMultimap.create();

	@Provides
	MenuEntrySwapperConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(MenuEntrySwapperConfig.class);
	}

	@Override
	public void startUp()
	{
		if (config.shiftClickCustomization())
		{
			enableCustomization();
		}
	}

	@Override
	public void shutDown()
	{
		disableCustomization();
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!CONFIG_GROUP.equals(event.getGroup()))
		{
			return;
		}

		if (event.getKey().equals("shiftClickCustomization"))
		{
			if (config.shiftClickCustomization())
			{
				enableCustomization();
			}
			else
			{
				disableCustomization();
			}
		}
		else if (event.getKey().startsWith(ITEM_KEY_PREFIX))
		{
			clientThread.invoke(this::resetItemCompositionCache);
		}
	}

	private void resetItemCompositionCache()
	{
		itemManager.invalidateItemCompositionCache();
		client.getItemDefinitionCache().reset();
	}

	private Integer getSwapConfig(int itemId)
	{
		itemId = ItemVariationMapping.map(itemId);
		String config = configManager.getConfiguration(CONFIG_GROUP, ITEM_KEY_PREFIX + itemId);
		if (config == null || config.isEmpty())
		{
			return null;
		}

		return Integer.parseInt(config);
	}

	private void setSwapConfig(int itemId, int index)
	{
		itemId = ItemVariationMapping.map(itemId);
		configManager.setConfiguration(CONFIG_GROUP, ITEM_KEY_PREFIX + itemId, index);
	}

	private void unsetSwapConfig(int itemId)
	{
		itemId = ItemVariationMapping.map(itemId);
		configManager.unsetConfiguration(CONFIG_GROUP, ITEM_KEY_PREFIX + itemId);
	}

	private void enableCustomization()
	{
		keyManager.registerKeyListener(inputListener);
		refreshShiftClickCustomizationMenus();
		clientThread.invoke(this::resetItemCompositionCache);
	}

	private void disableCustomization()
	{
		keyManager.unregisterKeyListener(inputListener);
		removeShiftClickCustomizationMenus();
		configuringShiftClick = false;
		clientThread.invoke(this::resetItemCompositionCache);
	}

	@Subscribe
	public void onWidgetMenuOptionClicked(WidgetMenuOptionClicked event)
	{
		if (event.getWidget() == WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB
			|| event.getWidget() == WidgetInfo.RESIZABLE_VIEWPORT_INVENTORY_TAB
			|| event.getWidget() == WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_INVENTORY_TAB)
		{
			configuringShiftClick = event.getMenuOption().equals(CONFIGURE) && Text.removeTags(event.getMenuTarget()).equals(MENU_TARGET);
			refreshShiftClickCustomizationMenus();
		}
	}

	@Subscribe
	public void onMenuOpened(MenuOpened event)
	{
		if (!configuringShiftClick)
		{
			return;
		}

		MenuEntry firstEntry = event.getFirstEntry();
		if (firstEntry == null)
		{
			return;
		}

		int widgetId = firstEntry.getParam1();
		if (widgetId != WidgetInfo.INVENTORY.getId())
		{
			return;
		}

		int itemId = firstEntry.getIdentifier();
		if (itemId == -1)
		{
			return;
		}

		ItemDefinition itemComposition = client.getItemDefinition(itemId);
		String itemName = itemComposition.getName();
		String option = "Use";
		int shiftClickActionIndex = itemComposition.getShiftClickActionIndex();
		String[] inventoryActions = itemComposition.getInventoryActions();

		if (shiftClickActionIndex >= 0 && shiftClickActionIndex < inventoryActions.length)
		{
			option = inventoryActions[shiftClickActionIndex];
		}

		MenuEntry[] entries = event.getMenuEntries();

		for (MenuEntry entry : entries)
		{
			if (itemName.equals(Text.removeTags(entry.getTarget())))
			{
				entry.setType(MenuAction.RUNELITE.getId());

				if (option.equals(entry.getOption()))
				{
					entry.setOption("* " + option);
				}
			}
		}

		final MenuEntry resetShiftClickEntry = new MenuEntry();
		resetShiftClickEntry.setOption(RESET);
		resetShiftClickEntry.setTarget(MENU_TARGET);
		resetShiftClickEntry.setIdentifier(itemId);
		resetShiftClickEntry.setParam1(widgetId);
		resetShiftClickEntry.setType(MenuAction.RUNELITE.getId());
		client.setMenuEntries(ArrayUtils.addAll(entries, resetShiftClickEntry));
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked event)
	{
		if (event.getMenuAction() != MenuAction.RUNELITE || event.getActionParam1() != WidgetInfo.INVENTORY.getId())
		{
			return;
		}

		int itemId = event.getIdentifier();

		if (itemId == -1)
		{
			return;
		}

		String option = event.getOption();
		String target = event.getTarget();
		ItemDefinition itemComposition = client.getItemDefinition(itemId);

		if (option.equals(RESET) && target.equals(MENU_TARGET))
		{
			unsetSwapConfig(itemId);
			return;
		}

		if (!itemComposition.getName().equals(Text.removeTags(target)))
		{
			return;
		}

		int index = -1;
		boolean valid = false;

		if (option.equals("Use")) //because "Use" is not in inventoryActions
		{
			valid = true;
		}
		else
		{
			String[] inventoryActions = itemComposition.getInventoryActions();

			for (index = 0; index < inventoryActions.length; index++)
			{
				if (option.equals(inventoryActions[index]))
				{
					valid = true;
					break;
				}
			}
		}

		if (valid)
		{
			setSwapConfig(itemId, index);
		}
	}

	private void swapMenuEntry(int index, MenuEntry menuEntry)
	{
		final int eventId = menuEntry.getIdentifier();
		final String option = Text.removeTags(menuEntry.getOption()).toLowerCase();
		final String target = Text.removeTags(menuEntry.getTarget()).toLowerCase();
		final NPC hintArrowNpc = client.getHintArrowNpc();

		if (hintArrowNpc != null
			&& hintArrowNpc.getIndex() == eventId
			&& NPC_MENU_TYPES.contains(MenuAction.of(menuEntry.getType())))
		{
			return;
		}

		if (option.equals("talk-to"))
		{
			if (config.swapPickpocket() && shouldSwapPickpocket(target))
			{
				swap("pickpocket", option, target, index);
			}

			if (config.swapAbyssTeleport() && target.contains("mage of zamorak"))
			{
				swap("teleport", option, target, index);
			}

			if (config.swapHardWoodGrove() && target.contains("rionasta"))
			{
				swap("send-parcel", option, target, index);
			}

			if (config.swapBank())
			{
				swap("bank", option, target, index);
			}

			if (config.swapContract())
			{
				swap("contract", option, target, index);
			}

			if (config.swapExchange())
			{
				swap("exchange", option, target, index);
			}

			if (config.swapDarkMage())
			{
				swap("repairs", option, target, index);
			}

			// make sure assignment swap is higher priority than trade swap for slayer masters
			if (config.swapAssignment())
			{
				swap("assignment", option, target, index);
			}

			if (config.swapTrade())
			{
				swap("trade", option, target, index);
				swap("trade-with", option, target, index);
				swap("shop", option, target, index);
			}

			if (config.claimSlime() && target.equals("robin"))
			{
				swap("claim-slime", option, target, index);
			}

			if (config.swapTravel())
			{
				swap("travel", option, target, index);
				swap("pay-fare", option, target, index);
				swap("charter", option, target, index);
				swap("take-boat", option, target, index);
				swap("fly", option, target, index);
				swap("jatizso", option, target, index);
				swap("neitiznot", option, target, index);
				swap("rellekka", option, target, index);
				swap("follow", option, target, index);
				swap("transport", option, target, index);
			}

			if (config.swapPay())
			{
				swap("pay", option, target, index);
				swapContains("pay (", option, target, index);
			}

			if (config.swapDecant())
			{
				swap("decant", option, target, index);
			}

			if (config.swapQuick())
			{
				swap("quick-travel", option, target, index);
			}

			if (config.swapEnchant())
			{
				swap("enchant", option, target, index);
			}

			if (config.swapStartMinigame())
			{
				swap("start-minigame", option, target, index);
			}
		}
		else if (config.swapQuickLeave() && option.equals("leave tomb") && target.equals("tomb door"))
		{
			swap("quick-leave", option, target, index);
		}
		else if (config.swapTravel() && option.equals("pass") && target.equals("energy barrier"))
		{
			swap("pay-toll(2-ecto)", option, target, index);
		}
		else if (config.swapTravel() && option.equals("open") && target.equals("gate"))
		{
			swap("pay-toll(10gp)", option, target, index);
		}
		else if (config.swapHardWoodGrove() && option.equals("open") && target.equals("hardwood grove doors"))
		{
			swap("quick-pay(100)", option, target, index);
		}
		else if (config.swapTravel() && option.equals("inspect") && target.equals("trapdoor"))
		{
			swap("travel", option, target, index);
		}
		else if (config.swapHarpoon() && option.equals("cage"))
		{
			swap("harpoon", option, target, index);
		}
		else if (config.swapHarpoon() && (option.equals("big net") || option.equals("net")))
		{
			swap("harpoon", option, target, index);
		}
		else if (config.swapHomePortal() != HouseMode.ENTER && option.equals("enter"))
		{
			switch (config.swapHomePortal())
			{
				case HOME:
					swap("home", option, target, index);
					break;
				case BUILD_MODE:
					swap("build mode", option, target, index);
					break;
				case FRIENDS_HOUSE:
					swap("friend's house", option, target, index);
					break;
			}
		}
		else if (config.swapHouseAdvertisement() != HouseAdvertisementMode.VIEW && option.equals("view"))
		{
			switch (config.swapHouseAdvertisement())
			{
				case ADD_HOUSE:
					swap("add-house", option, target, index);
					break;
				case VISIT_LAST:
					swap("visit-last", option, target, index);
					break;
			}
		}
		else if (config.swapFairyRing() != FairyRingMode.OFF && config.swapFairyRing() != FairyRingMode.ZANARIS
			&& (option.equals("zanaris") || option.equals("configure") || option.equals("tree")))
		{
			if (config.swapFairyRing() == FairyRingMode.LAST_DESTINATION)
			{
				swapContains("last-destination", option, target, index);
			}
			else if (config.swapFairyRing() == FairyRingMode.CONFIGURE)
			{
				swapContains("configure", option, target, index);
			}
		}
		else if (config.swapFairyRing() == FairyRingMode.ZANARIS && option.equals("tree"))
		{
			swapContains("zanaris", option, target, index);
		}
		else if (config.swapBoxTrap() && (option.equals("check") || option.equals("dismantle")))
		{
			swap("reset", option, target, index);
		}
		else if (config.swapBoxTrap() && option.equals("take"))
		{
			swap("lay", option, target, index);
		}
		else if (config.swapChase() && option.equals("pick-up"))
		{
			swap("chase", option, target, index);
		}
		else if (config.swapBirdhouseEmpty() && option.equals("interact") && target.contains("birdhouse"))
		{
			swap("empty", option, target, index);
		}
		else if (config.swapQuick() && option.equals("enter"))
		{
			swap("quick-enter", option, target, index);
		}
		else if (config.swapQuick() && option.equals("ring"))
		{
			swap("quick-start", option, target, index);
		}
		else if (config.swapQuick() && option.equals("pass"))
		{
			swap("quick-pass", option, target, index);
			swap("quick pass", option, target, index);
		}
		else if (config.swapQuick() && option.equals("open"))
		{
			swap("quick-open", option, target, index);
		}
		else if (config.swapQuick() && option.equals("climb-down"))
		{
			swap("quick-start", option, target, index);
			swap("pay", option, target, index);
		}
		else if (config.swapAdmire() && option.equals("admire"))
		{
			swap("teleport", option, target, index);
			swap("spellbook", option, target, index);
			swap("perks", option, target, index);
		}
		else if (config.swapPrivate() && option.equals("shared"))
		{
			swap("private", option, target, index);
		}
		else if (config.swapPick() && option.equals("pick"))
		{
			swap("pick-lots", option, target, index);
		}
		else if (config.shiftClickCustomization() && shiftModifier && !option.equals("use"))
		{
			Integer customOption = getSwapConfig(eventId);

			if (customOption != null && customOption == -1)
			{
				swap("use", option, target, index);
			}
		}
		// Put all item-related swapping after shift-click
		else if (config.swapTeleportItem() && option.equals("wear"))
		{
			swap("rub", option, target, index);
			swap("teleport", option, target, index);
		}
		else if (option.equals("wield"))
		{
			if (config.swapTeleportItem())
			{
				swap("teleport", option, target, index);
			}
		}
		else if (config.swapBones() && option.equals("bury"))
		{
			swap("use", option, target, index);
		}
		else if (option.equals("value"))
		{
			switch (config.swapStoreBuy())
			{
				case CHANGE_TO_1:
					swap ("buy 1", option, target, index);
					break;
				case CHANGE_TO_5:
					swap ("buy 5", option, target, index);
					break;
				case CHANGE_TO_10:
					swap ("buy 10", option, target, index);
					break;
				case CHANGE_TO_50:
					swap ("buy 50", option, target, index);
					break;
				case Value:

				default:

			}
			switch (config.swapStoreSell())
			{
				case CHANGE_TO_1:
					swap ("sell 1", option, target, index);
					break;
				case CHANGE_TO_5:
					swap ("sell 5", option, target, index);
					break;
				case CHANGE_TO_10:
					swap ("sell 10", option, target, index);
					break;
				case CHANGE_TO_50:
					swap ("sell 50", option, target, index);
					break;
				case Value:

				default:
					break;
			}
		}

		if (shiftModifier && config.swapTeleportSpell())
		{
			if (target.equals("varrock teleport"))
			{
				swapTeleport(target, option, "grand exchange", index);
			}
			else if (target.equals("camelot teleport"))
			{
				swapTeleport(target, option, "seers'", index);
			}
			else if (target.equals("watchtower teleport"))
			{
				swapTeleport(target, option, "yanille", index);
			}
			else if (target.equals("teleport to house"))
			{
				swapTeleport(target, option, "outside", index);
			}
		}
	}

	private void swapTeleport(String target, String option, String optionA, int index)
	{
		if (option.equals("cast"))
		{
			swap(optionA, option, target, index);
		}
		else if (option.equals(optionA))
		{
			swap("cast", option, target, index);
		}
	}

	private static boolean shouldSwapPickpocket(String target)
	{
		return !target.startsWith("villager") && !target.startsWith("bandit") && !target.startsWith("menaphite thug");
	}

	@Subscribe
	public void onClientTick(ClientTick clientTick)
	{
		// The menu is not rebuilt when it is open, so don't swap or else it will
		// repeatedly swap entries
		if (client.getGameState() != GameState.LOGGED_IN || client.isMenuOpen())
		{
			return;
		}

		MenuEntry[] menuEntries = client.getMenuEntries();

		// Build option map for quick lookup in findIndex
		int idx = 0;
		optionIndexes.clear();
		for (MenuEntry entry : menuEntries)
		{
			String option = Text.removeTags(entry.getOption()).toLowerCase();
			optionIndexes.put(option, idx++);
		}

		// Perform swaps
		idx = 0;
		for (MenuEntry entry : menuEntries)
		{
			swapMenuEntry(idx++, entry);
		}
	}

	@Subscribe
	public void onPostItemDefinition(PostItemDefinition event)
	{
		ItemDefinition itemComposition = event.getItemDefinition();
		Integer option = getSwapConfig(itemComposition.getId());

		if (option != null)
		{
			itemComposition.setShiftClickActionIndex(option);
		}
	}

	@Subscribe
	public void onFocusChanged(FocusChanged event)
	{
		if (!event.isFocused())
		{
			shiftModifier = false;
		}
	}

	private void swap(String optionA, String optionB, String target, int index)
	{
		swap(optionA, optionB, target, index, true);
	}

	private void swapContains(String optionA, String optionB, String target, int index)
	{
		swap(optionA, optionB, target, index, false);
	}

	private void swap(String optionA, String optionB, String target, int index, boolean strict)
	{
		MenuEntry[] menuEntries = client.getMenuEntries();

		int thisIndex = findIndex(menuEntries, index, optionB, target, strict);
		int optionIdx = findIndex(menuEntries, thisIndex, optionA, target, strict);

		if (thisIndex >= 0 && optionIdx >= 0)
		{
			swap(optionIndexes, menuEntries, optionIdx, thisIndex);
		}
	}

	private int findIndex(MenuEntry[] entries, int limit, String option, String target, boolean strict)
	{
		if (strict)
		{
			List<Integer> indexes = optionIndexes.get(option);

			// We want the last index which matches the target, as that is what is top-most
			// on the menu
			for (int i = indexes.size() - 1; i >= 0; --i)
			{
				int idx = indexes.get(i);
				MenuEntry entry = entries[idx];
				String entryTarget = Text.removeTags(entry.getTarget()).toLowerCase();

				// Limit to the last index which is prior to the current entry
				if (idx <= limit && entryTarget.equals(target))
				{
					return idx;
				}
			}
		}
		else
		{
			// Without strict matching we have to iterate all entries up to the current limit...
			for (int i = limit; i >= 0; i--)
			{
				MenuEntry entry = entries[i];
				String entryOption = Text.removeTags(entry.getOption()).toLowerCase();
				String entryTarget = Text.removeTags(entry.getTarget()).toLowerCase();

				if (entryOption.contains(option.toLowerCase()) && entryTarget.equals(target))
				{
					return i;
				}
			}

		}

		return -1;
	}

	private void swap(ArrayListMultimap<String, Integer> optionIndexes, MenuEntry[] entries, int index1, int index2)
	{
		MenuEntry entry = entries[index1];
		entries[index1] = entries[index2];
		entries[index2] = entry;

		client.setMenuEntries(entries);

		// Rebuild option indexes
		optionIndexes.clear();
		int idx = 0;
		for (MenuEntry menuEntry : entries)
		{
			String option = Text.removeTags(menuEntry.getOption()).toLowerCase();
			optionIndexes.put(option, idx++);
		}
	}

	private void removeShiftClickCustomizationMenus()
	{
		menuManager.removeManagedCustomMenu(FIXED_INVENTORY_TAB_CONFIGURE);
		menuManager.removeManagedCustomMenu(FIXED_INVENTORY_TAB_SAVE);
		menuManager.removeManagedCustomMenu(RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_CONFIGURE);
		menuManager.removeManagedCustomMenu(RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_SAVE);
		menuManager.removeManagedCustomMenu(RESIZABLE_INVENTORY_TAB_CONFIGURE);
		menuManager.removeManagedCustomMenu(RESIZABLE_INVENTORY_TAB_SAVE);
	}

	private void refreshShiftClickCustomizationMenus()
	{
		removeShiftClickCustomizationMenus();
		if (configuringShiftClick)
		{
			menuManager.addManagedCustomMenu(FIXED_INVENTORY_TAB_SAVE);
			menuManager.addManagedCustomMenu(RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_SAVE);
			menuManager.addManagedCustomMenu(RESIZABLE_INVENTORY_TAB_SAVE);
		}
		else
		{
			menuManager.addManagedCustomMenu(FIXED_INVENTORY_TAB_CONFIGURE);
			menuManager.addManagedCustomMenu(RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_CONFIGURE);
			menuManager.addManagedCustomMenu(RESIZABLE_INVENTORY_TAB_CONFIGURE);
		}
	}
}
