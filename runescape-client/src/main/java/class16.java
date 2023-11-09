import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class class16 implements ThreadFactory {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lry;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("a")
	final ThreadGroup field84;
	@ObfuscatedName("f")
	final AtomicInteger field89;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field89 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field84 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field84, var1, this.this$0.field75 + "-rest-request-" + this.field89.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-49"
	)
	public static boolean method207(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 13
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "85"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		UserComparator8.method2744(var0, var1, var2, var3, var4, var5, -1, false); // L: 9888
	} // L: 9889

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "([Lkn;Lkn;ZB)V",
		garbageValue = "57"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 10873
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 10874
		WorldMapID.resizeInterface(var0, var1.id, var3, var4, var2); // L: 10875
		if (var1.children != null) { // L: 10876
			WorldMapID.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10877
		if (var5 != null) { // L: 10878
			int var6 = var5.group; // L: 10879
			if (WorldMapManager.loadInterface(var6)) { // L: 10881
				WorldMapID.resizeInterface(Widget.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 10882
			}
		}

		if (var1.contentType == 1337) { // L: 10885
		}

	} // L: 10886
}
