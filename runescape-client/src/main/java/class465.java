import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rw")
public class class465 {
	@ObfuscatedName("al")
	static final int[] field4793;
	@ObfuscatedName("an")
	static final int[] field4789;

	static {
		field4793 = new int[2048]; // L: 16
		field4789 = new int[2048]; // L: 17
		double var0 = 0.0030679615757712823D; // L: 20

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 21
			field4793[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 22
			field4789[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 23
		}

	} // L: 25
}
