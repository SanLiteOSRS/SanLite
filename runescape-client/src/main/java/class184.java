import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class184 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "811454475"
	)
	public static int method3680(int var0) {
		--var0; // L: 52
		var0 |= var0 >>> 1; // L: 53
		var0 |= var0 >>> 2; // L: 54
		var0 |= var0 >>> 4; // L: 55
		var0 |= var0 >>> 8; // L: 56
		var0 |= var0 >>> 16; // L: 57
		return var0 + 1; // L: 58
	}
}
