import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public enum class125 implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1490(0, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1489(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1484(2, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1483(3, 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1486(4, 4);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 9955057
	)
	final int field1487;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 423105089
	)
	final int field1488;

	class125(int var3, int var4) {
		this.field1487 = var3; // L: 147
		this.field1488 = var4; // L: 148
	} // L: 149

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1488; // L: 152
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;IZI)Liw;",
		garbageValue = "-1427479421"
	)
	public static Frames method2956(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}
}
