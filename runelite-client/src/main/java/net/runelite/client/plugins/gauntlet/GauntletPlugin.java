package net.runelite.client.plugins.gauntlet;

import com.google.inject.Provides;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.Arrays;

@Slf4j
@PluginDescriptor(
		name = "The Gauntlet",
		description = "Assists with the Gauntlet minigame",
		tags = {"combat", "overlay", "pve", "pvm", "gauntlet", "crystal", "hunllef", "custom", "minigame"},
		type = PluginType.SANLITE
)
public class GauntletPlugin extends Plugin
{

	// TODO: Check if corrupted is the same
	private static final int[] GAUNTLET_REGIONS = {
			7512
	};

	@Inject
	private Client client;

	@Inject
	private GauntletConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private GauntletOverlay overlay;

	@Inject
	private GauntletDebugOverlay debugOverlay;

	@Inject
	private ClientThread clientThread;

	@Getter
	private GauntletBoss gauntletBoss;

	private static boolean isNpcGauntletBoss(int npcId)
	{
		return npcId == NpcID.CRYSTALLINE_HUNLLEF || npcId == NpcID.CRYSTALLINE_HUNLLEF_9022 ||
				npcId == NpcID.CRYSTALLINE_HUNLLEF_9023 || npcId == NpcID.CRYSTALLINE_HUNLLEF_9024;
	}

