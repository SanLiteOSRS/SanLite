import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uz")
public class class520 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static AbstractArchive field5080;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("ak")
	public int[][] field5079;
	@ObfuscatedName("ax")
	public Object[][] field5078;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class520() {
	} // L: 16

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "2"
	)
	void method9080(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method9067(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "-1635084839"
	)
	void method9067(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field5079 == null) { // L: 44
				this.field5079 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 58
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field5079[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field5078 == null) {
						this.field5078 = new Object[this.field5079.length][]; // L: 55
					}

					this.field5078[var5] = class495.method8635(var1, var7); // L: 56
				}
			}
		}

	} // L: 62

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1223582453"
	)
	void method9068() {
	} // L: 64
}
