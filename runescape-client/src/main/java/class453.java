import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
public enum class453 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	field4755(1, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	field4754(3, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	field4756(0, 3),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	field4758(2, 10);

	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -146163785
	)
	final int field4757;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -875154495
	)
	final int field4753;

	class453(int var3, int var4) {
		this.field4757 = var3; // L: 16
		this.field4753 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4753; // L: 22
	}
}
