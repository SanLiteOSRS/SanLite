import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;I)I",
		garbageValue = "16777215"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1); // L: 69
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 73
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 77
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "-658556358"
	)
	static String method7088(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 121
			if (var2 && var0 >= 0) { // L: 122
				int var3 = 2; // L: 123

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 124 125 127
					var4 /= var1; // L: 126
				}

				char[] var5 = new char[var3]; // L: 129
				var5[0] = '+'; // L: 130

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 131
					int var7 = var0; // L: 132
					var0 /= var1; // L: 133
					int var8 = var7 - var0 * var1; // L: 134
					if (var8 >= 10) { // L: 135
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 136
					}
				}

				return new String(var5); // L: 138
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1822681689"
	)
	static int method7092(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F)); // L: 4472
	}
}
