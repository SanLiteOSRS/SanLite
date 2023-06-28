import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("at")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("an")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1143562485
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ab")
	static byte[][][] field1018;
	@ObfuscatedName("aa")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ad")
	static int[] field1019;
	@ObfuscatedName("ac")
	static int[][][] field1020;
	@ObfuscatedName("az")
	static final int[] field1021;
	@ObfuscatedName("au")
	static final int[] field1022;
	@ObfuscatedName("ai")
	static final int[] field1014;
	@ObfuscatedName("aq")
	static final int[] field1023;
	@ObfuscatedName("aw")
	static final int[] field1025;
	@ObfuscatedName("ay")
	static final int[] field1026;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -318893965
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1262350389
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105]; // L: 13
		Tiles_renderFlags = new byte[4][104][104]; // L: 14
		Tiles_minPlane = 99; // L: 15
		field1021 = new int[]{1, 2, 4, 8}; // L: 31
		field1022 = new int[]{16, 32, 64, 128}; // L: 32
		field1014 = new int[]{1, 0, -1, 0}; // L: 33
		field1023 = new int[]{0, -1, 0, 1}; // L: 34
		field1025 = new int[]{1, -1, -1, 1}; // L: 35
		field1026 = new int[]{-1, -1, 1, 1}; // L: 36
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 37
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 38
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-31660228"
	)
	static final int method2209(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 9
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILiz;[Lic;)V"
	)
	static final void method2167(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 286
		int var11 = -1; // L: 287

		while (true) {
			int var12 = var10.method9023(); // L: 289
			if (var12 == 0) { // L: 290
				return; // L: 317
			}

			var11 += var12; // L: 291
			int var13 = 0; // L: 292

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 294
				if (var14 == 0) { // L: 295
					break;
				}

				var13 += var14 - 1; // L: 296
				int var15 = var13 & 63; // L: 297
				int var16 = var13 >> 6 & 63; // L: 298
				int var17 = var13 >> 12; // L: 299
				int var18 = var10.readUnsignedByte(); // L: 300
				int var19 = var18 >> 2; // L: 301
				int var20 = var18 & 3; // L: 302
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 303
					ObjectComposition var21 = class175.getObjectDefinition(var11); // L: 304
					int var22 = var2 + Canvas.method327(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 305
					int var23 = var3 + class226.method4468(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 306
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) { // L: 307
						int var24 = var1; // L: 308
						if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) { // L: 309
							var24 = var1 - 1;
						}

						CollisionMap var25 = null; // L: 310
						if (var24 >= 0) { // L: 311
							var25 = var9[var24];
						}

						SpriteMask.addObjects(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25); // L: 312
					}
				}
			}
		}
	}
}
