/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.menuentryswapper;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("menuentryswapper")
public interface MenuEntrySwapperConfig extends Config
{
	@ConfigItem(
			position = -2,
			keyName = "shiftClickCustomization",
			name = "Customizable shift-click",
			description = "Allows customization of shift-clicks on items"
	)
	default boolean shiftClickCustomization()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapAdmire",
			name = "Admire",
			description = "Swap Admire with Teleport, Spellbook and Perks (max cape) for mounted skill capes.",
			group = "Transportation"
	)
	default boolean swapAdmire()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapAssignment",
			name = "Assignment",
			description = "Swap Talk-to with Assignment for Slayer Masters. This will take priority over swapping Trade.",
			group = "Task assignment"
	)
	default boolean swapAssignment()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapBanker",
			name = "Bank",
			description = "Swap Talk-to with Bank on Bank NPC<br>Example: Banker",
			group = "Bank"
	)
	default boolean swapBank()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapBirdhouseEmpty",
			name = "Swap empty birdhouse",
			description = "Swap Interact with Empty for birdhouses on Fossil Island",
			group = "Hunter"
	)
	default boolean swapBirdhouseEmpty()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapBones",
			name = "Bury",
			description = "Swap Bury with Use on Bones"
	)
	default boolean swapBones()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapContract",
			name = "Contract",
			description = "Swap Talk-to with Contract on Guildmaster Jane",
			group = "Task assignment"
	)
	default boolean swapContract()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapChase",
			name = "Chase",
			description = "Allows to left click your cat to chase"
	)
	default boolean swapChase()
	{
		return true;
	}

	@ConfigItem(
			keyName = "claimSlime",
			name = "Claim Slime",
			description = "Swap Talk-to with Claim Slime from Morytania diaries"
	)
	default boolean claimSlime()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapDarkMage",
			name = "Swap Dark Mage repairs",
			description = "Swap Talk-to with Repairs for Dark Mage",
			group = "Runecrafting"
	)
	default boolean swapDarkMage()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapCaptainKhaled",
			name = "Task",
			description = "Swap Talk-to with Task for Captain Khaled in Port Piscarilius",
			group = "Task assignment"
	)
	default boolean swapCaptainKhaled()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapDecant",
			name = "Decant",
			description = "Swap Talk-to with Decant for Bob Barter and Murky Matt at the Grand Exchange.",
			group = "Grand Exchange"
	)
	default boolean swapDecant()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapExchange",
			name = "Exchange",
			description = "Swap Talk-to with Exchange on NPC<br>Example: Grand Exchange Clerk, Tool Leprechaun, Void Knight"
	)
	default boolean swapExchange()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapFairyRing",
			name = "Fairy ring",
			description = "Swap Zanaris with Last-destination or Configure on Fairy rings",
			group = "Transportation"
	)
	default FairyRingMode swapFairyRing()
	{
		return FairyRingMode.LAST_DESTINATION;
	}

	@ConfigItem(
			keyName = "swapHardWoodGrove",
			name = "Hardwood Grove",
			description = "Swap Quick-Pay(100) and Send-Parcel at Hardwood Grove",
			group = "Payment"
	)
	default boolean swapHardWoodGrove()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapHarpoon",
			name = "Harpoon",
			description = "Swap Cage, Big Net with Harpoon on Fishing spot",
			group = "Fishing"
	)
	default boolean swapHarpoon()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapHelp",
			name = "Help",
			description = "Swap Talk-to with Help on Arceuus library customers",
			group = "Task assignment"
	)
	default boolean swapHelp()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapHomePortal",
			name = "Home",
			description = "Swap Enter with Home or Build or Friend's house on Portal",
			group = "Player-owned house"
	)
	default HouseMode swapHomePortal()
	{
		return HouseMode.HOME;
	}

	@ConfigItem(
			keyName = "swapHouseAdvertisement",
			name = "House Advertisement",
			description = "Swap View with Add-House or Visit-Last on House Advertisement board",
			group = "Player-owned house"
	)
	default HouseAdvertisementMode swapHouseAdvertisement()
	{
		return HouseAdvertisementMode.VIEW;
	}

	@ConfigItem(
			keyName = "swapPickpocket",
			name = "Pickpocket",
			description = "Swap Talk-to with Pickpocket",
			warning = "This is a use at own risk option, do you still want toggle this option?"
	)
	default boolean swapPickpocket()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapPay",
			name = "Pay",
			description = "Swap Talk-to with Pay on NPC<br>Example: Elstan, Heskel, Fayeth",
			group = "Payment"
	)
	default boolean swapPay()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapJewelleryBox",
			name = "Jewellery Box",
			description = "Swap Teleport Menu with previous destination on Jewellery Box",
			group = "Transportation"
	)
	default boolean swapJewelleryBox()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapPrivate",
			name = "Private storage",
			description = "Swap Shared with Private on the Chambers of Xeric storage units.",
			group = "Chambers of Xeric"
	)
	default boolean swapPrivate()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapPick",
			name = "Swap pick Gourd Tree",
			description = "Swap Pick with Pick-lots of the Gourd tree in the Chambers of Xeric",
			group = "Chambers of Xeric"
	)
	default boolean swapPick()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapQuick",
			name = "Quick Pass/Open/Start/Travel",
			description = "Swap Pass with Quick-Pass, Open with Quick-Open, Ring with Quick-Start and Talk-to with Quick-Travel",
			group = "Entrances"
	)
	default boolean swapQuick()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapBoxTrap",
			name = "Swap reset box trap",
			description = "Swap Check with Reset on box trap",
			group = "Hunter"
	)
	default boolean swapBoxTrap()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapTeleportItem",
			name = "Teleport item",
			description = "Swap Wear, Wield with Rub, Teleport on teleport item<br>Example: Amulet of glory, Explorer's ring, Chronicle",
			group = "Transportation"
	)
	default boolean swapTeleportItem()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapAbyssTeleport",
			name = "Teleport to Abyss",
			description = "Swap Talk-to with Teleport for the Mage of Zamorak",
			group = "Transportation"
	)
	default boolean swapAbyssTeleport()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapTrade",
			name = "Trade",
			description = "Swap Talk-to with Trade on NPC<br>Example: Shop keeper, Shop assistant",
			group = "Stores"
	)
	default boolean swapTrade()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapTravel",
			name = "Travel",
			description = "Swap Talk-to with Travel, Take-boat, Pay-fare, Charter on NPC<br>Example: Squire, Monk of Entrana, Customs officer, Trader Crewmember",
			group = "Transportation"
	)
	default boolean swapTravel()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapEnchant",
			name = "Enchant",
			description = "Swap Talk-to with Enchant for Eluned"
	)
	default boolean swapEnchant()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapTeleportSpell",
			name = "Shift-click teleport spells",
			description = "Swap teleport spells that have a second destination on shift",
			group = "Transportation"
	)
	default boolean swapTeleportSpell()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapStartMinigame",
			name = "Pyramid Plunder start-minigame",
			description = "Swap Talk-to with Start-minigame at the Guardian Mummy"
	)
	default boolean swapStartMinigame()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapQuickleave",
			name = "Quick-Leave",
			description = "Swap Leave Tomb with Quick-Leave at Pyramid Plunder",
			group = "Entrances"
	)
	default boolean swapQuickLeave()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapGEItemCollect",
			name = "GE Item Collect",
			description = "Swap Collect-notes, Collect-items, or Bank options from GE offer",
			group = "Grand Exchange"
	)
	default GEItemCollectMode swapGEItemCollect()
	{
		return GEItemCollectMode.DEFAULT;
	}

	@ConfigItem(
			keyName = "swapGEAbort",
			name = "GE Abort",
			description = "Swap abort offer on Grand Exchange offers when shift-clicking",
			group = "Grand Exchange"
	)
	default boolean swapGEAbort()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapNpcContact",
			name = "NPC Contact",
			description = "Swap NPC Contact with last contacted NPC when shift-clicking"
	)
	default boolean swapNpcContact()
	{
		return false;
	}

	@ConfigItem(
			keyName = "bankWithdrawShiftClick",
			name = "Bank Withdraw Shift-Click",
			description = "Swaps the behavior of shift-click when withdrawing from bank.",
			group = "Bank"
	)
	default ShiftWithdrawMode bankWithdrawShiftClick()
	{
		return ShiftWithdrawMode.OFF;
	}

	@ConfigItem(
			keyName = "bankDepositShiftClick",
			name = "Bank Deposit Shift-Click",
			description = "Swaps the behavior of shift-click when depositing to bank.",
			group = "Bank"
	)
	default ShiftDepositMode bankDepositShiftClick()
	{
		return ShiftDepositMode.OFF;
	}

	@ConfigItem(
		keyName = "shopBuy",
		name = "Shop Buy Shift-Click",
		description = "Swaps the Buy options with Value on items in shops.",
		group = "Stores"
	)
	default BuyMode shopBuy()
	{
		return BuyMode.OFF;
	}

	@ConfigItem(
		keyName = "shopSell",
		name = "Shop Sell Shift-Click",
		description = "Swaps the Sell options with Value on items in your inventory when selling to shops.",
		group = "Stores"
	)
	default SellMode shopSell()
	{
		return SellMode.OFF;
	}

	@ConfigItem(
			keyName = "swapEssenceMineTeleport",
			name = "Essence Mine Teleport",
			description = "Swaps Talk-To with Teleport for NPCs which teleport you to the essence mine",
			group = "Transportation"
	)
	default boolean swapEssenceMineTeleport()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapNets",
			name = "Nets",
			description = "Swap Talk-to with Nets on Annette",
			group = "Fishing"
	)
	default boolean swapNets()
	{
		return true;
	}

	@ConfigItem(
			keyName = "swapGauntlet",
			name = "Corrupted Gauntlet",
			description = "Swap Enter with Enter-corrupted when entering The Gauntlet",
			group = "Entrances"
	)
	default boolean swapGauntlet()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapEmptyEssencePouch",
			name = "Swap empty essence pouch",
			description = "Swap fill with empty for essence pouches",
			group = "Runecrafting"
	)
	default boolean swapEmptyEssencePouch()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapFillPouchInBank",
			name = "Swap fill pouch in bank",
			description = "Swap use with fill for essence pouches when the bank is open",
			group = "Runecrafting"
	)
	default boolean swapFillPouchInBank()
	{
		return false;
	}

	@ConfigItem(
			keyName = "swapCastBloom",
			name = "Swap cast bloom",
			description = "Swap Wield to Cast Bloom for the silver sickle (b)"
	)
	default boolean swapCastBloom()
	{
		return false;
	}
}
