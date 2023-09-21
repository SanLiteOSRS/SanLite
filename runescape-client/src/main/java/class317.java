import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class317 {
	@ObfuscatedName("wo")
	@ObfuscatedGetter(
		intValue = 1485750529
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ac")
	static int[] field3416;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("ItemComposition_archive")
	static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field3415;

	static {
		new Object();
		field3416 = new int[33]; // L: 10
		field3416[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3416[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19
}
