import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
public enum class472 implements class390 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	field4866(2, 1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	field4863(0, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	field4864(3, 3),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	field4862(1, 10);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static IndexedSprite field4868;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2085928835
	)
	final int field4865;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1509857283
	)
	final int field4867;

	class472(int var3, int var4) {
		this.field4865 = var3; // L: 16
		this.field4867 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4867; // L: 22
	}
}
