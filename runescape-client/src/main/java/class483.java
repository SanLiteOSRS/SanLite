import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
public class class483 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static AbstractArchive field4968;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("DBRowType_cache")
	public static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("aw")
	Object[][] field4971;
	@ObfuscatedName("ac")
	int[][] field4969;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 468764621
	)
	public int field4970;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class483() {
		this.field4970 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1389710331"
	)
	void method8958(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.method8971(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljava/lang/Object;",
		garbageValue = "-88"
	)
	public Object[] method8969(int var1) {
		return this.field4971 == null ? null : this.field4971[var1]; // L: 43 44
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "789571995"
	)
	void method8971(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.field4971 == null) { // L: 50
				this.field4971 = new Object[var3][]; // L: 51
				this.field4969 = new int[var3][]; // L: 52
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54 55 63
				int var5 = var1.readUnsignedByte(); // L: 56
				int[] var6 = new int[var5]; // L: 57

				for (int var7 = 0; var7 < var5; ++var7) { // L: 58
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				this.field4971[var4] = class377.method7250(var1, var6); // L: 61
				this.field4969[var4] = var6; // L: 62
			}
		} else if (var2 == 4) { // L: 66
			this.field4970 = var1.method9078(); // L: 67
		}

	} // L: 70

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2078088696"
	)
	void method8961() {
	} // L: 72
}
