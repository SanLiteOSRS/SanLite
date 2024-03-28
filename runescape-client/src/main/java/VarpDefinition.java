import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -29181899
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-692078049"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 34
			if (var2 == 0) { // L: 35
				return; // L: 38
			}

			this.decodeNext(var1, var2); // L: 36
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "641849920"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43
}
