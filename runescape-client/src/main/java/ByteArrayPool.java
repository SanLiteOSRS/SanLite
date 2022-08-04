import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 494845385
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1288349497
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -836620159
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 966661933
	)
	static int field4233;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1176993689
	)
	static int field4231;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1879717291
	)
	static int field4232;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1833460655
	)
	static int field4234;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1259234581
	)
	static int field4238;
	@ObfuscatedName("x")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("g")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("p")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("b")
	static byte[][] field4224;
	@ObfuscatedName("v")
	static ArrayList field4239;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4233 = 0; // L: 16
		field4231 = 1000; // L: 17
		field4232 = 250; // L: 18
		field4234 = 100; // L: 19
		field4238 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4224 = new byte[50][]; // L: 24
		field4239 = new ArrayList(); // L: 28
		field4239.clear(); // L: 32
		field4239.add(100); // L: 33
		field4239.add(5000); // L: 34
		field4239.add(10000); // L: 35
		field4239.add(30000); // L: 36
		new HashMap();
	} // L: 42

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "37"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) { // L: 74
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 75
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 76
			return var4; // L: 77
		}

		if (var0 != 5000) { // L: 79
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 80
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 81
			return var4; // L: 82
		}

		if (var0 != 10000) { // L: 84
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 85
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 86
			return var4; // L: 87
		}

		if (var0 != 30000) { // L: 89
			if (var0 < 30000) {
			}
		} else if (field4233 > 0) {
			var4 = field4224[--field4233]; // L: 90
			field4224[field4233] = null; // L: 91
			return var4; // L: 92
		}

		if (ModeWhere.ByteArrayPool_arrays != null) { // L: 94
			for (int var2 = 0; var2 < WorldMapSectionType.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 95
				if (WorldMapSectionType.ByteArrayPool_alternativeSizes[var2] != var0) { // L: 96
					if (var0 < WorldMapSectionType.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (Frames.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = ModeWhere.ByteArrayPool_arrays[var2][--Frames.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 97
					ModeWhere.ByteArrayPool_arrays[var2][Frames.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 98
					return var3; // L: 99
				}
			}
		}

		return new byte[var0]; // L: 112
	}
}
