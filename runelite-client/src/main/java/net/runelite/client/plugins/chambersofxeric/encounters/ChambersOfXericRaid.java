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
package net.runelite.client.plugins.chambersofxeric.encounters;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.game.AreaOfEffectProjectile;
import net.runelite.client.plugins.chambersofxeric.ChambersOfXericConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Slf4j
public class ChambersOfXericRaid
{

	@Getter
	@Setter
	private List<GraphicsObject> graphicObjects;

	@Getter
	private List<GameObject> gameObjects;

	@Getter
	private List<AreaOfEffectProjectile> areaOfEffectProjectiles;

	@Getter
	private List<NPC> highlightedNpcs;


	public ChambersOfXericRaid()
	{
		this.graphicObjects = new ArrayList<>();
		this.gameObjects = new ArrayList<>();
		this.areaOfEffectProjectiles = new CopyOnWriteArrayList<>();
		this.highlightedNpcs = new ArrayList<>();
	}

	/**
	 * Checks if the given npc id is a from any Chambers of Xeric encounter
	 *
	 * @param npcId npc identifier
	 * @return is npc boss from Chambers of Xeric encounter
	 */
	public static boolean isNpcChambersOfXericEncounter(int npcId)
	{
		return npcId == NpcID.LIZARDMAN_SHAMAN_7573 ||
				npcId == NpcID.LIZARDMAN_SHAMAN_7574 ||
				npcId == NpcID.ROCKS_7565 ||
				npcId == NpcID.VASA_NISTIRIO ||
				npcId == NpcID.VASA_NISTIRIO_7567 ||
				npcId == NpcID.GLOWING_CRYSTAL ||
				npcId == NpcID.VANGUARD ||
				npcId == NpcID.VANGUARD_7526 ||
				npcId == NpcID.VANGUARD_7527 ||
				npcId == NpcID.VANGUARD_7528 ||
				npcId == NpcID.VANGUARD_7529 ||
				npcId == NpcID.SKELETAL_MYSTIC ||
				npcId == NpcID.SKELETAL_MYSTIC_7605 ||
				npcId == NpcID.SKELETAL_MYSTIC_7606 ||
				npcId == NpcID.MUTTADILE ||
				npcId == NpcID.MUTTADILE_7562 ||
				npcId == NpcID.MUTTADILE_7563 ||
				npcId == NpcID.TEKTON ||
				npcId == NpcID.TEKTON_7541 ||
				npcId == NpcID.TEKTON_7542 ||
				npcId == NpcID.TEKTON_ENRAGED ||
				npcId == NpcID.TEKTON_ENRAGED_7544 ||
				npcId == NpcID.TEKTON_7545 ||
				npcId == NpcID.VESPULA ||
				npcId == NpcID.VESPULA_7531 ||
				npcId == NpcID.VESPULA_7532 ||
				npcId == NpcID.ABYSSAL_PORTAL ||
				npcId == NpcID.LUX_GRUB ||
				npcId == NpcID.LUX_GRUB_7535 ||
				npcId == NpcID.LUX_GRUB_7536 ||
				npcId == NpcID.LUX_GRUB_7537 ||
				npcId == NpcID.VESPINE_SOLDIER ||
				npcId == NpcID.VESPINE_SOLDIER_7539 ||
				npcId == NpcID.DEATHLY_RANGER ||
				npcId == NpcID.DEATHLY_MAGE ||
				npcId == NpcID.GUARDIAN ||
				npcId == NpcID.GUARDIAN_7570 ||
				npcId == NpcID.GUARDIAN_7571 ||
				npcId == NpcID.GUARDIAN_7572 ||
				npcId == NpcID.JEWELLED_CRAB ||
				npcId == NpcID.JEWELLED_CRAB_RED ||
				npcId == NpcID.JEWELLED_CRAB_GREEN ||
				npcId == NpcID.JEWELLED_CRAB_BLUE ||
				npcId == NpcID.GREAT_OLM_RIGHT_CLAW ||
				npcId == NpcID.GREAT_OLM ||
				npcId == NpcID.GREAT_OLM_LEFT_CLAW ||
				npcId == NpcID.GREAT_OLM_RIGHT_CLAW_7553 ||
				npcId == NpcID.GREAT_OLM_7554 ||
				npcId == NpcID.GREAT_OLM_LEFT_CLAW_7555;
	}

	public static boolean isCoxGraphicsObject(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.OLM_LIGHTNING ||
				graphicsObjectId == GraphicID.OLM_BLUE_HEAL_POOL;
	}

	public static boolean isCoxAoeProjectile(int projectileId)
	{
		return projectileId == ProjectileID.GUARDIANS_ROCK_FALLING_AOE ||
				projectileId == ProjectileID.VASA_RANGED_BOULDER_AOE ||
				projectileId == ProjectileID.VASA_AWAKEN_AOE ||
				projectileId == ProjectileID.LIZARDMAN_SHAMAN_ACID_AOE ||
				projectileId == ProjectileID.OLM_FALLING_SPIKE_AOE ||
				projectileId == ProjectileID.OLM_ACID_POOL_AOE ||
				projectileId == ProjectileID.OLM_HEALING_POOL_AOE ||
				projectileId == ProjectileID.OLM_FALLING_CRYSTAL_AOE;
	}

