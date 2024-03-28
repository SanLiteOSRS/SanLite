import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class195 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static EvictingDualNodeHashTable field2000;

	static {
		field2000 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lhj;",
		garbageValue = "-2083811545"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else if (KitDefinition.field2034 == null) { // L: 31
			return null;
		} else {
			byte[] var2 = KitDefinition.field2034.takeFile(3, var0); // L: 32
			var1 = new KitDefinition(); // L: 33
			if (var2 != null) { // L: 34
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 35
			return var1; // L: 36
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([I[IB)V",
		garbageValue = "-81"
	)
	public static void method3737(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 50
			class318.ByteArrayPool_alternativeSizes = var0; // L: 63
			WorldMapID.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 64
			class482.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 65

			for (int var2 = 0; var2 < class318.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 66
				class482.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 67
				ByteArrayPool.field4686.add(var0[var2]); // L: 68
			}

			Collections.sort(ByteArrayPool.field4686); // L: 70
		} else {
			class318.ByteArrayPool_alternativeSizes = null; // L: 51
			WorldMapID.ByteArrayPool_altSizeArrayCounts = null; // L: 52
			class482.ByteArrayPool_arrays = null; // L: 53
			ByteArrayPool.field4686.clear(); // L: 55
			ByteArrayPool.field4686.add(100); // L: 56
			ByteArrayPool.field4686.add(5000); // L: 57
			ByteArrayPool.field4686.add(10000); // L: 58
			ByteArrayPool.field4686.add(30000); // L: 59
		}
	} // L: 61 71

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1152254680"
	)
	@Export("ByteArrayPool_getArray")
	public static byte[] ByteArrayPool_getArray(int var0) {
		return class235.ByteArrayPool_getArrayBool(var0, false); // L: 118
	}
}
