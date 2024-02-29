import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("aq")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("aw")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -611988791
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ao")
	static int[][] field1049;
	@ObfuscatedName("ax")
	static int[][][] field1050;
	@ObfuscatedName("ad")
	static final int[] field1060;
	@ObfuscatedName("at")
	static final int[] field1056;
	@ObfuscatedName("ay")
	static final int[] field1053;
	@ObfuscatedName("ae")
	static final int[] field1054;
	@ObfuscatedName("ac")
	static final int[] field1055;
	@ObfuscatedName("ab")
	static final int[] field1046;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -514495155
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -51634815
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105]; // L: 13
		Tiles_renderFlags = new byte[4][104][104]; // L: 14
		Tiles_minPlane = 99; // L: 15
		field1060 = new int[]{1, 2, 4, 8}; // L: 31
		field1056 = new int[]{16, 32, 64, 128}; // L: 32
		field1053 = new int[]{1, 0, -1, 0}; // L: 33
		field1054 = new int[]{0, -1, 0, 1}; // L: 34
		field1055 = new int[]{1, -1, -1, 1}; // L: 35
		field1046 = new int[]{-1, -1, 1, 1}; // L: 36
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 37
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 38
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILkq;[Liz;)V"
	)
	static final void method2285(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 300
		int var11 = -1; // L: 301

		while (true) {
			int var12 = var10.method9660(); // L: 303
			if (var12 == 0) { // L: 304
				return; // L: 359
			}

			var11 += var12; // L: 305
			int var13 = 0; // L: 306

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 308
				if (var14 == 0) { // L: 309
					break;
				}

				var13 += var14 - 1; // L: 310
				int var15 = var13 & 63; // L: 311
				int var16 = var13 >> 6 & 63; // L: 312
				int var17 = var13 >> 12; // L: 313
				int var18 = var10.readUnsignedByte(); // L: 314
				int var19 = var18 >> 2; // L: 315
				int var20 = var18 & 3; // L: 316
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 317
					ObjectComposition var21 = class127.getObjectDefinition(var11); // L: 318
					int var22 = var2 + class190.method3772(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 319
					int var25 = var16 & 7; // L: 322
					int var26 = var15 & 7; // L: 323
					int var28 = var21.sizeX; // L: 325
					int var29 = var21.sizeY; // L: 326
					int var30;
					if ((var20 & 1) == 1) { // L: 328
						var30 = var28; // L: 329
						var28 = var29; // L: 330
						var29 = var30; // L: 331
					}

					int var27 = var7 & 3; // L: 333
					int var24;
					if (var27 == 0) { // L: 334
						var24 = var26; // L: 335
					} else if (var27 == 1) { // L: 338
						var24 = 7 - var25 - (var28 - 1); // L: 339
					} else if (var27 == 2) { // L: 342
						var24 = 7 - var26 - (var29 - 1); // L: 343
					} else {
						var24 = var25; // L: 346
					}

					var30 = var24 + var3; // L: 348
					if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) { // L: 349
						int var31 = var1; // L: 350
						if ((Tiles_renderFlags[1][var22][var30] & 2) == 2) { // L: 351
							var31 = var1 - 1;
						}

						CollisionMap var32 = null; // L: 352
						if (var31 >= 0) { // L: 353
							var32 = var9[var31];
						}

						ItemComposition.addObjects(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32); // L: 354
					}
				}
			}
		}
	}
}
