import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -862731127
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1822826689
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1571439245
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1983574547
	)
	static int field4209;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1700131269
	)
	static int field4210;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -832696811
	)
	static int field4201;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1345624255
	)
	static int field4211;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1304474513
	)
	static int field4212;
	@ObfuscatedName("m")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("u")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("l")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("z")
	static byte[][] field4216;
	@ObfuscatedName("y")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("e")
	public static ArrayList field4218;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4209 = 0; // L: 16
		field4210 = 1000; // L: 17
		field4201 = 250; // L: 18
		field4211 = 100;
		field4212 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4216 = new byte[50][]; // L: 24
		field4218 = new ArrayList(); // L: 28
		class327.method5978(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1708701279"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "-1847300393"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) { // L: 52
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 53
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var4;
		}

		if (var0 != 5000) { // L: 57
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var4;
		}

		if (var0 != 10000) { // L: 62
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var4;
		}

		if (var0 != 30000) { // L: 67
			if (var0 < 30000) {
			}
		} else if (field4209 > 0) {
			var4 = field4216[--field4209]; // L: 68
			field4216[field4209] = null; // L: 69
			return var4; // L: 70
		}

		if (AbstractByteArrayCopier.ByteArrayPool_arrays != null) { // L: 72
			for (int var2 = 0; var2 < UserComparator4.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 73
				if (UserComparator4.ByteArrayPool_alternativeSizes[var2] != var0) { // L: 74
					if (var0 < UserComparator4.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = AbstractByteArrayCopier.ByteArrayPool_arrays[var2][--ByteArrayPool_altSizeArrayCounts[var2]]; // L: 75
					AbstractByteArrayCopier.ByteArrayPool_arrays[var2][ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 76
					return var3; // L: 77
				}
			}
		}

		return new byte[var0]; // L: 90
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lgh;",
		garbageValue = "-1587681516"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 54
		if (var1 != null) { // L: 55
			return var1; // L: 56
		} else {
			byte[] var2 = class20.SequenceDefinition_archive.takeFile(12, var0); // L: 58
			var1 = new SequenceDefinition(); // L: 59
			if (var2 != null) { // L: 60
				var1.decode(new Buffer(var2)); // L: 61
			}

			var1.postDecode(); // L: 63
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 64
			return var1; // L: 65
		}
	}
}
