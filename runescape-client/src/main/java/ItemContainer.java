import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = 1271593503
	)
	static int field1003;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("h")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("w")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11
}
