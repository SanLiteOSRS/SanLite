import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public class class493 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	static AbstractArchive field4983;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("av")
	public int[][] field4985;
	@ObfuscatedName("as")
	public Object[][] field4986;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class493() {
	} // L: 16

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "37"
	)
	void method8792(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method8796(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "1928649826"
	)
	void method8796(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field4985 == null) { // L: 44
				this.field4985 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 58
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field4985[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field4986 == null) {
						this.field4986 = new Object[this.field4985.length][]; // L: 55
					}

					this.field4986[var5] = class154.method3274(var1, var7); // L: 56
				}
			}
		}

	} // L: 62

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	void method8787() {
	} // L: 64
}
