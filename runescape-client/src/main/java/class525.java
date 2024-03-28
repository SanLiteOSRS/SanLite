import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uv")
public class class525 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	static AbstractArchive field5163;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("af")
	public int[][] field5165;
	@ObfuscatedName("at")
	public Object[][] field5166;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class525() {
	} // L: 16

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "12"
	)
	void method9148(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method9155(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "41"
	)
	void method9155(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field5165 == null) { // L: 44
				this.field5165 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 73
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field5165[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field5166 == null) { // L: 55
						this.field5166 = new Object[this.field5165.length][];
					}

					Object[][] var17 = this.field5166; // L: 56
					int var11 = var1.readUShortSmart(); // L: 60
					Object[] var12 = new Object[var7.length * var11]; // L: 61

					for (int var13 = 0; var13 < var11; ++var13) { // L: 62
						for (int var14 = 0; var14 < var7.length; ++var14) { // L: 63
							int var15 = var14 + var7.length * var13; // L: 64
							class522 var16 = class211.method3931(var7[var14]); // L: 65
							var12[var15] = var16.method9112(var1); // L: 66
						}
					}

					var17[var5] = var12; // L: 71
				}
			}
		}

	} // L: 77

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	void method9151() {
	} // L: 79
}
