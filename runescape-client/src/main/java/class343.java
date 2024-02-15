import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
public class class343 {
	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "([Lng;IIIZS)V",
		garbageValue = "1909"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 11179
			Widget var6 = var0[var5]; // L: 11180
			if (var6 != null && var6.parentId == var1) { // L: 11181 11182
				SecureRandomCallable.alignWidgetSize(var6, var2, var3, var4); // L: 11183
				class154.alignWidgetPosition(var6, var2, var3); // L: 11184
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 11185
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 11186
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height; // L: 11187
				}

				if (var6.scrollY < 0) { // L: 11188
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 11189
					class167.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 11191
}
