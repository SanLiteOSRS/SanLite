import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public final class class315 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -40965535388158667L
	)
	static long field3405;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfz;B)V",
		garbageValue = "0"
	)
	static void method5905(float var0, float var1, float var2, float var3, class132 var4) {
		float var5 = var1 - var0; // L: 343
		float var6 = var2 - var1; // L: 344
		float var7 = var3 - var2; // L: 345
		float var8 = var6 - var5; // L: 346
		var4.field1542 = var7 - var6 - var8; // L: 347
		var4.field1538 = var8 + var8 + var8; // L: 348
		var4.field1546 = var5 + var5 + var5; // L: 349
		var4.field1545 = var0; // L: 350
	} // L: 351

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1734109525"
	)
	public static void method5904() {
		ItemComposition.ItemComposition_cached.clear(); // L: 570
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 571
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 572
	} // L: 573
}
