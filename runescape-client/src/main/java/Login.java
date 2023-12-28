import java.text.DecimalFormat;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Login")
public class Login {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2039275921
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	static IndexedSprite field897;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	static IndexedSprite field898;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	static IndexedSprite field902;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1778878703
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("an")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1531989047
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("ad")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 148503533
	)
	static int field894;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1523867687
	)
	static int field931;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lrv;"
	)
	static Bounds field918;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1718147569
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cg")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cv")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cx")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cp")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ce")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("ci")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -951981513
	)
	static int field915;
	@ObfuscatedName("cq")
	static String[] field907;
	@ObfuscatedName("cn")
	static String field917;
	@ObfuscatedName("cb")
	static boolean field916;
	@ObfuscatedName("cz")
	static boolean field919;
	@ObfuscatedName("cd")
	static boolean field920;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -477128201
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dx")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -114277323
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1053978403
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1658961215
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		longValue = 7418636873180907523L
	)
	static long field928;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		longValue = 1595452354552408875L
	)
	static long field906;
	@ObfuscatedName("dv")
	static String[] field895;
	@ObfuscatedName("dz")
	static String[] field930;
	@ObfuscatedName("dl")
	static String[] field932;

	static {
		xPadding = 0; // L: 50
		loginBoxX = xPadding + 202; // L: 69
		Login_loadingPercent = 10; // L: 71
		Login_loadingText = ""; // L: 72
		field894 = -1; // L: 93
		field931 = 1; // L: 96
		loginIndex = 0; // L: 100
		Login_response0 = ""; // L: 101
		Login_response1 = ""; // L: 102
		Login_response2 = ""; // L: 103
		Login_response3 = ""; // L: 104
		Login_username = ""; // L: 105
		Login_password = ""; // L: 106
		field915 = 0; // L: 108
		field907 = new String[8]; // L: 109
		field917 = ""; // L: 114
		field916 = false; // L: 121
		field919 = false; // L: 122
		field920 = true; // L: 125
		currentLoginField = 0; // L: 126
		worldSelectOpen = false; // L: 130
		hoveredWorldIndex = -1; // L: 138
		worldSelectPage = 0; // L: 139
		worldSelectPagesCount = 0; // L: 140
		new DecimalFormat("##0.00"); // L: 143
		new class135();
		field928 = -1L; // L: 151
		field906 = -1L; // L: 152
		field895 = new String[]{"title.jpg"}; // L: 155
		field930 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 158
		field932 = new String[]{"logo_speedrunning"}; // L: 161
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;IZI)Lfo;",
		garbageValue = "-1429797359"
	)
	public static class139 method2197(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 32
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535); // L: 33
		if (var5 == null) { // L: 34
			var4 = false; // L: 35
			return null; // L: 36
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255; // L: 38
			byte[] var7;
			if (var3) { // L: 40
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0); // L: 41
			}

			if (var7 == null) { // L: 42
				var4 = false;
			}

			if (!var4) { // L: 43
				return null;
			} else {
				if (class139.field1595 == null) { // L: 44
					GroundObject.field2713 = Runtime.getRuntime().availableProcessors(); // L: 45
					class139.field1595 = new ThreadPoolExecutor(0, GroundObject.field2713, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(GroundObject.field2713 * 100 + 100), new class136()); // L: 46
				}

				try {
					return new class139(var0, var1, var2, var3); // L: 54
				} catch (Exception var9) { // L: 56
					return null; // L: 57
				}
			}
		}
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "10"
	)
	static final void method2198(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12342
		WorldMapIcon_1.clientPreferences.method2559(var0); // L: 12343
	} // L: 12344
}
