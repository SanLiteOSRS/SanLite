import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public final class class341 {
	@ObfuscatedName("ar")
	public static boolean method6639(long var0) {
		boolean var2 = var0 != 0L; // L: 52
		if (var2) { // L: 53
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1; // L: 56
			var2 = !var3; // L: 58
		}

		return var2; // L: 60
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1469003000"
	)
	static int method6638(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}
}
