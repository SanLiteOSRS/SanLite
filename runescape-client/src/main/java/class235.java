import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class235 implements Comparator {
	class235() {
	} // L: 43

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;I)I",
		garbageValue = "214790371"
	)
	int method4467(class230 var1, class230 var2) {
		return var1.method4388() - var2.method4388(); // L: 46
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 54
	}

	public int compare(Object var1, Object var2) {
		return this.method4467((class230)var1, (class230)var2); // L: 50
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1232076305"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4673) { // L: 74
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) { // L: 75
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount]; // L: 76
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null; // L: 77
				return var3; // L: 78
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) { // L: 80
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount]; // L: 81
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null; // L: 82
				return var3; // L: 83
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) { // L: 85
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount]; // L: 86
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null; // L: 87
				return var3; // L: 88
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4677 > 0) { // L: 90
				var3 = ByteArrayPool.field4685[--ByteArrayPool.field4677]; // L: 91
				ByteArrayPool.field4685[ByteArrayPool.field4677] = null; // L: 92
				return var3; // L: 93
			}

			int var6;
			if (class482.ByteArrayPool_arrays != null) { // L: 95
				for (var6 = 0; var6 < class318.ByteArrayPool_alternativeSizes.length; ++var6) { // L: 96
					if ((class318.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < class318.ByteArrayPool_alternativeSizes[var6] && var1) && WorldMapID.ByteArrayPool_altSizeArrayCounts[var6] > 0) { // L: 97
						byte[] var4 = class482.ByteArrayPool_arrays[var6][--WorldMapID.ByteArrayPool_altSizeArrayCounts[var6]]; // L: 98
						class482.ByteArrayPool_arrays[var6][WorldMapID.ByteArrayPool_altSizeArrayCounts[var6]] = null; // L: 99
						return var4; // L: 100
					}
				}
			}

			if (var1 && class318.ByteArrayPool_alternativeSizes != null) { // L: 104 105
				for (var6 = 0; var6 < class318.ByteArrayPool_alternativeSizes.length; ++var6) { // L: 106
					if (var0 <= class318.ByteArrayPool_alternativeSizes[var6] && WorldMapID.ByteArrayPool_altSizeArrayCounts[var6] < class482.ByteArrayPool_arrays[var6].length) { // L: 107
						return new byte[class318.ByteArrayPool_alternativeSizes[var6]]; // L: 108
					}
				}
			}
		}

		return new byte[var0]; // L: 114
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lhi;",
		garbageValue = "2118831996"
	)
	public static VarcInt method4468(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0); // L: 23
			var1 = new VarcInt(); // L: 24
			if (var2 != null) { // L: 25
				var1.method3770(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}
}
