import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sh")
public class class481 {
	@ObfuscatedName("ad")
	static final int[] field4864;
	@ObfuscatedName("ax")
	static final int[] field4862;

	static {
		field4864 = new int[2048]; // L: 16
		field4862 = new int[2048]; // L: 17
		double var0 = 0.0030679615757712823D; // L: 20

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 21
			field4864[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 22
			field4862[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 23
		}

	} // L: 25
}
