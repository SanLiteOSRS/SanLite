import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class14 {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1905963157
	)
	final int field75;
	@ObfuscatedName("an")
	final String field76;
	@ObfuscatedName("aw")
	final ThreadFactory field81;
	@ObfuscatedName("ac")
	final ThreadPoolExecutor field80;

	public class14(String var1, int var2, int var3) {
		this.field76 = var1; // L: 15
		this.field75 = var2; // L: 16
		this.field81 = new class16(this); // L: 17
		this.field80 = this.method178(var3); // L: 18
	} // L: 19

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "140913775"
	)
	final ThreadPoolExecutor method178(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field75), this.field81); // L: 22
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lay;B)Lam;",
		garbageValue = "1"
	)
	public class18 method179(class10 var1) {
		if (this.field80.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field80.getCorePoolSize() + " Queue capacity " + this.field75); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field80.submit(new class19(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "537635380"
	)
	public final void method181() {
		try {
			this.field80.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lek;FB)F",
		garbageValue = "88"
	)
	static float method191(class125 var0, float var1) {
		if (var0 == null) { // L: 164
			return 0.0F; // L: 165
		} else {
			float var2 = var1 - var0.field1513; // L: 167
			return var0.field1518 + var2 * (var0.field1529 + var2 * (var0.field1515 * var2 + var0.field1516)); // L: 168
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CIB)Ljava/lang/String;",
		garbageValue = "0"
	)
	static String method190(char var0, int var1) {
		char[] var2 = new char[var1]; // L: 177

		for (int var3 = 0; var3 < var1; ++var3) { // L: 178
			var2[var3] = var0;
		}

		return new String(var2); // L: 179
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-729068470"
	)
	public static void method188() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 429
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 430
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 431
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 432
	} // L: 433

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2038496653"
	)
	static void method187(int var0) {
		class129.method3124(14); // L: 2198
		Login.field898 = var0; // L: 2199
	} // L: 2200

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-153055855"
	)
	static final void method180(boolean var0) {
		if (var0) { // L: 2828
			Client.field526 = Login.field914 ? class135.field1615 : class135.field1617; // L: 2829
		} else {
			Client.field526 = class20.clientPreferences.method2456(Login.Login_username) ? class135.field1618 : class135.field1621; // L: 2832
		}

	} // L: 2834
}
