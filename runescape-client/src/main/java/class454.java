import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public enum class454 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	field4781(1, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	field4784(2, 2);

	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1261815947
	)
	public final int field4783;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -161896237
	)
	final int field4780;

	class454(int var3, int var4) {
		this.field4783 = var3; // L: 19
		this.field4780 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4780; // L: 25
	}
}
