import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -868010203
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -376683317
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 105173507
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1943183323
	)
	static int field4417;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1880973257
	)
	static int field4420;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 182947453
	)
	static int field4421;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2013212249
	)
	static int field4422;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2032532103
	)
	static int field4413;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ay")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("am")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("az")
	static byte[][] field4427;
	@ObfuscatedName("at")
	public static ArrayList field4424;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4417 = 0; // L: 16
		field4420 = 1000; // L: 17
		field4421 = 250; // L: 18
		field4422 = 100; // L: 19
		field4413 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4427 = new byte[50][]; // L: 24
		field4424 = new ArrayList(); // L: 28
		SpriteMask.method5743(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1201755418"
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
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4417 > 0) { // L: 67
			var4 = field4427[--field4417]; // L: 68
			field4427[field4417] = null; // L: 69
			return var4; // L: 70
		} else {
			int var2;
			if (InterfaceParent.ByteArrayPool_arrays != null) { // L: 72
				for (var2 = 0; var2 < class212.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 73
					if ((class212.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < class212.ByteArrayPool_alternativeSizes[var2] && var1) && SoundSystem.ByteArrayPool_altSizeArrayCounts[var2] > 0) { // L: 74
						byte[] var3 = InterfaceParent.ByteArrayPool_arrays[var2][--SoundSystem.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 75
						InterfaceParent.ByteArrayPool_arrays[var2][SoundSystem.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 76
						return var3; // L: 77
					}
				}
			}

			if (var1 && class212.ByteArrayPool_alternativeSizes != null) { // L: 81 82
				for (var2 = 0; var2 < class212.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 83
					if (var0 <= class212.ByteArrayPool_alternativeSizes[var2] && SoundSystem.ByteArrayPool_altSizeArrayCounts[var2] < InterfaceParent.ByteArrayPool_arrays[var2].length) { // L: 84
						return new byte[class212.ByteArrayPool_alternativeSizes[var2]]; // L: 85
					}
				}
			}

			return new byte[var0]; // L: 90
		}
	}
}
