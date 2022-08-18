import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class class359 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "-891701215"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 34
				if (var1 != null) { // L: 35
					var2 = Players.method2497(var1);
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
				if (RunException.RunException_applet == null) { // L: 45
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + class138.field1608 + "&u=" + class392.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class133.clientType + "&e=" + var2); // L: 46
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 47
				var4.read(); // L: 48
				var4.close(); // L: 49
			} catch (Exception var5) { // L: 51
			}

		}
	} // L: 52
}
