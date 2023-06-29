import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("nb")
public enum class350 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field4190(-1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field4195(0),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field4192(1),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field4193(2);

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1585725759
	)
	final int field4191;

	class350(int var3) {
		this.field4191 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4191; // L: 20
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(B)Lil;",
		garbageValue = "0"
	)
	public static class211 method6624() {
		return Client.field739; // L: 1050
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-21759"
	)
	static void method6623(String var0) {
		class443.field4710 = var0; // L: 12664

		try {
			String var1 = class347.client.getParameter(Integer.toString(18)); // L: 12666
			String var2 = class347.client.getParameter(Integer.toString(13)); // L: 12667
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12668
			if (var0.length() == 0) { // L: 12669
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + HorizontalAlignment.method3685(WallObject.method5027() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 12670
			}

			Client var4 = class347.client; // L: 12671
			String var5 = "document.cookie=\"" + var3 + "\""; // L: 12672
			JSObject.getWindow(var4).eval(var5); // L: 12675
		} catch (Throwable var6) { // L: 12678
		}

	} // L: 12679
}
