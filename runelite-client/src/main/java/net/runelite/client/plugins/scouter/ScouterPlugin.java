package net.runelite.client.plugins.scouter;

import com.google.inject.Provides;
import net.runelite.api.*;
import net.runelite.api.coords.WorldPoint;
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
		tags = {"scout, scouter"},
		type = PluginType.SANLITE
)
public class ScouterPlugin extends Plugin
{

	@Inject
	private Notifier notifier;

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private ScouterOverlay scouterOverlay;

	@Inject
	private ScouterConfig scouterConfig;

	private boolean localPlayerRunningToDestination;

	private WorldPoint prevLocalPlayerLocation;

	private String lastSeen = "never";

	private int seenCounter = 0;

	private boolean spotted = false;

	@Provides
	ScouterConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ScouterConfig.class);
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

		if (playerList.contains(scouterConfig.getPlayerRSN()))
		{
			if (!spotted)
			{
				lastSeen = java.time.LocalTime.now().toString();
				seenCounter++;
				spotted = true;

				if (scouterConfig.getNotificationsEnabled())
				{
					notifier.notify(scouterConfig.getPlayerRSN() + " spotted!");
				}
			}
		}
		else
		{
			spotted = false;
		}

	}
	public String getLastSeen()
	{
		return lastSeen;
	}

	public int getSeenCounter()
	{
		return seenCounter;
	}

	public boolean getSpotted()
	{
		return spotted;
	}
}
