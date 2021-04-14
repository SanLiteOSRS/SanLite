import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("e")
	static final int[] field3549;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 979490587
	)
	static int field3544;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 909782819
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1000839247
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1799765893
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field3549 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field3549[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "44894085"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnu;II)V",
		garbageValue = "-1491405636"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}
}
