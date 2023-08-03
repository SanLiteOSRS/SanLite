import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
public class class506 extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static AbstractArchive field5043;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field5041;
	@ObfuscatedName("ar")
	public int[][] field5040;
	@ObfuscatedName("am")
	public Object[][] field5042;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class506() {
	} // L: 16

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "871558389"
	)
	void method8969(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method8970(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;IB)V",
		garbageValue = "-2"
	)
	void method8970(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field5040 == null) { // L: 44
				this.field5040 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 58
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field5040[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field5042 == null) {
						this.field5042 = new Object[this.field5040.length][]; // L: 55
					}

					this.field5042[var5] = class10.method103(var1, var7); // L: 56
				}
			}
		}

	} // L: 62

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1574876599"
	)
	void method8968() {
	} // L: 64

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1773514467"
	)
	public static void method8985() {
		class492.SpriteBuffer_xOffsets = null; // L: 251
		class134.SpriteBuffer_yOffsets = null; // L: 252
		class172.SpriteBuffer_spriteWidths = null; // L: 253
		class528.SpriteBuffer_spriteHeights = null; // L: 254
		class528.SpriteBuffer_spritePalette = null; // L: 255
		ArchiveDiskAction.SpriteBuffer_pixels = null; // L: 256
	} // L: 257
}
