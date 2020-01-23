package net.runelite.client.plugins.transmog;

import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.ItemDefinition;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.IconTextField;
import net.runelite.client.ui.components.PluginErrorPanel;
import net.runelite.client.util.AsyncBufferedImage;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

@Singleton
@Slf4j
public class ItemSearchPanel extends PluginPanel
{
	private static final String ERROR_PANEL = "ERROR_PANEL";
	private static final String RESULTS_PANEL = "RESULTS_PANEL";
	private static final int MAX_RESULTS = 16;

	private final GridBagConstraints constraints = new GridBagConstraints();
	private final CardLayout cardLayout = new CardLayout();

	private final ClientThread clientThread;
	private final Client client;
	private final ItemManager itemManager;

	private final IconTextField searchBar = new IconTextField();

	/*  The results container, this will hold all the individual ge item panels */
	private final JPanel searchItemsPanel = new JPanel();

	/*  The center panel, this holds either the error panel or the results container */
	private final JPanel centerPanel = new JPanel(cardLayout);

	/*  The error panel, this displays an error message */
	private final PluginErrorPanel errorPanel = new PluginErrorPanel();
	private Map<Integer, ItemDefinition> results = new LinkedHashMap<>();

	@Inject
	ItemSearchPanel(ClientThread clientThread, Client client, ItemManager itemManager)
	{
		this.clientThread = clientThread;
		this.client = client;
		this.itemManager = itemManager;

		setLayout(new BorderLayout());
		setBackground(ColorScheme.DARK_GRAY_COLOR);

		/*  The main container, this holds the search bar and the center panel */
		JPanel container = new JPanel();
		container.setLayout(new BorderLayout(5, 5));
		container.setBorder(new EmptyBorder(10, 10, 10, 10));
		container.setBackground(ColorScheme.DARK_GRAY_COLOR);

		searchBar.setIcon(IconTextField.Icon.SEARCH);
		searchBar.setPreferredSize(new Dimension(100, 30));
		searchBar.setBackground(ColorScheme.DARKER_GRAY_COLOR);
		searchBar.setHoverBackgroundColor(ColorScheme.DARK_GRAY_HOVER_COLOR);
		searchBar.addActionListener(e -> itemLookup(false));
		searchBar.addClearListener(e -> updateSearch());

		searchItemsPanel.setLayout(new GridBagLayout());
		searchItemsPanel.setBackground(ColorScheme.DARK_GRAY_COLOR);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1;
		constraints.gridx = 0;
		constraints.gridy = 0;

		/* This panel wraps the results panel and guarantees the scrolling behaviour */
		JPanel wrapper = new JPanel(new BorderLayout());
		wrapper.setBackground(ColorScheme.DARK_GRAY_COLOR);
		wrapper.add(searchItemsPanel, BorderLayout.NORTH);

		/*  The results wrapper, this scrolling panel wraps the results container */
		JScrollPane resultsWrapper = new JScrollPane(wrapper);
		resultsWrapper.setBackground(ColorScheme.DARK_GRAY_COLOR);
		resultsWrapper.getVerticalScrollBar().setPreferredSize(new Dimension(12, 0));
		resultsWrapper.getVerticalScrollBar().setBorder(new EmptyBorder(0, 5, 0, 0));
		resultsWrapper.setVisible(false);

		/* This panel wraps the error panel and limits its height */
		JPanel errorWrapper = new JPanel(new BorderLayout());
		errorWrapper.setBackground(ColorScheme.DARK_GRAY_COLOR);
		errorWrapper.add(errorPanel, BorderLayout.NORTH);

		errorPanel.setContent("Equipment Search",
				"Here you can search for an item by its name to find it's unique id.");

		centerPanel.add(resultsWrapper, RESULTS_PANEL);
		centerPanel.add(errorWrapper, ERROR_PANEL);

		cardLayout.show(centerPanel, ERROR_PANEL);

		container.add(searchBar, BorderLayout.NORTH);
		container.add(centerPanel, BorderLayout.CENTER);

		add(container, BorderLayout.CENTER);
	}

	private void itemLookup(boolean exactMatch)
	{
		if (!updateSearch())
		{
			return;
		}

		filterResults(searchBar.getText());
		if (results.isEmpty())
		{
			searchBar.setIcon(IconTextField.Icon.ERROR);
			errorPanel.setContent("No results found.", "No items were found with that name, please try again.");
			cardLayout.show(centerPanel, ERROR_PANEL);
			searchBar.setEditable(true);
			return;
		}

		for (Map.Entry<Integer, ItemDefinition> entry : results.entrySet())
		{
			log.debug("Name: {} | id: {}", entry.getValue().getName(), entry.getKey());
		}

		// move to client thread to lookup item composition
		clientThread.invokeLater(() -> processResult(exactMatch));
	}

	private void filterResults(String itemName)
	{
		results.clear();

		String search = itemName.toLowerCase();
		if (search.isEmpty())
		{
			return;
		}

		for (int i = 0; i < client.getItemCount() && results.size() < MAX_RESULTS; i++)
		{
			ItemDefinition itemComposition = itemManager.getItemComposition(itemManager.canonicalize(i));
			String name = itemComposition.getName().toLowerCase();
			// The client assigns "null" to item names of items it doesn't know about
			if (!name.equals("null") && name.contains(search))
			{
				// This may already be in the map due to canonicalize mapping the item to something we've already seen
				results.putIfAbsent(itemComposition.getId(), itemComposition);
			}
		}
	}

	private boolean updateSearch()
	{
		String lookup = searchBar.getText();

		if (Strings.isNullOrEmpty(lookup))
		{
			searchItemsPanel.removeAll();
			SwingUtilities.invokeLater(searchItemsPanel::updateUI);
			return false;
		}

		// Input is not empty, add searching label
		searchItemsPanel.removeAll();
		searchBar.setBackground(ColorScheme.DARKER_GRAY_COLOR);
		searchBar.setEditable(false);
		searchBar.setIcon(IconTextField.Icon.LOADING);
		return true;
	}

	private void processResult(boolean exactMatch)
	{
		cardLayout.show(centerPanel, RESULTS_PANEL);

		SwingUtilities.invokeLater(() ->
		{
			int index = 0;
			for (Map.Entry<Integer, ItemDefinition> item : results.entrySet())
			{
				ItemDefinition itemDefinition = item.getValue();
				int itemId = item.getKey();
				AsyncBufferedImage itemImage = itemManager.getImage(itemId);
				ItemPanel panel = new ItemPanel(itemImage, itemDefinition.getName(), itemId);

				/*
				Add the first item directly, wrap the rest with margin. This margin hack is because
				gridbaglayout does not support inter-element margins.
				 */
				if (index++ > 0)
				{
					JPanel marginWrapper = new JPanel(new BorderLayout());
					marginWrapper.setBackground(ColorScheme.DARK_GRAY_COLOR);
					marginWrapper.setBorder(new EmptyBorder(5, 0, 0, 0));
					marginWrapper.add(panel, BorderLayout.NORTH);
					searchItemsPanel.add(marginWrapper, constraints);
				}
				else
				{
					searchItemsPanel.add(panel, constraints);
				}

				constraints.gridy++;
			}

			// if exactMatch was set, then it came from the applet, so don't lose focus
			if (!exactMatch)
			{
				searchItemsPanel.requestFocusInWindow();
			}
			searchBar.setEditable(true);

			// Remove searching label after search is complete
			if (!results.isEmpty())
			{
				searchBar.setIcon(IconTextField.Icon.SEARCH);
			}
		});
	}
}
