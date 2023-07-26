import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field3389;
	@ObfuscatedName("aw")
	byte[] field3381;
	@ObfuscatedName("ay")
	byte[] field3380;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1230818135
	)
	int field3382;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1609820909
	)
	int field3383;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 985281229
	)
	int field3385;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1653378025
	)
	int field3391;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1512198365
	)
	int field3386;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 22675099
	)
	int field3387;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 547658641
	)
	int field3388;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-19"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = UserComparator5.scene.getWallObjectTag(var0, var1, var2); // L: 6249
		int var7;
		int var8;
		int var9;
		int var10;
		int var14;
		int var26;
		if (0L != var5) { // L: 6250
			var7 = UserComparator5.scene.getObjectFlags(var0, var1, var2, var5); // L: 6251
			var8 = var7 >> 6 & 3; // L: 6252
			var9 = var7 & 31; // L: 6253
			var10 = var3; // L: 6254
			boolean var12 = 0L != var5; // L: 6257
			if (var12) { // L: 6258
				boolean var13 = (int)(var5 >>> 16 & 1L) == 1; // L: 6261
				var12 = !var13; // L: 6263
			}

			if (var12) { // L: 6267
				var10 = var4;
			}

			int[] var19 = Frames.field2621.pixels; // L: 6268
			var26 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6269
			var14 = class458.Entity_unpackID(var5); // L: 6270
			ObjectComposition var15 = class90.getObjectDefinition(var14); // L: 6271
			if (var15.mapSceneId != -1) { // L: 6272
				IndexedSprite var16 = class282.mapSceneSprites[var15.mapSceneId]; // L: 6273
				if (var16 != null) { // L: 6274
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 6275
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 6276
					var16.drawAt(var17 + var1 * 4 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48); // L: 6277
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6281
					if (var8 == 0) { // L: 6282
						var19[var26] = var10; // L: 6283
						var19[var26 + 512] = var10; // L: 6284
						var19[var26 + 1024] = var10; // L: 6285
						var19[var26 + 1536] = var10; // L: 6286
					} else if (var8 == 1) { // L: 6288
						var19[var26] = var10; // L: 6289
						var19[var26 + 1] = var10; // L: 6290
						var19[var26 + 2] = var10; // L: 6291
						var19[var26 + 3] = var10; // L: 6292
					} else if (var8 == 2) { // L: 6294
						var19[var26 + 3] = var10; // L: 6295
						var19[var26 + 512 + 3] = var10; // L: 6296
						var19[var26 + 1024 + 3] = var10; // L: 6297
						var19[var26 + 1536 + 3] = var10; // L: 6298
					} else if (var8 == 3) { // L: 6300
						var19[var26 + 1536] = var10; // L: 6301
						var19[var26 + 1536 + 1] = var10; // L: 6302
						var19[var26 + 1536 + 2] = var10; // L: 6303
						var19[var26 + 1536 + 3] = var10; // L: 6304
					}
				}

				if (var9 == 3) { // L: 6307
					if (var8 == 0) { // L: 6308
						var19[var26] = var10;
					} else if (var8 == 1) { // L: 6309
						var19[var26 + 3] = var10;
					} else if (var8 == 2) { // L: 6310
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6311
						var19[var26 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6313
					if (var8 == 3) { // L: 6314
						var19[var26] = var10; // L: 6315
						var19[var26 + 512] = var10; // L: 6316
						var19[var26 + 1024] = var10; // L: 6317
						var19[var26 + 1536] = var10; // L: 6318
					} else if (var8 == 0) { // L: 6320
						var19[var26] = var10; // L: 6321
						var19[var26 + 1] = var10; // L: 6322
						var19[var26 + 2] = var10; // L: 6323
						var19[var26 + 3] = var10; // L: 6324
					} else if (var8 == 1) { // L: 6326
						var19[var26 + 3] = var10; // L: 6327
						var19[var26 + 512 + 3] = var10; // L: 6328
						var19[var26 + 1024 + 3] = var10; // L: 6329
						var19[var26 + 1536 + 3] = var10; // L: 6330
					} else if (var8 == 2) { // L: 6332
						var19[var26 + 1536] = var10; // L: 6333
						var19[var26 + 1536 + 1] = var10; // L: 6334
						var19[var26 + 1536 + 2] = var10; // L: 6335
						var19[var26 + 1536 + 3] = var10; // L: 6336
					}
				}
			}
		}

		var5 = UserComparator5.scene.getGameObjectTag(var0, var1, var2); // L: 6341
		if (0L != var5) { // L: 6342
			var7 = UserComparator5.scene.getObjectFlags(var0, var1, var2, var5); // L: 6343
			var8 = var7 >> 6 & 3; // L: 6344
			var9 = var7 & 31; // L: 6345
			var10 = class458.Entity_unpackID(var5); // L: 6346
			ObjectComposition var20 = class90.getObjectDefinition(var10); // L: 6347
			if (var20.mapSceneId != -1) { // L: 6348
				IndexedSprite var28 = class282.mapSceneSprites[var20.mapSceneId]; // L: 6349
				if (var28 != null) { // L: 6350
					var26 = (var20.sizeX * 4 - var28.subWidth) / 2; // L: 6351
					var14 = (var20.sizeY * 4 - var28.subHeight) / 2; // L: 6352
					var28.drawAt(var26 + var1 * 4 + 48, var14 + (104 - var2 - var20.sizeY) * 4 + 48); // L: 6353
				}
			} else if (var9 == 9) { // L: 6356
				int var25 = 15658734; // L: 6357
				boolean var27 = var5 != 0L; // L: 6360
				if (var27) { // L: 6361
					boolean var21 = (int)(var5 >>> 16 & 1L) == 1; // L: 6364
					var27 = !var21; // L: 6366
				}

				if (var27) { // L: 6370
					var25 = 15597568;
				}

				int[] var22 = Frames.field2621.pixels; // L: 6371
				int var29 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6372
				if (var8 != 0 && var8 != 2) { // L: 6373
					var22[var29] = var25; // L: 6380
					var22[var29 + 1 + 512] = var25; // L: 6381
					var22[var29 + 1024 + 2] = var25; // L: 6382
					var22[var29 + 1536 + 3] = var25; // L: 6383
				} else {
					var22[var29 + 1536] = var25; // L: 6374
					var22[var29 + 1 + 1024] = var25; // L: 6375
					var22[var29 + 512 + 2] = var25; // L: 6376
					var22[var29 + 3] = var25; // L: 6377
				}
			}
		}

		var5 = UserComparator5.scene.getGroundObjectTag(var0, var1, var2); // L: 6387
		if (var5 != 0L) { // L: 6388
			var7 = class458.Entity_unpackID(var5); // L: 6389
			ObjectComposition var23 = class90.getObjectDefinition(var7); // L: 6390
			if (var23.mapSceneId != -1) { // L: 6391
				IndexedSprite var24 = class282.mapSceneSprites[var23.mapSceneId]; // L: 6392
				if (var24 != null) { // L: 6393
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 6394
					int var11 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 6395
					var24.drawAt(var1 * 4 + var10 + 48, var11 + (104 - var2 - var23.sizeY) * 4 + 48); // L: 6396
				}
			}
		}

	} // L: 6400
}
