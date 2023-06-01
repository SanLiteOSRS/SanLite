import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public class class260 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)V",
		garbageValue = "1209128837"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class291.runScript(var0, 500000, 475000); // L: 103
	} // L: 104

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "-1068176273"
	)
	public static void method5397(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 43
			int var4 = (var3 + var2) / 2; // L: 44
			int var5 = var2; // L: 45
			String var6 = var0[var4]; // L: 46
			var0[var4] = var0[var3]; // L: 47
			var0[var3] = var6; // L: 48
			int var7 = var1[var4]; // L: 49
			var1[var4] = var1[var3]; // L: 50
			var1[var3] = var7; // L: 51

			for (int var8 = var2; var8 < var3; ++var8) { // L: 52
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 53
					String var9 = var0[var8]; // L: 54
					var0[var8] = var0[var5]; // L: 55
					var0[var5] = var9; // L: 56
					int var10 = var1[var8]; // L: 57
					var1[var8] = var1[var5]; // L: 58
					var1[var5++] = var10; // L: 59
				}
			}

			var0[var3] = var0[var5]; // L: 63
			var0[var5] = var6; // L: 64
			var1[var3] = var1[var5]; // L: 65
			var1[var5] = var7; // L: 66
			method5397(var0, var1, var2, var5 - 1); // L: 67
			method5397(var0, var1, var5 + 1, var3); // L: 68
		}

	} // L: 70

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-71"
	)
	static void method5395(boolean var0) {
		byte var1 = 0; // L: 1200
		boolean var2 = WorldMapManager.clientPreferences.method2448() >= Client.field485; // L: 1203
		if (!var2) { // L: 1205
			var1 = 12; // L: 1206
		} else if (class439.client.method1215() || class439.client.isOtlTokenRequesterInitialized() || class439.client.method1216()) { // L: 1208
			var1 = 10; // L: 1209
		}

		class14.method171(var1); // L: 1211
		if (var0) { // L: 1212
			Login.Login_username = ""; // L: 1213
			Login.Login_password = ""; // L: 1214
			AbstractWorldMapData.field2999 = 0; // L: 1215
			class382.otp = ""; // L: 1216
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1219
			if (WorldMapManager.clientPreferences.method2446() != null) { // L: 1220
				Login.Login_username = WorldMapManager.clientPreferences.method2446(); // L: 1221
				Client.Login_isUsernameRemembered = true; // L: 1222
			} else {
				Client.Login_isUsernameRemembered = false; // L: 1224
			}
		}

		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1227
			Login.currentLoginField = 1; // L: 1228
		} else {
			Login.currentLoginField = 0; // L: 1231
		}

	} // L: 1234
}
