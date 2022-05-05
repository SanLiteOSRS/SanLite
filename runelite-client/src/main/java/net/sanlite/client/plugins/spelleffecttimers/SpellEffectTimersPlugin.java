/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
 * Copyright (c) 2019, Jajack
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
package net.sanlite.client.plugins.spelleffecttimers;

import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.*;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.sanlite.client.game.MapLocations;
import net.sanlite.client.plugins.spelleffecttimers.id.AnimationID;

import javax.inject.Inject;
import java.util.*;

@PluginDescriptor(
		name = "Spell Effect Timers",
		description = "Shows spell effect timers for freezes, vengeance, staff of the dead and teleblock",
		tags = {"spell", "effect", "timers", "freeze", "timers", "barrage", "freezy", "ancients", "overlay", "root",
				"vengeance", "teleblock", "veng", "tb", "pvp", "sanlite"},
		enabledByDefault = false
)
@Slf4j
public class SpellEffectTimersPlugin extends Plugin
{
	private static final int CACHED_TELEBLOCK_TIMEOUT_TICKS = 34;

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private SpellEffectTimersOverlay overlay;

	@Inject
	private SpellEffectTimersConfig config;

	@Getter(AccessLevel.PACKAGE)
	private List<SpellEffectInfo> spellEffects;

	@Getter(AccessLevel.PACKAGE)
	private Map<Actor, WorldPoint> frozenActors;

	@Getter(AccessLevel.PACKAGE)
	private Map<SpellEffectInfo, Integer> cachedTeleblocks;

