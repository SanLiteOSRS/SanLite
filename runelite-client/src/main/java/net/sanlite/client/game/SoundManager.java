/*
 * Copyright (c) 2020, Siraz <https://github.com/Sirazzz>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.sanlite.client.game;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.sound.sampled.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Singleton
@Slf4j
public class SoundManager implements LineListener
{
	private static final int MAXIMUM_PLAYBACK_QUEUE_SIZE = 10;

	private final RuneLiteConfig runeLiteConfig;
	private final List<Clip> currentPlayingSounds;
	private final LinkedList<Clip> playbackQueue;

	@Inject
	private SoundManager(RuneLiteConfig runeLiteConfig, EventBus eventBus)
	{
		this.runeLiteConfig = runeLiteConfig;
		currentPlayingSounds = new ArrayList<>();
		playbackQueue = new LinkedList<>();
		eventBus.register(this);
	}

	/**
	 * Plays a clip instantly from frame position 0
	 * @param clip audio clip
	 */
	public synchronized void playClip(@NonNull Clip clip)
	{
		setClipVolume(runeLiteConfig.soundVolume(), clip);
		clip.addLineListener(this);
		clip.setFramePosition(0);
		clip.start();

		currentPlayingSounds.add(clip);
		log.debug("Playing clip, buffer: {}, length: {}, currently playing {} sounds, queue size: {}",
				clip.getBufferSize(), clip.getFrameLength(), currentPlayingSounds.size(), playbackQueue.size());
	}

	/**
	 * Adds clip to the playback queue where it will be played when there are no other clips playing
	 * @param clip audio clip
	 */
	public synchronized void playClipLater(@NonNull Clip clip)
	{
		if (playbackQueue.size() > MAXIMUM_PLAYBACK_QUEUE_SIZE)
		{
			log.warn("Clip not added to playback queue. Maximum queue size of {} reached", MAXIMUM_PLAYBACK_QUEUE_SIZE);
			return;
		}

		if (currentPlayingSounds.size() == 0)
		{
			playClip(clip);
			return;
		}

		playbackQueue.add(clip);
		log.debug("Added clip to playback queue, buffer: {}, length: {}, queue size: {}",
				clip.getBufferSize(), clip.getFrameLength(), playbackQueue.size());
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals(RuneLiteConfig.GROUP_NAME) && event.getKey().equals("soundVolume"))
		{
			for (Clip clip : currentPlayingSounds)
			{
				setClipVolume(runeLiteConfig.soundVolume(), clip);
			}
		}
	}

	@Override
	public void update(LineEvent event)
	{
		if (event.getType() != LineEvent.Type.STOP)
		{
			return;
		}

		if (currentPlayingSounds.removeIf((clip) -> clip.getFrameLength() == clip.getFramePosition()))
		{
			log.debug("Removed all completed audio clips, still playing {} clips, queue size: {}",
					currentPlayingSounds.size(), playbackQueue.size());
			Clip clip = playbackQueue.poll();
			if (clip != null && currentPlayingSounds.size() == 0)
			{
				playClip(clip);
			}
		}
	}

	private void setClipVolume(int volume, Clip clip)
	{
		if (clip != null)
		{
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			BooleanControl muteControl = (BooleanControl) clip.getControl(BooleanControl.Type.MUTE);
			if (volume == 0)
			{
				muteControl.setValue(true);
				return;
			}

			muteControl.setValue(false);
			gainControl.setValue((float) (Math.log((double) volume / 100.0) / Math.log(10.0) * 20.0));
		}
	}
}
