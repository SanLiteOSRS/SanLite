import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1245026205
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lte;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-831338467"
	)
	public static int method4249(int var0) {
		return var0 >>> 4 & class524.field5129; // L: 22
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIILkn;[Lii;B)V",
		garbageValue = "121"
	)
	static final void method4247(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 272
		int var6 = -1; // L: 273

		while (true) {
			int var7 = var5.method9404(); // L: 275
			if (var7 == 0) { // L: 276
				return; // L: 300
			}

			var6 += var7; // L: 277
			int var8 = 0; // L: 278

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 280
				if (var9 == 0) { // L: 281
					break;
				}

				var8 += var9 - 1; // L: 282
				int var10 = var8 & 63; // L: 283
				int var11 = var8 >> 6 & 63; // L: 284
				int var12 = var8 >> 12; // L: 285
				int var13 = var5.readUnsignedByte(); // L: 286
				int var14 = var13 >> 2; // L: 287
				int var15 = var13 & 3; // L: 288
				int var16 = var11 + var1; // L: 289
				int var17 = var10 + var2; // L: 290
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 291
					int var18 = var12; // L: 292
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 293
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 294
					if (var18 >= 0) { // L: 295
						var19 = var4[var18];
					}

					class59.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 296
				}
			}
		}
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(II)Luq;",
		garbageValue = "-2093769128"
	)
	static class522 method4248(int var0) {
		class522 var1 = (class522)Client.Widget_cachedFonts.get((long)var0); // L: 12779
		if (var1 == null) { // L: 12780
			var1 = new class522(class18.field80, var0); // L: 12781
		}

		return var1; // L: 12783
	}
}
