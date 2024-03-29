package net.runelite.rs.api;

import net.runelite.api.Nameable;
import net.runelite.mapping.Import;

public interface RSNameable extends Nameable, Comparable<Nameable>
{
	@Import("username")
	RSUsername getRsName();

	@Import("previousUsername")
	RSUsername getRsPrevName();
}
