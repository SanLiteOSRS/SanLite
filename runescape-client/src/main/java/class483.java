import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sx")
public class class483 {
	@ObfuscatedName("ar")
	static final int[] field4892;
	@ObfuscatedName("as")
	static final int[] field4887;

	static {
		field4892 = new int[16384]; // L: 8
		field4887 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4892[var2] = (int)(16384.0D * Math.sin((double)var2 * var0)); // L: 14
			field4887[var2] = (int)(16384.0D * Math.cos((double)var2 * var0)); // L: 15
		}

	} // L: 17
}
