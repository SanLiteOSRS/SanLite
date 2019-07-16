package net.runelite.client.plugins.clancaller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.client.util.Text;

@Singleton
public class ClanCallerService
{
	private final Client client;
	private final ClanCallerConfig config;

	@Inject
	private ClanCallerService(Client client, ClanCallerConfig config)
	{
		this.config = config;
		this.client = client;
	}

	public void forEachPlayer(final BiConsumer<Player, Color> consumer)
	{
		if (!config.highlightCallers() && !config.highlightCallersPile())
		{
			return;
		}

		for (Player player : client.getPlayers())
		{
			if (player == null || player.getName() == null)
			{
				continue;
			}

			if (playerIdentity(player) == "caller" && config.highlightCallers())
			{
				consumer.accept(player, config.getCallerColor());
			}
			if (playerIdentity(player) == "pile" && config.highlightCallersPile())
			{
				consumer.accept(player, config.getCallerPileColor());
			}
		}
	}

	public String playerIdentity(Player player)
	{
		List<Player> callerList = populateCallerObjectList();

		for (Player caller : callerList)
		{
			if (caller.getName().equals(player.getName()))
			{
				return "caller";
			}
			if (caller.getInteracting() != null)
			{
				if (caller.getInteracting().getName().equals(player.getName()))
				{
					return "pile";
				}
			}
		}
		return "";
	}
	private List<Player> populateCallerObjectList()
	{
		final List<String> callerRSNs = Text.fromCSV(config.getCallerRsns());
		List<Player> callerList = new ArrayList<>();
		for (Player player : client.getPlayers())
		{
			if (player == null || player.getName() == null)
			{
				continue;
			}
			for (String rsn : callerRSNs)
			{
				if (player.getName().equals(rsn))
				{
					callerList.add(player);
				}
			}
		}
		return callerList;
	}
}
