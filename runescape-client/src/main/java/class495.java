import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public class class495 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	public static AbstractArchive field4997;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("av")
	Object[][] field4996;
	@ObfuscatedName("as")
	int[][] field4993;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1465135223
	)
	public int field4995;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class495() {
		this.field4995 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-896127380"
	)
	void method8811(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method8813(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "2123126806"
	)
	public Object[] method8812(int var1) {
		return this.field4996 == null ? null : this.field4996[var1]; // L: 39 40
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "-2008706416"
	)
	void method8813(Buffer var1, int var2) {
		if (var2 == 3) { // L: 44
			int var3 = var1.readUnsignedByte(); // L: 45
			if (this.field4996 == null) { // L: 46
				this.field4996 = new Object[var3][]; // L: 47
				this.field4993 = new int[var3][]; // L: 48
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 50 51 59
				int var5 = var1.readUnsignedByte(); // L: 52
				int[] var6 = new int[var5]; // L: 53

				for (int var7 = 0; var7 < var5; ++var7) { // L: 54
					var6[var7] = var1.readUShortSmart(); // L: 55
				}

				this.field4996[var4] = class154.method3274(var1, var6); // L: 57
				this.field4993[var4] = var6; // L: 58
			}
		} else if (var2 == 4) { // L: 62
			this.field4995 = var1.method8930(); // L: 63
		}

	} // L: 66

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1935722062"
	)
	void method8814() {
	} // L: 68
}
