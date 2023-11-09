import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ap")
	static final int[] field2105;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 637084533
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1936353181
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 438833295
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1381409973
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2105 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2105[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	VarbitComposition() {
	} // L: 25

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-578748819"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)V",
		garbageValue = "-94"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			this.baseVar = var1.readUnsignedShort(); // L: 47
			this.startBit = var1.readUnsignedByte(); // L: 48
			this.endBit = var1.readUnsignedByte(); // L: 49
		}

	} // L: 52
}
