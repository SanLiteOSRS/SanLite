import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("Players")
public class Players {
	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "Lg;"
	)
	static class3 field1358;
	@ObfuscatedName("o")
	static byte[] field1344;
	@ObfuscatedName("g")
	static byte[] field1345;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lnk;"
	)
	static Buffer[] field1346;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1790036089
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("t")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1974903215
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("b")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("q")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("i")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("x")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 324886093
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("r")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Buffer field1357;

	static {
		field1344 = new byte[2048];
		field1345 = new byte[2048];
		field1346 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1357 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "1714359849"
	)
	public static void method2312(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			class15.ByteArrayPool_alternativeSizes = var0;
			class9.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			ByteArrayPool.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < class15.ByteArrayPool_alternativeSizes.length; ++var2) {
				ByteArrayPool.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
			}

		} else {
			class15.ByteArrayPool_alternativeSizes = null;
			class9.ByteArrayPool_altSizeArrayCounts = null;
			ByteArrayPool.ByteArrayPool_arrays = null;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method2311() {
		synchronized(KeyHandler.KeyHandler_instance) {
			++KeyHandler.KeyHandler_idleCycles;
			KeyHandler.field277 = KeyHandler.field279;
			KeyHandler.field276 = 0;
			int var1;
			if (KeyHandler.field260 < 0) {
				for (var1 = 0; var1 < 112; ++var1) {
					KeyHandler.KeyHandler_pressedKeys[var1] = false;
				}

				KeyHandler.field260 = KeyHandler.field273;
			} else {
				while (KeyHandler.field273 != KeyHandler.field260) {
					var1 = KeyHandler.field270[KeyHandler.field273];
					KeyHandler.field273 = KeyHandler.field273 + 1 & 127;
					if (var1 < 0) {
						KeyHandler.KeyHandler_pressedKeys[~var1] = false;
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field276 < KeyHandler.field275.length - 1) {
							KeyHandler.field275[++KeyHandler.field276 - 1] = var1;
						}

						KeyHandler.KeyHandler_pressedKeys[var1] = true;
					}
				}
			}

			if (KeyHandler.field276 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field279 = KeyHandler.field278;
		}
	}
}
