import java.applet.Applet;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ln")
public class class299 {
	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "1126631894"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-644258747"
	)
	static boolean method5716(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 59
			try {
				if (!class31.field169.startsWith("win")) { // L: 61
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 62
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 63

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 64
						if (var11.indexOf(var0.charAt(var4)) == -1) { // L: 65
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 67
					return true; // L: 68
				}
			} catch (Throwable var5) { // L: 70
				return false; // L: 71
			}
		} else if (var1 == 1) { // L: 74
			try {
				Object var10 = class26.method381(class31.field170, var2, new Object[]{(new URL(class31.field170.getCodeBase(), var0)).toString()}); // L: 76
				return var10 != null; // L: 77
			} catch (Throwable var6) { // L: 79
				return false; // L: 80
			}
		} else if (var1 == 2) { // L: 83
			try {
				class31.field170.getAppletContext().showDocument(new URL(class31.field170.getCodeBase(), var0), "_blank"); // L: 85
				return true; // L: 86
			} catch (Exception var7) { // L: 88
				return false; // L: 89
			}
		} else if (var1 == 3) { // L: 92
			try {
				Applet var3 = class31.field170; // L: 94
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 97
			} catch (Throwable var9) { // L: 100
			}

			try {
				class31.field170.getAppletContext().showDocument(new URL(class31.field170.getCodeBase(), var0), "_top"); // L: 102
				return true; // L: 103
			} catch (Exception var8) { // L: 105
				return false; // L: 106
			}
		} else {
			throw new IllegalArgumentException(); // L: 109
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIB)Liw;",
		garbageValue = "122"
	)
	static RouteStrategy method5715(int var0, int var1) {
		Client.field828.approxDestinationX = var0; // L: 9189
		Client.field828.approxDestinationY = var1; // L: 9190
		Client.field828.approxDestinationSizeX = 1; // L: 9191
		Client.field828.approxDestinationSizeY = 1; // L: 9192
		return Client.field828; // L: 9193
	}
}
