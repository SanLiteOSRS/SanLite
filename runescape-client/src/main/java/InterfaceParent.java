import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 944864121
	)
	@Export("group")
	int group;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1702664641
	)
	@Export("type")
	int type;
	@ObfuscatedName("aw")
	boolean field1038;

	InterfaceParent() {
		this.field1038 = false; // L: 8
	} // L: 10

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "7"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4469) { // L: 116
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 117
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4470) { // L: 120
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 121
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4471) { // L: 124
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 125
		} else if (var0.length == 30000 && ByteArrayPool.field4476 < ByteArrayPool.field4463) { // L: 128
			ByteArrayPool.field4474[++ByteArrayPool.field4476 - 1] = var0; // L: 129
		} else {
			if (UserComparator3.ByteArrayPool_arrays != null) { // L: 132
				for (int var1 = 0; var1 < ClanChannel.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 133
					if (var0.length == ClanChannel.ByteArrayPool_alternativeSizes[var1] && class136.ByteArrayPool_altSizeArrayCounts[var1] < UserComparator3.ByteArrayPool_arrays[var1].length) { // L: 134
						UserComparator3.ByteArrayPool_arrays[var1][class136.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 135
						return; // L: 136
					}
				}
			}

		}
	} // L: 118 122 126 130 140

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1880388281"
	)
	public static void method2252() {
		StructComposition.StructDefinition_cached.clear(); // L: 71
	} // L: 72

	@ObfuscatedName("at")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 89
	}
}
