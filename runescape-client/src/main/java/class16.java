import java.util.Iterator;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class16 implements ThreadFactory {
	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("mouseWheel")
	static class158 mouseWheel;
	@ObfuscatedName("o")
	final ThreadGroup field93;
	@ObfuscatedName("q")
	final AtomicInteger field92;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lp;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field92 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field93 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field93, var1, this.this$0.field75 + "-rest-request-" + this.field92.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	static final void method214(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8368
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8369
				Client.field610[var4] = true;
			}
		}

	} // L: 8371

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "182"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 10935
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1811585689"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 12180

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 12181
			var1.clearIsFromIgnored(); // L: 12183
		}

		if (class13.friendsChatManager != null) { // L: 12187
			class13.friendsChatManager.invalidateIgnoreds(); // L: 12188
		}

	} // L: 12190
}
