package net.runelite.client.plugins.friendfinder;

import com.google.inject.Provides;
import net.runelite.api.Client;
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

import javax.inject.Inject;
import java.awt.*;

import static net.runelite.api.MenuAction.*;

@PluginDescriptor(
		name = "Friend Finder",
		description = "Highlight players on-screen and/or on the minimap",
		tags = {"highlight", "minimap", "overlay", "players", "friend", "finder", "friend finder"},
		enabledByDefault = false,
		type = PluginType.SANLITE
)
public class FriendFinderPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private FriendFinderConfig config;

	@Inject
	private FriendFinderOverlay friendFinderOverlay;

	@Inject
	private FriendFinderTileOverlay friendFinderTileOverlay;

	@Inject
	private FriendFinderMinimapOverlay friendFinderMinimapOverlay;

	@Inject
	private Client client;

	@Provides
	FriendFinderConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(FriendFinderConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(friendFinderOverlay);
		overlayManager.add(friendFinderTileOverlay);
		overlayManager.add(friendFinderMinimapOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(friendFinderOverlay);
		overlayManager.remove(friendFinderTileOverlay);
		overlayManager.remove(friendFinderMinimapOverlay);
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

			Color color = null;

			if (config.highlightOfflineFriends() && client.isFriended(player.getName(), false))
			{
				if (player.isClanMember() && !config.disableIfClanMember())
				{
					color = config.getFriendColor();
				}
				else if (!player.isClanMember())
				{
					color = config.getFriendColor();
				}
			}

			if (color != null)
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
