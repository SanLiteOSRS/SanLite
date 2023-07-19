import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1978020779
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -228022205
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1062076263
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 902006545
	)
	static int field4535;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1787953223
	)
	static int field4542;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1851123283
	)
	static int field4537;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1901240485
	)
	static int field4536;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1538228825
	)
	static int field4539;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("am")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ag")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("aa")
	static byte[][] field4543;
	@ObfuscatedName("af")
	static ArrayList field4540;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4535 = 0; // L: 16
		field4542 = 1000; // L: 17
		field4537 = 250; // L: 18
		field4536 = 100; // L: 19
		field4539 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4543 = new byte[50][]; // L: 24
		field4540 = new ArrayList(); // L: 28
		class384.method7207(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "-236152052"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount > 0) { // L: 70
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 71
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 72
			return var4; // L: 73
		} else if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool_mediumCount > 0) { // L: 75
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 76
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 77
			return var4; // L: 78
		} else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount > 0) { // L: 80
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 81
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 82
			return var4; // L: 83
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4535 > 0) { // L: 85
			var4 = field4543[--field4535]; // L: 86
			field4543[field4535] = null; // L: 87
			return var4; // L: 88
		} else {
			int var2;
			if (class140.ByteArrayPool_arrays != null) { // L: 90
				for (var2 = 0; var2 < UserComparator5.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 91
					if ((UserComparator5.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < UserComparator5.ByteArrayPool_alternativeSizes[var2] && var1) && class125.ByteArrayPool_altSizeArrayCounts[var2] > 0) { // L: 92
						byte[] var3 = class140.ByteArrayPool_arrays[var2][--class125.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 93
						class140.ByteArrayPool_arrays[var2][class125.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 94
						return var3; // L: 95
					}
				}
			}

			if (var1 && UserComparator5.ByteArrayPool_alternativeSizes != null) { // L: 99 100
				for (var2 = 0; var2 < UserComparator5.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 101
					if (var0 <= UserComparator5.ByteArrayPool_alternativeSizes[var2] && class125.ByteArrayPool_altSizeArrayCounts[var2] < class140.ByteArrayPool_arrays[var2].length) { // L: 102
						return new byte[UserComparator5.ByteArrayPool_alternativeSizes[var2]]; // L: 103
					}
				}
			}

			return new byte[var0]; // L: 108
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "980956754"
	)
	static final int method7694(int var0) {
		return Math.min(Math.max(var0, 128), 383); // L: 4009
	}
}
