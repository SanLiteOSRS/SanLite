/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
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
package net.runelite.mixins;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.*;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.common.primitives.Doubles;
import net.runelite.api.*;

import static net.runelite.api.MenuAction.*;
import static net.runelite.api.Perspective.LOCAL_TILE_SIZE;
import static net.runelite.mixins.CameraMixin.*;

import net.runelite.api.Deque;
import net.runelite.api.clan.ClanChannel;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanSettings;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.*;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.vars.AccountType;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetConfig;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.api.widgets.WidgetType;
import net.runelite.rs.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Mixin(RSClient.class)
public abstract class RSClientMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	public static Logger rl$logger = LoggerFactory.getLogger("injected-client");

	@Inject
	@javax.inject.Inject
	private Callbacks callbacks;

	@Inject
	private DrawCallbacks drawCallbacks;

	@Inject
	private static int tickCount;

	@Inject
	private static boolean interpolatePlayerAnimations;

	@Inject
	private static boolean interpolateNpcAnimations;

	@Inject
	private static boolean interpolateObjectAnimations;

	@Inject
	private static boolean interpolateWidgetAnimations;

	@Inject
	private static RSPlayer[] oldPlayers = new RSPlayer[2048];

	@Inject
	private static int itemPressedDurationBuffer;

	@Inject
	private static int inventoryDragDelay;

	@Inject
	private static int oldMenuEntryCount;

	@Inject
	private static RSTileItem lastItemDespawn;

	@Inject
	private static boolean invertPitch;

	@Inject
	private static boolean invertYaw;

	@Inject
	private boolean gpu;

	@Inject
	private static boolean oldIsResized;

	@Inject
	static int skyboxColor;

	@Inject
	private final Cache<Integer, RSEnumComposition> enumCache = CacheBuilder.newBuilder()
		.maximumSize(64)
		.build();

	@Inject
	private static boolean allWidgetsAreOpTargetable = false;

	@Inject
	public static int viewportColor;

	@Inject
	public static boolean unlockedFps;

	@Inject
	public static double tmpCamAngleY;

	@Inject
	public static double tmpCamAngleX;

	@Inject
	public long lastNanoTime;

	@Inject
	public long delayNanoTime;

	@Inject
	private List<String> outdatedScripts = new ArrayList<>();

	@Inject
	private static ArrayList<WidgetItem> widgetItems = new ArrayList<>();

	@Inject
	private static ArrayList<Widget> hiddenWidgets = new ArrayList<>();

	@Inject
	private static final RSRuneLiteMenuEntry[] rl$menuEntries = new RSRuneLiteMenuEntry[500];

	@Inject
	private static int tmpMenuOptionsCount;

	@Inject
	public RSEvictingDualNodeHashTable tmpModelDataCache = newEvictingDualNodeHashTable(16);

	@Inject
	public static RSArchive[] archives = new RSArchive[21];

	@Inject
	@Override
	public void setAllWidgetsAreOpTargetable(boolean yes)
	{
		allWidgetsAreOpTargetable = yes;
	}

	@Inject
	public RSClientMixin()
	{
	}

	@Inject
	@Override
	public String getBuildID()
	{
		return "SanLite";
	}

	@Inject
	@Override
	public Callbacks getCallbacks()
	{
		return callbacks;
	}

	@Inject
	@Override
	public DrawCallbacks getDrawCallbacks()
	{
		return drawCallbacks;
	}

	@Inject
	@Override
	public void setDrawCallbacks(DrawCallbacks drawCallbacks)
	{
		this.drawCallbacks = drawCallbacks;
	}

	@Inject
	@Override
	public Logger getLogger()
	{
		return rl$logger;
	}

	@Inject
	@Override
	public boolean isInterpolatePlayerAnimations()
	{
		return interpolatePlayerAnimations;
	}

	@Inject
	@Override
	public void setInterpolatePlayerAnimations(boolean interpolate)
	{
		interpolatePlayerAnimations = interpolate;
	}

	@Inject
	@Override
	public boolean isInterpolateNpcAnimations()
	{
		return interpolateNpcAnimations;
	}

	@Inject
	@Override
	public void setInterpolateNpcAnimations(boolean interpolate)
	{
		interpolateNpcAnimations = interpolate;
	}

	@Inject
	@Override
	public boolean isInterpolateObjectAnimations()
	{
		return interpolateObjectAnimations;
	}

	@Inject
	@Override
	public void setInterpolateObjectAnimations(boolean interpolate)
	{
		interpolateObjectAnimations = interpolate;
	}

	@Inject
	@Override
	public boolean isInterpolateWidgetAnimations()
	{
		return interpolateWidgetAnimations;
	}

	@Inject
	@Override
	public void setInterpolateWidgetAnimations(boolean interpolate)
	{
		interpolateWidgetAnimations = interpolate;
	}

	@Inject
	@Override
	public void setInventoryDragDelay(int delay)
	{
		inventoryDragDelay = delay;
	}

	@Inject
	@Override
	public AccountType getAccountType()
	{
		int varbit = getVarbitValue(Varbits.ACCOUNT_TYPE);

		switch (varbit)
		{
			case 1:
				return AccountType.IRONMAN;
			case 2:
				return AccountType.ULTIMATE_IRONMAN;
			case 3:
				return AccountType.HARDCORE_IRONMAN;
			case 4:
				return AccountType.GROUP_IRONMAN;
			case 5:
				return AccountType.HARDCORE_GROUP_IRONMAN;
		}

		return AccountType.NORMAL;
	}

	@Inject
	@Override
	public Tile getSelectedSceneTile()
	{
		int tileX = getSelectedSceneTileX();
		int tileY = getSelectedSceneTileY();

		if (tileX == -1 || tileY == -1)
		{
			return null;
		}

		return getScene().getTiles()[getPlane()][tileX][tileY];
	}

	@Inject
	@Override
	public List<Player> getPlayers()
	{
		int validPlayerIndexes = getPlayerIndexesCount();
		int[] playerIndexes = getPlayerIndices();
		Player[] cachedPlayers = getCachedPlayers();
		List<Player> players = new ArrayList<Player>(validPlayerIndexes);

		for (int i = 0; i < validPlayerIndexes; ++i)
		{
			players.add(cachedPlayers[playerIndexes[i]]);
		}

		return players;
	}

	@Inject
	@Override
	public List<NPC> getNpcs()
	{
		int validNpcIndexes = getNpcIndexesCount();
		int[] npcIndexes = getNpcIndices();
		NPC[] cachedNpcs = getCachedNPCs();
		List<NPC> npcs = new ArrayList<NPC>(validNpcIndexes);

		for (int i = 0; i < validNpcIndexes; ++i)
		{
			npcs.add(cachedNpcs[npcIndexes[i]]);
		}

		return npcs;
	}

	@Inject
	@Override
	public int getBoostedSkillLevel(Skill skill)
	{
		int[] boostedLevels = getBoostedSkillLevels();
		return boostedLevels[skill.ordinal()];
	}

	@Inject
	@Override
	public int getRealSkillLevel(Skill skill)
	{
		int[] realLevels = getRealSkillLevels();
		return realLevels[skill.ordinal()];
	}

	@Inject
	@Override
	public int getTotalLevel()
	{
		int totalLevel = 0;

		int[] realLevels = client.getRealSkillLevels();
		int lastSkillIdx = Skill.CONSTRUCTION.ordinal();

		for (int i = 0; i < realLevels.length; i++)
		{
			if (i <= lastSkillIdx)
			{
				totalLevel += realLevels[i];
			}
		}

		return totalLevel;
	}

	@Inject
	public MessageNode addChatMessage(ChatMessageType type, String name, String message, String sender, boolean postEvent)
	{
		assert this.isClientThread() : "addChatMessage must be called on client thread";

		ChatMessageType tmpType = type;
		String tmpMessage = message;

		if (type == ChatMessageType.CLAN_GIM_CHAT)
		{
			tmpType = ChatMessageType.CLAN_CHAT;
			tmpMessage = "|" + message;
		}
		else if (type == ChatMessageType.CLAN_GIM_MESSAGE)
		{
			tmpType = ChatMessageType.CLAN_MESSAGE;
			tmpMessage = "|" + message;
		}

		copy$addChatMessage(tmpType.getType(), name, tmpMessage, sender);

		Logger logger = client.getLogger();
		if (logger.isDebugEnabled())
		{
			logger.debug("Chat message type {}: {}", type.name(), message);
		}

		// Get the message node which was added
		@SuppressWarnings("unchecked") Map<Integer, RSChatChannel> chatLineMap = client.getChatLineMap();
		RSChatChannel chatLineBuffer = chatLineMap.get(type.getType());
		MessageNode messageNode = chatLineBuffer.getLines()[0];

		if (postEvent)
		{
			final ChatMessage chatMessage = new ChatMessage(messageNode, type, name, message, sender, messageNode.getTimestamp());
			client.getCallbacks().post(chatMessage);
		}

		return messageNode;
	}

	@Inject
	@Override
	public MessageNode addChatMessage(ChatMessageType type, String name, String message, String sender)
	{
		return addChatMessage(type, name, message, sender, true);
	}

	@Inject
	@Override
	public GameState getGameState()
	{
		return GameState.of(getRSGameState());
	}

	@Inject
	public void setGameState(int state)
	{
		assert this.isClientThread() : "setGameState must be called on client thread";
		client.setRSGameState(state);
	}

	@Inject
	@Override
	public void setGameState(GameState gameState)
	{
		assert this.isClientThread() : "setGameState must be called on client thread";
		setGameState(gameState.getState());
	}

	@Inject
	@Override
	public Point getMouseCanvasPosition()
	{
		return new Point(getMouseX(), getMouseY());
	}

	@Inject
	@Override
	public Widget[] getWidgetRoots()
	{
		int topGroup = getTopLevelInterfaceId();
		if (topGroup == -1)
		{
			return new Widget[]{};
		}

		List<Widget> widgets = new ArrayList<Widget>();
		for (RSWidget widget : getWidgets()[topGroup])
		{
			if (widget != null && widget.getRSParentId() == -1)
			{
				widgets.add(widget);
			}
		}
		return widgets.toArray(new Widget[widgets.size()]);
	}

	@Inject
	@Override
	public Widget getWidget(WidgetInfo widget)
	{
		int groupId = widget.getGroupId();
		int childId = widget.getChildId();

		return getWidget(groupId, childId);
	}

	@Inject
	@Override
	public Widget getWidget(int id)
	{
		return getWidget(WidgetInfo.TO_GROUP(id), WidgetInfo.TO_CHILD(id));
	}

	@Inject
	@Override
	public RSWidget[] getGroup(int groupId)
	{
		RSWidget[][] widgets = getWidgets();

		if (widgets == null || groupId < 0 || groupId >= widgets.length || widgets[groupId] == null)
		{
			return null;
		}

		return widgets[groupId];
	}

	@Inject
	@Override
	public Widget getWidget(int groupId, int childId)
	{
		RSWidget[][] widgets = getWidgets();

		if (widgets == null || widgets.length <= groupId)
		{
			return null;
		}

		RSWidget[] childWidgets = widgets[groupId];
		if (childWidgets == null || childWidgets.length <= childId)
		{
			return null;
		}

		return childWidgets[childId];
	}

	@Inject
	@Override
	public int getVar(VarPlayer varPlayer)
	{
		int[] varps = getVarps();
		return varps[varPlayer.getId()];
	}

	@Inject
	public int getVarpValue(int[] varps, int varpId)
	{
		return varps[varpId];
	}

	@Inject
	@Override
	public int getVarpValue(int varpId)
	{
		return getVarpValue(getVarps(), varpId);
	}

	@Inject
	@Override
	public boolean isPrayerActive(Prayer prayer)
	{
		return getVar(prayer.getVarbit()) == 1;
	}

	/**
	 * Returns the local player's current experience in the specified
	 * {@link Skill}.
	 *
	 * @param skill the {@link Skill} to retrieve the experience for
	 * @return the local player's current experience in the specified
	 * {@link Skill}, or -1 if the {@link Skill} isn't valid
	 */
	@Inject
	@Override
	public int getSkillExperience(Skill skill)
	{
		int[] experiences = getSkillExperiences();

		if (skill == Skill.OVERALL)
		{
			client.getLogger().debug("getSkillExperience called for {}!", skill);
			return (int) getOverallExperience();
		}
		// I'm not certain exactly how needed this is, but if the Skill enum is updated in the future
		// to hold something else that's not reported it'll save us from an ArrayIndexOutOfBoundsException.
		int idx = skill.ordinal();
		return idx >= experiences.length ? -1 : experiences[idx];
	}

	@Inject
	@Override
	public long getOverallExperience()
	{
		int[] experiences = getSkillExperiences();

		long totalExperience = 0L;

		for (int experience : experiences)
		{
			totalExperience += experience;
		}

		return totalExperience;
	}

	@Inject
	@Override
	public void refreshChat()
	{
		setChatCycle(getCycleCntr());
	}

	@Inject
	public static RSRuneLiteMenuEntry newBareRuneliteMenuEntry()
	{
		// Implementation is done with raw injection
		throw new NotImplementedException();
	}

	@Inject
	public static RSRuneLiteMenuEntry newRuneliteMenuEntry(int idx)
	{
		// Implementation is done with raw injection
		throw new NotImplementedException();
	}

	@Inject
	@Override
	public MenuEntry createMenuEntry(int idx)
	{
		if (client.getMenuOptionCount() >= 500)
		{
			throw new IllegalStateException();
		}

		if (idx < 0)
		{
			idx = client.getMenuOptionCount() + idx + 1;
			if (idx < 0)
			{
				throw new IllegalArgumentException();
			}
		}

		RSRuneLiteMenuEntry menuEntry;
		if (idx < client.getMenuOptionCount())
		{
			RSRuneLiteMenuEntry tmpEntry = rl$menuEntries[client.getMenuOptionCount()];
			if (tmpEntry == null)
			{
				tmpEntry = rl$menuEntries[client.getMenuOptionCount()] = newRuneliteMenuEntry(client.getMenuOptionCount());
			}

			for (int i = client.getMenuOptionCount(); i > idx; rl$menuEntries[i].setIdx(i--))
			{
				client.getMenuOptions()[i] = client.getMenuOptions()[i - 1];
				client.getMenuTargets()[i] = client.getMenuTargets()[i - 1];
				client.getMenuIdentifiers()[i] = client.getMenuIdentifiers()[i - 1];
				client.getMenuOpcodes()[i] = client.getMenuOpcodes()[i - 1];
				client.getMenuArguments1()[i] = client.getMenuArguments1()[i - 1];
				client.getMenuArguments2()[i] = client.getMenuArguments2()[i - 1];
				client.getMenuForceLeftClick()[i] = client.getMenuForceLeftClick()[i - 1];

				rl$menuEntries[i] = rl$menuEntries[i - 1];
			}

			client.setMenuOptionCount(client.getMenuOptionCount() + 1);
			tmpMenuOptionsCount = client.getMenuOptionCount();

			menuEntry = tmpEntry;
			rl$menuEntries[idx] = tmpEntry;

			tmpEntry.setIdx(idx);
		}
		else
		{
			if (idx != client.getMenuOptionCount())
			{
				throw new IllegalArgumentException();
			}

			menuEntry = rl$menuEntries[client.getMenuOptionCount()];

			if (menuEntry == null)
			{
				menuEntry = rl$menuEntries[client.getMenuOptionCount()] = newRuneliteMenuEntry(client.getMenuOptionCount());
			}

			client.setMenuOptionCount(client.getMenuOptionCount() + 1);
			tmpMenuOptionsCount = client.getMenuOptionCount();
		}

		menuEntry.setOption("");
		menuEntry.setTarget("");
		menuEntry.setType(MenuAction.RUNELITE);
		menuEntry.setIdentifier(0);
		menuEntry.setParam0(0);
		menuEntry.setParam1(0);
		menuEntry.setConsumer(null);
		return menuEntry;
	}

	@Inject
	@Override
	public MenuEntry[] getMenuEntries()
	{
		return Arrays.copyOf(rl$menuEntries, client.getMenuOptionCount());
	}

	@Inject
	@Override
	public void setMenuEntries(MenuEntry[] menuEntries)
	{
		boolean isTempMenuActionLastOption = false;
		if (client.getTempMenuAction() != null && client.getMenuOptionCount() > 0)
		{
			isTempMenuActionLastOption = client.getTempMenuAction().getParam0() == client.getMenuArguments1()[client.getMenuOptionCount() - 1] &&
				client.getTempMenuAction().getParam1() == client.getMenuArguments2()[client.getMenuOptionCount() - 1] &&
				client.getTempMenuAction().getOption().equals(client.getMenuOptions()[client.getMenuOptionCount() - 1]) &&
				client.getTempMenuAction().getIdentifier() == client.getMenuIdentifiers()[client.getMenuOptionCount() - 1] &&
				client.getTempMenuAction().getOpcode() == client.getMenuOpcodes()[client.getMenuOptionCount() - 1];
		}

		for (int i = 0; i < menuEntries.length; ++i)
		{
			RSRuneLiteMenuEntry menuEntry = (RSRuneLiteMenuEntry) menuEntries[i];
			if (menuEntry.getIdx() != i)
			{
				sortMenuEntries(menuEntry.getIdx(), i);
			}
		}

		client.setMenuOptionCount(menuEntries.length);
		tmpMenuOptionsCount = menuEntries.length;

		if (isTempMenuActionLastOption && client.getMenuOptionCount() > 0)
		{
			assert client.getTempMenuAction() != null;
			client.getTempMenuAction().setParam0(client.getMenuArguments1()[client.getMenuOptionCount() - 1]);
			client.getTempMenuAction().setParam1(client.getMenuArguments2()[client.getMenuOptionCount() - 1]);
			client.getTempMenuAction().setOption(client.getMenuOptions()[client.getMenuOptionCount() - 1]);
			client.getTempMenuAction().setIdentifier(client.getMenuIdentifiers()[client.getMenuOptionCount() - 1]);
			client.getTempMenuAction().setOpcode(client.getMenuOpcodes()[client.getMenuOptionCount() - 1]);
		}
	}

	@Inject
	public static void sortMenuEntries(int left, int right)
	{
		String menuOption = client.getMenuOptions()[left];
		client.getMenuOptions()[left] = client.getMenuOptions()[right];
		client.getMenuOptions()[right] = menuOption;

		String menuTarget = client.getMenuTargets()[left];
		client.getMenuTargets()[left] = client.getMenuTargets()[right];
		client.getMenuTargets()[right] = menuTarget;

		int menuIdentifier = client.getMenuIdentifiers()[left];
		client.getMenuIdentifiers()[left] = client.getMenuIdentifiers()[right];
		client.getMenuIdentifiers()[right] = menuIdentifier;

		int menuOpcode = client.getMenuOpcodes()[left];
		client.getMenuOpcodes()[left] = client.getMenuOpcodes()[right];
		client.getMenuOpcodes()[right] = menuOpcode;

		int menuArguments1 = client.getMenuArguments1()[left];
		client.getMenuArguments1()[left] = client.getMenuArguments1()[right];
		client.getMenuArguments1()[right] = menuArguments1;

		int menuArgument2 = client.getMenuArguments2()[left];
		client.getMenuArguments2()[left] = client.getMenuArguments2()[right];
		client.getMenuArguments2()[right] = menuArgument2;

		boolean menuForceLeftClick = client.getMenuForceLeftClick()[left];
		client.getMenuForceLeftClick()[left] = client.getMenuForceLeftClick()[right];
		client.getMenuForceLeftClick()[right] = menuForceLeftClick;

		assert rl$menuEntries[left].getIdx() == left;
		assert rl$menuEntries[right].getIdx() == right;

		RSRuneLiteMenuEntry tmpEntry = rl$menuEntries[left];
		rl$menuEntries[left] = rl$menuEntries[right];
		rl$menuEntries[right] = tmpEntry;

		rl$menuEntries[left].setIdx(left);
		rl$menuEntries[right].setIdx(right);
	}

	@Inject
	public static void swapMenuEntries(int idx)
	{
		RSRuneLiteMenuEntry rl$menuEntry1 = rl$menuEntries[idx];
		RSRuneLiteMenuEntry rl$menuEntry2 = rl$menuEntries[idx + 1];

		assert rl$menuEntry1.getIdx() == idx;
		assert rl$menuEntry2.getIdx() == idx + 1;

		rl$menuEntries[idx] = rl$menuEntry2;
		rl$menuEntries[idx + 1] = rl$menuEntry1;

		rl$menuEntry1.setIdx(idx + 1);
		rl$menuEntry2.setIdx(idx);
	}

	@FieldHook("menuOptionsCount")
	@Inject
	public static void onMenuOptionsChanged(int idx)
	{
		int tmpOptionsCount = tmpMenuOptionsCount;
		int optionCount = client.getMenuOptionCount();

		tmpMenuOptionsCount = optionCount;

		if (optionCount < tmpOptionsCount)
		{
			for (int i = optionCount; i < tmpOptionsCount; ++i)
			{
				RSRuneLiteMenuEntry entry = rl$menuEntries[i];
				if (entry == null)
				{
					client.getLogger().error("Unexpected null menu entry. optionCount: {}, tmpOptionsCount:{}, index: {}",
							optionCount, tmpOptionsCount, i);
				}
				rl$menuEntries[i].setConsumer(null);
			}
		}
		else if (optionCount == tmpOptionsCount + 1)
		{
			String menuOption = client.getMenuOptions()[tmpOptionsCount];
			String menuTarget = client.getMenuTargets()[tmpOptionsCount];
			int menuOpcode = client.getMenuOpcodes()[tmpOptionsCount];
			int menuIdentifier = client.getMenuIdentifiers()[tmpOptionsCount];
			int menuArgument1 = client.getMenuArguments1()[tmpOptionsCount];
			int menuArgument2 = client.getMenuArguments2()[tmpOptionsCount];
			if (rl$menuEntries[tmpOptionsCount] == null)
			{
				rl$menuEntries[tmpOptionsCount] = newRuneliteMenuEntry(tmpOptionsCount);
			}
			else
			{
				rl$menuEntries[tmpOptionsCount].setConsumer(null);
			}

			MenuEntryAdded event = new MenuEntryAdded(
				menuOption,
				menuTarget,
				menuOpcode,
				menuIdentifier,
				menuArgument1,
				menuArgument2
			);
			client.getCallbacks().post(event);
		}
	}

	@Inject
	@Override
	public Projectile createProjectile(int id, int plane, int startX, int startY, int startZ, int startCycle, int endCycle, int slope, int startHeight, int endHeight, Actor target, int targetX, int targetY)
	{
		int targetIndex = 0;
		if (target instanceof RSNPC)
		{
			targetIndex = ((RSNPC)target).getIndex() + 1;
		}
		else if (target instanceof RSPlayer)
		{
			targetIndex = -(((RSPlayer)target).getPlayerId() + 1);
		}

		RSProjectile projectile = client.newProjectile(id, plane, startX, startY, startZ, startCycle, endCycle, slope, startHeight, targetIndex, endHeight);
		projectile.setDestination(targetX, targetY, Perspective.getTileHeight(client, new LocalPoint(targetX, targetY), client.getPlane()), startCycle + client.getGameCycle());

		return projectile;
	}

	@Inject
	@Override
	public Deque<Projectile> getProjectiles()
	{
		return this.getProjectilesDeque();
	}

	@Inject
	@Override
	public Deque<GraphicsObject> getGraphicsObjects()
	{
		return this.getGraphicsObjectDeque();
	}

	@Inject
	@Override
	public void setModIcons(IndexedSprite[] modIcons)
	{
		setRSModIcons((RSIndexedSprite[]) modIcons);
	}

	@Inject
	@Override
	@Nullable
	public LocalPoint getLocalDestinationLocation()
	{
		int sceneX = getDestinationX();
		int sceneY = getDestinationY();
		if (sceneX != 0 && sceneY != 0)
		{
			return LocalPoint.fromScene(sceneX, sceneY);
		}
		return null;
	}

	@Inject
	@Override
	public void changeMemoryMode(boolean lowMemory)
	{
		setLowMemory(lowMemory);
		setSceneLowMemory(lowMemory);
		setAudioHighMemory(true);
		setObjectDefinitionLowDetail(lowMemory);
		if (getGameState() == GameState.LOGGED_IN)
		{
			setGameState(GameState.LOADING);
		}
	}

	@Inject
	@Override
	public RSItemContainer getItemContainer(InventoryID inventory)
	{
		RSNodeHashTable itemContainers = getItemContainers();
		return (RSItemContainer) itemContainers.get(inventory.getId());
	}

	@Inject
	@Override
	public RSItemContainer getItemContainer(int id)
	{
		for (Object itemContainer : getItemContainers())
		{
			if (((RSItemContainer) itemContainer).getId() == id)
			{
				return ((RSItemContainer) itemContainer);
			}
		}

		return null;
	}

	@Inject
	@Override
	public boolean isFriended(String name, boolean mustBeLoggedIn)
	{
		RSUsername rsName = createName(name, getLoginType());
		return getFriendManager().isFriended(rsName, mustBeLoggedIn);
	}

	@Inject
	@Override
	public FriendContainer getFriendContainer()
	{
		final RSFriendSystem friendManager = getFriendManager();
		if (friendManager == null)
		{
			return null;
		}

		return friendManager.getFriendContainer();
	}

	@Inject
	@Override
	public NameableContainer<Ignore> getIgnoreContainer()
	{
		final RSFriendSystem friendManager = getFriendManager();
		if (friendManager == null)
		{
			return null;
		}

		return friendManager.getIgnoreContainer();
	}

	@FieldHook("isDraggingWidget")
	@Inject
	public static void draggingWidgetChanged(int idx)
	{
		DraggingWidgetChanged draggingWidgetChanged = new DraggingWidgetChanged();
		draggingWidgetChanged.setDraggingWidget(client.isDraggingWidget());
		client.getCallbacks().post(draggingWidgetChanged);
	}

	@Inject
	public RSSpritePixels createItemSprite(int itemId, int quantity, int border, int shadowColor, int stackable, boolean noted)
	{
		assert isClientThread() : "createItemSprite must be called on client thread";
		return createRSItemSprite(itemId, quantity, border, shadowColor, stackable, noted);
	}

	@Inject
	@Override
	public SpritePixels createItemSprite(int itemId, int quantity, int border, int shadowColor, int stackable, boolean noted, int scale)
	{
		assert isClientThread() : "createItemSprite must be called on client thread";

		int zoom = get3dZoom();
		set3dZoom(scale);
		try
		{
			return createItemSprite(itemId, quantity, border, shadowColor, stackable, noted);
		}
		finally
		{
			set3dZoom(zoom);
		}
	}

	@Copy("runWidgetOnLoadListener")
	@Replace("runWidgetOnLoadListener")
	@SuppressWarnings("InfiniteRecursion")
	public static void copy$runWidgetOnLoadListener(int groupId)
	{
		copy$runWidgetOnLoadListener(groupId);

		RSWidget[][] widgets = client.getWidgets();
		boolean loaded = widgets != null && widgets[groupId] != null;

		if (loaded)
		{
			WidgetLoaded event = new WidgetLoaded();
			event.setGroupId(groupId);
			client.getCallbacks().post(event);
		}
	}

	@FieldHook("itemDragDuration")
	@Inject
	public static void itemPressedDurationChanged(int idx)
	{
		if (client.getItemPressedDuration() > 0)
		{
			itemPressedDurationBuffer++;
			if (itemPressedDurationBuffer >= inventoryDragDelay)
			{
				client.setItemPressedDuration(itemPressedDurationBuffer);
			}
			else
			{
				client.setItemPressedDuration(0);
			}
		}
		else
		{
			itemPressedDurationBuffer = 0;
		}
	}

	@FieldHook("changedSkills")
	@Inject
	public static void statChanged(int idx)
	{
		if (idx != -1)
		{
			int changedSkillIdx = idx - 1 & 31;
			int skillIdx = client.getChangedSkills()[changedSkillIdx];
			Skill[] skills = Skill.values();

			if (skillIdx >= 0 && skillIdx < skills.length - 1)
			{
				StatChanged statChanged = new StatChanged(
						skills[skillIdx],
						client.getSkillExperiences()[skillIdx],
						client.getRealSkillLevels()[skillIdx],
						client.getBoostedSkillLevels()[skillIdx]);

				client.getCallbacks().post(statChanged);
			}
		}
	}

	@FieldHook("playerMenuActions")
	@Inject
	public static void playerOptionsChanged(int idx)
	{
		// Reset the menu type
		MenuAction[] playerActions = {PLAYER_FIRST_OPTION, PLAYER_SECOND_OPTION, PLAYER_THIRD_OPTION, PLAYER_FOURTH_OPTION,
				PLAYER_FIFTH_OPTION, PLAYER_SIXTH_OPTION, PLAYER_SEVENTH_OPTION, PLAYER_EIGTH_OPTION};
		if (idx >= 0 && idx < playerActions.length)
		{
			MenuAction playerAction = playerActions[idx];
			client.getPlayerMenuTypes()[idx] = playerAction.getId();
		}

		PlayerMenuOptionsChanged optionsChanged = new PlayerMenuOptionsChanged();
		optionsChanged.setIndex(idx);
		client.getCallbacks().post(optionsChanged);
	}

	@FieldHook("gameState")
	@Inject
	public static void gameStateChanged(int idx)
	{
		GameState gameState = client.getGameState();
		GameStateChanged gameStateChange = new GameStateChanged();
		gameStateChange.setGameState(gameState);
		client.getCallbacks().post(gameStateChange);

		if (gameState == GameState.LOGGED_IN)
		{
			if (client.getLocalPlayer() == null)
			{
				return;
			}

			int plane = client.getPlane();
			RSScene scene = client.getScene();
			RSTile[][][] tiles = scene.getTiles();
			RSNodeDeque[][][] allItemDeque = client.getGroundItemDeque();
			RSNodeDeque[][] planeItems = allItemDeque[plane];

			for (int x = 0; x < 104; x++)
			{
				for (int y = 0; y < 104; y++)
				{
					RSNodeDeque itemDeque = planeItems[x][y];
					if (itemDeque != null)
					{
						RSTile tile = tiles[plane][x][y];
						RSNode head = itemDeque.getSentinel();

						for (RSNode current = head.getNext(); current != head; current = current.getNext())
						{
							RSTileItem item = (RSTileItem) current;
							item.setX(x);
							item.setY(y);
							ItemSpawned event = new ItemSpawned(tile, item);
							client.getCallbacks().post(event);
						}
					}
				}
			}
		}
	}


	@FieldHook("npcs")
	@Inject
	public static void cachedNPCsChanged(int idx)
	{
		RSNPC[] cachedNPCs = client.getCachedNPCs();
		if (idx < 0 || idx >= cachedNPCs.length)
		{
			return;
		}

		RSNPC npc = cachedNPCs[idx];
		if (npc != null)
		{
			npc.setIndex(idx);

			client.getCallbacks().postDeferred(new NpcSpawned(npc));
		}
	}

	@FieldHook("players")
	@Inject
	public static void cachedPlayersChanged(int idx)
	{
		RSPlayer[] cachedPlayers = client.getCachedPlayers();
		if (idx < 0 || idx >= cachedPlayers.length)
		{
			return;
		}

		RSPlayer player = cachedPlayers[idx];
		RSPlayer oldPlayer = oldPlayers[idx];
		oldPlayers[idx] = player;

		if (oldPlayer != null)
		{
			client.getCallbacks().post(new PlayerDespawned(oldPlayer));
		}
		if (player != null)
		{
			client.getCallbacks().postDeferred(new PlayerSpawned(player));
		}
	}

	@Copy("findItemDefinitions")
	@Replace("findItemDefinitions")
	public static void copy$findItemDefinitions(String var0, boolean var1)
	{
		GrandExchangeSearched event = new GrandExchangeSearched();
		client.getCallbacks().post(event);
		if (!event.isConsumed())
		{
			copy$findItemDefinitions(var0, var1);
		}
	}

	@Inject
	@FieldHook("grandExchangeOffers")
	public static void onGrandExchangeOffersChanged(int idx)
	{
		if (idx == -1)
		{
			return;
		}

		GrandExchangeOffer internalOffer = client.getGrandExchangeOffers()[idx];

		if (internalOffer == null)
		{
			return;
		}

		GrandExchangeOfferChanged offerChangedEvent = new GrandExchangeOfferChanged();
		offerChangedEvent.setOffer(internalOffer);
		offerChangedEvent.setSlot(idx);
		client.getCallbacks().post(offerChangedEvent);
	}

	@FieldHook("Varps_main")
	@Inject
	public static void settingsChanged(int idx)
	{
		VarbitChanged varbitChanged = new VarbitChanged();
		varbitChanged.setIndex(idx);
		client.getCallbacks().post(varbitChanged);
	}

	@FieldHook("isResizable")
	@Inject
	public static void resizeChanged(int idx)
	{
		//maybe couple with varbitChanged. resizeable may not be a varbit but it would fit with the other client settings.
		boolean isResized = client.isResized();

		if (oldIsResized != isResized)
		{
			ResizeableChanged resizeableChanged = new ResizeableChanged();
			resizeableChanged.setResized(isResized);
			client.getCallbacks().post(resizeableChanged);

			oldIsResized = isResized;
		}
	}

	@Inject
	public static RSRuneLiteClanMember runeLiteClanMember()
	{
		// Implementation is done with raw injection
		throw new NotImplementedException();
	}

	@FieldHook("friendsChatManager")
	@Inject
	public static void friendsChatMemberManagerChanged(int idx)
	{
		client.getCallbacks().post(new FriendsChatChanged(client.getFriendsChatManager() != null));
	}

	@FieldHook("canvasWidth")
	@Inject
	public static void canvasWidthChanged(int idx)
	{
		client.getCallbacks().post(new CanvasSizeChanged());
	}

	@FieldHook("canvasHeight")
	@Inject
	public static void canvasHeightChanged(int idx)
	{
		client.getCallbacks().post(new CanvasSizeChanged());
	}

	@Inject
	@Override
	public boolean hasHintArrow()
	{
		return client.getHintArrowTargetType() != HintArrowType.NONE.getValue();
	}

	@Inject
	@Override
	public HintArrowType getHintArrowType()
	{
		int type = client.getHintArrowTargetType();
		if (type == HintArrowType.NPC.getValue())
		{
			return HintArrowType.NPC;
		}
		else if (type == HintArrowType.PLAYER.getValue())
		{
			return HintArrowType.PLAYER;
		}
		else if (type == HintArrowType.WORLD_POSITION.getValue())
		{
			return HintArrowType.WORLD_POSITION;
		}
		else
		{
			return HintArrowType.NONE;
		}
	}

	@Inject
	@Override
	public void clearHintArrow()
	{
		client.setHintArrowTargetType(HintArrowType.NONE.getValue());
	}

	@Inject
	@Override
	public void setHintArrow(NPC npc)
	{
		client.setHintArrowTargetType(HintArrowType.NPC.getValue());
		client.setHintArrowNpcTargetIdx(npc.getIndex());
	}

	@Inject
	@Override
	public void setHintArrow(Player player)
	{
		client.setHintArrowTargetType(HintArrowType.PLAYER.getValue());
		client.setHintArrowPlayerTargetIdx(((RSPlayer) player).getPlayerId());
	}

	@Inject
	@Override
	public void setHintArrow(WorldPoint point)
	{
		client.setHintArrowTargetType(HintArrowType.WORLD_POSITION.getValue());
		client.setHintArrowX(point.getX());
		client.setHintArrowY(point.getY());
		// position the arrow in center of the tile
		client.setHintArrowOffsetX(LOCAL_TILE_SIZE / 2);
		client.setHintArrowOffsetY(LOCAL_TILE_SIZE / 2);
	}

	@Inject
	@Override
	public WorldPoint getHintArrowPoint()
	{
		if (getHintArrowType() == HintArrowType.WORLD_POSITION)
		{
			int x = client.getHintArrowX();
			int y = client.getHintArrowY();
			return new WorldPoint(x, y, client.getPlane());
		}

		return null;
	}

	@Inject
	@Override
	public Player getHintArrowPlayer()
	{
		if (getHintArrowType() == HintArrowType.PLAYER)
		{
			int idx = client.getHintArrowPlayerTargetIdx();
			RSPlayer[] players = client.getCachedPlayers();

			if (idx < 0 || idx >= players.length)
			{
				return null;
			}

			return players[idx];
		}

		return null;
	}

	@Inject
	@Override
	public NPC getHintArrowNpc()
	{
		if (getHintArrowType() == HintArrowType.NPC)
		{
			int idx = client.getHintArrowNpcTargetIdx();
			RSNPC[] npcs = client.getCachedNPCs();

			if (idx < 0 || idx >= npcs.length)
			{
				return null;
			}

			return npcs[idx];
		}

		return null;
	}

	@Copy("menuAction")
	@Replace("menuAction")
	static void copy$menuAction(int param0, int param1, int menuAction, int id, String option, String target, int canvasX, int canvasY)
	{
		RSRuneLiteMenuEntry menuEntry = null;

		int idx;
		for (idx = client.getMenuOptionCount() - 1; idx >= 0; --idx)
		{
			if (client.getMenuOpcodes()[idx] == menuAction
				&& client.getMenuIdentifiers()[idx] == id
				&& client.getMenuArguments1()[idx] == param0
				&& client.getMenuArguments2()[idx] == param1
				&& option.equals(client.getMenuOptions()[idx])
				&& (option.equals(target) || target.equals(client.getMenuTargets()[idx]))
			)
			{
				menuEntry = rl$menuEntries[idx];
				break;
			}
		}

		if (menuEntry == null && option.equals(target))
		{
			if (client.getMenuOptionCount() < 500)
			{
				idx = client.getMenuOptionCount();
				client.setMenuOptionCount(client.getMenuOptionCount() + 1);
			}
			else
			{
				idx = 0;
			}

			client.getMenuOpcodes()[idx] = menuAction;
			client.getMenuIdentifiers()[idx] = id;
			client.getMenuOptions()[idx] = option;
			client.getMenuTargets()[idx] = target;
			client.getMenuArguments1()[idx] = param0;
			client.getMenuArguments2()[idx] = param1;
			client.getMenuForceLeftClick()[idx] = false;
			menuEntry = rl$menuEntries[idx];
			if (menuEntry == null)
			{
				menuEntry = rl$menuEntries[idx] = newRuneliteMenuEntry(idx);
			}
		}

		if (menuEntry == null)
		{
			assert option == target;

			if (canvasX != -1 || canvasY != -1)
			{
				client.getLogger().warn("Unable to find clicked menu op {} targ {} action {} id {} p0 {} p1 {}", option, target, menuAction, id, param0, param1);
			}
		}
		else
		{
			client.getLogger().trace("Menu click op {} targ {} action {} id {} p0 {} p1 {}", option, target, menuAction, id, param0, param1);

			MenuOptionClicked event = new MenuOptionClicked(menuEntry);
			client.getCallbacks().post(event);

			if (menuEntry.getConsumer() != null)
			{
				try
				{
					menuEntry.getConsumer().accept(menuEntry);
				}
				catch (Exception ex)
				{
					client.getLogger().warn("exception in menu callback", ex);
				}
			}

			if (event.isConsumed())
			{
				return;
			}
		}

		/*
		 * The RuneScape client may deprioritize an action in the menu by incrementing the opcode with 2000,
		 * undo it here so we can get the correct opcode
		 */
		if (menuAction >= 2000)
		{
			menuAction -= 2000;
		}

		if (menuAction == MenuAction.WIDGET_CONTINUE.getId())
		{
			Widget widget = client.getWidget(param1);
			if (widget == null || param0 > -1 && widget.getChild(param0) == null)
			{
				return;
			}
		}

		copy$menuAction(param0, param1, menuAction, id, option, target, canvasX, canvasY);
	}

	@Inject
	public void invokeMenuAction(int actionParam, int widgetId, int menuAction, int id, String menuOption, String menuTarget, int canvasX, int canvasY)
	{
		assert isClientThread() : "invokeMenuAction must be called on client thread";

		client.sendMenuAction(actionParam, widgetId, menuAction, id, menuOption, menuTarget, canvasX, canvasY);
	}

	@FieldHook("Login_username")
	@Inject
	public static void onUsernameChanged(int idx)
	{
		client.getCallbacks().post(new UsernameChanged());
	}

	@Override
	@Inject
	public int getTickCount()
	{
		return tickCount;
	}

	@Override
	@Inject
	public void setTickCount(int tick)
	{
		tickCount = tick;
	}

	@Inject
	@Override
	public EnumSet<WorldType> getWorldType()
	{
		int flags = getFlags();
		return WorldType.fromMask(flags);
	}

	@Copy("openMenu")
	@Replace("openMenu")
	public void copy$openMenu(int x, int y)
	{
		final MenuOpened event = new MenuOpened();
		event.setMenuEntries(getMenuEntries());
		callbacks.post(event);

		copy$openMenu(x, y);

		client.getScene().menuOpen(client.getPlane(), x - client.getViewportXOffset(), y - client.getViewportYOffset(), false);
	}

	@Copy("addWidgetItemMenuItem")
	@Replace("addWidgetItemMenuItem")
	static void copy$addWidgetItemMenuItem(RSWidget widget, RSItemComposition itemComposition, int itemIndex, int shiftClickIndex, boolean isMenuShiftClick)
	{
		if (itemComposition.getInventoryActions().length > shiftClickIndex)
		{
			copy$addWidgetItemMenuItem(widget, itemComposition, itemIndex, shiftClickIndex, isMenuShiftClick);
		}
	}

	@Inject
	@MethodHook("updateNpcs")
	public static void updateNpcs(boolean var0, RSPacketBuffer var1)
	{
		client.getCallbacks().updateNpcs();
	}

	@SuppressWarnings("InfiniteRecursion")
	@Copy("addChatMessage")
	@Replace("addChatMessage")
	public static void copy$addChatMessage(int type, String name, String message, String sender)
	{
		copy$addChatMessage(type, name, message, sender);

		// Get the message node which was added
		@SuppressWarnings("unchecked") Map<Integer, RSChatChannel> chatLineMap = client.getChatLineMap();
		RSChatChannel chatLineBuffer = chatLineMap.get(type);
		MessageNode messageNode = chatLineBuffer.getLines()[0];

		ChatMessageType tmpType = ChatMessageType.of(type);

		if (tmpType == ChatMessageType.CLAN_CHAT && message != null && message.startsWith("|"))
		{
			tmpType = ChatMessageType.CLAN_GIM_CHAT;
			message = message.substring(1);
		}

		if (tmpType == ChatMessageType.CLAN_MESSAGE && message != null && message.startsWith("|"))
		{
			tmpType = ChatMessageType.CLAN_GIM_MESSAGE;
			message = message.substring(1);
		}

		Logger logger = client.getLogger();
		if (logger.isDebugEnabled())
		{
			ChatMessageType msgType = ChatMessageType.of(type);
			logger.debug("Chat message type {}: {}", msgType == ChatMessageType.UNKNOWN ? String.valueOf(type) : tmpType.name(), message);
		}

		final ChatMessage chatMessage = new ChatMessage(messageNode, tmpType, name, message, sender, messageNode.getTimestamp());
		client.getCallbacks().post(chatMessage);
	}

	@Copy("draw")
	@Replace("draw")
	public void copy$draw(boolean var1)
	{
		callbacks.frame();
		updateCamera();

		copy$draw(var1);

		checkResize();
	}

	@MethodHook("drawInterface")
	@Inject
	public static void preRenderWidgetLayer(Widget[] widgets, int parentId, int minX, int minY, int maxX, int maxY, int x, int y, int var8)
	{
		@SuppressWarnings("unchecked") HashTable<WidgetNode> componentTable = client.getComponentTable();

		for (int i = 0; i < widgets.length; i++)
		{
			RSWidget widget = (RSWidget) widgets[i];
			if (widget == null || widget.getRSParentId() != parentId || widget.isSelfHidden())
			{
				continue;
			}

			if (parentId != -1)
			{
				widget.setRenderParentId(parentId);
			}

			final int renderX = x + widget.getRelativeX();
			final int renderY = y + widget.getRelativeY();
			widget.setRenderX(renderX);
			widget.setRenderY(renderY);

			if (widget.getType() == WidgetType.RECTANGLE && renderX == client.getViewportXOffset() && renderY == client.getViewportYOffset()
				&& widget.getWidth() == client.getViewportWidth() && widget.getHeight() == client.getViewportHeight()
				&& widget.getOpacity() > 0 && widget.isFilled() && widget.getFillMode().getOrdinal() == 0 && client.isGpu())
			{
				int tc = widget.getTextColor();
				int alpha = widget.getOpacity() & 0xFF;
				int inverseAlpha = 256 - alpha;
				int vpc = viewportColor;
				int c1 = (inverseAlpha * (tc & 0xFF00FF) >> 8 & 0xFF00FF) + (inverseAlpha * (tc & 0x00FF00) >> 8 & 0x00FF00);
				int c2 = (alpha * (vpc & 0xFF00FF) >> 8 & 0xFF00FF) + (alpha * (vpc & 0x00FF00) >> 8 & 0x00FF00);
				int outAlpha = inverseAlpha + ((vpc >>> 24) * (255 - inverseAlpha) * 0x8081 >>> 23);
				viewportColor = outAlpha << 24 | c1 + c2;
				widget.setHidden(true);
				hiddenWidgets.add(widget);
			}
			else
			{
				WidgetNode childNode = componentTable.get(widget.getId());
				if (childNode != null)
				{
					int widgetId = widget.getId();
					int groupId = childNode.getId();
					RSWidget[] children = client.getWidgets()[groupId];

					for (RSWidget child : children)
					{
						if (child.getRSParentId() == -1)
						{
							child.setRenderParentId(widgetId);
						}
					}
				}
			}
		}
	}

	@Inject
	@MethodHook(value = "drawInterface", end = true)
	public static void postRenderWidgetLayer(Widget[] widgets, int parentId, int minX, int minY, int maxX, int maxY, int x, int y, int var8)
	{
		Callbacks callbacks = client.getCallbacks();
		int oldSize = widgetItems.size();

		for (Widget rlWidget : widgets)
		{
			RSWidget widget = (RSWidget) rlWidget;
			if (widget == null || widget.getRSParentId() != parentId || widget.isSelfHidden())
			{
				continue;
			}

			int type = widget.getType();
			if (type == WidgetType.GRAPHIC && widget.getItemId() != -1)
			{
				final int renderX = x + widget.getRelativeX();
				final int renderY = y + widget.getRelativeY();
				if (renderX >= minX && renderX <= maxX && renderY >= minY && renderY <= maxY)
				{
					WidgetItem widgetItem = new WidgetItem(widget.getItemId(), widget.getItemQuantity(), -1, widget.getBounds(), widget, null);
					widgetItems.add(widgetItem);
				}
			}
			else if (type == WidgetType.INVENTORY)
			{
				widgetItems.addAll(widget.getWidgetItems());
			}
		}

		List<WidgetItem> subList = Collections.emptyList();
		if (oldSize < widgetItems.size())
		{
			if (oldSize > 0)
			{
				subList = widgetItems.subList(oldSize, widgetItems.size());
			}
			else
			{
				subList = widgetItems;
			}
		}

		if (parentId == 0xabcdabcd)
		{
			widgetItems.clear();
		}
		else if (parentId != -1)
		{
			Widget widget = client.getWidget(parentId);
			Widget[] children = widget.getChildren();
			if (children == null || children == widgets)
			{
				callbacks.drawLayer(widget, subList);
			}
		}
		else
		{
			int group = -1;
			for (Widget widget : widgets)
			{
				if (widget != null)
				{
					group = WidgetInfo.TO_GROUP(widget.getId());
					break;
				}
			}

			if (group == -1)
			{
				return;
			}

			callbacks.drawInterface(group, widgetItems);
			widgetItems.clear();
			for (int i = hiddenWidgets.size() - 1; i >= 0; i--)
			{
				Widget widget = hiddenWidgets.get(i);
				if (WidgetInfo.TO_GROUP(widget.getId()) == group)
				{
					widget.setHidden(false);
					hiddenWidgets.remove(i);
				}
			}
		}
	}


	@Inject
	@Override
	public RSTileItem getLastItemDespawn()
	{
		return lastItemDespawn;
	}

	@Inject
	@Override
	public void setLastItemDespawn(RSTileItem lastItemDespawn)
	{
		RSClientMixin.lastItemDespawn = lastItemDespawn;
	}

	@Inject
	@Override
	public boolean isGpu()
	{
		return gpu;
	}

	@Inject
	@Override
	public void setGpu(boolean gpu)
	{
		this.gpu = gpu;
	}

	@Inject
	@Override
	public void queueChangedSkill(Skill skill)
	{
		int[] skills = client.getChangedSkills();
		int count = client.getChangedSkillsCount();
		skills[++count - 1 & 31] = skill.ordinal();
		client.setChangedSkillsCount(count);
	}

	@Inject
	@Override
	public RSSpritePixels[] getSprites(IndexDataBase source, int archiveId, int fileId)
	{
		RSAbstractArchive rsSource = (RSAbstractArchive) source;
		byte[] configData = rsSource.getConfigData(archiveId, fileId);
		if (configData == null)
		{
			return null;
		}

		decodeSprite(configData);

		int indexedSpriteCount = getIndexedSpriteCount();
		int maxWidth = getIndexedSpriteWidth();
		int maxHeight = getIndexedSpriteHeight();
		int[] offsetX = getIndexedSpriteOffsetXs();
		int[] offsetY = getIndexedSpriteOffsetYs();
		int[] widths = getIndexedSpriteWidths();
		int[] heights = getIndexedSpriteHeights();
		byte[][] spritePixelsArray = getSpritePixels();
		int[] indexedSpritePalette = getIndexedSpritePalette();

		RSSpritePixels[] array = new RSSpritePixels[indexedSpriteCount];

		for (int i = 0; i < indexedSpriteCount; ++i)
		{
			int width = widths[i];
			int height = heights[i];

			byte[] pixelArray = spritePixelsArray[i];
			int[] pixels = new int[width * height];

			RSSpritePixels spritePixels = createSpritePixels(pixels, width, height);
			spritePixels.setMaxHeight(maxHeight);
			spritePixels.setMaxWidth(maxWidth);
			spritePixels.setOffsetX(offsetX[i]);
			spritePixels.setOffsetY(offsetY[i]);

			for (int j = 0; j < width * height; ++j)
			{
				pixels[j] = indexedSpritePalette[pixelArray[j] & 0xff];
			}

			array[i] = spritePixels;
		}

		setIndexedSpriteOffsetXs(null);
		setIndexedSpriteOffsetYs(null);
		setIndexedSpriteWidths(null);
		setIndexedSpriteHeights(null);
		setIndexedSpritePalette(null);
		setSpritePixels(null);

		return array;
	}

	@Inject
	@Override
	public void setSkyboxColor(int newSkyboxColor)
	{
		skyboxColor = newSkyboxColor;
	}

	@Inject
	@Override
	public int getSkyboxColor()
	{
		return skyboxColor;
	}

	@Inject
	@FieldHook("cycleCntr")
	public static void onCycleCntrChanged(int idx)
	{
		client.getCallbacks().post(new ClientTick());
	}

	@Copy("shouldLeftClickOpenMenu")
	@Replace("shouldLeftClickOpenMenu")
	@SuppressWarnings("InfiniteRecursion")
	boolean copy$shouldLeftClickOpenMenu()
	{
		if (copy$shouldLeftClickOpenMenu())
		{
			return true;
		}

		MenuShouldLeftClick menuShouldLeftClick = new MenuShouldLeftClick();
		client.getCallbacks().post(menuShouldLeftClick);

		if (menuShouldLeftClick.isForceRightClick())
		{
			return true;
		}

		int len = getMenuOptionCount();
		if (len > 0)
		{
			int type = getMenuOpcodes()[len - 1];
			return type == MenuAction.RUNELITE_OVERLAY.getId() || type == MenuAction.RUNELITE_OVERLAY_CONFIG.getId() || type == MenuAction.RUNELITE_INFOBOX.getId();
		}

		return false;
	}

	@Inject
	@Override
	public EnumComposition getEnum(int id)
	{
		assert isClientThread() : "getEnum must be called on client thread";

		RSEnumComposition rsEnumDefinition = enumCache.getIfPresent(id);
		if (rsEnumDefinition != null)
		{
			return rsEnumDefinition;
		}

		rsEnumDefinition = getRsEnum(id);
		enumCache.put(id, rsEnumDefinition);
		return rsEnumDefinition;
	}

	@Inject
	@Override
	public void resetHealthBarCaches()
	{
		getHealthBarCache().reset();
		getHealthBarSpriteCache().reset();
	}

	@Copy("changeGameOptions")
	@Replace("changeGameOptions")
	@SuppressWarnings("InfiniteRecursion")
	public static void copy$changeGameOptions(int var0)
	{
		copy$changeGameOptions(var0);

		int type = client.getVarpDefinition(var0).getType();
		if (type == 3 || type == 4 || type == 10)
		{
			VolumeChanged volumeChanged = new VolumeChanged(type == 3 ? VolumeChanged.Type.MUSIC : type == 4 ? VolumeChanged.Type.EFFECTS : VolumeChanged.Type.AREA);
			client.getCallbacks().post(volumeChanged);
		}
	}

	@Replace("getWidgetFlags")
	public static int getWidgetFlags(Widget widget)
	{
		IntegerNode integerNode = (IntegerNode) client.getWidgetFlags().get(((long) widget.getId() << 32) + (long) widget.getIndex());

		int widgetClickMask;

		if (integerNode == null)
		{
			widgetClickMask = widget.getClickMask();
		}
		else
		{
			widgetClickMask = integerNode.getValue();
		}

		if (allWidgetsAreOpTargetable)
		{
			widgetClickMask |= WidgetConfig.WIDGET_USE_TARGET;
		}

		return widgetClickMask;
	}

	@Inject
	@FieldHook("camAngleDX")
	private static void onCamAngleDXChange(int index)
	{
		if (invertPitch && client.getMouseCurrentButton() == 4 && client.isMouseCam())
		{
			client.setCamAngleDX(-client.getCamAngleDX());
		}
	}

	@Inject
	@FieldHook("camAngleDY")
	private static void onCamAngleDYChange(int index)
	{
		if (invertYaw && client.getMouseCurrentButton() == 4 && client.isMouseCam())
		{
			client.setCamAngleDY(-client.getCamAngleDY());
		}
	}

	@Inject
	@Override
	public void setInvertPitch(boolean state)
	{
		invertPitch = state;
	}

	@Inject
	@Override
	public void setInvertYaw(boolean state)
	{
		invertYaw = state;
	}

	@Inject
	@Override
	public void stopNow()
	{
		setStopTimeMs(1L);
	}

	@Inject
	@Override
	public ObjectComposition getObjectDefinition(int objectId)
	{
		assert this.isClientThread() : "getObjectDefinition must be called on client thread";
		return getRSObjectComposition(objectId);
	}

	@Inject
	@Override
	@Nonnull
	public ItemComposition getItemDefinition(int id)
	{
		assert this.isClientThread() : "getItemDefinition must be called on client thread";
		return getRSItemDefinition(id);
	}

	@Inject
	@Override
	public NPCComposition getNpcDefinition(int id)
	{
		assert this.isClientThread() : "getNpcDefinition must be called on client thread";
		return getRSNpcComposition(id);
	}

	@Inject
	public List<String> getOutdatedScripts()
	{
		return this.outdatedScripts;
	}

	@Inject
	@MethodHook(value = "changeWorld", end = true)
	public static void postChangeWorld(RSWorld world)
	{
		client.getCallbacks().post(new WorldChanged());
	}

	@Inject
	@Override
	public void queueChangedVarp(int varp)
	{
		assert client.isClientThread() : "queueChangedVarp must be called on client thread";

		int[] changedVarps = client.getChangedVarps();
		int changedVarpCount = client.getChangedVarpCount();
		changedVarps[changedVarpCount & 31] = varp;
		client.setChangedVarpCount(changedVarpCount + 1);
	}

	@Inject
	@Override
	public ScriptEvent createScriptEvent(Object... args)
	{
		return createRSScriptEvent(args);
	}

	@Inject
	@Override
	public RSScriptEvent createRSScriptEvent(Object... args)
	{
		RSScriptEvent event = createScriptEvent();
		event.setArguments(args);
		return event;
	}

	@Inject
	@Override
	public NodeCache getStructCompositionCache()
	{
		assert client.isClientThread() : "getStructCompositionCache must be called on client thread";

		return getRSStructCompositionCache();
	}

	@Inject
	@Override
	public StructComposition getStructComposition(int structID)
	{
		assert client.isClientThread() : "getStructComposition must be called on client thread";

		return getRSStructComposition(structID);
	}

	@Copy("StructDefinition_getStructDefinition")
	@Replace("StructDefinition_getStructDefinition")
	@SuppressWarnings("InfiniteRecursion")
	static RSStructComposition copy$getStructComposition(int id)
	{
		RSStructComposition comp = copy$getStructComposition(id);

		if (comp.getId() == -1)
		{
			comp.setId(id);
			PostStructComposition event = new PostStructComposition();
			event.setStructComposition(comp);
			client.getCallbacks().post(event);
		}

		return comp;
	}

	@Inject
	@Override
	public int getMusicVolume()
	{
		return client.getPreferences().getMusicVolume();
	}

	@Inject
	@Override
	public void setMusicVolume(int volume)
	{
		if (volume > 0 && client.getPreferences().getMusicVolume() <= 0 && client.getCurrentTrackGroupId() != -1)
		{
			client.playMusicTrack(1000, client.getMusicTracks(), client.getCurrentTrackGroupId(), 0, volume, false);
		}

		client.getPreferences().setMusicVolume(volume);
		client.setMusicTrackVolume(volume);
		if (client.getMidiPcmStream() != null)
		{
			client.getMidiPcmStream().setPcmStreamVolume(volume);
		}
	}

	@Inject
	@MethodHook("closeInterface")
	public static void preCloseInterface(RSInterfaceParent iface, boolean willUnload)
	{
		client.getCallbacks().post(new WidgetClosed(iface.getId(), iface.getModalMode(), willUnload));
	}

	@Inject
	@Override
	public ClanChannel getClanChannel()
	{
		return getCurrentClanChannels()[0];
	}

	@Inject
	@Override
	public ClanChannel getClanChannel(int clanId)
	{
		ClanChannel[] clanChannels = client.getCurrentClanChannels();
		if (clanId >= 0 && clanId < clanChannels.length)
		{
			return clanChannels[clanId];
		}

		return null;
	}

	@Inject
	@Override
	public ClanSettings getClanSettings()
	{
		return getCurrentClanSettingsArray()[0];
	}

	@Inject
	@Override
	public ClanSettings getClanSettings(int clanId)
	{
		ClanSettings[] clanSettings = getCurrentClanSettingsArray();
		if (clanId >= 0 && clanId < clanSettings.length)
		{
			return clanSettings[clanId];
		}

		return null;
	}

	@Inject
	@Override
	public ClanRank getClanRankFromRs(int rank)
	{
		switch (rank)
		{
			case -1:
				return ClanRank.GUEST;
			case 10:
				return ClanRank.CLAN_RANK_2;
			case 20:
				return ClanRank.CLAN_RANK_3;
			case 30:
				return ClanRank.CLAN_RANK_4;
			case 40:
				return ClanRank.CLAN_RANK_5;
			case 50:
				return ClanRank.CLAN_RANK_6;
			case 60:
				return ClanRank.CLAN_RANK_7;
			case 70:
				return ClanRank.CLAN_RANK_8;
			case 80:
				return ClanRank.CLAN_RANK_9;
			case 90:
				return ClanRank.CLAN_RANK_10;
			case 100:
				return ClanRank.ADMINISTRATOR;
			case 105:
				return ClanRank.CLAN_RANK_11;
			case 110:
				return ClanRank.CLAN_RANK_12;
			case 115:
				return ClanRank.CLAN_RANK_13;
			case 120:
				return ClanRank.CLAN_RANK_14;
			case 125:
				return ClanRank.DEPUTY_OWNER;
			case 126:
				return ClanRank.OWNER;
			case 127:
				return ClanRank.JMOD;
			default:
				return ClanRank.CLAN_RANK_1;
		}
	}

	@Inject
	@Override
	public void setUsername(String username)
	{
		this.setLoginUsername(username);
		client.getCallbacks().post(new UsernameChanged());
	}

	@Inject
	public void playMusicTrack(int var0, RSAbstractArchive var1, int var2, int var3, int var4, boolean var5)
	{
		client.setMusicPlayerStatus(1);
		client.setMusicTrackArchive(var1);
		client.setMusicTrackGroupId(var2);
		client.setMusicTrackFileId(var3);
		client.setMusicTrackVolume(var4);
		client.setMusicTrackBoolean(var5);
		client.setPcmSampleLength(var0);
	}

	@Inject
	@FieldHook("guestClanChannel")
	public static void onGuestClanChannelChanged(int idx)
	{
		client.getCallbacks().post(new ClanChannelChanged(client.getGuestClanChannel(), -1, true));
	}

	@Inject
	@FieldHook("currentClanChannels")
	public static void onCurrentClanChannelsChanged(int idx)
	{
		if (idx < 0)
		{
			// don't fire on array field itself being set
			return;
		}

		RSClanChannel[] clanChannels = client.getCurrentClanChannels();
		if (idx < clanChannels.length)
		{
			client.getCallbacks().post(new ClanChannelChanged(clanChannels[idx], idx, false));
		}
	}

	@Inject
	@FieldHook("rndHue")
	public static void rndHue(int idx)
	{
		int rndHue = client.getRndHue();

		if (rndHue >= -8 && rndHue <= 8)
		{
			RSScene scene = client.getScene();

			byte[][][] underlays = client.getTileUnderlays();
			byte[][][] overlays = client.getTileOverlays();
			byte[][][] tileShapes = client.getTileShapes();

			scene.setUnderlayIds(Arrays.copyOf(underlays, underlays.length));
			scene.setOverlayIds(Arrays.copyOf(overlays, overlays.length));
			scene.setTileShapes(Arrays.copyOf(tileShapes, tileShapes.length));
		}
	}

	@Inject
	public Model loadModel(int id)
	{
		return loadModel(id, null, null);
	}

	@Inject
	public Model loadModel(int id, short[] colorToFind, short[] colorToReplace)
	{
		RSModelData modelData = client.getModelData(client.getObjectDefinition_modelsArchive(), id, 0);

		if (colorToFind != null)
		{
			for (int i = 0; i < colorToFind.length; ++i)
			{
				modelData.rs$recolor(colorToFind[i], colorToReplace[i]);
			}
		}

		return modelData.toModel(modelData.getAmbient() + 64, modelData.getContrast() + 850, -30, -50, -30);
	}

	@Inject
	public Animation loadAnimation(int id)
	{
		return client.getSequenceDefinition(id);
	}

	@Inject
	@Override
	public boolean isUnlockedFps()
	{
		return unlockedFps;
	}

	@Inject
	public void setUnlockedFps(boolean unlocked)
	{
		unlockedFps = unlocked;

		if (unlocked)
		{
			posToCameraAngle(client.getMapAngle(), client.getCameraPitch());
		}
		else
		{
			delayNanoTime = 0L;
		}
	}

	@Inject
	public void setUnlockedFpsTarget(int var1)
	{
		if (var1 <= 0)
		{
			delayNanoTime = 0L;
		}
		else
		{
			delayNanoTime = 1000000000L / (long) var1;
		}
	}

	@Inject
	@Override
	public long getUnlockedFpsTarget()
	{
		return delayNanoTime;
	}

	@Inject
	public void updateCamera()
	{
		if (unlockedFps)
		{
			long nanoTime = System.nanoTime();
			long diff = nanoTime - this.lastNanoTime;
			this.lastNanoTime = nanoTime;

			if (this.getGameState() == GameState.LOGGED_IN)
			{
				this.interpolateCamera(diff);
			}
		}
	}

	@Inject
	public void interpolateCamera(long var1)
	{
		double angleDX = diffToDangle(client.getCamAngleDY(), var1);
		double angleDY = diffToDangle(client.getCamAngleDX(), var1);

		tmpCamAngleY += angleDX / 2;
		tmpCamAngleX += angleDY / 2;
		tmpCamAngleX = Doubles.constrainToRange(tmpCamAngleX, Perspective.UNIT * STANDARD_PITCH_MIN,
				client.getCameraPitchRelaxerEnabled() ? Perspective.UNIT * NEW_PITCH_MAX : Perspective.UNIT * STANDARD_PITCH_MAX);

		int yaw = toCameraPos(tmpCamAngleY);
		int pitch = toCameraPos(tmpCamAngleX);

		client.setCameraYawTarget(yaw);
		client.setCameraPitchTarget(pitch);
	}

	@Inject
	public static double diffToDangle(int var0, long var1)
	{
		double var2 = var0 * Perspective.UNIT;
		double var3 = (double) var1 / 2.0E7D;

		return var2 * var3;
	}

	@Inject
	@Override
	public void posToCameraAngle(int var0, int var1)
	{
		tmpCamAngleY = var0 * Perspective.UNIT;
		tmpCamAngleX = var1 * Perspective.UNIT;
	}

	@Inject
	public static int toCameraPos(double var0)
	{
		return (int) (var0 / Perspective.UNIT) & 2047;
	}

	@Inject
	@MethodHook("doCycle")
	protected final void doCycle()
	{
		client.getCallbacks().tick();
	}

	@Inject
	public static void check(String name, RSEvictingDualNodeHashTable dualNodeHashTable)
	{
		boolean isTrashing = dualNodeHashTable.isTrashing();
		dualNodeHashTable.setThreshold(dualNodeHashTable.getThreshold() * 0.92F + (isTrashing ? 0.07999998F : 0.0F));
		if (isTrashing)
		{
			if (dualNodeHashTable.getThreshold() > 0.2F)
			{
				client.getLogger().trace("cache {} is thrashing", name);
			}

			if (dualNodeHashTable.getThreshold() > 0.9F && dualNodeHashTable.getCapacity() < dualNodeHashTable.getTmpCapacity() * 8)
			{
				dualNodeHashTable.increaseCapacity(dualNodeHashTable.getCapacity() * 2);
				client.getLogger().info("cache {} thrashing, enlarging to {} entries", name, dualNodeHashTable.getCapacity());
			}
		}

		dualNodeHashTable.getDeque().add(dualNodeHashTable.getDualNode());
	}

	@Inject
	public static void checkResize()
	{
		check("Script_cached", client.getScriptCache());
		check("StructDefinition_cached", client.getRSStructCompositionCache());
		check("HealthBarDefinition_cached", client.getHealthBarCache());
		check("HealthBarDefinition_cachedSprites", client.getHealthBarSpriteCache());
		check("ObjectDefinition_cachedModels", client.getObjectDefinitionModelsCache());
		check("Widget_cachedSprites", client.getWidgetSpriteCache());
		check("ItemComposition_cached", client.getItemCompositionCache());
		check("VarbitDefinition_cached", client.getVarbitCache());
		check("EnumDefinition_cached", client.getEnumDefinitionCache());
		check("FloorUnderlayDefinition_cached", client.getFloorUnderlayDefinitionCache());
		check("FloorOverlayDefinition_cached", client.getFloorOverlayDefinitionCache());
		check("HitSplatDefinition_cached", client.getHitSplatDefinitionCache());
		check("HitSplatDefinition_cachedSprites", client.getHitSplatDefinitionSpritesCache());
		check("HitSplatDefinition_cachedFonts", client.getHitSplatDefinitionFontsCache());
		check("InvDefinition_cached", client.getInvDefinitionCache());
		check("ItemComposition_cachedModels", client.getItemModelCache());
		check("ItemComposition_cachedSprites", client.getItemSpriteCache());
		check("KitDefinition_cached", client.getKitDefinitionCache());
		check("NpcDefinition_cached", client.getNpcDefinitionCache());
		check("NpcDefinition_cachedModels", client.getNpcDefinitionModelsCache());
		check("ObjectDefinition_cached", client.getObjectDefinitionCache());
		check("ObjectDefinition_cachedModelData", client.getObjectDefinitionModelDataCache());
		check("ObjectDefinition_cachedEntities", client.getObjectDefinitionEntitiesCache());
		check("ParamDefinition_cached", client.getParamDefinitionCache());
		check("PlayerAppearance_cachedModels", client.getPlayerAppearanceModelsCache());
		check("SequenceDefinition_cached", client.getSequenceDefinitionCache());
		check("SequenceDefinition_cachedFrames", client.getSequenceDefinitionFramesCache());
		check("SequenceDefinition_cachedModel", client.getSequenceDefinitionModelsCache());
		check("SpotAnimationDefinition_cached", client.getSpotAnimationDefinitionCache());
		check("SpotAnimationDefinition_cachedModels", client.getSpotAnimationDefinitionModlesCache());
		check("VarcInt_cached", client.getVarcIntCache());
		check("VarpDefinition_cached", client.getVarpDefinitionCache());
		check("Widget_cachedModels", client.getModelsCache());
		check("Widget_cachedFonts", client.getFontsCache());
		check("Widget_cachedSpriteMasks", client.getSpriteMasksCache());
		check("WorldMapElement_cachedSprites", client.getSpritesCache());
	}

	@Inject
	@Override
	public ModelData loadModelData(int id)
	{
		assert isClientThread() : "loadModelData must be called on client thread";

		RSModelData modelData = (RSModelData) this.tmpModelDataCache.get(id);
		if (modelData == null)
		{
			modelData = getModelData(RSClientMixin.archives[7], id, 0);
			if (modelData == null)
			{
				return null;
			}

			this.tmpModelDataCache.put((RSDualNode) modelData, id);
		}

		return modelData.newModelData(modelData, true, true, true, true);
	}

	@Inject
	@Override
	public ModelData mergeModels(ModelData[] models, int length)
	{
		return newModelData(Arrays.copyOf(models, length), length);
	}

	@Inject
	@Override
	public ModelData mergeModels(ModelData ...models)
	{
		return newModelData(Arrays.copyOf(models, models.length), models.length);
	}

	@Inject
	public IndexDataBase getIndex(int id)
	{
		return RSClientMixin.archives[id];
	}

	@Inject
	public static RSFloorOverlayDefinition loadFloorOverlay(int var0)
	{
		RSFloorOverlayDefinition floorOverlayDefinition = (RSFloorOverlayDefinition) client.getFloorOverlayDefinitionCache().get(var0);
		if (floorOverlayDefinition == null)
		{
			byte[] var2 = client.getFloorOverlayDefinitionArchive().loadData(4, var0);
			floorOverlayDefinition = client.newFloorOverlayDefinition();
			if (var2 != null)
			{
				RSBuffer var3 = client.newBuffer(var2);
				floorOverlayDefinition.decode(var3, var0);
			}

			floorOverlayDefinition.postDecode();
			client.getFloorOverlayDefinitionCache().put((RSDualNode) floorOverlayDefinition, (long) var0);
		}

		return floorOverlayDefinition;
	}

	@Copy("addObjects")
	@Replace("addObjects")
	@SuppressWarnings("InfiniteRecursion")
	public static void copy$addObjects(int var0, int var1, int var2, int var3, int var4, int var5, RSScene var6, RSCollisionMap var7)
	{
		boolean resetLowMemory = false;

		byte tileSetting = client.getTileSettings()[var0][var1][var2];

		if (client.isLowMemory())
		{
			byte[] var10000 = client.getTileSettings()[var0][var1];
			var10000[var2] &= -17;
			if (var5 == 22)
			{
				int TileOverlay = client.getTileOverlays()[var0][var1][var2] & 255;

				if (TileOverlay > 0)
				{
					RSFloorOverlayDefinition floorOverlayDefinition = loadFloorOverlay(TileOverlay - 1);
					if (floorOverlayDefinition.getTexture() < 0 && floorOverlayDefinition.getPrimaryRgb() == 16711935)
					{
						client.setLowMemory(false);
						resetLowMemory = true;
					}
				}
			}
		}

		copy$addObjects(var0, var1, var2, var3, var4, var5, var6, var7);

		client.getTileSettings()[var0][var1][var2] = tileSetting;

		if (resetLowMemory)
		{
			client.setLowMemory(true);
		}
	}

	@FieldHook("accountHash")
	@Inject
	public void onAccountHashChanged(int idx)
	{
		if (client == null)
		{
			return;
		}

		client.getCallbacks().post(new AccountHashChanged());
	}

	@Inject
	@Override
	public Widget getSelectedWidget()
	{
		int selectedSpellWidget = client.getSelectedSpellWidget();
		int selectedSpellChildIndex = client.getSelectedSpellChildIndex();

		Widget widget = client.getWidget(selectedSpellWidget);
		if (widget != null && selectedSpellChildIndex > -1)
		{
			return widget.getChild(selectedSpellChildIndex);
		}

		return null;
	}
}

