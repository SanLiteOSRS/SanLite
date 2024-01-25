import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class173 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static EvictingDualNodeHashTable field1818;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1820;

	static {
		field1818 = new EvictingDualNodeHashTable(64); // L: 7
	}
}
