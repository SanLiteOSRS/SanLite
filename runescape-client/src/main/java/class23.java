import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public class class23 extends class14 {
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1382596605
	)
	int field191;
	@ObfuscatedName("c")
	byte field190;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class23(class2 var1) {
		this.this$0 = var1;
		this.field191 = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field191 = var1.readUnsignedShort();
		this.field190 = var1.readByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method191(this.field191, this.field190);
	}

	@ObfuscatedName("h")
	public static final int method309(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0D) {
			double var12;
			if (var4 < 0.5D) {
				var12 = (var2 + 1.0D) * var4;
			} else {
				var12 = var2 + var4 - var2 * var4;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = var14 + var16 * (var12 - var14) * 6.0D;
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = (var12 - var14) * (0.6666666666666666D - var16) * 6.0D + var14;
			} else {
				var6 = var14;
			}

			if (6.0D * var0 < 1.0D) {
				var8 = var0 * (var12 - var14) * 6.0D + var14;
			} else if (var0 * 2.0D < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = 6.0D * (var12 - var14) * (0.6666666666666666D - var0) + var14;
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = 6.0D * (var12 - var14) * var20 + var14;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = 6.0D * (var12 - var14) * (0.6666666666666666D - var20) + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(256.0D * var10);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILnk;I)Lea;",
		garbageValue = "-344240049"
	)
	public static class135 method310(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		class135 var5 = new class135(var0);
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.field1527 != null && var7.length == var5.field1527.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.field1527[var7[var9]] = var10;
					}
				}
			}
		}

		if (var4) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.field1531 != null && var7.length == var5.field1531.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.field1531[var7[var9]] = var10;
					}
				}
			}
		}

		return var5;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-686734686"
	)
	static boolean method308(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkc;Lkc;Lkc;B)V",
		garbageValue = "46"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class21.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var7;
		int var8;
		int var11;
		int var12;
		int var25;
		int var33;
		int var37;
		if (Login.worldSelectOpen) {
			int var46;
			if (Login.worldSelectBackSprites == null) {
				Archive var43 = class43.archive8;
				var46 = var43.getGroupId("sl_back");
				var25 = var43.getFileId(var46, "");
				SpritePixels[] var49 = class253.method4767(var43, var46, var25);
				Login.worldSelectBackSprites = var49;
			}

			if (UserComparator5.worldSelectFlagSprites == null) {
				UserComparator5.worldSelectFlagSprites = GameObject.method4235(class43.archive8, "sl_flags", "");
			}

			if (Login.worldSelectArrows == null) {
				Login.worldSelectArrows = GameObject.method4235(class43.archive8, "sl_arrows", "");
			}

			if (AbstractWorldMapIcon.worldSelectStars == null) {
				AbstractWorldMapIcon.worldSelectStars = GameObject.method4235(class43.archive8, "sl_stars", "");
			}

			if (class285.worldSelectLeftSprite == null) {
				class285.worldSelectLeftSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(class43.archive8, "leftarrow", "");
			}

			if (Nameable.worldSelectRightSprite == null) {
				Nameable.worldSelectRightSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(class43.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (AbstractWorldMapIcon.worldSelectStars != null) {
				AbstractWorldMapIcon.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				AbstractWorldMapIcon.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (Login.worldSelectArrows != null) {
				var33 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					Login.worldSelectArrows[2].drawAt(var33, 4);
				} else {
					Login.worldSelectArrows[0].drawAt(var33, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					Login.worldSelectArrows[3].drawAt(var33 + 15, 4);
				} else {
					Login.worldSelectArrows[1].drawAt(var33 + 15, 4);
				}

				var0.draw("World", var33 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					Login.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					Login.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					Login.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					Login.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var46 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					Login.worldSelectArrows[2].drawAt(var46, 4);
				} else {
					Login.worldSelectArrows[0].drawAt(var46, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					Login.worldSelectArrows[3].drawAt(var46 + 15, 4);
				} else {
					Login.worldSelectArrows[1].drawAt(var46 + 15, 4);
				}

				var0.draw("Location", var46 + 32, 17, 16777215, -1);
				var25 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					Login.worldSelectArrows[2].drawAt(var25, 4);
				} else {
					Login.worldSelectArrows[0].drawAt(var25, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					Login.worldSelectArrows[3].drawAt(var25 + 15, 4);
				} else {
					Login.worldSelectArrows[1].drawAt(var25 + 15, 4);
				}

				var0.draw("Type", var25 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (Login.worldSelectBackSprites != null) {
				var3 = 88;
				byte var38 = 19;
				var46 = 765 / (var3 + 1) - 1;
				var25 = 480 / (var38 + 1);

				do {
					var7 = var25;
					var8 = var46;
					if (var25 * (var46 - 1) >= World.World_count) {
						--var46;
					}

					if (var46 * (var25 - 1) >= World.World_count) {
						--var25;
					}

					if (var46 * (var25 - 1) >= World.World_count) {
						--var25;
					}
				} while(var25 != var7 || var8 != var46);

				var7 = (765 - var46 * var3) / (var46 + 1);
				if (var7 > 5) {
					var7 = 5;
				}

				var8 = (480 - var25 * var38) / (var25 + 1);
				if (var8 > 5) {
					var8 = 5;
				}

				var37 = (765 - var3 * var46 - var7 * (var46 - 1)) / 2;
				int var48 = (480 - var38 * var25 - var8 * (var25 - 1)) / 2;
				var11 = (var25 + World.World_count - 1) / var25;
				Login.worldSelectPagesCount = var11 - var46;
				if (class285.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class285.worldSelectLeftSprite.drawAt(8, HealthBarDefinition.canvasHeight / 2 - class285.worldSelectLeftSprite.subHeight / 2);
				}

				if (Nameable.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					Nameable.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - Nameable.worldSelectRightSprite.subWidth - 8, HealthBarDefinition.canvasHeight / 2 - Nameable.worldSelectRightSprite.subHeight / 2);
				}

				var12 = var48 + 23;
				int var41 = var37 + Login.xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = Login.worldSelectPage;

				int var17;
				for (var17 = var16 * var25; var17 < World.World_count && var16 - Login.worldSelectPage < var46; ++var17) {
					World var18 = Messages.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					int var22 = 0;
					byte var21;
					if (var18.isBeta()) {
						if (var18.isMembersOnly()) {
							var21 = 7;
						} else {
							var21 = 6;
						}
					} else if (var18.isDeadman()) {
						var22 = 16711680;
						if (var18.isMembersOnly()) {
							var21 = 5;
						} else {
							var21 = 4;
						}
					} else if (var18.method1689()) {
						if (var18.isMembersOnly()) {
							var21 = 9;
						} else {
							var21 = 8;
						}
					} else if (var18.isPvp()) {
						if (var18.isMembersOnly()) {
							var21 = 3;
						} else {
							var21 = 2;
						}
					} else if (var18.isMembersOnly()) {
						var21 = 1;
					} else {
						var21 = 0;
					}

					if (MouseHandler.MouseHandler_x >= var41 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var41 + var3 && MouseHandler.MouseHandler_y < var12 + var38 && var19) {
						Login.hoveredWorldIndex = var17;
						Login.worldSelectBackSprites[var21].drawTransOverlayAt(var41, var12, 128, 16777215);
						var15 = true;
					} else {
						Login.worldSelectBackSprites[var21].drawAt(var41, var12);
					}

					if (UserComparator5.worldSelectFlagSprites != null) {
						UserComparator5.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var41 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var41 + 15, var38 / 2 + var12 + 5, var22, -1);
					var1.drawCentered(var20, var41 + 60, var38 / 2 + var12 + 5, 268435455, -1);
					var12 = var12 + var38 + var8;
					++var14;
					if (var14 >= var25) {
						var12 = var48 + 23;
						var41 = var41 + var3 + var7;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(Messages.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var31 = var1.ascent + 8;
					int var42 = MouseHandler.MouseHandler_y + 25;
					if (var31 + var42 > 480) {
						var42 = MouseHandler.MouseHandler_y - 25 - var31;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var42, var17, var31, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var42, var17, var31, 0);
					var1.drawCentered(Messages.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var42 + var1.ascent + 4, 0, -1);
				}
			}

			WorldMapDecorationType.rasterProvider.drawFull(0, 0);
		} else {
			Canvas.leftTitleSprite.drawAt(Login.xPadding, 0);
			class12.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			FontName.logoSprite.drawAt(Login.xPadding + 382 - FontName.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
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
			short var32;
			short var34;
			if (Client.gameState == 20) {
				ItemContainer.titleboxSprite.drawAt(Login.loginBoxX + 180 - ItemContainer.titleboxSprite.subWidth / 2, 271 - ItemContainer.titleboxSprite.subHeight / 2);
				var32 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
				var33 = var32 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
				var33 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
				var33 += 15;
				var33 += 7;
				if (Login.loginIndex != 4) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var33, 16777215, 0);
					var34 = 200;

					for (var5 = class25.method316(); var0.stringWidth(var5) > var34; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var33, 16777215, 0);
					var33 += 15;

					for (var6 = SecureRandomCallable.method2081(Login.Login_password); var0.stringWidth(var6) > var34; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var33, 16777215, 0);
					var33 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				ItemContainer.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var32 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0);
					var33 = var32 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var32 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
					var33 = var32 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
					var33 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
					var33 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var32 = 201;
					var0.drawCentered(Login.Login_response1, class21.loginBoxCenter, var32, 16776960, 0);
					var33 = var32 + 15;
					var0.drawCentered(Login.Login_response2, class21.loginBoxCenter, var33, 16776960, 0);
					var33 += 15;
					var0.drawCentered(Login.Login_response3, class21.loginBoxCenter, var33, 16776960, 0);
					var33 += 15;
					var33 += 7;
					var0.draw("Login: ", class21.loginBoxCenter - 110, var33, 16777215, 0);
					var34 = 200;

					for (var5 = class25.method316(); var0.stringWidth(var5) > var34; var5 = var5.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? HorizontalAlignment.colorStartTag(16776960) + "|" : ""), class21.loginBoxCenter - 70, var33, 16777215, 0);
					var33 += 15;

					for (var6 = SecureRandomCallable.method2081(Login.Login_password); var0.stringWidth(var6) > var34; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? HorizontalAlignment.colorStartTag(16776960) + "|" : ""), class21.loginBoxCenter - 108, var33, 16777215, 0);
					var33 += 15;
					var32 = 277;
					var7 = class21.loginBoxCenter + -117;
					boolean var9 = Client.Login_isUsernameRemembered;
					boolean var28 = Login.field1006;
					IndexedSprite var27 = var9 ? (var28 ? class225.field2684 : GrandExchangeEvent.options_buttons_2Sprite) : (var28 ? InterfaceParent.field1134 : GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite);
					var27.drawAt(var7, var32);
					var7 = var7 + var27.subWidth + 5;
					var1.draw("Remember username", var7, var32 + 13, 16776960, 0);
					var7 = class21.loginBoxCenter + 24;
					IndexedSprite var29 = SoundCache.method866(class12.clientPreferences.hideUsername, Login.field1007);
					var29.drawAt(var7, var32);
					var7 = var7 + var29.subWidth + 5;
					var1.draw("Hide username", var7, var32 + 13, 16776960, 0);
					var33 = var32 + 15;
					var12 = class21.loginBoxCenter - 80;
					short var13 = 321;
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0);
					var12 = class21.loginBoxCenter + 80;
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0);
					var32 = 357;
					switch(Login.field997) {
					case 2:
						Varps.field2923 = "Having trouble logging in?";
						break;
					default:
						Varps.field2923 = "Can't login? Click here.";
					}

					class18.field155 = new Bounds(class21.loginBoxCenter, var32, var1.stringWidth(Varps.field2923), 11);
					WorldMapElement.field1572 = new Bounds(class21.loginBoxCenter, var32, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(Varps.field2923, class21.loginBoxCenter, var32, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var32 = 201;
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var32, 16776960, 0);
					var33 = var32 + 20;
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 4) {
					var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
					var32 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
					var33 = var32 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
					var33 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
					var33 += 15;
					var5 = "PIN: ";
					String var26 = class16.otp;
					var37 = var26.length();
					char[] var10 = new char[var37];

					for (var11 = 0; var11 < var37; ++var11) {
						var10[var11] = '*';
					}

					String var47 = new String(var10);
					var0.draw(var5 + var47 + (Client.cycle % 40 < 20 ? HorizontalAlignment.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var33, 16777215, 0);
					var33 -= 8;
					var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var33, 16776960, 0);
					var33 += 15;
					var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var33, 16776960, 0);
					var8 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
					var37 = var33 - var0.ascent;
					IndexedSprite var39;
					if (Login.field1008) {
						var39 = GrandExchangeEvent.options_buttons_2Sprite;
					} else {
						var39 = GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite;
					}

					var39.drawAt(var8, var37);
					var33 += 15;
					var11 = Login.loginBoxX + 180 - 80;
					short var40 = 321;
					Login.titlebuttonSprite.drawAt(var11 - 73, var40 - 20);
					var0.drawCentered("Continue", var11, var40 + 5, 16777215, 0);
					var11 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var11 - 73, var40 - 20);
					var0.drawCentered("Cancel", var11, var40 + 5, 16777215, 0);
					var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var40 + 36, 255, 0);
				} else if (Login.loginIndex == 5) {
					var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
					var32 = 221;
					var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
					var33 = var32 + 15;
					var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var33 += 14;
					var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var33, 16777215, 0);
					var34 = 174;

					for (var5 = class25.method316(); var0.stringWidth(var5) > var34; var5 = var5.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? HorizontalAlignment.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var33, 16777215, 0);
					var33 += 15;
					var25 = Login.loginBoxX + 180 - 80;
					short var35 = 321;
					Login.titlebuttonSprite.drawAt(var25 - 73, var35 - 20);
					var0.drawCentered("Recover", var25, var35 + 5, 16777215, 0);
					var25 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var25 - 73, var35 - 20);
					var0.drawCentered("Back", var25, var35 + 5, 16777215, 0);
					var35 = 356;
					var1.drawCentered("Still having trouble logging in?", class21.loginBoxCenter, var35, 268435455, 0);
				} else if (Login.loginIndex == 6) {
					var32 = 201;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
					var33 = var32 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 7) {
					var32 = 216;
					var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0);
					var33 = var32 + 15;
					var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 8) {
					var32 = 216;
					var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var32, 16776960, 0);
					var33 = var32 + 15;
					var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 12) {
					var32 = 201;
					String var24 = "";
					var5 = "";
					var6 = "";
					switch(Login.field996) {
					case 0:
						var24 = "Your account has been disabled.";
						var5 = Strings.field3295;
						var6 = "";
						break;
					case 1:
						var24 = "Account locked as we suspect it has been stolen.";
						var5 = Strings.field3334;
						var6 = "";
						break;
					default:
						BufferedSink.Login_promptCredentials(false);
					}

					var0.drawCentered(var24, Login.loginBoxX + 180, var32, 16776960, 0);
					var33 = var32 + 15;
					var2.drawCentered(var5, Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var2.drawCentered(var6, Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var7 = Login.loginBoxX + 180;
					short var36 = 276;
					Login.titlebuttonSprite.drawAt(var7 - 73, var36 - 20);
					var0.drawCentered("Support Page", var7, var36 + 5, 16777215, 0);
					var7 = Login.loginBoxX + 180;
					var36 = 326;
					Login.titlebuttonSprite.drawAt(var7 - 73, var36 - 20);
					var0.drawCentered("Back", var7, var36 + 5, 16777215, 0);
				} else if (Login.loginIndex == 24) {
					var32 = 221;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
					var33 = var32 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
					var33 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
					var33 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 301;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
				}
			}

			if (Client.gameState >= 10) {
				int[] var30 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var30);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, HealthBarDefinition.canvasHeight);
				AttackOption.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				AttackOption.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var30);
			}

			FontName.title_muteSprite[class12.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class7.clientLanguage == Language.Language_EN) {
				if (class288.field3691 != null) {
					var33 = Login.xPadding + 5;
					var34 = 463;
					byte var44 = 100;
					byte var45 = 35;
					class288.field3691.drawAt(var33, var34);
					var0.drawCentered("World" + " " + Client.worldId, var44 / 2 + var33, var45 / 2 + var34 - 2, 16777215, 0);
					if (World.World_request != null) {
						var1.drawCentered("Loading...", var44 / 2 + var33, var45 / 2 + var34 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var44 / 2 + var33, var45 / 2 + var34 + 12, 16777215, 0);
					}
				} else {
					class288.field3691 = MenuAction.SpriteBuffer_getIndexedSpriteByName(class43.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "90"
	)
	static final void method306(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class12.clientPreferences.musicVolume) {
			if (class12.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) {
				World.method1684(class29.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.field866 = false;
			} else if (var0 == 0) {
				ViewportMouse.method4193();
				Client.field866 = false;
			} else {
				FriendLoginUpdate.method5552(var0);
			}

			class12.clientPreferences.musicVolume = var0;
			KeyHandler.savePreferences();
		}

	}
}
