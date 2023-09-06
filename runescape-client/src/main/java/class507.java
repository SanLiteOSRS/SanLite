import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
public class class507 extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static AbstractArchive field5053;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("ao")
	Object[][] field5056;
	@ObfuscatedName("at")
	int[][] field5054;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1839365757
	)
	public int field5055;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class507() {
		this.field5055 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-1552202999"
	)
	void method8970(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.method8958(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "1717778174"
	)
	public Object[] method8961(int var1) {
		return this.field5056 == null ? null : this.field5056[var1]; // L: 43 44
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "1262873215"
	)
	void method8958(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.field5056 == null) { // L: 50
				this.field5056 = new Object[var3][]; // L: 51
				this.field5054 = new int[var3][]; // L: 52
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54 55 63
				int var5 = var1.readUnsignedByte(); // L: 56
				int[] var6 = new int[var5]; // L: 57

				for (int var7 = 0; var7 < var5; ++var7) { // L: 58
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				this.field5056[var4] = class25.method379(var1, var6); // L: 61
				this.field5054[var4] = var6; // L: 62
			}
		} else if (var2 == 4) { // L: 66
			this.field5055 = var1.method9080(); // L: 67
		}

	} // L: 70

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-55"
	)
	void method8959() {
	} // L: 72
}
