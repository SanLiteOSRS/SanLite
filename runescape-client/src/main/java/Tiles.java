import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("s")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("h")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -625386397
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("v")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("c")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;
	@ObfuscatedName("k")
	static byte[][][] field975;
	@ObfuscatedName("p")
	static final int[] field977;
	@ObfuscatedName("e")
	static final int[] field978;
	@ObfuscatedName("b")
	static final int[] field979;
	@ObfuscatedName("x")
	static final int[] field982;
	@ObfuscatedName("f")
	static final int[] field981;
	@ObfuscatedName("t")
	static final int[] field970;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 565999891
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -917550561
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105]; // L: 16
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99; // L: 18
		field977 = new int[]{1, 2, 4, 8}; // L: 34
		field978 = new int[]{16, 32, 64, 128}; // L: 35
		field979 = new int[]{1, 0, -1, 0}; // L: 36
		field982 = new int[]{0, -1, 0, 1}; // L: 37
		field981 = new int[]{1, -1, -1, 1}; // L: 38
		field970 = new int[]{-1, -1, 1, 1}; // L: 39
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 40
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 41
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-9992"
	)
	static int method1973() {
		return ++Messages.Messages_count - 1; // L: 19
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lls;III)[Lqn;",
		garbageValue = "-2043818816"
	)
	public static SpritePixels[] method2024(AbstractArchive var0, int var1, int var2) {
		if (!Tile.method3937(var0, var1, var2)) { // L: 78
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[class457.SpriteBuffer_spriteCount]; // L: 81

			for (int var5 = 0; var5 < class457.SpriteBuffer_spriteCount; ++var5) { // L: 82
				SpritePixels var6 = var4[var5] = new SpritePixels(); // L: 83
				var6.width = class457.SpriteBuffer_spriteWidth; // L: 84
				var6.height = class457.SpriteBuffer_spriteHeight; // L: 85
				var6.xOffset = class457.SpriteBuffer_xOffsets[var5]; // L: 86
				var6.yOffset = InterfaceParent.SpriteBuffer_yOffsets[var5]; // L: 87
				var6.subWidth = class457.SpriteBuffer_spriteWidths[var5]; // L: 88
				var6.subHeight = SoundCache.SpriteBuffer_spriteHeights[var5]; // L: 89
				int var7 = var6.subWidth * var6.subHeight; // L: 90
				byte[] var8 = class181.SpriteBuffer_pixels[var5]; // L: 91
				var6.pixels = new int[var7]; // L: 92

				for (int var9 = 0; var9 < var7; ++var9) { // L: 93
					var6.pixels[var9] = class457.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			class457.SpriteBuffer_xOffsets = null; // L: 96
			InterfaceParent.SpriteBuffer_yOffsets = null; // L: 97
			class457.SpriteBuffer_spriteWidths = null; // L: 98
			SoundCache.SpriteBuffer_spriteHeights = null; // L: 99
			class457.SpriteBuffer_spritePalette = null; // L: 100
			class181.SpriteBuffer_pixels = null; // L: 101
			return var4; // L: 105
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	public static void method2022() {
		StructComposition.StructDefinition_cached.clear(); // L: 53
	} // L: 54

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILgy;[Lgl;)V"
	)
	static final void method2011(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 307
		int var11 = -1; // L: 308

		while (true) {
			int var12 = var10.method7881(); // L: 310
			if (var12 == 0) { // L: 311
				return; // L: 394
			}

			var11 += var12; // L: 312
			int var13 = 0; // L: 313

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 315
				if (var14 == 0) { // L: 316
					break;
				}

				var13 += var14 - 1; // L: 317
				int var15 = var13 & 63; // L: 318
				int var16 = var13 >> 6 & 63; // L: 319
				int var17 = var13 >> 12; // L: 320
				int var18 = var10.readUnsignedByte(); // L: 321
				int var19 = var18 >> 2; // L: 322
				int var20 = var18 & 3; // L: 323
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 324
					ObjectComposition var21 = FileSystem.getObjectDefinition(var11); // L: 325
					int var24 = var16 & 7; // L: 328
					int var25 = var15 & 7; // L: 329
					int var27 = var21.sizeX; // L: 331
					int var28 = var21.sizeY; // L: 332
					int var29;
					if ((var20 & 1) == 1) { // L: 334
						var29 = var27; // L: 335
						var27 = var28; // L: 336
						var28 = var29; // L: 337
					}

					int var26 = var7 & 3; // L: 339
					int var23;
					if (var26 == 0) { // L: 340
						var23 = var24; // L: 341
					} else if (var26 == 1) { // L: 344
						var23 = var25; // L: 345
					} else if (var26 == 2) { // L: 348
						var23 = 7 - var24 - (var27 - 1); // L: 349
					} else {
						var23 = 7 - var25 - (var28 - 1); // L: 352
					}

					var29 = var23 + var2; // L: 354
					int var32 = var16 & 7; // L: 357
					int var33 = var15 & 7; // L: 358
					int var35 = var21.sizeX; // L: 360
					int var36 = var21.sizeY; // L: 361
					int var37;
					if ((var20 & 1) == 1) { // L: 363
						var37 = var35; // L: 364
						var35 = var36; // L: 365
						var36 = var37; // L: 366
					}

					int var34 = var7 & 3; // L: 368
					int var31;
					if (var34 == 0) { // L: 369
						var31 = var33; // L: 370
					} else if (var34 == 1) { // L: 373
						var31 = 7 - var32 - (var35 - 1); // L: 374
					} else if (var34 == 2) { // L: 377
						var31 = 7 - var33 - (var36 - 1); // L: 378
					} else {
						var31 = var32; // L: 381
					}

					var37 = var31 + var3; // L: 383
					if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) { // L: 384
						int var38 = var1; // L: 385
						if ((Tiles_renderFlags[1][var29][var37] & 2) == 2) { // L: 386
							var38 = var1 - 1;
						}

						CollisionMap var39 = null; // L: 387
						if (var38 >= 0) { // L: 388
							var39 = var9[var38];
						}

						class347.addObjects(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39); // L: 389
					}
				}
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)Z",
		garbageValue = "3"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12080
	}
}
