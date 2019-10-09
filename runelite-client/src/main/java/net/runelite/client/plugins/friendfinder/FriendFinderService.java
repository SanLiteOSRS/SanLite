package net.runelite.client.plugins.friendfinder;

import net.runelite.api.Client;
import net.runelite.api.Player;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.util.function.BiConsumer;

@Singleton
public class FriendFinderService
{
	private final Client client;
	private final FriendFinderConfig config;

	@Inject
	private FriendFinderService(Client client, FriendFinderConfig config)
	{
		this.config = config;
		this.client = client;
	}

	public void forEachPlayer(final BiConsumer<Player, Color> consumer)
	{
		if (!config.highlightOfflineFriends())
		{
			return;
		}

		for (Player player : client.getPlayers())
		{
			if (player == null || player.getName() == null)
			{
				continue;
			}

			if (player != client.getLocalPlayer())
			{
				if (config.highlightOfflineFriends() && client.isFriended(player.getName(), false))
				{
					if (player.isClanMember() && !config.disableIfClanMember())
					{
						consumer.accept(player, config.getFriendColor());
					}
					else if (!player.isClanMember())
					{
						consumer.accept(player, config.getFriendColor());
					}
				}
			}
		}
	}
}
