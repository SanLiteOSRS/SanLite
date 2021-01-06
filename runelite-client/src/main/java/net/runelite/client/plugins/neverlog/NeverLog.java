package net.runelite.client.plugins.neverlog;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;
import java.time.Instant;
import java.util.Random;

@PluginDescriptor(
		name = "Never Log",
		description = "Prevents your character from logging out",
		tags = {"never", "log", "logout"}
)

@Slf4j
public class NeverLog extends Plugin
{
	@Inject
	private Client client;

	private Random rnd;
	private int delay;

	@Override
	protected void startUp()
	{
		rnd = new Random();
		delay = generateDelay();
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		int keyboardIdleTicks = client.getKeyboardIdleTicks();

		long currentEpoch = Instant.now().toEpochMilli();
		long mouseClickIdleTicks = (currentEpoch - client.getMouseLastPressedMillis()) / 20;

		int idleTicks = Math.min((int)mouseClickIdleTicks, keyboardIdleTicks);

		if (idleTicks > delay)
		{
			resetIdleTicks();
			delay = generateDelay();
		}
	}

	private int generateDelay()
	{
		//Generate number between 30 seconds and 270 seconds
		return (int) (Math.random() * (13500 - 1500)) + 1500;

	}

	private void resetIdleTicks()
	{
		client.setKeyboardIdleTicks(0);
	}
}
