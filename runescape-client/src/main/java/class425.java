import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("py")
public class class425 {
	@ObfuscatedName("b")
	static final int[] field4672;
	@ObfuscatedName("j")
	static final int[] field4673;

	static {
		field4672 = new int[2048]; // L: 13
		field4673 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4672[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 19
			field4673[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 20
		}

	} // L: 22
}
