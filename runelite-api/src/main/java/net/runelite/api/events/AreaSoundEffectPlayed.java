package net.runelite.api.events;

import lombok.Data;

@Data
public class AreaSoundEffectPlayed
{
	private int soundId;
	private int sceneX;
	private int sceneY;
	private int range;
	private int delay;
}
