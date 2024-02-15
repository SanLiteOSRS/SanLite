import java.applet.Applet;
import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("rr")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("az")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	AbstractSocket() {
	} // L: 7

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "854871960"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1869781257"
	)
	public abstract int vmethod8476() throws IOException;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1680246450"
	)
	public abstract int vmethod8489() throws IOException;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BIIS)I",
		garbageValue = "230"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "437315408"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "-43"
	)
	static boolean method8473(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 58
			try {
				if (!class31.field160.startsWith("win")) { // L: 60
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 61
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 62

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 63
						if (var14.indexOf(var0.charAt(var4)) == -1) { // L: 64
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 66
					return true; // L: 67
				}
			} catch (Throwable var8) { // L: 69
				return false; // L: 70
			}
		} else if (var1 == 1) { // L: 73
			try {
				Applet var7 = class31.field164; // L: 76
				Object[] var5 = new Object[]{(new URL(class31.field164.getCodeBase(), var0)).toString()}; // L: 77
				Object var13 = JSObject.getWindow(var7).call(var2, var5); // L: 80
				return var13 != null; // L: 83
			} catch (Throwable var9) { // L: 85
				return false; // L: 86
			}
		} else if (var1 == 2) { // L: 89
			try {
				class31.field164.getAppletContext().showDocument(new URL(class31.field164.getCodeBase(), var0), "_blank"); // L: 91
				return true; // L: 92
			} catch (Exception var10) { // L: 94
				return false; // L: 95
			}
		} else if (var1 == 3) { // L: 98
			try {
				Applet var3 = class31.field164; // L: 100
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 103
			} catch (Throwable var12) { // L: 106
			}

			try {
				class31.field164.getAppletContext().showDocument(new URL(class31.field164.getCodeBase(), var0), "_top"); // L: 108
				return true; // L: 109
			} catch (Exception var11) { // L: 111
				return false; // L: 112
			}
		} else {
			throw new IllegalArgumentException(); // L: 115
		}
	}
}
