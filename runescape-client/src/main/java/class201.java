import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class201 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	public static EvictingDualNodeHashTable field2067;

	static {
		field2067 = new EvictingDualNodeHashTable(64); // L: 7
	}
}
