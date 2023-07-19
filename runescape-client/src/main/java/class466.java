import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rs")
public class class466 {
	@ObfuscatedName("ap")
	static int[] field4797;

	static {
		field4797 = new int[32768]; // L: 13

		for (int var0 = 0; var0 < 32768; ++var0) { // L: 14
			int[] var1 = field4797; // L: 15
			double var4 = (double)(var0 >> 10 & 31) / 31.0D; // L: 19
			double var6 = (double)(var0 >> 5 & 31) / 31.0D; // L: 20
			double var8 = (double)(var0 & 31) / 31.0D; // L: 21
			double var10 = var4; // L: 22
			if (var6 < var4) { // L: 23
				var10 = var6;
			}

			if (var8 < var10) { // L: 24
				var10 = var8;
			}

			double var12 = var4; // L: 25
			if (var6 > var4) { // L: 26
				var12 = var6;
			}

			if (var8 > var12) { // L: 27
				var12 = var8;
			}

			double var14 = 0.0D; // L: 28
			double var16 = 0.0D; // L: 29
			double var18 = (var12 + var10) / 2.0D; // L: 30
			if (var10 != var12) { // L: 31
				if (var18 < 0.5D) { // L: 32
					var16 = (var12 - var10) / (var12 + var10);
				}

				if (var18 >= 0.5D) { // L: 33
					var16 = (var12 - var10) / (2.0D - var12 - var10);
				}

				if (var4 == var12) { // L: 34
					var14 = (var6 - var8) / (var12 - var10);
				} else if (var12 == var6) { // L: 35
					var14 = 2.0D + (var8 - var4) / (var12 - var10);
				} else if (var12 == var8) {
					var14 = 4.0D + (var4 - var6) / (var12 - var10); // L: 36
				}
			}

			int var20 = (int)(256.0D * var14 / 6.0D); // L: 38
			var20 &= 255; // L: 39
			double var21 = var16 * 256.0D; // L: 40
			if (var21 < 0.0D) { // L: 41
				var21 = 0.0D;
			} else if (var21 > 255.0D) { // L: 42
				var21 = 255.0D;
			}

			if (var18 > 0.7D) { // L: 43
				var21 /= 2.0D; // L: 44
				var21 = Math.floor(var21); // L: 45
			}

			if (var18 > 0.75D) { // L: 47
				var21 /= 2.0D; // L: 48
				var21 = Math.floor(var21); // L: 49
			}

			if (var18 > 0.85D) { // L: 51
				var21 /= 2.0D; // L: 52
				var21 = Math.floor(var21); // L: 53
			}

			if (var18 > 0.95D) { // L: 55
				var21 /= 2.0D; // L: 56
				var21 = Math.floor(var21); // L: 57
			}

			if (var18 > 0.995D) { // L: 59
				var18 = 0.995D;
			}

			int var23 = (int)((double)(var20 / 4 * 8) + var21 / 32.0D); // L: 60
			int var3 = (int)(128.0D * var18) + (var23 << 7); // L: 61
			var1[var0] = var3; // L: 63
		}

		HorizontalAlignment.method3807(); // L: 65
	} // L: 66
}
