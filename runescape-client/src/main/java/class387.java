import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public class class387 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "8"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 34
				if (var1 != null) { // L: 35
					var2 = class210.method4292(var1);
				}

				if (var0 != null) { // L: 36
					if (var1 != null) { // L: 37
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 38
				}

				System.out.println("Error: " + var2); // L: 40
				var2 = var2.replace(':', '.'); // L: 41
				var2 = var2.replace('@', '_'); // L: 42
				var2 = var2.replace('&', '_'); // L: 43
				var2 = var2.replace('#', '_'); // L: 44
				if (class100.RunException_applet == null) { // L: 45
					return;
				}

				URL var3 = new URL(class100.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + class441.field4731 + "&u=" + RunException.field5158 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2); // L: 46
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 47
				var4.read(); // L: 48
				var4.close(); // L: 49
			} catch (Exception var5) { // L: 51
			}

		}
	} // L: 52

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-59"
	)
	static final int method7599(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16; // L: 17
	}
}
