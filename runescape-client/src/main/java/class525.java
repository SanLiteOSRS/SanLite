import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
public enum class525 implements class372 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	field5151(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	field5149(2, 2);

	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -472564559
	)
	public final int field5152;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 718642529
	)
	final int field5153;

	class525(int var3, int var4) {
		this.field5152 = var3; // L: 19
		this.field5153 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5153; // L: 25
	}
}
