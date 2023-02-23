import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lt")
public class class328 {
	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class323[] var2 = FontName.method8320(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class323 var4 = var2[var3]; // L: 14
			if (var4.field3799 > var0) {
				var0 = var4.field3799; // L: 16
			}

			if (var4.field3797 > var1) { // L: 17
				var1 = var4.field3797;
			}
		}

	} // L: 21
}
