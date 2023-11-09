import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public class class466 extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static AbstractArchive field4910;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("v")
	public int[][] field4907;
	@ObfuscatedName("s")
	public Object[][] field4909;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class466() {
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-1384251148"
	)
	void method8536(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method8537(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "1170374859"
	)
	void method8537(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field4907 == null) { // L: 44
				this.field4907 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 73
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field4907[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field4909 == null) {
						this.field4909 = new Object[this.field4907.length][]; // L: 55
					}

					Object[][] var17 = this.field4909; // L: 56
					int var11 = var1.readUShortSmart(); // L: 60
					Object[] var12 = new Object[var7.length * var11]; // L: 61

					for (int var13 = 0; var13 < var11; ++var13) { // L: 62
						for (int var14 = 0; var14 < var7.length; ++var14) { // L: 63
							int var15 = var14 + var7.length * var13; // L: 64
							class463 var16 = class370.method7047(var7[var14]); // L: 65
							var12[var15] = var16.method8507(var1); // L: 66
						}
					}

					var17[var5] = var12; // L: 71
				}
			}
		}

	} // L: 77

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-286548666"
	)
	void method8538() {
	} // L: 79
}
