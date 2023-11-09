import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public class class356 {
	@ObfuscatedName("u")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Lku;IIZI)V",
		garbageValue = "-1619800354"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10545
		int var5 = var0.height; // L: 10546
		if (var0.widthAlignment == 0) { // L: 10547
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10548
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10549
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10550
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10551
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 10552
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 10553
			var0.width = var0.field3382 * var0.height / var0.field3383;
		}

		if (var0.heightAlignment == 4) { // L: 10554
			var0.height = var0.field3383 * var0.width / var0.field3382;
		}

		if (var0.contentType == 1337) { // L: 10555
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10556
			ScriptEvent var6 = new ScriptEvent(); // L: 10557
			var6.widget = var0; // L: 10558
			var6.args = var0.onResize; // L: 10559
			Client.scriptEvents.addFirst(var6); // L: 10560
		}

	} // L: 10562
}
