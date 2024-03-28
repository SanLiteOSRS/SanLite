import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ao")
	static final int[] field2204;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -954648043
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1144667469
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 724567733
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2204 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2204[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "-31"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.decodeNext(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-1679749468"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			this.baseVar = var1.readUnsignedShort(); // L: 39
			this.startBit = var1.readUnsignedByte(); // L: 40
			this.endBit = var1.readUnsignedByte(); // L: 41
		}

	} // L: 44
}
