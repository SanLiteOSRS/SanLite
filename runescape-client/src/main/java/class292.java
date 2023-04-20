import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@lj
@ObfuscatedName("lu")
public final class class292 {
	@ObfuscatedName("aw")
	static final HashMap field3358;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static IndexedSprite field3361;

	static {
		field3358 = new HashMap(); // L: 11
		java.util.Calendar.getInstance(method5717("Europe/London")); // L: 14
	} // L: 15

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "-1017888567"
	)
	static TimeZone method5717(String var0) {
		synchronized(field3358) { // L: 22
			TimeZone var2 = (TimeZone)field3358.get(var0); // L: 23
			if (var2 == null) { // L: 24
				var2 = TimeZone.getTimeZone(var0); // L: 25
				field3358.put(var0, var2); // L: 26
			}

			return var2; // L: 28
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-964267539"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}
}
