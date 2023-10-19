import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class429 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2019999842"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class159.client.method1768() && !class159.client.isOtlTokenRequesterInitialized() && !class159.client.method1248()) { // L: 1255
			Login.Login_response1 = ""; // L: 1259
			Login.Login_response2 = "Enter your username/email & password."; // L: 1260
			Login.Login_response3 = ""; // L: 1261
			GameEngine.method647(2); // L: 1262
			if (var0) { // L: 1263
				Login.Login_password = "";
			}

			class188.method3619(); // L: 1264
			if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1266
				Login.currentLoginField = 1; // L: 1267
			} else {
				Login.currentLoginField = 0; // L: 1270
			}

		} else {
			GameEngine.method647(10); // L: 1256
		}
	} // L: 1257 1273
}
