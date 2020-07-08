package net.runelite.client.plugins.usernamechanger;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;

@Slf4j
@PluginDescriptor(
		name = "Hide RSN",
		description = "Hide your own/clan members RSNs from the chatbox",
		tags = {"hide", "rsn"}
)
public class UsernameChangerPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private UsernameChangerConfig config;

	@Provides
	UsernameChangerConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(UsernameChangerConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		replaceUsername();
	}

	@Override
	protected void shutDown() throws Exception
	{
	}

	public void replaceUsername()
	{
		if (config.getCustomUsername().isEmpty())
			return;

		client.setLocalPlayerName(config.getCustomUsername());
		log.debug("Local player username set to {}", config.getCustomUsername());
	}

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		log.debug("Username: {}", client.getLocalPlayerName());
	}

}
