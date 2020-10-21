import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class60 {
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = -685259439
	)
	static int field452;
	@ObfuscatedName("f")
	@Export("applet")
	public static Applet applet;
	@ObfuscatedName("b")
	public static String field453;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		signature = "[Llc;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;

	static {
		applet = null;
		field453 = "";
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Liw;Liw;IZI)Lex;",
		garbageValue = "-908411627"
	)
	public static Frames method984(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "687907076"
	)
	static final void method983(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString();
		DevicePcmPlayerProvider.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lkq;Lkq;Lkq;B)V",
		garbageValue = "106"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (ItemContainer.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		AttackOption.loginBoxCenter = Login.loginBoxX + 180;
		int var7;
		int var8;
		int var10;
		byte var23;
		int var24;
		int var33;
		int var39;
		if (Login.worldSelectOpen) {
			if (EnumComposition.worldSelectBackSprites == null) {
				EnumComposition.worldSelectBackSprites = ParamDefinition.method4677(GrandExchangeOffer.archive8, "sl_back", "");
			}

			IndexedSprite[] var30;
			Archive var31;
			int var32;
			if (FaceNormal.worldSelectFlagSprites == null) {
				var31 = GrandExchangeOffer.archive8;
				var33 = var31.getGroupId("sl_flags");
				var32 = var31.getFileId(var33, "");
				var30 = UserComparator5.method3540(var31, var33, var32);
				FaceNormal.worldSelectFlagSprites = var30;
			}

			if (class301.worldSelectArrows == null) {
				var31 = GrandExchangeOffer.archive8;
				var33 = var31.getGroupId("sl_arrows");
				var32 = var31.getFileId(var33, "");
				var30 = UserComparator5.method3540(var31, var33, var32);
				class301.worldSelectArrows = var30;
			}

			if (GameObject.worldSelectStars == null) {
				var31 = GrandExchangeOffer.archive8;
				var33 = var31.getGroupId("sl_stars");
				var32 = var31.getFileId(var33, "");
				var30 = UserComparator5.method3540(var31, var33, var32);
				GameObject.worldSelectStars = var30;
			}

			if (class323.worldSelectLeftSprite == null) {
				class323.worldSelectLeftSprite = Canvas.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOffer.archive8, "leftarrow", "");
			}

			if (class280.worldSelectRightSprite == null) {
				class280.worldSelectRightSprite = Canvas.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOffer.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (GameObject.worldSelectStars != null) {
				GameObject.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				GameObject.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (class301.worldSelectArrows != null) {
				var39 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					class301.worldSelectArrows[2].drawAt(var39, 4);
				} else {
					class301.worldSelectArrows[0].drawAt(var39, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					class301.worldSelectArrows[3].drawAt(var39 + 15, 4);
				} else {
					class301.worldSelectArrows[1].drawAt(var39 + 15, 4);
				}

				var0.draw("World", var39 + 32, 17, 16777215, -1);
				var24 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					class301.worldSelectArrows[2].drawAt(var24, 4);
				} else {
					class301.worldSelectArrows[0].drawAt(var24, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					class301.worldSelectArrows[3].drawAt(var24 + 15, 4);
				} else {
					class301.worldSelectArrows[1].drawAt(var24 + 15, 4);
				}

				var0.draw("Players", var24 + 32, 17, 16777215, -1);
				var33 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					class301.worldSelectArrows[2].drawAt(var33, 4);
				} else {
					class301.worldSelectArrows[0].drawAt(var33, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					class301.worldSelectArrows[3].drawAt(var33 + 15, 4);
				} else {
					class301.worldSelectArrows[1].drawAt(var33 + 15, 4);
				}

				var0.draw("Location", var33 + 32, 17, 16777215, -1);
				var32 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					class301.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					class301.worldSelectArrows[0].drawAt(var32, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					class301.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					class301.worldSelectArrows[1].drawAt(var32 + 15, 4);
				}

				var0.draw("Type", var32 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (EnumComposition.worldSelectBackSprites != null) {
				var23 = 88;
				byte var42 = 19;
				var33 = 765 / (var23 + 1) - 1;
				var32 = 480 / (var42 + 1);

				do {
					var7 = var32;
					var8 = var33;
					if (var32 * (var33 - 1) >= World.World_count) {
						--var33;
					}

					if (var33 * (var32 - 1) >= World.World_count) {
						--var32;
					}

					if (var33 * (var32 - 1) >= World.World_count) {
						--var32;
					}
				} while(var7 != var32 || var8 != var33);

				var7 = (765 - var23 * var33) / (var33 + 1);
				if (var7 > 5) {
					var7 = 5;
				}

				var8 = (480 - var42 * var32) / (var32 + 1);
				if (var8 > 5) {
					var8 = 5;
				}

				int var9 = (765 - var23 * var33 - var7 * (var33 - 1)) / 2;
				var10 = (480 - var42 * var32 - var8 * (var32 - 1)) / 2;
				int var36 = (var32 + World.World_count - 1) / var32;
				Login.worldSelectPagesCount = var36 - var33;
				if (class323.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class323.worldSelectLeftSprite.drawAt(8, HealthBar.canvasHeight / 2 - class323.worldSelectLeftSprite.subHeight / 2);
				}

				if (class280.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					class280.worldSelectRightSprite.drawAt(ItemContainer.canvasWidth - class280.worldSelectRightSprite.subWidth - 8, HealthBar.canvasHeight / 2 - class280.worldSelectRightSprite.subHeight / 2);
				}

				int var12 = var10 + 23;
				int var13 = var9 + Login.xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = Login.worldSelectPage;

				int var17;
				for (var17 = var32 * var16; var17 < World.World_count && var16 - Login.worldSelectPage < var33; ++var17) {
					World var25 = DefaultsGroup.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var25.population);
					if (var25.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var25.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					int var22 = 0;
					byte var21;
					if (var25.isBeta()) {
						if (var25.isMembersOnly()) {
							var21 = 7;
						} else {
							var21 = 6;
						}
					} else if (var25.isDeadman()) {
						var22 = 16711680;
						if (var25.isMembersOnly()) {
							var21 = 5;
						} else {
							var21 = 4;
						}
					} else if (var25.method1880()) {
						if (var25.isMembersOnly()) {
							var21 = 9;
						} else {
							var21 = 8;
						}
					} else if (var25.isPvp()) {
						if (var25.isMembersOnly()) {
							var21 = 3;
						} else {
							var21 = 2;
						}
					} else if (var25.isMembersOnly()) {
						var21 = 1;
					} else {
						var21 = 0;
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var13 + var23 && MouseHandler.MouseHandler_y < var42 + var12 && var19) {
						Login.hoveredWorldIndex = var17;
						EnumComposition.worldSelectBackSprites[var21].drawTransOverlayAt(var13, var12, 128, 16777215);
						var15 = true;
					} else {
						EnumComposition.worldSelectBackSprites[var21].drawAt(var13, var12);
					}

					if (FaceNormal.worldSelectFlagSprites != null) {
						FaceNormal.worldSelectFlagSprites[(var25.isMembersOnly() ? 8 : 0) + var25.location].drawAt(var13 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var25.id), var13 + 15, var42 / 2 + var12 + 5, var22, -1);
					var1.drawCentered(var20, var13 + 60, var42 / 2 + var12 + 5, 268435455, -1);
					var12 = var12 + var8 + var42;
					++var14;
					if (var14 >= var32) {
						var12 = var10 + 23;
						var13 = var13 + var7 + var23;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(DefaultsGroup.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var18 = var1.ascent + 8;
					int var37 = MouseHandler.MouseHandler_y + 25;
					if (var37 + var18 > 480) {
						var37 = MouseHandler.MouseHandler_y - 25 - var18;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var18, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var18, 0);
					var1.drawCentered(DefaultsGroup.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1);
				}
			}

			class22.rasterProvider.drawFull(0, 0);
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			SecureRandomFuture.logoSprite.drawAt(Login.xPadding + 382 - SecureRandomFuture.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var23 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var23, 16777215, -1);
				var24 = 253 - var23;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var24, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var24 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var24 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var24 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var23, 16777215, -1);
			}

			String var26;
			String var27;
			String var28;
			short var38;
			short var40;
			if (Client.gameState == 20) {
				Tiles.titleboxSprite.drawAt(Login.loginBoxX + 180 - Tiles.titleboxSprite.subWidth / 2, 271 - Tiles.titleboxSprite.subHeight / 2);
				var38 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var38, 16776960, 0);
				var39 = var38 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var39, 16776960, 0);
				var39 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var39, 16776960, 0);
				var39 += 15;
				var39 += 7;
				if (Login.loginIndex != 4) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var39, 16777215, 0);
					var40 = 200;
					var26 = GrandExchangeOfferAgeComparator.clientPreferences.hideUsername ? LoginPacket.method3747(Login.Login_username) : Login.Login_username;

					for (var27 = var26; var0.stringWidth(var27) > var40; var27 = var27.substring(0, var27.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var27), Login.loginBoxX + 180 - 70, var39, 16777215, 0);
					var39 += 15;

					for (var28 = LoginPacket.method3747(Login.Login_password); var0.stringWidth(var28) > var40; var28 = var28.substring(1)) {
					}

					var0.draw("Password: " + var28, Login.loginBoxX + 180 - 108, var39, 16777215, 0);
					var39 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				Tiles.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var5;
				if (Login.loginIndex == 0) {
					var38 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var38, 16776960, 0);
					var39 = var38 + 30;
					var24 = Login.loginBoxX + 180 - 80;
					var5 = 291;
					Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
					var0.drawLines("New User", var24 - 73, var5 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var24 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
					var0.drawLines("Existing User", var24 - 73, var5 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var38 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var38, 16777215, 0);
					var39 = var38 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var39, 16777215, 0);
					var39 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var39, 16777215, 0);
					var39 += 15;
					var24 = Login.loginBoxX + 180 - 80;
					var5 = 321;
					Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
					var0.drawCentered("Continue", var24, var5 + 5, 16777215, 0);
					var24 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
					var0.drawCentered("Cancel", var24, var5 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var38 = 201;
					var0.drawCentered(Login.Login_response1, AttackOption.loginBoxCenter, var38, 16776960, 0);
					var39 = var38 + 15;
					var0.drawCentered(Login.Login_response2, AttackOption.loginBoxCenter, var39, 16776960, 0);
					var39 += 15;
					var0.drawCentered(Login.Login_response3, AttackOption.loginBoxCenter, var39, 16776960, 0);
					var39 += 15;
					var39 += 7;
					var0.draw("Login: ", AttackOption.loginBoxCenter - 110, var39, 16777215, 0);
					var40 = 200;
					var26 = GrandExchangeOfferAgeComparator.clientPreferences.hideUsername ? LoginPacket.method3747(Login.Login_username) : Login.Login_username;

					for (var27 = var26; var0.stringWidth(var27) > var40; var27 = var27.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var27) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), AttackOption.loginBoxCenter - 70, var39, 16777215, 0);
					var39 += 15;

					for (var28 = LoginPacket.method3747(Login.Login_password); var0.stringWidth(var28) > var40; var28 = var28.substring(1)) {
					}

					var0.draw("Password: " + var28 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), AttackOption.loginBoxCenter - 108, var39, 16777215, 0);
					var39 += 15;
					var38 = 277;
					var8 = AttackOption.loginBoxCenter + -117;
					IndexedSprite var29 = TaskHandler.method3609(Client.Login_isUsernameRemembered, Login.field1230);
					var29.drawAt(var8, var38);
					var8 = var8 + var29.subWidth + 5;
					var1.draw("Remember username", var8, var38 + 13, 16776960, 0);
					var8 = AttackOption.loginBoxCenter + 24;
					var29 = TaskHandler.method3609(GrandExchangeOfferAgeComparator.clientPreferences.hideUsername, Login.field1229);
					var29.drawAt(var8, var38);
					var8 = var8 + var29.subWidth + 5;
					var1.draw("Hide username", var8, var38 + 13, 16776960, 0);
					var39 = var38 + 15;
					var10 = AttackOption.loginBoxCenter - 80;
					short var11 = 321;
					Login.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
					var0.drawCentered("Login", var10, var11 + 5, 16777215, 0);
					var10 = AttackOption.loginBoxCenter + 80;
					Login.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
					var0.drawCentered("Cancel", var10, var11 + 5, 16777215, 0);
					var38 = 357;
					switch(Login.field1217) {
					case 2:
						UserComparator10.field2002 = "Having trouble logging in?";
						break;
					default:
						UserComparator10.field2002 = "Can't login? Click here.";
					}

					class89.field1163 = new Bounds(AttackOption.loginBoxCenter, var38, var1.stringWidth(UserComparator10.field2002), 11);
					ClientPreferences.field1089 = new Bounds(AttackOption.loginBoxCenter, var38, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(UserComparator10.field2002, AttackOption.loginBoxCenter, var38, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var38 = 201;
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var38, 16776960, 0);
					var39 = var38 + 20;
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var39, 16776960, 0);
					var39 += 15;
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var39, 16776960, 0);
					var39 += 15;
					var24 = Login.loginBoxX + 180;
					var5 = 276;
					Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
					var2.drawCentered("Try again", var24, var5 + 5, 16777215, 0);
					var24 = Login.loginBoxX + 180;
					var5 = 326;
					Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
					var2.drawCentered("Forgotten password?", var24, var5 + 5, 16777215, 0);
				} else {
					short var35;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var38 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var38, 16777215, 0);
						var39 = var38 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var39, 16777215, 0);
						var39 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var39, 16777215, 0);
						var39 += 15;
						var0.draw("PIN: " + LoginPacket.method3747(EnumComposition.otp) + (Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var39, 16777215, 0);
						var39 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var39, 16776960, 0);
						var39 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var39, 16776960, 0);
						var24 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var33 = var39 - var0.ascent;
						IndexedSprite var41;
						if (Login.field1227) {
							var41 = Login.options_buttons_2Sprite;
						} else {
							var41 = Login.options_buttons_0Sprite;
						}

						var41.drawAt(var24, var33);
						var39 += 15;
						var7 = Login.loginBoxX + 180 - 80;
						var35 = 321;
						Login.titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
						var0.drawCentered("Continue", var7, var35 + 5, 16777215, 0);
						var7 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
						var0.drawCentered("Cancel", var7, var35 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var35 + 36, 255, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var38 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var38, 16776960, 0);
						var39 = var38 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var39, 16776960, 0);
						var39 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var39, 16776960, 0);
						var39 += 15;
						var39 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var39, 16777215, 0);
						var40 = 174;
						var26 = GrandExchangeOfferAgeComparator.clientPreferences.hideUsername ? LoginPacket.method3747(Login.Login_username) : Login.Login_username;

						for (var27 = var26; var0.stringWidth(var27) > var40; var27 = var27.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var27) + (Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var39, 16777215, 0);
						var39 += 15;
						var7 = Login.loginBoxX + 180 - 80;
						var35 = 321;
						Login.titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
						var0.drawCentered("Recover", var7, var35 + 5, 16777215, 0);
						var7 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
						var0.drawCentered("Back", var7, var35 + 5, 16777215, 0);
						var35 = 356;
						var1.drawCentered("Still having trouble logging in?", AttackOption.loginBoxCenter, var35, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var38 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var38, 16776960, 0);
						var39 = var38 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var39, 16776960, 0);
						var39 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var39, 16776960, 0);
						var39 += 15;
						var24 = Login.loginBoxX + 180;
						var5 = 321;
						Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
						var0.drawCentered("Back", var24, var5 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						var38 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var38, 16776960, 0);
						var39 = var38 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var39, 16776960, 0);
						var39 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var39, 16776960, 0);
						var39 += 15;
						var24 = Login.loginBoxX + 180 - 80;
						var5 = 321;
						Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
						var0.drawCentered("Set Date of Birth", var24, var5 + 5, 16777215, 0);
						var24 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
						var0.drawCentered("Back", var24, var5 + 5, 16777215, 0);
					} else if (Login.loginIndex == 8) {
						var38 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var38, 16776960, 0);
						var39 = var38 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var39, 16776960, 0);
						var39 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var39, 16776960, 0);
						var39 += 15;
						var24 = Login.loginBoxX + 180 - 80;
						var5 = 321;
						Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
						var0.drawCentered("Privacy Policy", var24, var5 + 5, 16777215, 0);
						var24 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
						var0.drawCentered("Back", var24, var5 + 5, 16777215, 0);
					} else if (Login.loginIndex == 12) {
						var38 = 201;
						String var4 = "";
						var26 = "";
						var27 = "";
						switch(Login.field1216) {
						case 0:
							var4 = "Your account has been disabled.";
							var26 = Strings.field2839;
							var27 = "";
							break;
						case 1:
							var4 = "Account locked as we suspect it has been stolen.";
							var26 = Strings.field3046;
							var27 = "";
							break;
						default:
							HealthBar.Login_promptCredentials(false);
						}

						var0.drawCentered(var4, Login.loginBoxX + 180, var38, 16776960, 0);
						var39 = var38 + 15;
						var2.drawCentered(var26, Login.loginBoxX + 180, var39, 16776960, 0);
						var39 += 15;
						var2.drawCentered(var27, Login.loginBoxX + 180, var39, 16776960, 0);
						var39 += 15;
						var7 = Login.loginBoxX + 180;
						var35 = 276;
						Login.titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
						var0.drawCentered("Support Page", var7, var35 + 5, 16777215, 0);
						var7 = Login.loginBoxX + 180;
						var35 = 326;
						Login.titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
						var0.drawCentered("Back", var7, var35 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var38 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var38, 16777215, 0);
						var39 = var38 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var39, 16777215, 0);
						var39 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var39, 16777215, 0);
						var39 += 15;
						var24 = Login.loginBoxX + 180;
						var5 = 301;
						Login.titlebuttonSprite.drawAt(var24 - 73, var5 - 20);
						var0.drawCentered("Ok", var24, var5 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var3 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var3);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, HealthBar.canvasHeight);
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var3);
			}

			DefaultsGroup.title_muteSprite[GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == FontName.clientLanguage) {
				if (MouseHandler.field523 != null) {
					var39 = Login.xPadding + 5;
					var40 = 463;
					byte var34 = 100;
					byte var6 = 35;
					MouseHandler.field523.drawAt(var39, var40);
					var0.drawCentered("World" + " " + Client.worldId, var34 / 2 + var39, var6 / 2 + var40 - 2, 16777215, 0);
					if (class248.World_request != null) {
						var1.drawCentered("Loading...", var34 / 2 + var39, var6 / 2 + var40 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var34 / 2 + var39, var6 / 2 + var40 + 12, 16777215, 0);
					}
				} else {
					MouseHandler.field523 = Canvas.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOffer.archive8, "sl_button", "");
				}
			}

		}
	}
}
