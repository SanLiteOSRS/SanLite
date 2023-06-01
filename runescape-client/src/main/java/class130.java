import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class130 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class130 field1538;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class130 field1529;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class130 field1537;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class130 field1528;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class130 field1530;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class130 field1533;
	@ObfuscatedName("aw")
	public static short[][] field1531;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1173691825
	)
	final int field1532;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1962182949
	)
	final int field1535;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1619751587
	)
	final int field1534;

	static {
		field1538 = new class130(0, 0, (String)null, 0); // L: 14
		field1529 = new class130(1, 1, (String)null, 9); // L: 15
		field1537 = new class130(2, 2, (String)null, 3); // L: 16
		field1528 = new class130(3, 3, (String)null, 6); // L: 17
		field1530 = new class130(4, 4, (String)null, 1); // L: 18
		field1533 = new class130(5, 5, (String)null, 3); // L: 19
	}

	class130(int var1, int var2, String var3, int var4) {
		this.field1532 = var1; // L: 29
		this.field1535 = var2; // L: 30
		this.field1534 = var4; // L: 31
	} // L: 32

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1535; // L: 40
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	int method2998() {
		return this.field1534; // L: 35
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-2047205298"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 92
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1386747499"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class439.client.method1215() && !class439.client.isOtlTokenRequesterInitialized() && !class439.client.method1216()) { // L: 1172
			Login.Login_response1 = ""; // L: 1176
			Login.Login_response2 = "Enter your username/email & password."; // L: 1177
			Login.Login_response3 = ""; // L: 1178
			class14.method171(2); // L: 1179
			if (var0) { // L: 1180
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1182
				if (WorldMapManager.clientPreferences.method2446() != null) { // L: 1183
					Login.Login_username = WorldMapManager.clientPreferences.method2446(); // L: 1184
					Client.Login_isUsernameRemembered = true; // L: 1185
				} else {
					Client.Login_isUsernameRemembered = false; // L: 1187
				}
			}

			if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1190
				Login.currentLoginField = 1; // L: 1191
			} else {
				Login.currentLoginField = 0; // L: 1194
			}

		} else {
			class14.method171(10); // L: 1173
		}
	} // L: 1174 1197

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1295226586"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 11139
	} // L: 11140

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1616511512"
	)
	static void method3006() {
		if (HitSplatDefinition.field2141 != null) { // L: 12619
			Client.field776 = Client.cycle; // L: 12620
			HitSplatDefinition.field2141.method6907(); // L: 12621

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12622
				if (Client.players[var0] != null) { // L: 12623
					HitSplatDefinition.field2141.method6905(class147.baseX * 64 + (Client.players[var0].x >> 7), ModeWhere.baseY * 64 + (Client.players[var0].y >> 7)); // L: 12624
				}
			}
		}

	} // L: 12628
}
