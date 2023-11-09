import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("by")
public class class26 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
		garbageValue = "90"
	)
	public static void method392(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1); // L: 13
	} // L: 14

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;",
		garbageValue = "-43"
	)
	public static Object method393(Applet var0, String var1) throws Throwable {
		return JSObject.getWindow(var0).call(var1, (Object[])null); // L: 17
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-1806937261"
	)
	public static Object method394(Applet var0, String var1, Object[] var2) throws Throwable {
		return JSObject.getWindow(var0).call(var1, var2); // L: 21
	}
}
