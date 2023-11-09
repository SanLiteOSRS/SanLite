import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class333 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-92"
	)
	static void method6591(boolean var0) {
		byte var1 = 0; // L: 1146
		boolean var2 = class150.clientPreferences.method2539() >= Client.field521; // L: 1149
		if (!var2) { // L: 1151
			var1 = 12; // L: 1152
		} else if (TileItem.client.method1267() || TileItem.client.isOtlTokenRequesterInitialized() || TileItem.client.method1472()) { // L: 1154
			var1 = 10; // L: 1155
		}

		class328.method6115(var1); // L: 1157
		if (var0) { // L: 1158
			Login.Login_username = ""; // L: 1159
			Login.Login_password = ""; // L: 1160
			class424.field4622 = 0; // L: 1161
			Login.otp = ""; // L: 1162
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1165
			if (class150.clientPreferences.method2483() != null) { // L: 1166
				Login.Login_username = class150.clientPreferences.method2483(); // L: 1167
				Client.Login_isUsernameRemembered = true; // L: 1168
			} else {
				Client.Login_isUsernameRemembered = false; // L: 1170
			}
		}

		class395.method7331(); // L: 1172
	} // L: 1173
}
