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
package net.runelite.client.plugins.config;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.*;
import net.runelite.client.plugins.*;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.DynamicGridLayout;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.IconButton;
import net.runelite.client.ui.components.IconTextField;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.Text;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.Collectors;

@Slf4j
public class ConfigPanel extends PluginPanel
{
	private static final int SCROLLBAR_WIDTH = 17;
	private static final int OFFSET = 6;
	private static final ImageIcon BACK_ICON;
	private static final ImageIcon BACK_ICON_HOVER;

	private static final String RUNELITE_GROUP_NAME = RuneLiteConfig.class.getAnnotation(ConfigGroup.class).value();
	private static final String RUNELITE_PLUGIN = "SanLite";
	private static final String CHAT_COLOR_PLUGIN = "Chat Color";
	private static final String COLLAPSIBLE_ENTRY_CONFIG_KEY = "collapsibleEntry";
	private static final String COLLAPSIBLE_ENTRY_OPENED_CONFIG_KEY = "opened";
	private static final String PINNED_PLUGINS_CONFIG_KEY = "pinnedPlugins";
	static final String PINNED_COLLAPSIBLE_ENTRY_NAME = "PINNED";


	private final PluginManager pluginManager;
	private final ConfigManager configManager;
	private final ScheduledExecutorService executorService;
	private final RuneLiteConfig runeLiteConfig;
	private final ChatColorConfig chatColorConfig;

	private final IconTextField searchBar = new IconTextField();
	private final List<CollapsibleEntry> collapsibleEntries = new ArrayList<>();
	private final JPanel topPanel;
	private final JPanel mainPanel;
	private final JScrollPane scrollPane;

	private boolean showingPluginList = true;
	private int scrollBarPosition = 0;

	static
	{
		final BufferedImage backIcon = ImageUtil.getResourceStreamFromClass(ConfigPanel.class, "config_back_icon.png");
		BACK_ICON = new ImageIcon(backIcon);
		BACK_ICON_HOVER = new ImageIcon(ImageUtil.alphaOffset(backIcon, -100));
	}

