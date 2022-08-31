import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = -1358941939
	)
	static int field1805;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1767580571
	)
	public static int field1809;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -953256093
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1926258442"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "-21"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "284353290"
	)
	public static void method3288() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 85
	} // L: 86

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-252579017"
	)
	public static void method3284() {
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 279
	} // L: 280
}
