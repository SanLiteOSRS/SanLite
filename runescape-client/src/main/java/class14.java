import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class14 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 203256037
	)
	final int field74;
	@ObfuscatedName("f")
	final String field75;
	@ObfuscatedName("c")
	final ThreadFactory field76;
	@ObfuscatedName("x")
	final ThreadPoolExecutor field77;

	public class14(String var1, int var2, int var3) {
		this.field75 = var1; // L: 15
		this.field74 = var2; // L: 16
		this.field76 = new class16(this); // L: 17
		this.field77 = this.method175(var3); // L: 18
	} // L: 19

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-2034983121"
	)
	final ThreadPoolExecutor method175(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field74), this.field76); // L: 22
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ll;I)Lm;",
		garbageValue = "-615768201"
	)
	public class19 method174(class10 var1) {
		if (this.field77.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field77.getCorePoolSize() + " Queue capacity " + this.field74); // L: 27
			return new class19("Queue full"); // L: 28
		} else {
			class19 var2 = new class19(this.field77.submit(new class20(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "926753526"
	)
	public final void method173() {
		try {
			this.field77.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldq;",
		garbageValue = "1528264527"
	)
	static class126[] method178() {
		return new class126[]{class126.field1519, class126.field1529, class126.field1514, class126.field1525, class126.field1512, class126.field1517, class126.field1518, class126.field1513, class126.field1520, class126.field1524, class126.field1522, class126.field1523, class126.field1515, class126.field1528, class126.field1526, class126.field1532, class126.field1527}; // L: 64
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-108"
	)
	public static int method177(int var0) {
		return GroundObject.method4136(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 72
	}
}