	ConfigPanel(PluginManager pluginManager, ConfigManager configManager, ScheduledExecutorService executorService,
				RuneLiteConfig runeLiteConfig, ChatColorConfig chatColorConfig)
	{
		super(false);
		this.pluginManager = pluginManager;
		this.configManager = configManager;
		this.executorService = executorService;
		this.runeLiteConfig = runeLiteConfig;
		this.chatColorConfig = chatColorConfig;

		searchBar.setIcon(IconTextField.Icon.SEARCH);
		searchBar.setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH - 20, 30));
		searchBar.setBackground(ColorScheme.DARKER_GRAY_COLOR);
		searchBar.setHoverBackgroundColor(ColorScheme.DARK_GRAY_HOVER_COLOR);
		searchBar.getDocument().addDocumentListener(new DocumentListener()
		{
			@Override
			public void insertUpdate(DocumentEvent e)
			{
				onSearchBarChanged();
			}

			@Override
			public void removeUpdate(DocumentEvent e)
			{
				onSearchBarChanged();
			}

			@Override
			public void changedUpdate(DocumentEvent e)
			{
				onSearchBarChanged();
			}
		});

		setLayout(new BorderLayout());
		setBackground(ColorScheme.DARK_GRAY_COLOR);

		topPanel = new JPanel();
		topPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		topPanel.setLayout(new BorderLayout(0, OFFSET));
		add(topPanel, BorderLayout.NORTH);

		mainPanel = new FixedWidthPanel();
		mainPanel.setBorder(new EmptyBorder(8, 10, 10, 10));
		mainPanel.setLayout(new DynamicGridLayout(0, 1, 0, 4));
		mainPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

		JPanel northPanel = new FixedWidthPanel();
		northPanel.setLayout(new BorderLayout());
		northPanel.add(mainPanel, BorderLayout.NORTH);

		scrollPane = new JScrollPane(northPanel);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane, BorderLayout.CENTER);

		initializePluginList();
		refreshPluginList();
	}

	/**
	 * Creates entries for all plugin types and retrieves the list of plugins per type to draw in the main panel.
	 */
	private void initializePluginList()
	{
		// Add collapsible entry for pinned plugins
		CollapsibleEntry pinnedPluginsCollapsibleEntry = new CollapsibleEntry(PINNED_COLLAPSIBLE_ENTRY_NAME, this, getPinnedPluginsListItems());
		pinnedPluginsCollapsibleEntry.getCollapsibleEntryItems().forEach(item -> item.setParentCollapsibleEntry(pinnedPluginsCollapsibleEntry));

		collapsibleEntries.add(pinnedPluginsCollapsibleEntry);
		pinnedPluginsCollapsibleEntry.setVisible(getPinnedPluginNames().size() > 0);
		pinnedPluginsCollapsibleEntry.setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH, getPinnedPluginNames().size() > 0 ? 30 : 0));

		// Populate pluginTypeList with collapsible entries and all non-hidden plugins
		for (PluginType pluginType : PluginType.values())
		{
			CollapsibleEntry collapsibleEntry = new CollapsibleEntry(pluginType.name(), this, getPluginListByType(pluginType));
			collapsibleEntry.getCollapsibleEntryItems().forEach(item -> item.setParentCollapsibleEntry(collapsibleEntry));
			collapsibleEntry.setDisplayedEntryItems(collapsibleEntry.getDisplayedCollapsibleEntryItems());
			collapsibleEntries.add(collapsibleEntry);
		}

		for (CollapsibleEntry collapsibleEntry : collapsibleEntries)
		{
			mainPanel.add(collapsibleEntry);
		}
	}

	/**
	 * Retrieves list of all plugin list items with the specified type
	 *
	 * @param pluginType plugin type
	 * @return List of all PluginListItems by specified type
	 */
	private List<PluginListItem> getPluginListByType(PluginType pluginType)
	{
		List<PluginListItem> pluginListItems = new ArrayList<>();
		final List<String> pinnedPlugins = getPinnedPluginNames();

		// Filter on plugin type and filter out hidden plugins
		pluginManager.getPlugins().stream()
				.filter(plugin -> !plugin.getClass().getAnnotation(PluginDescriptor.class).hidden()
						&& plugin.getClass().getAnnotation(PluginDescriptor.class).type().equals(pluginType))
				.forEach(plugin ->
				{
					final PluginDescriptor descriptor = plugin.getClass().getAnnotation(PluginDescriptor.class);
					final Config config = pluginManager.getPluginConfigProxy(plugin);
					final ConfigDescriptor configDescriptor = config == null ? null : configManager.getConfigDescriptor(config);

					final PluginListItem listItem = new PluginListItem(this, plugin, plugin.getClass().getAnnotation(PluginDescriptor.class).type(), descriptor, config, configDescriptor);
					listItem.setPinned(pinnedPlugins.contains(listItem.getName()));
					pluginListItems.add(listItem);
				});

		if (pluginType.equals(PluginType.VANILLA))
		{
			// Add special entries for core client configurations
			final PluginListItem runeLite = createClientSettingsPlugin();
			final PluginListItem chatColor = createCreateChatColorPlugin();

			pluginListItems.add(runeLite);
			pluginListItems.add(chatColor);
		}
		pluginListItems.sort(Comparator.comparing(PluginListItem::getName));
		return pluginListItems;
	}

	/**
	 * Retrieves a list of all pinned plugins
	 *
	 * @return list of pinned plugins
	 */
	private List<PluginListItem> getPinnedPluginsListItems()
	{
		List<PluginListItem> pluginListItems = new ArrayList<>();
		final List<String> pinnedPlugins = getPinnedPluginNames();

		// Filter on plugin type and collapse state, also filter out hidden plugins
		pluginManager.getPlugins().stream()
				.filter(plugin -> !plugin.getClass().getAnnotation(PluginDescriptor.class).hidden()
						&& pinnedPlugins.contains(plugin.getClass().getAnnotation(PluginDescriptor.class).name()))
				.forEach(plugin ->
				{
					final PluginDescriptor descriptor = plugin.getClass().getAnnotation(PluginDescriptor.class);
					final Config config = pluginManager.getPluginConfigProxy(plugin);
					final ConfigDescriptor configDescriptor = config == null ? null : configManager.getConfigDescriptor(config);

					final PluginListItem collapsibleEntryItem = new PluginListItem(this, plugin, plugin.getClass().getAnnotation(PluginDescriptor.class).type(), descriptor, config, configDescriptor);
					collapsibleEntryItem.setPinned(pinnedPlugins.contains(collapsibleEntryItem.getName()));
					pluginListItems.add(collapsibleEntryItem);
				});

		// Add special entries for core client configurations
		if (pinnedPlugins.contains(RUNELITE_PLUGIN))
		{
			final PluginListItem runeLite = createClientSettingsPlugin();
			pluginListItems.add(runeLite);
		}

		if (pinnedPlugins.contains(CHAT_COLOR_PLUGIN))
		{
			final PluginListItem chatColor = createCreateChatColorPlugin();
			pluginListItems.add(chatColor);
		}

		pluginListItems.sort(Comparator.comparing(PluginListItem::getName));
		return pluginListItems;
	}

	/**
	 * Updates the collapsible entry item list with the changed plugin list item
	 *
	 * @param pluginListItem updated plugin list item
	 */
	void updateCollapsibleEntryListItem(PluginListItem pluginListItem)
	{
		CollapsibleEntry entry = pluginListItem.getParentCollapsibleEntry();
		if (entry.getName().equals(PINNED_COLLAPSIBLE_ENTRY_NAME))
		{
			for (CollapsibleEntry collapsibleEntry : collapsibleEntries)
			{
				if (collapsibleEntry.getCollapsibleEntryItems().size() == 0)
				{
					continue;
				}

				if (pluginListItem.getPluginType() == collapsibleEntry.getCollapsibleEntryItems().get(0).getPluginType())
				{
					for (PluginListItem listItem : new ArrayList<>(collapsibleEntry.getCollapsibleEntryItems()))
					{
						if (listItem.getName().equals(pluginListItem.getName()))
						{
							collapsibleEntry.getCollapsibleEntryItems().remove(listItem);
							collapsibleEntry.getCollapsibleEntryItems().add(pluginListItem);
							collapsibleEntry.getCollapsibleEntryItems().sort(Comparator.comparing(PluginListItem::getName));
						}
					}
				}
			}
		}
		else
		{
			CollapsibleEntry collapsibleEntry = pluginListItem.getParentCollapsibleEntry();
			for (PluginListItem listItem : new ArrayList<>(collapsibleEntry.getCollapsibleEntryItems()))
			{
				if (listItem.getName().equals(pluginListItem.getName()))
				{
					collapsibleEntry.getCollapsibleEntryItems().remove(listItem);
					collapsibleEntry.getCollapsibleEntryItems().add(pluginListItem);
					collapsibleEntry.getCollapsibleEntryItems().sort(Comparator.comparing(PluginListItem::getName));
				}
			}
		}
	}

	/**
	 * Sets visibility of the pinned collapsible entry based on pinned plugins size.
	 */
	void setPinnedCollapsibleEntryVisibility()
	{
		for (CollapsibleEntry collapsibleEntry : collapsibleEntries)
		{
			if (collapsibleEntry.getName().equals(PINNED_COLLAPSIBLE_ENTRY_NAME))
			{
				collapsibleEntry.setVisible(getPinnedPluginNames().size() > 0);
				collapsibleEntry.setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH, getPinnedPluginNames().size() > 0 ? 30 : 0));
			}
		}
	}

	/**
	 * Updates displayed collapsible entry items for each collapsible entry on plugin item pin.
	 * The pinned collapsible entry is updated last.
	 *
	 * @param pluginListItem updated plugin list item
	 */
	void refreshCollapsibleEntriesDisplayedListOnPin(PluginListItem pluginListItem)
	{
		updatePinnedCollapsibleEntryItemsList(pluginListItem);
		for (CollapsibleEntry collapsibleEntry : collapsibleEntries)
		{
			// All collapsible entries should update entry item lists before the pinned collapsible entry
			if (!collapsibleEntry.getName().equals(PINNED_COLLAPSIBLE_ENTRY_NAME))
			{
				collapsibleEntry.setDisplayedEntryItems(collapsibleEntry.getDisplayedCollapsibleEntryItems());
			}
			else if (collapsibleEntry.getName().equals(PINNED_COLLAPSIBLE_ENTRY_NAME))
			{
				collapsibleEntry.setDisplayedEntryItems(collapsibleEntry.getDisplayedPinnedCollapsibleEntryItems());
			}
		}
	}

	private void updatePinnedCollapsibleEntryItemsList(PluginListItem pluginListItem)
	{
		CollapsibleEntry pinnedCollapsibleEntry = null;
		for (CollapsibleEntry collapsibleEntry : collapsibleEntries)
		{
			if (collapsibleEntry.getName().equals(PINNED_COLLAPSIBLE_ENTRY_NAME))
			{
				pinnedCollapsibleEntry = collapsibleEntry;
			}
		}

		if (pinnedCollapsibleEntry != null)
		{
			if (pluginListItem.isPinned())
			{
				pinnedCollapsibleEntry.addToCollapsibleEntryItems(pluginListItem);
			}
			else
			{
				pinnedCollapsibleEntry.removeFromCollapsibleEntryItems(pluginListItem);
			}
		}
		else
		{
			log.error("Could not find pinned collapsible entry for updating entry items list");
		}
	}

	void refreshPluginList()
	{
		// Update enabled / disabled status of all displayed items
		collapsibleEntries.forEach(collapsibleEntry ->
		{
			collapsibleEntry.getCollapsibleEntryItems().forEach(pluginListItem ->
			{
				final Plugin plugin = pluginListItem.getPlugin();
				if (plugin != null)
				{
					pluginListItem.setPluginEnabled(pluginManager.isPluginEnabled(plugin));
				}
			});

			if (showingPluginList)
			{
				openConfigList();
			}
		});

		// Update full items list to show accurate status on search results
		collapsibleEntries.forEach(collapsibleEntry ->
				collapsibleEntry.getCollapsibleEntryItems().forEach(pluginListItem ->
				{
					final Plugin plugin = pluginListItem.getPlugin();
					if (plugin != null)
					{
						pluginListItem.setPluginEnabled(pluginManager.isPluginEnabled(plugin));
					}
				}));
	}

	void openConfigList()
	{
		if (showingPluginList)
		{
			scrollBarPosition = scrollPane.getVerticalScrollBar().getValue();
		}

		showingPluginList = true;

		topPanel.removeAll();
		mainPanel.removeAll();
		topPanel.add(searchBar, BorderLayout.CENTER);

		onSearchBarChanged();
		searchBar.requestFocusInWindow();
		validate();
		scrollPane.getVerticalScrollBar().setValue(scrollBarPosition);
	}

	/**
	 * Triggered when the the text value of the search bar changes. Redraws the main panel with the matching components
	 */
	private void onSearchBarChanged()
	{
		final String text = searchBar.getText();
		mainPanel.removeAll();

		showMatchingPlugins(true, text);
		showMatchingPlugins(false, text);

		revalidate();
	}

	/**
	 * Adds the matching plugin components to the main panel.
	 *
	 * @param pinned show only pinned plugins
	 * @param text   text for searching matching plugins
	 */
	private void showMatchingPlugins(boolean pinned, String text)
	{
		// Re-add normal config panel items on empty search. This is triggered on startup.
		if (text.isEmpty())
		{
			mainPanel.removeAll();
			collapsibleEntries.forEach(collapsibleEntry ->
			{
				mainPanel.add(collapsibleEntry);
				collapsibleEntry.getDisplayedEntryItems().forEach(mainPanel::add);
			});

			return;
		}

		final String[] searchTerms = text.toLowerCase().split(" ");
		for (CollapsibleEntry collapsibleEntry : collapsibleEntries)
		{
			if (collapsibleEntry.getName().equals(PINNED_COLLAPSIBLE_ENTRY_NAME))
			{
				continue;
			}

			for (PluginListItem pluginListItem : collapsibleEntry.getCollapsibleEntryItems())
			{
				if (pinned == pluginListItem.isPinned() && pluginListItem.matchesSearchTerms(searchTerms))
				{
					mainPanel.add(pluginListItem);
				}
			}
		}
	}

	/**
	 * Retrieves all pinned plugin names from the client settings file
	 *
	 * @return list of pinned plugin names
	 */
	private List<String> getPinnedPluginNames()
	{
		final String config = configManager.getConfiguration(RUNELITE_GROUP_NAME, PINNED_PLUGINS_CONFIG_KEY);

		if (config == null)
		{
			return Collections.emptyList();
		}

		return Text.fromCSV(config);
	}

	/**
	 * Saves all pinned plugins to the client settings file
	 */
	void savePinnedPlugins()
	{
		StringBuilder value = new StringBuilder();
		for (CollapsibleEntry collapsibleEntry : collapsibleEntries)
		{
			if (collapsibleEntry.getName().equals(PINNED_COLLAPSIBLE_ENTRY_NAME))
			{
				continue;
			}

			String result = collapsibleEntry.getCollapsibleEntryItems().stream()
					.filter(PluginListItem::isPinned)
					.map(PluginListItem::getName)
					.collect(Collectors.joining(","));

			if (!value.toString().isEmpty() && !result.isEmpty())
			{
				value.append(",");
			}

			value.append(result);
		}
		configManager.setConfiguration(RUNELITE_GROUP_NAME, PINNED_PLUGINS_CONFIG_KEY, value.toString());
	}

	/**
	 * Retrieves all opened collapsible entry names from the client settings file
	 *
	 * @return list of opened collapsible entry names
	 */
	List<String> getOpenedCollapsibleEntries()
	{
		final String config = configManager.getConfiguration(COLLAPSIBLE_ENTRY_CONFIG_KEY, COLLAPSIBLE_ENTRY_OPENED_CONFIG_KEY);

		if (config == null)
		{
			return Collections.emptyList();
		}

		return Text.fromCSV(config);
	}

	/**
	 * Save collapsible entry isOpened state to client settings file
	 */
	void saveCollapsibleEntryIsOpenedState()
	{
		String value = collapsibleEntries.stream()
				.filter(CollapsibleEntry::isOpened)
				.map(CollapsibleEntry::getName)
				.collect(Collectors.joining(","));

		configManager.setConfiguration(COLLAPSIBLE_ENTRY_CONFIG_KEY, COLLAPSIBLE_ENTRY_OPENED_CONFIG_KEY, value);
	}

	/**
	 * Creates a plugin list item for the client settings plugin because this plugin is not in the plugin manager list.
	 *
	 * @return Client settings plugin as plugin list item
	 */
	private PluginListItem createClientSettingsPlugin()
	{
		final List<String> pinnedPlugins = getPinnedPluginNames();

		final PluginListItem runeLite = new PluginListItem(this, runeLiteConfig, PluginType.VANILLA,
				configManager.getConfigDescriptor(runeLiteConfig),
				RUNELITE_PLUGIN, "SanLite client settings", "client", "client", "settings");
		runeLite.setPinned(pinnedPlugins.contains(RUNELITE_PLUGIN));
		return runeLite;
	}

	/**
	 * Creates a plugin list item for the chat color plugin because this plugin is not in the plugin manager list.
	 *
	 * @return Chat color plugin as plugin list item
	 */
	private PluginListItem createCreateChatColorPlugin()
	{
		final List<String> pinnedPlugins = getPinnedPluginNames();

		final PluginListItem chatColor = new PluginListItem(this, chatColorConfig, PluginType.VANILLA,
				configManager.getConfigDescriptor(chatColorConfig),
				CHAT_COLOR_PLUGIN, "Recolor chat text", "color", "colour", "messages", "chat");
		chatColor.setPinned(pinnedPlugins.contains(CHAT_COLOR_PLUGIN));
		return chatColor;
	}

	public void openGroupConfigPanel(PluginListItem listItem, Config config, ConfigDescriptor cd)
	{
		showingPluginList = false;

		scrollBarPosition = scrollPane.getVerticalScrollBar().getValue();
		topPanel.removeAll();
		mainPanel.removeAll();

		final IconButton topPanelBackButton = new IconButton(BACK_ICON, BACK_ICON_HOVER);
		topPanelBackButton.setPreferredSize(new Dimension(22, 0));
		topPanelBackButton.setBorder(new EmptyBorder(0, 0, 0, 5));
		topPanelBackButton.addActionListener(e -> openConfigList());
		topPanelBackButton.setToolTipText("Back");
		topPanel.add(topPanelBackButton, BorderLayout.WEST);

		topPanel.add(listItem.createToggleButton(), BorderLayout.EAST);

		String name = listItem.getName();
		JLabel title = new JLabel(name);
		title.setForeground(Color.WHITE);
		title.setToolTipText("<html>" + name + ":<br>" + listItem.getDescription() + "</html>");
		PluginListItem.addLabelPopupMenu(title, PluginListItem.wikiLinkMenuItem(listItem.getName()));
		topPanel.add(title);

		for (ConfigItemsGroup cig : cd.getItemGroups())
		{
			boolean collapsed = false;
			if (!cig.getGroup().equals(""))
			{
				String header = cig.getGroup();

				JPanel item = new JPanel();
				item.setLayout(new BorderLayout());
				item.setMinimumSize(new Dimension(PANEL_WIDTH, 0));
				item.setBackground(ColorScheme.DARK_GRAY_HOVER_COLOR);
				item.setBorder(
						new CompoundBorder(
								BorderFactory.createMatteBorder(1, 1, 1, 1, ColorScheme.SCROLL_TRACK_COLOR),
								BorderFactory.createMatteBorder(1, 1, 1, 1, ColorScheme.DARKER_GRAY_HOVER_COLOR)
						));

				JLabel headerLabel = new JLabel(header);
				headerLabel.setPreferredSize(new Dimension(PANEL_WIDTH, (int) headerLabel.getPreferredSize().getHeight() + 10));
				headerLabel.setFont(headerLabel.getFont().deriveFont(Collections.singletonMap(TextAttribute.WEIGHT, TextAttribute.WEIGHT_SEMIBOLD)));
				String sCollapsed = configManager.getConfiguration(cd.getGroup().value(), cig.getGroup() + "_collapse");

				if (sCollapsed != null)
					collapsed = Boolean.parseBoolean(sCollapsed);

				JButton collapse = new JButton(collapsed ? ">" : "˅");
				collapse.setPreferredSize(new Dimension(20, 20));
				collapse.setFont(collapse.getFont().deriveFont(16.0f));
				collapse.setBorder(null);
				collapse.setMargin(new Insets(0, 10, 0, 10));
				collapse.addActionListener(ae -> changeGroupCollapse(listItem, config, collapse, cd, cig));
				headerLabel.setBorder(new EmptyBorder(0, 6, 0, 0));

				item.add(collapse, BorderLayout.WEST);
				item.add(headerLabel, BorderLayout.CENTER);

				mainPanel.add(item);
			}

			if (collapsed)
				continue;

			createConfigItems(cig.getItems(), cd, listItem, config);
		}

		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener((e) ->
		{
			final int result = JOptionPane.showOptionDialog(resetButton, "Are you sure you want to reset this plugin's configuration?",
					"Are you sure?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
					null, new String[] {"Yes", "No"}, "No");

			if (result == JOptionPane.YES_OPTION)
			{
				configManager.setDefaultConfiguration(config, true);

				// Reload configuration panel
				openGroupConfigPanel(listItem, config, cd);
			}
		});
		mainPanel.add(resetButton);

		JButton backButton = new JButton("Back");
		backButton.addActionListener(e -> openConfigList());
		mainPanel.add(backButton);

		revalidate();
		scrollPane.getVerticalScrollBar().setValue(0);
	}

	/**
	 * Creates UI components for all config item descriptors
	 *
	 * @param itemDescriptors list of config item descriptors
	 * @param cd              config descriptor
	 * @param listItem        plugin list item
	 * @param config          plugin config
	 */
	private void createConfigItems(Collection<ConfigItemDescriptor> itemDescriptors, ConfigDescriptor cd, PluginListItem listItem, Config config)
	{
		ConfigItemUI configItemUI = new ConfigItemUI(configManager, this);

		for (ConfigItemDescriptor cid : itemDescriptors)
		{
			if (cid.getItem().hidden())
			{
				continue;
			}

			JPanel item = new JPanel();
			item.setLayout(new BorderLayout());
			item.setMinimumSize(new Dimension(PANEL_WIDTH, 0));

			String itemName = cid.getItem().name();
			JLabel configEntryName = new JLabel(itemName);
			configEntryName.setPreferredSize(new Dimension(PANEL_WIDTH, (int) configEntryName.getPreferredSize().getHeight()));
			configEntryName.setForeground(Color.WHITE);
			configEntryName.setToolTipText("<html>" + itemName + ":<br>" + cid.getItem().description() + "</html>");
			item.add(configEntryName, BorderLayout.CENTER);

			if (cid.getType() == boolean.class)
			{
				item.add(configItemUI.createCheckboxConfigItem(listItem, config, cd, cid), BorderLayout.EAST);
			}

			if (cid.getType() == int.class)
			{
				item.add(configItemUI.createSpinnerConfigItem(listItem, config, cd, cid), BorderLayout.EAST);
			}

			if (cid.getType() == String.class)
			{
				item.add(configItemUI.createTextConfigItem(listItem, config, cd, cid), BorderLayout.SOUTH);
			}

			if (cid.getType() == Color.class)
			{
				item.add(configItemUI.createColorPickerButtonConfigItem(listItem, config, cd, cid), BorderLayout.EAST);
			}

			if (cid.getType() == Dimension.class)
			{
				item.add(configItemUI.createDimensionConfigItem(cd, cid), BorderLayout.EAST);
			}

			if (cid.getType().isEnum())
			{
				item.add(configItemUI.createComboBoxConfigItem(listItem, config, cd, cid), BorderLayout.EAST);
			}

			if (cid.getType() == Keybind.class || cid.getType() == ModifierlessKeybind.class)
			{
				item.add(configItemUI.createKeybindConfigItem(listItem, config, cd, cid), BorderLayout.EAST);
			}
			mainPanel.add(item);
		}
	}

	/**
	 * Changes the collapse state of a collapsible entry within a plugin configuration panel
	 *
	 * @param listItem  plugin list item
	 * @param config    plugin config
	 * @param component collapsible entry component
	 * @param cd        config descriptor
	 * @param cig       config items group
	 */
	private void changeGroupCollapse(PluginListItem listItem, Config config, JComponent component, ConfigDescriptor cd, ConfigItemsGroup cig)
	{
		if (component instanceof JButton)
		{
			String sCollapsed = configManager.getConfiguration(cd.getGroup().value(), cig.getGroup() + "_collapse");
			boolean collapse = true;

			if (sCollapsed != null)
				collapse = !Boolean.parseBoolean(sCollapsed);

			configManager.setConfiguration(cd.getGroup().value(), cig.getGroup() + "_collapse", collapse);
			openGroupConfigPanel(listItem, config, cd);
		}
	}

	/**
	 * Enable a plugin in the config panel.
	 *
	 * @param plugin   plugin
	 * @param listItem plugin list item
	 */
	void startPlugin(Plugin plugin, PluginListItem listItem)
	{
		executorService.submit(() ->
		{
			pluginManager.setPluginEnabled(plugin, true);

			try
			{
				pluginManager.startPlugin(plugin);
			}
			catch (PluginInstantiationException ex)
			{
				log.warn("Error when starting plugin {}", plugin.getClass().getSimpleName(), ex);
			}

			listItem.setPluginEnabled(true);
		});
	}

	/**
	 * Disable a plugin in the config panel.
	 *
	 * @param plugin   plugin
	 * @param listItem plugin list item
	 */
	void stopPlugin(Plugin plugin, PluginListItem listItem)
	{
		executorService.submit(() ->
		{
			pluginManager.setPluginEnabled(plugin, false);

			try
			{
				pluginManager.stopPlugin(plugin);
			}
			catch (PluginInstantiationException ex)
			{
				log.warn("Error when stopping plugin {}", plugin.getClass().getSimpleName(), ex);
			}

			listItem.setPluginEnabled(false);
		});
	}

	/**
	 * Opens configuration panel from right-clicking an overlay on the game canvas.
	 *
	 * @param configGroup plugin config group
	 */
	void openConfigurationPanel(String configGroup)
	{
		for (CollapsibleEntry collapsibleEntry : collapsibleEntries)
		{
			for (PluginListItem pluginListItem : collapsibleEntry.getCollapsibleEntryItems())
			{
				if (pluginListItem.getName().equals(configGroup))
				{
					openGroupConfigPanel(pluginListItem, pluginListItem.getConfig(), pluginListItem.getConfigDescriptor());
					break;
				}
			}
		}
	}

	@Override
	public void onActivate()
	{
		super.onActivate();

		if (searchBar.getParent() != null)
		{
			searchBar.requestFocusInWindow();
		}
	}

	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(PANEL_WIDTH + SCROLLBAR_WIDTH, super.getPreferredSize().height);
	}

	private class FixedWidthPanel extends JPanel
	{
		@Override
		public Dimension getPreferredSize()
		{
			return new Dimension(PANEL_WIDTH, super.getPreferredSize().height);
		}

	}
}
