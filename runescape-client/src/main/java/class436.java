import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
public class class436 extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public static AbstractArchive field4682;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("h")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("f")
	public int[][] field4678;
	@ObfuscatedName("u")
	public Object[][] field4681;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class436() {
	} // L: 16

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "2014581097"
	)
	void method7621(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.method7620(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;IB)V",
		garbageValue = "6"
	)
	void method7620(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			int var3 = var1.readUnsignedByte(); // L: 39
			if (this.field4678 == null) { // L: 40
				this.field4678 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 41 42 54
				int var5 = var4 & 127; // L: 43
				boolean var6 = (var4 & 128) != 0; // L: 44
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 45

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 46
					var7[var8] = var1.readUShortSmart(); // L: 47
				}

				this.field4678[var5] = var7; // L: 49
				if (var6) { // L: 50
					if (this.field4681 == null) {
						this.field4681 = new Object[this.field4678.length][]; // L: 51
					}

					this.field4681[var5] = Huffman.method5486(var1, var7); // L: 52
				}
			}
		}

	} // L: 58

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1229456655"
	)
	void method7626() {
	} // L: 60
}
