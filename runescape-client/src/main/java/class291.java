import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class291 {
	@ObfuscatedName("aj")
	static int[] field3311;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;

	static {
		new Object();
		field3311 = new int[33]; // L: 10
		field3311[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3311[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19
}
