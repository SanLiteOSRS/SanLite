import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4224;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4232;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4226;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4227;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4228;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4233;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final LoginType field4230;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	public static final LoginType field4231;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 454299659
	)
	final int field4229;
	@ObfuscatedName("x")
	final String field4223;

	static {
		oldscape = new LoginType(0, 0, "", "");
		field4224 = new LoginType(8, 1, "", "");
		field4232 = new LoginType(7, 2, "", "");
		field4226 = new LoginType(4, 3, "", "");
		field4227 = new LoginType(1, 4, "", "");
		field4228 = new LoginType(2, 5, "", "");
		field4233 = new LoginType(6, 6, "", "");
		field4230 = new LoginType(5, 7, "", "");
		field4231 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field4224, field4232, field4227, field4226});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4229 = var1;
		this.field4223 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lni;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4229 = var1;
		this.field4223 = var4;
	}

	public String toString() {
		return this.field4223;
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lct;IIIIII)V",
		garbageValue = "205467401"
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
			int var92;
			if (var1 < var76 && var0.playerCycle == Client.cycle) {
				var10 = (Player)var0;
				boolean var9;
				if (Client.drawPlayerNames == 0) {
					var9 = false;
				} else {
					boolean var11;
					if (var10 != HealthBarDefinition.localPlayer) {
						var11 = (Client.drawPlayerNames & 4) != 0;
						boolean var12 = var11;
						if (!var11) {
							boolean var13 = (Client.drawPlayerNames & 1) != 0;
							var12 = var13 && var10.isFriend();
						}

						var9 = var12 || Message.method1147() && var10.isFriendsChatMember();
					} else {
						var11 = (Client.drawPlayerNames & 8) != 0;
						var9 = var11;
					}
				}

				if (var9) {
					Player var77 = (Player)var0;
					if (var1 < var76) {
						var92 = var0.defaultHeight + 15;
						DefaultsGroup.worldToScreen(var0.x, var0.y, var92);
						AbstractFont var78 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
						byte var14 = 9;
						var78.drawCentered(var77.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var14, 16777215, 0);
						var8 = 18;
					}
				}
			}

			int var89 = -2;
			int var17;
			int var23;
			int var24;
			int var79;
			if (!var0.healthBars.method5633()) {
				var79 = var0.defaultHeight + 15;
				DefaultsGroup.worldToScreen(var0.x, var0.y, var79);

				for (HealthBar var95 = (HealthBar)var0.healthBars.last(); var95 != null; var95 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var81 = var95.get(Client.cycle);
					if (var81 == null) {
						if (var95.isEmpty()) {
							var95.remove();
						}
					} else {
						HealthBarDefinition var96 = var95.definition;
						SpritePixels var82 = var96.getBackSprite();
						SpritePixels var83 = var96.getFrontSprite();
						var17 = 0;
						int var84;
						if (var82 != null && var83 != null) {
							if (var96.widthPadding * 2 < var83.subWidth) {
								var17 = var96.widthPadding;
							}

							var84 = var83.subWidth - var17 * 2;
						} else {
							var84 = var96.width;
						}

						int var18 = 255;
						boolean var85 = true;
						int var86 = Client.cycle - var81.cycle;
						int var87 = var84 * var81.health2 / var96.width;
						int var88;
						int var98;
						if (var81.cycleOffset > var86) {
							var88 = var96.field1666 == 0 ? 0 : var96.field1666 * (var86 / var96.field1666);
							var23 = var84 * var81.health / var96.width;
							var98 = var88 * (var87 - var23) / var81.cycleOffset + var23;
						} else {
							var98 = var87;
							var88 = var81.cycleOffset + var96.int5 - var86;
							if (var96.int3 >= 0) {
								var18 = (var88 << 8) / (var96.int5 - var96.int3);
							}
						}

						if (var81.health2 > 0 && var98 < 1) {
							var98 = 1;
						}

						if (var82 != null && var83 != null) {
							if (var98 == var84) {
								var98 += var17 * 2;
							} else {
								var98 += var17;
							}

							var88 = var82.subHeight;
							var89 += var88;
							var23 = var2 + Client.viewportTempX - (var84 >> 1);
							var24 = var3 + Client.viewportTempY - var89;
							var23 -= var17;
							if (var18 >= 0 && var18 < 255) {
								var82.drawTransAt(var23, var24, var18);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var98, var24 + var88);
								var83.drawTransAt(var23, var24, var18);
							} else {
								var82.drawTransBgAt(var23, var24);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var98 + var23, var88 + var24);
								var83.drawTransBgAt(var23, var24);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var89 += 2;
						} else {
							var89 += 5;
							if (Client.viewportTempX > -1) {
								var88 = var2 + Client.viewportTempX - (var84 >> 1);
								var23 = var3 + Client.viewportTempY - var89;
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var23, var98, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var98, var23, var84 - var98, 5, 16711680);
							}

							var89 += 2;
						}
					}
				}
			}

			if (var89 == -2) {
				var89 += 7;
			}

			var89 += var8;
			int var91;
			if (var1 < var76) {
				var10 = (Player)var0;
				if (var10.isHidden) {
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) {
					var91 = var0.defaultHeight + 15;
					DefaultsGroup.worldToScreen(var0.x, var0.y, var91);
					if (Client.viewportTempX > -1) {
						if (var10.headIconPk != -1) {
							var89 += 25;
							Client.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
						}

						if (var10.headIconPrayer != -1) {
							var89 += 25;
							ServerPacket.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					var91 = var0.defaultHeight + 15;
					DefaultsGroup.worldToScreen(var0.x, var0.y, var91);
					if (Client.viewportTempX > -1) {
						var89 += DevicePcmPlayerProvider.headIconHintSprites[1].subHeight;
						DevicePcmPlayerProvider.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
					}
				}
			} else {
				NPCComposition var90 = ((NPC)var0).definition;
				if (var90.transforms != null) {
					var90 = var90.transform();
				}

				if (var90.headIconPrayer >= 0 && var90.headIconPrayer < ServerPacket.headIconPrayerSprites.length) {
					var91 = var0.defaultHeight + 15;
					DefaultsGroup.worldToScreen(var0.x, var0.y, var91);
					if (Client.viewportTempX > -1) {
						ServerPacket.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30);
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					var91 = var0.defaultHeight + 15;
					DefaultsGroup.worldToScreen(var0.x, var0.y, var91);
					if (Client.viewportTempX > -1) {
						DevicePcmPlayerProvider.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var76 || !var0.field1099 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				var79 = var0.defaultHeight;
				DefaultsGroup.worldToScreen(var0.x, var0.y, var79);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = Login.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = Login.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY;
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
				}
			}

			for (var79 = 0; var79 < 4; ++var79) {
				var91 = var0.hitSplatCycles[var79];
				var92 = var0.hitSplatTypes[var79];
				HitSplatDefinition var97 = null;
				int var93 = 0;
				if (var92 >= 0) {
					if (var91 <= Client.cycle) {
						continue;
					}

					var97 = Canvas.method372(var0.hitSplatTypes[var79]);
					var93 = var97.field1805;
					if (var97 != null && var97.transforms != null) {
						var97 = var97.transform();
						if (var97 == null) {
							var0.hitSplatCycles[var79] = -1;
							continue;
						}
					}
				} else if (var91 < 0) {
					continue;
				}

				int var15 = var0.hitSplatTypes2[var79];
				HitSplatDefinition var16 = null;
				if (var15 >= 0) {
					var16 = Canvas.method372(var15);
					if (var16 != null && var16.transforms != null) {
						var16 = var16.transform();
					}
				}

				if (var91 - var93 <= Client.cycle) {
					if (var97 == null) {
						var0.hitSplatCycles[var79] = -1;
					} else {
						var17 = var0.defaultHeight / 2;
						DefaultsGroup.worldToScreen(var0.x, var0.y, var17);
						if (Client.viewportTempX > -1) {
							if (var79 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var79 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var79 == 3) {
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
							var19 = var97.method3256();
							int var44;
							if (var19 != null) {
								var23 = var19.subWidth;
								var44 = var19.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var19.xOffset;
							}

							var20 = var97.method3286();
							if (var20 != null) {
								var24 = var20.subWidth;
								var44 = var20.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var20.xOffset;
							}

							var21 = var97.method3258();
							if (var21 != null) {
								var25 = var21.subWidth;
								var44 = var21.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var21.xOffset;
							}

							var22 = var97.method3281();
							if (var22 != null) {
								var26 = var22.subWidth;
								var44 = var22.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var22.xOffset;
							}

							if (var16 != null) {
								var31 = var16.method3256();
								if (var31 != null) {
									var35 = var31.subWidth;
									var44 = var31.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.xOffset;
								}

								var32 = var16.method3286();
								if (var32 != null) {
									var36 = var32.subWidth;
									var44 = var32.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.xOffset;
								}

								var33 = var16.method3258();
								if (var33 != null) {
									var37 = var33.subWidth;
									var44 = var33.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.xOffset;
								}

								var34 = var16.method3281();
								if (var34 != null) {
									var38 = var34.subWidth;
									var44 = var34.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.xOffset;
								}
							}

							Font var80 = var97.getFont();
							if (var80 == null) {
								var80 = FriendLoginUpdate.fontPlain11;
							}

							Font var45;
							if (var16 != null) {
								var45 = var16.getFont();
								if (var45 == null) {
									var45 = FriendLoginUpdate.fontPlain11;
								}
							} else {
								var45 = FriendLoginUpdate.fontPlain11;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var97.getString(var0.hitSplatValues[var79]);
							int var94 = var80.stringWidth(var46);
							if (var16 != null) {
								var47 = var16.getString(var0.hitSplatValues2[var79]);
								var49 = var45.stringWidth(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (var21 == null && var22 == null) {
									var50 = 1;
								} else {
									var50 = var94 / var24 + 1;
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
								var57 = var50 * var24;
								var52 += var57;
								var56 += (var57 - var94) / 2;
							} else {
								var52 += var94;
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

							var63 = var0.hitSplatCycles[var79] - Client.cycle;
							int var64 = var97.field1812 - var63 * var97.field1812 / var97.field1805;
							int var65 = var63 * var97.field1807 / var97.field1805 + -var97.field1807;
							int var66 = var64 + (var2 + Client.viewportTempX - (var52 >> 1));
							int var67 = var3 + Client.viewportTempY - 12 + var65;
							int var68 = var67;
							int var69 = var43 + var67;
							int var70 = var67 + var97.field1820 + 15;
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
								var73 = var67 + var16.field1820 + 15;
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
							if (var97.field1814 >= 0) {
								var74 = (var63 << 8) / (var97.field1805 - var97.field1814);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var19 != null) {
									var19.drawTransAt(var53 + var66 - var27, var67, var74);
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
									var22.drawTransAt(var66 + var57 - var30, var67, var74);
								}

								var80.drawAlpha(var46, var66 + var56, var70, var97.textColor, 0, var74);
								if (var16 != null) {
									if (var31 != null) {
										var31.drawTransAt(var66 + var58 - var39, var67, var74);
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
									var21.drawTransBgAt(var54 + var66 - var29, var67);
								}

								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransBgAt(var24 * var75 + (var55 + var66 - var28), var67);
									}
								}

								if (var22 != null) {
									var22.drawTransBgAt(var66 + var57 - var30, var67);
								}

								var80.draw(var46, var56 + var66, var70, var97.textColor | -16777216, 0);
								if (var16 != null) {
									if (var31 != null) {
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}

									if (var33 != null) {
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransBgAt(var36 * var75 + (var66 + var60 - var40), var67);
										}
									}

									if (var34 != null) {
										var34.drawTransBgAt(var66 + var61 - var42, var67);
									}

									var45.draw(var47, var62 + var66, var73, var16.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
