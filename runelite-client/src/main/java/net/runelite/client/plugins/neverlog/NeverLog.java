package net.runelite.client.plugins.neverlog;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.awt.event.KeyEvent;
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

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private NeverLogDebugOverlay overlay;

	private Random rnd;
	private int delay;
	long epochAtDelay;

	@Override
	protected void startUp()
	{
		overlayManager.add(overlay);
		rnd = new Random();
		delay = generateDelay();
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		int keyboardIdleTicks = client.getKeyboardIdleTicks();
		log.warn("Keyboard Idle Ticks: " + keyboardIdleTicks);

		long currentEpoch = Instant.now().toEpochMilli();
		long mouseClickIdleTicks = (currentEpoch - client.getMouseLastPressedMillis()) / 20;
		log.warn("Mouse Idle Ticks: " + mouseClickIdleTicks);

		int idleTicks = Math.min((int)mouseClickIdleTicks, keyboardIdleTicks);

		if (idleTicks > delay)
		{
			resetIdleTicks();
			delay = generateDelay();
		}
	}

	private int generateDelay()
	{
		epochAtDelay = Instant.now().toEpochMilli();
		//Generate number between 30 seconds and 270 seconds
		return (int) (Math.random() * (13500 - 1500)) + 1500;

	}

	private void resetIdleTicks()
	{
		//50/50 mouse or keyboard reset
		if (Math.random() < 0.5)
		{
			log.warn("Reset keyboard idle ticks");
			client.setKeyboardIdleTicks(0);
		}
		else
		{
			log.warn("Current epoch: " + Instant.now().toEpochMilli());
			log.warn("Epoch at delay: " + epochAtDelay);
			client.setMouseIdleTicks(0);
			client.setMouseLastPressedMillis(Instant.now().toEpochMilli());
			log.warn("Set to:" + client.getMouseLastPressedMillis());
		}
	}
}
