package net.runelite.client.plugins.transmog;

import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.events.PlayerAppearanceChanged;
import net.runelite.api.kit.KitType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@PluginDescriptor(
		name = "Transmog",
		description = "Allows you to change the look of your gear to other items. This only shows up for yourself",
		tags = {"gear", "appearance", "character", "look", "armour"},
		type = PluginType.SANLITE
)
public class TransmogPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private TransmogDebugOverlay debugOverlay;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private ConfigManager configManager;

	@Inject
	private TransmogConfig config;

	@Getter(AccessLevel.PACKAGE)
	private ItemSearchPanel itemSearchPanel;

	@Getter(AccessLevel.PACKAGE)
	private NavigationButton button;

	@Inject
	private ClientToolbar clientToolbar;

	private final static int ARMS_EQUIPMENT_INDEX = 6;

	@Provides
	TransmogConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(TransmogConfig.class);
	}

	@Override
	protected void startUp()
	{
		if (config.displayDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}

		final BufferedImage icon = ImageUtil.getResourceStreamFromClass(getClass(), "transmog_icon.png");
		itemSearchPanel = injector.getInstance(ItemSearchPanel.class);
		button = NavigationButton.builder()
				.tooltip("Transmog")
				.icon(icon)
				.priority(7)
				.panel(itemSearchPanel)
				.build();

		clientToolbar.addNavigation(button);
	}

	@Override
	protected void shutDown()
	{
		if (config.displayDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
		clientToolbar.removeNavigation(button);
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("Transmog"))
		{
			return;
		}

		switch (event.getKey())
		{
			case "helmetId":
				updatePlayerEquipment(KitType.HELMET, config.getHelmetId());
				break;
			case "capeId":
				updatePlayerEquipment(KitType.CAPE, config.getCapeId());
				break;
			case "amuletId":
				updatePlayerEquipment(KitType.AMULET, config.getAmuletId());
				break;
			case "weaponId":
				updatePlayerEquipment(KitType.WEAPON, config.getWeaponId());
				break;
			case "torsoId":
				updatePlayerEquipment(KitType.TORSO, config.getTorsoId());
				break;
			case "shieldId":
				updatePlayerEquipment(KitType.SHIELD, config.getShieldId());
				break;
			case "legsId":
				updatePlayerEquipment(KitType.LEGS, config.getLegsId());
				break;
			case "headId":
				updatePlayerEquipment(KitType.HEAD, config.getHeadId());
				break;
			case "handsId":
				updatePlayerEquipment(KitType.HANDS, config.getHandsId());
				break;
			case "bootsId":
				updatePlayerEquipment(KitType.BOOTS, config.getBootsId());
				break;
			case "jawId":
				updatePlayerEquipment(KitType.JAW, config.getJawId());
				break;
		}

		if (config.displayDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}
		else if (!config.displayDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
	}

	@Subscribe
	private void onPlayerAppearanceChanged(PlayerAppearanceChanged event)
	{
		Player localPlayer = client.getLocalPlayer();
		if (!event.getPlayer().equals(localPlayer))
		{
			return;
		}

		updatePlayerEquipment(KitType.HELMET, config.getHelmetId());
		updatePlayerEquipment(KitType.CAPE, config.getCapeId());
		updatePlayerEquipment(KitType.AMULET, config.getAmuletId());
		updatePlayerEquipment(KitType.WEAPON, config.getWeaponId());
		updatePlayerEquipment(KitType.TORSO, config.getTorsoId());
		updatePlayerEquipment(KitType.SHIELD, config.getShieldId());
		updatePlayerEquipment(KitType.LEGS, config.getLegsId());
		updatePlayerEquipment(KitType.HEAD, config.getHeadId());
		updatePlayerEquipment(KitType.HANDS, config.getHandsId());
		updatePlayerEquipment(KitType.BOOTS, config.getBootsId());
		updatePlayerEquipment(KitType.JAW, config.getJawId());
		log.debug("Updated appearance | player: {}", event.getPlayer().getName());
	}

	void updatePlayerEquipment(KitType kitType, int newItemId)
	{
		Player localPlayer = client.getLocalPlayer();
		if (localPlayer == null)
		{
			return;
		}

		if (newItemId <= 0)
		{
			log.debug("Skipped kit {}", kitType);
			return;
		}

		log.debug("Update equipment type: {} to id: {}", kitType, newItemId);
		localPlayer.getPlayerAppearance().getEquipmentIds()[kitType.getIndex()] = convertToEquipmentId(newItemId);

		// Set head/jaw/arms to 0 when equipping helmet/torso equipment to prevent those overriding the appearance
		switch (kitType)
		{
			case HELMET:
				log.debug("KitType: {} | Settings head/jaw to 0", kitType);
				localPlayer.getPlayerAppearance().getEquipmentIds()[KitType.HEAD.getIndex()] = 0;
				localPlayer.getPlayerAppearance().getEquipmentIds()[KitType.JAW.getIndex()] = 0;
				break;
			case TORSO:
				log.debug("KitType: {} | Settings arms to 0", kitType);
				localPlayer.getPlayerAppearance().getEquipmentIds()[ARMS_EQUIPMENT_INDEX] = 0;
				break;
		}
	}

	/**
	 * If the item id is between 0 - 256 it is a kit id (normal character clothing & features)
	 * Item id 512 and higher is an equipment id (gear)
	 *
	 * @param itemId item/kit id
	 * @return equipment/kit id
	 * @see net.runelite.api.PlayerAppearance
	 */
	int convertToEquipmentId(int itemId)
	{
		if (itemId >= 0 && itemId < 256)
		{
			return itemId + 256;
		}
		else if (itemId >= 256)
		{
			return itemId + 512;
		}
		return -1;
	}

	int convertToItemId(int equipmentId)
	{
		if (equipmentId >= 256 && equipmentId < 512)
		{
			return equipmentId - 256;
		}
		else if (equipmentId >= 512)
		{
			return equipmentId - 512;
		}
		return -1;
	}

	List<Integer> convertIds(int[] equipment)
	{
		List<Integer> equipmentList = new ArrayList<>();
		for (int id : equipment)
		{
			if (id >= 256 && id < 512)
			{
				equipmentList.add(id - 256);
				continue;
			}
			else if (id >= 512)
			{
				equipmentList.add(id - 512);
				continue;
			}
			equipmentList.add(id);
		}

		return equipmentList;
	}
}
