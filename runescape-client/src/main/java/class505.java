import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
public class class505 extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static AbstractArchive field5042;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("ap")
	@Export("SpriteBuffer_spritePalette")
	static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("ao")
	public int[][] field5043;
	@ObfuscatedName("at")
	public Object[][] field5045;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class505() {
	} // L: 16

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "2"
	)
	void method8938(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method8939(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "-1215696705"
	)
	void method8939(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field5043 == null) { // L: 44
				this.field5043 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 58
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field5043[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field5045 == null) {
						this.field5045 = new Object[this.field5043.length][]; // L: 55
					}

					this.field5045[var5] = class25.method379(var1, var7); // L: 56
				}
			}
		}

	} // L: 62

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2013883832"
	)
	void method8943() {
	} // L: 64
}
