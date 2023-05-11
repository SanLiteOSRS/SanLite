import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("Login")
public class Login {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 578342931
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static IndexedSprite field892;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static IndexedSprite field893;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static IndexedSprite field907;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -575466127
	)
	static int field927;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static Buffer field928;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 678588245
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1158424865
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("ae")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1478945003
	)
	static int field898;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1733444455
	)
	static int field916;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1145608355
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ci")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cs")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cc")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cn")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ca")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cu")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1262226977
	)
	static int field909;
	@ObfuscatedName("cm")
	static String[] field910;
	@ObfuscatedName("cy")
	static String field911;
	@ObfuscatedName("cj")
	static boolean field890;
	@ObfuscatedName("ch")
	static boolean field902;
	@ObfuscatedName("cd")
	static boolean field914;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1232221421
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("di")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 248569915
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1246310743
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1959698517
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		longValue = -7899453336143161787L
	)
	static long field894;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		longValue = 6949275123175874863L
	)
	static long field923;
	@ObfuscatedName("dq")
	static String[] field924;
	@ObfuscatedName("dd")
	static String[] field925;
	@ObfuscatedName("dj")
	static String[] field926;

	static {
		xPadding = 0; // L: 49
		loginBoxX = xPadding + 202; // L: 68
		Login_loadingPercent = 10; // L: 70
		Login_loadingText = ""; // L: 71
		field898 = -1; // L: 92
		field916 = 1; // L: 95
		loginIndex = 0; // L: 99
		Login_response0 = ""; // L: 100
		Login_response1 = ""; // L: 101
		Login_response2 = ""; // L: 102
		Login_response3 = ""; // L: 103
		Login_username = ""; // L: 104
		Login_password = ""; // L: 105
		field909 = 0; // L: 107
		field910 = new String[8]; // L: 108
		field911 = ""; // L: 113
		field890 = false; // L: 120
		field902 = false; // L: 121
		field914 = true; // L: 124
		currentLoginField = 0; // L: 125
		worldSelectOpen = false; // L: 129
		hoveredWorldIndex = -1; // L: 137
		worldSelectPage = 0; // L: 138
		worldSelectPagesCount = 0; // L: 139
		new DecimalFormat("##0.00"); // L: 142
		new class129();
		field894 = -1L; // L: 150
		field923 = -1L; // L: 151
		field924 = new String[]{"title.jpg"}; // L: 154
		field925 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 157
		field926 = new String[]{"logo_speedrunning"}; // L: 160
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-722826482"
	)
	static void method2100(boolean var0) {
		byte var1 = 0; // L: 1405
		if (!class134.method3178()) { // L: 1406
			var1 = 12; // L: 1407
		} else if (ScriptFrame.client.method1431() || ScriptFrame.client.isOtlTokenRequesterInitialized() || ScriptFrame.client.method1234()) { // L: 1409
			var1 = 10; // L: 1410
		}

		class129.method3124(var1); // L: 1412
		if (var0) { // L: 1413
			Login_username = ""; // L: 1414
			Login_password = ""; // L: 1415
			class204.field2330 = 0; // L: 1416
			Messages.otp = ""; // L: 1417
		}

		DecorativeObject.method5025(); // L: 1419
		if (Client.Login_isUsernameRemembered && Login_username != null && Login_username.length() > 0) { // L: 1421
			currentLoginField = 1; // L: 1422
		} else {
			currentLoginField = 0; // L: 1425
		}

	} // L: 1428

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2141606464"
	)
	static void method2102() {
		if (Players.loadWorlds()) { // L: 2203
			worldSelectOpen = true; // L: 2204
			worldSelectPage = 0; // L: 2205
			worldSelectPagesCount = 0; // L: 2206
		}

	} // L: 2208

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-681433942"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		class124.method3058(); // L: 11986
		if (UserComparator5.friendsChatManager != null) { // L: 11987
			UserComparator5.friendsChatManager.invalidateIgnoreds(); // L: 11988
		}

	} // L: 11990
}
