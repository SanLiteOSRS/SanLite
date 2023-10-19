import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
public class class366 {
	@ObfuscatedName("fz")
	public static String field4000;
	@ObfuscatedName("kv")
	public static String field4188;
	@ObfuscatedName("kx")
	public static String field4024;
	@ObfuscatedName("kt")
	public static String field4213;

	static {
		field4000 = "Please visit the support page for assistance."; // L: 137
		field4188 = ""; // L: 284
		field4024 = "Page has opened in the browser."; // L: 285
		field4213 = ""; // L: 286
	} // L: 330

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "5563087"
	)
	public static boolean method6819() {
		if (!class319.field3435.isEmpty()) { // L: 118
			return true; // L: 119
		} else {
			return !class319.field3433.isEmpty() && class319.field3433.get(0) != null && ((class331)class319.field3433.get(0)).field3538 != null ? ((class331)class319.field3433.get(0)).field3538.isReady() : false; // L: 121 122 124
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lni;ZB)V",
		garbageValue = "-63"
	)
	public static void method6820(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7; // L: 1047
		var0.field3734 = new PlayerComposition(var1); // L: 1048
		if (!var2) { // L: 1049
			var0.field3734.equipment = Arrays.copyOf(var0.field3734.field3619, var0.field3734.field3619.length); // L: 1050
			var0.field3734.method6291(); // L: 1051
		}

	} // L: 1053
}
