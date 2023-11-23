import java.awt.FontMetrics;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public enum class6 implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	field16(0, 0);

	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("bl")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 223509121
	)
	static int field14;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1498234591
	)
	final int field11;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1418543363
	)
	final int field12;

	class6(int var3, int var4) {
		this.field11 = var3; // L: 16
		this.field12 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field12; // L: 22
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;ZII)V",
		garbageValue = "-1391050872"
	)
	static void method44(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (class384.clearLoginScreen) { // L: 223
			if (var3 == 4) { // L: 224
				UserComparator7.method2966(4); // L: 225
			}

		} else {
			if (var3 == 0) { // L: 229
				ClientPreferences.method2645(var2); // L: 230
			} else {
				UserComparator7.method2966(var3); // L: 233
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 235
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 236
			class250.leftTitleSprite = WorldMapArchiveLoader.method8710(var4); // L: 237
			Login.rightTitleSprite = class250.leftTitleSprite.mirrorHorizontally(); // L: 238
			MenuAction.method2140(var1, Client.worldProperties); // L: 239
			Login.titleboxSprite = class313.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 240
			Login.field897 = class313.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 241
			Login.field898 = class313.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 242
			class11.field47 = class313.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 243
			class313.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 244
			class134.field1580 = Skills.method6857(var1, "runes", ""); // L: 245
			Login.title_muteSprite = Skills.method6857(var1, "title_mute", ""); // L: 246
			class310.field3386 = class313.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 247
			Login.field902 = class313.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 248
			FriendsList.field4665 = class313.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 249
			GrandExchangeEvents.field4344 = class313.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 250
			NPCComposition.field1966 = class310.field3386.subWidth; // L: 251
			class113.field1426 = class310.field3386.subHeight; // L: 252
			EnumComposition.loginScreenRunesAnimation = new LoginScreenAnimation(class134.field1580); // L: 253
			if (var2) { // L: 254
				Login.Login_username = ""; // L: 255
				Login.Login_password = ""; // L: 256
				Login.field907 = new String[8]; // L: 257
				Login.field915 = 0; // L: 258
			}

			class53.field350 = 0; // L: 260
			class187.otp = ""; // L: 261
			Login.field920 = true; // L: 262
			Login.worldSelectOpen = false; // L: 263
			if (!WorldMapIcon_1.clientPreferences.method2631()) { // L: 264
				ArrayList var5 = new ArrayList(); // L: 265
				var5.add(new class328(class514.field5059, "scape main", "", 255, false)); // L: 266
				PendingSpawn.method2459(var5, 0, 0, 0, 100, false); // L: 267
			} else {
				WorldMapManager.method4769(0, 0); // L: 269
			}

			class472.method8564(); // L: 270
			class157.method3396().method7045(false); // L: 271
			class384.clearLoginScreen = true; // L: 272
			Login.xPadding = (Language.canvasWidth - 765) / 2; // L: 273
			Login.loginBoxX = Login.xPadding + 202; // L: 274
			class157.loginBoxCenter = Login.loginBoxX + 180; // L: 275
			class250.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 276
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 277
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 278
		}
	} // L: 227 279

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Luz;",
		garbageValue = "-328465387"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 377
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 378
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38) + ((long)var3 << 42); // L: 379
		SpritePixels var8;
		if (!var5) { // L: 381
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 382
			if (var8 != null) { // L: 383
				return var8;
			}
		}

		ItemComposition var9 = class214.ItemComposition_get(var0); // L: 385
		if (var1 > 1 && var9.countobj != null) { // L: 386
			int var10 = -1; // L: 387

			for (int var11 = 0; var11 < 10; ++var11) { // L: 388
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 389
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 391
				var9 = class214.ItemComposition_get(var10);
			}
		}

		Model var22 = var9.getModel(1); // L: 393
		if (var22 == null) { // L: 394
			return null;
		} else {
			SpritePixels var23 = null; // L: 395
			if (var9.noteTemplate != -1) { // L: 396
				var23 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 397
				if (var23 == null) { // L: 398
					return null;
				}
			} else if (var9.notedId != -1) { // L: 400
				var23 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 401
				if (var23 == null) { // L: 402
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 404
				var23 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 405
				if (var23 == null) { // L: 406
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 408
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 409
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 410
			float[] var15 = Rasterizer2D.field5209; // L: 411
			int[] var16 = new int[4]; // L: 412
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 413
			var8 = new SpritePixels(36, 32); // L: 414
			Rasterizer3D.method5263(var8.pixels, 36, 32, (float[])null); // L: 415
			Rasterizer2D.Rasterizer2D_clear(); // L: 416
			Rasterizer3D.method5203(); // L: 417
			Rasterizer3D.method5206(16, 16); // L: 418
			Rasterizer3D.field2772.field3038 = false; // L: 419
			if (var9.placeholderTemplate != -1) { // L: 420
				var23.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 421
			if (var5) { // L: 422
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) { // L: 423
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 424
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 425
			var22.calculateBoundsCylinder(); // L: 426
			var22.method5558(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var22.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 427
			if (var9.notedId != -1) { // L: 428
				var23.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 429
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 430
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 431
				var8.shadow(var3);
			}

			Rasterizer3D.method5263(var8.pixels, 36, 32, (float[])null); // L: 432
			if (var9.noteTemplate != -1) { // L: 433
				var23.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 434
				Font var20 = TaskHandler.field2277; // L: 435
				String var21;
				if (var1 < 100000) { // L: 438
					var21 = "<col=ffff00>" + var1 + "</col>"; // L: 439
				} else if (var1 < 10000000) { // L: 442
					var21 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>"; // L: 443
				} else {
					var21 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>"; // L: 446
				}

				var20.draw(var21, 0, 9, 16776960, 1); // L: 448
			}

			if (!var5) { // L: 450
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method5263(var12, var13, var14, var15); // L: 451
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 452
			Rasterizer3D.method5203(); // L: 453
			Rasterizer3D.field2772.field3038 = true; // L: 454
			return var8; // L: 455
		}
	}
}
