import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public class class481 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static AbstractArchive field4961;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("aw")
	public int[][] field4959;
	@ObfuscatedName("ac")
	public Object[][] field4960;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class481() {
	} // L: 16

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "1"
	)
	void method8929(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method8930(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "-4"
	)
	void method8930(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field4959 == null) { // L: 44
				this.field4959 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 58
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field4959[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field4960 == null) { // L: 55
						this.field4960 = new Object[this.field4959.length][];
					}

					this.field4960[var5] = class377.method7250(var1, var7); // L: 56
				}
			}
		}

	} // L: 62

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-25081"
	)
	void method8934() {
	} // L: 64
}
