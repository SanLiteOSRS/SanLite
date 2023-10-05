import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public class class430 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-12"
	)
	public static String method7852(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 30
		int var4 = 0; // L: 31
		int var5 = var1; // L: 32

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) { // L: 33 34 65
			int var7 = var0[var5++] & 255; // L: 35
			if (var7 < 128) { // L: 37
				if (var7 == 0) { // L: 38
					var8 = 65533;
				} else {
					var8 = var7; // L: 39
				}
			} else if (var7 < 192) { // L: 41
				var8 = 65533;
			} else if (var7 < 224) { // L: 42
				if (var5 < var6 && (var0[var5] & 192) == 128) { // L: 43
					var8 = (var7 & 31) << 6 | var0[var5++] & 63; // L: 44
					if (var8 < 128) { // L: 45
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 47
				}
			} else if (var7 < 240) { // L: 49
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) { // L: 50
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 51
					if (var8 < 2048) { // L: 52
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 54
				}
			} else if (var7 < 248) { // L: 56
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) { // L: 57
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 58
					if (var8 >= 65536 && var8 <= 1114111) { // L: 59
						var8 = 65533; // L: 60
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 62
				}
			} else {
				var8 = 65533; // L: 64
			}
		}

		return new String(var3, 0, var4); // L: 67
	}
}
