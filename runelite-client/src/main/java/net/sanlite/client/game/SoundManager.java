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

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.sound.sampled.*;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Slf4j
public class SoundManager implements LineListener
{
	private final RuneLiteConfig runeLiteConfig;
	private final List<Clip> playbackQueue;

	@Inject
	private SoundManager(RuneLiteConfig runeLiteConfig, EventBus eventBus)
	{
		this.runeLiteConfig = runeLiteConfig;
		playbackQueue = new ArrayList<>();
		eventBus.register(this);
	}

	public synchronized void playCustomSound(Clip clip)
	{
		setClipVolume(runeLiteConfig.soundVolume(), clip);
		clip.addLineListener(this);
		clip.setFramePosition(0);
		clip.start();

		playbackQueue.add(clip);
		log.debug("Added clip to playback queue, buffer: {}, length: {}, queue size: {}",
				clip.getBufferSize(), clip.getFrameLength(), playbackQueue.size());
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals(RuneLiteConfig.GROUP_NAME) && event.getKey().equals("soundVolume"))
		{
			for (Clip clip : playbackQueue)
			{
				setClipVolume(runeLiteConfig.soundVolume(), clip);
			}
		}
	}

	@Override
	public void update(LineEvent event)
	{
		if (event.getType() == LineEvent.Type.STOP)
		{
			if (playbackQueue.removeIf((clip) -> clip.getFrameLength() == clip.getFramePosition()))
				log.debug("Removed completed audio clips from playback queue, queue size: {}", playbackQueue.size());
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
