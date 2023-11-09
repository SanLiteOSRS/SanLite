import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1377297903
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ac")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("aw")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-64"
	)
	static int method1196(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)I",
		garbageValue = "-13375"
	)
	public static int method1197(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 38
			int var6 = var3; // L: 39
			var3 = var4; // L: 40
			var4 = var6; // L: 41
		}

		var2 &= 3; // L: 43
		if (var2 == 0) { // L: 44
			return var1;
		} else if (var2 == 1) { // L: 45
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 46
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1509821977"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class415.client.method1248() && !class415.client.isOtlTokenRequesterInitialized() && !class415.client.method1249()) { // L: 1144
			Login.Login_response1 = ""; // L: 1148
			Login.Login_response2 = "Enter your username/email & password."; // L: 1149
			Login.Login_response3 = ""; // L: 1150
			ObjectSound.method1926(2); // L: 1151
			if (var0) {
				Login.Login_password = ""; // L: 1152
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1154
				if (clientPreferences.method2504() != null) { // L: 1155
					Login.Login_username = clientPreferences.method2504(); // L: 1156
					Client.Login_isUsernameRemembered = true; // L: 1157
				} else {
					Client.Login_isUsernameRemembered = false; // L: 1159
				}
			}

			Message.method1227(); // L: 1161
		} else {
			ObjectSound.method1926(10); // L: 1145
		}
	} // L: 1146 1162
}