	@Provides
	public SpellEffectTimersConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SpellEffectTimersConfig.class);
	}

	public void startUp()
	{
		spellEffects = new ArrayList<>();
		frozenActors = new HashMap<>();
		cachedTeleblocks = new HashMap<>();
		overlayManager.add(overlay);
	}

	public void shutDown()
	{
		spellEffects = null;
		frozenActors = null;
		cachedTeleblocks = null;
		overlayManager.remove(overlay);
	}

	@Subscribe
	public void onGraphicChanged(GraphicChanged graphicChanged)
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

		Actor actor = graphicChanged.getActor();
		if (actor == null)
		{
			return;
		}

		int spotAnimation = actor.getGraphic();
		if (spotAnimation == 0)
		{
			return;
		}

		if (!SpellEffect.isSpellEffect(spotAnimation))
		{
			return;
		}

		if (actor instanceof NPC && !config.showFreezeTimersOnNpcs())
		{
			return;
		}

		if (actor.equals(client.getLocalPlayer()) && !config.showFreezeTimerOnOwnPlayer() ||
				actor.equals(client.getLocalPlayer()) && !SpellEffect.isSpellEffectTypeFreeze(spotAnimation))
		{
			return;
		}

		SpellEffect spellEffect = SpellEffect.getFromGraphicId(actor.getGraphic());
		if (spellEffect == null)
		{
			return;
		}

		switch (spellEffect.getSpellType())
		{
			case FREEZE:
				checkFreezeSpellEffect(graphicChanged, actor, spellEffect);
				break;
			case FREEZE_IMMUNITY:
			case TELEBLOCK_IMMUNITY:
				return;
			case STAFF_OF_THE_DEAD_SPECIAL:
				checkSotdSpellEffect(graphicChanged, actor, spellEffect);
				break;
			case TELEBLOCK:
				checkTeleblockSpellEffect(actor, spellEffect);
				break;
			case VENGEANCE:
				checkVengSpellEffect(actor, spellEffect);
				return;
			default:
				log.warn("Player spell effect has unknown type");
		}
	}

	@Subscribe
	public void onOverheadTextChanged(OverheadTextChanged overheadTextChanged)
	{
		spellEffects.removeIf(x -> x.getSpellEffect().equals(SpellEffect.VENGEANCE_ACTIVE) &&
				x.getActor().equals(overheadTextChanged.getActor()) &&
				overheadTextChanged.getOverheadText().equals("Taste vengeance!"));
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		Actor actor = event.getActor();
		if (actor == null)
		{
			return;
		}

		if (config.showVengTimersOverlay() && actor.getAnimation() == AnimationID.ENERGY_TRANSFER_VENGEANCE_OTHER)
		{
			spellEffects.add(new SpellEffectInfo(actor, SpellEffect.VENGEANCE, client.getGameCycle(), false));
		}

		removeTeleblockOnTeleport(actor);
	}

	@Subscribe
	public void onPlayerSpawned(PlayerSpawned event)
	{
		Actor actor = event.getActor();
		if (actor == null)
		{
			return;
		}

		String name = actor.getName();

		// Re-add teleblock spell effect if the player had one cached
		if (config.showTeleblockTimersOverlay() && name != null)
		{
			final String cleanedName = name.replace('\u00A0', ' ');
			cachedTeleblocks.entrySet().stream()
					.filter(x -> Objects.equals(Objects.requireNonNull(x.getKey().getActor().getName()).replace('\u00A0', ' '), cleanedName))
					.findFirst()
					.ifPresent(x -> addTeleblockFromCache(x.getKey(), actor));
		}
	}

	@Subscribe
	public void onPlayerDespawned(PlayerDespawned event)
	{
		if (config.showTeleblockTimersOverlay())
		{
			// Cache teleblock spell effect
			spellEffects.stream()
					.filter(x -> x.getActor().equals(event.getActor()) && x.getSpellEffect().getSpellType().equals(SpellEffectType.TELEBLOCK))
					.findFirst()
					.ifPresent(this::cacheTeleblock);
		}

		spellEffects.removeIf(x -> x.getActor().equals(event.getActor()));
		frozenActors.entrySet().removeIf(x -> x.getKey().equals(event.getActor()));
	}

	@Subscribe
	public void onActorDeath(ActorDeath event)
	{
		Actor actor = event.getActor();
		if (actor == null)
		{
			return;
		}

		if (!(actor instanceof Player))
		{
			return;
		}

		spellEffects.removeIf(x -> x.getActor().equals(actor));
		frozenActors.entrySet().removeIf(x -> x.getKey().equals(actor));
	}

	private void cacheTeleblock(SpellEffectInfo teleblockSpellEffect)
	{
		cachedTeleblocks.put(teleblockSpellEffect, client.getTickCount());
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

		// Remove cached teleblock if the player does not show up again within the timeout period
		cachedTeleblocks.entrySet().removeIf(x -> x.getValue() + CACHED_TELEBLOCK_TIMEOUT_TICKS < client.getTickCount());
	}

	@Subscribe
	public void onClientTick(ClientTick clientTick)
	{
		checkExpiredSpellEffects();
	}

	private void checkFreezeSpellEffect(GraphicChanged graphicChanged, Actor actor, SpellEffect spellEffect)
	{
		List<SpellEffectInfo> actorFreezeSpellEffects = new ArrayList<>();
		for (SpellEffectInfo spellEffectInfo : spellEffects)
		{
			if (graphicChanged.getActor().equals(spellEffectInfo.getActor()))
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
			// Checks if the actor is already frozen. Extra client tick to prevent freeze & immunity timers both triggering
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
				final boolean inDeadman = client.getWorldType().stream().anyMatch(x -> x == WorldType.DEADMAN);
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

	private void removeTeleblockOnTeleport(Actor actor)
	{
		SpellEffectInfo spellEffectInfo = spellEffects.stream()
				.filter(x -> x.getActor().equals(actor) && x.getSpellEffect().getSpellType().equals(SpellEffectType.TELEBLOCK))
				.findFirst()
				.orElse(null);

		if (spellEffectInfo == null)
		{
			return;
		}

		int animationId = actor.getAnimation();
		if (animationId == -1)
		{
			return;
		}

		if (animationId == AnimationID.STANDARD_PURPLE_TELEPORT ||
				animationId == AnimationID.SEED_POD_TELEPORT ||
				animationId == AnimationID.WILDERNESS_OBELISK_TELEPORT ||
				animationId == AnimationID.XERICS_TALISMAN_TELEPORT ||
				animationId == AnimationID.FAIRY_RING_TELEPORT ||
				animationId == AnimationID.ECTOPHIAL_TELEPORT ||
				animationId == AnimationID.SCROLL_TELEPORT ||
				animationId == AnimationID.TABLET_TELEPORT ||
				animationId == AnimationID.PHARAOHS_SCEPTRE_TELEPORT)
		{
			spellEffects.remove(spellEffectInfo);
		}
	}

	void addTeleblockFromCache(SpellEffectInfo spellEffectInfo, Actor newActor)
	{
		spellEffectInfo.setActor(newActor);
		spellEffects.add(spellEffectInfo);
		cachedTeleblocks.remove(spellEffectInfo);
	}

	private void checkVengSpellEffect(Actor actor, SpellEffect spellEffect)
	{
		spellEffects.add(new SpellEffectInfo(actor, spellEffect, client.getGameCycle(), false));
		for (SpellEffectInfo spellEffectInfo : spellEffects)
		{
			if (actor.equals(spellEffectInfo.getActor()))
			{
				if (spellEffectInfo.getSpellEffect().equals(SpellEffect.VENGEANCE_ACTIVE))
				{
					return;
				}
			}
		}

		spellEffects.add(new SpellEffectInfo(actor, SpellEffect.VENGEANCE_ACTIVE, client.getGameCycle(), false));
	}

	private void checkSotdSpellEffect(GraphicChanged graphicChanged, Actor actor, SpellEffect spellEffect)
	{
		// Remove previous timer if special attack is used again
		spellEffects.removeIf(x -> x.getSpellEffect().getSpellType().equals((SpellEffectType.STAFF_OF_THE_DEAD_SPECIAL))
				&& x.getActor().equals(graphicChanged.getActor()));

		spellEffects.add(new SpellEffectInfo(actor, spellEffect, client.getGameCycle(), false));
	}

	/**
	 * Remove freeze timer if actor moves during freeze duration
	 * Checks for if the actor moved more than 1 square to account for dragon spear specials
	 */
	private void checkIfAnyFrozenActorsMoved()
	{
		List<Actor> actorsPendingRemoval = new ArrayList<>();
		for (Map.Entry<Actor, WorldPoint> frozenActor : frozenActors.entrySet())
		{
			Actor actor = frozenActor.getKey();
			WorldPoint oldLocation = frozenActor.getValue();

			// Checks if actor moved 1 square
			if (actor.getWorldLocation().getX() == (oldLocation.getX() - 1)
					|| actor.getWorldLocation().getX() == (oldLocation.getX() + 1)
					|| actor.getWorldLocation().getY() == (oldLocation.getY() - 1)
					|| actor.getWorldLocation().getY() == (oldLocation.getY() + 1))
			{
				// Set stored freeze location to new location after the spear, so that multiple spear specs wont cause issues
				frozenActor.setValue(actor.getWorldLocation());
			}
			// Will run if actor has moved and the movement is not 1 square
			else if (!actor.getWorldLocation().equals(oldLocation))
			{
				new ArrayList<>(spellEffects).stream()
						.filter(spellEffect -> spellEffect.getActor().equals(actor) &&
								spellEffect.getSpellEffect().getSpellType().equals(SpellEffectType.FREEZE))
						.forEach((spellEffect) ->
						{
							actorsPendingRemoval.add(actor);
							spellEffects.remove(spellEffect);
						});
			}
		}

		frozenActors.entrySet().removeIf(actorsPendingRemoval::contains);
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
