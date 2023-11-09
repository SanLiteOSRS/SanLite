import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class16 implements ThreadFactory {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[[Lmb;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("at")
	final ThreadGroup field81;
	@ObfuscatedName("an")
	final AtomicInteger field79;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lac;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field79 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field81 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field81, var1, this.this$0.field69 + "-rest-request-" + this.field79.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)Ljava/lang/String;",
		garbageValue = "100"
	)
	public static String method218(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 25
			if (var2 > 32767) { // L: 26
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 27
			var0.offset += class332.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 28
			String var4 = MusicPatchNode2.decodeStringCp1252(var3, 0, var2); // L: 29
			var1 = var4; // L: 30
		} catch (Exception var6) { // L: 32
			var1 = "Cabbage"; // L: 33
		}

		return var1; // L: 36
	}
}
