import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("af")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("an")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1401144457
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("au")
	static short[][][] field997;
	@ObfuscatedName("ab")
	static byte[][][] field1008;
	@ObfuscatedName("aq")
	static byte[][][] field999;
	@ObfuscatedName("al")
	static byte[][][] field994;
	@ObfuscatedName("at")
	static int[][] field996;
	@ObfuscatedName("ay")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("am")
	static final int[] field995;
	@ObfuscatedName("as")
	static final int[] field1006;
	@ObfuscatedName("aj")
	static final int[] field1007;
	@ObfuscatedName("ak")
	static final int[] field1003;
	@ObfuscatedName("az")
	static final int[] field1009;
	@ObfuscatedName("ad")
	static final int[] field1010;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -372405639
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -647485415
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105]; // L: 13
		Tiles_renderFlags = new byte[4][104][104]; // L: 14
		Tiles_minPlane = 99; // L: 15
		field995 = new int[]{1, 2, 4, 8}; // L: 31
		field1006 = new int[]{16, 32, 64, 128}; // L: 32
		field1007 = new int[]{1, 0, -1, 0}; // L: 33
		field1003 = new int[]{0, -1, 0, 1}; // L: 34
		field1009 = new int[]{1, -1, -1, 1}; // L: 35
		field1010 = new int[]{-1, -1, 1, 1}; // L: 36
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 37
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 38
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method2222() {
		try {
			File var0 = new File(HorizontalAlignment.userHomeDirectory, "random.dat"); // L: 212
			int var2;
			if (var0.exists()) { // L: 213
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 214
			} else {
				label39:
				for (int var1 = 0; var1 < class96.cacheSubPaths.length; ++var1) { // L: 217
					for (var2 = 0; var2 < class130.cacheParentPaths.length; ++var2) { // L: 218
						File var3 = new File(class130.cacheParentPaths[var2] + class96.cacheSubPaths[var1] + File.separatorChar + "random.dat"); // L: 219
						if (var3.exists()) { // L: 220
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 221
							break label39; // L: 222
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 227
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 228
				var2 = var4.read(); // L: 229
				var4.seek(0L); // L: 230
				var4.write(var2); // L: 231
				var4.seek(0L); // L: 232
				var4.close(); // L: 233
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 234
			}
		} catch (IOException var5) { // L: 237
		}

	} // L: 238

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILie;[Lif;)V"
	)
	static final void method2166(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 304
		int var11 = -1; // L: 305

		while (true) {
			int var12 = var10.method9178(); // L: 307
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
					ObjectComposition var21 = class144.getObjectDefinition(var11); // L: 322
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

						class207.addObjects(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39); // L: 386
					}
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1441948024"
	)
	public static void method2221() {
		Rasterizer3D.field2514.method4943(); // L: 157
	} // L: 158
}
