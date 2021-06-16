import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("ga")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;I)I",
		garbageValue = "1741486756"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "61"
	)
	static int method2529(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 6950) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIIIII)V",
		garbageValue = "-1284495098"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCComposition var6 = ((NPC)var0).definition;
				if (var6.transforms != null) {
					var6 = var6.transform();
				}

				if (var6 == null) {
					return;
				}
			}

			int var76 = Players.Players_count;
			int[] var7 = Players.Players_indices;
			byte var8 = 0;
			int var10;
			if (var1 < var76 && var0.playerCycle == Client.cycle && Canvas.method492((Player)var0)) {
				Player var9 = (Player)var0;
				if (var1 < var76) {
					var10 = var0.defaultHeight + 15;
					ClanChannel.worldToScreen(var0.x, var0.y, var10);
					AbstractFont var11 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
					byte var12 = 9;
					var11.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var12, 16777215, 0);
					var8 = 18;
				}
			}

			int var77 = -2;
			int var17;
			int var23;
			int var24;
			if (!var0.healthBars.method5364()) {
				var10 = var0.defaultHeight + 15;
				ClanChannel.worldToScreen(var0.x, var0.y, var10);

				for (HealthBar var89 = (HealthBar)var0.healthBars.last(); var89 != null; var89 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var81 = var89.get(Client.cycle);
					if (var81 == null) {
						if (var89.isEmpty()) {
							var89.remove();
						}
					} else {
						HealthBarDefinition var13 = var89.definition;
						SpritePixels var82 = var13.getBackSprite();
						SpritePixels var83 = var13.getFrontSprite();
						var17 = 0;
						int var84;
						if (var82 != null && var83 != null) {
							if (var13.widthPadding * 2 < var83.subWidth) {
								var17 = var13.widthPadding;
							}

							var84 = var83.subWidth - var17 * 2;
						} else {
							var84 = var13.width;
						}

						int var18 = 255;
						boolean var85 = true;
						int var86 = Client.cycle - var81.cycle;
						int var87 = var84 * var81.health2 / var13.width;
						int var88;
						int var94;
						if (var81.cycleOffset > var86) {
							var88 = var13.field1607 == 0 ? 0 : var13.field1607 * (var86 / var13.field1607);
							var23 = var84 * var81.health / var13.width;
							var94 = var88 * (var87 - var23) / var81.cycleOffset + var23;
						} else {
							var94 = var87;
							var88 = var81.cycleOffset + var13.int5 - var86;
							if (var13.int3 >= 0) {
								var18 = (var88 << 8) / (var13.int5 - var13.int3);
							}
						}

						if (var81.health2 > 0 && var94 < 1) {
							var94 = 1;
						}

						if (var82 != null && var83 != null) {
							if (var84 == var94) {
								var94 += var17 * 2;
							} else {
								var94 += var17;
							}

							var88 = var82.subHeight;
							var77 += var88;
							var23 = var2 + Client.viewportTempX - (var84 >> 1);
							var24 = var3 + Client.viewportTempY - var77;
							var23 -= var17;
							if (var18 >= 0 && var18 < 255) {
								var82.drawTransAt(var23, var24, var18);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var94 + var23, var88 + var24);
								var83.drawTransAt(var23, var24, var18);
							} else {
								var82.drawTransBgAt(var23, var24);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var94, var24 + var88);
								var83.drawTransBgAt(var23, var24);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var77 += 2;
						} else {
							var77 += 5;
							if (Client.viewportTempX > -1) {
								var88 = var2 + Client.viewportTempX - (var84 >> 1);
								var23 = var3 + Client.viewportTempY - var77;
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var23, var94, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var94 + var88, var23, var84 - var94, 5, 16711680);
							}

							var77 += 2;
						}
					}
				}
			}

			if (var77 == -2) {
				var77 += 7;
			}

			var77 += var8;
			int var79;
			if (var1 < var76) {
				Player var78 = (Player)var0;
				if (var78.isHidden) {
					return;
				}

				if (var78.headIconPk != -1 || var78.headIconPrayer != -1) {
					var79 = var0.defaultHeight + 15;
					ClanChannel.worldToScreen(var0.x, var0.y, var79);
					if (Client.viewportTempX > -1) {
						if (var78.headIconPk != -1) {
							var77 += 25;
							ScriptFrame.headIconPkSprites[var78.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var77);
						}

						if (var78.headIconPrayer != -1) {
							var77 += 25;
							class20.headIconPrayerSprites[var78.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var77);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					var79 = var0.defaultHeight + 15;
					ClanChannel.worldToScreen(var0.x, var0.y, var79);
					if (Client.viewportTempX > -1) {
						var77 += Skills.headIconHintSprites[1].subHeight;
						Skills.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var77);
					}
				}
			} else {
				NPCComposition var93 = ((NPC)var0).definition;
				if (var93.transforms != null) {
					var93 = var93.transform();
				}

				if (var93.headIconPrayer >= 0 && var93.headIconPrayer < class20.headIconPrayerSprites.length) {
					var79 = var0.defaultHeight + 15;
					ClanChannel.worldToScreen(var0.x, var0.y, var79);
					if (Client.viewportTempX > -1) {
						class20.headIconPrayerSprites[var93.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30);
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					var79 = var0.defaultHeight + 15;
					ClanChannel.worldToScreen(var0.x, var0.y, var79);
					if (Client.viewportTempX > -1) {
						Skills.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var76 || !var0.field1253 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				var10 = var0.defaultHeight;
				ClanChannel.worldToScreen(var0.x, var0.y, var10);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = class309.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = class309.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY;
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
				}
			}

			for (var10 = 0; var10 < 4; ++var10) {
				var79 = var0.hitSplatCycles[var10];
				int var90 = var0.hitSplatTypes[var10];
				HitSplatDefinition var91 = null;
				int var14 = 0;
				if (var90 >= 0) {
					if (var79 <= Client.cycle) {
						continue;
					}

					var91 = Decimator.method1171(var0.hitSplatTypes[var10]);
					var14 = var91.field1738;
					if (var91 != null && var91.transforms != null) {
						var91 = var91.transform();
						if (var91 == null) {
							var0.hitSplatCycles[var10] = -1;
							continue;
						}
					}
				} else if (var79 < 0) {
					continue;
				}

				int var15 = var0.hitSplatTypes2[var10];
				HitSplatDefinition var16 = null;
				if (var15 >= 0) {
					var16 = Decimator.method1171(var15);
					if (var16 != null && var16.transforms != null) {
						var16 = var16.transform();
					}
				}

				if (var79 - var14 <= Client.cycle) {
					if (var91 == null) {
						var0.hitSplatCycles[var10] = -1;
					} else {
						var17 = var0.defaultHeight / 2;
						ClanChannel.worldToScreen(var0.x, var0.y, var17);
						if (Client.viewportTempX > -1) {
							if (var10 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var10 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var10 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							SpritePixels var22 = null;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							SpritePixels var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							var19 = var91.method2978();
							int var44;
							if (var19 != null) {
								var23 = var19.subWidth;
								var44 = var19.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var19.xOffset;
							}

							var20 = var91.method3005();
							if (var20 != null) {
								var24 = var20.subWidth;
								var44 = var20.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var20.xOffset;
							}

							var21 = var91.method2980();
							if (var21 != null) {
								var25 = var21.subWidth;
								var44 = var21.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var21.xOffset;
							}

							var22 = var91.method2981();
							if (var22 != null) {
								var26 = var22.subWidth;
								var44 = var22.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var22.xOffset;
							}

							if (var16 != null) {
								var31 = var16.method2978();
								if (var31 != null) {
									var35 = var31.subWidth;
									var44 = var31.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.xOffset;
								}

								var32 = var16.method3005();
								if (var32 != null) {
									var36 = var32.subWidth;
									var44 = var32.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.xOffset;
								}

								var33 = var16.method2980();
								if (var33 != null) {
									var37 = var33.subWidth;
									var44 = var33.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.xOffset;
								}

								var34 = var16.method2981();
								if (var34 != null) {
									var38 = var34.subWidth;
									var44 = var34.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.xOffset;
								}
							}

							Font var80 = var91.getFont();
							if (var80 == null) {
								var80 = UserComparator10.fontPlain11;
							}

							Font var45;
							if (var16 != null) {
								var45 = var16.getFont();
								if (var45 == null) {
									var45 = UserComparator10.fontPlain11;
								}
							} else {
								var45 = UserComparator10.fontPlain11;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var91.getString(var0.hitSplatValues[var10]);
							int var92 = var80.stringWidth(var46);
							if (var16 != null) {
								var47 = var16.getString(var0.hitSplatValues2[var10]);
								var49 = var45.stringWidth(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (var21 == null && var22 == null) {
									var50 = 1;
								} else {
									var50 = var92 / var24 + 1;
								}
							}

							if (var16 != null && var36 > 0) {
								if (var33 == null && var34 == null) {
									var51 = 1;
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0;
							int var53 = var52;
							if (var23 > 0) {
								var52 += var23;
							}

							var52 += 2;
							int var54 = var52;
							if (var25 > 0) {
								var52 += var25;
							}

							int var55 = var52;
							int var56 = var52;
							int var57;
							if (var24 > 0) {
								var57 = var24 * var50;
								var52 += var57;
								var56 += (var57 - var92) / 2;
							} else {
								var52 += var92;
							}

							var57 = var52;
							if (var26 > 0) {
								var52 += var26;
							}

							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62 = 0;
							int var63;
							if (var16 != null) {
								var52 += 2;
								var58 = var52;
								if (var35 > 0) {
									var52 += var35;
								}

								var52 += 2;
								var59 = var52;
								if (var37 > 0) {
									var52 += var37;
								}

								var60 = var52;
								var62 = var52;
								if (var36 > 0) {
									var63 = var51 * var36;
									var52 += var63;
									var62 += (var63 - var49) / 2;
								} else {
									var52 += var49;
								}

								var61 = var52;
								if (var38 > 0) {
									var52 += var38;
								}
							}

							var63 = var0.hitSplatCycles[var10] - Client.cycle;
							int var64 = var91.field1733 - var63 * var91.field1733 / var91.field1738;
							int var65 = var63 * var91.field1744 / var91.field1738 + -var91.field1744;
							int var66 = var64 + (var2 + Client.viewportTempX - (var52 >> 1));
							int var67 = var65 + (var3 + Client.viewportTempY - 12);
							int var68 = var67;
							int var69 = var67 + var43;
							int var70 = var67 + var91.field1748 + 15;
							int var71 = var70 - var80.maxAscent;
							int var72 = var70 + var80.maxDescent;
							if (var71 < var67) {
								var68 = var71;
							}

							if (var72 > var69) {
								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (var16 != null) {
								var73 = var67 + var16.field1748 + 15;
								var74 = var73 - var45.maxAscent;
								var75 = var73 + var45.maxDescent;
								if (var74 < var68) {
									;
								}

								if (var75 > var69) {
									;
								}
							}

							var74 = 255;
							if (var91.field1745 >= 0) {
								var74 = (var63 << 8) / (var91.field1738 - var91.field1745);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var19 != null) {
									var19.drawTransAt(var66 + var53 - var27, var67, var74);
								}

								if (var21 != null) {
									var21.drawTransAt(var54 + var66 - var29, var67, var74);
								}

								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransAt(var75 * var24 + (var55 + var66 - var28), var67, var74);
									}
								}

								if (var22 != null) {
									var22.drawTransAt(var57 + var66 - var30, var67, var74);
								}

								var80.drawAlpha(var46, var56 + var66, var70, var91.textColor, 0, var74);
								if (var16 != null) {
									if (var31 != null) {
										var31.drawTransAt(var58 + var66 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.drawTransAt(var66 + var59 - var41, var67, var74);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransAt(var75 * var36 + (var66 + var60 - var40), var67, var74);
										}
									}

									if (var34 != null) {
										var34.drawTransAt(var61 + var66 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var66 + var62, var73, var16.textColor, 0, var74);
								}
							} else {
								if (var19 != null) {
									var19.drawTransBgAt(var53 + var66 - var27, var67);
								}

								if (var21 != null) {
									var21.drawTransBgAt(var66 + var54 - var29, var67);
								}

								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransBgAt(var75 * var24 + (var66 + var55 - var28), var67);
									}
								}

								if (var22 != null) {
									var22.drawTransBgAt(var66 + var57 - var30, var67);
								}

								var80.draw(var46, var66 + var56, var70, var91.textColor | -16777216, 0);
								if (var16 != null) {
									if (var31 != null) {
										var31.drawTransBgAt(var66 + var58 - var39, var67);
									}

									if (var33 != null) {
										var33.drawTransBgAt(var66 + var59 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransBgAt(var75 * var36 + (var66 + var60 - var40), var67);
										}
									}

									if (var34 != null) {
										var34.drawTransBgAt(var66 + var61 - var42, var67);
									}

									var45.draw(var47, var66 + var62, var73, var16.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
