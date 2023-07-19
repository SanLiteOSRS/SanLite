import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
public class class505 extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	static AbstractArchive field5042;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("ac")
	public int[][] field5043;
	@ObfuscatedName("aw")
	public Object[][] field5041;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class505() {
	} // L: 16

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "11"
	)
	void method8931(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method8933(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "1470925187"
	)
	void method8933(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field5043 == null) { // L: 44
				this.field5043 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 73
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field5043[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field5041 == null) {
						this.field5041 = new Object[this.field5043.length][]; // L: 55
					}

					Object[][] var17 = this.field5041; // L: 56
					int var11 = var1.readUShortSmart(); // L: 60
					Object[] var12 = new Object[var7.length * var11]; // L: 61

					for (int var13 = 0; var13 < var11; ++var13) { // L: 62
						for (int var14 = 0; var14 < var7.length; ++var14) { // L: 63
							int var15 = var14 + var7.length * var13; // L: 64
							class502 var16 = class11.method129(var7[var14]); // L: 65
							var12[var15] = var16.method8895(var1); // L: 66
						}
					}

					var17[var5] = var12; // L: 71
				}
			}
		}

	} // L: 77

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-197550799"
	)
	void method8932() {
	} // L: 79

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Ljava/lang/String;Ljava/lang/String;I)[Luq;",
		garbageValue = "811682719"
	)
	public static SpritePixels[] method8943(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 150
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 151
			int var4 = var0.getFileId(var3, var2); // L: 152
			return class143.method3200(var0, var3, var4); // L: 153
		}
	}
}
