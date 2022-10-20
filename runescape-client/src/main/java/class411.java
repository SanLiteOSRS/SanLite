import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
public class class411 implements class416 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	public final class441 field4592;

	@ObfuscatedSignature(
		descriptor = "(Lqn;)V"
	)
	class411(class442 var1) {
		this.field4592 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Loi;)V"
	)
	public class411(class412 var1) {
		this(new class442(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1584215817"
	)
	public int method7743(int var1) {
		return this.field4592.vmethod8144(var1); // L: 18
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1546082096"
	)
	static boolean method7742(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 61
			try {
				if (!class32.field176.startsWith("win")) { // L: 63
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 64
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 65

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 66
						if (var10.indexOf(var0.charAt(var4)) == -1) { // L: 67
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
				Object var3 = class27.method402(class32.field175, var2, new Object[]{(new URL(class32.field175.getCodeBase(), var0)).toString()}); // L: 78
				return var3 != null; // L: 79
			} catch (Throwable var6) { // L: 81
				return false; // L: 82
			}
		} else if (var1 == 2) { // L: 85
			try {
				class32.field175.getAppletContext().showDocument(new URL(class32.field175.getCodeBase(), var0), "_blank"); // L: 87
				return true; // L: 88
			} catch (Exception var7) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 3) { // L: 94
			try {
				class27.method398(class32.field175, "loggedout"); // L: 96
			} catch (Throwable var9) { // L: 98
			}

			try {
				class32.field175.getAppletContext().showDocument(new URL(class32.field175.getCodeBase(), var0), "_top"); // L: 100
				return true; // L: 101
			} catch (Exception var8) { // L: 103
				return false; // L: 104
			}
		} else {
			throw new IllegalArgumentException(); // L: 107
		}
	}
}
