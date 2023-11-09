import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("Login")
public class Login {
	@ObfuscatedName("an")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 605179359
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lty;"
	)
	static IndexedSprite[] field885;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static IndexedSprite field887;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static IndexedSprite field921;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1841950095
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1810248517
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("au")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2092149251
	)
	static int field894;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -115276701
	)
	static int field895;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1753059625
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cg")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cr")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ce")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cn")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cd")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cz")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1567371657
	)
	static int field903;
	@ObfuscatedName("ch")
	static String[] field905;
	@ObfuscatedName("cc")
	static String field913;
	@ObfuscatedName("cy")
	static boolean field886;
	@ObfuscatedName("cu")
	static boolean field914;
	@ObfuscatedName("cf")
	static boolean field909;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 260028629
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("da")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -827704621
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 176707159
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -995531013
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		longValue = 7952727905495817039L
	)
	static long field917;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		longValue = -790820133787858129L
	)
	static long field901;
	@ObfuscatedName("dj")
	static String[] field904;
	@ObfuscatedName("du")
	static String[] field920;
	@ObfuscatedName("dl")
	static String[] field907;

	static {
		xPadding = 0; // L: 49
		loginBoxX = xPadding + 202; // L: 68
		Login_loadingPercent = 10; // L: 70
		Login_loadingText = ""; // L: 71
		field894 = -1; // L: 92
		field895 = 1; // L: 95
		loginIndex = 0;
		Login_response0 = ""; // L: 100
		Login_response1 = ""; // L: 101
		Login_response2 = "";
		Login_response3 = "";
		Login_username = ""; // L: 104
		Login_password = ""; // L: 105
		field903 = 0;
		field905 = new String[8]; // L: 108
		field913 = "";
		field886 = false; // L: 120
		field914 = false; // L: 121
		field909 = true; // L: 124
		currentLoginField = 0; // L: 125
		worldSelectOpen = false; // L: 129
		hoveredWorldIndex = -1; // L: 137
		worldSelectPage = 0; // L: 138
		worldSelectPagesCount = 0; // L: 139
		new DecimalFormat("##0.00"); // L: 142
		new class133();
		field917 = -1L; // L: 150
		field901 = -1L; // L: 151
		field904 = new String[]{"title.jpg"}; // L: 154
		field920 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 157
		field907 = new String[]{"logo_speedrunning"}; // L: 160
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldt;",
		garbageValue = "-2112501524"
	)
	static class90[] method2078() {
		return new class90[]{class90.field1079, class90.field1083, class90.field1086, class90.field1080, class90.field1078, class90.field1081}; // L: 17
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;Ljava/lang/String;Ljava/lang/String;I)Lpa;",
		garbageValue = "1145684952"
	)
	public static Font method2093(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) { // L: 97
			return null;
		} else {
			int var4 = var0.getGroupId(var2); // L: 98
			int var5 = var0.getFileId(var4, var3); // L: 99
			Font var6;
			if (!WorldMapAreaData.method5599(var0, var4, var5)) { // L: 102
				var6 = null; // L: 103
			} else {
				byte[] var8 = var1.takeFile(var4, var5); // L: 107
				Font var7;
				if (var8 == null) { // L: 109
					var7 = null; // L: 110
				} else {
					Font var9 = new Font(var8, class515.SpriteBuffer_xOffsets, class515.SpriteBuffer_yOffsets, SecureRandomCallable.SpriteBuffer_spriteWidths, SecureRandomCallable.SpriteBuffer_spriteHeights, class515.SpriteBuffer_spritePalette, WorldMapDecoration.SpriteBuffer_pixels); // L: 113
					FriendLoginUpdate.method7789(); // L: 114
					var7 = var9; // L: 115
				}

				var6 = var7; // L: 117
			}

			return var6; // L: 119
		}
	}
}
