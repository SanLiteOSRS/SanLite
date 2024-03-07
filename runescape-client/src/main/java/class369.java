import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public class class369 {
	@ObfuscatedName("fi")
	public static String field4010;
	@ObfuscatedName("kd")
	public static String field4272;
	@ObfuscatedName("kh")
	public static String field4088;
	@ObfuscatedName("kp")
	public static String field4274;

	static {
		field4010 = "Please visit the support page for assistance."; // L: 136
		field4272 = ""; // L: 286
		field4088 = "Page has opened in the browser."; // L: 287
		field4274 = ""; // L: 288
	} // L: 332

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "77792910"
	)
	static void method7013(int var0, int var1) {
		MenuAction var2 = class363.tempMenuAction; // L: 12225
		if (var2 != null) { // L: 12227
			ReflectionCheck.method661(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.field928, var2.field931, var2.field930, var0, var1); // L: 12228
		}

		class363.tempMenuAction = null; // L: 12231
	} // L: 12232
}
