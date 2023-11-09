import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public class class292 {
	@ObfuscatedName("js")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;ZIB)V",
		garbageValue = "1"
	)
	static void method5740(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 207
			if (var3 == 4) { // L: 208
				ObjectSound.method1926(4); // L: 209
			}

		} else {
			if (var3 == 0) { // L: 213
				class93.method2410(var2); // L: 214
			} else {
				ObjectSound.method1926(var3); // L: 217
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 219
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 220
			class372.leftTitleSprite = class496.method8837(var4); // L: 221
			class391.rightTitleSprite = class372.leftTitleSprite.mirrorHorizontally(); // L: 222
			World.method1856(var1, Client.worldProperties); // L: 223
			Login.titleboxSprite = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 224
			class308.field3453 = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 225
			class134.field1588 = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 226
			class135.field1595 = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 227
			UserComparator4.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 228
			IndexedSprite[] var5;
			int var7;
			if (!var1.isValidFileName("runes", "")) { // L: 231
				var5 = null; // L: 232
			} else {
				int var6 = var1.getGroupId("runes"); // L: 235
				var7 = var1.getFileId(var6, ""); // L: 236
				byte[] var10 = var1.takeFile(var6, var7); // L: 241
				boolean var9;
				if (var10 == null) { // L: 242
					var9 = false; // L: 243
				} else {
					GrandExchangeEvent.SpriteBuffer_decode(var10); // L: 246
					var9 = true; // L: 247
				}

				IndexedSprite[] var8;
				if (!var9) { // L: 249
					var8 = null; // L: 250
				} else {
					var8 = class231.method4797(); // L: 253
				}

				var5 = var8; // L: 255
			}

			Login.field915 = var5; // L: 257
			IndexedSprite[] var15;
			if (!var1.isValidFileName("title_mute", "")) { // L: 260
				var15 = null; // L: 261
			} else {
				var7 = var1.getGroupId("title_mute"); // L: 264
				int var12 = var1.getFileId(var7, ""); // L: 265
				byte[] var11 = var1.takeFile(var7, var12); // L: 270
				boolean var13;
				if (var11 == null) { // L: 271
					var13 = false; // L: 272
				} else {
					GrandExchangeEvent.SpriteBuffer_decode(var11); // L: 275
					var13 = true; // L: 276
				}

				IndexedSprite[] var14;
				if (!var13) { // L: 278
					var14 = null; // L: 279
				} else {
					var14 = class231.method4797(); // L: 282
				}

				var15 = var14; // L: 284
			}

			Message.title_muteSprite = var15; // L: 286
			FloorUnderlayDefinition.field2095 = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 287
			class218.field2401 = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 288
			MenuAction.field907 = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 289
			Buffer.field5063 = UserComparator4.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 290
			class352.field4209 = FloorUnderlayDefinition.field2095.subWidth; // L: 291
			DevicePcmPlayerProvider.field105 = FloorUnderlayDefinition.field2095.subHeight; // L: 292
			ModelData0.loginScreenRunesAnimation = new LoginScreenAnimation(Login.field915); // L: 293
			if (var2) { // L: 294
				Login.Login_username = ""; // L: 295
				Login.Login_password = ""; // L: 296
				Login.field936 = new String[8]; // L: 297
				Login.field918 = 0; // L: 298
			}

			Skills.field3830 = 0; // L: 300
			class165.otp = ""; // L: 301
			Login.field917 = true; // L: 302
			Login.worldSelectOpen = false; // L: 303
			if (!ScriptFrame.clientPreferences.method2507()) { // L: 304
				ArrayList var16 = new ArrayList(); // L: 305
				var16.add(new class317(class329.archive11, "scape main", "", 255, false)); // L: 306
				NPCComposition.method3873(var16, 0, 0, 0, 100, false); // L: 307
			} else {
				class90.method2339(0, 0); // L: 309
			}

			WorldMapDecorationType.method6641(); // L: 310
			class359 var17 = class101.field1332; // L: 313
			var17.method6861(false); // L: 315
			Login.clearLoginScreen = true; // L: 316
			Login.xPadding = (VarbitComposition.canvasWidth - 765) / 2; // L: 317
			Login.loginBoxX = Login.xPadding + 202; // L: 318
			class324.loginBoxCenter = Login.loginBoxX + 180; // L: 319
			class372.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 320
			class391.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 321
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 322
		}
	} // L: 211 323
}
