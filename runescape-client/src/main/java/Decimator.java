import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1192438423
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1121705603
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("au")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1; // L: 16
			int var5 = var2; // L: 17
			if (var2 > var1) { // L: 19
				var4 = var2; // L: 21
				var5 = var1; // L: 22
			}

			while (var5 != 0) { // L: 24
				int var6 = var4 % var5; // L: 25
				var4 = var5; // L: 26
				var5 = var6; // L: 27
			}

			var1 /= var4; // L: 32
			var2 /= var4; // L: 33
			this.inputRate = var1; // L: 34
			this.outputRate = var2; // L: 35
			this.table = new int[var1][14]; // L: 36

			for (int var7 = 0; var7 < var1; ++var7) { // L: 37
				int[] var8 = this.table[var7]; // L: 38
				double var9 = (double)var7 / (double)var1 + 6.0D; // L: 39
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D)); // L: 40
				if (var11 < 0) { // L: 41
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D); // L: 42
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) { // L: 44 45
					double var15 = 3.141592653589793D * ((double)var11 - var9); // L: 46
					double var17 = var13; // L: 47
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) { // L: 48
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(((double)var11 - var9) * 0.2243994752564138D); // L: 49
					var8[var11] = (int)Math.floor(65536.0D * var17 + 0.5D); // L: 50
				}
			}

		}
	} // L: 53

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "2088613185"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 56
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14; // L: 57
			int[] var3 = new int[var2]; // L: 58
			int var4 = 0; // L: 59
			int var5 = 0; // L: 60

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 61
				byte var7 = var1[var6]; // L: 62
				int[] var8 = this.table[var5]; // L: 63

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var4 + var9] += var7 * var8[var9];
				}

				var5 += this.outputRate; // L: 65
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9; // L: 67
				var5 -= var9 * this.inputRate; // L: 68
			}

			var1 = new byte[var2]; // L: 70

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16; // L: 72
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 75
				}
			}
		}

		return var1; // L: 78
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "114"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) { // L: 82
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate);
		}

		return var1; // L: 83
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-9"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 87
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1; // L: 88
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FZI)F",
		garbageValue = "2138001774"
	)
	static float method1152(class131 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 173
		if (var0 != null && var0.method3106() != 0) { // L: 174
			float var4 = (float)var0.field1530[0].field1477; // L: 177
			float var5 = (float)var0.field1530[var0.method3106() - 1].field1477; // L: 178
			float var6 = var5 - var4; // L: 179
			if (0.0D == (double)var6) { // L: 180
				return var0.field1530[0].field1478; // L: 181
			} else {
				float var7 = 0.0F; // L: 183
				if (var1 > var5) { // L: 184
					var7 = (var1 - var5) / var6; // L: 185
				} else {
					var7 = (var1 - var4) / var6; // L: 188
				}

				double var8 = (double)((int)var7); // L: 190
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 191
				float var11 = var10 * var6; // L: 192
				var8 = Math.abs(var8 + 1.0D); // L: 193
				double var12 = var8 / 2.0D; // L: 194
				double var14 = (double)((int)var12); // L: 195
				var10 = (float)(var12 - var14); // L: 196
				float var16;
				float var17;
				if (var2) { // L: 199
					if (var0.field1535 == class129.field1510) { // L: 200
						if (0.0D != (double)var10) { // L: 201
							var11 += var4; // L: 202
						} else {
							var11 = var5 - var11; // L: 205
						}
					} else if (var0.field1535 != class129.field1512 && var0.field1535 != class129.field1518) { // L: 208
						if (var0.field1535 == class129.field1514) { // L: 211
							var11 = var4 - var1; // L: 212
							var16 = var0.field1530[0].field1480; // L: 213
							var17 = var0.field1530[0].field1483; // L: 214
							var3 = var0.field1530[0].field1478; // L: 215
							if (0.0D != (double)var16) { // L: 216
								var3 -= var17 * var11 / var16; // L: 217
							}

							return var3; // L: 219
						}
					} else {
						var11 = var5 - var11; // L: 209
					}
				} else if (var0.field1529 == class129.field1510) { // L: 223
					if (0.0D != (double)var10) { // L: 224
						var11 = var5 - var11; // L: 225
					} else {
						var11 += var4; // L: 228
					}
				} else if (var0.field1529 != class129.field1512 && var0.field1529 != class129.field1518) { // L: 231
					if (var0.field1529 == class129.field1514) { // L: 234
						var11 = var1 - var5; // L: 235
						var16 = var0.field1530[var0.method3106() - 1].field1481; // L: 236
						var17 = var0.field1530[var0.method3106() - 1].field1482; // L: 237
						var3 = var0.field1530[var0.method3106() - 1].field1478; // L: 238
						if (0.0D != (double)var16) { // L: 239
							var3 += var11 * var17 / var16; // L: 240
						}

						return var3; // L: 242
					}
				} else {
					var11 += var4; // L: 232
				}

				var3 = class404.method7512(var0, var11); // L: 245
				float var18;
				if (var2 && var0.field1535 == class129.field1518) { // L: 247
					var18 = var0.field1530[var0.method3106() - 1].field1478 - var0.field1530[0].field1478; // L: 248
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 249
				} else if (!var2 && var0.field1529 == class129.field1518) { // L: 251
					var18 = var0.field1530[var0.method3106() - 1].field1478 - var0.field1530[0].field1478; // L: 252
					var3 = (float)((double)var3 + var8 * (double)var18); // L: 253
				}

				return var3; // L: 255
			}
		} else {
			return var3; // L: 175
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-17"
	)
	static void method1151(int var0, int var1) {
		int var2 = GrandExchangeOfferTotalQuantityComparator.fontBold12.stringWidth("Choose Option"); // L: 9465

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 9466
			Font var7 = GrandExchangeOfferTotalQuantityComparator.fontBold12; // L: 9467
			String var8;
			if (var3 < 0) { // L: 9470
				var8 = ""; // L: 9471
			} else if (Client.menuTargets[var3].length() > 0) { // L: 9474
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3]; // L: 9475
			}

			int var6 = var7.stringWidth(var8); // L: 9477
			if (var6 > var2) { // L: 9478
				var2 = var6;
			}
		}

		var2 += 8; // L: 9480
		var3 = Client.menuOptionsCount * 15 + 22; // L: 9481
		int var4 = var0 - var2 / 2; // L: 9482
		if (var2 + var4 > Language.canvasWidth) { // L: 9483
			var4 = Language.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 9484
			var4 = 0;
		}

		int var5 = var1; // L: 9485
		if (var1 + var3 > class47.canvasHeight) { // L: 9486
			var5 = class47.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 9487
			var5 = 0;
		}

		FriendSystem.menuX = var4; // L: 9488
		class60.menuY = var5; // L: 9489
		class428.menuWidth = var2; // L: 9490
		class515.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 9491
	} // L: 9492

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-3227"
	)
	static final void method1153(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12312
		if (var0 != WorldMapIcon_1.clientPreferences.method2554()) { // L: 12313
			label27: {
				if (WorldMapIcon_1.clientPreferences.method2554() == 0) { // L: 12315
					boolean var1 = !class316.field3424.isEmpty(); // L: 12318
					if (var1) { // L: 12320
						class72.method2137(class514.field5059, var0); // L: 12321
						Client.playingJingle = false; // L: 12322
						break label27;
					}
				}

				if (var0 == 0) { // L: 12326
					WorldMapManager.method4769(0, 0); // L: 12327
					Client.playingJingle = false; // L: 12328
				} else {
					WorldMapID.method4937(var0); // L: 12330
				}
			}

			WorldMapIcon_1.clientPreferences.method2553(var0); // L: 12332
		}

	} // L: 12334
}
