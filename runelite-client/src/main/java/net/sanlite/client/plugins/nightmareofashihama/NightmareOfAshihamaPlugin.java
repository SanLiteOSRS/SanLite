/*
 * Copyright (c) 2020, Siraz <https://github.com/Sirazzz>
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
package net.sanlite.client.plugins.nightmareofashihama;

import com.google.inject.Provides;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.ObjectID;
import net.runelite.api.events.*;
import net.runelite.client.Notifier;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.ui.overlay.infobox.Timer;
import net.sanlite.client.plugins.nightmareofashihama.id.AnimationID;

import javax.inject.Inject;
import java.awt.image.BufferedImage;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

@PluginDescriptor(
		name = "Nightmare of Ashihama",
		description = "Helps with the various mechanics in the Nightmare of Ashihama encounter",
		tags = {"combat", "overlay", "pve", "pvm", "the nightmare", "boss", "group", "timer", "encounter", "phosani", "sanlite"},
		enabledByDefault = false
)
@Slf4j
public class NightmareOfAshihamaPlugin extends Plugin
{
	private static final String CURSED_MESSAGE = "has cursed you, shuffling your prayers!";
	private static final String CURSE_DISABLED_MESSAGE = "curse wear off";
	private static final String PARASITE_MESSAGE = "has impregnated you with a deadly parasite!";
	private static final String DROWSY_MESSAGE = "making you feel drowsy!";

	private static final int[] ENCOUNTER_REGIONS = {
			15258, 15259, 15260, 15514, 15515, 15516, 15770, 15771, 15772
	};

	@Inject
	private Client client;

	@Inject
	private NightmareOfAshihamaConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private InfoBoxManager infoBoxManager;

	@Inject
	private Notifier notifier;

	@Inject
	private NightmareOfAshihamaOverlay nightmareOverlay;

	@Inject
	private NightmareOfAshihamaCurrentAttackOverlay currentAttackOverlay;

	@Inject
	private NightmareOfAshihamaDebugOverlay debugOverlay;

	@Inject
	private ClientThread clientThread;

	@Getter
	private NightmareOfAshihama nightmare;

	private Timer prayersShuffledTimer;
	private BufferedImage prayersShuffledIcon;

	@Provides
	NightmareOfAshihamaConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(NightmareOfAshihamaConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		prayersShuffledIcon = NightmareOfAshihama.getPrayersShuffledIcon();
		overlayManager.add(nightmareOverlay);
		overlayManager.add(currentAttackOverlay);
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}
		clientThread.invoke(this::reset);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(nightmareOverlay);
		overlayManager.remove(currentAttackOverlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
		nightmare = null;
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}
		else if (!config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
	}

	private void reset()
	{
		nightmare = null;
	}

	private boolean inEncounterInstance()
	{
		return Arrays.equals(client.getMapRegions(), ENCOUNTER_REGIONS) && client.isInInstancedRegion();
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		if (!inEncounterInstance() && nightmare == null)
		{
			return;
		}

		if (event.getMessage().contains(CURSED_MESSAGE))
		{
			if (config.displayPrayersCursedTimer())
			{
				prayersShuffledTimer = new Timer(20, ChronoUnit.SECONDS, prayersShuffledIcon, this);
				infoBoxManager.addInfoBox(prayersShuffledTimer);
			}

			if (config.notifyOnPrayersShuffled())
			{
				notifier.notify("Your prayer have been shuffled!");
			}
		}
		else if (event.getMessage().contains(CURSE_DISABLED_MESSAGE))
		{
			if (prayersShuffledTimer == null)
			{
				return;
			}

			infoBoxManager.removeInfoBox(prayersShuffledTimer);
			prayersShuffledTimer = null;
		}
		else if (event.getMessage().contains(PARASITE_MESSAGE))
		{
			if (config.notifyOnParasite())
			{
				notifier.notify("You have been impregnated with a deadly parasite!");
			}
		}
		else if (event.getMessage().contains(DROWSY_MESSAGE))
		{
			if (config.notifyOnDrowsy())
			{
				notifier.notify("You have been affected by the drowsy effect!");
			}
		}
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		if (!inEncounterInstance() || nightmare == null)
		{
			return;
		}

		int animationId = event.getActor().getAnimation();
		if (AnimationID.NIGHTMARE_DEATH == animationId)
		{
			nightmare.onDeath();
		}

		if (!nightmare.isRegularAttackAnimation(animationId))
		{
			return;
		}

		nightmare.onAttack(animationId, client.getTickCount());
	}

	@Subscribe
	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		if (!inEncounterInstance() || nightmare == null)
		{
			return;
		}

		int id = event.getGameObject().getId();
		if (id == ObjectID.SPORE_37739)
		{
			nightmare.getGameObjects().add(event.getGameObject());
		}
	}

	@Subscribe
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		if (nightmare == null)
		{
			return;
		}

		int id = event.getGameObject().getId();
		if (id == ObjectID.SPORE_37739)
		{
			nightmare.getGameObjects().remove(event.getGameObject());
		}
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (inEncounterInstance())
		{
			NPC npc = event.getNpc();
			int npcId = event.getNpc().getId();
			if (NightmareOfAshihama.isNpcNightmare(npcId) || NightmareOfAshihama.isPhosanisNightmare(npcId))
			{
				log.debug("Nightmare spawned: {}", npcId);
				nightmare = new NightmareOfAshihama(npc);
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		int npcId = event.getNpc().getId();
		if (NightmareOfAshihama.isNpcNightmare(npcId) || NightmareOfAshihama.isPhosanisNightmare(npcId))
		{
			log.debug("Nightmare despawned: {}", npcId);
			reset();
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		GameState gameState = event.getGameState();
		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			reset();
		}
	}

	@Subscribe
	protected void onClientTick(ClientTick event)
	{
		if (!inEncounterInstance() || nightmare == null)
		{
			return;
		}

		nightmare.checkGraphicObjects(client.getGraphicsObjects());
		nightmare.checkActiveTotems(client.getNpcs());
	}
}
