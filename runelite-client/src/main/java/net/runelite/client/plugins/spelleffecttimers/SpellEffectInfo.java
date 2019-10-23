/*
 * Copyright (c) 2019, Siraz, Jajack
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
package net.runelite.client.plugins.spelleffecttimers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Constants;

@Slf4j
class SpellEffectInfo
{
	@Getter(AccessLevel.PACKAGE)
	private final Actor actor;

	@Getter(AccessLevel.PACKAGE)
	private final SpellEffect spellEffect;

	@Getter(AccessLevel.PACKAGE)
	private final int initialHitClientTick;

	@Getter(AccessLevel.PACKAGE)
	private final int expireClientTick;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private int remainingClientTicks;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private int remainingTime;

	@Getter(AccessLevel.PACKAGE)
	private final boolean halved;

	SpellEffectInfo(Actor actor, SpellEffect spellEffect, int initialHitClientTick, boolean halved)
	{
		this.actor = actor;
		this.spellEffect = spellEffect;
		this.initialHitClientTick = initialHitClientTick;
		this.halved = halved;
		if (this.halved)
		{
			this.expireClientTick = initialHitClientTick + ((spellEffect.getSpellLength() / 2) / Constants.CLIENT_TICK_LENGTH);
		}
		else
		{
			this.expireClientTick = initialHitClientTick + (spellEffect.getSpellLength() / Constants.CLIENT_TICK_LENGTH);
		}
		this.remainingClientTicks = expireClientTick - initialHitClientTick;
		this.remainingTime = remainingClientTicks / 5;
		log.debug("Expire game tick: {}", expireClientTick);
	}
}
