import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("lr")
public class class316 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static final class316 field3724;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static final class316 field3725;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 775704293
	)
	final int field3726;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -152632739
	)
	final int field3727;

	static {
		field3724 = new class316(51, 27, 800, 0, 16, 16); // L: 33
		field3725 = new class316(25, 28, 800, 656, 40, 40); // L: 34
	}

	class316(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3726 = var5; // L: 39
		this.field3727 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-114144397"
	)
	static void method6251(String var0) {
		DynamicObject.field974 = var0; // L: 12647

		try {
			String var1 = ClanChannelMember.client.getParameter(Integer.toString(18)); // L: 12649
			String var2 = ClanChannelMember.client.getParameter(Integer.toString(13)); // L: 12650
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12651
			if (var0.length() == 0) { // L: 12652
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class295.method5712(UserComparator8.method2748() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 12653
			}

			Client var4 = ClanChannelMember.client; // L: 12654
			String var5 = "document.cookie=\"" + var3 + "\""; // L: 12655
			JSObject.getWindow(var4).eval(var5); // L: 12658
		} catch (Throwable var6) { // L: 12661
		}

	} // L: 12662
}
