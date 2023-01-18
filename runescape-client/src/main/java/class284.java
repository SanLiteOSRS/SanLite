import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("js")
public class class284 {
	@ObfuscatedName("h")
	static int[] field3329;

	static {
		new Object();
		field3329 = new int[33]; // L: 10
		field3329[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3329[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19
}
