import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public enum class128 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	field1516(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	field1519(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	field1517(2, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	field1518(3, 3),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	field1523(4, 4);

	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1945414617
	)
	final int field1520;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1030760937
	)
	final int field1521;

	class128(int var3, int var4) {
		this.field1520 = var3; // L: 127
		this.field1521 = var4; // L: 128
	} // L: 129

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1521; // L: 132
	}
}
