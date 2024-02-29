import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
public class class526 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static AbstractArchive field5151;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("al")
	Object[][] field5149;
	@ObfuscatedName("ai")
	int[][] field5147;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1361280359
	)
	public int field5150;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class526() {
		this.field5150 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-216042909"
	)
	void method9374(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.method9376(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "-13613762"
	)
	public Object[] method9385(int var1) {
		return this.field5149 == null ? null : this.field5149[var1]; // L: 43 44
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "1950036921"
	)
	void method9376(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.field5149 == null) { // L: 50
				this.field5149 = new Object[var3][]; // L: 51
				this.field5147 = new int[var3][]; // L: 52
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54 55 63
				int var5 = var1.readUnsignedByte(); // L: 56
				int[] var6 = new int[var5]; // L: 57

				for (int var7 = 0; var7 < var5; ++var7) { // L: 58
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				this.field5149[var4] = class75.method2123(var1, var6); // L: 61
				this.field5147[var4] = var6; // L: 62
			}
		} else if (var2 == 4) { // L: 66
			this.field5150 = var1.method9539(); // L: 67
		}

	} // L: 70

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method9377() {
	} // L: 72
}
