/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
 * Copyright (c) 2019, Jajack
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
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum SpellEffect
{
	BIND("Bind", SpellEffectType.FREEZE, 181, false, 5000, "bind.png"),
	SNARE("Snare", SpellEffectType.FREEZE, 180, false, 10000, "snare.png"),
	ENTANGLE("Entangle", SpellEffectType.FREEZE, 179, false, 15000, "entangle.png"),
	ICE_RUSH("Ice Rush", SpellEffectType.FREEZE, 361, false, 5000, "ice_rush.png"),
	ICE_BURST("Ice Burst", SpellEffectType.FREEZE, 363, false, 10000, "ice_burst.png"),
	ICE_BLITZ("Ice Blitz", SpellEffectType.FREEZE, 367, false, 15000, "ice_blitz.png"),
	ICE_BARRAGE("Ice Barrage", SpellEffectType.FREEZE, 369, false, 20000, "ice_barrage.png"),
	FREEZE_IMMUNITY("Freeze Immunity", SpellEffectType.FREEZE_IMMUNITY, -1, false, 3000, "freeze_immunity.png"),
	TELEBLOCK("Teleblock", SpellEffectType.TELEBLOCK, 345, true, 300000, "teleblock.png"),
	TELEBLOCK_IMMUNITY("Teleblock Immunity", SpellEffectType.TELEBLOCK_IMMUNITY, -1, false, 60000, "teleblock_immunity.png"),
	VENGEANCE_OTHER("Vengeance Other", SpellEffectType.VENGEANCE, 725, false, -1, "vengeance.png"),
	VENGEANCE("Vengeance", SpellEffectType.VENGEANCE, 726, false, 30000, "vengeance.png"),
	VENGEANCE_ACTIVE("Vengeance Active", SpellEffectType.VENGEANCE, -1, false, -1, "vengeance_white.png"),
	STAFF_OF_THE_DEAD_SPECIAL("Staff Of The Dead Special", SpellEffectType.STAFF_OF_THE_DEAD_SPECIAL, 1228, false, 60000, "sotd.png"),
	STAFF_OF_LIGHT_SPECIAL("Staff Of Light Special", SpellEffectType.STAFF_OF_THE_DEAD_SPECIAL, 1516, false, 60000, "sotd.png"),
	STAFF_OF_BALANCE_SPECIAL("Staff Of Balance Special", SpellEffectType.STAFF_OF_THE_DEAD_SPECIAL, 1733, false, 60000, "sotd.png");

	@Getter(AccessLevel.PACKAGE)
	private final String name;

	@Getter(AccessLevel.PACKAGE)
	private final SpellEffectType spellType;

	@Getter(AccessLevel.PACKAGE)
	private final int graphicId;

	@Getter(AccessLevel.PACKAGE)
	private final boolean isHalvable;

	@Getter(AccessLevel.PACKAGE)
	private final int spellLength;

	@Getter(AccessLevel.PACKAGE)
	private final String spellIcon;

	static boolean isSpellEffect(int spotAnimationId)
	{
		for (SpellEffect spellEffect : values())
		{
			if (spellEffect.getGraphicId() == spotAnimationId && spellEffect.getGraphicId() != -1)
			{
				return true;
			}
		}
		return false;
	}

	static boolean isSpellEffectTypeFreeze(int spotAnimationId)
	{
		return spotAnimationId == BIND.graphicId ||
				spotAnimationId == SNARE.graphicId ||
				spotAnimationId == ENTANGLE.graphicId ||
				spotAnimationId == ICE_RUSH.graphicId ||
				spotAnimationId == ICE_BURST.graphicId ||
				spotAnimationId == ICE_BLITZ.graphicId ||
				spotAnimationId == ICE_BARRAGE.graphicId;
	}

	static SpellEffect getFromGraphicId(int graphicId)
	{
		for (SpellEffect spellEffect : values())
		{
			if (spellEffect.getGraphicId() == graphicId)
			{
				return spellEffect;
			}
		}
		return null;
	}
}
