import java.io.IOException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field1981(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	field1982(1, 2);

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 783030441
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1013940965
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("at")
	public static String method3685(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0)); // L: 31
		int var2 = Calendar.Calendar_calendar.get(7); // L: 32
		int var3 = Calendar.Calendar_calendar.get(5); // L: 33
		int var4 = Calendar.Calendar_calendar.get(2); // L: 34
		int var5 = Calendar.Calendar_calendar.get(1); // L: 35
		int var6 = Calendar.Calendar_calendar.get(11); // L: 36
		int var7 = Calendar.Calendar_calendar.get(12); // L: 37
		int var8 = Calendar.Calendar_calendar.get(13); // L: 38
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT"; // L: 39
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;ZIB)V",
		garbageValue = "-22"
	)
	static void method3679(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 206
			if (var3 == 4) { // L: 207
				class390.method7249(4); // L: 208
			}

		} else {
			if (var3 == 0) { // L: 212
				class164.method3362(var2); // L: 213
			} else {
				class390.method7249(var3); // L: 216
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 218
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 219
			Decimator.leftTitleSprite = Interpreter.method2032(var4); // L: 220
			Login.rightTitleSprite = Decimator.leftTitleSprite.mirrorHorizontally(); // L: 221
			int var5 = Client.worldProperties; // L: 222
			if ((var5 & 536870912) != 0) { // L: 224
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 225
			} else if ((var5 & 1073741824) != 0) { // L: 227
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 228
			} else if ((var5 & 256) != 0) { // L: 230
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", ""); // L: 231
			} else {
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 234
			}

			class481.titleboxSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 237
			Login.field921 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 238
			ParamComposition.field2110 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 239
			UserComparator8.field1416 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 240
			WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 241
			Login.field920 = WorldMapRectangle.method5460(var1, "runes", ""); // L: 242
			SpriteMask.title_muteSprite = WorldMapRectangle.method5460(var1, "title_mute", ""); // L: 243
			class104.field1322 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 244
			DynamicObject.field1008 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 245
			class177.field1856 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 246
			NPC.field1290 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 247
			class251.field2858 = class104.field1322.subWidth; // L: 248
			class60.field443 = class104.field1322.subHeight; // L: 249
			class237.loginScreenRunesAnimation = new LoginScreenAnimation(Login.field920); // L: 250
			if (var2) { // L: 251
				Login.Login_username = ""; // L: 252
				Login.Login_password = ""; // L: 253
				Login.field938 = new String[8]; // L: 254
				Login.field935 = 0; // L: 255
			}

			class322.field3521 = 0; // L: 257
			SoundSystem.otp = ""; // L: 258
			Login.field942 = true; // L: 259
			Login.worldSelectOpen = false; // L: 260
			if (!class10.clientPreferences.method2437()) { // L: 261
				LoginPacket.method5679(2, ReflectionCheck.archive6, "scape main", "", 255, false);
			} else {
				class304.musicPlayerStatus = 1; // L: 263
				UserComparator9.musicTrackArchive = null; // L: 264
				VarbitComposition.musicTrackGroupId = -1; // L: 265
				class304.musicTrackFileId = -1; // L: 266
				class304.musicTrackVolume = 0; // L: 267
				class132.musicTrackBoolean = false; // L: 268
				class157.pcmSampleLength = 2; // L: 269
			}

			if (NetCache.NetCache_socket != null) { // L: 272
				try {
					Buffer var6 = new Buffer(4); // L: 274
					var6.writeByte(3); // L: 275
					var6.writeMedium(0); // L: 276
					NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 277
				} catch (IOException var9) {
					try {
						NetCache.NetCache_socket.close(); // L: 281
					} catch (Exception var8) { // L: 283
					}

					++NetCache.NetCache_ioExceptions; // L: 284
					NetCache.NetCache_socket = null; // L: 285
				}
			}

			Login.clearLoginScreen = true; // L: 288
			Login.xPadding = (class448.canvasWidth - 765) / 2; // L: 289
			Login.loginBoxX = Login.xPadding + 202; // L: 290
			class485.loginBoxCenter = Login.loginBoxX + 180; // L: 291
			Decimator.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 292
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 293
			class13.logoSprite.drawAt(Login.xPadding + 382 - class13.logoSprite.subWidth / 2, 18); // L: 294
		}
	} // L: 210 295
}
