package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSSequenceDefinition extends RSNode
{
	@Import("frameIds")
	int[] getFrameIDs();

	@Import("frameLengths")
	int[] getFrameLenths();

	@Import("chatFrameIds")
	int[] getChatFrameIds();
}
