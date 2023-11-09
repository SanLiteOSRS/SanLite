import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("GroundObject")
public final class GroundObject {
	@ObfuscatedName("wu")
	@ObfuscatedGetter(
		intValue = 1751367133
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 911777147
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1338252561
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 770781785
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -1945442503369977675L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1818173271
	)
	@Export("flags")
	int flags;

	GroundObject() {
	} // L: 11

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lni;II)Lty;",
		garbageValue = "-1468823287"
	)
	public static IndexedSprite method4310(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1); // L: 125
		boolean var2;
		if (var3 == null) { // L: 126
			var2 = false; // L: 127
		} else {
			ViewportMouse.SpriteBuffer_decode(var3); // L: 130
			var2 = true; // L: 131
		}

		if (!var2) { // L: 133
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite(); // L: 136
			var4.width = class515.SpriteBuffer_spriteWidth; // L: 137
			var4.height = class515.SpriteBuffer_spriteHeight; // L: 138
			var4.xOffset = class515.SpriteBuffer_xOffsets[0]; // L: 139
			var4.yOffset = class515.SpriteBuffer_yOffsets[0]; // L: 140
			var4.subWidth = SecureRandomCallable.SpriteBuffer_spriteWidths[0]; // L: 141
			var4.subHeight = SecureRandomCallable.SpriteBuffer_spriteHeights[0]; // L: 142
			var4.palette = class515.SpriteBuffer_spritePalette; // L: 143
			var4.pixels = WorldMapDecoration.SpriteBuffer_pixels[0]; // L: 144
			FriendLoginUpdate.method7789(); // L: 145
			return var4; // L: 148
		}
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1454195884"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = UserComparator4.scene.getWallObjectTag(var0, var1, var2); // L: 6185
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) { // L: 6186
			var7 = UserComparator4.scene.getObjectFlags(var0, var1, var2, var5); // L: 6187
			var8 = var7 >> 6 & 3; // L: 6188
			var9 = var7 & 31; // L: 6189
			var10 = var3; // L: 6190
			if (class341.method6639(var5)) { // L: 6191
				var10 = var4;
			}

			int[] var11 = class178.sceneMinimapSprite.pixels; // L: 6192
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6193
			var13 = class299.Entity_unpackID(var5); // L: 6194
			ObjectComposition var14 = class59.getObjectDefinition(var13); // L: 6195
			if (var14.mapSceneId != -1) { // L: 6196
				IndexedSprite var15 = GrandExchangeOfferTotalQuantityComparator.mapSceneSprites[var14.mapSceneId]; // L: 6197
				if (var15 != null) { // L: 6198
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 6199
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 6200
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 6201
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6205
					if (var8 == 0) { // L: 6206
						var11[var12] = var10; // L: 6207
						var11[var12 + 512] = var10; // L: 6208
						var11[var12 + 1024] = var10; // L: 6209
						var11[var12 + 1536] = var10; // L: 6210
					} else if (var8 == 1) { // L: 6212
						var11[var12] = var10; // L: 6213
						var11[var12 + 1] = var10; // L: 6214
						var11[var12 + 2] = var10; // L: 6215
						var11[var12 + 3] = var10; // L: 6216
					} else if (var8 == 2) { // L: 6218
						var11[var12 + 3] = var10; // L: 6219
						var11[var12 + 512 + 3] = var10; // L: 6220
						var11[var12 + 1024 + 3] = var10; // L: 6221
						var11[var12 + 1536 + 3] = var10; // L: 6222
					} else if (var8 == 3) { // L: 6224
						var11[var12 + 1536] = var10; // L: 6225
						var11[var12 + 1536 + 1] = var10; // L: 6226
						var11[var12 + 1536 + 2] = var10; // L: 6227
						var11[var12 + 1536 + 3] = var10; // L: 6228
					}
				}

				if (var9 == 3) { // L: 6231
					if (var8 == 0) { // L: 6232
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 6233
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 6234
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6235
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6237
					if (var8 == 3) { // L: 6238
						var11[var12] = var10; // L: 6239
						var11[var12 + 512] = var10; // L: 6240
						var11[var12 + 1024] = var10; // L: 6241
						var11[var12 + 1536] = var10; // L: 6242
					} else if (var8 == 0) { // L: 6244
						var11[var12] = var10; // L: 6245
						var11[var12 + 1] = var10; // L: 6246
						var11[var12 + 2] = var10; // L: 6247
						var11[var12 + 3] = var10; // L: 6248
					} else if (var8 == 1) { // L: 6250
						var11[var12 + 3] = var10; // L: 6251
						var11[var12 + 512 + 3] = var10; // L: 6252
						var11[var12 + 1024 + 3] = var10; // L: 6253
						var11[var12 + 1536 + 3] = var10; // L: 6254
					} else if (var8 == 2) { // L: 6256
						var11[var12 + 1536] = var10; // L: 6257
						var11[var12 + 1536 + 1] = var10; // L: 6258
						var11[var12 + 1536 + 2] = var10; // L: 6259
						var11[var12 + 1536 + 3] = var10; // L: 6260
					}
				}
			}
		}

		var5 = UserComparator4.scene.getGameObjectTag(var0, var1, var2); // L: 6265
		if (0L != var5) { // L: 6266
			var7 = UserComparator4.scene.getObjectFlags(var0, var1, var2, var5); // L: 6267
			var8 = var7 >> 6 & 3; // L: 6268
			var9 = var7 & 31; // L: 6269
			var10 = class299.Entity_unpackID(var5); // L: 6270
			ObjectComposition var24 = class59.getObjectDefinition(var10); // L: 6271
			int var19;
			if (var24.mapSceneId != -1) { // L: 6272
				IndexedSprite var20 = GrandExchangeOfferTotalQuantityComparator.mapSceneSprites[var24.mapSceneId]; // L: 6273
				if (var20 != null) { // L: 6274
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 6275
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 6276
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 6277
				}
			} else if (var9 == 9) { // L: 6280
				var12 = 15658734; // L: 6281
				if (class341.method6639(var5)) { // L: 6282
					var12 = 15597568;
				}

				int[] var18 = class178.sceneMinimapSprite.pixels; // L: 6283
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6284
				if (var8 != 0 && var8 != 2) { // L: 6285
					var18[var19] = var12; // L: 6292
					var18[var19 + 1 + 512] = var12; // L: 6293
					var18[var19 + 1024 + 2] = var12; // L: 6294
					var18[var19 + 1536 + 3] = var12; // L: 6295
				} else {
					var18[var19 + 1536] = var12; // L: 6286
					var18[var19 + 1 + 1024] = var12; // L: 6287
					var18[var19 + 512 + 2] = var12; // L: 6288
					var18[var19 + 3] = var12; // L: 6289
				}
			}
		}

		var5 = UserComparator4.scene.getGroundObjectTag(var0, var1, var2); // L: 6299
		if (0L != var5) { // L: 6300
			var7 = class299.Entity_unpackID(var5); // L: 6301
			ObjectComposition var21 = class59.getObjectDefinition(var7); // L: 6302
			if (var21.mapSceneId != -1) { // L: 6303
				IndexedSprite var22 = GrandExchangeOfferTotalQuantityComparator.mapSceneSprites[var21.mapSceneId]; // L: 6304
				if (var22 != null) { // L: 6305
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6306
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6307
					var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48); // L: 6308
				}
			}
		}

	} // L: 6312
}
