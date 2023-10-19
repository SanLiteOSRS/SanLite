import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("ac")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("al")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("ak")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}}; // L: 8
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // L: 18
		java.util.Calendar.getInstance(); // L: 22
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT")); // L: 23
	} // L: 24

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnp;",
		garbageValue = "1714112630"
	)
	public static StudioGame[] method6760() {
		return new StudioGame[]{StudioGame.game3, StudioGame.game5, StudioGame.runescape, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.game4}; // L: 17
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1782569305"
	)
	public static void method6761(boolean var0) {
		if (var0 != HealthBarUpdate.ItemComposition_inMembersWorld) { // L: 576
			class315.method5904(); // L: 577
			HealthBarUpdate.ItemComposition_inMembersWorld = var0; // L: 578
		}

	} // L: 580
}
