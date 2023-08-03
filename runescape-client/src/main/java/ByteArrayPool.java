import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 385405919
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1075020039
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -375623447
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 729966117
	)
	static int field4547;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 737636207
	)
	static int field4548;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1729288341
	)
	static int field4549;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1203889383
	)
	static int field4544;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1909177715
	)
	static int field4555;
	@ObfuscatedName("ah")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("aa")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("au")
	static byte[][] field4551;
	@ObfuscatedName("ae")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ab")
	static String[] field4541;
	@ObfuscatedName("ao")
	public static ArrayList field4557;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4547 = 0; // L: 16
		field4548 = 1000; // L: 17
		field4549 = 250; // L: 18
		field4544 = 100; // L: 19
		field4555 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4551 = new byte[50][]; // L: 24
		field4557 = new ArrayList(); // L: 28
		field4557.clear(); // L: 32
		field4557.add(100); // L: 33
		field4557.add(5000); // L: 34
		field4557.add(10000); // L: 35
		field4557.add(30000); // L: 36
		new HashMap();
	} // L: 42

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "-1680084006"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount > 0) { // L: 50
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 51
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 52
			return var4; // L: 53
		} else if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool_mediumCount > 0) { // L: 55
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 56
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 57
			return var4; // L: 58
		} else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount > 0) { // L: 60
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 61
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 62
			return var4; // L: 63
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4547 > 0) { // L: 65
			var4 = field4551[--field4547]; // L: 66
			field4551[field4547] = null; // L: 67
			return var4; // L: 68
		} else {
			int var2;
			if (class152.ByteArrayPool_arrays != null) { // L: 70
				for (var2 = 0; var2 < ByteArrayPool_alternativeSizes.length; ++var2) { // L: 71
					if ((ByteArrayPool_alternativeSizes[var2] == var0 || var0 < ByteArrayPool_alternativeSizes[var2] && var1) && class125.ByteArrayPool_altSizeArrayCounts[var2] > 0) { // L: 72
						byte[] var3 = class152.ByteArrayPool_arrays[var2][--class125.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 73
						class152.ByteArrayPool_arrays[var2][class125.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 74
						return var3; // L: 75
					}
				}
			}

			if (var1 && ByteArrayPool_alternativeSizes != null) { // L: 79 80
				for (var2 = 0; var2 < ByteArrayPool_alternativeSizes.length; ++var2) { // L: 81
					if (var0 <= ByteArrayPool_alternativeSizes[var2] && class125.ByteArrayPool_altSizeArrayCounts[var2] < class152.ByteArrayPool_arrays[var2].length) { // L: 82
						return new byte[ByteArrayPool_alternativeSizes[var2]]; // L: 83
					}
				}
			}

			return new byte[var0]; // L: 88
		}
	}
}
