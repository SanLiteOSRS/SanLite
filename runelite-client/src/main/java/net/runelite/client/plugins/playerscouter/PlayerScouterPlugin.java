package net.runelite.client.plugins.playerscouter;

import com.google.inject.Provides;
import lombok.Getter;
import net.runelite.api.*;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.Notifier;
import javax.inject.Inject;
import java.util.ArrayList;

@PluginDescriptor(
		name = "Player Scouter",
		description = "Assists in scouting a certain player",
		tags = {"scout, scouter, player, finder, overlay, notifications"},
		enabledByDefault = false,
		type = PluginType.SANLITE
)
public class PlayerScouterPlugin extends Plugin
{
	@Inject
	private Notifier notifier;

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private PlayerScouterOverlay scouterOverlay;

	@Inject
	private PlayerScouterConfig playerScouterConfig;

	@Getter
	private String lastSeen = "never";

	@Getter
	private int seenCounter = 0;

	@Getter
	private boolean spotted = false;

	@Provides
	PlayerScouterConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PlayerScouterConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(scouterOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(scouterOverlay);
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		ArrayList<String> playerList = new ArrayList<>();

		for (Player P : client.getPlayers())
		{
			playerList.add(P.getName());
		}

		if (playerList.contains(playerScouterConfig.getPlayerRSN()))
		{
			if (!spotted)
			{
				lastSeen = java.time.LocalTime.now().toString();
				seenCounter++;
				spotted = true;

				if (playerScouterConfig.getNotificationsEnabled())
				{
					notifier.notify(playerScouterConfig.getPlayerRSN() + " spotted!");
				}
			}
		}
		else
		{
			spotted = false;
		}

	}
	public void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("playerscouter"))
		{
			lastSeen = "never";
			seenCounter = 0;
			spotted = false;
		}
	}
}