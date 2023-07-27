import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("Login")
public class Login {
	@ObfuscatedName("ay")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 181677601
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	static IndexedSprite[] field920;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static IndexedSprite field923;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static IndexedSprite field924;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 961751643
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1870177981
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("ai")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 469326293
	)
	static int field929;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1862168703
	)
	static int field930;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 2054440631
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cf")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cz")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cb")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cs")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cj")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cn")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1146710171
	)
	static int field938;
	@ObfuscatedName("cq")
	static String[] field953;
	@ObfuscatedName("cu")
	static String field940;
	@ObfuscatedName("ch")
	static boolean field955;
	@ObfuscatedName("cg")
	static boolean field947;
	@ObfuscatedName("cv")
	@Export("otp")
	static String otp;
	@ObfuscatedName("cc")
	static boolean field943;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1014236973
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dy")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 211982419
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 185396425
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1607470035
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		longValue = 6581316067511221491L
	)
	static long field951;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		longValue = -2311930200553503165L
	)
	static long field952;
	@ObfuscatedName("dp")
	static String[] field919;
	@ObfuscatedName("ds")
	static String[] field954;
	@ObfuscatedName("da")
	static String[] field934;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 2088764235
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("gn")
	static String field960;

	static {
		xPadding = 0; // L: 50
		loginBoxX = xPadding + 202; // L: 69
		Login_loadingPercent = 10; // L: 71
		Login_loadingText = ""; // L: 72
		field929 = -1; // L: 93
		field930 = 1; // L: 96
		loginIndex = 0; // L: 100
		Login_response0 = ""; // L: 101
		Login_response1 = ""; // L: 102
		Login_response2 = ""; // L: 103
		Login_response3 = ""; // L: 104
		Login_username = ""; // L: 105
		Login_password = ""; // L: 106
		field938 = 0; // L: 108
		field953 = new String[8]; // L: 109
		field940 = ""; // L: 114
		field955 = false; // L: 121
		field947 = false; // L: 122
		field943 = true; // L: 125
		currentLoginField = 0; // L: 126
		worldSelectOpen = false; // L: 130
		hoveredWorldIndex = -1; // L: 138
		worldSelectPage = 0; // L: 139
		worldSelectPagesCount = 0; // L: 140
		new DecimalFormat("##0.00"); // L: 143
		new class133();
		field951 = -1L; // L: 151
		field952 = -1L; // L: 152
		field919 = new String[]{"title.jpg"}; // L: 155
		field954 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 158
		field934 = new String[]{"logo_speedrunning"}; // L: 161
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "288446910"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) { // L: 242
			return true;
		} else if (!ArchiveLoader.Widget_archive.tryLoadGroup(var0)) { // L: 243
			return false;
		} else {
			int var1 = ArchiveLoader.Widget_archive.getGroupFileCount(var0); // L: 244
			if (var1 == 0) { // L: 245
				Widget.Widget_loadedInterfaces[var0] = true; // L: 246
				return true; // L: 247
			} else {
				if (ArchiveLoader.Widget_interfaceComponents[var0] == null) { // L: 249
					ArchiveLoader.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 250
					if (ArchiveLoader.Widget_interfaceComponents[var0][var2] == null) { // L: 251
						byte[] var3 = ArchiveLoader.Widget_archive.takeFile(var0, var2); // L: 252
						if (var3 != null) { // L: 253
							ArchiveLoader.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 254
							ArchiveLoader.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 255
							if (var3[0] == -1) { // L: 256
								ArchiveLoader.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								ArchiveLoader.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 257
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true; // L: 261
				return true; // L: 262
			}
		}
	}
}
