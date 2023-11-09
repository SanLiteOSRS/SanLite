import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class class238 {
	@ObfuscatedName("am")
	public static short[][] field2690;
	@ObfuscatedName("uv")
	@ObfuscatedGetter(
		intValue = -113360896
	)
	static int field2688;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1918265189"
	)
	static void method4845() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	static final int method4844() {
		return ViewportMouse.ViewportMouse_x; // L: 87
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "47"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		StructComposition.method3990(var0, var1, var2, var3, var4, var5, -1, false); // L: 10179
	} // L: 10180

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "([Lme;Lme;ZI)V",
		garbageValue = "-895573281"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 11051
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 11052
		SecureRandomFuture.resizeInterface(var0, var1.id, var3, var4, var2); // L: 11053
		if (var1.children != null) {
			SecureRandomFuture.resizeInterface(var1.children, var1.id, var3, var4, var2); // L: 11054
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 11055
		if (var5 != null) { // L: 11056
			ModeWhere.method7028(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) { // L: 11057
		}

	} // L: 11058

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-386562828"
	)
	static void method4846(String var0) {
		class138.field1604 = var0; // L: 12722

		try {
			String var1 = class415.client.getParameter(Integer.toString(18)); // L: 12724
			String var2 = class415.client.getParameter(Integer.toString(13)); // L: 12725
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12726
			if (var0.length() == 0) { // L: 12727
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class301.method5775(AttackOption.method2714() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 12728
			}

			class26.method402(class415.client, "document.cookie=\"" + var3 + "\""); // L: 12729
		} catch (Throwable var4) { // L: 12731
		}

	} // L: 12732
}
