import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public enum class192 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	field2205((byte)-1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	field2209((byte)0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	field2206((byte)1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	field2207((byte)2);

	@ObfuscatedName("c")
	public byte field2208;

	class192(byte var3) {
		this.field2208 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2208; // L: 19
	}
}
