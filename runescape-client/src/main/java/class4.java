import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public final class class4 {
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 123289600
	)
	static int field11;

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2019597533"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 73
		if (var0 < 0 || var0 >= 65536) { // L: 74
			var0 >>>= 16; // L: 75
			var1 += 16; // L: 76
		}

		if (var0 >= 256) { // L: 78
			var0 >>>= 8; // L: 79
			var1 += 8; // L: 80
		}

		if (var0 >= 16) { // L: 82
			var0 >>>= 4; // L: 83
			var1 += 4; // L: 84
		}

		if (var0 >= 4) { // L: 86
			var0 >>>= 2; // L: 87
			var1 += 2; // L: 88
		}

		if (var0 >= 1) { // L: 90
			var0 >>>= 1; // L: 91
			++var1; // L: 92
		}

		return var0 + var1; // L: 94
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1186884492"
	)
	static final int method15(int var0, int var1) {
		int var2 = class320.method6262(var0 + 45365, var1 + 91923, 4) - 128 + (class320.method6262(10294 + var0, 37821 + var1, 2) - 128 >> 1) + (class320.method6262(var0, var1, 1) - 128 >> 2); // L: 973
		var2 = (int)((double)var2 * 0.3D) + 35; // L: 974
		if (var2 < 10) { // L: 975
			var2 = 10;
		} else if (var2 > 60) { // L: 976
			var2 = 60;
		}

		return var2; // L: 977
	}
}
