import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("of")
public class class365 {
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -994897969
	)
	static int field3943;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1844542457
	)
	@Export("cameraPitch")
	static int cameraPitch;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class360[] var2 = class30.method445(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class360 var4 = var2[var3]; // L: 14
			if (var4.field3901 > var0) {
				var0 = var4.field3901; // L: 16
			}

			if (var4.field3902 > var1) { // L: 17
				var1 = var4.field3902;
			}
		}

	} // L: 21
}