	public static boolean isLizardmanShamanAcidProjectileId(int projectileId)
	{
		return projectileId == ProjectileID.LIZARDMAN_SHAMAN_ACID_AOE;
	}

	public void onAreaOfEffectProjectile(Projectile projectile, LocalPoint targetPoint, ChambersOfXericConfig config, int cycle)
	{
		switch (projectile.getId())
		{
			case ProjectileID.GUARDIANS_ROCK_FALLING_AOE:
				if (config.highlightGuardiansFallingRocks())
					log.debug("CT: {} | guardians falling rock spawned", cycle);
				areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getGuardiansFallingRocksColor()));
				break;
			case ProjectileID.VASA_AWAKEN_AOE:
				if (config.highlightVasaTeleportAttackTiles())
					log.debug("CT: {} | vasa teleport attack spawned", cycle);
				areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getVasaTeleportAttackColor()));
				break;
			case ProjectileID.VASA_RANGED_BOULDER_AOE:
				if (config.highlightVasaBoulderAttackTiles())
					log.debug("CT: {} | vasa boulder rock spawned | end: {} | start xy: {}, {} | end xy: {}, {} | diff xy: {}, {}",
							cycle, projectile.getEndCycle(), projectile.getX1(), projectile.getY1(), targetPoint.getX(), targetPoint.getY(),
							Math.abs(targetPoint.getX() - projectile.getX1()), Math.abs(targetPoint.getY() - projectile.getY1()));
				areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getVasaBoulderAttackColor()));
				break;
			case ProjectileID.LIZARDMAN_SHAMAN_ACID_AOE:
				if (config.highlightShamansAcidAttackTiles())
					log.debug("CT: {} | shamans acid spawned", cycle);
				areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 5, targetPoint, config.getShamansAcidAttackColor()));
				break;
			case ProjectileID.TEKTON_METEOR_AOE:
				if (config.highlightTektonMeteors())
					log.debug("CT: {} | tekton meteor spawned", cycle);
				areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getTektonMeteorsColor()));
				break;
			case ProjectileID.ICE_DEMON_RANGED_AOE:
				if (config.highlightIceDemonIceBoulders())
					log.debug("CT: {} | ice boulder spawned", cycle);
				areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getIceDemonIceBoulderColor()));
				break;
			case ProjectileID.OLM_FALLING_CRYSTAL_AOE:
				if (config.highlightOlmFallingCrystals())
					log.debug("CT: {} | olm falling crystal spawned", cycle);
				areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 3, targetPoint, config.getOlmFallingCrystalsColor()));
				break;
			case ProjectileID.OLM_FALLING_SPIKE_AOE:
				if (config.highlightOlmFallingSpikes())
					log.debug("CT: {} | olm falling spike spawned", cycle);
				areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getOlmFallingSpikesColor()));
				break;
			case ProjectileID.OLM_HEALING_POOL_AOE:
				if (config.highlightOlmHealingPools())
					log.debug("CT: {} | olm healing pools spawned", cycle);
				areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getOlmHealingPoolsColor()));
				break;
			case ProjectileID.OLM_ACID_POOL_AOE:
				if (config.highlightOlmAcidPools())
					log.debug("CT: {} | olm acid pools spawned", cycle);
				areaOfEffectProjectiles.add(new AreaOfEffectProjectile(projectile, 1, targetPoint, config.getOlmAcidPoolsColor()));
		}
	}

	public void onGraphicsObject(GraphicsObject graphicsObject, ChambersOfXericConfig config)
	{
		switch (graphicsObject.getId())
		{
			case GraphicID.OLM_BLUE_HEAL_POOL:
				if (config.highlightOlmHealingPools())
					graphicObjects.add(graphicsObject);
				break;
			case GraphicID.OLM_LIGHTNING:
				if (config.highlightOlmLightning())
					graphicObjects.add(graphicsObject);
				break;
		}
	}


	public void onNpcSpawned(NPC npc, ChambersOfXericConfig config, int cycle)
	{
		switch (npc.getId())
		{
			case NpcID.VASA_NISTIRIO:
			case NpcID.VASA_NISTIRIO_7567:
				new VasaNistirio();
				break;
			case NpcID.GLOWING_CRYSTAL:
				if (config.highlightVasaActiveCrystal())
					highlightedNpcs.add(npc);
				log.debug("CT: {} | Vasa glowing crystal spawned", cycle);
				break;
		}
	}

	public void onNpcDespawned(NPC npc, int cycle)
	{
		switch (npc.getId())
		{
			case NpcID.GLOWING_CRYSTAL:
				highlightedNpcs.remove(npc);
				break;
		}
	}
}
