package net.runelite.client.plugins.nightmareofashihama;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class NightmareOfAshihama
{
	// TODO: Mechanic statics
	static final int ATTACK_RATE = -1;

	// TODO: Add attack styles
	enum AttackStyle
	{
		MELEE,
		MAGIC,
		RANGED
	}

	// TODO: Add phases if required
	enum Phase
	{
		START
	}

	@Getter
	private NPC npc;

	@Getter
	@Setter
	private Phase currentPhase;

	@Getter
	@Setter
	private AttackStyle currentAttackStyle;

	@Getter
	@Setter
	private AttackStyle lastAttackStyle;

	@Getter
	@Setter
	private List<GraphicsObject> graphicObjects;

	@Getter
	@Setter
	private int nextAttackTick;

	@Getter
	@Setter
	private int lastAttackTick;

	@Getter
	@Setter
	private int lastAnimationId;

	@Getter
	@Setter
	private int lastProjectileId;

	@Getter
	private int amountOfAttacks;

	NightmareOfAshihama(NPC npc)
	{
		this.npc = npc;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.lastAnimationId = -1;
		this.lastProjectileId = -1;
		this.currentPhase = Phase.START;
		this.graphicObjects = new ArrayList<>();
	}

	// TODO: Add ids
	static boolean isNpcNightmare(int npcId)
	{
		return npcId == NpcID.ALCHEMICAL_HYDRA ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8616 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8617 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8618 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8619 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8620 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8621 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8622 ||
				npcId == NpcID.ALCHEMICAL_HYDRA_8634;
	}

	// TODO: Add ids
	static boolean isNightmareProjectile(int projectileId)
	{
		return projectileId == ProjectileID.ALCHEMICAL_HYDRA_RANGED ||
				projectileId == ProjectileID.ALCHEMICAL_HYDRA_MAGIC;
	}

	boolean isGhostAttackGraphicsObjectId(int graphicsObjectId)
	{
		// TODO: Add attack id
		return graphicsObjectId == GraphicID.GREY_BUBBLE_TELEPORT;
	}

	boolean isGraphicsObjectsId(int graphicsObjectId)
	{
		// TODO: Add graphic object id's
		return graphicsObjectId == GraphicID.GREY_BUBBLE_TELEPORT;
	}

	void onAttack(int animationId, int tickCount)
	{
		amountOfAttacks++;
		lastAnimationId = animationId;
		lastAttackTick = tickCount;
		log.debug("Tick: {} | Nightmare animation id: {} | Amount: {}", tickCount, animationId, amountOfAttacks);
	}

	void onProjectile(int projectileId, int tickCount)
	{
		lastProjectileId = projectileId;
		lastAttackTick = tickCount;
		log.debug("Tick: {} | Nightmare projectile id: {}", tickCount, projectileId);
	}

	/**
	 * Checks if the client graphics objects contain a special attack object and updates the list
	 */
	void checkGraphicObjects(List<GraphicsObject> graphicsObjects)
	{
		graphicsObjects = graphicsObjects.stream()
				.filter(x -> isGraphicsObjectsId(x.getId()))
				.collect(Collectors.toList());
	}
}
