import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rt")
public class class464 {
	@ObfuscatedName("ay")
	static final int[] field4782;
	@ObfuscatedName("ap")
	static final int[] field4783;
	@ObfuscatedName("au")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;

	static {
		field4782 = new int[16384]; // L: 8
		field4783 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4782[var2] = (int)(16384.0D * Math.sin((double)var2 * var0)); // L: 14
			field4783[var2] = (int)(16384.0D * Math.cos((double)var2 * var0)); // L: 15
		}

	} // L: 17
}
