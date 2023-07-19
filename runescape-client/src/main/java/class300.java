import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@mx
@ObfuscatedName("ln")
public final class class300 {
	@ObfuscatedName("ac")
	static final HashMap field3366;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1351022923
	)
	static int field3367;

	static {
		field3366 = new HashMap(); // L: 11
		java.util.Calendar.getInstance(method5770("Europe/London")); // L: 14
	} // L: 15

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "1047288861"
	)
	static TimeZone method5770(String var0) {
		synchronized(field3366) { // L: 22
			TimeZone var2 = (TimeZone)field3366.get(var0); // L: 23
			if (var2 == null) { // L: 24
				var2 = TimeZone.getTimeZone(var0); // L: 25
				field3366.put(var0, var2); // L: 26
			}

			return var2; // L: 28
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "16"
	)
	static final String method5771(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*"; // L: 11169 11170
	}
}
