import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("to")
public class class495 extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	public static AbstractArchive field4996;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("ar")
	Object[][] field4994;
	@ObfuscatedName("ab")
	int[][] field4995;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1263359483
	)
	public int field4992;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class495() {
		this.field4992 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-2048817311"
	)
	void method8876(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method8880(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "-291336682"
	)
	public Object[] method8877(int var1) {
		return this.field4994 == null ? null : this.field4994[var1]; // L: 39 40
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "-1651651456"
	)
	void method8880(Buffer var1, int var2) {
		if (var2 == 3) { // L: 44
			int var3 = var1.readUnsignedByte(); // L: 45
			if (this.field4994 == null) { // L: 46
				this.field4994 = new Object[var3][]; // L: 47
				this.field4995 = new int[var3][]; // L: 48
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 50 51 74
				int var5 = var1.readUnsignedByte(); // L: 52
				int[] var6 = new int[var5]; // L: 53

				for (int var7 = 0; var7 < var5; ++var7) { // L: 54
					var6[var7] = var1.readUShortSmart(); // L: 55
				}

				Object[][] var16 = this.field4994; // L: 57
				int var10 = var1.readUShortSmart(); // L: 61
				Object[] var11 = new Object[var6.length * var10]; // L: 62

				for (int var12 = 0; var12 < var10; ++var12) { // L: 63
					for (int var13 = 0; var13 < var6.length; ++var13) { // L: 64
						int var14 = var13 + var6.length * var12; // L: 65
						class490 var15 = Coord.method6069(var6[var13]); // L: 66
						var11[var14] = var15.method8826(var1); // L: 67
					}
				}

				var16[var4] = var11; // L: 72
				this.field4995[var4] = var6; // L: 73
			}
		} else if (var2 == 4) { // L: 77
			this.field4992 = var1.method8985(); // L: 78
		}

	} // L: 81

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-57"
	)
	void method8881() {
	} // L: 83
}
