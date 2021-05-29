import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -641330339
	)
	public int field3828;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("f")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lly;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3828 = (int)(ObjectComposition.currentTimeMillis() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1148380845"
	)
	static void method5690(String var0) {
		class363.field4079 = var0;

		try {
			String var1 = class23.client.getParameter(Integer.toString(18));
			String var2 = class23.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = ObjectComposition.currentTimeMillis() + 94608000000L;
				Calendar.Calendar_calendar.setTime(new Date(var6));
				int var8 = Calendar.Calendar_calendar.get(7);
				int var9 = Calendar.Calendar_calendar.get(5);
				int var10 = Calendar.Calendar_calendar.get(2);
				int var11 = Calendar.Calendar_calendar.get(1);
				int var12 = Calendar.Calendar_calendar.get(11);
				int var13 = Calendar.Calendar_calendar.get(12);
				int var14 = Calendar.Calendar_calendar.get(13);
				String var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
				var3 = var4 + var5 + "; Max-Age=" + 94608000L;
			}

			class42.method420(class23.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var15) {
		}

	}
}
