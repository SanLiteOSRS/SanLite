import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public class class418 extends class422 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 3327618616147297289L
	)
	long field4583;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 535328311
	)
	int field4582;

	@ObfuscatedSignature(
		descriptor = "(Lqd;I)V"
	)
	public class418(class422 var1, int var2) {
		super(var1); // L: 8
		this.field4582 = var2; // L: 9
		super.field4597 = "DelayFadeTask"; // L: 10
	} // L: 11

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		if (this.field4583 < (long)this.field4582) { // L: 15
			++this.field4583; // L: 16
			return false; // L: 17
		} else {
			return true; // L: 19
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIZI)V",
		garbageValue = "-1782175119"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 11032
		int var5 = var0.height; // L: 11033
		if (var0.widthAlignment == 0) { // L: 11034
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 11035
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 11036
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 11037
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 11038
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 11039
		}

		if (var0.widthAlignment == 4) { // L: 11040
			var0.width = var0.field3718 * var0.height / var0.field3710;
		}

		if (var0.heightAlignment == 4) { // L: 11041
			var0.height = var0.width * var0.field3710 / var0.field3718;
		}

		if (var0.contentType == 1337) { // L: 11042
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 11043
			var0.method6700().method6422(var0.width, var0.height); // L: 11044
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 11046
			ScriptEvent var6 = new ScriptEvent(); // L: 11047
			var6.widget = var0; // L: 11048
			var6.args = var0.onResize; // L: 11049
			Client.scriptEvents.addFirst(var6); // L: 11050
		}

	} // L: 11052
}
