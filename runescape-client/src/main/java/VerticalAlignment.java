import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	field2056(1, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	field2053(2, 2);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 155127241
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1420080729
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}
}
