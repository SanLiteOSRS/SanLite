import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("og")
public class class364 {
	@ObfuscatedName("jz")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class360[] var2 = new class360[]{class360.field3939, class360.field3937}; // L: 14
		class360[] var3 = var2; // L: 16

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 17
			class360 var5 = var3[var4]; // L: 18
			if (var5.field3938 > var0) { // L: 20
				var0 = var5.field3938;
			}

			if (var5.field3940 > var1) { // L: 21
				var1 = var5.field3940;
			}
		}

	} // L: 25
}
