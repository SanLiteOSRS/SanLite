import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("bu")
@Implements("Login")
public class Login {
	@ObfuscatedName("e")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -994097247
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	static IndexedSprite[] field918;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static IndexedSprite field949;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static IndexedSprite field927;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1802972375
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -561151419
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("z")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1123765685
	)
	static int field924;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1782720957
	)
	static int field928;
	@ObfuscatedName("ap")
	static String field929;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 860431235
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("bh")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("be")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bf")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bo")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("by")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bw")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1776085317
	)
	static int field938;
	@ObfuscatedName("bl")
	static String[] field915;
	@ObfuscatedName("bt")
	static boolean field939;
	@ObfuscatedName("bu")
	static boolean field955;
	@ObfuscatedName("bm")
	static boolean field930;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1156426449
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("cq")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1726708665
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1039174001
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -231318101
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		longValue = -1294134283863075195L
	)
	static long field937;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		longValue = 7897803412889482129L
	)
	static long field950;
	@ObfuscatedName("ch")
	static String[] field934;
	@ObfuscatedName("ce")
	static String[] field932;
	@ObfuscatedName("cg")
	static String[] field953;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10; // L: 69
		Login_loadingText = ""; // L: 70
		field924 = -1; // L: 90
		field928 = 1; // L: 93
		loginIndex = 0; // L: 97
		Login_response0 = ""; // L: 98
		Login_response1 = ""; // L: 99
		Login_response2 = ""; // L: 100
		Login_response3 = ""; // L: 101
		Login_username = ""; // L: 102
		Login_password = ""; // L: 103
		field938 = 0; // L: 105
		field915 = new String[8]; // L: 106
		field939 = false; // L: 117
		field955 = false; // L: 118
		field930 = true; // L: 121
		currentLoginField = 0; // L: 122
		worldSelectOpen = false; // L: 126
		hoveredWorldIndex = -1; // L: 134
		worldSelectPage = 0; // L: 135
		worldSelectPagesCount = 0; // L: 136
		new DecimalFormat("##0.00"); // L: 139
		new class128();
		field937 = -1L; // L: 147
		field950 = -1L; // L: 148
		field934 = new String[]{"title.jpg"}; // L: 151
		field932 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 154
		field953 = new String[]{"logo_speedrunning"}; // L: 157
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1089740356"
	)
	public static void method2065(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 48
		VarbitComposition var2;
		if (var3 != null) { // L: 49
			var2 = var3; // L: 50
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 53
			var3 = new VarbitComposition(); // L: 54
			if (var4 != null) { // L: 55
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 56
			var2 = var3; // L: 57
		}

		int var8 = var2.baseVar; // L: 60
		int var5 = var2.startBit; // L: 61
		int var6 = var2.endBit; // L: 62
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 63
		if (var1 < 0 || var1 > var7) { // L: 64
			var1 = 0;
		}

		var7 <<= var5; // L: 65
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 66
	} // L: 67

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Lew;",
		garbageValue = "-1889979389"
	)
	public static class130 method2096(int var0) {
		class130 var1 = (class130)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 388
		if (var1 != null) { // L: 389
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 391
			AbstractArchive var4 = BuddyRankComparator.SequenceDefinition_skeletonsArchive; // L: 392
			boolean var5 = true; // L: 394
			byte[] var6 = var3.getFile(var0 >> 16 & 65535, var0 & 65535); // L: 395
			class130 var2;
			if (var6 == null) { // L: 396
				var5 = false; // L: 397
				var2 = null; // L: 398
			} else {
				int var7 = (var6[1] & 255) << 8 | var6[2] & 255; // L: 401
				byte[] var8 = var4.getFile(var7, 0); // L: 404
				if (var8 == null) { // L: 405
					var5 = false;
				}

				if (!var5) { // L: 406
					var2 = null; // L: 407
				} else {
					try {
						var2 = new class130(var3, var4, var0, false); // L: 411
					} catch (Exception var10) { // L: 413
						var2 = null; // L: 414
					}
				}
			}

			if (var2 != null) { // L: 418
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2; // L: 419
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "615126819"
	)
	static float[] method2094(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 289

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 291
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 292
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 293
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 294
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 295
		} catch (JSONException var4) { // L: 297
			var2[0] = 0.0F; // L: 298
			var2[1] = 0.0F; // L: 299
			var2[2] = 1.0F; // L: 300
			var2[3] = 1.0F; // L: 301
		}

		return var2; // L: 303
	}
}
