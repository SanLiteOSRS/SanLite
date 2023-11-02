import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ug")
public class class522 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static AbstractArchive field5090;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("ak")
	Object[][] field5088;
	@ObfuscatedName("ax")
	int[][] field5091;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1973383489
	)
	public int field5089;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class522() {
		this.field5089 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "333466413"
	)
	void method9097(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.method9095(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "-2125245982"
	)
	public Object[] method9105(int var1) {
		return this.field5088 == null ? null : this.field5088[var1]; // L: 43 44
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lul;IB)V",
		garbageValue = "-103"
	)
	void method9095(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.field5088 == null) { // L: 50
				this.field5088 = new Object[var3][]; // L: 51
				this.field5091 = new int[var3][]; // L: 52
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54 55 63
				int var5 = var1.readUnsignedByte(); // L: 56
				int[] var6 = new int[var5]; // L: 57

				for (int var7 = 0; var7 < var5; ++var7) { // L: 58
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				this.field5088[var4] = class495.method8635(var1, var6); // L: 61
				this.field5091[var4] = var6; // L: 62
			}
		} else if (var2 == 4) { // L: 66
			this.field5089 = var1.method9225(); // L: 67
		}

	} // L: 70

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1273272100"
	)
	void method9108() {
	} // L: 72
}
