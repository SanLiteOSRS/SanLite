import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class129 implements class119 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;ZIS)V",
		garbageValue = "222"
	)
	static void method3086(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 205
			if (var3 == 4) { // L: 206
				ReflectionCheck.method696(4); // L: 207
			}

		} else {
			if (var3 == 0) { // L: 211
				GrandExchangeOfferNameComparator.method6672(var2); // L: 212
			} else {
				ReflectionCheck.method696(var3); // L: 215
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 217
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 218
			Login.leftTitleSprite = class266.method5471(var4); // L: 219
			class275.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally(); // L: 220
			ObjectComposition.method3948(var1, Client.worldProperties); // L: 221
			class147.titleboxSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 222
			Login.titlebuttonSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 223
			class19.field109 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 224
			Canvas.field140 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 225
			VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 226
			Login.runesSprite = class125.method3066(var1, "runes", ""); // L: 227
			Login.title_muteSprite = class125.method3066(var1, "title_mute", ""); // L: 228
			Login.field932 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 229
			ChatChannel.field1005 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 230
			Login.field910 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 231
			class100.field1335 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 232
			WorldMapRectangle.field2963 = Login.field932.subWidth; // L: 233
			class134.field1613 = Login.field932.subHeight; // L: 234
			class305.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 235
			if (var2) { // L: 236
				Login.Login_username = ""; // L: 237
				Login.Login_password = ""; // L: 238
				Login.field926 = new String[8]; // L: 239
				Login.field925 = 0; // L: 240
			}

			UserComparator4.field1429 = 0; // L: 242
			InvDefinition.otp = ""; // L: 243
			Login.field930 = true; // L: 244
			Login.worldSelectOpen = false; // L: 245
			if (!PacketWriter.clientPreferences.method2570()) { // L: 246
				WorldMapScaleHandler.method5467(2, class153.archive6, "scape main", "", 255, false);
			} else {
				KeyHandler.method430(2); // L: 247
			}

			if (NetCache.NetCache_socket != null) { // L: 249
				try {
					Buffer var5 = new Buffer(4); // L: 251
					var5.writeByte(3); // L: 252
					var5.writeMedium(0); // L: 253
					NetCache.NetCache_socket.write(var5.array, 0, 4); // L: 254
				} catch (IOException var8) {
					try {
						NetCache.NetCache_socket.close(); // L: 258
					} catch (Exception var7) { // L: 260
					}

					++NetCache.NetCache_ioExceptions; // L: 261
					NetCache.NetCache_socket = null; // L: 262
				}
			}

			Login.clearLoginScreen = true; // L: 265
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 266
			Login.loginBoxX = Login.xPadding + 202; // L: 267
			class143.loginBoxCenter = Login.loginBoxX + 180; // L: 268
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 269
			class275.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 270
			class33.logoSprite.drawAt(Login.xPadding + 382 - class33.logoSprite.subWidth / 2, 18); // L: 271
		}
	} // L: 209 272
}
