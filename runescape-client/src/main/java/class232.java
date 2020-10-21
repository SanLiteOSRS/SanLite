import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hg")
public class class232 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -11600427
	)
	static int field2780;

	static {
		int var0 = 0;
		int var1 = 0;
		class238[] var2 = class8.method116();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class238 var4 = var2[var3];
			if (var4.field3112 > var0) {
				var0 = var4.field3112;
			}

			if (var4.field3117 > var1) {
				var1 = var4.field3117;
			}
		}

	}
}
