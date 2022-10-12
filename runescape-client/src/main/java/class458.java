import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class458 extends DualNode {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	static AbstractArchive field4848;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("DBRowType_cache")
	public static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("c")
	Object[][] field4849;
	@ObfuscatedName("x")
	int[][] field4846;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -116507795
	)
	public int field4850;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class458() {
		this.field4850 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-116"
	)
	void method8306(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.method8314(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljava/lang/Object;",
		garbageValue = "56"
	)
	public Object[] method8307(int var1) {
		return this.field4849 == null ? null : this.field4849[var1]; // L: 43 44
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "1603267448"
	)
	void method8314(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.field4849 == null) { // L: 50
				this.field4849 = new Object[var3][]; // L: 51
				this.field4846 = new int[var3][]; // L: 52
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54 55 78
				int var5 = var1.readUnsignedByte(); // L: 56
				int[] var6 = new int[var5]; // L: 57

				for (int var7 = 0; var7 < var5; ++var7) { // L: 58
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				Object[][] var16 = this.field4849; // L: 61
				int var10 = var1.readUShortSmart(); // L: 65
				Object[] var11 = new Object[var6.length * var10]; // L: 66

				for (int var12 = 0; var12 < var10; ++var12) { // L: 67
					for (int var13 = 0; var13 < var6.length; ++var13) { // L: 68
						int var14 = var13 + var6.length * var12; // L: 69
						class453 var15 = class230.method4679(var6[var13]); // L: 70
						var11[var14] = var15.method8257(var1); // L: 71
					}
				}

				var16[var4] = var11; // L: 76
				this.field4846[var4] = var6; // L: 77
			}
		} else if (var2 == 4) { // L: 81
			this.field4850 = var1.method8424(); // L: 82
		}

	} // L: 85

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	void method8309() {
	} // L: 87
}
