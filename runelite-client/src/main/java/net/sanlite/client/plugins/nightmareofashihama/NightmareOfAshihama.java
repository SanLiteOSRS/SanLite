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

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.client.util.ImageUtil;
import net.sanlite.client.plugins.nightmareofashihama.id.AnimationID;
import net.sanlite.client.plugins.nightmareofashihama.id.GraphicID;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
public class NightmareOfAshihama
{
	static final int ATTACK_RATE = 6;
	@Getter
	private final NPC npc;
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
	private List<GameObject> gameObjects;
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
		this.gameObjects = new ArrayList<>();
		this.activeTotems = new ArrayList<>();
	}

	static boolean isNpcNightmare(int npcId)
	{
		return npcId == NpcID.THE_NIGHTMARE ||
				npcId == NpcID.THE_NIGHTMARE_9425 ||
				npcId == NpcID.THE_NIGHTMARE_9426 ||
				npcId == NpcID.THE_NIGHTMARE_9427 ||
				npcId == NpcID.THE_NIGHTMARE_9428 ||
				npcId == NpcID.THE_NIGHTMARE_9429 ||
				npcId == NpcID.THE_NIGHTMARE_9430 ||
				npcId == NpcID.THE_NIGHTMARE_9431 ||
				npcId == NpcID.THE_NIGHTMARE_9432 ||
				npcId == NpcID.THE_NIGHTMARE_9433 ||
				npcId == NpcID.THE_NIGHTMARE_9460 ||
				npcId == NpcID.THE_NIGHTMARE_9461 ||
				npcId == NpcID.THE_NIGHTMARE_9462 ||
				npcId == NpcID.THE_NIGHTMARE_9463 ||
				npcId == NpcID.THE_NIGHTMARE_9464;
	}

	static boolean isPhosanisNightmare(int npcId)
	{
		return npcId == NpcID.PHOSANIS_NIGHTMARE_9416 ||
				npcId == NpcID.PHOSANIS_NIGHTMARE_9417 ||
				npcId == NpcID.PHOSANIS_NIGHTMARE_9418 ||
				npcId == NpcID.PHOSANIS_NIGHTMARE_9419 ||
				npcId == NpcID.PHOSANIS_NIGHTMARE_9420 ||
				npcId == NpcID.PHOSANIS_NIGHTMARE_9421 ||
				npcId == NpcID.PHOSANIS_NIGHTMARE_9422 ||
				npcId == NpcID.PHOSANIS_NIGHTMARE_9423 ||
				npcId == NpcID.PHOSANIS_NIGHTMARE_9424 ||
				npcId == NpcID.COUNCILLOR_ANDREWS_11152 ||
				npcId == NpcID.PHOSANIS_NIGHTMARE_11153 ||
				npcId == NpcID.PHOSANIS_NIGHTMARE_11154 ||
				npcId == NpcID.PHOSANIS_NIGHTMARE_11155;
	}

	static boolean isNpcActiveTotem(int npcId)
	{
		return npcId == NpcID.TOTEM_9435 ||
				npcId == NpcID.TOTEM_9438 ||
				npcId == NpcID.TOTEM_9441 ||
				npcId == NpcID.TOTEM_9444;
	}

	static BufferedImage getPrayersShuffledIcon()
	{
		return ImageUtil.loadImageResource(NightmareOfAshihama.class, "prayers_shuffled.png");
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

	boolean isInfectiousSporeGameObjectId(int gameObjectId)
	{
		return gameObjectId == ObjectID.SPORE_37739;
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
	void checkGraphicObjects(Deque<GraphicsObject> graphicsObjects)
	{
		this.graphicObjects = StreamSupport
				.stream(graphicsObjects.spliterator(), false)
				.filter(graphicsObject -> isNightmareGraphicsObject(graphicsObject.getId()))
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
}
