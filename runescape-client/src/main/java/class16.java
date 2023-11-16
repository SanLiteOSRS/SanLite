import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public class class16 implements ThreadFactory {
	@ObfuscatedName("at")
	final ThreadGroup field70;
	@ObfuscatedName("ah")
	final AtomicInteger field72;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lay;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field72 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field70 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field70, var1, this.this$0.field63 + "-rest-request-" + this.field72.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}
}
