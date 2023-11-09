import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 165480711
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -458850417
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 408344857
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1119030477
	)
	static int field4437;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -559970069
	)
	static int field4438;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 700428281
	)
	static int field4431;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1503025801
	)
	static int field4440;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 822016073
	)
	static int field4439;
	@ObfuscatedName("i")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("o")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("n")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("k")
	static byte[][] field4445;
	@ObfuscatedName("t")
	public static ArrayList field4446;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4437 = 0; // L: 16
		field4438 = 1000; // L: 17
		field4431 = 250; // L: 18
		field4440 = 100; // L: 19
		field4439 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4445 = new byte[50][]; // L: 24
		field4446 = new ArrayList(); // L: 28
		field4446.clear(); // L: 32
		field4446.add(100); // L: 33
		field4446.add(5000); // L: 34
		field4446.add(10000); // L: 35
		field4446.add(30000); // L: 36
		new HashMap();
	} // L: 42

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "80"
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
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4437 > 0) { // L: 65
			var4 = field4445[--field4437]; // L: 66
			field4445[field4437] = null; // L: 67
			return var4; // L: 68
		} else {
			int var2;
			if (SceneTilePaint.ByteArrayPool_arrays != null) { // L: 70
				for (var2 = 0; var2 < Frames.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 71
					if ((Frames.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < Frames.ByteArrayPool_alternativeSizes[var2] && var1) && ModelData0.ByteArrayPool_altSizeArrayCounts[var2] > 0) { // L: 72
						byte[] var3 = SceneTilePaint.ByteArrayPool_arrays[var2][--ModelData0.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 73
						SceneTilePaint.ByteArrayPool_arrays[var2][ModelData0.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 74
						return var3; // L: 75
					}
				}
			}

			if (var1 && Frames.ByteArrayPool_alternativeSizes != null) { // L: 79 80
				for (var2 = 0; var2 < Frames.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 81
					if (var0 <= Frames.ByteArrayPool_alternativeSizes[var2] && ModelData0.ByteArrayPool_altSizeArrayCounts[var2] < SceneTilePaint.ByteArrayPool_arrays[var2].length) { // L: 82
						return new byte[Frames.ByteArrayPool_alternativeSizes[var2]]; // L: 83
					}
				}
			}

			return new byte[var0]; // L: 88
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "101"
	)
	static final void method7319(int var0, int var1, int var2, boolean var3) {
		if (Players.loadInterface(var0)) { // L: 10914
			ItemContainer.resizeInterface(class71.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 10915
		}
	} // L: 10916
}
