import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -679236325
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 664960087
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1131523735
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("y")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("j")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("o")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[50][];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "-120"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) {
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var4;
		}

		if (var0 != 5000) {
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var4;
		}

		if (var0 != 30000) {
			if (var0 < 30000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var4;
		}

		if (Tiles.ByteArrayPool_arrays != null) {
			for (int var2 = 0; var2 < class372.ByteArrayPool_alternativeSizes.length; ++var2) {
				if (class372.ByteArrayPool_alternativeSizes[var2] != var0) {
					if (var0 < class372.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = Tiles.ByteArrayPool_arrays[var2][--WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts[var2]];
					Tiles.ByteArrayPool_arrays[var2][WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts[var2]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-194411465"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}
}
