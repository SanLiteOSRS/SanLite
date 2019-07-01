package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSRawPcmStream
{
	@Import("setNumLoops")
	void setNumLoops(int numLoops);
}
