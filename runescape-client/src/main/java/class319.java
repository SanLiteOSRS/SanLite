import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mm")
public class class319 {
	@ObfuscatedName("az")
	static int[] field3480;

	static {
		new Object();
		field3480 = new int[33]; // L: 10
		field3480[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3480[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19
}
