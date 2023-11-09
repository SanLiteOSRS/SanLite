import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public enum class441 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	field4719(0, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	field4715(3, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	field4716(1, 3),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	field4714(2, 10);

	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2006761247
	)
	final int field4718;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1244214937
	)
	final int field4717;

	class441(int var3, int var4) {
		this.field4718 = var3; // L: 20
		this.field4717 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4717; // L: 26
	}
}
