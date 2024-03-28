import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public class class306 {
	@ObfuscatedName("ad")
	static int[][] field3195;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;ZII)V",
		garbageValue = "1373698387"
	)
	static void method5907(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 232
			if (var3 == 4) { // L: 233
				class210.method3930(4); // L: 234
			}

		} else {
			if (var3 == 0) { // L: 238
				class172.method3497(var2); // L: 239
			} else {
				class210.method3930(var3); // L: 242
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 244
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 245
			class430.leftTitleSprite = GrandExchangeOfferUnitPriceComparator.method7149(var4); // L: 246
			Login.rightTitleSprite = class430.leftTitleSprite.mirrorHorizontally(); // L: 247
			GrandExchangeEvents.method7082(var1, Client.worldProperties); // L: 248
			Login.titleboxSprite = class153.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 249
			Login.field925 = class153.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 250
			class86.field1065 = class153.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 251
			class179.field1901 = class153.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 252
			class153.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 253
			Login.field941 = class416.method7648(var1, "runes", ""); // L: 254
			ApproximateRouteStrategy.title_muteSprite = class416.method7648(var1, "title_mute", ""); // L: 255
			class27.field125 = class153.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 256
			TriBool.field4811 = class153.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 257
			class140.field1658 = class153.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 258
			class443.field4751 = class153.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 259
			MouseHandler.field228 = class27.field125.subWidth; // L: 260
			class227.field2427 = class27.field125.subHeight * 61063424; // L: 261
			class59.loginScreenRunesAnimation = new LoginScreenAnimation(Login.field941); // L: 262
			if (var2) { // L: 263
				Login.Login_username = ""; // L: 264
				Login.Login_password = ""; // L: 265
				Login.field931 = new String[8]; // L: 266
				Login.field946 = 0; // L: 267
			}

			SpriteMask.field3628 = 0; // L: 269
			class27.otp = ""; // L: 270
			Login.field951 = true; // L: 271
			Login.worldSelectOpen = false; // L: 272
			if (!NPC.clientPreferences.method2463()) { // L: 274
				ArrayList var5 = new ArrayList(); // L: 275
				var5.add(new class333(UserComparator6.field1508, "scape main", "", 255, false)); // L: 276
				Renderable.method4881(var5, 0, 0, 0, 100, false); // L: 277
			} else {
				class11.method108(0, 0); // L: 279
			}

			UserComparator5.method2897(); // L: 281
			class341.method6299().method7052(false); // L: 282
			Login.clearLoginScreen = true; // L: 283
			Login.xPadding = (class148.canvasWidth - 765) / 2; // L: 284
			Login.loginBoxX = Login.xPadding + 202; // L: 285
			ReflectionCheck.loginBoxCenter = Login.loginBoxX + 180; // L: 286
			class430.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 287
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 288
			class390.logoSprite.drawAt(Login.xPadding + 382 - class390.logoSprite.subWidth / 2, 18); // L: 289
		}
	} // L: 236 290
}
