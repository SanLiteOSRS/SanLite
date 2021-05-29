import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class179 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class179 field2100;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static final class179 field2099;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1748165695
	)
	@Export("value")
	final int value;

	static {
		field2100 = new class179(0);
		field2099 = new class179(1);
	}

	class179(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljp;II)V",
		garbageValue = "-2058248289"
	)
	static void method3633(Archive var0, int var1) {
		if (class125.NetCache_reference != null) {
			class125.NetCache_reference.offset = var1 * 8 + 5;
			int var2 = class125.NetCache_reference.readInt();
			int var3 = class125.NetCache_reference.readInt();
			var0.loadIndex(var2, var3);
		} else {
			DirectByteArrayCopier.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljv;ZII)V",
		garbageValue = "-905944907"
	)
	static void method3634(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				Login.loginIndex = 4;
			}

		} else {
			Login.loginIndex = var3;
			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Login.leftTitleSprite = ParamComposition.convertJpgToSprite(var4);
			class20.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
			GrandExchangeOfferAgeComparator.method5068(var1, Client.worldProperties);
			class260.titleboxSprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			int var6 = var1.getGroupId("runes");
			int var7 = var1.getFileId(var6, "");
			IndexedSprite[] var5 = VerticalAlignment.method2799(var1, var6, var7);
			Login.runesSprite = var5;
			var7 = var1.getGroupId("title_mute");
			int var8 = var1.getFileId(var7, "");
			IndexedSprite[] var9 = VerticalAlignment.method2799(var1, var7, var8);
			Decimator.title_muteSprite = var9;
			FriendSystem.options_buttons_0Sprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Decimator.field553 = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			GrandExchangeOffer.options_buttons_2Sprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class3.field33 = EnumComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			Skeleton.field2287 = FriendSystem.options_buttons_0Sprite.subWidth;
			WorldMapIcon_1.field1937 = FriendSystem.options_buttons_0Sprite.subHeight;
			class24.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			class5.field53 = 0;
			Varps.otp = "";
			Login.field1043 = true;
			Login.worldSelectOpen = false;
			if (!ObjectComposition.clientPreferences.titleMusicDisabled) {
				class6.method60(2, UrlRequest.archive6, "scape main", "", 255, false);
			} else {
				class159.method3192(2);
			}

			StudioGame.method4847(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (class32.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			UserComparator4.loginBoxCenter = Login.loginBoxX + 180;
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			class20.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Fonts.logoSprite.drawAt(Login.xPadding + 382 - Fonts.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)I",
		garbageValue = "4030"
	)
	public static int method3635(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}
}
