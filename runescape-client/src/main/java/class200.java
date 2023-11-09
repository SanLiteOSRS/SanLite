import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class200 extends DualNode {
	@ObfuscatedName("ce")
	static String field2121;

	static {
		new EvictingDualNodeHashTable(64); // L: 9
	} // L: 10

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "942209246"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 147
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "56"
	)
	static void method3784(boolean var0) {
		if (var0) { // L: 229
			ByteArrayPool.method7671(); // L: 230
		} else {
			for (int var1 = 0; var1 < class305.field3404.size(); ++var1) { // L: 233
				class317 var2 = (class317)class305.field3404.get(var1); // L: 234
				if (var2 == null) { // L: 235
					class305.field3404.remove(var1); // L: 236
					--var1; // L: 237
				} else if (var2.field3519) { // L: 239
					if (var2.field3517.field3443 > 0) { // L: 240
						--var2.field3517.field3443; // L: 241
					}

					var2.field3517.clear(); // L: 243
					var2.field3517.removeAll(); // L: 244
					var2.field3517.setPcmStreamVolume(0); // L: 245
					class305.field3404.remove(var1); // L: 246
					--var1; // L: 247
				} else {
					var2.field3519 = true; // L: 250
				}
			}
		}

	} // L: 254
}
