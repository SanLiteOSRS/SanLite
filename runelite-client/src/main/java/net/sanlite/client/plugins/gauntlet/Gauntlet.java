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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.sanlite.client.plugins.gauntlet.event.*;
import net.sanlite.client.plugins.gauntlet.id.GauntletBossId;
import net.sanlite.client.plugins.gauntlet.id.GauntletPlayerId;

import java.util.*;
import java.util.function.Consumer;

@Slf4j
class Gauntlet
{
	@Getter(AccessLevel.PACKAGE)
	private final List<GameObject> resourceSpots = new ArrayList<>();
	@Getter(AccessLevel.PACKAGE)
	private final List<GameObject> utilitySpots = new ArrayList<>();
	@Getter
	private final List<NPC> demiBosses;
	private final Consumer<GauntletEvent> emitGauntletEvent;
	@Getter
	private boolean inBossRoom;
	@Getter
	private GauntletBoss boss;

	Gauntlet(Consumer<GauntletEvent> emitGauntletEvent)
	{
		this.inBossRoom = false;
		this.demiBosses = new ArrayList<>();
		this.emitGauntletEvent = emitGauntletEvent;
	}

	void checkFinalRoomEntered(int varbitValue)
	{
		switch (varbitValue)
		{
			case 0:
				if (inBossRoom)
				{
					inBossRoom = false;
				}
				break;
			case 1:
				if (!inBossRoom)
				{
					this.inBossRoom = true;
					emitGauntletEvent.accept(new BossRoomEntered());
					log.debug("Player entered boss room in the gauntlet");
				}
				break;
			default:
				log.warn("Could not determine gauntlet boss room status. Unknown varbit value: {}", varbitValue);
		}
	}

	void newRoomLoading()
	{
		resourceSpots.clear();
		utilitySpots.clear();
	}

	void resourceSpotSpawned(GameObject gameObject)
	{
		resourceSpots.add(gameObject);
	}

	void resourceSpotDespawned(GameObject gameObject)
	{
		resourceSpots.remove(gameObject);
	}

	void utilitySpotSpawned(GameObject gameObject)
	{
		utilitySpots.add(gameObject);
	}

	void utilitySpotDespawned(GameObject gameObject)
	{
		utilitySpots.remove(gameObject);
	}

	void bossSpawned(NPC npc)
	{
		boss = new GauntletBoss(npc, emitGauntletEvent);
	}

	void bossDespawned()
	{
		boss = null;
	}

	void demiBossSpawned(NPC npc)
	{
		demiBosses.add(npc);
		emitGauntletEvent.accept(new DemiBossSpawned(npc, npc.getWorldLocation()));
	}

	void demiBossDespawned(NPC npc)
	{
		demiBosses.remove(npc);
		emitGauntletEvent.accept(new DemiBossDespawned(npc));
	}

	void onProjectile(int projectileId, int tickCount)
	{
		GauntletBoss.AttackStyle attackStyle = GauntletBossId.getAttackStyle(projectileId);
		if (attackStyle == null)
		{
			return;
		}

		boss.setLastProjectileId(projectileId);
		if (GauntletBossId.isDisablePrayerAttack(projectileId))
		{
			boss.disablePrayerAttack(tickCount);
			return;
		}

		boss.basicAttack(attackStyle, tickCount);
	}

	void onAnimation(Actor actor, int animationId, int tickCount)
	{
		if (actor instanceof NPC)
		{
			switch (animationId)
			{
				case GauntletBossId.Anim.TRAMPLE_ATTACK:
					boss.setLastAttackAnimationId(animationId);
					boss.trample(tickCount);
					break;
				case GauntletBossId.Anim.SUMMON_CRYSTAL_NPC:
					boss.setLastAttackAnimationId(animationId);
					boss.crystalAttack(tickCount);
					break;
				case GauntletBossId.Anim.SWITCH_TO_MAGIC:
					boss.setLastAttackAnimationId(animationId);
					boss.verifyAttackStyleSwitch(GauntletBoss.AttackStyle.MAGIC, tickCount);
					break;
				case GauntletBossId.Anim.SWITCH_TO_RANGED:
					boss.setLastAttackAnimationId(animationId);
					boss.verifyAttackStyleSwitch(GauntletBoss.AttackStyle.RANGED, tickCount);
					break;
				case GauntletBossId.Anim.PROJECTILE_ATTACK:
					// Ignore this animation
					break;
				default:
					log.warn("Could not determine gauntlet boss animation. Unknown animation id: {}", animationId);
			}
		}
		else if (actor instanceof Player)
		{
			if (animationId == GauntletPlayerId.Anim.DEATH)
			{
				emitGauntletEvent.accept(new PlayerDeath());
				return;
			}

			if (!GauntletPlayerId.isPlayerAttack(animationId))
			{
				return;
			}

			boss.attacked(GauntletPlayerId.getProtectedStyleForAnimation(animationId), tickCount);
		}
	}
}
