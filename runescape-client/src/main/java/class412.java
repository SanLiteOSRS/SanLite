import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class412 extends class418 {
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	static Widget field4539;

	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	public class412(class418 var1) {
		super(var1); // L: 8
		super.field4552 = "SwapSongTask"; // L: 9
	} // L: 10

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		if (class316.field3422.size() > 1 && class316.field3422.get(0) != null && ((class328)class316.field3422.get(0)).field3522.isReady() && class316.field3422.get(1) != null && ((class328)class316.field3422.get(1)).field3522.isReady()) { // L: 14
			class328 var1 = (class328)class316.field3422.get(0); // L: 15
			class316.field3422.set(0, class316.field3422.get(1)); // L: 16
			class316.field3422.set(1, var1); // L: 17
		}

		return true; // L: 19
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "23"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4577) { // L: 118
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4574) { // L: 119
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 120
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4583) { // L: 123
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 124
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4578) { // L: 127
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 128
			} else if (var0.length == 30000 && ByteArrayPool.field4573 < ByteArrayPool.field4585) { // L: 131
				ByteArrayPool.field4589[++ByteArrayPool.field4573 - 1] = var0; // L: 132
			} else {
				if (class1.ByteArrayPool_arrays != null) { // L: 135
					for (int var2 = 0; var2 < Clock.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 136
						if (var0.length == Clock.ByteArrayPool_alternativeSizes[var2] && class267.ByteArrayPool_altSizeArrayCounts[var2] < class1.ByteArrayPool_arrays[var2].length) { // L: 137
							class1.ByteArrayPool_arrays[var2][class267.ByteArrayPool_altSizeArrayCounts[var2]++] = var0; // L: 138
							return; // L: 139
						}
					}
				}

			}
		}
	} // L: 121 125 129 133 144
}
