import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public class class331 {
	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class326[] var2 = FontName.method8260(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class326 var4 = var2[var3]; // L: 14
			if (var4.field3764 > var0) {
				var0 = var4.field3764;
			}

			if (var4.field3768 > var1) { // L: 17
				var1 = var4.field3768;
			}
		}

	} // L: 21

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "45"
	)
	static boolean method6350(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104; // L: 16
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "96"
	)
	public static int method6351(int var0, int var1, int var2) {
		int var3 = class206.method4069(var2 - var1 + 1); // L: 59
		var3 <<= var1; // L: 60
		var0 |= var3; // L: 61
		return var0; // L: 62
	}
}
