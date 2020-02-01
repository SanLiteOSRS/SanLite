package net.runelite.client.plugins.transmog;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.kit.KitType;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.components.ComboBoxListRenderer;
import net.runelite.client.util.AsyncBufferedImage;
import net.runelite.client.util.ImageUtil;
import net.runelite.http.api.item.ItemEquipmentStats;
import net.runelite.http.api.item.ItemStats;
import org.pushingpixels.substance.internal.utils.SubstanceDropDownButton;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@Getter
public class EquipmentSlot extends JComboBox<ComboBoxIconEntry>
{
	private final ComboBoxIconEntry emptyEquipmentSlot;
	private Map<Integer, ComboBoxIconEntry> availableEquipmentSlotItems;
	private KitType kitType;

	EquipmentSlot(KitType kitType)
	{
		super();
		this.kitType = kitType;
		this.availableEquipmentSlotItems = new LinkedHashMap<>();
		emptyEquipmentSlot = new ComboBoxIconEntry(
				new ImageIcon(ImageUtil.getResourceStreamFromClass(
						TransmogPlugin.class,
						kitType.getName().toLowerCase() + ".png")),
				kitType.getName(),
				null
		);

		setPreferredSize(new Dimension(205, 42));
		setMaximumSize(new Dimension(205, 42));
		setBackground(ColorScheme.DARK_GRAY_COLOR);
		setRenderer(new ComboBoxListRenderer());
		addItem(emptyEquipmentSlot);
		setSelectedIndex(0);

		// Remove Substance dropdown buttons
		for (Component component : getComponents())
		{
			if (component instanceof SubstanceDropDownButton)
			{
				remove(component);
			}
		}
	}

	public void populateItems(Client client, ItemManager itemManager)
	{
		assert client.isClientThread() : "populateItems must be called on client thread";

		for (int i = 0; i < client.getItemCount(); i++)
		{
			ItemStats stats = itemManager.getItemStats(i, false);

			if (stats == null || !stats.isEquipable())
			{
				continue;
			}

			ItemEquipmentStats equipment = stats.getEquipment();
			if (equipment == null)
			{
				continue;
			}

			if (equipment.getSlot() != kitType.getIndex())
			{
				continue;
			}

			AsyncBufferedImage image = itemManager.getImage(i);
			if (image == null)
			{
				continue;
			}

			final ComboBoxIconEntry entry = new ComboBoxIconEntry(
					new ImageIcon(image),
					client.getItemDefinition(i).getName(),
					client.getItemDefinition(i)
			);

			availableEquipmentSlotItems.put(i, entry);
			addItem(entry);
		}
		log.debug("Added {} items to equipment slot {}", availableEquipmentSlotItems.size(), kitType.getName());
	}
}
