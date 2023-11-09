import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ai")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("aj")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2017242907
	)
	@Export("index")
	int index;
	@ObfuscatedName("aw")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ay")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ap")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class9.method82(50L)) {
			synchronized(this.lock) { // L: 19
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("ai")
	public static final int method2319(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var4 + var2 - var4 * var2; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = 0.3333333333333333D + var0; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = var14 + 6.0D * (var12 - var14) * var16;
			} else if (var16 * 2.0D < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = (var12 - var14) * (0.6666666666666666D - var16) * 6.0D + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (6.0D * var0 < 1.0D) { // L: 26
				var8 = var0 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D; // L: 28
			} else {
				var8 = var14; // L: 29
			}

			if (6.0D * var20 < 1.0D) { // L: 30
				var10 = (var12 - var14) * 6.0D * var20 + var14;
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = 6.0D * (0.6666666666666666D - var20) * (var12 - var14) + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(var6 * 256.0D); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(var10 * 256.0D); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2070450334"
	)
	public static boolean method2320() {
		return Client.staffModLevel >= 2; // L: 12778
	}
}
