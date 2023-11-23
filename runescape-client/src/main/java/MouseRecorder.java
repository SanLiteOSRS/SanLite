import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("at")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ah")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 635201825
	)
	@Export("index")
	int index;
	@ObfuscatedName("ao")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ab")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("au")
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
		for (; this.isRunning; class219.method4260(50L)) { // L: 18 27
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-43"
	)
	public static int method2372(int var0) {
		class139 var2 = (class139)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 349
		class139 var1;
		if (var2 != null) { // L: 350
			var1 = var2; // L: 351
		} else {
			var2 = Login.method2197(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 354
			if (var2 != null) { // L: 355
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			var1 = var2; // L: 356
		}

		if (var1 == null) { // L: 359
			return 2; // L: 360
		} else {
			return var1.method3164() ? 0 : 1; // L: 362
		}
	}
}
