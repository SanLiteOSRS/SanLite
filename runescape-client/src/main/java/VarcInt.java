import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("af")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public VarcInt() {
		this.persist = false; // L: 12
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "51"
	)
	public void method3629(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 16
			if (var2 == 0) { // L: 17
				return; // L: 20
			}

			this.method3636(var1, var2); // L: 18
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-899761291"
	)
	void method3636(Buffer var1, int var2) {
		if (var2 == 2) { // L: 23
			this.persist = true; // L: 24
		}

	} // L: 27

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "0"
	)
	static boolean method3635(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Low;Ljava/lang/String;Ljava/lang/String;B)Lut;",
		garbageValue = "20"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 92
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 93
			int var4 = var0.getFileId(var3, var2); // L: 94
			IndexedSprite var5;
			if (!Varcs.method2829(var0, var3, var4)) { // L: 97
				var5 = null; // L: 98
			} else {
				var5 = class464.method8511(); // L: 101
			}

			return var5; // L: 103
		}
	}
}
