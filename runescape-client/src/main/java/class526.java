import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
public enum class526 implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	field5193(1, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	field5196(2, 2);

	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2077273167
	)
	public final int field5192;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1910869001
	)
	final int field5194;

	class526(int var3, int var4) {
		this.field5192 = var3; // L: 19
		this.field5194 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5194; // L: 25
	}
}
