/*
 * Copyright (c) 2022, Siraz <https://github.com/Sirazzz>
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
package net.sanlite.client.plugins.areaofeffectindicators;

import lombok.Data;
import net.runelite.api.GameObject;
import net.runelite.api.Tile;

import java.awt.*;

/**
 * A game object that will do area of effect damage after a given time period.
 */
@Data
public class AreaOfEffectGameObject
{
	private GameObject gameObject;

	private Tile tile;

	/**
	 * The game tick that the game object spawned at begun movement at.
	 */
	private int spawnTick;

	/**
	 * The game tick that the game object will do damage to the player.
	 */
	private int damageTick;

	/**
	 * The size of the area affected by the game object damage (e.g. 3 is a 3x3 area).
	 */
	private int tileSize;

	/**
	 * The color of the tile marker highlight.
	 */
	private Color highlightColor;

	public AreaOfEffectGameObject(GameObject gameObject, Tile tile, int spawnTick, int ticksBeforeDamage, Color highlightColor)
	{
		if (gameObject == null)
			throw new IllegalArgumentException("GameObject is null");

		this.gameObject = gameObject;
		this.tile = tile;
		this.spawnTick = spawnTick;
		this.damageTick = spawnTick + ticksBeforeDamage;
		this.highlightColor = highlightColor;
	}
}
