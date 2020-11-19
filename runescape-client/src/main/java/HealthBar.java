import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1819103189
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1100752365
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lix;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ljs;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		signature = "(Lix;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "184587772"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)Lce;",
		garbageValue = "1695918285"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "112420094"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method4990();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Liw;Liw;ZII)V",
		garbageValue = "265238448"
	)
	static void method2141(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				Login.loginIndex = 4;
			}

		} else {
			Login.loginIndex = var3;
			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Login.leftTitleSprite = class39.convertJpgToSprite(var4);
			Login.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
			AbstractArchive.method4386(var1, Client.worldProperties);
			Tiles.titleboxSprite = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			int var6 = var1.getGroupId("runes");
			int var7 = var1.getFileId(var6, "");
			IndexedSprite[] var5 = UserComparator5.method3540(var1, var6, var7);
			class278.runesSprite = var5;
			var7 = var1.getGroupId("title_mute");
			int var8 = var1.getFileId(var7, "");
			IndexedSprite[] var10 = UserComparator5.method3540(var1, var7, var8);
			DefaultsGroup.title_muteSprite = var10;
			Login.options_buttons_0Sprite = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class69.field583 = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			Login.options_buttons_2Sprite = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			DevicePcmPlayerProvider.field439 = Canvas.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class225.field2576 = Login.options_buttons_0Sprite.subWidth;
			class232.field2780 = Login.options_buttons_0Sprite.subHeight;
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(class278.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			class169.field2035 = 0;
			EnumComposition.otp = "";
			Login.field1227 = true;
			Login.worldSelectOpen = false;
			if (!GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled) {
				Archive var11 = ApproximateRouteStrategy.archive6;
				var8 = var11.getGroupId("scape main");
				int var9 = var11.getFileId(var8, "");
				class206.musicPlayerStatus = 1;
				class23.musicTrackArchive = var11;
				TileItem.musicTrackGroupId = var8;
				class206.musicTrackFileId = var9;
				class206.musicTrackVolume = 255;
				class195.musicTrackBoolean = false;
				MusicPatch.pcmSampleLength = 2;
			} else {
				VertexNormal.method3133(2);
			}

			WorldMapSection0.method323(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (ItemContainer.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			AttackOption.loginBoxCenter = Login.loginBoxX + 180;
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			SecureRandomFuture.logoSprite.drawAt(Login.xPadding + 382 - SecureRandomFuture.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-614067797"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = "";
		Login.Login_response2 = "Enter your username/email & password.";
		Login.Login_response3 = "";
		Login.loginIndex = 2;
		if (var0) {
			Login.Login_password = "";
		}

		MusicPatch.method4038();
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}
}
