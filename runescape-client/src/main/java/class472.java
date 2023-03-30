import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
public class class472 extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public static AbstractArchive field4881;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("DBRowType_cache")
	public static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("ac")
	Object[][] field4882;
	@ObfuscatedName("ab")
	int[][] field4880;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1115242547
	)
	public int field4883;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class472() {
		this.field4883 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;B)V",
		garbageValue = "-19"
	)
	void method8519(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method8522(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljava/lang/Object;",
		garbageValue = "-99"
	)
	public Object[] method8530(int var1) {
		return this.field4882 == null ? null : this.field4882[var1]; // L: 39 40
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "-2101784162"
	)
	void method8522(Buffer var1, int var2) {
		if (var2 == 3) { // L: 44
			int var3 = var1.readUnsignedByte(); // L: 45
			if (this.field4882 == null) { // L: 46
				this.field4882 = new Object[var3][]; // L: 47
				this.field4880 = new int[var3][]; // L: 48
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 50 51 59
				int var5 = var1.readUnsignedByte(); // L: 52
				int[] var6 = new int[var5]; // L: 53

				for (int var7 = 0; var7 < var5; ++var7) { // L: 54
					var6[var7] = var1.readUShortSmart(); // L: 55
				}

				this.field4882[var4] = Clock.method3525(var1, var6); // L: 57
				this.field4880[var4] = var6; // L: 58
			}
		} else if (var2 == 4) { // L: 62
			this.field4883 = var1.method8798(); // L: 63
		}

	} // L: 66

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "8396928"
	)
	void method8524() {
	} // L: 68
}
