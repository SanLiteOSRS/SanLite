import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class33 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "1455646027"
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

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field4847 + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2); // L: 88
				DataInputStream var17 = new DataInputStream(var3.openStream()); // L: 89
				var17.read(); // L: 90
				var17.close(); // L: 91
			} catch (Exception var16) { // L: 93
			}

		}
	} // L: 94

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1039613343"
	)
	static void method572(boolean var0) {
		byte var1 = 0; // L: 1166
		boolean var2 = FriendsChatMember.clientPreferences.method2229() >= Client.field480; // L: 1169
		if (!var2) { // L: 1171
			var1 = 12; // L: 1172
		} else if (AbstractByteArrayCopier.client.method1086() || AbstractByteArrayCopier.client.isOtlTokenRequesterInitialized()) { // L: 1174
			var1 = 10; // L: 1175
		}

		class116.method2683(var1); // L: 1177
		if (var0) { // L: 1178
			Login.Login_username = ""; // L: 1179
			Login.Login_password = ""; // L: 1180
			class19.field100 = 0; // L: 1181
			KeyHandler.otp = ""; // L: 1182
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1185
			if (FriendsChatMember.clientPreferences.method2227() != null) { // L: 1186
				Login.Login_username = FriendsChatMember.clientPreferences.method2227(); // L: 1187
				Client.Login_isUsernameRemembered = true; // L: 1188
			} else {
				Client.Login_isUsernameRemembered = false; // L: 1190
			}
		}

		ReflectionCheck.method580(); // L: 1192
	} // L: 1193

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1810092240"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		UserComparator8.logOut(); // L: 2839
		switch(var0) { // L: 2840
		case 1:
			class116.method2683(24); // L: 2849
			ItemComposition.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2850
			break;
		case 2:
			class13.method165(); // L: 2843
		}

	} // L: 2855
}
