import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
public class class306 {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class302[] var2 = InterfaceParent.method2058(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class302 var4 = var2[var3]; // L: 14
			if (var4.field3579 > var0) {
				var0 = var4.field3579; // L: 16
			}

			if (var4.field3580 > var1) { // L: 17
				var1 = var4.field3580;
			}
		}

	} // L: 21
}
