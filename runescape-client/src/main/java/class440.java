import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qm")
public class class440 {
	@ObfuscatedName("ax")
	static final int[] field4721;
	@ObfuscatedName("ai")
	static final int[] field4727;

	static {
		field4721 = new int[2048]; // L: 16
		field4727 = new int[2048]; // L: 17
		double var0 = 0.0030679615757712823D; // L: 20

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 21
			field4721[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 22
			field4727[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 23
		}

	} // L: 25
}
