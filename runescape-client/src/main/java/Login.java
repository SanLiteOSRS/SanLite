import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("Login")
public class Login {
	@ObfuscatedName("ah")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1629550627
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	static IndexedSprite[] field941;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field925;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 577739393
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1429316743
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("ae")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -175464077
	)
	static int field957;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1228226987
	)
	static int field938;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1252493419
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cj")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cr")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cy")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cg")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cl")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cw")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 58966259
	)
	static int field946;
	@ObfuscatedName("cm")
	static String[] field931;
	@ObfuscatedName("cp")
	static String field953;
	@ObfuscatedName("ch")
	static boolean field949;
	@ObfuscatedName("cf")
	static boolean field950;
	@ObfuscatedName("ca")
	static boolean field951;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -980303345
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dm")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -425448161
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 660618563
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 440579911
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		longValue = -4310875596448659801L
	)
	static long field959;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		longValue = -1733690883729819501L
	)
	static long field960;
	@ObfuscatedName("de")
	static String[] field961;
	@ObfuscatedName("dz")
	static String[] field962;
	@ObfuscatedName("dh")
	static String[] field963;
	@ObfuscatedName("hc")
	static int[] field965;

	static {
		xPadding = 0; // L: 59
		loginBoxX = xPadding + 202; // L: 78
		Login_loadingPercent = 10; // L: 80
		Login_loadingText = ""; // L: 81
		field957 = -1;
		field938 = 1; // L: 105
		loginIndex = 0; // L: 109
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = ""; // L: 113
		Login_username = "";
		Login_password = "";
		field946 = 0;
		field931 = new String[8];
		field953 = "";
		field949 = false; // L: 130
		field950 = false; // L: 131
		field951 = true;
		currentLoginField = 0; // L: 135
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0; // L: 149
		new DecimalFormat("##0.00"); // L: 152
		new class134();
		field959 = -1L;
		field960 = -1L;
		field961 = new String[]{"title.jpg"};
		field962 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field963 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)V",
		garbageValue = "4210704"
	)
	static final void method2160(PacketBuffer var0) {
		int var1 = 0; // L: 91
		var0.importIndex(); // L: 92

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 93
			var5 = Players.Players_indices[var2]; // L: 94
			if ((Players.field1382[var5] & 1) == 0) { // L: 95
				if (var1 > 0) { // L: 96
					--var1; // L: 97
					var10000 = Players.field1382; // L: 98
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 101
					if (var4 == 0) { // L: 102
						var1 = class276.method5574(var0); // L: 103
						var10000 = Players.field1382; // L: 104
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						LoginScreenAnimation.readPlayerUpdate(var0, var5); // L: 107
					}
				}
			}
		}

		var0.exportIndex(); // L: 110
		if (var1 != 0) { // L: 111
			throw new RuntimeException(); // L: 112
		} else {
			var0.importIndex(); // L: 114

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 115
				var5 = Players.Players_indices[var2]; // L: 116
				if ((Players.field1382[var5] & 1) != 0) { // L: 117
					if (var1 > 0) { // L: 118
						--var1; // L: 119
						var10000 = Players.field1382; // L: 120
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 123
						if (var4 == 0) { // L: 124
							var1 = class276.method5574(var0); // L: 125
							var10000 = Players.field1382; // L: 126
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							LoginScreenAnimation.readPlayerUpdate(var0, var5); // L: 129
						}
					}
				}
			}

			var0.exportIndex(); // L: 132
			if (var1 != 0) { // L: 133
				throw new RuntimeException(); // L: 134
			} else {
				var0.importIndex(); // L: 136

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 137
					var5 = Players.Players_emptyIndices[var2]; // L: 138
					if ((Players.field1382[var5] & 1) != 0) { // L: 139
						if (var1 > 0) { // L: 140
							--var1; // L: 141
							var10000 = Players.field1382; // L: 142
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 145
							if (var4 == 0) { // L: 146
								var1 = class276.method5574(var0); // L: 147
								var10000 = Players.field1382; // L: 148
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (class362.updateExternalPlayer(var0, var5)) { // L: 151
								var10000 = Players.field1382;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 154
				if (var1 != 0) { // L: 155
					throw new RuntimeException(); // L: 156
				} else {
					var0.importIndex(); // L: 158

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 159
						var5 = Players.Players_emptyIndices[var2]; // L: 160
						if ((Players.field1382[var5] & 1) == 0) { // L: 161
							if (var1 > 0) { // L: 162
								--var1; // L: 163
								var10000 = Players.field1382; // L: 164
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 167
								if (var4 == 0) { // L: 168
									var1 = class276.method5574(var0); // L: 169
									var10000 = Players.field1382; // L: 170
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (class362.updateExternalPlayer(var0, var5)) { // L: 173
									var10000 = Players.field1382;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 176
					if (var1 != 0) { // L: 177
						throw new RuntimeException(); // L: 178
					} else {
						Players.Players_count = 0; // L: 180
						Players.Players_emptyIdxCount = 0; // L: 181

						for (var2 = 1; var2 < 2048; ++var2) { // L: 182
							var10000 = Players.field1382; // L: 183
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 184
							if (var3 != null) { // L: 185
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 186
							}
						}

					}
				}
			}
		}
	} // L: 188

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1212711374"
	)
	static final void method2161(int var0, int var1) {
		if (class243.field2620.method6285(var0)) { // L: 12022
			class286.runComponentCloseListeners(class243.field2620.field3645[var0], var1); // L: 12023
		}
	} // L: 12024
}
