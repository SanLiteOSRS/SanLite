/*
 * Copyright (c) 2017, Robin <robin.weymans@gmail.com>
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
package net.runelite.client.menus;

import com.google.common.base.Preconditions;
import com.google.common.collect.*;

import java.util.*;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPCDefinition;
import net.runelite.api.events.*;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.util.Text;

import static net.runelite.api.MenuAction.MENU_ACTION_DEPRIORITIZE_OFFSET;

@Singleton
@Slf4j
public class MenuManager
{
	/*
	 * The index needs to be between 4 and 7,
	 */
	private static final int IDX_LOWER = 4;
	private static final int IDX_UPPER = 8;
	static final Pattern LEVEL_PATTERN = Pattern.compile("\\(level-[0-9]*\\)");

	private final Client client;
	private final EventBus eventBus;
	private final MenuPrioritizer menuPrioritizer;

	// Maps the indexes that are being used to the menu option.
	private final Map<Integer, String> playerMenuIndexMap = new HashMap<>();
	// Used to manage custom non-player menu options
	private final Multimap<Integer, WidgetMenuOption> managedMenuOptions = HashMultimap.create();
	private final Set<String> npcMenuOptions = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private final Set<MenuComparableEntry> priorityEntries = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private final Set<MenuEntry> currentPriorityEntries = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private final Set<MenuComparableEntry> hiddenEntries = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private final Set<MenuEntry> currentHiddenEntries = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private final Map<MenuComparableEntry, MenuComparableEntry> swaps = new HashMap<>();

	@Getter(AccessLevel.PACKAGE)
	private final Map<MenuComparableEntry, MenuEntry> currentSwaps = new HashMap<>();

	private final LinkedHashSet<MenuEntry> entries = Sets.newLinkedHashSet();

	private MenuEntry leftClickEntry = null;
	private int leftClickType = -1;

	@Inject
	private MenuManager(Client client, EventBus eventBus)
	{
		this.client = client;
		this.eventBus = eventBus;
		this.menuPrioritizer = new MenuPrioritizer(this.client, this);
	}

	/**
	 * Adds a CustomMenuOption to the list of managed menu options.
	 *
	 * @param customMenuOption The custom menu to add
	 */
	public void addManagedCustomMenu(WidgetMenuOption customMenuOption)
	{
		WidgetInfo widget = customMenuOption.getWidget();
		managedMenuOptions.put(widget.getId(), customMenuOption);
	}

	/**
	 * Removes a CustomMenuOption from the list of managed menu options.
	 *
	 * @param customMenuOption The custom menu to add
	 */
	public void removeManagedCustomMenu(WidgetMenuOption customMenuOption)
	{
		WidgetInfo widget = customMenuOption.getWidget();
		managedMenuOptions.remove(widget.getId(), customMenuOption);
	}

	private boolean menuContainsCustomMenu(WidgetMenuOption customMenuOption)
	{
		for (MenuEntry menuEntry : client.getMenuEntries())
		{
			String option = menuEntry.getOption();
			String target = menuEntry.getTarget();

			if (option.equals(customMenuOption.getMenuOption()) && target.equals(customMenuOption.getMenuTarget()))
			{
				return true;
			}
		}
		return false;
	}

	@Subscribe
	public void onMenuOpened(MenuOpened event)
	{
		currentPriorityEntries.clear();
		currentHiddenEntries.clear();

		// Need to reorder the list to normal, then rebuild with swaps
		MenuEntry[] oldEntries = event.getMenuEntries();

		for (MenuEntry entry : oldEntries)
		{
			if (entry == leftClickEntry)
			{
				entry.setType(leftClickType);
				break;
			}
		}

		leftClickEntry = null;
		leftClickType = -1;

		client.sortMenuEntries();

		List<MenuEntry> newEntries = Lists.newArrayList(oldEntries);

		boolean shouldDeprioritize = false;

		prioritizer: for (MenuEntry menuEntry : oldEntries)
		{
			// Remove hidden entries from menus
			for (MenuComparableEntry menuComparableEntry : hiddenEntries)
			{
				if (menuComparableEntry.matches(menuEntry))
				{
					newEntries.remove(menuEntry);
					continue prioritizer;
				}
			}

			for (MenuComparableEntry menuComparableEntry : priorityEntries)
			{
				// Create list of priority entries, and remove from menus
				if (menuComparableEntry.matches(menuEntry))
				{
					// Other entries need to be deprioritized if their types are lower than 1000
					if (menuEntry.getType() >= 1000 && !shouldDeprioritize)
					{
						shouldDeprioritize = true;
					}
					currentPriorityEntries.add(menuEntry);
					newEntries.remove(menuEntry);
					continue prioritizer;
				}
			}

			if (newEntries.size() > 0)
			{
				// Swap first matching entry to top
				for (MenuComparableEntry menuComparableEntry : swaps.keySet())
				{
					if (!menuComparableEntry.matches(menuEntry))
					{
						continue;
					}

					MenuEntry swapFrom = null;
					MenuComparableEntry from = swaps.get(menuComparableEntry);

					for (MenuEntry menuEntry1 : newEntries)
					{
						if (from.matches(menuEntry1))
						{
							swapFrom = menuEntry1;
							break;
						}
					}

					// Do not need to swap with itself
					if (swapFrom != null && swapFrom != menuEntry)
					{
						// Deprioritize entries if the swaps are not in similar type groups
						if ((swapFrom.getType() >= 1000 && menuEntry.getType() < 1000) || (menuEntry.getType() >= 1000 &&
								swapFrom.getType() < 1000) && !shouldDeprioritize)
						{
							shouldDeprioritize = true;
						}

						int indexFrom = newEntries.indexOf(swapFrom);
						int indexTo = newEntries.indexOf(menuEntry);

						Collections.swap(newEntries, indexFrom, indexTo);
					}
				}
			}
		}

		if (shouldDeprioritize)
		{
			for (MenuEntry menuEntry : newEntries)
			{
				if (menuEntry.getType() <= MENU_ACTION_DEPRIORITIZE_OFFSET)
				{
					menuEntry.setType(menuEntry.getType() + MENU_ACTION_DEPRIORITIZE_OFFSET);
				}
			}
		}

		if (!priorityEntries.isEmpty())
		{
			newEntries.addAll(currentPriorityEntries);
		}

		event.setMenuEntries(newEntries.toArray(new MenuEntry[0]));
	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		int widgetId = event.getActionParam1();
		Collection<WidgetMenuOption> options = managedMenuOptions.get(widgetId);
		MenuEntry[] menuEntries = client.getMenuEntries();

		for (WidgetMenuOption currentMenu : options)
		{
			if (!menuContainsCustomMenu(currentMenu)) // Don't add if we have already added it to this widget
			{
				menuEntries = Arrays.copyOf(menuEntries, menuEntries.length + 1);

				MenuEntry menuEntry = menuEntries[menuEntries.length - 1] = new MenuEntry();
				menuEntry.setOption(currentMenu.getMenuOption());
				menuEntry.setParam1(widgetId);
				menuEntry.setTarget(currentMenu.getMenuTarget());
				menuEntry.setType(MenuAction.RUNELITE.getId());

				client.setMenuEntries(menuEntries);
			}
		}
	}

	@Subscribe
	public void onBeforeRender(BeforeRender event)
	{
		leftClickEntry = null;
		leftClickType = -1;

		if (client.isMenuOpen())
		{
			return;
		}

		entries.clear();

		entries.addAll(Arrays.asList(client.getMenuEntries()));

		if (entries.size() < 2)
		{
			return;
		}

		currentPriorityEntries.clear();
		currentHiddenEntries.clear();
		currentSwaps.clear();

		menuPrioritizer.prioritize();

		// Wait for the menu prioritizer to finish running
		try
		{
			menuPrioritizer.isRunning().await();
		}
		catch (InterruptedException e)
		{
			log.warn("Interrupted exception during MenuPrioritizer await {}", e.toString());
		}

		entries.removeAll(currentHiddenEntries);

		for (MenuEntry entry : currentPriorityEntries)
		{
			if (entries.contains(entry))
			{
				leftClickEntry = entry;
				leftClickType = entry.getType();
				entries.remove(leftClickEntry);
				leftClickEntry.setType(MenuAction.WIDGET_DEFAULT.getId());
				entries.add(leftClickEntry);
				break;
			}
		}


		if (leftClickEntry == null)
		{
			MenuEntry first = Iterables.getLast(entries);

			for (MenuComparableEntry swappedMenuEntry : currentSwaps.keySet())
			{
				if (swappedMenuEntry.matches(first))
				{
					leftClickEntry = currentSwaps.get(swappedMenuEntry);
					leftClickType = leftClickEntry.getType();
					entries.remove(leftClickEntry);
					leftClickEntry.setType(MenuAction.WIDGET_DEFAULT.getId());
					entries.add(leftClickEntry);
					break;
				}
			}
		}

		client.setMenuEntries(entries.toArray(new MenuEntry[0]));
	}

	public void addPlayerMenuItem(String menuText)
	{
		Preconditions.checkNotNull(menuText);

		int playerMenuIndex = findEmptyPlayerMenuIndex();
		if (playerMenuIndex == IDX_UPPER)
		{
			return; // no more slots
		}

		addPlayerMenuItem(playerMenuIndex, menuText);
	}

	public void removePlayerMenuItem(String menuText)
	{
		Preconditions.checkNotNull(menuText);
		for (Map.Entry<Integer, String> entry : playerMenuIndexMap.entrySet())
		{
			if (entry.getValue().equalsIgnoreCase(menuText))
			{
				removePlayerMenuItem(entry.getKey());
				break;
			}
		}
	}

	@Subscribe
	public void onPlayerMenuOptionsChanged(PlayerMenuOptionsChanged event)
	{
		int idx = event.getIndex();

		String menuText = playerMenuIndexMap.get(idx);
		if (menuText == null)
		{
			return; // not our menu
		}

		// find new index for this option
		int newIdx = findEmptyPlayerMenuIndex();
		if (newIdx == IDX_UPPER)
		{
			log.debug("Client has updated player menu index {} where option {} was, and there are no more free slots available", idx, menuText);
			return;
		}

		log.debug("Client has updated player menu index {} where option {} was, moving to index {}", idx, menuText, newIdx);

		playerMenuIndexMap.remove(idx);
		addPlayerMenuItem(newIdx, menuText);
	}

	@Subscribe
	public void onNpcActionChanged(NpcActionChanged event)
	{
		NPCDefinition composition = event.getNpcDefinition();
		for (String npcOption : npcMenuOptions)
		{
			addNpcOption(composition, npcOption);
		}
	}

	private void addNpcOption(NPCDefinition composition, String npcOption)
	{
		String[] actions = composition.getActions();
		int unused = -1;
		for (int i = 0; i < actions.length; ++i)
		{
			if (actions[i] == null && unused == -1)
			{
				unused = i;
			}
			else if (actions[i] != null && actions[i].equals(npcOption))
			{
				return;
			}
		}
		if (unused == -1)
		{
			return;
		}
		actions[unused] = npcOption;
	}

	private void removeNpcOption(NPCDefinition composition, String npcOption)
	{
		String[] actions = composition.getActions();

		if (composition.getActions() == null)
		{
			return;
		}

		for (int i = 0; i < actions.length; ++i)
		{
			if (actions[i] != null && actions[i].equals(npcOption))
			{
				actions[i] = null;
			}
		}
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked event)
	{
		if (leftClickEntry != null && leftClickType != -1)
		{
			leftClickEntry.setType(leftClickType);
			event.setMenuEntry(leftClickEntry);
			leftClickEntry = null;
		}

		if (event.getMenuAction() != MenuAction.RUNELITE)
		{
			return; // not a player menu
		}

		int widgetId = event.getActionParam1();
		Collection<WidgetMenuOption> options = managedMenuOptions.get(widgetId);

		for (WidgetMenuOption curMenuOption : options)
		{
			if (curMenuOption.getMenuTarget().equals(event.getTarget())
				&& curMenuOption.getMenuOption().equals(event.getOption()))
			{
				WidgetMenuOptionClicked customMenu = new WidgetMenuOptionClicked();
				customMenu.setMenuOption(event.getOption());
				customMenu.setMenuTarget(event.getTarget());
				customMenu.setWidget(curMenuOption.getWidget());
				eventBus.post(customMenu);
				return; // don't continue because it's not a player option
			}
		}

		String target = event.getTarget();

		// removes tags and level from player names for example:
		// <col=ffffff>username<col=40ff00>  (level-42) or <col=ffffff><img=2>username</col>
		String username = Text.removeTags(target).split("[(]")[0].trim();

		PlayerMenuOptionClicked playerMenuOptionClicked = new PlayerMenuOptionClicked();
		playerMenuOptionClicked.setMenuOption(event.getOption());
		playerMenuOptionClicked.setMenuTarget(username);

		eventBus.post(playerMenuOptionClicked);
	}

	private void addPlayerMenuItem(int playerOptionIndex, String menuText)
	{
		client.getPlayerOptions()[playerOptionIndex] = menuText;
		client.getPlayerOptionsPriorities()[playerOptionIndex] = true;
		client.getPlayerMenuTypes()[playerOptionIndex] = MenuAction.RUNELITE.getId();

		playerMenuIndexMap.put(playerOptionIndex, menuText);
	}

	private void removePlayerMenuItem(int playerOptionIndex)
	{
		client.getPlayerOptions()[playerOptionIndex] = null;
		playerMenuIndexMap.remove(playerOptionIndex);
	}

	/**
	 * Find the next empty player menu slot index
	 */
	private int findEmptyPlayerMenuIndex()
	{
		int index = IDX_LOWER;

		String[] playerOptions = client.getPlayerOptions();
		while (index < IDX_UPPER && playerOptions[index] != null)
		{
			index++;
		}

		return index;
	}

	/**
	 * Adds menu entry to the set of priority menu entries which when present, will remove all entries except for this one.
	 *
	 * @param option menu entry option
	 * @param target menu entry target
	 */
	public void addPriorityEntry(String option, String target)
	{
		priorityEntries.add(new MenuComparableEntry(Text.standardize(option), Text.standardize(target)));
	}

	/**
	 * Removes menu entry from the set of priority menu entries which when present, will remove all entries except for this one.
	 *
	 * @param option menu entry option
	 * @param target menu entry target
	 */
	public void removePriorityEntry(String option, String target)
	{
		priorityEntries.removeIf(new MenuComparableEntry(Text.standardize(option), Text.standardize(target))::equals);
	}

	/**
	 * Adds to the map of swaps. Strict options, not strict target but target1=target2
	 *
	 * @param option menu entry option swapped from
	 * @param target menu entry target swapped from/to
	 * @param option2 menu entry option swapped to
	 */
	public void addMenuEntrySwap(String option, String target, String option2)
	{
		addMenuEntrySwap(option, target, option2, target, true, false);
	}

	/**
	 * Adds to the map of swaps. - Uses non-strict option and target
	 *
	 * @param option menu entry option swapped from
	 * @param target menu entry target swapped from
	 * @param option2 menu entry option swapped to
	 * @param target2 menu entry target swapped to
	 */
	public void addMenuEntrySwap(String option, String target, String option2, String target2)
	{
		addMenuEntrySwap(option, target, option2, target2, false, false);
	}

	/**
	 * Adds to the map of menu entry swaps with id and type as -1
	 *
	 * @param option menu entry option swapped from
	 * @param target menu entry target swapped from
	 * @param option2 menu entry option swapped to
	 * @param target2 menu entry target swapped to
	 * @param strictOption non-strict uses contains, strict uses equals
	 * @param strictTarget non-strict uses contains, strict uses equals
	 */
	public void addMenuEntrySwap(String option, String target, String option2, String target2, boolean strictOption, boolean strictTarget)
	{
		MenuComparableEntry swapFrom = new MenuComparableEntry(Text.standardize(option), Text.standardize(target), -1, -1, strictOption, strictTarget);
		MenuComparableEntry swapTo = new MenuComparableEntry(Text.standardize(option2), Text.standardize(target2), -1, -1, strictOption, strictTarget);

		if (swapTo.equals(swapFrom))
		{
			log.warn("Tried swapping a menu entry with itself");
			return;
		}
		swaps.put(swapFrom, swapTo);
	}

	/**
	 * Adds to the map of menu entry swaps
	 *
	 * @param swapFrom menu entry swapped from
	 * @param swapTo menu entry swapped to
	 */
	public void addMenuEntrySwap(MenuComparableEntry swapFrom, MenuComparableEntry swapTo)
	{
		if (swapTo.equals(swapFrom))
		{
			log.warn("Tried swapping a menu entry with itself");
			return;
		}
		swaps.put(swapFrom, swapTo);
	}

	/**
	 * Adds to the map of menu entry swaps - Non-strict option/target, but with type & id
	 * ID's of -1 are ignored in matches()!
	 *
	 * @param option menu entry option swapped from
	 * @param target menu entry target swapped from
	 * @param id menu entry id swapped from
	 * @param type menu entry type swapped from
	 * @param option2 menu entry option swapped to
	 * @param target2 menu entry target swapped to
	 * @param id2 menu entry id swapped to
	 * @param type2 menu entry type swapped to
	 */
	public void addMenuEntrySwap(String option, String target, int id, int type, String option2, String target2, int id2, int type2)
	{
		MenuComparableEntry swapFrom = new MenuComparableEntry(Text.standardize(option), Text.standardize(target), id, type, false, false);
		MenuComparableEntry swapTo = new MenuComparableEntry(Text.standardize(option2), Text.standardize(target2), id2, type2, false, false);

		if (swapTo.equals(swapFrom))
		{
			log.warn("Tried swapping a menu entry with itself");
			return;
		}
		swaps.put(swapFrom, swapTo);
	}

	/**
	 * Removes menu entry swap.
	 *
	 * @param option menu entry option swapped from
	 * @param target menu entry target swapped from
	 * @param option2 menu entry option swapped to
	 */
	public void removeMenuEntrySwap(String option, String target, String option2)
	{
		removeMenuEntrySwap(option, target, option2, target, true, false);
	}

	/**
	 * Removes menu entry swap.
	 *
	 * @param option menu entry option swapped from
	 * @param target menu entry target swapped from
	 * @param option2 menu entry option swapped to
	 * @param target2 menu entry target swapped to
	 */
	public void removeMenuEntrySwap(String option, String target, String option2, String target2)
	{
		removeMenuEntrySwap(option, target, option2, target2, false, false);
	}

	/**
	 * Removes menu entry swap.
	 *
	 * @param option menu entry option swapped from
	 * @param target menu entry target swapped from
	 * @param option2 menu entry option swapped to
	 * @param target2 menu entry target swapped to
	 * @param strictOption non-strict uses contains, strict uses equals
	 * @param strictTarget non-strict uses contains, strict uses equals
	 */
	public void removeMenuEntrySwap(String option, String target, String option2, String target2, boolean strictOption, boolean strictTarget)
	{
		MenuComparableEntry swapFrom = new MenuComparableEntry(Text.standardize(option), Text.standardize(target), -1, -1, strictOption, strictTarget);
		MenuComparableEntry swapTo = new MenuComparableEntry(Text.standardize(option2), Text.standardize(target2), -1, -1, strictOption, strictTarget);
		removeMenuEntrySwap(swapFrom, swapTo);
	}

	/**
	 * Removes menu entry swap.
	 *
	 * @param option menu entry option swapped from
	 * @param target menu entry target swapped from
	 * @param id menu entry id swapped from
	 * @param type menu entry type swapped from
	 * @param option2 menu entry option swapped to
	 * @param target2 menu entry target swapped to
	 * @param id2 menu entry id swapped to
	 * @param type2 menu entry type swapped to
	 */
	public void removeMenuEntrySwap(String option, String target, int id, int type, String option2, String target2, int id2, int type2)
	{
		MenuComparableEntry swapFrom = new MenuComparableEntry(Text.standardize(option), Text.standardize(target), id, type, false, false);
		MenuComparableEntry swapTo = new MenuComparableEntry(Text.standardize(option2), Text.standardize(target2), id2, type2, false, false);
		swaps.entrySet().removeIf(e -> e.getKey().equals(swapFrom) && e.getValue().equals(swapTo));
	}

	/**
	 * Removes menu entry swap.
	 *
	 * @param swapFrom menu entry swapped from
	 * @param swapTo menu entry swapped to
	 */
	public void removeMenuEntrySwap(MenuComparableEntry swapFrom, MenuComparableEntry swapTo)
	{
		swaps.entrySet().removeIf(e -> e.getKey().equals(swapFrom) && e.getValue().equals(swapTo));
	}

	/**
	 * Removes all menu entry swaps for the given target.
	 *
	 * @param target target name
	 */
	public void removeMenuEntrySwaps(String target)
	{
		swaps.keySet().removeIf(e -> e.getTarget().equals(Text.standardize(target)));
	}

	/**
	 * Adds to the set of hidden entries. Menu entries in this set are hidden when present.
	 *
	 * @param menuComparableEntry menu comparable entry
	 */
	public void addHiddenMenuEntry(MenuComparableEntry menuComparableEntry)
	{
		hiddenEntries.add(menuComparableEntry);
	}

	/**
	 * Adds to the set of hidden entries. Menu entries in this set are hidden when present.
	 *
	 * @param option menu entry option
	 * @param target menu entry target
	 */
	public void addHiddenMenuEntry(String option, String target)
	{
		hiddenEntries.add(new MenuComparableEntry(Text.standardize(option), Text.standardize(target)));
	}

	/**
	 * Adds to the set of hidden entries. Menu entries in this set are hidden when present.
	 * This method will add one with strict option, but not-strict target (contains for target, equals for option)
	 *
	 * @param option menu entry option
	 */
	public void addHiddenMenuEntry(String option)
	{
		hiddenEntries.add(new MenuComparableEntry(Text.standardize(option), "", false));
	}

	/**
	 * Adds to the set of hidden entries. Menu entries in this set are hidden when present.
	 *
	 * @param option menu entry option
	 * @param target menu entry target
	 * @param strictOption non-strict uses contains, strict uses equals
	 * @param strictTarget non-strict uses contains, strict uses equals
	 */
	public void addHiddenMenuEntry(String option, String target, boolean strictOption, boolean strictTarget)
	{
		hiddenEntries.add(new MenuComparableEntry(Text.standardize(option), Text.standardize(target), -1, -1,
				strictOption, strictTarget));
	}

	/**
	 * Remove from the set of hidden entries. Menu entries in this set are hidden when present.
	 *
	 * @param menuComparableEntry menu comparable entry
	 */
	public void removeHiddenMenuEntry(MenuComparableEntry menuComparableEntry)
	{
		hiddenEntries.remove(menuComparableEntry);
	}

	/**
	 * Remove from the set of hidden entries. Menu entries in this set are hidden when present.
	 *
	 * @param option menu entry option
	 * @param target menu entry target
	 */
	public void removeHiddenMenuEntry(String option, String target)
	{
		hiddenEntries.removeIf(new MenuComparableEntry(Text.standardize(option), Text.standardize(target))::equals);
	}

	/**
	 * Remove from the set of hidden entries. Menu entries in this set are hidden when present.
	 *
	 * @param option menu entry option
	 */
	public void removeHiddenMenuEntry(String option)
	{
		hiddenEntries.removeIf(new MenuComparableEntry(Text.standardize(option), "", false)::equals);
	}

	/**
	 * Remove from the set of hidden entries. Menu entries in this set are hidden when present.
	 *
	 * @param option menu entry option
	 * @param target menu entry target
	 * @param strictOption non-strict uses contains, strict uses equals
	 * @param strictTarget non-strict uses contains, strict uses equals
	 */
	public void removeHiddenMenuEntry(String option, String target, boolean strictOption, boolean strictTarget)
	{
		hiddenEntries.remove(new MenuComparableEntry(Text.standardize(option), Text.standardize(target), -1, -1, strictOption, strictTarget));
	}
}
