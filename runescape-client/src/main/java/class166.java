import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class166 extends class178 {
	@ObfuscatedName("aj")
	String field1783;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgs;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class166(class167 var1, String var2, String var3) {
		super(var1, var2); // L: 412
		this.this$0 = var1; // L: 411
		this.field1783 = var3; // L: 413
	} // L: 414

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	public int vmethod3513() {
		return 1; // L: 417
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "217789139"
	)
	public String vmethod3511() {
		return this.field1783; // L: 422
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1963858223"
	)
	public static void method3383(boolean var0) {
		if (NetCache.NetCache_socket != null) { // L: 44
			try {
				Buffer var1 = new Buffer(4); // L: 46
				var1.writeByte(var0 ? 2 : 3); // L: 47
				var1.writeMedium(0); // L: 48
				NetCache.NetCache_socket.write(var1.array, 0, 4); // L: 49
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close(); // L: 53
				} catch (Exception var3) { // L: 55
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null; // L: 57
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-29046151"
	)
	static boolean method3376(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 56
			try {
				if (!class31.field161.startsWith("win")) { // L: 58
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 59
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 60

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 61
						if (var10.indexOf(var0.charAt(var4)) == -1) { // L: 62
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 64
					return true; // L: 65
				}
			} catch (Throwable var5) { // L: 67
				return false; // L: 68
			}
		} else if (var1 == 1) { // L: 71
			try {
				Object var3 = class26.method377(class31.field166, var2, new Object[]{(new URL(class31.field166.getCodeBase(), var0)).toString()}); // L: 73
				return var3 != null; // L: 74
			} catch (Throwable var6) { // L: 76
				return false; // L: 77
			}
		} else if (var1 == 2) { // L: 80
			try {
				class31.field166.getAppletContext().showDocument(new URL(class31.field166.getCodeBase(), var0), "_blank"); // L: 82
				return true; // L: 83
			} catch (Exception var7) { // L: 85
				return false; // L: 86
			}
		} else if (var1 == 3) { // L: 89
			try {
				class26.method374(class31.field166, "loggedout"); // L: 91
			} catch (Throwable var9) { // L: 93
			}

			try {
				class31.field166.getAppletContext().showDocument(new URL(class31.field166.getCodeBase(), var0), "_top"); // L: 95
				return true; // L: 96
			} catch (Exception var8) { // L: 98
				return false; // L: 99
			}
		} else {
			throw new IllegalArgumentException(); // L: 102
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "139465166"
	)
	public static long method3384(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0]; // L: 52
	}
}
