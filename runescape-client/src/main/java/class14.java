import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class14 {
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 721426513
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2075666285
	)
	final int field57;
	@ObfuscatedName("ap")
	final String field55;
	@ObfuscatedName("af")
	final ThreadFactory field56;
	@ObfuscatedName("aj")
	final ThreadPoolExecutor field58;

	public class14(String var1, int var2, int var3) {
		this.field55 = var1; // L: 15
		this.field57 = var2; // L: 16
		this.field56 = new class16(this); // L: 17
		this.field58 = this.method187(var3); // L: 18
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "6509"
	)
	final ThreadPoolExecutor method187(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field57), this.field56); // L: 22
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lau;B)Lay;",
		garbageValue = "-79"
	)
	public class18 method180(class10 var1) {
		if (this.field58.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field58.getCorePoolSize() + " Queue capacity " + this.field57); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field58.submit(new class19(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6524"
	)
	public final void method181() {
		try {
			this.field58.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljo;",
		garbageValue = "567576594"
	)
	static WorldMapSprite method182(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class181.method3691(var0).pixels); // L: 19 20
	}
}
