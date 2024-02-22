import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	public static Font field406;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 1949191081
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1558579081
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 793602059
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("as")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var3 = NameableContainer.method8427(var1, var2); // L: 15
			var1 /= var3; // L: 16
			var2 /= var3;
			this.inputRate = var1; // L: 18
			this.outputRate = var2; // L: 19
			this.table = new int[var1][14]; // L: 20

			for (int var4 = 0; var4 < var1; ++var4) { // L: 21
				int[] var5 = this.table[var4]; // L: 22
				double var6 = 6.0D + (double)var4 / (double)var1; // L: 23
				int var8 = (int)Math.floor(var6 - 7.0D + 1.0D); // L: 24
				if (var8 < 0) { // L: 25
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6); // L: 26
				if (var9 > 14) { // L: 27
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) { // L: 28 29
					double var12 = 3.141592653589793D * ((double)var8 - var6); // L: 30
					double var14 = var10; // L: 31
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) { // L: 32
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6)); // L: 33
					var5[var8] = (int)Math.floor(65536.0D * var14 + 0.5D); // L: 34
				}
			}

		}
	} // L: 37

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "21"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 40
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14; // L: 41
			int[] var3 = new int[var2]; // L: 42
			int var4 = 0; // L: 43
			int var5 = 0; // L: 44

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 45
				byte var7 = var1[var6]; // L: 46
				int[] var8 = this.table[var5]; // L: 47

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 48
					var3[var9 + var4] += var8[var9] * var7;
				}

				var5 += this.outputRate; // L: 49
				var9 = var5 / this.inputRate; // L: 50
				var4 += var9; // L: 51
				var5 -= var9 * this.inputRate; // L: 52
			}

			var1 = new byte[var2]; // L: 54

			for (var6 = 0; var6 < var2; ++var6) { // L: 55
				int var10 = var3[var6] + 32768 >> 16; // L: 56
				if (var10 < -128) { // L: 57
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 58
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 59
				}
			}
		}

		return var1; // L: 62
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1434711410"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1; // L: 67
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1390182066"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 71
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1; // L: 72
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-717284719"
	)
	public static boolean method1103(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "747088777"
	)
	public static int method1107(int var0, int var1, int var2) {
		int var3 = class315.method6060(var2 - var1 + 1); // L: 64
		var3 <<= var1; // L: 65
		return var0 & ~var3; // L: 66
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-76245267"
	)
	static final int method1104(int var0, int var1) {
		int var2 = class210.method4166(var0 - 1, var1 - 1) + class210.method4166(var0 + 1, var1 - 1) + class210.method4166(var0 - 1, 1 + var1) + class210.method4166(var0 + 1, 1 + var1); // L: 986
		int var3 = class210.method4166(var0 - 1, var1) + class210.method4166(var0 + 1, var1) + class210.method4166(var0, var1 - 1) + class210.method4166(var0, 1 + var1); // L: 987
		int var4 = class210.method4166(var0, var1); // L: 988
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 989
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static final void method1096(int var0) {
		int[] var1 = class25.field118.pixels; // L: 6256
		int var2 = var1.length; // L: 6257

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 6258
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 6259
			var4 = (103 - var3) * 2048 + 24628; // L: 6260

			for (var5 = 1; var5 < 103; ++var5) { // L: 6261
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 6262
					Actor.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 6263
					Actor.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 6264
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 6267
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 6268
		class25.field118.setRaster(); // L: 6269

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 6270
			for (var6 = 1; var6 < 103; ++var6) { // L: 6271
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 6272
					FloorOverlayDefinition.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 6273
					FloorOverlayDefinition.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.field773 = 0; // L: 6276

		for (var5 = 0; var5 < 104; ++var5) { // L: 6277
			for (var6 = 0; var6 < 104; ++var6) { // L: 6278
				long var7 = Actor.scene.getGroundObjectTag(class473.Client_plane, var5, var6); // L: 6279
				if (var7 != 0L) { // L: 6280
					int var9 = Message.Entity_unpackID(var7); // L: 6281
					int var10 = class127.getObjectDefinition(var9).mapIconId; // L: 6282
					if (var10 >= 0 && class139.WorldMapElement_get(var10).field1876) { // L: 6283 6284
						Client.field776[Client.field773] = class139.WorldMapElement_get(var10).getSpriteBool(false); // L: 6287
						Client.field552[Client.field773] = var5; // L: 6288
						Client.field775[Client.field773] = var6; // L: 6289
						++Client.field773; // L: 6290
					}
				}
			}
		}

		UserComparator8.rasterProvider.apply(); // L: 6296
	} // L: 6298
}
