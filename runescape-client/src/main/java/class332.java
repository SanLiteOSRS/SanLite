import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class332 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("huffman")
	static Huffman huffman;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	static StudioGame field3772;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	static void method6591() {
		Messages.Messages_channels.clear(); // L: 54
		Messages.Messages_hashTable.clear(); // L: 55
		Messages.Messages_queue.clear(); // L: 56
		Messages.Messages_count = 0; // L: 57
	} // L: 58
}
