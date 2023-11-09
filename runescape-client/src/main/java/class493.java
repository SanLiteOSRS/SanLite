import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
public class class493 extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static AbstractArchive field4985;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("ar")
	public int[][] field4984;
	@ObfuscatedName("ab")
	public Object[][] field4986;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class493() {
	} // L: 16

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-1496369353"
	)
	void method8855(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method8858(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "-186765674"
	)
	void method8858(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field4984 == null) { // L: 44
				this.field4984 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 73
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field4984[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field4986 == null) {
						this.field4986 = new Object[this.field4984.length][]; // L: 55
					}

					Object[][] var17 = this.field4986; // L: 56
					int var11 = var1.readUShortSmart(); // L: 60
					Object[] var12 = new Object[var7.length * var11]; // L: 61

					for (int var13 = 0; var13 < var11; ++var13) { // L: 62
						for (int var14 = 0; var14 < var7.length; ++var14) { // L: 63
							int var15 = var14 + var7.length * var13; // L: 64
							class490 var16 = Coord.method6069(var7[var14]); // L: 65
							var12[var15] = var16.method8826(var1); // L: 66
						}
					}

					var17[var5] = var12; // L: 71
				}
			}
		}

	} // L: 77

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1461127956"
	)
	void method8857() {
	} // L: 79
}
