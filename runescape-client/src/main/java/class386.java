import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public final class class386 {
	@ObfuscatedName("ay")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("an")
	static long[] field4415;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1397360037
	)
	static int field4414;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field4415 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field4415.length; ++var0) { // L: 8
			field4415[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFFLer;B)V",
		garbageValue = "2"
	)
	static void method7204(float var0, float var1, float var2, float var3, class129 var4) {
		float var5 = var1 - var0; // L: 345
		float var6 = var2 - var1; // L: 346
		float var7 = var3 - var2; // L: 347
		float var8 = var6 - var5; // L: 348
		var4.field1516 = var7 - var6 - var8; // L: 349
		var4.field1515 = var8 + var8 + var8; // L: 350
		var4.field1514 = var5 + var5 + var5; // L: 351
		var4.field1526 = var0; // L: 352
	} // L: 353
}
