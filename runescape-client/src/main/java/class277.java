import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public class class277 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "([I[II)V",
		garbageValue = "-592561993"
	)
	public static void method5089(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			ByteArrayPool.ByteArrayPool_alternativeSizes = var0;
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			ByteArrayPool.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var2) {
				ByteArrayPool.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
			}

		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null;
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = null;
			ByteArrayPool.ByteArrayPool_arrays = null;
		}
	}
}
