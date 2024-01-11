import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
public class class521 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public static AbstractArchive field5118;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("af")
	public int[][] field5115;
	@ObfuscatedName("aj")
	public Object[][] field5117;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class521() {
	} // L: 16

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "1280229996"
	)
	void method9268(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.method9269(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;IB)V",
		garbageValue = "74"
	)
	void method9269(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			int var3 = var1.readUnsignedByte(); // L: 39
			if (this.field5115 == null) { // L: 40
				this.field5115 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 41 42 69
				int var5 = var4 & 127; // L: 43
				boolean var6 = (var4 & 128) != 0; // L: 44
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 45

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 46
					var7[var8] = var1.readUShortSmart(); // L: 47
				}

				this.field5115[var5] = var7; // L: 49
				if (var6) { // L: 50
					if (this.field5117 == null) {
						this.field5117 = new Object[this.field5115.length][]; // L: 51
					}

					Object[][] var17 = this.field5117; // L: 52
					int var11 = var1.readUShortSmart(); // L: 56
					Object[] var12 = new Object[var7.length * var11]; // L: 57

					for (int var13 = 0; var13 < var11; ++var13) { // L: 58
						for (int var14 = 0; var14 < var7.length; ++var14) { // L: 59
							int var15 = var14 + var7.length * var13; // L: 60
							class518 var16 = class270.method5345(var7[var14]); // L: 61
							var12[var15] = var16.method9243(var1); // L: 62
						}
					}

					var17[var5] = var12; // L: 67
				}
			}
		}

	} // L: 73

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method9266() {
	} // L: 75
}
