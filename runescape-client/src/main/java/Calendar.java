import java.util.Iterator;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("ai")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("aj")
	@Export("DAYS_OF_THE_WEEK")
	static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("ac")
	@Export("Calendar_calendar")
	static java.util.Calendar Calendar_calendar;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1387454405
	)
	static int field3789;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}}; // L: 8
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // L: 18
		java.util.Calendar.getInstance(); // L: 22
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT")); // L: 23
	} // L: 24

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1038703491"
	)
	static boolean method6622(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public static void method6618(int var0) {
		if (!class305.field3397.isEmpty()) { // L: 82
			Iterator var1 = class305.field3397.iterator(); // L: 83

			while (var1.hasNext()) {
				class317 var2 = (class317)var1.next(); // L: 84
				if (var2 != null) { // L: 86
					var2.field3517 = var0; // L: 89
				}
			}

			class317 var3 = (class317)class305.field3397.get(0); // L: 92
			if (var3 != null && var3.field3511 != null && var3.field3511.isReady() && !var3.field3516) { // L: 93
				var3.field3511.setPcmStreamVolume(var0); // L: 94
				var3.field3512 = (float)var0; // L: 95
			}
		}

	} // L: 98

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1981391583"
	)
	public static int method6620(int var0) {
		--var0; // L: 63
		var0 |= var0 >>> 1; // L: 64
		var0 |= var0 >>> 2; // L: 65
		var0 |= var0 >>> 4; // L: 66
		var0 |= var0 >>> 8; // L: 67
		var0 |= var0 >>> 16; // L: 68
		return var0 + 1; // L: 69
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "61"
	)
	static final boolean method6621() {
		return Client.isMenuOpen; // L: 9155
	}
}
