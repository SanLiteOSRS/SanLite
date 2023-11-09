import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
public final class class450 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lrj;"
	)
	static class450[] field4734;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 283410239
	)
	static int field4738;
	@ObfuscatedName("am")
	float field4736;
	@ObfuscatedName("as")
	float field4733;
	@ObfuscatedName("aj")
	float field4737;
	@ObfuscatedName("ag")
	float field4735;

	static {
		field4734 = new class450[0]; // L: 4
		WorldMapManager.method5354(100); // L: 9
		new class450();
	} // L: 14

	class450() {
		this.method8223(); // L: 44
	} // L: 45

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "720031596"
	)
	public void method8224() {
		synchronized(field4734) { // L: 38
			if (class344.field3852 < field4738 - 1) { // L: 39
				field4734[++class344.field3852 - 1] = this;
			}

		}
	} // L: 41

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "646629181"
	)
	void method8221(float var1, float var2, float var3, float var4) {
		this.field4736 = var1; // L: 48
		this.field4733 = var2; // L: 49
		this.field4737 = var3; // L: 50
		this.field4735 = var4; // L: 51
	} // L: 52

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-806476274"
	)
	public void method8222(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 55
		float var6 = (float)Math.cos((double)(var4 * 0.5F)); // L: 56
		this.field4736 = var5 * var1; // L: 57
		this.field4733 = var2 * var5; // L: 58
		this.field4737 = var3 * var5; // L: 59
		this.field4735 = var6; // L: 60
	} // L: 61

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "407146638"
	)
	final void method8223() {
		this.field4737 = 0.0F; // L: 64
		this.field4733 = 0.0F; // L: 65
		this.field4736 = 0.0F; // L: 66
		this.field4735 = 1.0F; // L: 67
	} // L: 68

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrj;S)V",
		garbageValue = "-7868"
	)
	public final void method8228(class450 var1) {
		this.method8221(this.field4736 * var1.field4735 + this.field4735 * var1.field4736 + var1.field4733 * this.field4737 - this.field4733 * var1.field4737, this.field4735 * var1.field4733 + (var1.field4735 * this.field4733 - var1.field4736 * this.field4737) + this.field4736 * var1.field4737, var1.field4736 * this.field4733 + this.field4737 * var1.field4735 - var1.field4733 * this.field4736 + var1.field4737 * this.field4735, var1.field4735 * this.field4735 - this.field4736 * var1.field4736 - this.field4733 * var1.field4733 - this.field4737 * var1.field4737); // L: 71
	} // L: 72

	public boolean equals(Object var1) {
		if (!(var1 instanceof class450)) { // L: 76
			return false; // L: 80
		} else {
			class450 var2 = (class450)var1; // L: 77
			return var2.field4736 == this.field4736 && this.field4733 == var2.field4733 && var2.field4737 == this.field4737 && var2.field4735 == this.field4735; // L: 78
		}
	}

	public int hashCode() {
		boolean var1 = true; // L: 85
		float var2 = 1.0F; // L: 86
		var2 = this.field4736 + var2 * 31.0F; // L: 87
		var2 = this.field4733 + var2 * 31.0F; // L: 88
		var2 = this.field4737 + 31.0F * var2; // L: 89
		var2 = var2 * 31.0F + this.field4735; // L: 90
		return (int)var2; // L: 91
	}

	public String toString() {
		return this.field4736 + "," + this.field4733 + "," + this.field4737 + "," + this.field4735; // L: 96
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "568233292"
	)
	static void method8229(String var0) {
		class36.field263 = var0; // L: 12761

		try {
			String var1 = TileItem.client.getParameter(Integer.toString(18)); // L: 12763
			String var2 = TileItem.client.getParameter(Integer.toString(13)); // L: 12764
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12765
			if (var0.length() == 0) { // L: 12766
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires="; // L: 12768
				long var6 = class113.method2835() + 94608000000L; // L: 12770
				Calendar.Calendar_calendar.setTime(new Date(var6)); // L: 12772
				int var8 = Calendar.Calendar_calendar.get(7); // L: 12773
				int var9 = Calendar.Calendar_calendar.get(5); // L: 12774
				int var10 = Calendar.Calendar_calendar.get(2); // L: 12775
				int var11 = Calendar.Calendar_calendar.get(1); // L: 12776
				int var12 = Calendar.Calendar_calendar.get(11); // L: 12777
				int var13 = Calendar.Calendar_calendar.get(12); // L: 12778
				int var14 = Calendar.Calendar_calendar.get(13); // L: 12779
				String var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT"; // L: 12780
				var3 = var4 + var5 + "; Max-Age=" + 94608000L; // L: 12782
			}

			class26.method381(TileItem.client, "document.cookie=\"" + var3 + "\""); // L: 12784
		} catch (Throwable var15) { // L: 12786
		}

	} // L: 12787
}
