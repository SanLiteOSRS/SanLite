import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2126070551
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1014530325
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1964880024"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lil;",
		garbageValue = "-1317041670"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1769700454"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-932852742"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "126"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0; // L: 33
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1650119608"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = class4.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) { // L: 54
					break;
				}

				return false;
			case 1:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) { // L: 49
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) { // L: 44
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) { // L: 71
					break;
				}

				return false;
			case 1:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) { // L: 66
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 61
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "38"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel(); // L: 79
		if (var3 == null) { // L: 80
			return false; // L: 81
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) { // L: 83
			return var2 >= this.screenY && var2 <= var3.height + this.screenY; // L: 84
		} else {
			return false; // L: 85
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-574378563"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = WorldMapAreaData.scene.getWallObjectTag(var0, var1, var2); // L: 6223
		int var7;
		int var8;
		int var9;
		int var10;
		int var14;
		int var26;
		if (var5 != 0L) { // L: 6224
			var7 = WorldMapAreaData.scene.getObjectFlags(var0, var1, var2, var5); // L: 6225
			var8 = var7 >> 6 & 3; // L: 6226
			var9 = var7 & 31; // L: 6227
			var10 = var3; // L: 6228
			boolean var12 = 0L != var5; // L: 6231
			if (var12) { // L: 6232
				boolean var13 = (int)(var5 >>> 16 & 1L) == 1; // L: 6235
				var12 = !var13; // L: 6237
			}

			if (var12) { // L: 6241
				var10 = var4;
			}

			int[] var19 = class31.sceneMinimapSprite.pixels; // L: 6242
			var26 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6243
			var14 = class124.Entity_unpackID(var5); // L: 6244
			ObjectComposition var15 = class463.getObjectDefinition(var14); // L: 6245
			if (var15.mapSceneId != -1) { // L: 6246
				IndexedSprite var16 = VarpDefinition.mapSceneSprites[var15.mapSceneId]; // L: 6247
				if (var16 != null) { // L: 6248
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 6249
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 6250
					var16.drawAt(var1 * 4 + var17 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48); // L: 6251
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6255
					if (var8 == 0) { // L: 6256
						var19[var26] = var10; // L: 6257
						var19[var26 + 512] = var10; // L: 6258
						var19[var26 + 1024] = var10; // L: 6259
						var19[var26 + 1536] = var10; // L: 6260
					} else if (var8 == 1) { // L: 6262
						var19[var26] = var10; // L: 6263
						var19[var26 + 1] = var10; // L: 6264
						var19[var26 + 2] = var10; // L: 6265
						var19[var26 + 3] = var10; // L: 6266
					} else if (var8 == 2) { // L: 6268
						var19[var26 + 3] = var10; // L: 6269
						var19[var26 + 512 + 3] = var10; // L: 6270
						var19[var26 + 1024 + 3] = var10; // L: 6271
						var19[var26 + 1536 + 3] = var10; // L: 6272
					} else if (var8 == 3) { // L: 6274
						var19[var26 + 1536] = var10; // L: 6275
						var19[var26 + 1536 + 1] = var10; // L: 6276
						var19[var26 + 1536 + 2] = var10; // L: 6277
						var19[var26 + 1536 + 3] = var10; // L: 6278
					}
				}

				if (var9 == 3) { // L: 6281
					if (var8 == 0) { // L: 6282
						var19[var26] = var10;
					} else if (var8 == 1) { // L: 6283
						var19[var26 + 3] = var10;
					} else if (var8 == 2) { // L: 6284
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6285
						var19[var26 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6287
					if (var8 == 3) { // L: 6288
						var19[var26] = var10; // L: 6289
						var19[var26 + 512] = var10; // L: 6290
						var19[var26 + 1024] = var10; // L: 6291
						var19[var26 + 1536] = var10; // L: 6292
					} else if (var8 == 0) { // L: 6294
						var19[var26] = var10; // L: 6295
						var19[var26 + 1] = var10; // L: 6296
						var19[var26 + 2] = var10; // L: 6297
						var19[var26 + 3] = var10; // L: 6298
					} else if (var8 == 1) { // L: 6300
						var19[var26 + 3] = var10; // L: 6301
						var19[var26 + 512 + 3] = var10; // L: 6302
						var19[var26 + 1024 + 3] = var10; // L: 6303
						var19[var26 + 1536 + 3] = var10; // L: 6304
					} else if (var8 == 2) { // L: 6306
						var19[var26 + 1536] = var10; // L: 6307
						var19[var26 + 1536 + 1] = var10; // L: 6308
						var19[var26 + 1536 + 2] = var10; // L: 6309
						var19[var26 + 1536 + 3] = var10; // L: 6310
					}
				}
			}
		}

		var5 = WorldMapAreaData.scene.getGameObjectTag(var0, var1, var2); // L: 6315
		if (var5 != 0L) { // L: 6316
			var7 = WorldMapAreaData.scene.getObjectFlags(var0, var1, var2, var5); // L: 6317
			var8 = var7 >> 6 & 3; // L: 6318
			var9 = var7 & 31; // L: 6319
			var10 = class124.Entity_unpackID(var5); // L: 6320
			ObjectComposition var20 = class463.getObjectDefinition(var10); // L: 6321
			if (var20.mapSceneId != -1) { // L: 6322
				IndexedSprite var28 = VarpDefinition.mapSceneSprites[var20.mapSceneId]; // L: 6323
				if (var28 != null) { // L: 6324
					var26 = (var20.sizeX * 4 - var28.subWidth) / 2; // L: 6325
					var14 = (var20.sizeY * 4 - var28.subHeight) / 2; // L: 6326
					var28.drawAt(var26 + var1 * 4 + 48, (104 - var2 - var20.sizeY) * 4 + var14 + 48); // L: 6327
				}
			} else if (var9 == 9) { // L: 6330
				int var25 = 15658734; // L: 6331
				boolean var27 = var5 != 0L; // L: 6334
				if (var27) { // L: 6335
					boolean var21 = (int)(var5 >>> 16 & 1L) == 1; // L: 6338
					var27 = !var21; // L: 6340
				}

				if (var27) { // L: 6344
					var25 = 15597568;
				}

				int[] var22 = class31.sceneMinimapSprite.pixels; // L: 6345
				int var29 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6346
				if (var8 != 0 && var8 != 2) { // L: 6347
					var22[var29] = var25; // L: 6354
					var22[var29 + 1 + 512] = var25; // L: 6355
					var22[var29 + 1024 + 2] = var25; // L: 6356
					var22[var29 + 1536 + 3] = var25; // L: 6357
				} else {
					var22[var29 + 1536] = var25; // L: 6348
					var22[var29 + 1 + 1024] = var25; // L: 6349
					var22[var29 + 512 + 2] = var25; // L: 6350
					var22[var29 + 3] = var25; // L: 6351
				}
			}
		}

		var5 = WorldMapAreaData.scene.getGroundObjectTag(var0, var1, var2); // L: 6361
		if (0L != var5) { // L: 6362
			var7 = class124.Entity_unpackID(var5); // L: 6363
			ObjectComposition var23 = class463.getObjectDefinition(var7); // L: 6364
			if (var23.mapSceneId != -1) { // L: 6365
				IndexedSprite var24 = VarpDefinition.mapSceneSprites[var23.mapSceneId]; // L: 6366
				if (var24 != null) { // L: 6367
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 6368
					int var11 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 6369
					var24.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var23.sizeY) * 4 + var11 + 48); // L: 6370
				}
			}
		}

	} // L: 6374
}
