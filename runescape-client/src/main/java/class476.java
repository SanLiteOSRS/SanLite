import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sc")
public class class476 {
	@ObfuscatedName("ab")
	static final int[] field4817;
	@ObfuscatedName("au")
	static final int[] field4820;

	static {
		field4817 = new int[16384]; // L: 8
		field4820 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4817[var2] = (int)(16384.0D * Math.sin((double)var2 * var0)); // L: 14
			field4820[var2] = (int)(16384.0D * Math.cos((double)var2 * var0)); // L: 15
		}

	} // L: 17
}
