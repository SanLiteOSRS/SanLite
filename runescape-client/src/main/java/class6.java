import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public enum class6 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	field17(0, 0);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1357018759
	)
	public final int field15;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1056213101
	)
	final int field13;

	class6(int var3, int var4) {
		this.field15 = var3; // L: 12
		this.field13 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field13; // L: 18
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-728527563"
	)
	static void method36() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79
}
