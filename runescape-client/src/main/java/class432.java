import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ph")
public class class432 {
	@ObfuscatedName("k")
	static final int[] field4697;
	@ObfuscatedName("c")
	static final int[] field4698;

	static {
		field4697 = new int[2048]; // L: 13
		field4698 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4697[var2] = (int)(65536.0D * Math.sin((double)var2 * var0)); // L: 19
			field4698[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2)); // L: 20
		}

	} // L: 22
}
