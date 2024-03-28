import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("os")
public class class368 {
	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class363[] var2 = Messages.method2755(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class363 var4 = var2[var3]; // L: 14
			if (var4.field3971 > var0) {
				var0 = var4.field3971; // L: 16
			}

			if (var4.field3972 > var1) { // L: 17
				var1 = var4.field3972;
			}
		}

	} // L: 21
}
