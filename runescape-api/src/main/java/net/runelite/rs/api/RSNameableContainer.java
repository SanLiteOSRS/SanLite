package net.runelite.rs.api;

import net.runelite.api.NameableContainer;
import net.runelite.api.Nameable;
import net.runelite.mapping.Import;

public interface RSNameableContainer extends NameableContainer<Nameable>
{
	@Import("getSize")
	int getCount();

	@Import("array")
	RSNameable[] getRSMembers();

	@Import("getByUsername")
	RSNameable getByUsername(RSUsername name);

	/**
	 * Method called by the container when an element is added
	 * @param name current name
	 * @param prevName previous name
	 */
	void rl$add(RSUsername name, RSUsername prevName);

	/**
	 * Method called by the container when an element is removed
	 * @param nameable nameable
	 */
	void rl$remove(RSNameable nameable);
}
