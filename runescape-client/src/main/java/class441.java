import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qh")
public class class441 {
	@ObfuscatedName("af")
	static int[] field4730;
	@ObfuscatedName("an")
	static int[] field4729;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1574980473
	)
	public static int field4731;

	static {
		field4730 = new int[32768]; // L: 8

		for (int var0 = 0; var0 < 32768; ++var0) { // L: 9
			int[] var1 = field4730; // L: 10
			double var4 = (double)(var0 >> 10 & 31) / 31.0D; // L: 14
			double var6 = (double)(var0 >> 5 & 31) / 31.0D; // L: 15
			double var8 = (double)(var0 & 31) / 31.0D; // L: 16
			double var10 = var4; // L: 17
			if (var6 < var4) { // L: 18
				var10 = var6;
			}

			if (var8 < var10) { // L: 19
				var10 = var8;
			}

			double var12 = var4; // L: 20
			if (var6 > var4) { // L: 21
				var12 = var6;
			}

			if (var8 > var12) { // L: 22
				var12 = var8;
			}

			double var14 = 0.0D; // L: 23
			double var16 = 0.0D; // L: 24
			double var18 = (var10 + var12) / 2.0D; // L: 25
			if (var10 != var12) { // L: 26
				if (var18 < 0.5D) { // L: 27
					var16 = (var12 - var10) / (var10 + var12);
				}

				if (var18 >= 0.5D) { // L: 28
					var16 = (var12 - var10) / (2.0D - var12 - var10);
				}

				if (var4 == var12) { // L: 29
					var14 = (var6 - var8) / (var12 - var10);
				} else if (var6 == var12) { // L: 30
					var14 = 2.0D + (var8 - var4) / (var12 - var10);
				} else if (var12 == var8) {
					var14 = (var4 - var6) / (var12 - var10) + 4.0D; // L: 31
				}
			}

			int var20 = (int)(var14 * 256.0D / 6.0D); // L: 33
			var20 &= 255; // L: 34
			double var21 = var16 * 256.0D; // L: 35
			if (var21 < 0.0D) { // L: 36
				var21 = 0.0D;
			} else if (var21 > 255.0D) { // L: 37
				var21 = 255.0D;
			}

			if (var18 > 0.7D) { // L: 38
				var21 /= 2.0D; // L: 39
				var21 = Math.floor(var21); // L: 40
			}

			if (var18 > 0.75D) { // L: 42
				var21 /= 2.0D; // L: 43
				var21 = Math.floor(var21); // L: 44
			}

			if (var18 > 0.85D) { // L: 46
				var21 /= 2.0D; // L: 47
				var21 = Math.floor(var21); // L: 48
			}

			if (var18 > 0.95D) { // L: 50
				var21 /= 2.0D; // L: 51
				var21 = Math.floor(var21); // L: 52
			}

			if (var18 > 0.995D) { // L: 54
				var18 = 0.995D;
			}

			int var23 = (int)(var21 / 32.0D + (double)(var20 / 4 * 8)); // L: 55
			int var3 = (var23 << 7) + (int)(var18 * 128.0D); // L: 56
			var1[var0] = var3; // L: 58
		}

		UserComparator9.method2933(); // L: 60
	} // L: 61
}
