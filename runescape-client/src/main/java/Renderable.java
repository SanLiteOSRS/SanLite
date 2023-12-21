import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -2146691913
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lka;",
		garbageValue = "1"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("dw")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1945159516"
	)
	static void method5509() {
		ByteArrayPool.field4590.clear(); // L: 62
		ByteArrayPool.field4590.add(100); // L: 63
		ByteArrayPool.field4590.add(5000); // L: 64
		ByteArrayPool.field4590.add(10000); // L: 65
		ByteArrayPool.field4590.add(30000); // L: 66
	} // L: 67

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIZB)V",
		garbageValue = "-74"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 11215
		int var5 = var0.height; // L: 11216
		if (var0.widthAlignment == 0) { // L: 11217
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 11218
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 11219
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 11220
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 11221
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 11222
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 11223
			var0.width = var0.field3770 * var0.height / var0.field3677;
		}

		if (var0.heightAlignment == 4) { // L: 11224
			var0.height = var0.width * var0.field3677 / var0.field3770;
		}

		if (var0.contentType == 1337) { // L: 11225
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 11226
			var0.method6688().method6366(var0.width, var0.height); // L: 11227
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 11229
			ScriptEvent var6 = new ScriptEvent(); // L: 11230
			var6.widget = var0; // L: 11231
			var6.args = var0.onResize; // L: 11232
			Client.scriptEvents.addFirst(var6); // L: 11233
		}

	} // L: 11235
}
