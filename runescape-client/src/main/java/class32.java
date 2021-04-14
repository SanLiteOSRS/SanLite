import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aj")
public final class class32 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		signature = "Lde;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		signature = "Loh;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-634814317"
	)
	static int method394(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			class16.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = class139.getWidget(var3);
				if (var6.children == null) {
					var6.children = new Widget[var5 + 1];
				}

				if (var6.children.length <= var5) {
					Widget[] var7 = new Widget[var5 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var5 > 0 && var6.children[var5 - 1] == null) {
					throw new RuntimeException("" + (var5 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var5;
					var12.isIf3 = true;
					var6.children[var5] = var12;
					if (var2) {
						FriendSystem.field905 = var12;
					} else {
						class4.field35 = var12;
					}

					class29.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var9;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var9 = var2 ? FriendSystem.field905 : class4.field35;
				Widget var10 = class139.getWidget(var9.id);
				var10.children[var9.childIndex] = null;
				class29.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var9 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
				var9.children = null;
				class29.invalidateWidget(var9);
				return 1;
			} else if (var0 == 103) {
				class16.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--class16.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var9 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
					if (var9 != null) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							FriendSystem.field905 = var9;
						} else {
							class4.field35 = var9;
						}
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				class16.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
				Widget var11 = class231.getWidgetChild(var3, var4);
				if (var11 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						FriendSystem.field905 = var11;
					} else {
						class4.field35 = var11;
					}
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1817166338"
	)
	static void method393(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lkq;Lkq;Lkq;I)V",
		garbageValue = "-652668563"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (InterfaceParent.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		GraphicsObject.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var6;
		int var8;
		int var9;
		int var11;
		int var32;
		int var36;
		if (Login.worldSelectOpen) {
			if (Tile.worldSelectBackSprites == null) {
				Tile.worldSelectBackSprites = class124.method2492(SoundSystem.archive8, "sl_back", "");
			}

			if (ByteArrayPool.worldSelectFlagSprites == null) {
				ByteArrayPool.worldSelectFlagSprites = Players.method2284(SoundSystem.archive8, "sl_flags", "");
			}

			if (class6.worldSelectArrows == null) {
				class6.worldSelectArrows = Players.method2284(SoundSystem.archive8, "sl_arrows", "");
			}

			if (class13.worldSelectStars == null) {
				class13.worldSelectStars = Players.method2284(SoundSystem.archive8, "sl_stars", "");
			}

			if (World.worldSelectLeftSprite == null) {
				World.worldSelectLeftSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(SoundSystem.archive8, "leftarrow", "");
			}

			if (Interpreter.worldSelectRightSprite == null) {
				Interpreter.worldSelectRightSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(SoundSystem.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class13.worldSelectStars != null) {
				class13.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class13.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			int var37;
			if (class6.worldSelectArrows != null) {
				var32 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					class6.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					class6.worldSelectArrows[0].drawAt(var32, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					class6.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					class6.worldSelectArrows[1].drawAt(var32 + 15, 4);
				}

				var0.draw("World", var32 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					class6.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class6.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					class6.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class6.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var37 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					class6.worldSelectArrows[2].drawAt(var37, 4);
				} else {
					class6.worldSelectArrows[0].drawAt(var37, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					class6.worldSelectArrows[3].drawAt(var37 + 15, 4);
				} else {
					class6.worldSelectArrows[1].drawAt(var37 + 15, 4);
				}

				var0.draw("Location", var37 + 32, 17, 16777215, -1);
				var6 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					class6.worldSelectArrows[2].drawAt(var6, 4);
				} else {
					class6.worldSelectArrows[0].drawAt(var6, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					class6.worldSelectArrows[3].drawAt(var6 + 15, 4);
				} else {
					class6.worldSelectArrows[1].drawAt(var6 + 15, 4);
				}

				var0.draw("Type", var6 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (Tile.worldSelectBackSprites != null) {
				var3 = 88;
				byte var39 = 19;
				var37 = 765 / (var3 + 1) - 1;
				var6 = 480 / (var39 + 1);

				do {
					var36 = var6;
					var8 = var37;
					if (var6 * (var37 - 1) >= World.World_count) {
						--var37;
					}

					if (var37 * (var6 - 1) >= World.World_count) {
						--var6;
					}

					if (var37 * (var6 - 1) >= World.World_count) {
						--var6;
					}
				} while(var36 != var6 || var37 != var8);

				var36 = (765 - var3 * var37) / (var37 + 1);
				if (var36 > 5) {
					var36 = 5;
				}

				var8 = (480 - var6 * var39) / (var6 + 1);
				if (var8 > 5) {
					var8 = 5;
				}

				var9 = (765 - var3 * var37 - var36 * (var37 - 1)) / 2;
				int var10 = (480 - var39 * var6 - var8 * (var6 - 1)) / 2;
				var11 = (var6 + World.World_count - 1) / var6;
				Login.worldSelectPagesCount = var11 - var37;
				if (World.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					World.worldSelectLeftSprite.drawAt(8, GameEngine.canvasHeight / 2 - World.worldSelectLeftSprite.subHeight / 2);
				}

				if (Interpreter.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					Interpreter.worldSelectRightSprite.drawAt(InterfaceParent.canvasWidth - Interpreter.worldSelectRightSprite.subWidth - 8, GameEngine.canvasHeight / 2 - Interpreter.worldSelectRightSprite.subHeight / 2);
				}

				int var40 = var10 + 23;
				int var13 = var9 + Login.xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = Login.worldSelectPage;

				int var17;
				for (var17 = var16 * var6; var17 < World.World_count && var16 - Login.worldSelectPage < var37; ++var17) {
					World var24 = class9.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var24.population);
					if (var24.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var24.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					int var22 = 0;
					byte var21;
					if (var24.isBeta()) {
						if (var24.isMembersOnly()) {
							var21 = 7;
						} else {
							var21 = 6;
						}
					} else if (var24.isDeadman()) {
						var22 = 16711680;
						if (var24.isMembersOnly()) {
							var21 = 5;
						} else {
							var21 = 4;
						}
					} else if (var24.method1677()) {
						if (var24.isMembersOnly()) {
							var21 = 9;
						} else {
							var21 = 8;
						}
					} else if (var24.isPvp()) {
						if (var24.isMembersOnly()) {
							var21 = 3;
						} else {
							var21 = 2;
						}
					} else if (var24.isMembersOnly()) {
						var21 = 1;
					} else {
						var21 = 0;
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var40 && MouseHandler.MouseHandler_x < var13 + var3 && MouseHandler.MouseHandler_y < var39 + var40 && var19) {
						Login.hoveredWorldIndex = var17;
						Tile.worldSelectBackSprites[var21].drawTransOverlayAt(var13, var40, 128, 16777215);
						var15 = true;
					} else {
						Tile.worldSelectBackSprites[var21].drawAt(var13, var40);
					}

					if (ByteArrayPool.worldSelectFlagSprites != null) {
						ByteArrayPool.worldSelectFlagSprites[(var24.isMembersOnly() ? 8 : 0) + var24.location].drawAt(var13 + 29, var40);
					}

					var0.drawCentered(Integer.toString(var24.id), var13 + 15, var39 / 2 + var40 + 5, var22, -1);
					var1.drawCentered(var20, var13 + 60, var39 / 2 + var40 + 5, 268435455, -1);
					var40 = var40 + var39 + var8;
					++var14;
					if (var14 >= var6) {
						var40 = var10 + 23;
						var13 = var13 + var36 + var3;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(class9.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var18 = var1.ascent + 8;
					int var41 = MouseHandler.MouseHandler_y + 25;
					if (var18 + var41 > 480) {
						var41 = MouseHandler.MouseHandler_y - 25 - var18;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var41, var17, var18, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var41, var17, var18, 0);
					var1.drawCentered(class9.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var41 + var1.ascent + 4, 0, -1);
				}
			}

			GameEngine.rasterProvider.drawFull(0, 0);
		} else {
			Client.leftTitleSprite.drawAt(Login.xPadding, 0);
			ArchiveDiskActionHandler.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class125.logoSprite.drawAt(Login.xPadding + 382 - class125.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var23;
			String var26;
			char[] var27;
			String var28;
			short var31;
			short var33;
			if (Client.gameState == 20) {
				TileItem.titleboxSprite.drawAt(Login.loginBoxX + 180 - TileItem.titleboxSprite.subWidth / 2, 271 - TileItem.titleboxSprite.subHeight / 2);
				var31 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
				var32 = var31 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var32 += 7;
				if (Login.loginIndex != 4) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0);
					var33 = 200;

					for (var23 = Players.method2283(); var0.stringWidth(var23) > var33; var23 = var23.substring(0, var23.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var23), Login.loginBoxX + 180 - 70, var32, 16777215, 0);
					var32 += 15;
					var26 = Login.Login_password;
					var9 = var26.length();
					var27 = new char[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var27[var11] = '*';
					}

					var28 = new String(var27);

					for (var28 = var28; var0.stringWidth(var28) > var33; var28 = var28.substring(1)) {
					}

					var0.draw("Password: " + var28, Login.loginBoxX + 180 - 108, var32, 16777215, 0);
					var32 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				TileItem.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var5;
				if (Login.loginIndex == 0) {
					var31 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0);
					var32 = var31 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var5 = 291;
					Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
					var0.drawLines("New User", var4 - 73, var5 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
					var0.drawLines("Existing User", var4 - 73, var5 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var31 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
					var32 = var31 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var5 = 321;
					Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
					var0.drawCentered("Continue", var4, var5 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
					var0.drawCentered("Cancel", var4, var5 + 5, 16777215, 0);
				} else {
					short var12;
					IndexedSprite var42;
					if (Login.loginIndex == 2) {
						var31 = 201;
						var0.drawCentered(Login.Login_response1, GraphicsObject.loginBoxCenter, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, GraphicsObject.loginBoxCenter, var32, 16776960, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, GraphicsObject.loginBoxCenter, var32, 16776960, 0);
						var32 += 15;
						var32 += 7;
						var0.draw("Login: ", GraphicsObject.loginBoxCenter - 110, var32, 16777215, 0);
						var33 = 200;

						for (var23 = Players.method2283(); var0.stringWidth(var23) > var33; var23 = var23.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var23) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? DefaultsGroup.colorStartTag(16776960) + "|" : ""), GraphicsObject.loginBoxCenter - 70, var32, 16777215, 0);
						var32 += 15;
						var26 = Login.Login_password;
						var9 = var26.length();
						var27 = new char[var9];

						for (var11 = 0; var11 < var9; ++var11) {
							var27[var11] = '*';
						}

						var28 = new String(var27);

						for (var28 = var28; var0.stringWidth(var28) > var33; var28 = var28.substring(1)) {
						}

						var0.draw("Password: " + var28 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? DefaultsGroup.colorStartTag(16776960) + "|" : ""), GraphicsObject.loginBoxCenter - 108, var32, 16777215, 0);
						var32 += 15;
						var31 = 277;
						var9 = GraphicsObject.loginBoxCenter + -117;
						var42 = class12.method213(Client.Login_isUsernameRemembered, Login.field1003);
						var42.drawAt(var9, var31);
						var9 = var9 + var42.subWidth + 5;
						var1.draw("Remember username", var9, var31 + 13, 16776960, 0);
						var9 = GraphicsObject.loginBoxCenter + 24;
						var42 = class12.method213(Login.clientPreferences.hideUsername, Login.field1012);
						var42.drawAt(var9, var31);
						var9 = var9 + var42.subWidth + 5;
						var1.draw("Hide username", var9, var31 + 13, 16776960, 0);
						var32 = var31 + 15;
						var11 = GraphicsObject.loginBoxCenter - 80;
						var12 = 321;
						Interpreter.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Login", var11, var12 + 5, 16777215, 0);
						var11 = GraphicsObject.loginBoxCenter + 80;
						Interpreter.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0);
						var31 = 357;
						switch(Login.field994) {
						case 2:
							class34.field229 = "Having trouble logging in?";
							break;
						default:
							class34.field229 = "Can't login? Click here.";
						}

						ChatChannel.field1084 = new Bounds(GraphicsObject.loginBoxCenter, var31, var1.stringWidth(class34.field229), 11);
						ModeWhere.field3378 = new Bounds(GraphicsObject.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(class34.field229, GraphicsObject.loginBoxCenter, var31, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var31 = 201;
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 20;
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var5 = 276;
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
						var2.drawCentered("Try again", var4, var5 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var5 = 326;
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
						var2.drawCentered("Forgotten password?", var4, var5 + 5, 16777215, 0);
					} else if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var23 = "PIN: ";
						var26 = Bounds.otp;
						var9 = var26.length();
						var27 = new char[var9];

						for (var11 = 0; var11 < var9; ++var11) {
							var27[var11] = '*';
						}

						var28 = new String(var27);
						var0.draw(var23 + var28 + (Client.cycle % 40 < 20 ? DefaultsGroup.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0);
						var32 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var32 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var8 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var9 = var32 - var0.ascent;
						if (Login.field1005) {
							var42 = Skeleton.options_buttons_2Sprite;
						} else {
							var42 = TileItem.options_buttons_0Sprite;
						}

						var42.drawAt(var8, var9);
						var32 += 15;
						var11 = Login.loginBoxX + 180 - 80;
						var12 = 321;
						Interpreter.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Continue", var11, var12 + 5, 16777215, 0);
						var11 = Login.loginBoxX + 180 + 80;
						Interpreter.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var12 + 36, 255, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var32 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var32, 16777215, 0);
						var33 = 174;

						for (var23 = Players.method2283(); var0.stringWidth(var23) > var33; var23 = var23.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var23) + (Client.cycle % 40 < 20 ? DefaultsGroup.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0);
						var32 += 15;
						var6 = Login.loginBoxX + 180 - 80;
						short var7 = 321;
						Interpreter.titlebuttonSprite.drawAt(var6 - 73, var7 - 20);
						var0.drawCentered("Recover", var6, var7 + 5, 16777215, 0);
						var6 = Login.loginBoxX + 180 + 80;
						Interpreter.titlebuttonSprite.drawAt(var6 - 73, var7 - 20);
						var0.drawCentered("Back", var6, var7 + 5, 16777215, 0);
						var7 = 356;
						var1.drawCentered("Still having trouble logging in?", GraphicsObject.loginBoxCenter, var7, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var31 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var5 = 321;
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
						var0.drawCentered("Back", var4, var5 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						var31 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var5 = 321;
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
						var0.drawCentered("Set Date of Birth", var4, var5 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
						var0.drawCentered("Back", var4, var5 + 5, 16777215, 0);
					} else if (Login.loginIndex == 8) {
						var31 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var5 = 321;
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
						var0.drawCentered("Privacy Policy", var4, var5 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
						var0.drawCentered("Back", var4, var5 + 5, 16777215, 0);
					} else if (Login.loginIndex == 12) {
						var31 = 201;
						String var30 = "";
						var23 = "";
						String var29 = "";
						switch(Login.field993) {
						case 0:
							var30 = "Your account has been disabled.";
							var23 = Strings.field2966;
							var29 = "";
							break;
						case 1:
							var30 = "Account locked as we suspect it has been stolen.";
							var23 = Strings.field3005;
							var29 = "";
							break;
						default:
							class25.Login_promptCredentials(false);
						}

						var0.drawCentered(var30, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered(var23, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered(var29, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var36 = Login.loginBoxX + 180;
						short var38 = 276;
						Interpreter.titlebuttonSprite.drawAt(var36 - 73, var38 - 20);
						var0.drawCentered("Support Page", var36, var38 + 5, 16777215, 0);
						var36 = Login.loginBoxX + 180;
						var38 = 326;
						Interpreter.titlebuttonSprite.drawAt(var36 - 73, var38 - 20);
						var0.drawCentered("Back", var36, var38 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var31 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var5 = 301;
						Interpreter.titlebuttonSprite.drawAt(var4 - 73, var5 - 20);
						var0.drawCentered("Ok", var4, var5 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var25 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var25);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, GameEngine.canvasHeight);
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var25);
			}

			class373.title_muteSprite[Login.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class35.clientLanguage == Language.Language_EN) {
				if (class242.field2900 != null) {
					var32 = Login.xPadding + 5;
					var33 = 463;
					byte var35 = 100;
					byte var34 = 35;
					class242.field2900.drawAt(var32, var33);
					var0.drawCentered("World" + " " + Client.worldId, var35 / 2 + var32, var34 / 2 + var33 - 2, 16777215, 0);
					if (World.World_request != null) {
						var1.drawCentered("Loading...", var35 / 2 + var32, var34 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var35 / 2 + var32, var34 / 2 + var33 + 12, 16777215, 0);
					}
				} else {
					class242.field2900 = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(SoundSystem.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		signature = "(Lcs;IIB)V",
		garbageValue = "-125"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = class225.SequenceDefinition_get(var1).field3707;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1245 = 0;
			}

			if (var3 == 2) {
				var0.field1245 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || class225.SequenceDefinition_get(var1).field3718 >= class225.SequenceDefinition_get(var0.sequence).field3718) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1245 = 0;
			var0.field1224 = var0.pathLength;
		}

	}
}
