import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ap")
	static final int[] field2100;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 358239317
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 157639063
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 348461267
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2079175747
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2100 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2100[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-2040707648"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 27
			if (var2 == 0) { // L: 28
				return; // L: 31
			}

			this.decodeNext(var1, var2); // L: 29
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;IB)V",
		garbageValue = "60"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 34
			this.baseVar = var1.readUnsignedShort(); // L: 35
			this.startBit = var1.readUnsignedByte(); // L: 36
			this.endBit = var1.readUnsignedByte(); // L: 37
		}

	} // L: 40
}
