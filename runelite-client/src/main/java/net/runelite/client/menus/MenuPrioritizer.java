package net.runelite.client.menus;

import net.runelite.api.Client;
import net.runelite.api.MenuEntry;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

class MenuPrioritizer
{
	private final Client client;
	private final MenuManager menuManager;

	private MenuEntry[] entries;
	private CountDownLatch latch = new CountDownLatch(0);

	MenuPrioritizer(Client client, MenuManager menuManager)
	{
		this.client = client;
		this.menuManager = menuManager;
	}

	CountDownLatch isRunning()
	{
		return latch;
	}

	void prioritize()
	{
		if (latch.getCount() != 0)
		{
			return;
		}

		entries = client.getMenuEntries();
		latch = new CountDownLatch(3);

		if (!menuManager.getHiddenEntries().isEmpty())
		{
			hiddenFinder.run();
		}
		else
		{
			latch.countDown();
		}

		if (!menuManager.getPriorityEntries().isEmpty())
		{
			priorityFinder.run();
		}
		else
		{
			latch.countDown();
		}

		if (!menuManager.getSwaps().isEmpty())
		{
			swapFinder.run();
		}
		else
		{
			latch.countDown();
		}
	}

	private Thread hiddenFinder = new Thread()
	{
		@Override
		public void run()
		{
			Arrays.stream(entries).parallel().forEach(entry ->
			{
				for (MenuComparableEntry menuComparableEntry : menuManager.getHiddenEntries())
				{
					if (menuComparableEntry.matches(entry))
					{
						menuManager.getCurrentHiddenEntries().add(entry);
						return;
					}
				}
			});
			latch.countDown();
		}
	};

	private Thread priorityFinder = new Thread()
	{
		@Override
		public void run()
		{
			Arrays.stream(entries).parallel().forEach(entry ->
			{
				for (MenuComparableEntry menuComparableEntry : menuManager.getPriorityEntries())
				{
					if (menuComparableEntry.matches(entry))
					{
						menuManager.getCurrentPriorityEntries().add(entry);
						return;
					}
				}
			});
			latch.countDown();
		}
	};

	private Thread swapFinder = new Thread()
	{
		@Override
		public void run()
		{
			Arrays.stream(entries).parallel().forEach(entry ->
			{
				for (Map.Entry<MenuComparableEntry, MenuComparableEntry> menuComparableEntry : menuManager.getSwaps().entrySet())
				{
					if (menuComparableEntry.getValue().matches(entry))
					{
						menuManager.getCurrentSwaps().put(menuComparableEntry.getKey(), entry);
						return;
					}
				}
			});
			latch.countDown();
		}
	};
}
