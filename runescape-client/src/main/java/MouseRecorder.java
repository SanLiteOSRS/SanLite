import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = 829134311
	)
	static int field609;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		signature = "Lfl;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("z")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("k")
	@Export("lock")
	Object lock;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -587598223
	)
	@Export("index")
	int index;
	@ObfuscatedName("t")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("i")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("o")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class227.method4180(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		signature = "(Lhq;IIZS)V",
		garbageValue = "338"
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
			var0.width = var0.height * var0.field2622 / var0.field2623;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.field2623 * var0.width / var0.field2622;
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
