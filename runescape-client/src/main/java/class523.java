import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uh")
public class class523 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static AbstractArchive field5124;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("DBRowType_cache")
	public static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("af")
	Object[][] field5125;
	@ObfuscatedName("aj")
	int[][] field5126;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1134881467
	)
	public int field5127;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class523() {
		this.field5127 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-911667958"
	)
	void method9283(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.method9300(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "-903022113"
	)
	public Object[] method9284(int var1) {
		return this.field5125 == null ? null : this.field5125[var1]; // L: 43 44
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "1989317971"
	)
	void method9300(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.field5125 == null) { // L: 50
				this.field5125 = new Object[var3][]; // L: 51
				this.field5126 = new int[var3][]; // L: 52
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54 55 78
				int var5 = var1.readUnsignedByte(); // L: 56
				int[] var6 = new int[var5]; // L: 57

				for (int var7 = 0; var7 < var5; ++var7) { // L: 58
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				Object[][] var16 = this.field5125; // L: 61
				int var10 = var1.readUShortSmart(); // L: 65
				Object[] var11 = new Object[var6.length * var10]; // L: 66

				for (int var12 = 0; var12 < var10; ++var12) { // L: 67
					for (int var13 = 0; var13 < var6.length; ++var13) { // L: 68
						int var14 = var13 + var6.length * var12; // L: 69
						class518 var15 = class270.method5345(var6[var13]); // L: 70
						var11[var14] = var15.method9243(var1); // L: 71
					}
				}

				var16[var4] = var11; // L: 76
				this.field5126[var4] = var6; // L: 77
			}
		} else if (var2 == 4) { // L: 81
			this.field5127 = var1.method9529(); // L: 82
		}

	} // L: 85

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	void method9286() {
	} // L: 87
}
