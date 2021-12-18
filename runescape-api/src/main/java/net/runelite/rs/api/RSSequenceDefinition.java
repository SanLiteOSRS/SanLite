package net.runelite.rs.api;

import net.runelite.api.Animation;
import net.runelite.mapping.Import;

public interface RSSequenceDefinition extends RSNode, Animation
{
	@Import("frameIds")
	int[] getFrameIDs();

	@Import("frameLengths")
	int[] getFrameLengths();

	@Import("chatFrameIds")
	int[] getChatFrameIds();

	@Import("transformSpotAnimationModel")
	RSModel transformSpotAnimationModel(RSModel var1, int var2);
}
