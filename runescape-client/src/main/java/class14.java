import java.lang.management.GarbageCollectorMXBean;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class class14 {
	@ObfuscatedName("bc")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1265131985
	)
	final int field71;
	@ObfuscatedName("aw")
	final String field66;
	@ObfuscatedName("al")
	final ThreadFactory field67;
	@ObfuscatedName("ai")
	final ThreadPoolExecutor field68;

	public class14(String var1, int var2, int var3) {
		this.field66 = var1; // L: 15
		this.field71 = var2; // L: 16
		this.field67 = new class16(this); // L: 17
		this.field68 = this.method157(var3); // L: 18
	} // L: 19

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "48"
	)
	final ThreadPoolExecutor method157(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field71), this.field67); // L: 22
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lak;B)Lad;",
		garbageValue = "-86"
	)
	public class18 method158(class10 var1) {
		if (this.field68.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field68.getCorePoolSize() + " Queue capacity " + this.field71); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field68.submit(new class19(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1870631406"
	)
	public final void method166() {
		try {
			this.field68.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26903"
	)
	public static void method165() {
		FloorUnderlayDefinition.field2052.clear(); // L: 82
	} // L: 83

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lng;Lnt;ZI)V",
		garbageValue = "-550444644"
	)
	public static void method161(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7; // L: 1053
		var0.field3774 = new PlayerComposition(var1); // L: 1054
		if (!var2) { // L: 1055
			var0.field3774.equipment = Arrays.copyOf(var0.field3774.field3666, var0.field3774.field3666.length); // L: 1056
			var0.field3774.method6477(); // L: 1057
		}

	} // L: 1059
}
