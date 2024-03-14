import java.util.Date;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class16 implements ThreadFactory {
	@ObfuscatedName("aq")
	final ThreadGroup field77;
	@ObfuscatedName("aw")
	final AtomicInteger field76;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field76 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field77 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field77, var1, this.this$0.field66 + "-rest-request-" + this.field76.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "1028466501"
	)
	static Date method192() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1207
		var0.set(2, 0); // L: 1208
		var0.set(5, 1); // L: 1209
		var0.set(1, 1900); // L: 1210
		return var0.getTime(); // L: 1211
	}
}
