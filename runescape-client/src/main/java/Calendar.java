import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("aw")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("ay")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("ar")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("fontBold12")
	static Font fontBold12;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}}; // L: 8
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // L: 18
		java.util.Calendar.getInstance(); // L: 22
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT")); // L: 23
	} // L: 24

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljo;IIIII)Z",
		garbageValue = "-596982918"
	)
	static final boolean method6619(Model var0, int var1, int var2, int var3, int var4) {
		if (!AttackOption.method2669()) { // L: 146
			return false;
		} else {
			class11.method105(); // L: 147
			class232 var5 = (class232)var0.field2709.get(var1); // L: 148
			int var6 = var2 + var5.field2608; // L: 149
			int var7 = var3 + var5.field2606; // L: 150
			int var8 = var4 + var5.field2605; // L: 151
			int var9 = var5.field2607; // L: 152
			int var10 = var5.field2609; // L: 153
			int var11 = var5.field2610; // L: 154
			int var12 = ViewportMouse.field2754 - var6; // L: 155
			int var13 = ViewportMouse.field2755 - var7; // L: 156
			int var14 = class151.field1693 - var8; // L: 157
			if (Math.abs(var12) > var9 + class90.field1109) { // L: 158
				return false; // L: 159
			} else if (Math.abs(var13) > var10 + class136.field1606) { // L: 161
				return false; // L: 162
			} else if (Math.abs(var14) > var11 + class387.field4437) { // L: 164
				return false; // L: 165
			} else if (Math.abs(var14 * ViewportMouse.field2756 - var13 * class133.field1593) > var10 * class387.field4437 + var11 * class136.field1606) { // L: 167
				return false; // L: 168
			} else if (Math.abs(var12 * class133.field1593 - var14 * class538.field5228) > var11 * class90.field1109 + var9 * class387.field4437) { // L: 170
				return false; // L: 171
			} else {
				return Math.abs(var13 * class538.field5228 - var12 * ViewportMouse.field2756) <= var9 * class136.field1606 + var10 * class90.field1109; // L: 173
			}
		}
	}
}
