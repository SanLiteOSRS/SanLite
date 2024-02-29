import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("AttackOption")
public enum AttackOption implements class390 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	field1364(2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	field1362(4);

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1735123761
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 13089
	} // L: 13090

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 13094
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1485439106"
	)
	static long method2755() {
		return Client.field654; // L: 3025
	}
}
