import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class410 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class406 field4535;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 338104621
	)
	int field4536;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1042725667
	)
	int field4537;

	@ObfuscatedSignature(
		descriptor = "(Lpv;II)V"
	)
	class410(class406 var1, int var2, int var3) {
		this.field4536 = 0; // L: 7
		this.field4537 = 0; // L: 8
		this.field4535 = var1; // L: 11
		this.field4536 = var2; // L: 12
		this.field4537 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2063026916"
	)
	public String method7775() {
		if (this.method7777()) { // L: 17
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7788()); // L: 18

			for (int var2 = this.field4536; var2 < this.field4537; ++var2) { // L: 19
				class408 var3 = this.field4535.method7552(var2); // L: 20
				var1.append(var3.field4509); // L: 21
			}

			return var1.toString(); // L: 23
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1949431779"
	)
	boolean method7774(int var1) {
		return this.field4535.method7549() == 2 || this.field4535.method7549() == 1 && (!this.field4535.field4499 || this.field4537 - 1 != var1); // L: 27
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "43"
	)
	public boolean method7777() {
		return this.field4537 == this.field4536; // L: 31
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "25"
	)
	public int method7788() {
		return this.field4537 - this.field4536; // L: 35
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpn;I)Z",
		garbageValue = "-1150378981"
	)
	boolean method7779(class408 var1) {
		if (this.field4535.field4505 == 2) { // L: 39
			return true;
		} else if (this.field4535.field4505 == 0) { // L: 40
			return false;
		} else {
			return this.field4535.method7572() != var1; // L: 41
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "128"
	)
	int method7776() {
		if (this.method7777()) { // L: 46
			return 0;
		} else {
			class408 var1 = this.field4535.method7552(this.field4537 - 1); // L: 47
			if (var1.field4509 == '\n') { // L: 48
				return 0;
			} else if (this.method7779(var1)) { // L: 49
				return this.field4535.field4489.advances[42];
			} else {
				int var2 = this.field4535.field4489.advances[var1.field4509]; // L: 50
				if (var2 == 0) { // L: 51
					return var1.field4509 == '\t' ? this.field4535.field4489.advances[32] * 3 : this.field4535.field4489.advances[32]; // L: 52 53 56
				} else {
					return var2; // L: 60
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lti;",
		garbageValue = "-1126162265"
	)
	public class497 method7793() {
		if (this.method7777()) { // L: 65
			return new class497(0, 0); // L: 66
		} else {
			class408 var1 = this.field4535.method7552(this.field4537 - 1); // L: 68
			return new class497(var1.field4508 + this.method7776(), var1.field4507); // L: 69
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lpn;",
		garbageValue = "262474299"
	)
	public class408 method7782(int var1) {
		return var1 >= 0 && var1 < this.method7788() ? this.field4535.method7552(this.field4536 + var1) : null; // L: 73 74
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-127"
	)
	public static final void method7802() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 95
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 96
	} // L: 97

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1487231086"
	)
	static void method7801(String var0) {
		MenuAction.field878 = var0; // L: 12794

		try {
			String var1 = SpriteMask.client.getParameter(Integer.toString(18)); // L: 12796
			String var2 = SpriteMask.client.getParameter(Integer.toString(13)); // L: 12797
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12798
			if (var0.length() == 0) { // L: 12799
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires="; // L: 12801
				long var6 = SpotAnimationDefinition.method3775() + 94608000000L; // L: 12803
				Calendar.Calendar_calendar.setTime(new Date(var6)); // L: 12805
				int var8 = Calendar.Calendar_calendar.get(7); // L: 12806
				int var9 = Calendar.Calendar_calendar.get(5); // L: 12807
				int var10 = Calendar.Calendar_calendar.get(2); // L: 12808
				int var11 = Calendar.Calendar_calendar.get(1); // L: 12809
				int var12 = Calendar.Calendar_calendar.get(11); // L: 12810
				int var13 = Calendar.Calendar_calendar.get(12); // L: 12811
				int var14 = Calendar.Calendar_calendar.get(13); // L: 12812
				String var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT"; // L: 12813
				var3 = var4 + var5 + "; Max-Age=" + 94608000L; // L: 12815
			}

			class26.method402(SpriteMask.client, "document.cookie=\"" + var3 + "\""); // L: 12817
		} catch (Throwable var15) { // L: 12819
		}

	} // L: 12820
}
