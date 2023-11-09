import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rd")
public class class466 {
	@ObfuscatedName("ah")
	static final int[] field4790;
	@ObfuscatedName("ax")
	static final int[] field4791;

	static {
		field4790 = new int[2048]; // L: 16
		field4791 = new int[2048]; // L: 17
		double var0 = 0.0030679615757712823D; // L: 20

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 21
			field4790[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 22
			field4791[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2)); // L: 23
		}

	} // L: 25
}
