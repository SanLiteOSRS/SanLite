import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public enum class127 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1492(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1491(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1490(2, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1493(3, 3),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1494(4, 4);

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 611401851
	)
	final int field1495;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 730645391
	)
	final int field1496;

	class127(int var3, int var4) {
		this.field1495 = var3; // L: 131
		this.field1496 = var4; // L: 132
	} // L: 133

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1496; // L: 136
	}
}
