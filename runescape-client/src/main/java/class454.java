import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ry")
public class class454 {
	@ObfuscatedName("at")
	static int[] field4745;
	@ObfuscatedName("an")
	public static int[] field4744;

	static {
		field4745 = new int[32768]; // L: 8

		for (int var0 = 0; var0 < 32768; ++var0) { // L: 9
			int[] var1 = field4745; // L: 10
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
			double var29 = 0.0D; // L: 24
			double var31 = (var12 + var10) / 2.0D; // L: 25
			if (var12 != var10) { // L: 26
				if (var31 < 0.5D) { // L: 27
					var29 = (var12 - var10) / (var10 + var12);
				}

				if (var31 >= 0.5D) { // L: 28
					var29 = (var12 - var10) / (2.0D - var12 - var10);
				}

				if (var4 == var12) { // L: 29
					var14 = (var6 - var8) / (var12 - var10);
				} else if (var12 == var6) { // L: 30
					var14 = 2.0D + (var8 - var4) / (var12 - var10);
				} else if (var8 == var12) { // L: 31
					var14 = (var4 - var6) / (var12 - var10) + 4.0D;
				}
			}

			int var20 = (int)(var14 * 256.0D / 6.0D); // L: 33
			var20 &= 255; // L: 34
			double var21 = 256.0D * var29; // L: 35
			if (var21 < 0.0D) { // L: 36
				var21 = 0.0D;
			} else if (var21 > 255.0D) { // L: 37
				var21 = 255.0D;
			}

			if (var31 > 0.7D) { // L: 38
				var21 /= 2.0D; // L: 39
				var21 = Math.floor(var21); // L: 40
			}

			if (var31 > 0.75D) { // L: 42
				var21 /= 2.0D; // L: 43
				var21 = Math.floor(var21); // L: 44
			}

			if (var31 > 0.85D) { // L: 46
				var21 /= 2.0D; // L: 47
				var21 = Math.floor(var21); // L: 48
			}

			if (var31 > 0.95D) { // L: 50
				var21 /= 2.0D; // L: 51
				var21 = Math.floor(var21); // L: 52
			}

			if (var31 > 0.995D) { // L: 54
				var31 = 0.995D;
			}

			int var33 = (int)(var21 / 32.0D + (double)(var20 / 4 * 8)); // L: 55
			int var34 = (var33 << 7) + (int)(var31 * 128.0D); // L: 56
			var1[var0] = var34; // L: 58
		}

		if (field4744 == null) { // L: 61
			field4744 = new int[65536]; // L: 62
			double var25 = 0.949999988079071D; // L: 63

			for (int var2 = 0; var2 < 65536; ++var2) { // L: 64
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D; // L: 65
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D; // L: 66
				double var7 = (double)(var2 & 127) / 128.0D; // L: 67
				double var9 = var7; // L: 68
				double var11 = var7; // L: 69
				double var13 = var7; // L: 70
				if (var5 != 0.0D) { // L: 71
					double var15;
					if (var7 < 0.5D) { // L: 73
						var15 = var7 * (var5 + 1.0D);
					} else {
						var15 = var5 + var7 - var7 * var5; // L: 74
					}

					double var17 = var7 * 2.0D - var15; // L: 75
					double var19 = 0.3333333333333333D + var3; // L: 76
					if (var19 > 1.0D) { // L: 77
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D; // L: 79
					if (var23 < 0.0D) { // L: 80
						++var23;
					}

					if (6.0D * var19 < 1.0D) { // L: 81
						var9 = var17 + var19 * (var15 - var17) * 6.0D;
					} else if (var19 * 2.0D < 1.0D) { // L: 82
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) { // L: 83
						var9 = 6.0D * (0.6666666666666666D - var19) * (var15 - var17) + var17;
					} else {
						var9 = var17; // L: 84
					}

					if (var3 * 6.0D < 1.0D) { // L: 85
						var11 = var17 + var3 * (var15 - var17) * 6.0D;
					} else if (2.0D * var3 < 1.0D) { // L: 86
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) { // L: 87
						var11 = 6.0D * (0.6666666666666666D - var3) * (var15 - var17) + var17;
					} else {
						var11 = var17; // L: 88
					}

					if (6.0D * var23 < 1.0D) { // L: 89
						var13 = var17 + (var15 - var17) * 6.0D * var23;
					} else if (2.0D * var23 < 1.0D) { // L: 90
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) { // L: 91
						var13 = var17 + (var15 - var17) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var17; // L: 92
					}
				}

				var9 = Math.pow(var9, var25); // L: 94
				var11 = Math.pow(var11, var25); // L: 95
				var13 = Math.pow(var13, var25); // L: 96
				int var27 = (int)(256.0D * var9); // L: 97
				int var16 = (int)(256.0D * var11); // L: 98
				int var28 = (int)(256.0D * var13); // L: 99
				int var18 = var28 + (var16 << 8) + (var27 << 16); // L: 100
				field4744[var2] = var18 & 16777215; // L: 101
			}
		}

	} // L: 104
}
