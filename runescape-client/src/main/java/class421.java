import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class421 {
	@ObfuscatedName("h")
	static final int[] field4615;
	@ObfuscatedName("j")
	static final int[] field4611;

	static {
		field4615 = new int[16384]; // L: 8
		field4611 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4615[var2] = (int)(16384.0D * Math.sin((double)var2 * var0)); // L: 14
			field4611[var2] = (int)(16384.0D * Math.cos((double)var2 * var0)); // L: 15
		}

	} // L: 17

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "2050490034"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 34
				if (var1 != null) { // L: 35
					Throwable var4 = var1; // L: 37
					String var5;
					if (var1 instanceof RunException) { // L: 40
						RunException var6 = (RunException)var1; // L: 41
						var5 = var6.message + " | "; // L: 42
						var4 = var6.throwable; // L: 43
					} else {
						var5 = ""; // L: 45
					}

					StringWriter var18 = new StringWriter(); // L: 46
					PrintWriter var7 = new PrintWriter(var18); // L: 47
					var4.printStackTrace(var7); // L: 48
					var7.close(); // L: 49
					String var8 = var18.toString(); // L: 50
					BufferedReader var9 = new BufferedReader(new StringReader(var8)); // L: 51
					String var10 = var9.readLine(); // L: 52

					label63:
					while (true) {
						while (true) {
							String var11 = var9.readLine(); // L: 54
							if (var11 == null) { // L: 55
								var5 = var5 + "| " + var10; // L: 73
								var2 = var5; // L: 76
								break label63;
							}

							int var12 = var11.indexOf(40); // L: 56
							int var13 = var11.indexOf(41, var12 + 1); // L: 57
							if (var12 >= 0 && var13 >= 0) { // L: 58
								String var14 = var11.substring(var12 + 1, var13); // L: 59
								int var15 = var14.indexOf(".java:"); // L: 60
								if (var15 >= 0) { // L: 61
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5); // L: 62
									var5 = var5 + var14 + ' '; // L: 63
									continue; // L: 64
								}

								var11 = var11.substring(0, var12); // L: 66
							}

							var11 = var11.trim(); // L: 68
							var11 = var11.substring(var11.lastIndexOf(32) + 1); // L: 69
							var11 = var11.substring(var11.lastIndexOf(9) + 1); // L: 70
							var5 = var5 + var11 + ' '; // L: 71
						}
					}
				}

				if (var0 != null) { // L: 78
					if (var1 != null) { // L: 79
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 80
				}

				System.out.println("Error: " + var2); // L: 82
				var2 = var2.replace(':', '.'); // L: 83
				var2 = var2.replace('@', '_'); // L: 84
				var2 = var2.replace('&', '_'); // L: 85
				var2 = var2.replace('#', '_'); // L: 86
				if (RunException.RunException_applet == null) { // L: 87
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field5018 + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + Buffer.clientType + "&e=" + var2); // L: 88
				DataInputStream var17 = new DataInputStream(var3.openStream()); // L: 89
				var17.read(); // L: 90
				var17.close(); // L: 91
			} catch (Exception var16) { // L: 93
			}

		}
	} // L: 94
}
