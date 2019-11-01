package net.runelite.client.plugins.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CollapsibleEntry extends JPanel
{
	@Getter
	@Setter
	private String name;

	@Getter(AccessLevel.PUBLIC)
	private boolean isOpened;

	@Getter(AccessLevel.PUBLIC)
	@Setter(AccessLevel.PACKAGE)
	private List<PluginListItem> collapsibleEntryItems;

	@Getter(AccessLevel.PUBLIC)
	@Setter(AccessLevel.PACKAGE)
	private List<PluginListItem> displayedEntryItems;

	private ConfigPanel configPanel;

	private JButton collapseButton;

	CollapsibleEntry(String name, ConfigPanel configPanel, List<PluginListItem> collapsibleEntryItems)
	{
		this.name = name;
		this.configPanel = configPanel;
		this.collapsibleEntryItems = collapsibleEntryItems;

		if (name.equals(ConfigPanel.PINNED_COLLAPSIBLE_ENTRY_NAME))
		{
			this.displayedEntryItems = getDisplayedPinnedCollapsibleEntryItems();
		}
		else
		{
			this.displayedEntryItems = getDisplayedCollapsibleEntryItems();
		}

		// Create UI for collapsible entry
		setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH, 30));
		setLayout(new BorderLayout());
		setMinimumSize(new Dimension(PluginPanel.PANEL_WIDTH, 0));
		setBackground(ColorScheme.DARK_GRAY_HOVER_COLOR);
		setBorder(
				new CompoundBorder(
						BorderFactory.createMatteBorder(1, 1, 1, 1, ColorScheme.SCROLL_TRACK_COLOR),
						BorderFactory.createMatteBorder(1, 1, 1, 1, ColorScheme.DARKER_GRAY_HOVER_COLOR)
				));

		JLabel nameLabel = new JLabel(name);
		if (name.equals(PluginType.RUNELITE_USE_AT_OWN_RISK.toString()) || name.equals(PluginType.SANLITE_USE_AT_OWN_RISK.toString()))
		{
			nameLabel.setForeground(Color.RED.darker());
		}
		nameLabel.setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH, (int) nameLabel.getPreferredSize().getHeight() + 10));
		nameLabel.setFont(nameLabel.getFont().deriveFont(Collections.singletonMap(TextAttribute.WEIGHT, TextAttribute.WEIGHT_SEMIBOLD)));

		collapseButton = new JButton(isOpened ? "˅" : ">");
		collapseButton.setPreferredSize(new Dimension(20, 20));
		collapseButton.setFont(collapseButton.getFont().deriveFont(16.0f));
		collapseButton.setBorder(null);
		collapseButton.setMargin(new Insets(0, 10, 0, 10));
		collapseButton.addActionListener(actionEvent -> onOpenedStateChange(false));
		nameLabel.setBorder(new EmptyBorder(0, 6, 0, 0));

		add(collapseButton, BorderLayout.WEST);
		add(nameLabel, BorderLayout.CENTER);

		if (configPanel.getOpenedCollapsibleEntries().contains(name))
		{
			onOpenedStateChange(true);
		}
	}


	/**
	 * Returns list with all collapsible entry items if isOpened equals true. Otherwise returns an empty list.
	 *
	 * @return collapsible entry items list
	 */
	List<PluginListItem> getDisplayedPinnedCollapsibleEntryItems()
	{
		if (isOpened)
		{
			return collapsibleEntryItems;
		}
		return new ArrayList<>();
	}

	/**
	 * Returns list with all collapsible entry items that are not pinned if isOpened equals true. Otherwise returns an empty list.
	 *
	 * @return collapsible entry items list
	 */
	List<PluginListItem> getDisplayedCollapsibleEntryItems()
	{
		ArrayList<PluginListItem> displayedCollapsibleEntryItems = new ArrayList<>();

		for (PluginListItem pluginListItem : collapsibleEntryItems)
		{
			if (!pluginListItem.isPinned())
			{
				displayedCollapsibleEntryItems.add(pluginListItem);
			}
		}

		if (isOpened)
		{
			return displayedCollapsibleEntryItems;
		}
		return new ArrayList<>();
	}

	/**
	 * Change opened state of collapsible entry
	 *
	 * @param isInitialStateChange initial state change from config settings file
	 */
	private void onOpenedStateChange(boolean isInitialStateChange)
	{
		isOpened = !isOpened;
		collapseButton.setText(isOpened ? "˅" : ">");

		if (!isInitialStateChange)
		{
			configPanel.saveCollapsibleEntryIsOpenedState();
		}

		if (name.equals(ConfigPanel.PINNED_COLLAPSIBLE_ENTRY_NAME))
		{
			setDisplayedEntryItems(getDisplayedPinnedCollapsibleEntryItems());
		}
		else
		{
			setDisplayedEntryItems(getDisplayedCollapsibleEntryItems());

		}
		configPanel.openConfigList();
	}

	void addToCollapsibleEntryItems(PluginListItem pluginListItem)
	{
		collapsibleEntryItems.add(pluginListItem);
		collapsibleEntryItems.sort(Comparator.comparing(PluginListItem::getName));
	}

	void removeFromCollapsibleEntryItems(PluginListItem pluginListItem)
	{
		for (PluginListItem listItem : new ArrayList<>(collapsibleEntryItems))
		{
			if (listItem.getName().equals(pluginListItem.getName()))
			{
				collapsibleEntryItems.remove(listItem);
			}
		}
	}
}
