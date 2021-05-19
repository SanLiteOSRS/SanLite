import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("hv")
public class class230 {
	@ObfuscatedName("h")
	static int[] field2816;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = -1187192027
	)
	static int field2812;

	static {
		new Object();
		field2816 = new int[33];
		field2816[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field2816[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1639678169"
	)
	static boolean method4348(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class44.field305.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var14.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var7 = class44.applet;
				Object[] var5 = new Object[]{(new URL(class44.applet.getCodeBase(), var0)).toString()};
				Object var13 = JSObject.getWindow(var7).call(var2, var5);
				return var13 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class44.applet;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var12) {
			}

			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
