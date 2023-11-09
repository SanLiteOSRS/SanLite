import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("AttackOption")
public enum AttackOption implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1337(2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1334(4);

	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1183197833
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 13014
	} // L: 13015

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 13019
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-99"
	)
	public static void method2751() {
		HealthBarDefinition.NpcDefinition_cachedModels.clear(); // L: 92
		HealthBarDefinition.field1869.clear(); // L: 93
	} // L: 94

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static final void method2748() {
		WorldMapArea.method4622("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 124
	} // L: 125
}
