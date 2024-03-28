import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uw")
public class class527 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	public static AbstractArchive field5175;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("af")
	Object[][] field5173;
	@ObfuscatedName("at")
	int[][] field5176;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2106972307
	)
	public int field5177;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class527() {
		this.field5177 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "28"
	)
	void method9168(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method9182(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "-1604702824"
	)
	public Object[] method9167(int var1) {
		return this.field5173 == null ? null : this.field5173[var1]; // L: 39 40
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "1644007533"
	)
	void method9182(Buffer var1, int var2) {
		if (var2 == 3) { // L: 44
			int var3 = var1.readUnsignedByte(); // L: 45
			if (this.field5173 == null) { // L: 46
				this.field5173 = new Object[var3][]; // L: 47
				this.field5176 = new int[var3][]; // L: 48
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 50 51 74
				int var5 = var1.readUnsignedByte(); // L: 52
				int[] var6 = new int[var5]; // L: 53

				for (int var7 = 0; var7 < var5; ++var7) { // L: 54
					var6[var7] = var1.readUShortSmart(); // L: 55
				}

				Object[][] var16 = this.field5173; // L: 57
				int var10 = var1.readUShortSmart(); // L: 61
				Object[] var11 = new Object[var6.length * var10]; // L: 62

				for (int var12 = 0; var12 < var10; ++var12) { // L: 63
					for (int var13 = 0; var13 < var6.length; ++var13) { // L: 64
						int var14 = var13 + var6.length * var12; // L: 65
						class522 var15 = class211.method3931(var6[var13]); // L: 66
						var11[var14] = var15.method9112(var1); // L: 67
					}
				}

				var16[var4] = var11; // L: 72
				this.field5176[var4] = var6; // L: 73
			}
		} else if (var2 == 4) { // L: 77
			this.field5177 = var1.method9271(); // L: 78
		}

	} // L: 81

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method9170() {
	} // L: 83
}
