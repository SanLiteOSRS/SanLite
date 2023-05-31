import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("VarbitDefinition_archive")
	static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ab")
	static final int[] field2107;
	@ObfuscatedName("at")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 470400793
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1050888611
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1130237503
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2107 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2107[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	VarbitComposition() {
	} // L: 25

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-27344201"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 43
			if (var2 == 0) { // L: 44
				return; // L: 47
			}

			this.decodeNext(var1, var2); // L: 45
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "2050323828"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 50
			this.baseVar = var1.readUnsignedShort(); // L: 51
			this.startBit = var1.readUnsignedByte(); // L: 52
			this.endBit = var1.readUnsignedByte(); // L: 53
		}

	} // L: 56
}
