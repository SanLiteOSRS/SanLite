import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class349 {
	@ObfuscatedName("fm")
	public static String field4010;
	@ObfuscatedName("ke")
	public static String field4052;
	@ObfuscatedName("kp")
	public static String field4128;
	@ObfuscatedName("kk")
	public static String field4146;

	static {
		field4010 = "Please visit the support page for assistance."; // L: 137
		field4052 = ""; // L: 285
		field4128 = "Page has opened in the browser."; // L: 286
		field4146 = ""; // L: 287
	} // L: 330

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-21"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}
}
