import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
public class class182 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static EvictingDualNodeHashTable field1905;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static IndexedSprite field1904;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static IndexedSprite field1908;

	static {
		field1905 = new EvictingDualNodeHashTable(64); // L: 7
	}
}
