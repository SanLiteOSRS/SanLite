/*
 * Copyright (c) 2019, Siraz, Jajack
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
package net.runelite.client.plugins.spelleffecttimers;

import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.*;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.MapLocations;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
@PluginDescriptor(
		name = "Spell Effect Timers",
		description = "Shows spell effect timers for freezes, vengeance and teleblock",
		tags = {"spell", "effect", "timers", "freeze", "timers", "barrage", "freezy", "ancients", "overlay", "root",
				"vengeance", "teleblock", "veng", "tb", "pvp"},
		enabledByDefault = false,
		type = PluginType.SANLITE_USE_AT_OWN_RISK
)
public class SpellEffectTimersPlugin extends Plugin
{

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private SpellEffectTimersOverlay overlay;

	@Inject
	private SpellEffectTimersConfig config;

	@Getter(AccessLevel.PACKAGE)
	private List<SpellEffectInfo> spellEffects = new ArrayList<>();

	@Getter
	private HashMap<Actor, WorldPoint> frozenActors = new HashMap<>();

	@Provides
	public SpellEffectTimersConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SpellEffectTimersConfig.class);
	}

	public void startUp()
	{
		overlayManager.add(overlay);
	}

	public void shutDown()
	{
		overlayManager.remove(overlay);
	}

	@Subscribe
	public void onSpotAnimationChanged(SpotAnimationChanged spotAnimationChanged)
	{
		// Edge cases causing the plugin to not detect freezes
		// 1. Ahrim's full set effect spot anim overriding (id 400)
		// 2. Elysian hit effect might also trigger this
		// 3. Enchanted bolt effects
		// Everything that overrides the freeze spot animation causes this issue

		GameState gameState = client.getGameState();
		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			return;
		}

		Actor actor = spotAnimationChanged.getActor();
		if (actor == null)
		{
			return;
		}

		if (!SpellEffect.isSpellEffect(actor.getSpotAnimation()))
		{
			return;
		}

		if (actor.equals(client.getLocalPlayer()))
		{
			return;
		}

		int spotAnimation = actor.getSpotAnimation();
		if (spotAnimation == 0)
		{
			return;
		}

		SpellEffect spellEffect = SpellEffect.getFromSpotAnimation(actor.getSpotAnimation());
		if (spellEffect == null)
		{
			return;
		}

		switch (spellEffect.getSpellType())
		{
			case FREEZE:
				checkFreezeSpellEffect(spotAnimationChanged, actor, spellEffect);
				break;
			case FREEZE_IMMUNITY:
			case TELEBLOCK_IMMUNITY:
				return;
			case TELEBLOCK:
				checkTeleblockSpellEffect(actor, spellEffect);
				break;
			case VENGEANCE:
				checkVengSpellEffect(spotAnimationChanged, actor, spellEffect);
				return;
			default:
				log.warn("Player spell effect has unknown type");
		}
	}

	private void checkFreezeSpellEffect(SpotAnimationChanged spotAnimationChanged, Actor actor, SpellEffect spellEffect)
	{
		List<SpellEffectInfo> actorFreezeSpellEffects = new ArrayList<>();
		for (SpellEffectInfo spellEffectInfo : spellEffects)
		{
			if (spotAnimationChanged.getActor().equals(spellEffectInfo.getActor()))
			{
				SpellEffectType spellType = spellEffectInfo.getSpellEffect().getSpellType();
				if (spellType.equals(SpellEffectType.FREEZE_IMMUNITY))
				{
					return;
				}

				if (spellType.equals(SpellEffectType.FREEZE))
				{
					actorFreezeSpellEffects.add(spellEffectInfo);
				}
			}
		}

		for (SpellEffectInfo spellEffectInfo : actorFreezeSpellEffects)
		{
			// Checks if the actor is already frozen. Extra second to prevent freeze & immunity timers both triggering.
			if (spellEffectInfo.getExpireClientTick() + 1 > client.getGameCycle())
			{
				return;
			}
		}

		spellEffects.add(new SpellEffectInfo(actor, spellEffect, client.getGameCycle(), false));
		frozenActors.put(actor, actor.getWorldLocation());
	}

	private void checkTeleblockSpellEffect(Actor actor, SpellEffect spellEffect)
	{
		Player player = (Player) actor;
		boolean isPrayingMage = false;
		if (player.getOverheadIcon() != null)
		{
			if (player.getOverheadIcon().ordinal() == 2 && spellEffect.isHalvable())
			{
				isPrayingMage = true;
			}
		}
		spellEffects.add(new SpellEffectInfo(actor, spellEffect, client.getGameCycle(), isPrayingMage));
	}

	private void checkRemoveTeleblockSpellEffect()
	{
		for (SpellEffectInfo spellEffect : new ArrayList<>(spellEffects))
		{
			if (spellEffect.getSpellEffect() == SpellEffect.TELEBLOCK || spellEffect.getSpellEffect() == SpellEffect.TELEBLOCK_IMMUNITY)
			{
				final boolean inDeadman = client.getWorldType().stream().anyMatch(x ->
						x == WorldType.DEADMAN || x == WorldType.SEASONAL_DEADMAN);
				final boolean inPvp = client.getWorldType().stream().anyMatch(x ->
						x == WorldType.PVP || x == WorldType.HIGH_RISK);
				final WorldPoint actorLoc = spellEffect.getActor().getWorldLocation();

				// Remove teleblock timer if actor leaves wilderness and it is not a pvp or deadman world
				if (!MapLocations.getWilderness(actorLoc.getPlane()).contains(actorLoc.getX(), actorLoc.getY()) && !inDeadman && !inPvp)
				{
					spellEffects.removeIf(x -> x.getActor().equals(spellEffect.getActor()) &&
							x.getSpellEffect().getSpellType().equals(SpellEffectType.TELEBLOCK) ||
							x.getSpellEffect().getSpellType().equals(SpellEffectType.TELEBLOCK_IMMUNITY));
				}

				// Remove teleblock timer if actor enters a PvP safezone and it is a PvP world
				else if (MapLocations.getPvpSafeZones(actorLoc.getPlane()).contains(actorLoc.getX(), actorLoc.getY()) && inPvp)
				{
					spellEffects.removeIf(x -> x.getActor().equals(spellEffect.getActor()) &&
							x.getSpellEffect().getSpellType().equals(SpellEffectType.TELEBLOCK) ||
							x.getSpellEffect().getSpellType().equals(SpellEffectType.TELEBLOCK_IMMUNITY));
				}

				// Remove teleblock timer if actor enters a deadman safezone and it is a deadman world
				else if (MapLocations.getDeadmanSafeZones(actorLoc.getPlane()).contains(actorLoc.getX(), actorLoc.getY()) && inDeadman)
				{
					spellEffects.removeIf(x -> x.getActor().equals(spellEffect.getActor()) &&
							x.getSpellEffect().getSpellType().equals(SpellEffectType.TELEBLOCK) ||
							x.getSpellEffect().getSpellType().equals(SpellEffectType.TELEBLOCK_IMMUNITY));
				}
			}
		}
	}

	private void checkVengSpellEffect(SpotAnimationChanged spotAnimationChanged, Actor actor, SpellEffect spellEffect)
	{
		spellEffects.add(new SpellEffectInfo(actor, spellEffect, client.getGameCycle(), false));
		for (SpellEffectInfo spellEffectInfo : spellEffects)
		{
			if (spotAnimationChanged.getActor().equals(spellEffectInfo.getActor()))
			{
				if (spellEffectInfo.getSpellEffect().equals(SpellEffect.VENGEANCE_ACTIVE))
				{
					return;
				}
			}
		}

		spellEffects.add(new SpellEffectInfo(actor, SpellEffect.VENGEANCE_ACTIVE, client.getGameCycle(), false));
	}

	@Subscribe
	public void onOverheadTextChanged(OverheadTextChanged overheadTextChanged)
	{
		spellEffects.removeIf(x -> x.getSpellEffect().equals(SpellEffect.VENGEANCE_ACTIVE) &&
				x.getActor().equals(overheadTextChanged.getActor()) &&
				overheadTextChanged.getOverheadText().equals("Taste vengeance!"));
	}

	@Subscribe
	public void onPlayerDespawned(PlayerDespawned playerDespawned)
	{
		spellEffects.removeIf(x -> x.getActor().equals(playerDespawned.getActor()));
		frozenActors.entrySet().removeIf(x -> x.getKey().equals(playerDespawned.getActor()));
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
		spellEffects.removeIf(x -> x.getActor().equals(npcDespawned.getActor()));
		frozenActors.entrySet().removeIf(x -> x.getKey().equals(npcDespawned.getActor()));
	}

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		if (frozenActors != null && frozenActors.size() > 0)
		{
			checkIfAnyFrozenActorsMoved();
		}

		if (config.showTeleblockTimersOverlay())
		{
			checkRemoveTeleblockSpellEffect();
		}
	}

	@Subscribe
	public void onClientTick(ClientTick clientTick)
	{
		checkExpiredSpellEffects();
	}

	/**
	 * Remove freeze timer if actor moves during freeze duration but after initial grace period (first 10% of freeze duration)
	 */
	private void checkIfAnyFrozenActorsMoved()
	{
		new HashMap<>(frozenActors).entrySet().stream()
				.filter(x -> !x.getKey().getWorldLocation().equals(x.getValue()))
				.forEach((entry) ->
				{
					new ArrayList<>(spellEffects).stream()
							.filter(x -> x.getActor().equals(entry.getKey()) &&
									x.getRemainingTime() < (0.9 * x.spellDurationToSpellTime(
											x.getSpellEffect().getSpellLength())))
							.forEach((spellEffect) -> spellEffects.remove(spellEffect));
					frozenActors.remove(entry.getKey());
				});
	}

	private void checkExpiredSpellEffects()
	{
		// Check for expired freeze spell effects
		new ArrayList<>(spellEffects).stream()
				.filter(x -> x.getSpellEffect().getSpellType() == SpellEffectType.FREEZE &&
						x.getExpireClientTick() - client.getGameCycle() < 0)
				.forEach(this::expireSpellEffect);

		// Check for expired teleblock spell effects
		new ArrayList<>(spellEffects).stream()
				.filter(x -> x.getSpellEffect().getSpellType() == SpellEffectType.TELEBLOCK &&
						x.getExpireClientTick() - client.getGameCycle() < 0)
				.forEach(this::expireSpellEffect);

		// Check for remaining expired spell effects
		spellEffects.removeIf(x -> x.getExpireClientTick() - client.getGameCycle() < 0 &&
				!x.getSpellEffect().equals(SpellEffect.VENGEANCE_ACTIVE));

		// Update remaining duration of non-expired spell effects
		for (SpellEffectInfo spellEffect : spellEffects)
		{
			spellEffect.setRemainingClientTicks(spellEffect.getExpireClientTick() - client.getGameCycle());
			spellEffect.setRemainingTime(spellEffect.getRemainingClientTicks() / 5);
		}
	}

	private void expireSpellEffect(SpellEffectInfo spellEffectInfo)
	{
		spellEffects.remove(spellEffectInfo);
		frozenActors.remove(spellEffectInfo.getActor());
		switch (spellEffectInfo.getSpellEffect().getSpellType())
		{
			case FREEZE:
				spellEffects.add(new SpellEffectInfo(spellEffectInfo.getActor(),
						SpellEffect.FREEZE_IMMUNITY, client.getGameCycle(), false));
				break;
			case TELEBLOCK:
				spellEffects.add(new SpellEffectInfo(spellEffectInfo.getActor(),
						SpellEffect.TELEBLOCK_IMMUNITY, client.getGameCycle(), false));
				break;
		}
	}
}
