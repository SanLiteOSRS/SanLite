import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public class class470 extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public static AbstractArchive field4874;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	static StudioGame field4870;
	@ObfuscatedName("ac")
	public int[][] field4872;
	@ObfuscatedName("ab")
	public Object[][] field4873;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class470() {
	} // L: 16

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-2070277964"
	)
	void method8503(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.method8502(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "1718940042"
	)
	void method8502(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			int var3 = var1.readUnsignedByte(); // L: 39
			if (this.field4872 == null) { // L: 40
				this.field4872 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 41 42 54
				int var5 = var4 & 127; // L: 43
				boolean var6 = (var4 & 128) != 0; // L: 44
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 45

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 46
					var7[var8] = var1.readUShortSmart(); // L: 47
				}

				this.field4872[var5] = var7; // L: 49
				if (var6) { // L: 50
					if (this.field4873 == null) {
						this.field4873 = new Object[this.field4872.length][]; // L: 51
					}

					this.field4873[var5] = Clock.method3525(var1, var7); // L: 52
				}
			}
		}

	} // L: 58

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	void method8505() {
	} // L: 60
}
