import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public class class401 {
	@ObfuscatedName("n")
	static final int[] field4284;
	@ObfuscatedName("l")
	static final int[] field4285;

	static {
		field4284 = new int[2048];
		field4285 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4284[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field4285[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		signature = "(Lhu;IIZI)V",
		garbageValue = "771513192"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.height * var0.field2614 / var0.field2642;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.width * var0.field2642 / var0.field2614;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
