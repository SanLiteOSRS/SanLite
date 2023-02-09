import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1615203993
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 11864649
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1586651023
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -436333049
	)
	static int field4449;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1375098291
	)
	static int field4450;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1502991471
	)
	static int field4455;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 309881497
	)
	static int field4456;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 322972771
	)
	static int field4452;
	@ObfuscatedName("b")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("m")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("t")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("h")
	static byte[][] field4453;
	@ObfuscatedName("x")
	public static ArrayList field4443;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4449 = 0; // L: 16
		field4450 = 1000; // L: 17
		field4455 = 250; // L: 18
		field4456 = 100; // L: 19
		field4452 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4453 = new byte[50][]; // L: 24
		field4443 = new ArrayList(); // L: 28
		class36.method694(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "513950466"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount > 0) { // L: 52
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 53
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 54
			return var4; // L: 55
		} else if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool_mediumCount > 0) { // L: 57
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 58
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 59
			return var4; // L: 60
		} else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount > 0) { // L: 62
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 63
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 64
			return var4; // L: 65
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4449 > 0) { // L: 67
			var4 = field4453[--field4449]; // L: 68
			field4453[field4449] = null; // L: 69
			return var4; // L: 70
		} else {
			int var2;
			if (class9.ByteArrayPool_arrays != null) { // L: 72
				for (var2 = 0; var2 < class172.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 73
					if ((class172.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < class172.ByteArrayPool_alternativeSizes[var2] && var1) && class132.ByteArrayPool_altSizeArrayCounts[var2] > 0) { // L: 74
						byte[] var3 = class9.ByteArrayPool_arrays[var2][--class132.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 75
						class9.ByteArrayPool_arrays[var2][class132.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 76
						return var3; // L: 77
					}
				}
			}

			if (var1 && class172.ByteArrayPool_alternativeSizes != null) { // L: 81 82
				for (var2 = 0; var2 < class172.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 83
					if (var0 <= class172.ByteArrayPool_alternativeSizes[var2] && class132.ByteArrayPool_altSizeArrayCounts[var2] < class9.ByteArrayPool_arrays[var2].length) { // L: 84
						return new byte[class172.ByteArrayPool_alternativeSizes[var2]]; // L: 85
					}
				}
			}

			return new byte[var0]; // L: 90
		}
	}
}
