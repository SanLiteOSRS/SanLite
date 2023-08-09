import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("nt")
public class class351 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	static Widget field3896;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class346[] var2 = new class346[]{class346.field3863, class346.field3860}; // L: 14
		class346[] var3 = var2; // L: 16

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 17
			class346 var5 = var3[var4]; // L: 18
			if (var5.field3861 > var0) { // L: 20
				var0 = var5.field3861;
			}

			if (var5.field3862 > var1) { // L: 21
				var1 = var5.field3862;
			}
		}

	} // L: 25

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "115"
	)
	static boolean method6662(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 61
			try {
				if (!class31.field176.startsWith("win")) { // L: 63
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 64
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 65

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 66
						if (var11.indexOf(var0.charAt(var4)) == -1) { // L: 67
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 69
					return true; // L: 70
				}
			} catch (Throwable var5) { // L: 72
				return false; // L: 73
			}
		} else if (var1 == 1) { // L: 76
			try {
				Object var10 = class26.method383(class31.field179, var2, new Object[]{(new URL(class31.field179.getCodeBase(), var0)).toString()}); // L: 78
				return var10 != null; // L: 79
			} catch (Throwable var6) { // L: 81
				return false; // L: 82
			}
		} else if (var1 == 2) { // L: 85
			try {
				class31.field179.getAppletContext().showDocument(new URL(class31.field179.getCodeBase(), var0), "_blank"); // L: 87
				return true; // L: 88
			} catch (Exception var7) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 3) { // L: 94
			try {
				Applet var3 = class31.field179; // L: 96
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 99
			} catch (Throwable var9) { // L: 102
			}

			try {
				class31.field179.getAppletContext().showDocument(new URL(class31.field179.getCodeBase(), var0), "_top"); // L: 104
				return true; // L: 105
			} catch (Exception var8) { // L: 107
				return false; // L: 108
			}
		} else {
			throw new IllegalArgumentException(); // L: 111
		}
	}
}
