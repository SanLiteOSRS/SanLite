import java.util.BitSet;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class334 extends Node {
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		longValue = 155512667722674415L
	)
	static long field3609;
	@ObfuscatedName("ac")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -857450415
	)
	int field3604;
	@ObfuscatedName("aw")
	BitSet field3606;

	class334(int var1) {
		this.field3604 = var1; // L: 11
		this.field3606 = new BitSet(128); // L: 12
	} // L: 13

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IIILdz;B)V",
		garbageValue = "-39"
	)
	static void method6394(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) { // L: 3770
			if (var0.field2255 != null && var0.field2255.containsKey(var1)) { // L: 3771
				class202 var5 = (class202)var0.field2255.get(var1); // L: 3772
				if (var5 != null) {
					int var6 = var5.field2109 & 31; // L: 3774
					if ((var6 <= 0 || class30.clientPreferences.method2572() != 0) && (var6 != 0 || class30.clientPreferences.method2622() != 0)) { // L: 3775
						class94.method2453(var5, var2, var3, var4 == VarpDefinition.localPlayer); // L: 3776
					}
				}
			}
		}
	} // L: 3773 3777

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1890087459"
	)
	static void method6395(String var0) {
		class106.field1372 = var0; // L: 12805

		try {
			String var1 = class193.client.getParameter(Integer.toString(18)); // L: 12807
			String var2 = class193.client.getParameter(Integer.toString(13)); // L: 12808
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12809
			if (var0.length() == 0) { // L: 12810
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires="; // L: 12812
				long var6 = SecureRandomCallable.method2320() + 94608000000L; // L: 12814
				Calendar.Calendar_calendar.setTime(new Date(var6)); // L: 12816
				int var8 = Calendar.Calendar_calendar.get(7); // L: 12817
				int var9 = Calendar.Calendar_calendar.get(5); // L: 12818
				int var10 = Calendar.Calendar_calendar.get(2); // L: 12819
				int var11 = Calendar.Calendar_calendar.get(1); // L: 12820
				int var12 = Calendar.Calendar_calendar.get(11); // L: 12821
				int var13 = Calendar.Calendar_calendar.get(12); // L: 12822
				int var14 = Calendar.Calendar_calendar.get(13); // L: 12823
				String var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT"; // L: 12824
				var3 = var4 + var5 + "; Max-Age=" + 94608000L; // L: 12826
			}

			class26.method357(class193.client, "document.cookie=\"" + var3 + "\""); // L: 12828
		} catch (Throwable var15) { // L: 12830
		}

	} // L: 12831
}
