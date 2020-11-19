import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("AttackOption")
public enum AttackOption implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("AttackOption_leftClickWhereAvailable")
	AttackOption_leftClickWhereAvailable(2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3);

	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 612234901
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -740751005
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
