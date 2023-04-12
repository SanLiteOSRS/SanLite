import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class377 {
	@ObfuscatedName("aj")
	public char field4380;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 427774341
	)
	public int field4379;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1079124409
	)
	public int field4378;

	class377() {
		this.field4379 = 0; // L: 5
		this.field4378 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "87"
	)
	static void method7139(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75
}
