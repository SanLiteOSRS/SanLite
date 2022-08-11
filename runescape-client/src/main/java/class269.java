import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
public final class class269 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -19627555958654133L
	)
	static long field3174;

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1902505622"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 114
		int var4 = 0; // L: 115

		for (int var5 = 0; var5 < var2; ++var5) { // L: 116
			int var6 = var0[var5 + var1] & 255; // L: 117
			if (var6 != 0) { // L: 118
				if (var6 >= 128 && var6 < 160) { // L: 119
					char var7 = class341.cp1252AsciiExtension[var6 - 128]; // L: 120
					if (var7 == 0) { // L: 121
						var7 = '?';
					}

					var6 = var7; // L: 122
				}

				var3[var4++] = (char)var6; // L: 124
			}
		}

		return new String(var3, 0, var4); // L: 126
	}
}
