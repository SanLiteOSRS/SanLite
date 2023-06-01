import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public class class454 {
	@ObfuscatedName("ay")
	static int[] field4748;
	@ObfuscatedName("an")
	public static int[] field4747;

	static {
		field4748 = new int[32768]; // L: 8

		for (int var0 = 0; var0 < 32768; ++var0) { // L: 9
			int[] var1 = field4748; // L: 10
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
			double var31 = (var10 + var12) / 2.0D; // L: 25
			if (var12 != var10) { // L: 26
				if (var31 < 0.5D) { // L: 27
					var29 = (var12 - var10) / (var12 + var10);
				}

				if (var31 >= 0.5D) { // L: 28
					var29 = (var12 - var10) / (2.0D - var12 - var10);
				}

				if (var4 == var12) { // L: 29
					var14 = (var6 - var8) / (var12 - var10);
				} else if (var6 == var12) { // L: 30
					var14 = (var8 - var4) / (var12 - var10) + 2.0D;
				} else if (var12 == var8) { // L: 31
					var14 = (var4 - var6) / (var12 - var10) + 4.0D;
				}
			}

			int var20 = (int)(var14 * 256.0D / 6.0D); // L: 33
			var20 &= 255; // L: 34
			double var21 = var29 * 256.0D; // L: 35
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
			int var34 = (int)(128.0D * var31) + (var33 << 7); // L: 56
			var1[var0] = var34; // L: 58
		}

		if (field4747 == null) { // L: 61
			field4747 = new int[65536]; // L: 62
			double var25 = 0.949999988079071D; // L: 63

			for (int var2 = 0; var2 < 65536; ++var2) { // L: 64
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D; // L: 65
				double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D; // L: 66
				double var7 = (double)(var2 & 127) / 128.0D; // L: 67
				double var9 = var7; // L: 68
				double var11 = var7; // L: 69
				double var13 = var7; // L: 70
				if (0.0D != var5) { // L: 71
					double var15;
					if (var7 < 0.5D) { // L: 73
						var15 = var7 * (1.0D + var5);
					} else {
						var15 = var7 + var5 - var5 * var7; // L: 74
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
						var9 = var17 + var19 * 6.0D * (var15 - var17);
					} else if (2.0D * var19 < 1.0D) { // L: 82
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) { // L: 83
						var9 = var17 + (0.6666666666666666D - var19) * (var15 - var17) * 6.0D;
					} else {
						var9 = var17; // L: 84
					}

					if (var3 * 6.0D < 1.0D) { // L: 85
						var11 = var3 * 6.0D * (var15 - var17) + var17;
					} else if (2.0D * var3 < 1.0D) { // L: 86
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) { // L: 87
						var11 = 6.0D * (0.6666666666666666D - var3) * (var15 - var17) + var17;
					} else {
						var11 = var17; // L: 88
					}

					if (6.0D * var23 < 1.0D) { // L: 89
						var13 = (var15 - var17) * 6.0D * var23 + var17;
					} else if (var23 * 2.0D < 1.0D) { // L: 90
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) { // L: 91
						var13 = var17 + 6.0D * (var15 - var17) * (0.6666666666666666D - var23);
					} else {
						var13 = var17; // L: 92
					}
				}

				var9 = Math.pow(var9, var25); // L: 94
				var11 = Math.pow(var11, var25); // L: 95
				var13 = Math.pow(var13, var25); // L: 96
				int var27 = (int)(256.0D * var9); // L: 97
				int var16 = (int)(var11 * 256.0D); // L: 98
				int var28 = (int)(256.0D * var13); // L: 99
				int var18 = var28 + (var16 << 8) + (var27 << 16); // L: 100
				field4747[var2] = var18 & 16777215; // L: 101
			}
		}

	} // L: 104

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1885340756"
	)
	public static int method8347(int var0) {
		return var0 >> 17 & 7; // L: 13
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqp;FFFI)F",
		garbageValue = "1407491392"
	)
	static float method8346(class440 var0, float var1, float var2, float var3) {
		float var4 = DirectByteArrayCopier.method6617(var0.field4713, var0.field4712, var1); // L: 116
		if (Math.abs(var4) < class125.field1468) { // L: 117
			return var1;
		} else {
			float var5 = DirectByteArrayCopier.method6617(var0.field4713, var0.field4712, var2); // L: 118
			if (Math.abs(var5) < class125.field1468) { // L: 119
				return var2;
			} else {
				float var6 = 0.0F; // L: 120
				float var7 = 0.0F; // L: 121
				float var8 = 0.0F; // L: 122
				float var13 = 0.0F; // L: 127
				boolean var14 = true; // L: 128
				boolean var15 = false; // L: 129

				do {
					var15 = false; // L: 131
					if (var14) { // L: 132
						var6 = var1; // L: 133
						var13 = var4; // L: 134
						var7 = var2 - var1; // L: 135
						var8 = var7; // L: 136
						var14 = false; // L: 137
					}

					if (Math.abs(var13) < Math.abs(var5)) { // L: 139
						var1 = var2; // L: 140
						var2 = var6; // L: 141
						var6 = var1; // L: 142
						var4 = var5; // L: 143
						var5 = var13; // L: 144
						var13 = var4; // L: 145
					}

					float var16 = class125.field1466 * Math.abs(var2) + var3 * 0.5F; // L: 147
					float var17 = 0.5F * (var6 - var2); // L: 148
					boolean var18 = Math.abs(var17) > var16 && 0.0F != var5; // L: 149
					if (var18) { // L: 150
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) { // L: 151
							float var12 = var5 / var4; // L: 156
							float var9;
							float var10;
							if (var6 == var1) { // L: 157
								var9 = var12 * var17 * 2.0F; // L: 158
								var10 = 1.0F - var12; // L: 159
							} else {
								var10 = var4 / var13; // L: 162
								float var11 = var5 / var13; // L: 163
								var9 = ((var10 - var11) * var17 * 2.0F * var10 - (var2 - var1) * (var11 - 1.0F)) * var12; // L: 164
								var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F); // L: 165
							}

							if ((double)var9 > 0.0D) { // L: 167
								var10 = -var10;
							} else {
								var9 = -var9; // L: 168
							}

							var12 = var8; // L: 169
							var8 = var7; // L: 170
							if (var9 * 2.0F < 3.0F * var17 * var10 - Math.abs(var16 * var10) && var9 < Math.abs(0.5F * var12 * var10)) { // L: 171
								var7 = var9 / var10; // L: 172
							} else {
								var7 = var17; // L: 175
								var8 = var17; // L: 176
							}
						} else {
							var7 = var17; // L: 152
							var8 = var17; // L: 153
						}

						var1 = var2; // L: 179
						var4 = var5; // L: 180
						if (Math.abs(var7) > var16) { // L: 181
							var2 += var7;
						} else if ((double)var17 > 0.0D) { // L: 182
							var2 += var16;
						} else {
							var2 -= var16; // L: 183
						}

						var5 = DirectByteArrayCopier.method6617(var0.field4713, var0.field4712, var2); // L: 184
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) { // L: 185
							var14 = true; // L: 186
							var15 = true; // L: 187
						} else {
							var15 = true; // L: 190
						}
					}
				} while(var15);

				return var2; // L: 194
			}
		}
	}
}
