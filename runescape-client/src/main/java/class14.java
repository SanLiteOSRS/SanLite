import java.awt.FontMetrics;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class14 {
	@ObfuscatedName("bn")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -965260769
	)
	final int field82;
	@ObfuscatedName("ay")
	final String field74;
	@ObfuscatedName("ar")
	final ThreadFactory field75;
	@ObfuscatedName("am")
	final ThreadPoolExecutor field76;

	public class14(String var1, int var2, int var3) {
		this.field74 = var1; // L: 15
		this.field82 = var2; // L: 16
		this.field75 = new class16(this); // L: 17
		this.field76 = this.method183(var3); // L: 18
	} // L: 19

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-936222323"
	)
	final ThreadPoolExecutor method183(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field82), this.field75); // L: 22
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Laq;I)Lad;",
		garbageValue = "1690553514"
	)
	public class18 method182(class10 var1) {
		if (this.field76.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field76.getCorePoolSize() + " Queue capacity " + this.field82); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field76.submit(new class19(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1652727695"
	)
	public final void method184() {
		try {
			this.field76.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("ay")
	public static double method190(double var0, double var2, double var4) {
		return class133.method3042((var0 - var2) / var4) / var4; // L: 13
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1748832285"
	)
	static String method186() {
		String var0;
		if (class150.clientPreferences.method2467()) { // L: 255
			String var2 = Login.Login_username; // L: 257
			int var4 = var2.length(); // L: 260
			char[] var5 = new char[var4]; // L: 262

			for (int var6 = 0; var6 < var4; ++var6) { // L: 263
				var5[var6] = '*';
			}

			String var3 = new String(var5); // L: 264
			var0 = var3; // L: 268
		} else {
			var0 = Login.Login_username; // L: 270
		}

		return var0; // L: 271
	}
}
