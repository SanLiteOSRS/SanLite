import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public class class438 extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static AbstractArchive field4678;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("w")
	Object[][] field4679;
	@ObfuscatedName("v")
	int[][] field4681;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1503762807
	)
	public int field4677;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class438() {
	} // L: 17

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "0"
	)
	void method7542(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.method7543(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "1183170979"
	)
	public Object[] method7548(int var1) {
		return this.field4679 == null ? null : this.field4679[var1]; // L: 43 44
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "2146701023"
	)
	void method7543(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.field4679 == null) { // L: 50
				this.field4679 = new Object[var3][]; // L: 51
				this.field4681 = new int[var3][]; // L: 52
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54 55 78
				int var5 = var1.readUnsignedByte(); // L: 56
				int[] var6 = new int[var5]; // L: 57

				for (int var7 = 0; var7 < var5; ++var7) { // L: 58
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				Object[][] var16 = this.field4679; // L: 61
				int var10 = var1.readUShortSmart(); // L: 65
				Object[] var11 = new Object[var6.length * var10]; // L: 66

				for (int var12 = 0; var12 < var10; ++var12) { // L: 67
					for (int var13 = 0; var13 < var6.length; ++var13) { // L: 68
						int var14 = var13 + var6.length * var12; // L: 69
						class433 var15 = class19.method285(var6[var13]); // L: 70
						var11[var14] = var15.method7493(var1); // L: 71
					}
				}

				var16[var4] = var11; // L: 76
				this.field4681[var4] = var6; // L: 77
			}
		} else if (var2 == 4) { // L: 81
			this.field4677 = var1.method7678(); // L: 82
		}

	} // L: 85

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-57"
	)
	void method7549() {
	} // L: 87
}