	@Provides
	GauntletConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GauntletConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}
		clientThread.invoke(this::reset);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
		gauntletBoss = null;
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
		gauntletBoss = null;
	}

	/**
	 * Checks what the next the attack style should be.
	 *
	 * @param attackStyle Ranged or magic
	 */
	private void checkGauntletBossAttackStyleSwitch(final GauntletBoss.AttackStyle attackStyle)
	{
		// Check if attack style is not a special attack
		if (attackStyle != GauntletBoss.AttackStyle.MAGIC && attackStyle != GauntletBoss.AttackStyle.RANGED)
		{
			return;
		}

		// Sets the gauntlets boss starting attack style
		if (gauntletBoss.getCurrentAttackStyle() == null)
		{
			gauntletBoss.setCurrentAttackStyle(attackStyle);
		}
		else if (gauntletBoss.getAttacksUntilSwitch() <= 0 &&
				gauntletBoss.getCurrentAttackStyle() == GauntletBoss.AttackStyle.MAGIC)
		{
			log.debug("Switch to ranged: " + gauntletBoss.getAttacksUntilSwitch());
			gauntletBoss.setCurrentAttackStyle(GauntletBoss.AttackStyle.RANGED);
			gauntletBoss.setAttacksUntilSwitch(GauntletBoss.ATTACKS_PER_SWITCH);
			gauntletBoss.setChangedAttackStyleThisTick(true);
		}
		else if (gauntletBoss.getAttacksUntilSwitch() <= 0 &&
				gauntletBoss.getCurrentAttackStyle() == GauntletBoss.AttackStyle.RANGED)
		{
			log.debug("Switch to magic: " + gauntletBoss.getAttacksUntilSwitch());
			gauntletBoss.setCurrentAttackStyle(GauntletBoss.AttackStyle.MAGIC);
			gauntletBoss.setAttacksUntilSwitch(GauntletBoss.ATTACKS_PER_SWITCH);
			gauntletBoss.setChangedAttackStyleThisTick(true);
		}
		// Correct attacks until switch when de-sync might occur (eg. plugin enabled during kill)
		else if (gauntletBoss.getAttacksUntilSwitch() > 0 &&
				gauntletBoss.getCurrentAttackStyle() != attackStyle)
		{
			log.debug("De-sync switch to: " + attackStyle + " | Attacks left: " + gauntletBoss.getAttacksUntilSwitch());
			gauntletBoss.setCurrentAttackStyle(attackStyle);
			gauntletBoss.setAttacksUntilSwitch(GauntletBoss.ATTACKS_PER_SWITCH - 1);
			gauntletBoss.setChangedAttackStyleThisTick(true);
		}
	}

	/**
	 * Checks attack style and phase to determine the amount of hits.
	 * This is done because the alchemical hydra attacks with multiple
	 * heads and the numbers of attack change per phase.
	 *
	 * @param attackStyle Ranged or magic
	 */
	private void onGauntletBossAttack(final GauntletBoss.AttackStyle attackStyle)
	{

		gauntletBoss.setAttacksUntilSwitch(gauntletBoss.getAttacksUntilSwitch() - 1);
		checkGauntletBossAttackStyleSwitch(attackStyle);
		gauntletBoss.setNextAttackTick(client.getTickCount() + GauntletBoss.ATTACK_RATE);
	}

	/**
	 * Checks if the gauntlets boss recent projectile id matches an attack style.
	 * If this is true onGauntletBossAttack is called and the remainingProjectileCount is
	 * reduced by 1 to prevent more function calls than attacks fired.
	 */
	private void checkGauntletBossAttacks()
	{
		if (gauntletBoss != null)
		{
			int recentProjectileId = gauntletBoss.getRecentProjectileId();

			if (recentProjectileId != -1 && gauntletBoss.getRemainingProjectileCount() > 0)
			{
				switch (recentProjectileId)
				{
					case ProjectileID.GAUNTLET_BOSS_MAGIC:
						log.debug("onAttack magic: " + gauntletBoss.getRemainingProjectileCount());
						gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() - 1);
						onGauntletBossAttack(GauntletBoss.AttackStyle.MAGIC);
						break;
					case ProjectileID.GAUNTLET_BOSS_MAGIC_DISABLE_PRAYERS:
						log.debug("onAttack magic disable prayers: " + gauntletBoss.getRemainingProjectileCount());
						gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() - 1);
						onGauntletBossAttack(GauntletBoss.AttackStyle.MAGIC);
						break;
					case ProjectileID.GAUNTLET_BOSS_RANGED:
						log.debug("onAttack ranged: " + gauntletBoss.getRemainingProjectileCount());
						gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() - 1);
						onGauntletBossAttack(GauntletBoss.AttackStyle.RANGED);
						break;
					default:
						log.warn("Unreachable default case for checkGauntletBossAttacks | projectile id: {}", recentProjectileId);
				}
			}
		}
	}

	private void checkGauntletBossCrystalAttack()
	{
		if (gauntletBoss != null)
		{
			int animationId = gauntletBoss.getNpc().getAnimation();
			if (animationId != gauntletBoss.getLastTickAnimation())
			{
				int ticksSinceLastAttack = client.getTickCount() - gauntletBoss.getLastAttackTick();
				if (animationId == AnimationID.GAUNTLET_BOSS_CRYSTAL_ATTACK && ticksSinceLastAttack >= 4)
				{
					log.debug("onAttack crystal");
					gauntletBoss.setAttacksUntilSwitch(gauntletBoss.getAttacksUntilSwitch() - 1);
					checkGauntletBossAttackStyleSwitch(gauntletBoss.getCurrentAttackStyle());
					gauntletBoss.setLastAttackTick(client.getTickCount());
					gauntletBoss.setNextAttackTick(client.getTickCount() + GauntletBoss.ATTACK_RATE);
				}
			}
		}
	}

	private boolean inGauntletInstance()
	{
		return Arrays.equals(client.getMapRegions(), GAUNTLET_REGIONS) && client.isInInstancedRegion();
	}

	@Subscribe
	public void onProjectileMoved(ProjectileMoved event)
	{
		if (inGauntletInstance() && gauntletBoss != null)
		{
			Projectile projectile = event.getProjectile();
			int projectileId = projectile.getId();

			if (!gauntletBoss.isGauntletBossRangedAttack(projectileId) && !gauntletBoss.isGauntletBossMagicAttack(projectileId))
			{
				return;
			}

			// The event fires once before the projectile starts moving,
			// and we only want to check each projectile once
			if (client.getGameCycle() >= projectile.getStartMovementCycle())
			{
				return;
			}

			int ticksSinceLastAttack = client.getTickCount() - gauntletBoss.getLastAttackTick();
			log.debug(client.getTickCount() + " | Projectile | ticks since last attack: " + ticksSinceLastAttack);

			if (ticksSinceLastAttack >= 4 || gauntletBoss.getLastAttackTick() == -100)
			{
				log.debug(client.getTickCount() + " | Projectile confirmed: " + projectileId);
				gauntletBoss.setRecentProjectileId(projectile.getId());
				gauntletBoss.setLastAttackTick(client.getTickCount());
				gauntletBoss.setRemainingProjectileCount(gauntletBoss.getRemainingProjectileCount() + 1);
			}
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
	public void onNpcSpawned(NpcSpawned event)
	{
		if (inGauntletInstance())
		{
			NPC npc = event.getNpc();
			if (isNpcGauntletBoss(npc.getId()))
			{
				gauntletBoss = new GauntletBoss(npc);
			}

			if (gauntletBoss == null)
			{
				return;
			}

			if (gauntletBoss.isNpcCrystalAttack(npc.getId()))
			{
				gauntletBoss.getCrystalEffects().add(npc);
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		NPC npc = event.getNpc();
		if (isNpcGauntletBoss(npc.getId()))
		{
			reset();
		}

		if (gauntletBoss == null)
		{
			return;
		}

		if (gauntletBoss.isNpcCrystalAttack(npc.getId()))
		{
			gauntletBoss.getCrystalEffects().remove(npc);
		}
	}

	@Subscribe
	protected void onClientTick(ClientTick event)
	{
		if (inGauntletInstance())
		{
			checkGauntletBossAttacks();
			checkGauntletBossCrystalAttack();
		}
	}
}
