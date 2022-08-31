import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1953(2, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	field1948(1, 2);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2090139611
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1225371451
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}
}
