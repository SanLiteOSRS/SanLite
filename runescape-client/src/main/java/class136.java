import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class136 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-58"
	)
	static final boolean method3133(char var0) {
		if (Character.isISOControl(var0)) { // L: 16
			return false;
		} else if (GrandExchangeOfferTotalQuantityComparator.isAlphaNumeric(var0)) { // L: 17
			return true;
		} else {
			char[] var1 = class493.field4999; // L: 19

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 20
				var3 = var1[var2]; // L: 21
				if (var0 == var3) { // L: 22
					return true;
				}
			}

			var1 = class493.field5000; // L: 26

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 27
				var3 = var1[var2]; // L: 28
				if (var0 == var3) {
					return true; // L: 29
				}
			}

			return false; // L: 32
		}
	}
}
