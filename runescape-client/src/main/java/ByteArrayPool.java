import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1309322053
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 535020743
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1601199927
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("p")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("b")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("e")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		signature = "[Low;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[50][];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Ljy;",
		garbageValue = "-2079671317"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < GrandExchangeOfferNameComparator.WorldMapElement_cached.length && GrandExchangeOfferNameComparator.WorldMapElement_cached[var0] != null ? GrandExchangeOfferNameComparator.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IZI)[B",
		garbageValue = "147973145"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var2;
		if (var0 != 100) {
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var2 = ByteArrayPool_small[--ByteArrayPool_smallCount];
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var2;
		}

		if (var0 != 5000) {
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var2 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var2;
		}

		if (var0 != 30000) {
			if (var0 < 30000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var2 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var2;
		}

		if (ScriptFrame.ByteArrayPool_arrays != null) {
			for (int var4 = 0; var4 < UserComparator3.ByteArrayPool_alternativeSizes.length; ++var4) {
				if (UserComparator3.ByteArrayPool_alternativeSizes[var4] != var0) {
					if (var0 < UserComparator3.ByteArrayPool_alternativeSizes[var4]) {
					}
				} else if (class221.ByteArrayPool_altSizeArrayCounts[var4] > 0) {
					byte[] var3 = ScriptFrame.ByteArrayPool_arrays[var4][--class221.ByteArrayPool_altSizeArrayCounts[var4]];
					ScriptFrame.ByteArrayPool_arrays[var4][class221.ByteArrayPool_altSizeArrayCounts[var4]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		signature = "(IIIIIII)V",
		garbageValue = "1064656053"
	)
	static final void method5575(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method3389(var17, var18, var19);
			Rasterizer3D.method3370(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method3389(var17, var19, var20);
			Rasterizer3D.method3370(var21, var23, var24, var17, var19, var20, var4);
		}
	}
}
