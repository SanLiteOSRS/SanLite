import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dt")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 1283573311
	)
	static int field1105;
	@ObfuscatedName("au")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ae")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1540170903
	)
	@Export("index")
	int index;
	@ObfuscatedName("at")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ac")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ai")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; PendingSpawn.method2365(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29
}
