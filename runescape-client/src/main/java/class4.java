import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public final class class4 {
	@ObfuscatedName("x")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "713636320"
	)
	public static String method13(String var0) {
		int var1 = var0.length(); // L: 151
		char[] var2 = new char[var1]; // L: 152
		byte var3 = 2; // L: 153

		for (int var4 = 0; var4 < var1; ++var4) { // L: 154
			char var5 = var0.charAt(var4); // L: 155
			if (var3 == 0) { // L: 156
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 157
				var5 = SecureRandomCallable.method2122(var5);
			}

			if (Character.isLetter(var5)) { // L: 158
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 159
				if (Character.isSpaceChar(var5)) { // L: 160
					if (var3 != 2) { // L: 161
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 163
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 164
		}

		return new String(var2); // L: 166
	}
}
