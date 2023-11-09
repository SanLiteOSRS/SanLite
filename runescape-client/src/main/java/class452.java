import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rv")
public class class452 {
	@ObfuscatedName("ax")
	static final int[] field4731;
	@ObfuscatedName("ap")
	static final int[] field4730;
	@ObfuscatedName("aq")
	@Export("operatingSystemName")
	static String operatingSystemName;

	static {
		field4731 = new int[16384]; // L: 8
		field4730 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4731[var2] = (int)(16384.0D * Math.sin((double)var2 * var0)); // L: 14
			field4730[var2] = (int)(16384.0D * Math.cos((double)var2 * var0)); // L: 15
		}

	} // L: 17
}
