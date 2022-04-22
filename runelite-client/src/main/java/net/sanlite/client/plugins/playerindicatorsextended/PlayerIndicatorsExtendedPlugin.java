/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2019, Jajack
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.sanlite.client.plugins.playerindicatorsextended;

import com.google.inject.Provides;
import lombok.Value;
import net.runelite.api.*;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.Notifier;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.game.ChatIconManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ColorUtil;
import net.runelite.client.util.Text;
import net.sanlite.client.game.SafeDeathPvpRegions;

import javax.inject.Inject;
import java.awt.*;
import java.util.List;

import static net.runelite.api.FriendsChatRank.UNRANKED;
import static net.runelite.api.MenuAction.*;

@PluginDescriptor(
	name = "Player Indicators Extended",
	description = "Highlight players on-screen and/or on the minimap",
	tags = {"highlight", "minimap", "overlay", "players", "friend", "finder", "offline", "pvp", "name", "notifications", "sanlite"},
	conflicts = "Player Indicators",
	enabledByDefault = false
)
public class PlayerIndicatorsExtendedPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private PlayerIndicatorsExtendedConfig config;

	@Inject
	private PlayerIndicatorsExtendedOverlay playerIndicatorsOverlay;

	@Inject
	private PlayerIndicatorsExtendedTileOverlay playerIndicatorsTileOverlay;

	@Inject
	private PlayerIndicatorsExtendedMinimapOverlay playerIndicatorsMinimapOverlay;

	@Inject
	private PlayerIndicatorsExtendedService playerIndicatorsService;

	@Inject
	private Client client;

	@Inject
	private ChatIconManager chatIconManager;

	@Inject
	private Notifier notifier;

	private int lastPlayerSpawnNotificationGameTick = -1;
	private List<String> ignoredPlayerNames;

	@Provides
	PlayerIndicatorsExtendedConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PlayerIndicatorsExtendedConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(playerIndicatorsOverlay);
		overlayManager.add(playerIndicatorsTileOverlay);
		overlayManager.add(playerIndicatorsMinimapOverlay);
		ignoredPlayerNames = getIgnoredPlayerNames();
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(playerIndicatorsOverlay);
		overlayManager.remove(playerIndicatorsTileOverlay);
		overlayManager.remove(playerIndicatorsMinimapOverlay);
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged configChanged)
	{
		if (configChanged.getGroup().equals("playerindicators") && configChanged.getKey().equals("ignoredPlayerNames"))
		{
			ignoredPlayerNames = getIgnoredPlayerNames();
		}
	}

	private List<String> getIgnoredPlayerNames()
	{
		return Text.fromCSV(config.getIgnoredPlayerNames());
	}

	@Subscribe
	public void onClientTick(ClientTick clientTick)
	{
		if (client.isMenuOpen())
		{
			return;
		}

		MenuEntry[] menuEntries = client.getMenuEntries();

		for (MenuEntry entry : menuEntries)
		{
			MenuAction type = entry.getType();

			if (type == WALK
					|| type == WIDGET_TARGET_ON_PLAYER
					|| type == ITEM_USE_ON_PLAYER
					|| type == PLAYER_FIRST_OPTION
					|| type == PLAYER_SECOND_OPTION
					|| type == PLAYER_THIRD_OPTION
					|| type == PLAYER_FOURTH_OPTION
					|| type == PLAYER_FIFTH_OPTION
					|| type == PLAYER_SIXTH_OPTION
					|| type == PLAYER_SEVENTH_OPTION
					|| type == PLAYER_EIGTH_OPTION
					|| type == RUNELITE_PLAYER)
			{
				Player[] players = client.getCachedPlayers();
				Player player = null;

				int identifier = entry.getIdentifier();

				// 'Walk here' identifiers are offset by 1 because the default
				// identifier for this option is 0, which is also a player index.
				if (type == WALK)
				{
					identifier--;
				}

				if (identifier >= 0 && identifier < players.length)
				{
					player = players[identifier];
				}

				if (player == null)
				{
					continue;
				}

				Decorations decorations = getDecorations(player);

				if (decorations == null)
				{
					continue;
				}

				String oldTarget = entry.getTarget();
				String newTarget = decorateTarget(oldTarget, decorations);

				entry.setTarget(newTarget);
			}
		}
	}

	private Decorations getDecorations(Player player)
	{
		int image = -1;
		final String playerName = player.getName();
		final boolean isFriendsChatMember = player.isFriendsChatMember();

		// Friends
		if (config.highlightFriends() && config.colorFriendPlayerMenu() && player.isFriend())
		{
			if (config.disableFriendHighlightIfFriendsChatMember() && isFriendsChatMember)
			{
				return createFriendsChatDecorations(player);
			}

			return new Decorations(image, config.getFriendColor());
		}

		// Appear offline friends
		if (config.highlightOfflineFriends() && config.colorFriendPlayerMenu() && client.isFriended(playerName, false))
		{
			if (config.disableFriendHighlightIfFriendsChatMember() && isFriendsChatMember)
			{
				return createFriendsChatDecorations(player);
			}

			return new Decorations(image, config.getFriendColor());
		}

		// Custom list one
		if (config.highlightCustomListOne() && config.colorListOnePlayerMenu() &&
				isNameInCsvList(playerName, config.getListOneNames().toLowerCase()))
		{
			return new Decorations(image, config.getListOneColor());
		}

		// Custom list two
		if (config.highlightCustomListTwo() && config.colorListTwoPlayerMenu() &&
				isNameInCsvList(playerName, config.getListTwoNames().toLowerCase()))
		{
			return new Decorations(image, config.getListTwoColor());
		}

		// Custom list three
		if (config.highlightCustomListThree() && config.colorListThreePlayerMenu() &&
				isNameInCsvList(playerName, config.getListThreeNames().toLowerCase()))
		{
			return new Decorations(image, config.getListThreeColor());
		}

		// Custom list four
		if (config.highlightCustomListFour() && config.colorListFourPlayerMenu() &&
				isNameInCsvList(playerName, config.getListFourNames().toLowerCase()))
		{
			return new Decorations(image, config.getListFourColor());
		}

		// Custom list five
		if (config.highlightCustomListFive() && config.colorListFivePlayerMenu() &&
				isNameInCsvList(playerName, config.getListFiveNames().toLowerCase()))
		{
			return new Decorations(image, config.getListFiveColor());
		}

		// Friends chat members
		if (config.highlightFriendsChatMembers() && config.colorFriendsChatMemberPlayerMenu() && isFriendsChatMember)
		{
			return createFriendsChatDecorations(player);
		}

		final Player localPlayer = client.getLocalPlayer();
		if (localPlayer == null || localPlayer == player)
		{
			return null;
		}

		// Team-cape members
		if (config.highlightTeamMembers() && config.colorTeamMemberPlayerMenu() && localPlayer.getTeam() > 0 &&
				localPlayer.getTeam() == player.getTeam())
		{
			return new Decorations(image, config.getTeamMemberColor());
		}

		// Other players
		if (config.highlightOthers() && config.colorOthersPlayerMenu() && !isFriendsChatMember)
		{
			return new Decorations(image, config.getOthersColor());
		}

		return null;
	}

	private String decorateTarget(String oldTarget, Decorations decorations)
	{
		String newTarget = oldTarget;

		if (decorations.getColor() != null)
		{
			// strip out existing <col...
			int idx = oldTarget.indexOf('>');
			if (idx != -1)
			{
				newTarget = oldTarget.substring(idx + 1);
			}

			newTarget = ColorUtil.prependColorTag(newTarget, decorations.getColor());
		}

		if (decorations.getImage() != -1)
		{
			newTarget = "<img=" + decorations.getImage() + ">" + newTarget;
		}

		return newTarget;
	}

	@Value
	private static class Decorations
	{
		int image;
		Color color;
	}

	private Decorations createFriendsChatDecorations(Player player)
	{
		int image = -1;
		if (config.showFriendsChatRanks())
		{
			FriendsChatRank rank = playerIndicatorsService.getFriendsChatRank(player);
			if (rank != UNRANKED)
			{
				image = chatIconManager.getIconNumber(rank);
			}
		}

		return new Decorations(image, config.getFriendsChatMemberColor());
	}

	@Subscribe
	public void onPlayerSpawned(PlayerSpawned event)
	{
		checkPlayerSpawned(event);
	}

	private void checkPlayerSpawned(PlayerSpawned event)
	{
		Player player = event.getPlayer();
		if (player == null || player == client.getLocalPlayer() || !config.notifyOnOtherPlayerSpawned() ||
				(config.notifyOnlyOnSkulledPlayers() && !player.isSkulled()))
			return;

		PlayerIndicatorType playerIndicatorType = playerIndicatorsService.getPlayerIndicatorType(player);
		if (playerIndicatorType == null ||
			playerIndicatorType.equals(PlayerIndicatorType.FRIENDS_CHAT) && !config.notifyFriendsChatMembersSpawning() ||
			playerIndicatorType.equals(PlayerIndicatorType.FRIEND) && !config.notifyFriendsSpawning())
			return;

		// Only send notifications in PvP zones
		if (client.getVarbitValue(Varbits.PVP_SPEC_ORB) != 1 && client.getVarbitValue(Varbits.IN_WILDERNESS) != 1 &&
				client.getWorldType().stream().noneMatch(x -> x == WorldType.DEADMAN) && !config.notifyInPvpSafezone())
			return;

		// Only send notifications if player is attackable
		if (config.notifyOnlyAttackablePlayers() && !isPlayerAttackable(player))
		{
			return;
		}

		// Do not trigger if the region is a safe death PvP zone (e.g. Duel Arena)
		if (SafeDeathPvpRegions.inSafeDeathPvpArea(client) && !config.disableSafeDeathPvpAreaBlacklist())
			return;

		// Check if enough time has expired since the last notification
		if (client.getTickCount() < lastPlayerSpawnNotificationGameTick + config.delayBetweenPlayerSpawnedNotifications())
			return;

		if (ignoredPlayerNames.contains(player.getName()))
			return;

		notifier.notify("[" + player.getName() + "] has spawned!");
		lastPlayerSpawnNotificationGameTick = client.getTickCount();
	}

	private boolean isPlayerAttackable(Player player)
	{
		if (client.getLocalPlayer() == null)
		{
			return false;
		}

		int ownCombatLevel = client.getLocalPlayer().getCombatLevel();
		int lowestAttackable = ownCombatLevel;
		int highestAttackable = ownCombatLevel;

		if (WorldType.isPvpWorld(client.getWorldType()))
		{
			lowestAttackable -= 15;
			highestAttackable += 15;
		}

		if (client.getVarbitValue(Varbits.IN_WILDERNESS) == 1)
		{
			Widget levelRangeWidget = client.getWidget(WidgetInfo.PVP_WILDERNESS_LEVEL);
			if (levelRangeWidget == null)
				return false;

			int wildLevel = Integer.parseInt(levelRangeWidget.getText().split(" ")[1].split("<")[0]);
			lowestAttackable -= wildLevel;
			highestAttackable += wildLevel;
		}

		return player.getCombatLevel() >= lowestAttackable && player.getCombatLevel() <= highestAttackable;
	}

	private boolean isNameInCsvList(String playerName, String csvNamesList)
	{
		return Text.fromCSV(csvNamesList).contains(Text.standardize(playerName));
	}
}
