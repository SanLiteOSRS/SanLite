import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public enum class139 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1600(2, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1599(4, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1601(1, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1610(0, 3),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1607(3, 4);

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -672738273
	)
	public final int field1604;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1935653161
	)
	@Export("id")
	final int id;

	class139(int var3, int var4) {
		this.field1604 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "123"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 141
		int var2 = 0; // L: 142

		for (int var3 = 0; var3 < var1; ++var3) { // L: 143
			var2 = (var2 << 5) - var2 + class216.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 144
	}
}
