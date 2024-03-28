import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("nx")
public class class360 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-627141573"
	)
	static boolean method6859(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 54
			try {
				if (!class31.field150.startsWith("win")) { // L: 56
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 57
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 58

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 59
						if (var14.indexOf(var0.charAt(var4)) == -1) { // L: 60
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 62
					return true; // L: 63
				}
			} catch (Throwable var8) { // L: 65
				return false; // L: 66
			}
		} else if (var1 == 1) { // L: 69
			try {
				Applet var7 = class31.field153; // L: 72
				Object[] var5 = new Object[]{(new URL(class31.field153.getCodeBase(), var0)).toString()}; // L: 73
				Object var13 = JSObject.getWindow(var7).call(var2, var5); // L: 76
				return var13 != null; // L: 79
			} catch (Throwable var9) { // L: 81
				return false; // L: 82
			}
		} else if (var1 == 2) { // L: 85
			try {
				class31.field153.getAppletContext().showDocument(new URL(class31.field153.getCodeBase(), var0), "_blank"); // L: 87
				return true; // L: 88
			} catch (Exception var10) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 3) { // L: 94
			try {
				Applet var3 = class31.field153; // L: 96
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 99
			} catch (Throwable var12) { // L: 102
			}

			try {
				class31.field153.getAppletContext().showDocument(new URL(class31.field153.getCodeBase(), var0), "_top"); // L: 104
				return true; // L: 105
			} catch (Exception var11) { // L: 107
				return false; // L: 108
			}
		} else {
			throw new IllegalArgumentException(); // L: 111
		}
	}
}
