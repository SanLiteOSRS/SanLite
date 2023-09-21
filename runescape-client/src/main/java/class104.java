import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class104 {
	@ObfuscatedName("aa")
	public static short[][] field1342;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -486293299
	)
	int field1343;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 376070003
	)
	int field1338;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 557862203
	)
	int field1339;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 44402109
	)
	int field1341;

	class104(int var1, int var2, int var3, int var4) {
		this.field1343 = var1; // L: 10
		this.field1338 = var2; // L: 11
		this.field1339 = var3; // L: 12
		this.field1341 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "86"
	)
	int method2706() {
		return this.field1343; // L: 17
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "433721125"
	)
	int method2695() {
		return this.field1338; // L: 21
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1676197536"
	)
	int method2707() {
		return this.field1339; // L: 25
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	int method2694() {
		return this.field1341; // L: 29
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lfz;FZI)F",
		garbageValue = "-1944566118"
	)
	static float method2712(class132 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 209
		if (var0 != null && var0.method3017() != 0) {
			float var4 = (float)var0.field1541[0].field1492; // L: 213
			float var5 = (float)var0.field1541[var0.method3017() - 1].field1492; // L: 214
			float var6 = var5 - var4;
			if (0.0D == (double)var6) { // L: 216
				return var0.field1541[0].field1490; // L: 217
			} else {
				float var7 = 0.0F; // L: 219
				if (var1 > var5) { // L: 220
					var7 = (var1 - var5) / var6; // L: 221
				} else {
					var7 = (var1 - var4) / var6; // L: 224
				}

				double var8 = (double)((int)var7); // L: 226
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 227
				float var11 = var10 * var6; // L: 228
				var8 = Math.abs(var8 + 1.0D); // L: 229
				double var12 = var8 / 2.0D; // L: 230
				double var14 = (double)((int)var12); // L: 231
				var10 = (float)(var12 - var14); // L: 232
				float var16;
				float var17;
				if (var2) { // L: 235
					if (var0.field1547 == class130.field1522) { // L: 236
						if ((double)var10 != 0.0D) { // L: 237
							var11 += var4; // L: 238
						} else {
							var11 = var5 - var11; // L: 241
						}
					} else if (var0.field1547 != class130.field1525 && var0.field1547 != class130.field1526) { // L: 244
						if (var0.field1547 == class130.field1523) { // L: 247
							var11 = var4 - var1; // L: 248
							var16 = var0.field1541[0].field1491; // L: 249
							var17 = var0.field1541[0].field1495; // L: 250
							var3 = var0.field1541[0].field1490; // L: 251
							if ((double)var16 != 0.0D) { // L: 252
								var3 -= var17 * var11 / var16; // L: 253
							}

							return var3; // L: 255
						}
					} else {
						var11 = var5 - var11; // L: 245
					}
				} else if (var0.field1553 == class130.field1522) { // L: 259
					if ((double)var10 != 0.0D) { // L: 260
						var11 = var5 - var11; // L: 261
					} else {
						var11 += var4; // L: 264
					}
				} else if (var0.field1553 != class130.field1525 && var0.field1553 != class130.field1526) { // L: 267
					if (var0.field1553 == class130.field1523) { // L: 270
						var11 = var1 - var5; // L: 271
						var16 = var0.field1541[var0.method3017() - 1].field1489; // L: 272
						var17 = var0.field1541[var0.method3017() - 1].field1494; // L: 273
						var3 = var0.field1541[var0.method3017() - 1].field1490; // L: 274
						if ((double)var16 != 0.0D) { // L: 275
							var3 += var11 * var17 / var16; // L: 276
						}

						return var3; // L: 278
					}
				} else {
					var11 += var4; // L: 268
				}

				var3 = class183.method3586(var0, var11); // L: 281
				float var18;
				if (var2 && var0.field1547 == class130.field1526) { // L: 283
					var18 = var0.field1541[var0.method3017() - 1].field1490 - var0.field1541[0].field1490; // L: 284
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 285
				} else if (!var2 && var0.field1553 == class130.field1526) { // L: 287
					var18 = var0.field1541[var0.method3017() - 1].field1490 - var0.field1541[0].field1490; // L: 288
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 289
				}

				return var3; // L: 291
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lul;IIIIIIB)V",
		garbageValue = "76"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104; // L: 171
		int var8;
		if (var7) { // L: 173
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 174

			while (true) {
				var8 = var0.readUnsignedShort(); // L: 176
				if (var8 == 0) { // L: 177
					if (var1 == 0) { // L: 178
						Tiles.Tiles_heights[0][var2][var3] = -class530.method9468(932731 + var4, var5 + 556238) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 179
					}
					break;
				}

				if (var8 == 1) { // L: 182
					int var9 = var0.readUnsignedByte(); // L: 183
					if (var9 == 1) {
						var9 = 0; // L: 184
					}

					if (var1 == 0) { // L: 185
						Tiles.Tiles_heights[0][var2][var3] = -var9 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var9 * 8; // L: 186
					}
					break;
				}

				if (var8 <= 49) { // L: 189
					VertexNormal.field2820[var1][var2][var3] = (short)var0.readShort(); // L: 190
					SecureRandomFuture.field997[var1][var2][var3] = (byte)((var8 - 2) / 4); // L: 191
					class199.field2004[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3); // L: 192
				} else if (var8 <= 81) { // L: 195
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var8 - 49); // L: 196
				} else {
					World.field841[var1][var2][var3] = (short)(var8 - 81); // L: 199
				}
			}
		} else {
			while (true) {
				var8 = var0.readUnsignedShort(); // L: 204
				if (var8 == 0) { // L: 205
					break;
				}

				if (var8 == 1) { // L: 206
					var0.readUnsignedByte(); // L: 207
					break; // L: 208
				}

				if (var8 <= 49) { // L: 210
					var0.readShort(); // L: 211
				}
			}
		}

	} // L: 215

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-1642041169"
	)
	static int method2711(int var0, Script var1, boolean var2) {
		return 2; // L: 5106
	}
}
