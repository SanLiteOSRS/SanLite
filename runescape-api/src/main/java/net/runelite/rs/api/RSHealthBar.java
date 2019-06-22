package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSHealthBar extends RSNode
{
	@Import("updates")
	RSIterableNodeDeque getUpdates(); // "combatinfolist" but only thing it has is getNode so this works

	@Import("healthBarFrontSpriteId")
	@Override
	int getHealthBarFrontSpriteId();

	@Import("getHealthBarFrontSprite")
	@Override
	RSSprite getHealthBarFrontSprite();

	@Import("getHealthBarBackSprite")
	@Override
	RSSprite getHealthBarBackSprite();

	@Import("healthBarPadding")
	@Override
	void setPadding(int padding);
}
