import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -300357261
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 481846585
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -926544205
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 767381159
	)
	static int field4476;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 255163693
	)
	static int field4469;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1720410087
	)
	static int field4470;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1922603885
	)
	static int field4471;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1866109675
	)
	static int field4463;
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ai")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ag")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ah")
	static byte[][] field4474;
	@ObfuscatedName("as")
	static ArrayList field4472;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -431815809
	)
	static int field4478;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4476 = 0; // L: 16
		field4469 = 1000; // L: 17
		field4470 = 250; // L: 18
		field4471 = 100; // L: 19
		field4463 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4474 = new byte[50][]; // L: 24
		field4472 = new ArrayList(); // L: 28
		class273.method5614(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "20"
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
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4476 > 0) { // L: 85
			var4 = field4474[--field4476]; // L: 86
			field4474[field4476] = null; // L: 87
			return var4; // L: 88
		} else {
			int var2;
			if (UserComparator3.ByteArrayPool_arrays != null) { // L: 90
				for (var2 = 0; var2 < ClanChannel.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 91
					if ((ClanChannel.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < ClanChannel.ByteArrayPool_alternativeSizes[var2] && var1) && class136.ByteArrayPool_altSizeArrayCounts[var2] > 0) { // L: 92
						byte[] var3 = UserComparator3.ByteArrayPool_arrays[var2][--class136.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 93
						UserComparator3.ByteArrayPool_arrays[var2][class136.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 94
						return var3; // L: 95
					}
				}
			}

			if (var1 && ClanChannel.ByteArrayPool_alternativeSizes != null) { // L: 99 100
				for (var2 = 0; var2 < ClanChannel.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 101
					if (var0 <= ClanChannel.ByteArrayPool_alternativeSizes[var2] && class136.ByteArrayPool_altSizeArrayCounts[var2] < UserComparator3.ByteArrayPool_arrays[var2].length) { // L: 102
						return new byte[ClanChannel.ByteArrayPool_alternativeSizes[var2]]; // L: 103
					}
				}
			}

			return new byte[var0]; // L: 108
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1906032667"
	)
	static final boolean method7595() {
		return Client.isMenuOpen; // L: 8623
	}
}
