import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
public class class465 {
	@ObfuscatedName("as")
	static final int[] field4786;
	@ObfuscatedName("aj")
	static final int[] field4788;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static IndexedSprite field4784;

	static {
		field4786 = new int[16384]; // L: 8
		field4788 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4786[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2)); // L: 14
			field4788[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2)); // L: 15
		}

	} // L: 17
}
