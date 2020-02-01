/*
 * Copyright (c) 2019, Ganom <https://github.com/Ganom>
 * Copyright (c) 2020, Siraz <https://github.com/Sirazzz>
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
package net.runelite.client.plugins.transmog;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.ItemDefinition;
import net.runelite.api.Player;
import net.runelite.api.kit.KitType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.timetracking.TimeTrackingPlugin;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.IconButton;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static javax.swing.BoxLayout.Y_AXIS;

@Slf4j
public class TransmogPanel extends PluginPanel
{

	private final Client client;
	private final ItemManager itemManager;
	private final ConfigManager configManager;
	private final TransmogPlugin plugin;

	private final JComboBox<String> selector;
	private final Map<KitType, EquipmentSlot> equipmentSlots;
	private final List<EquipmentSet> equipmentSets;
	private final ExecutorService executor;
	private JPanel equipmentPanel;
	private JLabel lblCurrentSetActive;
	private JButton displayJawButton;
	private JButton displayHeadButton;
	private JButton displayArmsButton;
	private JButton displayHandsButton;
	private boolean equipmentSlotsPopulated;

	private static final ImageIcon ADD_ICON;
	private static final ImageIcon ADD_ICON_HOVER;
	static final ImageIcon DELETE_ICON;
	static final ImageIcon DELETE_ICON_HOVER;

	static
	{
		BufferedImage addIcon = ImageUtil.getResourceStreamFromClass(TimeTrackingPlugin.class, "add_icon.png");
		BufferedImage deleteIcon = ImageUtil.getResourceStreamFromClass(TimeTrackingPlugin.class, "delete_icon.png");

		ADD_ICON = new ImageIcon(addIcon);
		ADD_ICON_HOVER = new ImageIcon(ImageUtil.alphaOffset(addIcon, 0.53f));
		DELETE_ICON = new ImageIcon(deleteIcon);
		DELETE_ICON_HOVER = new ImageIcon(ImageUtil.grayscaleOffset(deleteIcon, -80));
	}

	@Inject
	public TransmogPanel(final Client client, final ItemManager itemManager, final ConfigManager configManager,
						final TransmogPlugin plugin)
	{
		super(false);
		this.client = client;
		this.itemManager = itemManager;
		this.configManager = configManager;
		this.plugin = plugin;
		this.equipmentSlots = new LinkedHashMap<>();
		this.equipmentSets = new ArrayList<>();
		this.selector = new JComboBox<>();
		this.executor = Executors.newSingleThreadExecutor();
		init();
	}

	public void loadEquipmentSets()
	{
		final String equipmentSetsJson = configManager.getConfiguration(TransmogConfig.CONFIG_GROUP, TransmogConfig.EQUIPMENT_SETS);

		final Gson gson = new Gson();
		if (!Strings.isNullOrEmpty(equipmentSetsJson))
		{
			final List<EquipmentSet> equipmentSets = gson.fromJson(equipmentSetsJson, new TypeToken<ArrayList<EquipmentSet>>()
			{
			}.getType());
			this.equipmentSets.clear();
			this.equipmentSets.addAll(equipmentSets);
		}
	}

	public void loadCurrentEquipmentSet()
	{
		final String currentEquipmentSetJson = configManager.getConfiguration(TransmogConfig.CONFIG_GROUP, TransmogConfig.CURRENT_EQUIPMENT_SET);

		final Gson gson = new Gson();
		if (!Strings.isNullOrEmpty(currentEquipmentSetJson))
		{
			final EquipmentSet currentEquipmentSet = gson.fromJson(currentEquipmentSetJson, new TypeToken<EquipmentSet>()
			{
			}.getType());
			plugin.setCurrentEquipmentSet(currentEquipmentSet);
		}
	}

	public EquipmentSet getEquipmentSetByName(String name)
	{
		return equipmentSets.stream()
				.filter(equipmentSet -> name.equals(equipmentSet.getName()))
				.findAny()
				.orElse(null);
	}

	void saveEquipmentSetsToConfig()
	{
		final Gson gson = new Gson();
		final String equipmentSetsJson = gson.toJson(equipmentSets);
		configManager.setConfiguration(TransmogConfig.CONFIG_GROUP, TransmogConfig.EQUIPMENT_SETS, equipmentSetsJson);
		log.debug("Saved equipment sets to config");
	}

	void saveCurrentEquipmentSetToConfig()
	{
		final Gson gson = new Gson();
		final String currentEquipmentSetJson = gson.toJson(plugin.getCurrentEquipmentSet());
		configManager.setConfiguration(TransmogConfig.CONFIG_GROUP, TransmogConfig.CURRENT_EQUIPMENT_SET, currentEquipmentSetJson);
		log.debug("Saved current equipment set to config");
	}

	private void toggleEquipmentSlotsEnabled(boolean enabled)
	{
		SwingUtilities.invokeLater(() ->
		{
			for (EquipmentSlot equipmentSlot : equipmentSlots.values())
			{
				if (!enabled)
				{
					equipmentSlot.setSelectedItem(equipmentSlot.getEmptyEquipmentSlot());
				}
				equipmentSlot.setEnabled(enabled);
			}
			displayJawButton.setEnabled(enabled);
			displayHeadButton.setEnabled(enabled);
			displayArmsButton.setEnabled(enabled);
			displayHandsButton.setEnabled(enabled);
		});
	}

	private void init()
	{
		selector.addItem("Loading sets...");
		selector.setSelectedIndex(0);
		selector.addActionListener((event) -> populateEquipmentSlotsForCurrentSet());

		final JLabel title = new JLabel();
		title.setText("Transmog Sets");
		title.setForeground(Color.WHITE);
		title.setHorizontalAlignment(JLabel.LEFT);
		title.setVerticalAlignment(JLabel.CENTER);

		IconButton addButton = new IconButton(ADD_ICON, ADD_ICON_HOVER);
		addButton.setPreferredSize(new Dimension(14, 14));
		addButton.setToolTipText("Add an equipment set");
		addButton.addActionListener((event) -> createEquipmentSet(addButton));

		final JPanel titleAndMarkersPanel = new JPanel();
		titleAndMarkersPanel.setLayout(new BorderLayout());
		titleAndMarkersPanel.add(title, BorderLayout.CENTER);
		titleAndMarkersPanel.add(addButton, BorderLayout.EAST);

		lblCurrentSetActive = new JLabel();
		lblCurrentSetActive.setHorizontalAlignment(JLabel.CENTER);
		lblCurrentSetActive.setVerticalAlignment(JLabel.CENTER);
		updateCurrentSetActiveStatus(false);

		final JPanel currentSetActiveTextPanel = new JPanel();
		currentSetActiveTextPanel.setLayout(new BorderLayout());
		currentSetActiveTextPanel.add(lblCurrentSetActive, BorderLayout.CENTER);

		final JLabel lblSelectEquipment = new JLabel();
		lblSelectEquipment.setText("Select equipment");
		lblSelectEquipment.setForeground(Color.WHITE);
		lblSelectEquipment.setHorizontalAlignment(JLabel.LEFT);
		lblSelectEquipment.setVerticalAlignment(JLabel.CENTER);

		IconButton deleteButton = new IconButton(DELETE_ICON, DELETE_ICON_HOVER);
		deleteButton.setPreferredSize(new Dimension(14, 14));
		deleteButton.setToolTipText("Delete an equipment set");
		deleteButton.addActionListener((event) -> deleteEquipmentSet(plugin.getCurrentEquipmentSet()));

		final JPanel setHeaderPanel = new JPanel();
		setHeaderPanel.setLayout(new BorderLayout());
		setHeaderPanel.add(lblSelectEquipment, BorderLayout.CENTER);
		setHeaderPanel.add(deleteButton, BorderLayout.EAST);

		final JPanel northAnchoredPanel = new JPanel();
		northAnchoredPanel.setLayout(new BoxLayout(northAnchoredPanel, Y_AXIS));
		northAnchoredPanel.setBorder(new EmptyBorder(0, 0, 5, 0));
		northAnchoredPanel.add(titleAndMarkersPanel);
		northAnchoredPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		northAnchoredPanel.add(selector);
		northAnchoredPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		northAnchoredPanel.add(currentSetActiveTextPanel);
		northAnchoredPanel.add(Box.createRigidArea(new Dimension(0, 15)));
		northAnchoredPanel.add(setHeaderPanel);

		equipmentPanel = new JPanel();
		equipmentPanel.setLayout(new BoxLayout(equipmentPanel, Y_AXIS));
		equipmentPanel.setBackground(new Color(30, 30, 30));
		equipmentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		// TODO: Max size

		JPanel equipmentContainer = new JPanel();
		equipmentContainer.setLayout(new BorderLayout());
		//equipmentContainer.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLUE));
		equipmentContainer.setBackground(new Color(30, 30, 30));
		equipmentContainer.setMaximumSize(new Dimension(1000, 500));
		equipmentContainer.add(equipmentPanel, BorderLayout.WEST);

		addEquipmentSlotsUI();

		final JPanel contentWrapper = new JPanel(new BorderLayout());
		contentWrapper.setBorder(new EmptyBorder(0, 0, 0, 0));
		//contentWrapper.add(Box.createGlue(), BorderLayout.WEST);
		//contentWrapper.add(selectEquipmentHeaderPanel, BorderLayout.NORTH);
		contentWrapper.add(equipmentContainer, BorderLayout.CENTER);
		//contentWrapper.setBackground(new Color(30, 30, 30));

		final JScrollPane contentWrapperPane = new JScrollPane(contentWrapper);
		//contentWrapperPane.setBorder(new MatteBorder(1, 1, 1, 1, Color.PINK));
		contentWrapperPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(10, 10, 10, 10));
		add(northAnchoredPanel, BorderLayout.NORTH);
		add(contentWrapperPane, BorderLayout.CENTER);
		executor.submit(this::populateSelector);
	}

	private void populateSelector()
	{
		equipmentSets.clear();
		selector.removeAllItems();
		selector.addItem("Select your set...");
		selector.setSelectedIndex(0);

		loadEquipmentSets();
		for (EquipmentSet equipmentSet : equipmentSets)
		{
			if (!equipmentSet.getName().isEmpty())
			{
				selector.addItem(equipmentSet.getName());
				log.debug("Added equipment set: {} to selector", equipmentSet.getName());
			}
		}

		loadCurrentEquipmentSet();
		EquipmentSet currentEquipmentSet = plugin.getCurrentEquipmentSet();
		if (currentEquipmentSet == null)
		{
			log.debug("Did not load current equipment set as it was null");
			return;
		}

		selector.setSelectedItem(currentEquipmentSet.getName());
		log.debug("Set selector current equipment set: {}", currentEquipmentSet.toString());
		populateEquipmentSlotsForCurrentSet(); // TODO: Items not loaded in yet
	}

	private void addEquipmentSlotsUI()
	{
		for (KitType kitType : KitType.values())
		{
			if (TransmogPlugin.getKIT_TYPE_BLACKLIST().contains(kitType))
			{
				continue;
			}

			final EquipmentSlot equipmentSlotComboBox = new EquipmentSlot(kitType);
			equipmentSlotComboBox.addItemListener((event) ->
			{
				if (event.getStateChange() == ItemEvent.SELECTED)
				{
					KitType kitType1 = null;
					for (Map.Entry<KitType, EquipmentSlot> entry : equipmentSlots.entrySet())
					{
						if (entry.getValue() == event.getSource())
						{
							kitType1 = entry.getKey();
							break;
						}
					}

					EquipmentSet equipmentSet = plugin.getCurrentEquipmentSet();
					if (kitType1 == null || equipmentSet == null)
					{
						return;
					}

					ComboBoxIconEntry item = (ComboBoxIconEntry) event.getItem();
					if (item.getData() == null)
					{
						equipmentSet.setEquipmentSlotIdByKitType(kitType1, 0);
						updateCurrentSetActiveStatus(false);
						saveEquipmentSetsToConfig();
						log.debug("Set kit type {} to id 0", kitType1);
						return;
					}

					ItemDefinition itemDefinition = (ItemDefinition) item.getData();
					equipmentSet.setEquipmentSlotIdByKitType(kitType1, itemDefinition.getId());
					updateCurrentSetActiveStatus(false);
					saveEquipmentSetsToConfig();
					log.debug("Set kit type {} to id {}", kitType1, itemDefinition.getId());
				}
			});

			equipmentSlots.put(kitType, equipmentSlotComboBox);
			equipmentPanel.add(equipmentSlotComboBox);
			equipmentPanel.add(Box.createRigidArea(new Dimension(0, 3)));
			log.debug("Added component {} to equipmentPanel", equipmentSlotComboBox.getKitType().getName());
		}

		displayJawButton = new JButton("Display jaw");
		//jawButton.setPreferredSize(new Dimension(205, 42));
		displayJawButton.addActionListener((event) ->
		{
			EquipmentSet currentEquipmentSet = plugin.getCurrentEquipmentSet();
			if (currentEquipmentSet == null)
			{
				return;
			}
			currentEquipmentSet.setJawEnabled(!currentEquipmentSet.isJawEnabled());
			displayJawButton.setText(currentEquipmentSet.isJawEnabled() ? "Jaw enabled" : "Jaw disabled");
			displayJawButton.setForeground(currentEquipmentSet.isJawEnabled() ? Color.GREEN : Color.RED);
			updateCurrentSetActiveStatus(false);
			saveEquipmentSetsToConfig();
		});

		displayHeadButton = new JButton("Display head");
		//headButton.setPreferredSize(new Dimension(205, 42));
		displayHeadButton.addActionListener((event) ->
		{
			EquipmentSet currentEquipmentSet = plugin.getCurrentEquipmentSet();
			if (currentEquipmentSet == null)
			{
				return;
			}
			currentEquipmentSet.setHeadEnabled(!currentEquipmentSet.isHeadEnabled());
			displayHeadButton.setText(currentEquipmentSet.isHeadEnabled() ? "Head enabled" : "Head disabled");
			displayHeadButton.setForeground(currentEquipmentSet.isHeadEnabled() ? Color.GREEN : Color.RED);
			updateCurrentSetActiveStatus(false);
			saveEquipmentSetsToConfig();
		});

		displayArmsButton = new JButton("Display arms");
		//armsButton.setPreferredSize(new Dimension(205, 42));
		displayArmsButton.addActionListener((event) ->
		{
			EquipmentSet currentEquipmentSet = plugin.getCurrentEquipmentSet();
			if (currentEquipmentSet == null)
			{
				return;
			}
			currentEquipmentSet.setArmsEnabled(!currentEquipmentSet.isArmsEnabled());
			displayArmsButton.setText(currentEquipmentSet.isArmsEnabled() ? "Arms enabled" : "Arms disabled");
			displayArmsButton.setForeground(currentEquipmentSet.isArmsEnabled() ? Color.GREEN : Color.RED);
			updateCurrentSetActiveStatus(false);
			saveEquipmentSetsToConfig();
		});

		displayHandsButton = new JButton("Display hands");
		//armsButton.setPreferredSize(new Dimension(205, 42));
		displayHandsButton.addActionListener((event) ->
		{
			EquipmentSet currentEquipmentSet = plugin.getCurrentEquipmentSet();
			if (currentEquipmentSet == null)
			{
				return;
			}
			currentEquipmentSet.setHandsEnabled(!currentEquipmentSet.isHandsEnabled());
			displayHandsButton.setText(currentEquipmentSet.isHandsEnabled() ? "Hands enabled" : "Hands disabled");
			displayHandsButton.setForeground(currentEquipmentSet.isHandsEnabled() ? Color.GREEN : Color.RED);
			updateCurrentSetActiveStatus(false);
			saveEquipmentSetsToConfig();
		});

		equipmentPanel.add(displayJawButton);
		equipmentPanel.add(Box.createRigidArea(new Dimension(0, 3)));
		equipmentPanel.add(displayHeadButton);
		equipmentPanel.add(Box.createRigidArea(new Dimension(0, 3)));
		equipmentPanel.add(displayArmsButton);
		equipmentPanel.add(Box.createRigidArea(new Dimension(0, 3)));
		equipmentPanel.add(displayHandsButton);
	}

	private void createEquipmentSet(JButton button)
	{
		final String setName = JOptionPane.showInputDialog(button, "What would you like to name the equipment set?");
		if (setName == null || setName.isEmpty())
		{
			return;
		}

		equipmentSets.add(new EquipmentSet(setName));
		selector.addItem(setName);
		selector.setSelectedItem(setName);
		saveEquipmentSetsToConfig();
		log.debug("Added equipment set {}", setName);
	}

	private void deleteEquipmentSet(EquipmentSet equipmentSet)
	{
		if (plugin.getCurrentEquipmentSet() == null)
		{
			return;
		}

		equipmentSets.remove(equipmentSet);
		selector.removeItem(equipmentSet.getName());
		selector.setSelectedIndex(0);
		log.debug("Removed equipment set {}", equipmentSet.toString());
		saveEquipmentSetsToConfig();
	}

	public void populateSlots()
	{
		equipmentSlotsPopulated = true;
		for (EquipmentSlot slot : equipmentSlots.values())
		{
			log.debug("Populating items for equipment slot {}", slot.getKitType().getName());
			slot.populateItems(client, itemManager);
		}
	}

	void updateCurrentSetActiveStatus(boolean isActive)
	{
		if (plugin.getCurrentEquipmentSet() == null)
		{
			lblCurrentSetActive.setText("No equipment set selected");
			lblCurrentSetActive.setForeground(Color.ORANGE);
			lblCurrentSetActive.setVisible(true);
			plugin.setCurrentEquipmentSetActive(false);
			return;
		}

		Player localPlayer = client.getLocalPlayer();
		if (localPlayer == null)
		{
			lblCurrentSetActive.setVisible(false);
			lblCurrentSetActive.setForeground(Color.ORANGE);
			return;
		}

		plugin.setCurrentEquipmentSetActive(isActive);
		boolean isCurrentSetActive = plugin.isCurrentEquipmentSetActive();
		lblCurrentSetActive.setText(isCurrentSetActive ? "Current set is active" : "Re-equip to update appearance");
		lblCurrentSetActive.setForeground(isCurrentSetActive ? Color.GREEN : Color.RED);
		lblCurrentSetActive.setVisible(true);
		log.debug("Changed label text: {}", isCurrentSetActive);
	}

	void populateEquipmentSlotsForCurrentSet()
	{
		String name = (String) selector.getSelectedItem();
		EquipmentSet equipmentSet = getEquipmentSetByName(name);
		if (equipmentSet == null)
		{
			plugin.setCurrentEquipmentSet(null);
			toggleEquipmentSlotsEnabled(false);
			displayJawButton.setText("Display jaw");
			displayJawButton.setForeground(Color.WHITE);
			displayHeadButton.setText("Display head");
			displayHeadButton.setForeground(Color.WHITE);
			displayArmsButton.setText("Display arms");
			displayArmsButton.setForeground(Color.WHITE);
			displayHandsButton.setText("Display hands");
			displayHandsButton.setForeground(Color.WHITE);
			log.warn("Could not find equipment set");
			return;
		}

		toggleEquipmentSlotsEnabled(true);
		plugin.setCurrentEquipmentSet(equipmentSet);
		saveCurrentEquipmentSetToConfig();
		log.debug("Found equipment set {}", equipmentSet.toString());

		for (Map.Entry<KitType, EquipmentSlot> entry : equipmentSlots.entrySet())
		{
			int id = equipmentSet.getEquipmentSlotIdByKitType(entry.getKey());
			EquipmentSlot equipmentSlot = entry.getValue();
			equipmentSlot.setSelectedItem(equipmentSlot.getAvailableEquipmentSlotItems().getOrDefault(id, equipmentSlot.getEmptyEquipmentSlot()));
			log.debug("Set equipment slot {} to {}", equipmentSlot.getKitType(), id);
		}

		displayJawButton.setText(equipmentSet.isJawEnabled() ? "Jaw enabled" : "Jaw disabled");
		displayJawButton.setForeground(equipmentSet.isJawEnabled() ? Color.GREEN : Color.RED);
		displayHeadButton.setText(equipmentSet.isHeadEnabled() ? "Head enabled" : "Head disabled");
		displayHeadButton.setForeground(equipmentSet.isHeadEnabled() ? Color.GREEN : Color.RED);
		displayArmsButton.setText(equipmentSet.isArmsEnabled() ? "Arms enabled" : "Arms disabled");
		displayArmsButton.setForeground(equipmentSet.isArmsEnabled() ? Color.GREEN : Color.RED);
		displayHandsButton.setText(equipmentSet.isHandsEnabled() ? "Hands enabled" : "Hands disabled");
		displayHandsButton.setForeground(equipmentSet.isHandsEnabled() ? Color.GREEN : Color.RED);
	}
}
