import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("em")
public class class154 extends class139 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -561702384304559325L
	)
	long field1763;
	@ObfuscatedName("w")
	String field1765;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -369907185
	)
	int field1764;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lex;)V"
	)
	class154(class142 var1) {
		this.this$0 = var1;
		this.field1763 = -1L;
		this.field1765 = null; // L: 94
		this.field1764 = 0;
	} // L: 97

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;S)V",
		garbageValue = "-5782"
	)
	void vmethod3394(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset;
			this.field1763 = var1.readLong(); // L: 102
		}

		this.field1765 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1764 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "-26"
	)
	void vmethod3393(ClanSettings var1) {
		var1.method3230(this.field1763, this.field1765, this.field1764);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "1149827152"
	)
	static boolean method3319(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 59
			try {
				if (!class31.field186.startsWith("win")) { // L: 61
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 62
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 63

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 64
						if (var14.indexOf(var0.charAt(var4)) == -1) { // L: 65
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 67
					return true; // L: 68
				}
			} catch (Throwable var8) { // L: 70
				return false; // L: 71
			}
		} else if (var1 == 1) { // L: 74
			try {
				Applet var7 = class31.field190; // L: 77
				Object[] var5 = new Object[]{(new URL(class31.field190.getCodeBase(), var0)).toString()}; // L: 78
				Object var13 = JSObject.getWindow(var7).call(var2, var5); // L: 81
				return var13 != null; // L: 84
			} catch (Throwable var9) { // L: 86
				return false; // L: 87
			}
		} else if (var1 == 2) { // L: 90
			try {
				class31.field190.getAppletContext().showDocument(new URL(class31.field190.getCodeBase(), var0), "_blank"); // L: 92
				return true; // L: 93
			} catch (Exception var10) { // L: 95
				return false; // L: 96
			}
		} else if (var1 == 3) { // L: 99
			try {
				Applet var3 = class31.field190; // L: 101
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 104
			} catch (Throwable var12) { // L: 107
			}

			try {
				class31.field190.getAppletContext().showDocument(new URL(class31.field190.getCodeBase(), var0), "_top"); // L: 109
				return true; // L: 110
			} catch (Exception var11) { // L: 112
				return false; // L: 113
			}
		} else {
			throw new IllegalArgumentException(); // L: 116
		}
	}
}
