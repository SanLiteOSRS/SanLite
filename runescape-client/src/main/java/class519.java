import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public class class519 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	public static AbstractArchive field5085;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("ItemComposition_archive")
	public static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("ar")
	Object[][] field5083;
	@ObfuscatedName("ao")
	int[][] field5082;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1891158047
	)
	public int field5084;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class519() {
		this.field5084 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;S)V",
		garbageValue = "2044"
	)
	void method9176(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method9164(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljava/lang/Object;",
		garbageValue = "14"
	)
	public Object[] method9163(int var1) {
		return this.field5083 == null ? null : this.field5083[var1]; // L: 39 40
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;IB)V",
		garbageValue = "55"
	)
	void method9164(Buffer var1, int var2) {
		if (var2 == 3) { // L: 44
			int var3 = var1.readUnsignedByte(); // L: 45
			if (this.field5083 == null) { // L: 46
				this.field5083 = new Object[var3][]; // L: 47
				this.field5082 = new int[var3][]; // L: 48
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 50 51 74
				int var5 = var1.readUnsignedByte(); // L: 52
				int[] var6 = new int[var5]; // L: 53

				for (int var7 = 0; var7 < var5; ++var7) { // L: 54
					var6[var7] = var1.readUShortSmart(); // L: 55
				}

				Object[][] var16 = this.field5083; // L: 57
				int var10 = var1.readUShortSmart(); // L: 61
				Object[] var11 = new Object[var6.length * var10]; // L: 62

				for (int var12 = 0; var12 < var10; ++var12) { // L: 63
					for (int var13 = 0; var13 < var6.length; ++var13) { // L: 64
						int var14 = var13 + var6.length * var12; // L: 65
						class514 var15 = class472.method8562(var6[var13]); // L: 66
						var11[var14] = var15.method9120(var1); // L: 67
					}
				}

				var16[var4] = var11; // L: 72
				this.field5082[var4] = var6; // L: 73
			}
		} else if (var2 == 4) { // L: 77
			this.field5084 = var1.method9341(); // L: 78
		}

	} // L: 81

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1202767644"
	)
	void method9165() {
	} // L: 83
}
