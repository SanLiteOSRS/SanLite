import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class102 {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	static Bounds field1343;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -404137777
	)
	int field1347;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -184686117
	)
	int field1349;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 519228135
	)
	int field1344;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1506450929
	)
	int field1345;

	class102(int var1, int var2, int var3, int var4) {
		this.field1347 = var1; // L: 10
		this.field1349 = var2; // L: 11
		this.field1344 = var3; // L: 12
		this.field1345 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-92"
	)
	int method2658() {
		return this.field1347; // L: 17
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "93"
	)
	int method2661() {
		return this.field1349; // L: 21
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-806640725"
	)
	int method2652() {
		return this.field1344; // L: 25
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1075721841"
	)
	int method2647() {
		return this.field1345; // L: 29
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "-880794678"
	)
	static String method2663(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 112
			if (var2 && var0 >= 0) { // L: 113
				int var3 = 2; // L: 114

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 115 116 118
					var4 /= var1; // L: 117
				}

				char[] var5 = new char[var3]; // L: 120
				var5[0] = '+'; // L: 121

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 122
					int var7 = var0; // L: 123
					var0 /= var1; // L: 124
					int var8 = var7 - var0 * var1; // L: 125
					if (var8 >= 10) { // L: 126
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 127
					}
				}

				return new String(var5); // L: 129
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2114213929"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class130.scene.getWallObjectTag(var0, var1, var2); // L: 6156
		int var7;
		int var8;
		int var9;
		int var10;
		int var14;
		int var26;
		if (0L != var5) { // L: 6157
			var7 = class130.scene.getObjectFlags(var0, var1, var2, var5); // L: 6158
			var8 = var7 >> 6 & 3; // L: 6159
			var9 = var7 & 31; // L: 6160
			var10 = var3; // L: 6161
			boolean var12 = 0L != var5; // L: 6164
			if (var12) { // L: 6165
				boolean var13 = (int)(var5 >>> 16 & 1L) == 1; // L: 6168
				var12 = !var13; // L: 6170
			}

			if (var12) { // L: 6174
				var10 = var4;
			}

			int[] var19 = AbstractUserComparator.sceneMinimapSprite.pixels; // L: 6175
			var26 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6176
			var14 = InvDefinition.Entity_unpackID(var5); // L: 6177
			ObjectComposition var15 = WorldMapElement.getObjectDefinition(var14); // L: 6178
			if (var15.mapSceneId != -1) { // L: 6179
				IndexedSprite var16 = class299.mapSceneSprites[var15.mapSceneId]; // L: 6180
				if (var16 != null) { // L: 6181
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 6182
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 6183
					var16.drawAt(var17 + var1 * 4 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48); // L: 6184
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6188
					if (var8 == 0) { // L: 6189
						var19[var26] = var10; // L: 6190
						var19[var26 + 512] = var10; // L: 6191
						var19[var26 + 1024] = var10; // L: 6192
						var19[var26 + 1536] = var10; // L: 6193
					} else if (var8 == 1) { // L: 6195
						var19[var26] = var10; // L: 6196
						var19[var26 + 1] = var10; // L: 6197
						var19[var26 + 2] = var10; // L: 6198
						var19[var26 + 3] = var10; // L: 6199
					} else if (var8 == 2) { // L: 6201
						var19[var26 + 3] = var10; // L: 6202
						var19[var26 + 512 + 3] = var10; // L: 6203
						var19[var26 + 1024 + 3] = var10; // L: 6204
						var19[var26 + 1536 + 3] = var10; // L: 6205
					} else if (var8 == 3) { // L: 6207
						var19[var26 + 1536] = var10; // L: 6208
						var19[var26 + 1536 + 1] = var10; // L: 6209
						var19[var26 + 1536 + 2] = var10; // L: 6210
						var19[var26 + 1536 + 3] = var10; // L: 6211
					}
				}

				if (var9 == 3) { // L: 6214
					if (var8 == 0) { // L: 6215
						var19[var26] = var10;
					} else if (var8 == 1) { // L: 6216
						var19[var26 + 3] = var10;
					} else if (var8 == 2) { // L: 6217
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6218
						var19[var26 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6220
					if (var8 == 3) { // L: 6221
						var19[var26] = var10; // L: 6222
						var19[var26 + 512] = var10; // L: 6223
						var19[var26 + 1024] = var10; // L: 6224
						var19[var26 + 1536] = var10; // L: 6225
					} else if (var8 == 0) { // L: 6227
						var19[var26] = var10; // L: 6228
						var19[var26 + 1] = var10; // L: 6229
						var19[var26 + 2] = var10; // L: 6230
						var19[var26 + 3] = var10; // L: 6231
					} else if (var8 == 1) { // L: 6233
						var19[var26 + 3] = var10; // L: 6234
						var19[var26 + 512 + 3] = var10; // L: 6235
						var19[var26 + 1024 + 3] = var10; // L: 6236
						var19[var26 + 1536 + 3] = var10; // L: 6237
					} else if (var8 == 2) { // L: 6239
						var19[var26 + 1536] = var10; // L: 6240
						var19[var26 + 1536 + 1] = var10; // L: 6241
						var19[var26 + 1536 + 2] = var10; // L: 6242
						var19[var26 + 1536 + 3] = var10; // L: 6243
					}
				}
			}
		}

		var5 = class130.scene.getGameObjectTag(var0, var1, var2); // L: 6248
		if (var5 != 0L) { // L: 6249
			var7 = class130.scene.getObjectFlags(var0, var1, var2, var5); // L: 6250
			var8 = var7 >> 6 & 3; // L: 6251
			var9 = var7 & 31; // L: 6252
			var10 = InvDefinition.Entity_unpackID(var5); // L: 6253
			ObjectComposition var20 = WorldMapElement.getObjectDefinition(var10); // L: 6254
			if (var20.mapSceneId != -1) { // L: 6255
				IndexedSprite var28 = class299.mapSceneSprites[var20.mapSceneId]; // L: 6256
				if (var28 != null) { // L: 6257
					var26 = (var20.sizeX * 4 - var28.subWidth) / 2; // L: 6258
					var14 = (var20.sizeY * 4 - var28.subHeight) / 2; // L: 6259
					var28.drawAt(var26 + var1 * 4 + 48, (104 - var2 - var20.sizeY) * 4 + var14 + 48); // L: 6260
				}
			} else if (var9 == 9) { // L: 6263
				int var25 = 15658734; // L: 6264
				boolean var27 = 0L != var5; // L: 6267
				if (var27) { // L: 6268
					boolean var21 = (int)(var5 >>> 16 & 1L) == 1; // L: 6271
					var27 = !var21; // L: 6273
				}

				if (var27) { // L: 6277
					var25 = 15597568;
				}

				int[] var22 = AbstractUserComparator.sceneMinimapSprite.pixels; // L: 6278
				int var29 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6279
				if (var8 != 0 && var8 != 2) { // L: 6280
					var22[var29] = var25; // L: 6287
					var22[var29 + 1 + 512] = var25; // L: 6288
					var22[var29 + 1024 + 2] = var25; // L: 6289
					var22[var29 + 1536 + 3] = var25; // L: 6290
				} else {
					var22[var29 + 1536] = var25; // L: 6281
					var22[var29 + 1 + 1024] = var25; // L: 6282
					var22[var29 + 512 + 2] = var25; // L: 6283
					var22[var29 + 3] = var25; // L: 6284
				}
			}
		}

		var5 = class130.scene.getGroundObjectTag(var0, var1, var2); // L: 6294
		if (var5 != 0L) { // L: 6295
			var7 = InvDefinition.Entity_unpackID(var5); // L: 6296
			ObjectComposition var23 = WorldMapElement.getObjectDefinition(var7); // L: 6297
			if (var23.mapSceneId != -1) { // L: 6298
				IndexedSprite var24 = class299.mapSceneSprites[var23.mapSceneId]; // L: 6299
				if (var24 != null) { // L: 6300
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 6301
					int var11 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 6302
					var24.drawAt(var1 * 4 + var10 + 48, (104 - var2 - var23.sizeY) * 4 + var11 + 48); // L: 6303
				}
			}
		}

	} // L: 6307
}
