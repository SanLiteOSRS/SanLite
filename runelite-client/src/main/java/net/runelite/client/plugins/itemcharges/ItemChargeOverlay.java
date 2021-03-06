/*
 * Copyright (c) 2017, Seth <Sethtroll3@gmail.com>
 * Copyright (c) 2019, Aleios <https://github.com/aleios>
 * Copyright (c) 2020, Unmoon <https://github.com/unmoon>
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
package net.runelite.client.plugins.itemcharges;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import javax.inject.Inject;
import net.runelite.api.widgets.WidgetItem;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.ABYSSAL_BRACELET;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.AMULET_OF_BOUNTY;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.AMULET_OF_CHEMISTRY;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.BELLOWS;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.FRUIT_BASKET;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.FUNGICIDE_SPRAY;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.IMPBOX;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.POTION;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.SACK;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.TELEPORT;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.WATERCAN;
import static net.runelite.client.plugins.itemcharges.ItemChargeType.WATERSKIN;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.WidgetItemOverlay;
import net.runelite.client.ui.overlay.components.TextComponent;

class ItemChargeOverlay extends WidgetItemOverlay
{
	private final ItemChargePlugin itemChargePlugin;
	private final ItemChargeConfig config;

	@Inject
	ItemChargeOverlay(ItemChargePlugin itemChargePlugin, ItemChargeConfig config)
	{
		this.itemChargePlugin = itemChargePlugin;
		this.config = config;
		showOnInventory();
		showOnEquipment();
	}

	@Override
	public void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem widgetItem)
	{
		if (!displayOverlay())
		{
			return;
		}

		graphics.setFont(FontManager.getRunescapeSmallFont());

		int charges;
		ItemWithConfig itemWithConfig = ItemWithConfig.findItem(itemId);
		if (itemWithConfig != null)
		{
			if (!itemWithConfig.getType().getEnabled().apply(config))
			{
				return;
			}

			charges = itemChargePlugin.getItemCharges(itemWithConfig.getConfigKey());
		}
		else
		{
			ItemWithCharge chargeItem = ItemWithCharge.findItem(itemId);
			if (chargeItem == null)
			{
				return;
			}

			ItemChargeType type = chargeItem.getType();
			if ((type == TELEPORT && !config.showTeleportCharges())
				|| (type == FUNGICIDE_SPRAY && !config.showFungicideCharges())
				|| (type == IMPBOX && !config.showImpCharges())
				|| (type == WATERCAN && !config.showWateringCanCharges())
				|| (type == WATERSKIN && !config.showWaterskinCharges())
				|| (type == BELLOWS && !config.showBellowCharges())
				|| (type == FRUIT_BASKET && !config.showBasketCharges())
				|| (type == SACK && !config.showSackCharges())
				|| (type == ABYSSAL_BRACELET && !config.showAbyssalBraceletCharges())
				|| (type == AMULET_OF_CHEMISTRY && !config.showAmuletOfChemistryCharges())
				|| (type == AMULET_OF_BOUNTY && !config.showAmuletOfBountyCharges())
				|| (type == POTION && !config.showPotionDoseCount()))
			{
				return;
			}

			charges = chargeItem.getCharges();
		}

		final Rectangle bounds = widgetItem.getCanvasBounds();
		final TextComponent textComponent = new TextComponent();
		textComponent.setPosition(new Point(bounds.x - 1, bounds.y + 15));
		textComponent.setText(charges < 0 ? "?" : String.valueOf(charges));
		textComponent.setColor(itemChargePlugin.getColor(charges));
		textComponent.render(graphics);
	}

	private boolean displayOverlay()
	{
		return config.showTeleportCharges() || config.showDodgyCount() || config.showFungicideCharges()
			|| config.showImpCharges() || config.showWateringCanCharges() || config.showWaterskinCharges()
			|| config.showBellowCharges() || config.showBasketCharges() || config.showSackCharges()
			|| config.showAbyssalBraceletCharges() || config.showExplorerRingCharges() || config.showRingOfForgingCount()
			|| config.showAmuletOfChemistryCharges() || config.showAmuletOfBountyCharges() || config.showPotionDoseCount()
			|| config.showBraceletOfSlaughterCharges() || config.showExpeditiousBraceletCharges();

	}
}
