import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ni")
public class class348 {
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 1726252919
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class343[] var2 = Messages.method2772(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class343 var4 = var2[var3]; // L: 14
			if (var4.field3836 > var0) {
				var0 = var4.field3836; // L: 16
			}

			if (var4.field3839 > var1) { // L: 17
				var1 = var4.field3839;
			}
		}

	} // L: 21
}
