/*
 * Copyright (c) 2021, Siraz <https://github.com/Sirazzz>
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
package net.sanlite.client.plugins.gauntlet;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.sanlite.client.plugins.gauntlet.event.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Slf4j
public class GauntletBoss
{
	// Inactive damage tile NULL_36047
	// Active damage tile NULL_36048
	static final int ATTACK_RATE = 5; // 5 ticks between each attack
	static final int ATTACKS_PER_SWITCH = 4; // 4 attacks per style switch
	static final int ATTACKS_PER_OVERHEAD_SWITCH = 6; // 6 attacks per overhead switch

	@Getter
	private final NPC npc;
	@Getter
	private final List<GauntletCrystal> crystals;
	private final Consumer<GauntletEvent> emitGauntletEvent;
	@Getter
	private AttackStyle currentAttackStyle;
	@Getter
	private ProtectionPrayer currentProtectionPrayer;
	@Getter
	private int attacksUntilSwitch;
	@Getter
	private int attacksUntilOverheadSwitch;
	@Getter
	private int nextAttackTick;
	@Getter
	private int lastAttackTick;
	@Getter
	private int lastAttackedTick;
	@Getter
	private ProtectionPrayer lastAttackedStyle;
	@Getter
	@Setter
	private int lastProjectileId;
	@Getter
	@Setter
	private int lastAttackAnimationId;


	GauntletBoss(NPC npc, Consumer<GauntletEvent> emitGauntletBossEvent)
	{
		this.npc = npc;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.lastAttackedTick = -100;
		this.lastProjectileId = -1;
		this.lastAttackAnimationId = -1;
		this.attacksUntilSwitch = ATTACKS_PER_SWITCH;
		this.attacksUntilOverheadSwitch = ATTACKS_PER_OVERHEAD_SWITCH;
		this.currentAttackStyle = GauntletBoss.AttackStyle.RANGED;
		this.currentProtectionPrayer = null;
		this.lastAttackedStyle = null;
		this.crystals = new ArrayList<>();
		this.emitGauntletEvent = emitGauntletBossEvent;
	}

	public static ProtectionPrayer getProtectedStyle(NPC npc)
	{
		NPCComposition composition = npc.getComposition();
		if (composition == null)
		{
			log.warn("Could not determine protected style because NPC: {} has null composition", npc.getName());
			return null;
		}

		HeadIcon overheadIcon = composition.getOverheadIcon();
		if (overheadIcon == null)
		{
			log.warn("Could not determine protected style because NPC: {} has null overhead icon", npc.getName());
			return null;
		}

		return getProtectedStyle(overheadIcon);
	}

	public static ProtectionPrayer getProtectedStyle(HeadIcon overheadIcon)
	{
		switch (overheadIcon)
		{
			case RANGED:
				return ProtectionPrayer.RANGED;
			case MELEE:
				return ProtectionPrayer.MELEE;
			case MAGIC:
				return ProtectionPrayer.MAGIC;
			default:
				log.warn("Could not determine gauntlet boss protected style. Head icon ordinal: {}", overheadIcon.ordinal());
				return null;
		}
	}

	/**
	 * Sets the remaining hits for the current Gauntlet boss attack style.
	 *
	 * @param attackStyle Ranged or magic
	 */
	void basicAttack(final AttackStyle attackStyle, int tickCount)
	{
		log.debug("Gauntlet boss {} attack. Tick: {} ", attackStyle, tickCount);
		attack(tickCount, true);
	}

	void disablePrayerAttack(int tickCount)
	{
		log.debug("Gauntlet boss disable prayer attack. Tick: {} ", tickCount);
		attack(tickCount, true);
		emitGauntletEvent.accept(new PlayerPrayerDisabled());
	}

	void crystalAttack(int tickCount)
	{
		log.debug("Gauntlet boss CRYSTAL attack. Tick: {} ", tickCount);
		attack(tickCount, true);
		emitGauntletEvent.accept(new BossCrystalAttack());
	}

	void trample(int tickCount)
	{
		log.debug("Gauntlet boss TRAMPLE attack. Tick: {} ", tickCount);
		attack(tickCount, false);
	}

	private void attack(int tickCount, boolean isDecrementAttack)
	{
		if (nextAttackTick != -100 && (nextAttackTick - tickCount) > 1)
		{
			log.warn("Gauntlet boss attack occurred at tick {}, expected tick {}", tickCount, nextAttackTick);
		}

		lastAttackTick = tickCount;
		nextAttackTick = tickCount + GauntletBoss.ATTACK_RATE;
		if (isDecrementAttack)
		{
			attacksUntilSwitch = attacksUntilSwitch - 1;
		}

		if (attacksUntilSwitch <= 0)
		{
			switchAttackStyle();
		}
	}

	void attacked(ProtectionPrayer attackStyle, int tickCount)
	{
		if (lastAttackedTick >= tickCount)
		{
			log.warn("Ignored early player {} attack at tick {} while last attack tick was {}", attackStyle, tickCount, lastAttackedTick);
			return;
		}

		// Set protected style for first attack on boss
		if (currentProtectionPrayer == null)
		{
			currentProtectionPrayer = getProtectedStyle(npc);
		}

		log.debug("Gauntlet boss was attacked with {} on protect {} at tick {}", attackStyle, currentProtectionPrayer, tickCount);
		lastAttackedStyle = attackStyle;

		if (attackStyle != currentProtectionPrayer)
		{
			lastAttackedTick = tickCount;
			attacksUntilOverheadSwitch = attacksUntilOverheadSwitch - 1;
		}

		if (attacksUntilOverheadSwitch <= 0)
		{
			attacksUntilOverheadSwitch = GauntletBoss.ATTACKS_PER_OVERHEAD_SWITCH;
			emitGauntletEvent.accept(new BossProtectionPrayerSwitched());
			log.debug("Gauntlet boss attacks until overhead switch reset at tick {}", tickCount);
		}
	}

	void checkProtectionPrayer(int tickCount, boolean isInBossRoom)
	{
		ProtectionPrayer protectionPrayer = getProtectedStyle(npc);
		if (protectionPrayer == currentProtectionPrayer)
		{
			return;
		}

		// Handle protection prayer count de-sync
		if (isInBossRoom && protectionPrayer != null && attacksUntilOverheadSwitch > 0 &&
				attacksUntilOverheadSwitch != ATTACKS_PER_OVERHEAD_SWITCH)
		{
			log.warn("Gauntlet boss switched to protected style {} early at tick {} with {} remaining attacks",
					protectionPrayer, tickCount, attacksUntilOverheadSwitch);
			attacksUntilOverheadSwitch = GauntletBoss.ATTACKS_PER_OVERHEAD_SWITCH;
			emitGauntletEvent.accept(new BossProtectionPrayerSwitched());
		}

		switchProtectionPrayer(protectionPrayer);
	}

	private void switchProtectionPrayer(ProtectionPrayer protectionPrayer)
	{
		currentProtectionPrayer = protectionPrayer;
		log.debug("Gauntlet boss switched protect style to: {}", currentProtectionPrayer);
	}

	private void switchAttackStyle()
	{
		AttackStyle newAttackStyle = getNextAttackStyle();
		currentAttackStyle = newAttackStyle;
		attacksUntilSwitch = GauntletBoss.ATTACKS_PER_SWITCH;
		emitGauntletEvent.accept(new BossAttackStyleSwitched(newAttackStyle));
		log.debug("Gauntlet boss switched attack style to: {}", newAttackStyle);
	}

	void verifyAttackStyleSwitch(AttackStyle attackStyle, int tickCount)
	{
		if (attacksUntilSwitch == GauntletBoss.ATTACKS_PER_SWITCH && attackStyle == currentAttackStyle)
		{
			return;
		}

		log.warn("Style switched to: {} at tick {} before remaining {} attacks occurred", attackStyle, tickCount, attacksUntilSwitch);
		switchAttackStyle();
	}

	void crystalSpawned(NPC npc, int tickCount)
	{
		crystals.add(new GauntletCrystal(npc, tickCount));
	}

	void crystalDespawned(NPC npc)
	{
		crystals.removeIf(crystal -> crystal.getNpc() == npc);
	}

	private AttackStyle getNextAttackStyle()
	{
		if (currentAttackStyle == GauntletBoss.AttackStyle.RANGED)
		{
			return GauntletBoss.AttackStyle.MAGIC;
		}

		return GauntletBoss.AttackStyle.RANGED;
	}

	public enum AttackStyle
	{
		MAGIC,
		RANGED
	}

	public enum ProtectionPrayer
	{
		MAGIC,
		RANGED,
		MELEE
	}
}
