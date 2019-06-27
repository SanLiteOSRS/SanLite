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
import java.util.List;

public class PluginTypeItem extends JPanel
{

	private final ConfigPanel configPanel;

	@Getter(AccessLevel.PUBLIC)
	private final PluginType type;

	@Getter(AccessLevel.PUBLIC)
	@Setter(AccessLevel.PACKAGE)
	private boolean isOpened;

	@Getter(AccessLevel.PUBLIC)
	@Setter(AccessLevel.PACKAGE)
	private List<PluginListItem> pluginList;

	@Getter(AccessLevel.PUBLIC)
	@Setter(AccessLevel.PACKAGE)
	private List<PluginListItem> displayedPluginList;

	private JButton collapseButton;

	PluginTypeItem(ConfigPanel configPanel, PluginType pluginType)
	{
		this.configPanel = configPanel;
		this.type = pluginType;
		this.displayedPluginList = new ArrayList<>();
		createCollapsiblePluginListItem(pluginType);
	}

	private void createCollapsiblePluginListItem(PluginType pluginType)
	{
		setLayout(new BorderLayout(3, 0));
		setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH, 30));
		setLayout(new BorderLayout());
		setMinimumSize(new Dimension(PluginPanel.PANEL_WIDTH, 0));
		setBackground(ColorScheme.DARK_GRAY_HOVER_COLOR);
		setBorder(
				new CompoundBorder(
						BorderFactory.createMatteBorder(1, 1, 1, 1, ColorScheme.SCROLL_TRACK_COLOR),
						BorderFactory.createMatteBorder(1, 1, 1, 1, ColorScheme.DARKER_GRAY_HOVER_COLOR)
				));

		JLabel headerLabel = new JLabel(pluginType.name());
		headerLabel.setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH, (int) headerLabel.getPreferredSize().getHeight() + 10));
		headerLabel.setFont(headerLabel.getFont().deriveFont(Collections.singletonMap(TextAttribute.WEIGHT, TextAttribute.WEIGHT_SEMIBOLD)));

		collapseButton = new JButton(isOpened ? "˅" : ">");
		collapseButton.setPreferredSize(new Dimension(20, 20));
		collapseButton.setFont(collapseButton.getFont().deriveFont(16.0f));
		collapseButton.setBorder(null);
		collapseButton.setMargin(new Insets(0, 10, 0, 10));
		collapseButton.addActionListener(actionEvent -> handleTypeEntryCollapse());
		headerLabel.setBorder(new EmptyBorder(0, 6, 0, 0));

		add(collapseButton, BorderLayout.WEST);
		add(headerLabel, BorderLayout.CENTER);
	}

	private void handleTypeEntryCollapse()
	{
		isOpened = !isOpened;
		collapseButton.setText(isOpened ? "˅" : ">");
		displayedPluginList = configPanel.getDisplayedPluginListByType(this);
		configPanel.refreshPluginList();
	}
}
