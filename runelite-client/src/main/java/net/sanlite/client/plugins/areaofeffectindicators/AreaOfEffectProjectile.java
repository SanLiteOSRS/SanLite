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
package net.sanlite.client.plugins.areaofeffectindicators;

import lombok.Data;
import net.runelite.api.Actor;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.ProjectileMoved;

/**
 * A projectile that targets an area and is not interacting with an {@link Actor}.
 * The projectile target point has been added when the {@link ProjectileMoved} event is triggered.
 */
@Data
public class AreaOfEffectProjectile
{
	private Projectile projectile;

	/**
	 * The local point of the area targeted by the projectile.
	 */
	private LocalPoint targetPoint;

	/**
	 * The game cycle that the projectile begun movement at.
	 */
	private int startCycle;

	/**
	 * The game cycle that the projectile will reach its target at.
	 */
	private int endCycle;

	public AreaOfEffectProjectile(Projectile projectile, LocalPoint targetPoint, int endCycleDelay)
	{
		if (projectile == null || projectile.getInteracting() != null)
			throw new IllegalArgumentException("Projectile is null or is not an area of effect projectile");

		this.projectile = projectile;
		this.targetPoint = targetPoint;
		this.startCycle = projectile.getStartCycle();
		this.endCycle = projectile.getEndCycle() + endCycleDelay;
	}

	boolean isDespawned(int gameCycle)
	{
		return this.endCycle < gameCycle;
	}
}
