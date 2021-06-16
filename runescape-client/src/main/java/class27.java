import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class27 extends class14 {
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	static class370 field215;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1631949421
	)
	int field216;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class27(class2 var1) {
		this.this$0 = var1;
		this.field216 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field216 = var1.readUnsignedShort();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method132(this.field216);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IB)V",
		garbageValue = "-1"
	)
	static void method364(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) {
			Messages.logoSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & 1073741824) != 0) {
			Messages.logoSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else {
			Messages.logoSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lkj;B)V",
		garbageValue = "0"
	)
	static void method353(Font var0, Font var1) {
		int var4;
		int var5;
		int var9;
		int var11;
		int var13;
		if (Varcs.worldSelectBackSprites == null) {
			Archive var3 = ModeWhere.archive8;
			var4 = var3.getGroupId("sl_back");
			var5 = var3.getFileId(var4, "");
			SpritePixels[] var6;
			if (!Message.method1263(var3, var4, var5)) {
				var6 = null;
			} else {
				SpritePixels[] var8 = new SpritePixels[class397.SpriteBuffer_spriteCount];
				var9 = 0;

				while (true) {
					if (var9 >= class397.SpriteBuffer_spriteCount) {
						ArchiveDisk.method5993();
						var6 = var8;
						break;
					}

					SpritePixels var10 = var8[var9] = new SpritePixels();
					var10.width = class397.SpriteBuffer_spriteWidth;
					var10.height = class244.SpriteBuffer_spriteHeight;
					var10.xOffset = class397.SpriteBuffer_xOffsets[var9];
					var10.yOffset = class26.SpriteBuffer_yOffsets[var9];
					var10.subWidth = Canvas.SpriteBuffer_spriteWidths[var9];
					var10.subHeight = Clock.SpriteBuffer_spriteHeights[var9];
					var11 = var10.subHeight * var10.subWidth;
					byte[] var12 = class126.SpriteBuffer_pixels[var9];
					var10.pixels = new int[var11];

					for (var13 = 0; var13 < var11; ++var13) {
						var10.pixels[var13] = class397.SpriteBuffer_spritePalette[var12[var13] & 255];
					}

					++var9;
				}
			}

			Varcs.worldSelectBackSprites = var6;
		}

		if (class364.worldSelectFlagSprites == null) {
			class364.worldSelectFlagSprites = WorldMapLabelSize.method3268(ModeWhere.archive8, "sl_flags", "");
		}

		if (class10.worldSelectArrows == null) {
			class10.worldSelectArrows = WorldMapLabelSize.method3268(ModeWhere.archive8, "sl_arrows", "");
		}

		if (Huffman.worldSelectStars == null) {
			Huffman.worldSelectStars = WorldMapLabelSize.method3268(ModeWhere.archive8, "sl_stars", "");
		}

		if (NetCache.worldSelectLeftSprite == null) {
			NetCache.worldSelectLeftSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(ModeWhere.archive8, "leftarrow", "");
		}

		if (class12.worldSelectRightSprite == null) {
			class12.worldSelectRightSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(ModeWhere.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (Huffman.worldSelectStars != null) {
			Huffman.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			Huffman.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		if (class10.worldSelectArrows != null) {
			int var22 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				class10.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				class10.worldSelectArrows[0].drawAt(var22, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				class10.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				class10.worldSelectArrows[1].drawAt(var22 + 15, 4);
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1);
			int var23 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				class10.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				class10.worldSelectArrows[0].drawAt(var23, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				class10.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				class10.worldSelectArrows[1].drawAt(var23 + 15, 4);
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				class10.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class10.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				class10.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class10.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				class10.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class10.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				class10.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class10.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (Varcs.worldSelectBackSprites != null) {
			byte var31 = 88;
			byte var32 = 19;
			var4 = 765 / (var31 + 1) - 1;
			var5 = 480 / (var32 + 1);

			int var24;
			int var25;
			do {
				var24 = var5;
				var25 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var24 != var5 || var25 != var4);

			var24 = (765 - var31 * var4) / (var4 + 1);
			if (var24 > 5) {
				var24 = 5;
			}

			var25 = (480 - var5 * var32) / (var5 + 1);
			if (var25 > 5) {
				var25 = 5;
			}

			int var26 = (765 - var4 * var31 - var24 * (var4 - 1)) / 2;
			var9 = (480 - var32 * var5 - var25 * (var5 - 1)) / 2;
			int var27 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var27 - var4;
			if (NetCache.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				NetCache.worldSelectLeftSprite.drawAt(8, class0.canvasHeight / 2 - NetCache.worldSelectLeftSprite.subHeight / 2);
			}

			if (class12.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				class12.worldSelectRightSprite.drawAt(AttackOption.canvasWidth - class12.worldSelectRightSprite.subWidth - 8, class0.canvasHeight / 2 - class12.worldSelectRightSprite.subHeight / 2);
			}

			var11 = var9 + 23;
			int var28 = var26 + Login.xPadding;
			var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = World.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				int var21 = 0;
				byte var20;
				if (var17.isBeta()) {
					if (var17.isMembersOnly()) {
						var20 = 7;
					} else {
						var20 = 6;
					}
				} else if (var17.isDeadman()) {
					var21 = 16711680;
					if (var17.isMembersOnly()) {
						var20 = 5;
					} else {
						var20 = 4;
					}
				} else if (var17.method1778()) {
					if (var17.isMembersOnly()) {
						var20 = 9;
					} else {
						var20 = 8;
					}
				} else if (var17.isPvp()) {
					if (var17.isMembersOnly()) {
						var20 = 3;
					} else {
						var20 = 2;
					}
				} else if (var17.isMembersOnly()) {
					var20 = 1;
				} else {
					var20 = 0;
				}

				if (MouseHandler.MouseHandler_x >= var28 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var31 + var28 && MouseHandler.MouseHandler_y < var32 + var11 && var18) {
					Login.hoveredWorldIndex = var16;
					Varcs.worldSelectBackSprites[var20].drawTransOverlayAt(var28, var11, 128, 16777215);
					var14 = true;
				} else {
					Varcs.worldSelectBackSprites[var20].drawAt(var28, var11);
				}

				if (class364.worldSelectFlagSprites != null) {
					class364.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var28 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var28 + 15, var32 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var28 + 60, var32 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var25 + var32;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var28 = var28 + var24 + var31;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var29 = var1.ascent + 8;
				int var30 = MouseHandler.MouseHandler_y + 25;
				if (var29 + var30 > 480) {
					var30 = MouseHandler.MouseHandler_y - 25 - var29;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var30, var16, var29, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var30, var16, var29, 0);
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var30 + var1.ascent + 4, 0, -1);
			}
		}

		AbstractWorldMapData.rasterProvider.drawFull(0, 0);
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Liv;IB)I",
		garbageValue = "1"
	)
	static final int method355(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = WorldMapData_1.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class250.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = class262.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = WorldMapData_1.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class250.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = ScriptFrame.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = class15.baseX * 64 + (class262.localPlayer.x >> 7);
					}

					if (var6 == 19) {
						var7 = WorldMapSprite.baseY * 64 + (class262.localPlayer.y >> 7);
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
