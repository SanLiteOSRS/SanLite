import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class191 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	static EvictingDualNodeHashTable field2007;

	static {
		field2007 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-754235758"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 62
		if (var0 < 0 || var0 >= 65536) { // L: 63
			var0 >>>= 16; // L: 64
			var1 += 16; // L: 65
		}

		if (var0 >= 256) { // L: 67
			var0 >>>= 8; // L: 68
			var1 += 8; // L: 69
		}

		if (var0 >= 16) { // L: 71
			var0 >>>= 4; // L: 72
			var1 += 4; // L: 73
		}

		if (var0 >= 4) { // L: 75
			var0 >>>= 2; // L: 76
			var1 += 2; // L: 77
		}

		if (var0 >= 1) { // L: 79
			var0 >>>= 1; // L: 80
			++var1; // L: 81
		}

		return var0 + var1; // L: 83
	}
}
