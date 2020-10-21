import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 420940101
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1267423299
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lkb;B)V",
		garbageValue = "125"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkb;II)V",
		garbageValue = "822246894"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}
}
