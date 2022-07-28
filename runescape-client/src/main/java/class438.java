import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public class class438 extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static AbstractArchive field4691;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = 1406591067
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("f")
	Object[][] field4690;
	@ObfuscatedName("u")
	int[][] field4692;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -654681503
	)
	public int field4693;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class438() {
	} // L: 17

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-2092502516"
	)
	void method7648(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.method7640(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "-297067727"
	)
	public Object[] method7645(int var1) {
		return this.field4690 == null ? null : this.field4690[var1]; // L: 43 44
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "-824344321"
	)
	void method7640(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.field4690 == null) { // L: 50
				this.field4690 = new Object[var3][]; // L: 51
				this.field4692 = new int[var3][]; // L: 52
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54 55 63
				int var5 = var1.readUnsignedByte(); // L: 56
				int[] var6 = new int[var5]; // L: 57

				for (int var7 = 0; var7 < var5; ++var7) { // L: 58
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				this.field4690[var4] = Huffman.method5486(var1, var6); // L: 61
				this.field4692[var4] = var6; // L: 62
			}
		} else if (var2 == 4) { // L: 66
			this.field4693 = var1.method7754(); // L: 67
		}

	} // L: 70

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	void method7637() {
	} // L: 72
}
