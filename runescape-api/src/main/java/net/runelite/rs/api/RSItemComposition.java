package net.runelite.rs.api;

import net.runelite.api.ItemComposition;
import net.runelite.api.IterableHashTable;
import net.runelite.mapping.Import;

public interface RSItemComposition extends ItemComposition
{
	@Import("name")
	@Override
	String getName();

	@Import("name")
	@Override
	void setName(String name);

	@Import("id")
	@Override
	int getId();

	@Import("noteTemplate")
	@Override
	int getNote();

	@Import("note")
	@Override
	int getLinkedNoteId();

	@Import("placeholder")
	@Override
	int getPlaceholderId();

	@Import("placeholderTemplate")
	@Override
	int getPlaceholderTemplateId();

	@Import("price")
	@Override
	int getPrice();

	@Import("isMembersOnly")
	@Override
	boolean isMembers();

	@Import("isTradable")
	@Override
	boolean isTradeable();

	@Import("isTradable")
	void setTradeable(boolean yes);

	/**
	 * You probably want {@link #isStackable}
	 * <p>
	 * This is the <b>{@code int}</b> that client code uses internally to represent this true/false value. It appears to only ever be set to 1 or 0
	 * @return 0 when this type of item isn't stackable, 1 otherwise
	 */
	@Import("isStackable")
	int getIsStackable();

	@Import("maleModel")
	int getMaleModel();

	@Import("inventoryActions")
	@Override
	String[] getInventoryActions();

	@Import("groundActions")
	String[] getGroundActions();

	@Import("getShiftClickIndex")
	@Override
	int getShiftClickActionIndex();

	@Import("getModel")
	RSModel getModel(int quantity);

	@Import("unnotedId")
	@Override
	int getInventoryModel();

	@Import("unnotedId")
	@Override
	void setInventoryModel(int model);

	@Import("recolorFrom")
	@Override
	short[] getColorToReplace();

	@Import("recolorFrom")
	@Override
	void setColorToReplace(short[] colorsToReplace);

	@Import("recolorTo")
	@Override
	short[] getColorToReplaceWith();

	@Import("recolorTo")
	@Override
	void setColorToReplaceWith(short[] colorToReplaceWith);

	@Import("retextureFrom")
	@Override
	short[] getTextureToReplace();

	@Import("retextureFrom")
	@Override
	void setTextureToReplace(short[] textureToFind);

	@Import("retextureTo")
	@Override
	short[] getTextureToReplaceWith();

	@Import("retextureTo")
	@Override
	void setTextureToReplaceWith(short[] textureToReplaceWith);

	@Import("params")
	RSIterableNodeHashTable getParams();

	@Import("params")
	void setParams(RSIterableNodeHashTable params);

	@Import("params")
	void setParams(IterableHashTable params);

	@Import("xan2d")
	@Override
	int getXan2d();

	@Import("xan2d")
	@Override
	void setXan2d(int angle);

	@Import("yan2d")
	@Override
	int getYan2d();

	@Import("yan2d")
	@Override
	void setYan2d(int angle);

	@Import("zan2d")
	@Override
	int getZan2d();

	@Import("zan2d")
	@Override
	void setZan2d(int angle);
}
