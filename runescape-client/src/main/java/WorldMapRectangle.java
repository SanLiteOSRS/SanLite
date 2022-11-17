import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1171532599
	)
	@Export("width")
	int width;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2064295769
	)
	@Export("height")
	int height;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -294423873
	)
	@Export("x")
	int x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1121577211
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lil;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 303
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIZB)V",
		garbageValue = "48"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10904
		int var5 = var0.height; // L: 10905
		if (var0.widthAlignment == 0) { // L: 10906
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10907
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10908
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10909
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10910
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 10911
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 10912
			var0.width = var0.height * var0.field3498 / var0.field3532;
		}

		if (var0.heightAlignment == 4) { // L: 10913
			var0.height = var0.field3532 * var0.width / var0.field3498;
		}

		if (var0.contentType == 1337) { // L: 10914
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 10915
			var0.method6076().method5772(var0.width, var0.height); // L: 10916
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10918
			ScriptEvent var6 = new ScriptEvent(); // L: 10919
			var6.widget = var0; // L: 10920
			var6.args = var0.onResize; // L: 10921
			Client.scriptEvents.addFirst(var6); // L: 10922
		}

	} // L: 10924
}
