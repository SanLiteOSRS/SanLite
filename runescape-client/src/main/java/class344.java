import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class344 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	UrlRequest field3651;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	SpritePixels field3650;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;)V"
	)
	class344(String var1, UrlRequester var2) {
		try {
			this.field3651 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3651 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Leb;)V"
	)
	class344(UrlRequest var1) {
		this.field3651 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "-750205083"
	)
	SpritePixels method6459() {
		if (this.field3650 == null && this.field3651 != null && this.field3651.isDone()) { // L: 28
			if (this.field3651.getResponse() != null) { // L: 29
				this.field3650 = class202.method3920(this.field3651.getResponse()); // L: 30
			}

			this.field3651 = null; // L: 32
		}

		return this.field3650; // L: 34
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-283741013"
	)
	public static boolean method6465(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) { // L: 61
			return true;
		} else {
			if (var0 != 0) { // L: 62
				char[] var1 = class403.cp1252AsciiExtension; // L: 64

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 65
					char var3 = var1[var2]; // L: 66
					if (var0 == var3) { // L: 68
						return true; // L: 69
					}
				}
			}

			return false; // L: 75
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;ZII)V",
		garbageValue = "2137737759"
	)
	static void method6458(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 232
			if (var3 == 4) { // L: 233
				JagexCache.method4224(4); // L: 234
			}

		} else {
			if (var3 == 0) { // L: 238
				PacketBufferNode.method6050(var2); // L: 239
			} else {
				JagexCache.method4224(var3); // L: 242
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 244
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 245
			Login.leftTitleSprite = class202.method3920(var4); // L: 246
			WorldMapLabelSize.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally(); // L: 247
			class213.method4205(var1, Client.worldProperties); // L: 248
			class155.titleboxSprite = class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 249
			Login.field964 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 250
			Login.field944 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 251
			class90.field1121 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 252
			class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 253
			Login.field942 = FloorOverlayDefinition.method4031(var1, "runes", ""); // L: 254
			class169.title_muteSprite = FloorOverlayDefinition.method4031(var1, "title_mute", ""); // L: 255
			class128.field1508 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 256
			UserComparator2.field5265 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 257
			class472.field4868 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 258
			class557.field5358 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 259
			FriendSystem.field859 = class128.field1508.subWidth; // L: 260
			class316.field3448 = class128.field1508.subHeight; // L: 261
			class325.loginScreenRunesAnimation = new LoginScreenAnimation(Login.field942); // L: 262
			if (var2) { // L: 263
				Login.Login_username = ""; // L: 264
				Login.Login_password = ""; // L: 265
				Login.field962 = new String[8]; // L: 266
				Login.field961 = 0; // L: 267
			}

			class36.field247 = 0; // L: 269
			MenuAction.otp = ""; // L: 270
			Login.field966 = true; // L: 271
			Login.worldSelectOpen = false; // L: 272
			if (!class30.clientPreferences.method2580()) { // L: 274
				ArrayList var5 = new ArrayList(); // L: 275
				var5.add(new class333(Renderable.field2921, "scape main", "", 255, false)); // L: 276
				PacketWriter.method2891(var5, 0, 0, 0, 100, false); // L: 277
			} else {
				class169.method3521(0, 0); // L: 279
			}

			GrandExchangeOfferOwnWorldComparator.method1192(); // L: 281
			Fonts.method9109().method7212(false); // L: 282
			Login.clearLoginScreen = true; // L: 283
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 284
			Login.loginBoxX = Login.xPadding + 202; // L: 285
			Login.loginBoxCenter = Login.loginBoxX + 180; // L: 286
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 287
			WorldMapLabelSize.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 288
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 289
		}
	} // L: 236 290
}
