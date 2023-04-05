import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("KeyHandler")
public class KeyHandler {
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = 1452010531
	)
	static int field154;
	@ObfuscatedName("ds")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 92
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-875970754"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 143
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "3"
	)
	static void method426(boolean var0) {
		byte var1 = 0; // L: 1257
		boolean var2 = WorldMapSectionType.clientPreferences.method2448() >= Client.field486; // L: 1260
		if (!var2) { // L: 1262
			var1 = 12; // L: 1263
		} else if (class392.client.method1222() || class392.client.isOtlTokenRequesterInitialized() || class392.client.method1223()) { // L: 1265
			var1 = 10; // L: 1266
		}

		class14.method173(var1); // L: 1268
		if (var0) { // L: 1269
			Login.Login_username = ""; // L: 1270
			Login.Login_password = ""; // L: 1271
			FriendSystem.field800 = 0; // L: 1272
			NetFileRequest.otp = ""; // L: 1273
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1276
			if (WorldMapSectionType.clientPreferences.method2446() != null) { // L: 1277
				Login.Login_username = WorldMapSectionType.clientPreferences.method2446(); // L: 1278
				Client.Login_isUsernameRemembered = true; // L: 1279
			} else {
				Client.Login_isUsernameRemembered = false; // L: 1281
			}
		}

		ReflectionCheck.method678(); // L: 1283
	} // L: 1284

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1393069837"
	)
	static void method428(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1578

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1579
			int var4 = var3 * 32 + 15 + 128; // L: 1580
			int var5 = var4 * 3 + 600; // L: 1583
			int var7 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1586
			int var6 = Occluder.method4563(var5, var1); // L: 1587
			var2[var3] = var6 * var7 >> 16; // L: 1588
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1590
	} // L: 1591
}
