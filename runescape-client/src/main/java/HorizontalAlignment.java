import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	field1902(2, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	field1903(0, 2);

	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1574414567
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1734271631
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}
}
