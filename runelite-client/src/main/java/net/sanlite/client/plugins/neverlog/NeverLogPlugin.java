package net.sanlite.client.plugins.neverlog;

import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;
import java.time.Instant;

@PluginDescriptor(
		name = "Never Log",
		description = "Prevents your character from logging out after a period of inactivity. Use at your own risk!",
		tags = {"never", "log", "logout", "inactivity"},
		enabledByDefault = false
)
public class NeverLogPlugin extends Plugin
{
	@Inject
	private Client client;

	private int delay;

	@Override
	protected void startUp()
	{
		delay = generateDelay();
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		int keyboardIdleTicks = client.getKeyboardIdleTicks();

		long currentEpoch = Instant.now().toEpochMilli();
		long mouseClickIdleTicks = (currentEpoch - client.getMouseLastPressedMillis()) / 20;

		int idleTicks = Math.min((int) mouseClickIdleTicks, keyboardIdleTicks);
		if (idleTicks > delay)
		{
			resetIdleTicks();
			delay = generateDelay();
		}
	}

	private int generateDelay()
	{
		// Generate number between 30 seconds and 270 seconds
		return (int) (Math.random() * (13500 - 1500)) + 1500;
	}

	private void resetIdleTicks()
	{
		client.setKeyboardIdleTicks(0);
	}
}
