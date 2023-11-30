import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("at")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1039825869
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	static StudioGame field1401;
	@ObfuscatedName("gk")
	static String field1402;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = -604270976
	)
	static int field1400;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "292264125"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1021
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1022
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1023
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1024
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1025
		return var3; // L: 1026
	}
}
