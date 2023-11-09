import java.lang.management.GarbageCollectorMXBean;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class14 {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -396632509
	)
	static int field79;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("ab")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2124628423
	)
	final int field82;
	@ObfuscatedName("w")
	final String field73;
	@ObfuscatedName("v")
	final ThreadFactory field74;
	@ObfuscatedName("s")
	final ThreadPoolExecutor field76;

	public class14(String var1, int var2, int var3) {
		this.field73 = var1; // L: 15
		this.field82 = var2; // L: 16
		this.field74 = new class16(this); // L: 17
		this.field76 = this.method181(var3); // L: 18
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-101"
	)
	final ThreadPoolExecutor method181(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field82), this.field74); // L: 22
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lc;B)Lu;",
		garbageValue = "51"
	)
	public class18 method187(class10 var1) {
		if (this.field76.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field76.getCorePoolSize() + " Queue capacity " + this.field82); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field76.submit(new class19(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2009487114"
	)
	public final void method183() {
		try {
			this.field76.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "157315254"
	)
	static final void method182(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 80
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 81
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 82
					Tiles.field1013[0][var5][var4] = 127; // L: 83
					if (var0 == var5 && var5 > 0) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 87
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 91
}
