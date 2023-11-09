import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 767819071
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1604184597
	)
	@Export("health")
	int health;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1895664145
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -226595329
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1273650363"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "817331305"
	)
	static int method2170(int var0) {
		return var0 * 3 + 600; // L: 1462
	}
}
