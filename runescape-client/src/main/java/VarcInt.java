import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("f")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public VarcInt() {
		this.persist = false; // L: 12
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-929323319"
	)
	public void method3382(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 20
			if (var2 == 0) { // L: 21
				return; // L: 24
			}

			this.method3383(var1, var2); // L: 22
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "-1290480485"
	)
	void method3383(Buffer var1, int var2) {
		if (var2 == 2) { // L: 27
			this.persist = true; // L: 28
		}

	} // L: 31
}
