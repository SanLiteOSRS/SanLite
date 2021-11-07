import java.applet.Applet;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("hw")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1749152531
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 883383741
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1136190305
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 678309221
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -319994583
	)
	@Export("type")
	int type;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1416943749
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1076426543
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -287892181
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2065946253
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -300779215
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1201693205
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 816323749
	)
	int field2464;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1338658645
	)
	int field2469;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -761560275
	)
	int field2463;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1793637339
	)
	int field2471;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1091401787
	)
	int field2470;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1237604195
	)
	int field2473;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -559031051
	)
	int field2472;

	Occluder() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Lju;",
		garbageValue = "1814694549"
	)
	public static class283[] method4483() {
		return new class283[]{class283.field3639, class283.field3638, class283.field3640, class283.field3637};
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "466419387"
	)
	static boolean method4484(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "2027201546"
	)
	static boolean method4485(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class29.field158.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var11.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var10 = class27.method394(class29.field157, var2, new Object[]{(new URL(class29.field157.getCodeBase(), var0)).toString()});
				return var10 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class29.field157.getAppletContext().showDocument(new URL(class29.field157.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class29.field157;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var9) {
			}

			try {
				class29.field157.getAppletContext().showDocument(new URL(class29.field157.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	static void method4482() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class1.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = SoundCache.method807();
			int var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				var0 = class1.method15(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				class1.setLoginResponseString(Strings.field3595, Strings.field3634, Strings.field3597);
				class275.method5201(6);
				break;
			case 3:
				class1.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class1.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class1.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class1.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class1.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1873535602"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (ClientPreferences.garbageCollector == null || !ClientPreferences.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						ClientPreferences.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (ClientPreferences.garbageCollector != null) {
			long var9 = class111.method2516();
			long var3 = ClientPreferences.garbageCollector.getCollectionTime();
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}
}
