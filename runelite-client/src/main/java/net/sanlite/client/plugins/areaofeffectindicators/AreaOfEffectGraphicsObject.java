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
import net.runelite.api.GraphicsObject;

/**
 * A graphics object that will do area of effect damage.
 */
@Data
public class AreaOfEffectGraphicsObject
{
	// Amount of ticks after which objects with a dynamic duration will be removed
	private static int DYNAMIC_DURATION_EXPIRY_TICKS = 30;

	private GraphicsObject graphicsObject;

	/**
	 * The game tick that the graphics object spawned at.
	 */
	private int spawnTick;

	/**
	 * The game tick that the graphics object will despawn.
	 */
	private int despawnTick;

	/**
	 * Whether the despawn tick is a dynamic amount of ticks after the spawn tick
	 */
	private boolean dynamicDespawnTick;

	public AreaOfEffectGraphicsObject(GraphicsObject graphicsObject, int spawnTick, int tickDuration)
	{
		if (graphicsObject == null)
			throw new IllegalArgumentException("GraphicsObject is null");

		this.graphicsObject = graphicsObject;
		this.spawnTick = spawnTick;
		this.despawnTick = spawnTick + tickDuration;
	}

	public AreaOfEffectGraphicsObject(GraphicsObject graphicsObject, int spawnTick, boolean dynamicDespawnTick)
	{
		if (graphicsObject == null)
			throw new IllegalArgumentException("GraphicsObject is null");

		this.graphicsObject = graphicsObject;
		this.spawnTick = spawnTick;
		this.despawnTick = spawnTick + DYNAMIC_DURATION_EXPIRY_TICKS;
		this.dynamicDespawnTick = dynamicDespawnTick;
	}

	boolean isDespawned(int tickCount)
	{
		return this.despawnTick <= tickCount;
	}
}
