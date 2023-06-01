import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class217 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lix;"
	)
	static class215[] field2388;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Lok;IS)Lok;",
		garbageValue = "-3343"
	)
	@Export("findEnumerated")
	public static class369 findEnumerated(class369[] var0, int var1) {
		class369[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class369 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "571022601"
	)
	static final int method4208(int var0, int var1) {
		if (var0 == -2) { // L: 970
			return 12345678;
		} else if (var0 == -1) { // L: 971
			if (var1 < 2) { // L: 972
				var1 = 2;
			} else if (var1 > 126) { // L: 973
				var1 = 126;
			}

			return var1; // L: 974
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 976
			if (var1 < 2) { // L: 977
				var1 = 2;
			} else if (var1 > 126) { // L: 978
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 979
		}
	}
}
