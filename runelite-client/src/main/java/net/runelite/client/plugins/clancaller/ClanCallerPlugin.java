package net.runelite.client.plugins.clancaller;

import com.google.inject.Provides;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import static net.runelite.api.MenuAction.*;
import net.runelite.api.MenuEntry;
import net.runelite.api.Player;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ColorUtil;
import net.runelite.client.util.Text;

@PluginDescriptor(
		name = "Clan Caller",
		description = "Highlight players that your clans caller is hitting",
		tags = {"highlight", "minimap", "overlay", "players", "clan", "caller"},
		type = PluginType.SANLITE
)

@Slf4j
public class ClanCallerPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private ClanCallerConfig config;

	@Inject
	private ClanCallerOverlay clanCallerOverlay;

	@Inject
	private ClanCallerTileOverlay clanCallerTileOverlay;

	@Inject
	private ClanCallerMinimapOverlay clanCallerMinimapOverlay;

	@Inject
	private Client client;

	@Inject
	private ClanCallerService clanCallerService;

	@Provides
	ClanCallerConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ClanCallerConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(clanCallerOverlay);
		overlayManager.add(clanCallerTileOverlay);
		overlayManager.add(clanCallerMinimapOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(clanCallerOverlay);
		overlayManager.remove(clanCallerTileOverlay);
		overlayManager.remove(clanCallerMinimapOverlay);
	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded menuEntryAdded)
	{
		int type = menuEntryAdded.getType();

		if (type >= 2000)
		{
			type -= 2000;
		}

		int identifier = menuEntryAdded.getIdentifier();
		if (type == FOLLOW.getId() || type == TRADE.getId()
				|| type == SPELL_CAST_ON_PLAYER.getId() || type == ITEM_USE_ON_PLAYER.getId()
				|| type == PLAYER_FIRST_OPTION.getId()
				|| type == PLAYER_SECOND_OPTION.getId()
				|| type == PLAYER_THIRD_OPTION.getId()
				|| type == PLAYER_FOURTH_OPTION.getId()
				|| type == PLAYER_FIFTH_OPTION.getId()
				|| type == PLAYER_SIXTH_OPTION.getId()
				|| type == PLAYER_SEVENTH_OPTION.getId()
				|| type == PLAYER_EIGTH_OPTION.getId()
				|| type == RUNELITE.getId())
		{
			final Player localPlayer = client.getLocalPlayer();
			Player[] players = client.getCachedPlayers();
			Player player = null;

			if (identifier >= 0 && identifier < players.length)
			{
				player = players[identifier];
			}

			if (player == null)
			{
				return;
			}

			int image = -1;
			Color color = null;

			List<Player> callerList = new ArrayList<>();
			List<String> callerRSNs = Text.fromCSV(config.getCallerRsns());
			for (Player plyr : client.getPlayers())
			{
				for (String rsn : callerRSNs)
				{
					if (plyr.getName().equals(rsn))
					{
						callerList.add(plyr);
					}
				}
			}

			if (config.highlightCallers() && clanCallerService.playerIdentity(player) == "caller")
			{
				color = config.getCallerColor();
			}
			if (config.highlightCallersPile() && clanCallerService.playerIdentity(player) == "pile")
			{
				color = config.getCallerPileColor();
			}

			if (image != -1 || color != null)
			{
				MenuEntry[] menuEntries = client.getMenuEntries();
				MenuEntry lastEntry = menuEntries[menuEntries.length - 1];

				if (color != null && config.colorPlayerMenu())
				{
					// strip out existing <col...
					String target = lastEntry.getTarget();
					int idx = target.indexOf('>');
					if (idx != -1)
					{
						target = target.substring(idx + 1);
					}

					lastEntry.setTarget(ColorUtil.prependColorTag(target, color));
				}


				client.setMenuEntries(menuEntries);
			}
		}
	}
}
