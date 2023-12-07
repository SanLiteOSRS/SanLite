import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tb")
public class class517 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	public static AbstractArchive field5074;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1206229207
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("ar")
	public int[][] field5073;
	@ObfuscatedName("ao")
	public Object[][] field5075;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class517() {
	} // L: 16

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-2001833472"
	)
	void method9147(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.method9148(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "268630673"
	)
	void method9148(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			int var3 = var1.readUnsignedByte(); // L: 39
			if (this.field5073 == null) { // L: 40
				this.field5073 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 41 42 69
				int var5 = var4 & 127; // L: 43
				boolean var6 = (var4 & 128) != 0; // L: 44
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 45

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 46
					var7[var8] = var1.readUShortSmart(); // L: 47
				}

				this.field5073[var5] = var7; // L: 49
				if (var6) { // L: 50
					if (this.field5075 == null) {
						this.field5075 = new Object[this.field5073.length][]; // L: 51
					}

					Object[][] var17 = this.field5075; // L: 52
					int var11 = var1.readUShortSmart(); // L: 56
					Object[] var12 = new Object[var7.length * var11]; // L: 57

					for (int var13 = 0; var13 < var11; ++var13) { // L: 58
						for (int var14 = 0; var14 < var7.length; ++var14) { // L: 59
							int var15 = var14 + var7.length * var13; // L: 60
							class514 var16 = class472.method8562(var7[var14]); // L: 61
							var12[var15] = var16.method9120(var1); // L: 62
						}
					}

					var17[var5] = var12; // L: 67
				}
			}
		}

	} // L: 73

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	void method9150() {
	} // L: 75
}
