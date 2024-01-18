import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("so")
public class class480 {
	@ObfuscatedName("aq")
	static final int[] field4859;
	@ObfuscatedName("ar")
	static final int[] field4860;

	static {
		field4859 = new int[16384]; // L: 8
		field4860 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4859[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2)); // L: 14
			field4860[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2)); // L: 15
		}

	} // L: 17
}
