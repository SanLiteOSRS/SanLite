/*
 * Copyright (c) 2017, Tomas Slusny <slusnucky@gmail.com>
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
package net.runelite.client.ui.overlay.tooltip;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.Getter;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;

@Singleton
public class TooltipManager
{
	private static final Collection<String> TO_RESET = ImmutableList.of(
			"TooltipOverlay_preferredLocation",
			"TooltipOverlay_preferredPosition"
	);

	private final ConfigManager configManager;

	@Inject
	private TooltipManager(final ConfigManager configManager)
	{
		this.configManager = configManager;
	}

	@Getter
	private final List<Tooltip> tooltips = new ArrayList<>();

	public void add(Tooltip tooltip)
	{
		tooltips.add(tooltip);
	}

	public void addFront(Tooltip tooltip)
	{
		tooltips.add(0, tooltip);
	}

	public void clear()
	{
		tooltips.clear();
	}

	@Subscribe
	public void onConfigChanged(final ConfigChanged event)
	{
		// Temporary fix for resetting repositioned tooltip overlay
		// TODO: Remove this eventually
		if (event.getGroup().equals("runelite") &&
				TO_RESET.contains(event.getKey()) &&
				!Strings.isNullOrEmpty(event.getNewValue()))
		{
			configManager.unsetConfiguration(event.getGroup(), event.getKey());
		}
	}
}
