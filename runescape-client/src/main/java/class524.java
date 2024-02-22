import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
public class class524 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static AbstractArchive field5137;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("dx")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("al")
	public int[][] field5140;
	@ObfuscatedName("ai")
	public Object[][] field5139;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class524() {
	} // L: 16

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "887031690"
	)
	void method9352(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method9353(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "0"
	)
	void method9353(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field5140 == null) { // L: 44
				this.field5140 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 58
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field5140[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field5139 == null) {
						this.field5139 = new Object[this.field5140.length][]; // L: 55
					}

					this.field5139[var5] = class75.method2123(var1, var7); // L: 56
				}
			}
		}

	} // L: 62

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	void method9354() {
	} // L: 64
}
