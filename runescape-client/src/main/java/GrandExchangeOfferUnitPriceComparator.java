import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("worldMap")
	static WorldMap worldMap;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lmv;B)I",
		garbageValue = "75"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1038582693"
	)
	static int method6729(int var0) {
		return KeyHandler.KeyHandler_keyCodes[var0];
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-269331071"
	)
	static int method6737(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 85
			boolean var3 = false; // L: 86
			boolean var4 = false; // L: 87
			int var5 = 0; // L: 88
			int var6 = var0.length(); // L: 89

			for (int var7 = 0; var7 < var6; ++var7) { // L: 90
				char var8 = var0.charAt(var7); // L: 91
				if (var7 == 0) { // L: 92
					if (var8 == '-') { // L: 93
						var3 = true; // L: 94
						continue;
					}

					if (var8 == '+') { // L: 97
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 99
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 100
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 101
						throw new NumberFormatException(); // L: 102
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 103
					throw new NumberFormatException();
				}

				if (var3) { // L: 104
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 105
				if (var9 / var1 != var5) { // L: 106
					throw new NumberFormatException();
				}

				var5 = var9; // L: 107
				var4 = true; // L: 108
			}

			if (!var4) { // L: 110
				throw new NumberFormatException();
			} else {
				return var5; // L: 111
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
