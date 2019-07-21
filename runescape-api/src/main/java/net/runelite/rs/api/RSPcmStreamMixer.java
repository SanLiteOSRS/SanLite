package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSPcmStreamMixer
{
	@Import("addSubStream")
	void addSubStream(RSPcmStream taskDataNode);
}
