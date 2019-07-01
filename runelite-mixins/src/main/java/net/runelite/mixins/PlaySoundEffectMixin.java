package net.runelite.mixins;

import net.runelite.api.SoundEffectVolume;
import net.runelite.api.events.AreaSoundEffectPlayed;
import net.runelite.api.events.SoundEffectPlayed;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.*;

@Mixin(RSClient.class)
public abstract class PlaySoundEffectMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private static int lastSoundEffectCount;

	@Inject
	@Override
	public void playSoundEffect(int id)
	{
		playSoundEffect(id, 0, 0, 0, 0);
	}

	@Inject
	@Override
	public void playSoundEffect(int id, int x, int y, int range)
	{
		playSoundEffect(id, x, y, range, 0);
	}

	@Inject
	@Override
	public void playSoundEffect(int id, int x, int y, int range, int delay)
	{
		int position = ((x & 255) << 16) + ((y & 255) << 8) + (range & 255);

		int[] queuedSoundEffectIDs = getQueuedSoundEffectIDs();
		int[] queuedSoundEffectLoops = getQueuedSoundEffectLoops();
		int[] queuedSoundEffectDelays = getQueuedSoundEffectDelays();
		RSSoundEffect[] audioEffects = getAudioEffects();
		int[] soundLocations = getSoundLocations();
		int queuedSoundEffectCount = getQueuedSoundEffectCount();

		queuedSoundEffectIDs[queuedSoundEffectCount] = id;
		queuedSoundEffectLoops[queuedSoundEffectCount] = 1;
		queuedSoundEffectDelays[queuedSoundEffectCount] = delay;
		audioEffects[queuedSoundEffectCount] = null;
		soundLocations[queuedSoundEffectCount] = position;

		setQueuedSoundEffectCount(queuedSoundEffectCount + 1);
	}

	@Inject
	@Override
	public void playSoundEffect(int id, int volume)
	{
		RSSoundEffect soundEffect = getTrack(getIndexCache4(), id, 0);
		if (soundEffect == null)
		{
			return;
		}

		// If the current volume is not muted, use it instead
		final int soundEffectVolume = getSoundEffectVolume();
		if (soundEffectVolume != SoundEffectVolume.MUTED)
		{
			volume = soundEffectVolume;
		}

		RSRawSound rawAudioNode = soundEffect.toRawAudioNode().applyResampler(getSoundEffectResampler());
		RSRawPcmStream rawPcmStream = createRawPcmStream(rawAudioNode, 100, volume);
		rawPcmStream.setNumLoops(1);

		getSoundEffectAudioQueue().addSubStream((RSPcmStream) rawPcmStream);
	}

	@FieldHook("soundEffectCount")
	@Inject
	public static void queuedSoundEffectCountChanged(int idx)
	{
		int soundCount = client.getQueuedSoundEffectCount();
		if (soundCount == lastSoundEffectCount + 1)
		{
			int soundIndex = soundCount - 1;
			int packedLocation = client.getSoundLocations()[soundIndex];

			if (packedLocation == 0)
			{
				// Regular sound effect

				SoundEffectPlayed event = new SoundEffectPlayed();
				event.setSoundId(client.getQueuedSoundEffectIDs()[soundIndex]);
				event.setDelay(client.getQueuedSoundEffectDelays()[soundIndex]);
				client.getCallbacks().post(event);
			}
			else
			{
				// Area sound effect

				int x = (packedLocation >> 16) & 0xFF;
				int y = (packedLocation >> 8) & 0xFF;
				int range = (packedLocation) & 0xFF;

				AreaSoundEffectPlayed event = new AreaSoundEffectPlayed();
				event.setSoundId(client.getQueuedSoundEffectIDs()[soundIndex]);
				event.setSceneX(x);
				event.setSceneY(y);
				event.setRange(range);
				event.setDelay(client.getQueuedSoundEffectDelays()[soundIndex]);
				client.getCallbacks().post(event);
			}
		}

		lastSoundEffectCount = soundCount;
	}
}
