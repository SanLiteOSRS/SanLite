import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class103 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1357;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1349;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1359;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1351;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1350;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1353;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1354;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1352;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1355;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1364;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1358;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1356;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1360;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1361;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1362;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static final class103 field1363;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1140778173
	)
	int field1348;

	static {
		field1357 = new class103(0); // L: 2237
		field1349 = new class103(1); // L: 2238
		field1359 = new class103(2); // L: 2239
		field1351 = new class103(3); // L: 2240
		field1350 = new class103(4); // L: 2241
		field1353 = new class103(5); // L: 2242
		field1354 = new class103(6); // L: 2243
		field1352 = new class103(7); // L: 2244
		field1355 = new class103(8); // L: 2245
		field1364 = new class103(9); // L: 2246
		field1358 = new class103(10); // L: 2247
		field1356 = new class103(11); // L: 2248
		field1360 = new class103(12); // L: 2249
		field1361 = new class103(13); // L: 2250
		field1362 = new class103(14); // L: 2251
		field1363 = new class103(15); // L: 2252
	}

	class103(int var1) {
		this.field1348 = var1; // L: 2256
	} // L: 2257

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FB)I",
		garbageValue = "-57"
	)
	public static int method2716(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F; // L: 15

		for (int var8 = 0; var8 < var1 + 1; ++var8) { // L: 16
			var7 += Math.abs(var0[var8]); // L: 17
		}

		float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class121.field1462;
		if (var7 <= var24) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) {
				var9[var10] = 1.0F / var7 * var0[var10]; // L: 25
			}

			while (Math.abs(var9[var1]) < var24) {
				--var1; // L: 28
			}

			var10 = 0; // L: 30
			if (var1 == 0) { // L: 31
				return var10; // L: 32
			} else if (var1 == 1) { // L: 34
				var6[0] = -var9[0] / var9[1]; // L: 35
				boolean var22 = var3 ? var2 < var24 + var6[0] : var2 < var6[0] - var24; // L: 36
				boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var24 + var6[0]; // L: 37
				var10 = var22 && var23 ? 1 : 0; // L: 38
				if (var10 > 0) { // L: 39
					if (var3 && var6[0] < var2) { // L: 40
						var6[0] = var2; // L: 41
					} else if (var5 && var6[0] > var4) { // L: 43
						var6[0] = var4; // L: 44
					}
				}

				return var10; // L: 47
			} else {
				class427 var11 = new class427(var9, var1); // L: 50
				float[] var12 = new float[var1 + 1]; // L: 51

				for (int var13 = 1; var13 <= var1; ++var13) { // L: 52
					var12[var13 - 1] = (float)var13 * var9[var13]; // L: 53
				}

				float[] var21 = new float[var1 + 1]; // L: 55
				int var14 = method2716(var12, var1 - 1, var2, false, var4, false, var21); // L: 56
				if (var14 == -1) { // L: 57
					return 0; // L: 58
				} else {
					boolean var15 = false; // L: 60
					float var17 = 0.0F; // L: 62
					float var18 = 0.0F; // L: 63
					float var19 = 0.0F; // L: 64

					for (int var20 = 0; var20 <= var14; ++var20) { // L: 65
						if (var10 > var1) { // L: 66
							return var10;
						}

						float var16;
						if (var20 == 0) { // L: 67
							var16 = var2; // L: 68
							var18 = class424.method8171(var9, var1, var2); // L: 69
							if (Math.abs(var18) <= var24 && var3) { // L: 70
								var6[var10++] = var2;
							}
						} else {
							var16 = var19; // L: 73
							var18 = var17; // L: 74
						}

						if (var20 == var14) { // L: 76
							var19 = var4; // L: 77
							var15 = false; // L: 78
						} else {
							var19 = var21[var20]; // L: 81
						}

						var17 = class424.method8171(var9, var1, var19); // L: 83
						if (var15) { // L: 84
							var15 = false; // L: 85
						} else if (Math.abs(var17) < var24) { // L: 88
							if (var20 != var14 || var5) { // L: 89
								var6[var10++] = var19; // L: 90
								var15 = true; // L: 91
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) { // L: 94
							var6[var10++] = Frames.method4711(var11, var16, var19, 0.0F); // L: 95
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) { // L: 96
								var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F; // L: 97
								--var10; // L: 98
							}
						}
					}

					return var10; // L: 104
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lsh;",
		garbageValue = "1454430970"
	)
	public static class478 method2717(int var0) {
		int var1 = class476.field4942[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class478.field4948; // L: 21
		} else if (var1 == 2) { // L: 23
			return class478.field4946; // L: 24
		} else {
			return var1 == 3 ? class478.field4947 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "0"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		HealthBar.scrollBarSprites[0].drawAt(var0, var1); // L: 10576
		HealthBar.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10577
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field575); // L: 10578
		int var5 = var3 * (var3 - 32) / var4; // L: 10579
		if (var5 < 8) { // L: 10580
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10581
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field583); // L: 10582
		Rasterizer2D.method9439(var0, var6 + var1 + 16, var5, Client.field568); // L: 10583
		Rasterizer2D.method9439(var0 + 1, var6 + var1 + 16, var5, Client.field568); // L: 10584
		Rasterizer2D.method9400(var0, var6 + var1 + 16, 16, Client.field568); // L: 10585
		Rasterizer2D.method9400(var0, var6 + var1 + 17, 16, Client.field568); // L: 10586
		Rasterizer2D.method9439(var0 + 15, var6 + var1 + 16, var5, Client.field567); // L: 10587
		Rasterizer2D.method9439(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field567); // L: 10588
		Rasterizer2D.method9400(var0, var5 + var6 + var1 + 15, 16, Client.field567); // L: 10589
		Rasterizer2D.method9400(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field567); // L: 10590
	} // L: 10591

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "809507201"
	)
	static final int method2714() {
		float var0 = 200.0F * ((float)class20.clientPreferences.method2459() - 0.5F); // L: 11646
		return 100 - Math.round(var0); // L: 11647
	}
}
