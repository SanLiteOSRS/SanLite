import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class16 implements ThreadFactory {
	@ObfuscatedName("aw")
	final ThreadGroup field85;
	@ObfuscatedName("ay")
	final AtomicInteger field86;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Laa;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field86 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field85 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field85, var1, this.this$0.field74 + "-rest-request-" + this.field86.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-1561438911"
	)
	static Date method215() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1083
		var0.setLenient(false); // L: 1084
		StringBuilder var1 = new StringBuilder(); // L: 1085
		String[] var2 = Login.field953; // L: 1087

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1088
			String var4 = var2[var3]; // L: 1089
			if (var4 == null) { // L: 1091
				class328.method6115(7); // L: 1093
				Actor.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1094
				return null; // L: 1096
			}

			var1.append(var4); // L: 1098
		}

		var1.append("12"); // L: 1102
		return var0.parse(var1.toString()); // L: 1103
	}
}
