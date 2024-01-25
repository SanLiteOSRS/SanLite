import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("am")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("ap")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -47945815
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("aj")
	static short[][][] field1021;
	@ObfuscatedName("aq")
	static short[][][] field1011;
	@ObfuscatedName("aw")
	static int[][][] field1012;
	@ObfuscatedName("ay")
	static final int[] field1014;
	@ObfuscatedName("as")
	static final int[] field1015;
	@ObfuscatedName("ab")
	static final int[] field1018;
	@ObfuscatedName("ah")
	static final int[] field1017;
	@ObfuscatedName("ai")
	static final int[] field1010;
	@ObfuscatedName("ac")
	static final int[] field1007;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -605866805
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1897521151
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105]; // L: 13
		Tiles_renderFlags = new byte[4][104][104]; // L: 14
		Tiles_minPlane = 99; // L: 15
		field1014 = new int[]{1, 2, 4, 8}; // L: 31
		field1015 = new int[]{16, 32, 64, 128}; // L: 32
		field1018 = new int[]{1, 0, -1, 0}; // L: 33
		field1017 = new int[]{0, -1, 0, 1}; // L: 34
		field1010 = new int[]{1, -1, -1, 1}; // L: 35
		field1007 = new int[]{-1, -1, 1, 1}; // L: 36
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 37
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 38
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILkn;[Lii;)V"
	)
	static final void method2274(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 304
		int var11 = -1; // L: 305

		while (true) {
			int var12 = var10.method9404(); // L: 307
			if (var12 == 0) { // L: 308
				return; // L: 391
			}

			var11 += var12; // L: 309
			int var13 = 0; // L: 310

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 312
				if (var14 == 0) { // L: 313
					break;
				}

				var13 += var14 - 1; // L: 314
				int var15 = var13 & 63; // L: 315
				int var16 = var13 >> 6 & 63; // L: 316
				int var17 = var13 >> 12; // L: 317
				int var18 = var10.readUnsignedByte(); // L: 318
				int var19 = var18 >> 2; // L: 319
				int var20 = var18 & 3; // L: 320
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 321
					ObjectComposition var21 = class137.getObjectDefinition(var11); // L: 322
					int var24 = var16 & 7; // L: 325
					int var25 = var15 & 7; // L: 326
					int var27 = var21.sizeX; // L: 328
					int var28 = var21.sizeY; // L: 329
					int var29;
					if ((var20 & 1) == 1) { // L: 331
						var29 = var27; // L: 332
						var27 = var28; // L: 333
						var28 = var29; // L: 334
					}

					int var26 = var7 & 3; // L: 336
					int var23;
					if (var26 == 0) { // L: 337
						var23 = var24; // L: 338
					} else if (var26 == 1) { // L: 341
						var23 = var25; // L: 342
					} else if (var26 == 2) { // L: 345
						var23 = 7 - var24 - (var27 - 1); // L: 346
					} else {
						var23 = 7 - var25 - (var28 - 1); // L: 349
					}

					var29 = var2 + var23; // L: 351
					int var32 = var16 & 7; // L: 354
					int var33 = var15 & 7; // L: 355
					int var35 = var21.sizeX; // L: 357
					int var36 = var21.sizeY; // L: 358
					int var37;
					if ((var20 & 1) == 1) { // L: 360
						var37 = var35; // L: 361
						var35 = var36; // L: 362
						var36 = var37; // L: 363
					}

					int var34 = var7 & 3; // L: 365
					int var31;
					if (var34 == 0) { // L: 366
						var31 = var33; // L: 367
					} else if (var34 == 1) { // L: 370
						var31 = 7 - var32 - (var35 - 1); // L: 371
					} else if (var34 == 2) { // L: 374
						var31 = 7 - var33 - (var36 - 1); // L: 375
					} else {
						var31 = var32; // L: 378
					}

					var37 = var3 + var31; // L: 380
					if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) { // L: 381
						int var38 = var1; // L: 382
						if ((Tiles_renderFlags[1][var29][var37] & 2) == 2) { // L: 383
							var38 = var1 - 1;
						}

						CollisionMap var39 = null; // L: 384
						if (var38 >= 0) { // L: 385
							var39 = var9[var38];
						}

						class59.addObjects(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39); // L: 386
					}
				}
			}
		}
	}
}
