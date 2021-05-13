package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSSequenceDefinition extends RSNode
{
	@Import("frameIds")
	int[] getFrameIDs();

	@Import("frameLengths")
	int[] getFrameLengths();

	@Import("chatFrameIds")
	int[] getChatFrameIds();
}
