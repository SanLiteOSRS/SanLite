package net.runelite.client.plugins.spelleffecttimers;

import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.*;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@PluginDescriptor(
		name = "[TEST] Spell Effect Timers",
		description = "Shows spell effect timers for freezes, vengeance and teleblock. This plugin is currently in a testing phase so please report any issues that occur.",
		tags = {"spell", "effect", "timers", "freeze", "timers", "barrage", "freezy", "ancients", "overlay", "root",
				"vengeance", "teleblock", "veng", "tb"},
		type = PluginType.SANLITE
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
	private SpellEffectTimersDebugOverlay debugOverlay;

	@Inject
	private SpellEffectTimersConfig config;

	@Getter(AccessLevel.PACKAGE)
	private List<SpellEffectInfo> spellEffects = new ArrayList<>();

	@Provides
	public SpellEffectTimersConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SpellEffectTimersConfig.class);
	}

	public void startUp()
	{
		overlayManager.add(overlay);
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}
	}

	public void shutDown()
	{
		overlayManager.remove(overlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
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

	@Subscribe
	public void onSpotAnimationChanged(SpotAnimationChanged spotAnimationChanged)
	{
		// Edge cases causing the plugin to not detect freezes
		// 1. Ahrim's full set effect spot anim overriding (id 400)
		// 2. Elysian hit effect might also trigger this
		// 3. Enchanted bolt effects

		GameState gameState = client.getGameState();
		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			return;
		}

		Actor actor = spotAnimationChanged.getActor();
		if (actor == null)
		{
			log.debug("Actor is null");
			return;
		}

		if (!SpellEffect.isSpellEffect(actor.getSpotAnimation()))
		{
			return;
		}

		if (actor.equals(client.getLocalPlayer()))
		{
			log.debug("Actor is local player");
			return;
		}

		int spotAnimation = actor.getSpotAnimation();
		if (spotAnimation == 0)
		{
			log.debug("Spot anim is 0 | value: {} | frame: {}", actor.getSpotAnimation(), actor.getSpotAnimationFrame());
			return;
		}

		log.debug("Spot anim frame: {} | tick: {}", actor.getSpotAnimationFrame(), client.getGameCycle());

		SpellEffect spellEffect = SpellEffect.getFromSpotAnimation(actor.getSpotAnimation());
		if (spellEffect == null)
		{
			log.debug("Spell effect is null");
			return;
		}

		switch (spellEffect.getSpellType())
		{
			case FREEZE:
				checkFreezeSpellEffect(spotAnimationChanged, actor, spellEffect);
				break;
			case FREEZE_IMMUNITY:
				return;
			case TELEBLOCK:
				// TODO: Implement teleblock support
			case VENGEANCE:
				// TODO: Implement vengeance support
			default:
				log.warn("Player spell effect has unknown type");
		}
	}

	private void checkFreezeSpellEffect(SpotAnimationChanged spotAnimationChanged, Actor actor, SpellEffect spellEffect)
	{
		log.debug("Check freeze triggered | animationId: {} | Tick: {}", actor.getSpotAnimation(), client.getGameCycle());
		List<SpellEffectInfo> actorFreezeSpellEffects = new ArrayList<>();
		for (SpellEffectInfo spellEffectInfo : spellEffects)
		{
			if (spotAnimationChanged.getActor().equals(spellEffectInfo.getActor()))
			{
				SpellEffectType spellType = spellEffectInfo.getSpellEffect().getSpellType();
				if (spellType.equals(SpellEffectType.FREEZE_IMMUNITY))
				{
					log.debug("{} has freeze immunity | {}", actor.getName(), client.getGameCycle());
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
				log.debug("{} already frozen or has freeze immunity", actor.getName());
				return;
			}
		}

		log.debug("Spell effect list size before add: {}", spellEffects.size());
		spellEffects.add(new SpellEffectInfo(actor, spellEffect, client.getGameCycle()));
		log.debug("Spell effect added: {} | {}", spellEffect.getName(), client.getGameCycle());
	}

	@Subscribe
	public void onPlayerDespawned(PlayerDespawned playerDespawned)
	{
		spellEffects.removeIf(x -> x.getActor().equals(playerDespawned.getActor()));
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
		spellEffects.removeIf(x -> x.getActor().equals(npcDespawned.getActor()));
	}

	@Subscribe
	public void onClientTick(ClientTick clientTick)
	{
		checkExpiredSpellEffects();
	}

	@Subscribe
	public void onActorPositionChanged(ActorPositionChanged actorPositionChanged)
	{
		GameState gameState = client.getGameState();
		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			return;
		}

		spellEffects.removeIf(x -> x.getActor().equals(actorPositionChanged.getActor()) &&
				x.getSpellEffect().getSpellType().equals(SpellEffectType.FREEZE));
	}

	private void checkExpiredSpellEffects()
	{
		// Check for expired freeze spell effects
		new ArrayList<>(spellEffects).stream()
				.filter(x -> x.getSpellEffect().getSpellType() == SpellEffectType.FREEZE &&
						x.getExpireClientTick() - client.getGameCycle() < 0)
				.forEach(this::expireFreezeSpellEffect);

		// Check for remaining expired spell effects
		if (spellEffects.removeIf(x -> x.getExpireClientTick() - client.getGameCycle() < 0))
		{
			log.debug("Removed non-freeze spell effect | tick: {}", client.getGameCycle());
		}

		// Update remaining duration of non-expired spell effects
		for (SpellEffectInfo spellEffect : spellEffects)
		{
			spellEffect.setRemainingClientTicks(spellEffect.getExpireClientTick() - client.getGameCycle());
			spellEffect.setRemainingTime(spellEffect.getRemainingClientTicks() / 5);
		}
	}

	private void expireFreezeSpellEffect(SpellEffectInfo spellEffectInfo)
	{
		spellEffects.remove(spellEffectInfo);
		log.debug("Spell effect {} removed | {}", spellEffectInfo.getSpellEffect().getName(), client.getGameCycle());
		spellEffects.add(new SpellEffectInfo(spellEffectInfo.getActor(),
				SpellEffect.FREEZE_IMMUNITY, client.getGameCycle()));
		log.debug("Spell effect Freeze Immunity added | {}", client.getGameCycle());
	}
}
