/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
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
package net.runelite.api;

import javax.annotation.Nullable;

/**
 * Represents the template of a specific item type.
 */
public interface ItemComposition extends ParamHolder
{
	/**
	 * Gets the items name.
	 *
	 * @return the name of the item
	 */
	String getName();

	/**
	 * Sets the items name.
	 */
	void setName(String name);

	/**
	 * Gets the items ID.
	 *
	 * @return the items ID
	 * @see ItemID
	 */
	int getId();

	/**
	 * Gets a value specifying whether the item is noted.
	 *
	 * @return 799 if noted, -1 otherwise
	 */
	int getNote();

	/**
	 * Gets the item ID of the noted or unnoted variant of this item.
	 * <p>
	 * Calling this method on a noted item will result in the ID of itself
	 * in unnoted form, and on an unnoted item its noted variant.
	 *
	 * @return the noted or unnoted variant of this item
	 */
	int getLinkedNoteId();

	/**
	 * Gets the item ID of the normal or placeholder variant of this item.
	 * <p>
	 * Calling this method on a normal item will result in the ID of itself
	 * in placeholder form, and on a placeholder item its normal variant.
	 *
	 * @return the normal or placeholder variant of this item
	 */
	int getPlaceholderId();

	/**
	 * Gets a value specifying whether the item is a placeholder.
	 *
	 * @return 14401 if placeholder, -1 otherwise
	 */
	int getPlaceholderTemplateId();

	/**
	 * Gets the store price of the item.
	 * <p>
	 * Although not all items can be found in a store, they have a store price
	 * which can be used to calculate high and low alchemy values. Multiplying
	 * the price by {@code 0.6} and {@code 0.4} gives these high and low
	 * alchemy values, respectively.
	 *
	 * @return the general store value of the item
	 *
	 * @see Constants#HIGH_ALCHEMY_MULTIPLIER
	 */
	int getPrice();

	/**
	 * Get the high alchemy price for this item. All items have a high alchemy price,
	 * but not all items can be alched.
	 *
	 * @return the high alch price
	 */
	int getHaPrice();

	/**
	 * Checks whether the item is members only.
	 *
	 * @return true if members only, false otherwise.
	 */
	boolean isMembers();

	/**
	 * Checks whether the item is able to stack in a players inventory.
	 *
	 * @return true if stackable, false otherwise
	 */
	boolean isStackable();

	/**
	 * Returns whether or not the item can be sold on the grand exchange.
	 */
	boolean isTradeable();

	/**
	 * Gets an array of possible right-click menu actions the item
	 * has in a player inventory.
	 *
	 * @return the inventory menu actions
	 */
	String[] getInventoryActions();

	String[] getGroundActions();

	/**
	 * Gets the menu action index of the shift-click action.
	 *
	 * @return the index of the shift-click action
	 */
	int getShiftClickActionIndex();

	/**
	 * Sets the menu action index of the shift-click action.
	 *
	 * @param shiftClickActionIndex the new index of the shift-click action
	 */
	void setShiftClickActionIndex(int shiftClickActionIndex);

	/**
	 * Resets the menu action index of the shift-click action to its
	 * default value.
	 */
	void resetShiftClickActionIndex();

	/**
	 * With this you can make certain (ground) items look like different ones.
	 *
	 * @param id The itemID of the item with desired model
	 */
	void setModelOverride(int id);

	/**
	 * Gets the model ID of the inventory item.
	 *
	 * @return the model ID
	 */
	int getInventoryModel();

	/**
	 * Since the client reuses item models, it stores colors that can be replaced.
	 * This returns what colors the item model will be replaced with.
	 *
	 * @return the colors to replace with
	 */
	@Nullable
	short[] getColorToReplaceWith();

	/**
	 * Since the client reuses item models, it stores textures that can be replaced.
	 * This returns what textures the item model will be replaced with.
	 *
	 * @return the textures to replace with
	 */
	@Nullable
	short[] getTextureToReplaceWith();
}
