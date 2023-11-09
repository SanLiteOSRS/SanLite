import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
public enum class485 implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	field5016(1, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	field5017(2, 2);

	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -10444667
	)
	public final int field5015;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1699036057
	)
	final int field5019;

	class485(int var3, int var4) {
		this.field5015 = var3; // L: 19
		this.field5019 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5019; // L: 25
	}
}
