import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("Players")
public class Players {
	@ObfuscatedName("v")
	static byte[] field1370;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lgs;"
	)
	static class204[] field1379;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Lqy;"
	)
	static Buffer[] field1372;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -316088161
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("f")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 888769669
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("u")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("b")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("j")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("g")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 279882375
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("o")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	static Buffer field1382;

	static {
		field1370 = new byte[2048]; // L: 18
		field1379 = new class204[2048]; // L: 19
		field1372 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1382 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1396196168"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Language.Widget_loadedInterfaces[var0]) { // L: 259
			return true;
		} else if (!class422.Widget_archive.tryLoadGroup(var0)) { // L: 260
			return false;
		} else {
			int var1 = class422.Widget_archive.getGroupFileCount(var0); // L: 261
			if (var1 == 0) { // L: 262
				Language.Widget_loadedInterfaces[var0] = true; // L: 263
				return true; // L: 264
			} else {
				if (class71.Widget_interfaceComponents[var0] == null) { // L: 266
					class71.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 267
					if (class71.Widget_interfaceComponents[var0][var2] == null) { // L: 268
						byte[] var3 = class422.Widget_archive.takeFile(var0, var2); // L: 269
						if (var3 != null) { // L: 270
							class71.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 271
							class71.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 272
							if (var3[0] == -1) { // L: 273
								class71.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								class71.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 274
							}
						}
					}
				}

				Language.Widget_loadedInterfaces[var0] = true; // L: 278
				return true; // L: 279
			}
		}
	}
}
