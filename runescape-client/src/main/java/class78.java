import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class class78 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public static boolean method2157(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)I",
		garbageValue = "-808075367"
	)
	static int method2158(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 181
		int var2;
		if (var1 == 0) { // L: 183
			var2 = 0;
		} else if (var1 == 1) { // L: 184
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 185
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 186
		}

		return var2; // L: 187
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "695677773"
	)
	static void method2159(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(II)Lpp;",
		garbageValue = "634380800"
	)
	static class437 method2156(int var0) {
		class437 var1 = (class437)Client.Widget_cachedFonts.get((long)var0); // L: 12471
		if (var1 == null) { // L: 12472
			var1 = new class437(BuddyRankComparator.field1380, var0); // L: 12473
		}

		return var1; // L: 12475
	}
}
