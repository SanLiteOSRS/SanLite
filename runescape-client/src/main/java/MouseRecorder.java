import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bb")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -1626344665
	)
	@Export("port1")
	static int port1;
	@ObfuscatedName("n")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("v")
	@Export("lock")
	Object lock;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1370756697
	)
	@Export("index")
	int index;
	@ObfuscatedName("c")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("y")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("h")
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
		for (; this.isRunning; ApproximateRouteStrategy.method1311(50L)) {
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
}
