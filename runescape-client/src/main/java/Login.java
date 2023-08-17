import java.text.DecimalFormat;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Login")
public class Login {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 657439907
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	static IndexedSprite[] field931;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static IndexedSprite field933;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static IndexedSprite field929;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -390756021
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -427966603
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("aw")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1116009889
	)
	static int field942;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -522212335
	)
	static int field943;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1467944731
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cf")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cm")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cn")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cs")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cx")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cr")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 931290101
	)
	static int field951;
	@ObfuscatedName("cq")
	static String[] field954;
	@ObfuscatedName("cu")
	static String field953;
	@ObfuscatedName("cz")
	static boolean field935;
	@ObfuscatedName("ct")
	static boolean field963;
	@ObfuscatedName("cc")
	static boolean field956;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1433824975
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dn")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1255060069
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1818453167
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1041331769
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		longValue = 5645912346148903893L
	)
	static long field955;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		longValue = 1131909237383043171L
	)
	static long field966;
	@ObfuscatedName("do")
	static String[] field946;
	@ObfuscatedName("db")
	static String[] field967;
	@ObfuscatedName("dp")
	static String[] field971;

	static {
		xPadding = 0; // L: 50
		loginBoxX = xPadding + 202; // L: 69
		Login_loadingPercent = 10; // L: 71
		Login_loadingText = ""; // L: 72
		field942 = -1; // L: 93
		field943 = 1; // L: 96
		loginIndex = 0; // L: 100
		Login_response0 = ""; // L: 101
		Login_response1 = ""; // L: 102
		Login_response2 = ""; // L: 103
		Login_response3 = ""; // L: 104
		Login_username = ""; // L: 105
		Login_password = ""; // L: 106
		field951 = 0; // L: 108
		field954 = new String[8]; // L: 109
		field953 = ""; // L: 114
		field935 = false; // L: 121
		field963 = false; // L: 122
		field956 = true; // L: 125
		currentLoginField = 0; // L: 126
		worldSelectOpen = false; // L: 130
		hoveredWorldIndex = -1; // L: 138
		worldSelectPage = 0; // L: 139
		worldSelectPagesCount = 0; // L: 140
		new DecimalFormat("##0.00"); // L: 143
		new class133();
		field955 = -1L; // L: 151
		field966 = -1L; // L: 152
		field946 = new String[]{"title.jpg"}; // L: 155
		field967 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 158
		field971 = new String[]{"logo_speedrunning"}; // L: 161
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lro;",
		garbageValue = "1233302527"
	)
	public static class449 method2085() {
		synchronized(class449.field4731) { // L: 28
			if (class338.field3816 == 0) { // L: 29
				return new class449();
			} else {
				class449.field4731[--class338.field3816].method8164(); // L: 31
				return class449.field4731[class338.field3816]; // L: 32
			}
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1609122082"
	)
	static void method2136(int var0, int var1) {
		if (class449.clientPreferences.method2451() != 0 && var0 != -1) { // L: 3638
			ArrayList var2 = new ArrayList(); // L: 3639
			var2.add(new class317(class388.field4435, var0, 0, class449.clientPreferences.method2451(), false)); // L: 3640
			class53.method1097(var2, 0, 0, 0, 0, true); // L: 3641
			Client.playingJingle = true; // L: 3642
		}

	} // L: 3644

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "([Lmi;Lmi;ZI)V",
		garbageValue = "1287151342"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 11054
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 11055
		PcmPlayer.resizeInterface(var0, var1.id, var3, var4, var2); // L: 11056
		if (var1.children != null) {
			PcmPlayer.resizeInterface(var1.children, var1.id, var3, var4, var2); // L: 11057
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 11058
		if (var5 != null) { // L: 11059
			int var6 = var5.group; // L: 11060
			if (ModeWhere.loadInterface(var6)) { // L: 11062
				PcmPlayer.resizeInterface(PacketBufferNode.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 11063
			}
		}

		if (var1.contentType == 1337) { // L: 11066
		}

	} // L: 11067
}
