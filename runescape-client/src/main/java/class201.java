import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class201 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("FloorUnderlayDefinition_cached")
	static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("jp")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 7
	}
}
