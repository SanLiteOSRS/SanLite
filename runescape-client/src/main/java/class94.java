import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class94 {
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-11"
	)
	public static void method2385() {
		class191.field1979.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IIZI)V",
		garbageValue = "-1356173158"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 11218
		int var5 = var0.height; // L: 11219
		if (var0.widthAlignment == 0) { // L: 11220
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 11221
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 11222
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 11223
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 11224
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 11225
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 11226
			var0.width = var0.field3760 * var0.height / var0.field3831;
		}

		if (var0.heightAlignment == 4) { // L: 11227
			var0.height = var0.field3831 * var0.width / var0.field3760;
		}

		if (var0.contentType == 1337) { // L: 11228
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 11229
			var0.method6667().method6369(var0.width, var0.height); // L: 11230
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 11232
			ScriptEvent var6 = new ScriptEvent(); // L: 11233
			var6.widget = var0; // L: 11234
			var6.args = var0.onResize; // L: 11235
			Client.scriptEvents.addFirst(var6); // L: 11236
		}

	} // L: 11238
}
