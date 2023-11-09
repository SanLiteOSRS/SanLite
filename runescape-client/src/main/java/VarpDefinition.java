import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2064232881
	)
	public static int field1933;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -1633851311
	)
	static int field1937;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 543483367
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-2"
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
		descriptor = "(Ltm;II)V",
		garbageValue = "1878082130"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43
}
