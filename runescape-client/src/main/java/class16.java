import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class16 implements ThreadFactory {
	@ObfuscatedName("am")
	final ThreadGroup field72;
	@ObfuscatedName("ap")
	final AtomicInteger field69;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Law;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field69 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field72 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field72, var1, this.this$0.field55 + "-rest-request-" + this.field69.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-507831292"
	)
	static boolean method220() {
		return (Client.drawPlayerNames & 2) != 0; // L: 5155
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	static void method219() {
		Client.menuOptionsCount = 0; // L: 9104
		Client.isMenuOpen = false; // L: 9105
	} // L: 9106

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "([Lnn;Lnn;ZI)V",
		garbageValue = "1410391386"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 11001
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 11002
		class428.resizeInterface(var0, var1.id, var3, var4, var2); // L: 11003
		if (var1.children != null) {
			class428.resizeInterface(var1.children, var1.id, var3, var4, var2); // L: 11004
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 11005
		if (var5 != null) { // L: 11006
			int var6 = var5.group; // L: 11007
			if (class380.field4414.method6357(var6)) { // L: 11009
				class428.resizeInterface(class380.field4414.field3610[var6], -1, var3, var4, var2); // L: 11010
			}
		}

		if (var1.contentType == 1337) { // L: 11013
		}

	} // L: 11014
}
