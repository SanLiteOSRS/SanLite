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
	VENGEANCE("Vengeance", SpellEffectType.VENGEANCE, 726, false, 30000, "vengeance.png"),
	VENGEANCE_ACTIVE("Vengeance Active", SpellEffectType.VENGEANCE, -1, false, -1, "vengeance_white.png");

	@Getter(AccessLevel.PACKAGE)
	private final String name;

	@Getter(AccessLevel.PACKAGE)
	private final SpellEffectType spellType;

	@Getter(AccessLevel.PACKAGE)
	private final int spotAnimationId;

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
			if (spellEffect.getSpotAnimationId() == spotAnimationId && spellEffect.getSpotAnimationId() != -1)
			{
				return true;
			}
		}
		return false;
	}

	static SpellEffect getFromSpotAnimation(int spotAnimationId)
	{
		for (SpellEffect spellEffect : values())
		{
			if (spellEffect.getSpotAnimationId() == spotAnimationId)
			{
				return spellEffect;
			}
		}
		return null;
	}
}
