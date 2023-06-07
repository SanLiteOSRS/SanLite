import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("av")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public VarcInt() {
		this.persist = false; // L: 12
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "-30"
	)
	public void method3613(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 16
			if (var2 == 0) { // L: 17
				return; // L: 20
			}

			this.method3612(var1, var2); // L: 18
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "-1843921437"
	)
	void method3612(Buffer var1, int var2) {
		if (var2 == 2) { // L: 23
			this.persist = true; // L: 24
		}

	} // L: 27

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2100829638"
	)
	public static void method3617() {
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 451
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 452
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 453
	} // L: 454

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-3"
	)
	public static int method3616(String var0) {
		return var0.length() + 2; // L: 136
	}
}
