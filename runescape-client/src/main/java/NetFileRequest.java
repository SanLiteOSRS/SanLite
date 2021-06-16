import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static IndexedSprite field3577;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1109753371
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("v")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lkj;Lkj;I)V",
		garbageValue = "1099473080"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (AttackOption.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class25.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			class27.method353(var0, var1);
		} else {
			class339.leftTitleSprite.drawAt(Login.xPadding, 0);
			class377.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Messages.logoSprite.drawAt(Login.xPadding + 382 - Messages.logoSprite.subWidth / 2, 18);
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) {
				byte var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			short var16;
			int var17;
			short var18;
			if (Client.gameState == 20) {
				Coord.titleboxSprite.drawAt(Login.loginBoxX + 180 - Coord.titleboxSprite.subWidth / 2, 271 - Coord.titleboxSprite.subHeight / 2);
				var16 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
				var17 = var16 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
				var17 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
				var17 += 15;
				var17 += 7;
				if (Login.loginIndex != 4) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var17, 16777215, 0);
					var18 = 200;

					for (var5 = class17.method255(); var0.stringWidth(var5) > var18; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var17, 16777215, 0);
					var17 += 15;

					for (var6 = class22.method315(Login.Login_password); var0.stringWidth(var6) > var18; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var17, 16777215, 0);
					var17 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				Coord.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var11;
				if (Login.loginIndex == 0) {
					var16 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var16, 16776960, 0);
					var17 = var16 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var11 = 291;
					class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawLines("New User", var4 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawLines("Existing User", var4 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var16 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0);
					var17 = var16 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0);
					var17 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0);
					var17 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var11 = 321;
					class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawCentered("Continue", var4, var11 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawCentered("Cancel", var4, var11 + 5, 16777215, 0);
				} else {
					int var7;
					if (Login.loginIndex == 2) {
						var16 = 201;
						var0.drawCentered(Login.Login_response1, class25.loginBoxCenter, var16, 16776960, 0);
						var17 = var16 + 15;
						var0.drawCentered(Login.Login_response2, class25.loginBoxCenter, var17, 16776960, 0);
						var17 += 15;
						var0.drawCentered(Login.Login_response3, class25.loginBoxCenter, var17, 16776960, 0);
						var17 += 15;
						var17 += 7;
						var0.draw("Login: ", class25.loginBoxCenter - 110, var17, 16777215, 0);
						var18 = 200;

						for (var5 = class17.method255(); var0.stringWidth(var5) > var18; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? SecureRandomFuture.colorStartTag(16776960) + "|" : ""), class25.loginBoxCenter - 70, var17, 16777215, 0);
						var17 += 15;

						for (var6 = class22.method315(Login.Login_password); var0.stringWidth(var6) > var18; var6 = var6.substring(1)) {
						}

						var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? SecureRandomFuture.colorStartTag(16776960) + "|" : ""), class25.loginBoxCenter - 108, var17, 16777215, 0);
						var17 += 15;
						var16 = 277;
						var7 = class25.loginBoxCenter + -117;
						IndexedSprite var14 = Archive.method5021(Client.Login_isUsernameRemembered, Login.field1006);
						var14.drawAt(var7, var16);
						var7 = var7 + var14.subWidth + 5;
						var1.draw("Remember username", var7, var16 + 13, 16776960, 0);
						var7 = class25.loginBoxCenter + 24;
						var14 = Archive.method5021(class4.clientPreferences.hideUsername, Login.field1021);
						var14.drawAt(var7, var16);
						var7 = var7 + var14.subWidth + 5;
						var1.draw("Hide username", var7, var16 + 13, 16776960, 0);
						var17 = var16 + 15;
						int var9 = class25.loginBoxCenter - 80;
						short var10 = 321;
						class289.titlebuttonSprite.drawAt(var9 - 73, var10 - 20);
						var0.drawCentered("Login", var9, var10 + 5, 16777215, 0);
						var9 = class25.loginBoxCenter + 80;
						class289.titlebuttonSprite.drawAt(var9 - 73, var10 - 20);
						var0.drawCentered("Cancel", var9, var10 + 5, 16777215, 0);
						var16 = 357;
						switch(Login.field1012) {
						case 2:
							class215.field2557 = "Having trouble logging in?";
							break;
						default:
							class215.field2557 = "Can't login? Click here.";
						}

						Client.field903 = new Bounds(class25.loginBoxCenter, var16, var1.stringWidth(class215.field2557), 11);
						DefaultsGroup.field3891 = new Bounds(class25.loginBoxCenter, var16, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(class215.field2557, class25.loginBoxCenter, var16, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var16 = 201;
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var16, 16776960, 0);
						var17 = var16 + 20;
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var17, 16776960, 0);
						var17 += 15;
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var17, 16776960, 0);
						var17 += 15;
						var4 = Login.loginBoxX + 180;
						var11 = 276;
						class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
						var2.drawCentered("Try again", var4, var11 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var11 = 326;
						class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
						var2.drawCentered("Forgotten password?", var4, var11 + 5, 16777215, 0);
					} else {
						short var8;
						if (Login.loginIndex == 4) {
							var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
							var16 = 236;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0);
							var17 = var16 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var0.draw("PIN: " + class22.method315(ItemLayer.otp) + (Client.cycle % 40 < 20 ? SecureRandomFuture.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var17, 16777215, 0);
							var17 -= 8;
							var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var17, 16776960, 0);
							var17 += 15;
							var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var17, 16776960, 0);
							var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
							int var21 = var17 - var0.ascent;
							IndexedSprite var19;
							if (Login.field1022) {
								var19 = WorldMapCacheName.options_buttons_2Sprite;
							} else {
								var19 = Login.options_buttons_0Sprite;
							}

							var19.drawAt(var4, var21);
							var17 += 15;
							var7 = Login.loginBoxX + 180 - 80;
							var8 = 321;
							class289.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0);
							var7 = Login.loginBoxX + 180 + 80;
							class289.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0);
							var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0);
						} else if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var16 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var17 += 14;
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var17, 16777215, 0);
							var18 = 174;

							for (var5 = class17.method255(); var0.stringWidth(var5) > var18; var5 = var5.substring(1)) {
							}

							var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? SecureRandomFuture.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var17, 16777215, 0);
							var17 += 15;
							int var13 = Login.loginBoxX + 180 - 80;
							short var20 = 321;
							class289.titlebuttonSprite.drawAt(var13 - 73, var20 - 20);
							var0.drawCentered("Recover", var13, var20 + 5, 16777215, 0);
							var13 = Login.loginBoxX + 180 + 80;
							class289.titlebuttonSprite.drawAt(var13 - 73, var20 - 20);
							var0.drawCentered("Back", var13, var20 + 5, 16777215, 0);
							var20 = 356;
							var1.drawCentered("Still having trouble logging in?", class25.loginBoxCenter, var20, 268435455, 0);
						} else if (Login.loginIndex == 6) {
							var16 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180;
							var11 = 321;
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 7) {
							var16 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var11 = 321;
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Set Date of Birth", var4, var11 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 8) {
							var16 = 216;
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var11 = 321;
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Privacy Policy", var4, var11 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 12) {
							var16 = 201;
							String var12 = "";
							var5 = "";
							var6 = "";
							switch(Login.field1011) {
							case 0:
								var12 = "Your account has been disabled.";
								var5 = Strings.field3284;
								var6 = "";
								break;
							case 1:
								var12 = "Account locked as we suspect it has been stolen.";
								var5 = Strings.field3529;
								var6 = "";
								break;
							default:
								class69.Login_promptCredentials(false);
							}

							var0.drawCentered(var12, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var2.drawCentered(var5, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var2.drawCentered(var6, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var7 = Login.loginBoxX + 180;
							var8 = 276;
							class289.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Support Page", var7, var8 + 5, 16777215, 0);
							var7 = Login.loginBoxX + 180;
							var8 = 326;
							class289.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Back", var7, var8 + 5, 16777215, 0);
						} else if (Login.loginIndex == 24) {
							var16 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0);
							var17 = var16 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180;
							var11 = 301;
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Ok", var4, var11 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var15 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var15);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class0.canvasHeight);
				PendingSpawn.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				PendingSpawn.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var15);
			}

			GrandExchangeEvents.title_muteSprite[class4.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && AbstractArchive.clientLanguage == Language.Language_EN) {
				if (class35.field244 != null) {
					var17 = Login.xPadding + 5;
					var18 = 463;
					byte var23 = 100;
					byte var22 = 35;
					class35.field244.drawAt(var17, var18);
					var0.drawCentered("World" + " " + Client.worldId, var23 / 2 + var17, var22 / 2 + var18 - 2, 16777215, 0);
					if (World.World_request != null) {
						var1.drawCentered("Loading...", var23 / 2 + var17, var22 / 2 + var18 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var23 / 2 + var17, var22 / 2 + var18 + 12, 16777215, 0);
					}
				} else {
					class35.field244 = TextureProvider.SpriteBuffer_getIndexedSpriteByName(ModeWhere.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbc;I)V",
		garbageValue = "2038899006"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}
}
