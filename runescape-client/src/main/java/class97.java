import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class97 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 544707785
	)
	int field1280;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1211819441
	)
	int field1281;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -660132473
	)
	int field1282;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 351688249
	)
	int field1283;

	class97(int var1, int var2, int var3, int var4) {
		this.field1280 = var1; // L: 10
		this.field1281 = var2; // L: 11
		this.field1282 = var3; // L: 12
		this.field1283 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1078503853"
	)
	int method2520() {
		return this.field1280; // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1853707168"
	)
	int method2521() {
		return this.field1281; // L: 21
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "511606272"
	)
	int method2523() {
		return this.field1282; // L: 25
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-470749663"
	)
	int method2524() {
		return this.field1283; // L: 29
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
	)
	public static void method2522() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 117
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 118
	} // L: 119
}
