package net.runelite.api.events;

import lombok.Data;

@Data
public class SoundEffectPlayed
{
	private int soundId;
	private int delay;
}
