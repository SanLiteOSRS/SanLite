import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Login")
public class Login {
	@ObfuscatedName("an")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -165575055
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	static IndexedSprite[] field920;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static IndexedSprite field921;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -805293561
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1526243609
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("al")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -566253033
	)
	static int field925;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1836462063
	)
	static int field929;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 203490525
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cu")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ca")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cf")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cw")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ch")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cp")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 77869249
	)
	static int field935;
	@ObfuscatedName("cv")
	static String[] field938;
	@ObfuscatedName("cb")
	static String field939;
	@ObfuscatedName("cn")
	static boolean field947;
	@ObfuscatedName("ct")
	static boolean field941;
	@ObfuscatedName("cz")
	static boolean field942;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -270199593
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dt")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1715383833
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -754088211
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1876641005
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		longValue = -4458678754542330191L
	)
	static long field949;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		longValue = 8560470216792171217L
	)
	static long field930;
	@ObfuscatedName("dk")
	static String[] field952;
	@ObfuscatedName("dy")
	static String[] field953;
	@ObfuscatedName("dg")
	static String[] field933;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 430718727
	)
	static int field917;

	static {
		xPadding = 0; // L: 49
		loginBoxX = xPadding + 202; // L: 68
		Login_loadingPercent = 10; // L: 70
		Login_loadingText = ""; // L: 71
		field925 = -1; // L: 92
		field929 = 1; // L: 95
		loginIndex = 0; // L: 99
		Login_response0 = ""; // L: 100
		Login_response1 = ""; // L: 101
		Login_response2 = ""; // L: 102
		Login_response3 = ""; // L: 103
		Login_username = ""; // L: 104
		Login_password = ""; // L: 105
		field935 = 0; // L: 107
		field938 = new String[8]; // L: 108
		field939 = ""; // L: 113
		field947 = false; // L: 120
		field941 = false; // L: 121
		field942 = true; // L: 124
		currentLoginField = 0; // L: 125
		worldSelectOpen = false; // L: 129
		hoveredWorldIndex = -1; // L: 137
		worldSelectPage = 0; // L: 138
		worldSelectPagesCount = 0; // L: 139
		new DecimalFormat("##0.00"); // L: 142
		new class132();
		field949 = -1L; // L: 150
		field930 = -1L; // L: 151
		field952 = new String[]{"title.jpg"}; // L: 154
		field953 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 157
		field933 = new String[]{"logo_speedrunning"}; // L: 160
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I[B[BI)V",
		garbageValue = "-1847692125"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3678 == null) { // L: 1201
			if (var2 == null) { // L: 1202
				return; // L: 1208
			}

			var0.field3678 = new byte[11][]; // L: 1203
			var0.field3671 = new byte[11][]; // L: 1204
			var0.field3639 = new int[11]; // L: 1205
			var0.field3681 = new int[11]; // L: 1206
		}

		var0.field3678[var1] = var2; // L: 1210
		if (var2 != null) {
			var0.field3677 = true; // L: 1211
		} else {
			var0.field3677 = false; // L: 1213

			for (int var4 = 0; var4 < var0.field3678.length; ++var4) { // L: 1214
				if (var0.field3678[var4] != null) { // L: 1215
					var0.field3677 = true; // L: 1216
					break;
				}
			}
		}

		var0.field3671[var1] = var3; // L: 1221
	} // L: 1222
}
