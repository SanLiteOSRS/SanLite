import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("br")
public class class56 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "1",
		signature = "(Ljava/applet/Applet;Ljava/lang/String;B)V"
	)
	public static void method928(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "1531534394",
		signature = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;"
	)
	public static Object method923(Applet var0, String var1, Object[] var2) throws Throwable {
		return JSObject.getWindow(var0).call(var1, var2);
	}
}
