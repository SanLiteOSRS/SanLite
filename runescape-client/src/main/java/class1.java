import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
final class class1 implements class0 {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -115998375
	)
	static int field3;
	@ObfuscatedName("x")
	static int[] field1;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive15")
	static Archive archive15;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;Lkb;I)V",
		garbageValue = "192866787"
	)
	public void vmethod69(Object var1, Buffer var2) {
		this.method9((Integer)var1, var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkb;I)Ljava/lang/Object;",
		garbageValue = "-1094020977"
	)
	public Object vmethod72(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Integer;Lkb;B)V",
		garbageValue = "0"
	)
	void method9(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@ObfuscatedName("f")
	static boolean method8(long var0) {
		return KeyHandler.method921(var0) == 2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIIZIZI)V",
		garbageValue = "1800966997"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = DefaultsGroup.World_worlds[var6];
			DefaultsGroup.World_worlds[var6] = DefaultsGroup.World_worlds[var1];
			DefaultsGroup.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (WorldMapIcon_1.method395(DefaultsGroup.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = DefaultsGroup.World_worlds[var9];
					DefaultsGroup.World_worlds[var9] = DefaultsGroup.World_worlds[var7];
					DefaultsGroup.World_worlds[var7++] = var10;
				}
			}

			DefaultsGroup.World_worlds[var1] = DefaultsGroup.World_worlds[var7];
			DefaultsGroup.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-1463898709"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "6"
	)
	static final int method20(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		signature = "(Lcs;IIIIII)V",
		garbageValue = "-1076468107"
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
			Player var10;
			int var12;
			if (var1 < var76 && var0.playerCycle == Client.cycle) {
				var10 = (Player)var0;
				boolean var9;
				if (Client.drawPlayerNames == 0) {
					var9 = false;
				} else if (var10 == PlayerType.localPlayer) {
					var9 = WorldMapAreaData.method786();
				} else {
					var9 = WorldMapSection1.method681() || class2.method28() && var10.isFriend() || Widget.method4239() && var10.isClanMember();
				}

				if (var9) {
					Player var11 = (Player)var0;
					if (var1 < var76) {
						var12 = var0.defaultHeight + 15;
						class13.worldToScreen(var0.x, var0.y, var12);
						AbstractFont var13 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
						byte var14 = 9;
						var13.drawCentered(var11.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var14, 16777215, 0);
						var8 = 18;
					}
				}
			}

			int var88 = -2;
			int var17;
			int var23;
			int var24;
			int var77;
			if (!var0.healthBars.method4990()) {
				var77 = var0.defaultHeight + 15;
				class13.worldToScreen(var0.x, var0.y, var77);

				for (HealthBar var90 = (HealthBar)var0.healthBars.last(); var90 != null; var90 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var78 = var90.get(Client.cycle);
					if (var78 == null) {
						if (var90.isEmpty()) {
							var90.remove();
						}
					} else {
						HealthBarDefinition var91 = var90.definition;
						SpritePixels var79 = var91.getBackSprite();
						SpritePixels var15 = var91.getFrontSprite();
						var17 = 0;
						int var16;
						if (var79 != null && var15 != null) {
							if (var91.widthPadding * 2 < var15.subWidth) {
								var17 = var91.widthPadding;
							}

							var16 = var15.subWidth - var17 * 2;
						} else {
							var16 = var91.width;
						}

						int var18 = 255;
						boolean var19 = true;
						int var20 = Client.cycle - var78.cycle;
						int var21 = var16 * var78.health2 / var91.width;
						int var22;
						int var94;
						if (var78.cycleOffset > var20) {
							var22 = var91.field3314 == 0 ? 0 : var91.field3314 * (var20 / var91.field3314);
							var23 = var16 * var78.health / var91.width;
							var94 = var22 * (var21 - var23) / var78.cycleOffset + var23;
						} else {
							var94 = var21;
							var22 = var91.int5 + var78.cycleOffset - var20;
							if (var91.int3 >= 0) {
								var18 = (var22 << 8) / (var91.int5 - var91.int3);
							}
						}

						if (var78.health2 > 0 && var94 < 1) {
							var94 = 1;
						}

						if (var79 != null && var15 != null) {
							if (var16 == var94) {
								var94 += var17 * 2;
							} else {
								var94 += var17;
							}

							var22 = var79.subHeight;
							var88 += var22;
							var23 = var2 + Client.viewportTempX - (var16 >> 1);
							var24 = var3 + Client.viewportTempY - var88;
							var23 -= var17;
							if (var18 >= 0 && var18 < 255) {
								var79.drawTransAt(var23, var24, var18);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var94, var22 + var24);
								var15.drawTransAt(var23, var24, var18);
							} else {
								var79.drawTransBgAt(var23, var24);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var94, var24 + var22);
								var15.drawTransBgAt(var23, var24);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var88 += 2;
						} else {
							var88 += 5;
							if (Client.viewportTempX > -1) {
								var22 = var2 + Client.viewportTempX - (var16 >> 1);
								var23 = var3 + Client.viewportTempY - var88;
								Rasterizer2D.Rasterizer2D_fillRectangle(var22, var23, var94, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var22 + var94, var23, var16 - var94, 5, 16711680);
							}

							var88 += 2;
						}
					}
				}
			}

			if (var88 == -2) {
				var88 += 7;
			}

			var88 += var8;
			int var80;
			if (var1 < var76) {
				var10 = (Player)var0;
				if (var10.isHidden) {
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) {
					var80 = var0.defaultHeight + 15;
					class13.worldToScreen(var0.x, var0.y, var80);
					if (Client.viewportTempX > -1) {
						if (var10.headIconPk != -1) {
							var88 += 25;
							World.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var88);
						}

						if (var10.headIconPrayer != -1) {
							var88 += 25;
							TaskHandler.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var88);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					var80 = var0.defaultHeight + 15;
					class13.worldToScreen(var0.x, var0.y, var80);
					if (Client.viewportTempX > -1) {
						var88 += class337.headIconHintSprites[1].subHeight;
						class337.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var88);
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition;
				if (var89.transforms != null) {
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < TaskHandler.headIconPrayerSprites.length) {
					var80 = var0.defaultHeight + 15;
					class13.worldToScreen(var0.x, var0.y, var80);
					if (Client.viewportTempX > -1) {
						TaskHandler.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30);
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					var80 = var0.defaultHeight + 15;
					class13.worldToScreen(var0.x, var0.y, var80);
					if (Client.viewportTempX > -1) {
						class337.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var76 || !var0.field974 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				var77 = var0.defaultHeight;
				class13.worldToScreen(var0.x, var0.y, var77);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.field955) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = ReflectionCheck.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = ReflectionCheck.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY;
					Client.overheadTextColors[Client.overheadTextCount] = var0.field992;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.field993;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
				}
			}

			for (var77 = 0; var77 < 4; ++var77) {
				var80 = var0.hitSplatCycles[var77];
				var12 = var0.hitSplatTypes[var77];
				HitSplatDefinition var92 = null;
				int var93 = 0;
				if (var12 >= 0) {
					if (var80 <= Client.cycle) {
						continue;
					}

					var92 = class258.method4654(var0.hitSplatTypes[var77]);
					var93 = var92.field3370;
					if (var92 != null && var92.transforms != null) {
						var92 = var92.transform();
						if (var92 == null) {
							var0.hitSplatCycles[var77] = -1;
							continue;
						}
					}
				} else if (var80 < 0) {
					continue;
				}

				int var81 = var0.hitSplatTypes2[var77];
				HitSplatDefinition var82 = null;
				if (var81 >= 0) {
					var82 = class258.method4654(var81);
					if (var82 != null && var82.transforms != null) {
						var82 = var82.transform();
					}
				}

				if (var80 - var93 <= Client.cycle) {
					if (var92 == null) {
						var0.hitSplatCycles[var77] = -1;
					} else {
						var17 = var0.defaultHeight / 2;
						class13.worldToScreen(var0.x, var0.y, var17);
						if (Client.viewportTempX > -1) {
							if (var77 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var77 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var77 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var83 = null;
							SpritePixels var84 = null;
							SpritePixels var85 = null;
							SpritePixels var86 = null;
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
							var83 = var92.method4748();
							int var44;
							if (var83 != null) {
								var23 = var83.subWidth;
								var44 = var83.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var83.xOffset;
							}

							var84 = var92.method4733();
							if (var84 != null) {
								var24 = var84.subWidth;
								var44 = var84.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var84.xOffset;
							}

							var85 = var92.method4731();
							if (var85 != null) {
								var25 = var85.subWidth;
								var44 = var85.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var85.xOffset;
							}

							var86 = var92.method4727();
							if (var86 != null) {
								var26 = var86.subWidth;
								var44 = var86.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var86.xOffset;
							}

							if (var82 != null) {
								var31 = var82.method4748();
								if (var31 != null) {
									var35 = var31.subWidth;
									var44 = var31.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.xOffset;
								}

								var32 = var82.method4733();
								if (var32 != null) {
									var36 = var32.subWidth;
									var44 = var32.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.xOffset;
								}

								var33 = var82.method4731();
								if (var33 != null) {
									var37 = var33.subWidth;
									var44 = var33.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.xOffset;
								}

								var34 = var82.method4727();
								if (var34 != null) {
									var38 = var34.subWidth;
									var44 = var34.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.xOffset;
								}
							}

							Font var87 = var92.getFont();
							if (var87 == null) {
								var87 = DevicePcmPlayerProvider.fontPlain11;
							}

							Font var45;
							if (var82 != null) {
								var45 = var82.getFont();
								if (var45 == null) {
									var45 = DevicePcmPlayerProvider.fontPlain11;
								}
							} else {
								var45 = DevicePcmPlayerProvider.fontPlain11;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var92.getString(var0.hitSplatValues[var77]);
							int var95 = var87.stringWidth(var46);
							if (var82 != null) {
								var47 = var82.getString(var0.hitSplatValues2[var77]);
								var49 = var45.stringWidth(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (var85 == null && var86 == null) {
									var50 = 1;
								} else {
									var50 = var95 / var24 + 1;
								}
							}

							if (var82 != null && var36 > 0) {
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
								var56 += (var57 - var95) / 2;
							} else {
								var52 += var95;
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
							if (var82 != null) {
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
									var63 = var36 * var51;
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

							var63 = var0.hitSplatCycles[var77] - Client.cycle;
							int var64 = var92.field3364 - var63 * var92.field3364 / var92.field3370;
							int var65 = var63 * var92.field3365 / var92.field3370 + -var92.field3365;
							int var66 = var64 + (var2 + Client.viewportTempX - (var52 >> 1));
							int var67 = var65 + (var3 + Client.viewportTempY - 12);
							int var68 = var67;
							int var69 = var43 + var67;
							int var70 = var67 + var92.field3351 + 15;
							int var71 = var70 - var87.maxAscent;
							int var72 = var70 + var87.maxDescent;
							if (var71 < var67) {
								var68 = var71;
							}

							if (var72 > var69) {
								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (var82 != null) {
								var73 = var67 + var82.field3351 + 15;
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
							if (var92.field3366 >= 0) {
								var74 = (var63 << 8) / (var92.field3370 - var92.field3366);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var83 != null) {
									var83.drawTransAt(var66 + var53 - var27, var67, var74);
								}

								if (var85 != null) {
									var85.drawTransAt(var54 + var66 - var29, var67, var74);
								}

								if (var84 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var84.drawTransAt(var24 * var75 + (var66 + var55 - var28), var67, var74);
									}
								}

								if (var86 != null) {
									var86.drawTransAt(var66 + var57 - var30, var67, var74);
								}

								var87.drawAlpha(var46, var66 + var56, var70, var92.textColor, 0, var74);
								if (var82 != null) {
									if (var31 != null) {
										var31.drawTransAt(var66 + var58 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.drawTransAt(var66 + var59 - var41, var67, var74);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransAt(var75 * var36 + (var60 + var66 - var40), var67, var74);
										}
									}

									if (var34 != null) {
										var34.drawTransAt(var66 + var61 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var62 + var66, var73, var82.textColor, 0, var74);
								}
							} else {
								if (var83 != null) {
									var83.drawTransBgAt(var66 + var53 - var27, var67);
								}

								if (var85 != null) {
									var85.drawTransBgAt(var66 + var54 - var29, var67);
								}

								if (var84 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var84.drawTransBgAt(var24 * var75 + (var66 + var55 - var28), var67);
									}
								}

								if (var86 != null) {
									var86.drawTransBgAt(var57 + var66 - var30, var67);
								}

								var87.draw(var46, var66 + var56, var70, var92.textColor | -16777216, 0);
								if (var82 != null) {
									if (var31 != null) {
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}

									if (var33 != null) {
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransBgAt(var75 * var36 + (var66 + var60 - var40), var67);
										}
									}

									if (var34 != null) {
										var34.drawTransBgAt(var66 + var61 - var42, var67);
									}

									var45.draw(var47, var66 + var62, var73, var82.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2141272771"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class4.getPacketBufferNode(ClientPacket.field2329, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
