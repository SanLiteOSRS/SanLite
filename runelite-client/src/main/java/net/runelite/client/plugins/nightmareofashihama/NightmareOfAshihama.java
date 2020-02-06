package net.runelite.client.plugins.nightmareofashihama;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.client.util.ImageUtil;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class NightmareOfAshihama
{
	static final int ATTACK_RATE = 6;

	enum AttackStyle
	{
		MELEE,
		MAGIC,
		RANGED
	}

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
	private List<NPC> activeTotems;

	@Getter
	@Setter
	private int nextAttackTick;

	@Getter
	@Setter
	private int lastAttackTick;

	@Getter
	@Setter
	private int lastAnimationId;

	NightmareOfAshihama(NPC npc)
	{
		this.npc = npc;
		this.lastAttackTick = -100;
		this.nextAttackTick = -100;
		this.lastAnimationId = -1;
		this.currentPhase = Phase.START;
		this.graphicObjects = new ArrayList<>();
		this.activeTotems = new ArrayList<>();
	}

	static boolean isNpcNightmare(int npcId)
	{
		return npcId == NpcID.THE_NIGHTMARE_9425 ||
				npcId == NpcID.THE_NIGHTMARE_9426 ||
				npcId == NpcID.THE_NIGHTMARE_9427 ||
				npcId == NpcID.THE_NIGHTMARE_9428 ||
				npcId == NpcID.THE_NIGHTMARE_9429 ||
				npcId == NpcID.THE_NIGHTMARE_9430 ||
				npcId == NpcID.THE_NIGHTMARE_9431 ||
				npcId == NpcID.THE_NIGHTMARE_9432 ||
				npcId == NpcID.THE_NIGHTMARE_9433;
	}

	static boolean isNpcActiveTotem(int npcId)
	{
		return npcId == NpcID.TOTEM_9435 ||
				npcId == NpcID.TOTEM_9438 ||
				npcId == NpcID.TOTEM_9441 ||
				npcId == NpcID.TOTEM_9444;
	}

	boolean isRegularAttackAnimation(int animationId)
	{
		return animationId == AnimationID.NIGHTMARE_MELEE_ATTACK ||
				animationId == AnimationID.NIGHTMARE_MAGIC_ATTACK ||
				animationId == AnimationID.NIGHTMARE_RANGED_ATTACK;
	}

	boolean isGhostAttackGraphicsObjectId(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.NIGHTMARE_GHOST_ATTACK;
	}

	boolean isNightmareGraphicsObject(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.NIGHTMARE_GHOST_ATTACK;
	}

	void onAttack(int animationId, int tickCount)
	{
		lastAnimationId = animationId;
		lastAttackTick = tickCount;
		nextAttackTick = tickCount + ATTACK_RATE;
		lastAttackStyle = currentAttackStyle;
		currentAttackStyle = animationIdToAttackStyle(animationId);

		log.debug("Tick: {} | Nightmare regular attack: {} | Next: {}", tickCount, animationIdToAttackStyle(animationId), nextAttackTick);
	}

	void onDeath()
	{
		lastAttackTick = -100;
		nextAttackTick = -100;
		lastAttackStyle = null;
		currentAttackStyle = null;
		lastAnimationId = -1;
		currentPhase = Phase.START;
		graphicObjects.clear();
		activeTotems.clear();
	}

	/**
	 * Checks if the client graphics objects contain a special attack object and updates the list
	 */
	void checkGraphicObjects(List<GraphicsObject> graphicsObjects)
	{
		this.graphicObjects = graphicsObjects.stream()
				.filter(x -> isNightmareGraphicsObject(x.getId()))
				.collect(Collectors.toList());
	}

	/**
	 * Checks if the client NPC's contain an active totem and sets those to the list
	 */
	void checkActiveTotems(List<NPC> npcs)
	{
		this.activeTotems = npcs.stream()
				.filter(x -> isNpcActiveTotem(x.getId()))
				.collect(Collectors.toList());
	}

	static BufferedImage getPrayersShuffledIcon()
	{
		return ImageUtil.getResourceStreamFromClass(NightmareOfAshihama.class, "prayers_shuffled.png");
	}

	/**
	 * Get The Nightmare attack style based on the given animation id.
	 *
	 * @param animationId The Nightmare animation id
	 * @return The Nightmare attack style
	 */
	private AttackStyle animationIdToAttackStyle(int animationId)
	{
		switch (animationId)
		{
			case AnimationID.NIGHTMARE_MELEE_ATTACK:
				return AttackStyle.MELEE;
			case AnimationID.NIGHTMARE_MAGIC_ATTACK:
				return AttackStyle.MAGIC;
			case AnimationID.NIGHTMARE_RANGED_ATTACK:
				return AttackStyle.RANGED;
			default:
				return null;
		}
	}
}
