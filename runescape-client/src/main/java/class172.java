import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class172 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static EvictingDualNodeHashTable field1807;

	static {
		field1807 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1030508482"
	)
	public static void method3534() {
		FloorUnderlayDefinition.field2011.clear(); // L: 82
	} // L: 83
}
