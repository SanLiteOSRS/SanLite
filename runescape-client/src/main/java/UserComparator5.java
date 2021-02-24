import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("n")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lky;Lky;I)I",
		garbageValue = "-159510893"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(IB)Lld;",
		garbageValue = "25"
	)
	public static PrivateChatMode method3604(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field3831, PrivateChatMode.field3829, PrivateChatMode.field3830};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field3832) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-179435824"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (WorldMapDecorationType.pcmPlayer1 != null) {
			WorldMapDecorationType.pcmPlayer1.run();
		}

		if (class197.pcmPlayer0 != null) {
			class197.pcmPlayer0.run();
		}

	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		signature = "(Lcv;IIIIIB)V",
		garbageValue = "1"
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

			int var75 = Players.Players_count;
			int[] var7 = Players.Players_indices;
			byte var8 = 0;
			Player var10;
			if (var1 < var75 && var0.playerCycle == Client.cycle) {
				var10 = (Player)var0;
				boolean var9;
				if (Client.drawPlayerNames == 0) {
					var9 = false;
				} else if (var10 == UserComparator9.localPlayer) {
					var9 = ArchiveDiskAction.method4359();
				} else {
					boolean var77 = GameBuild.method4350();
					boolean var78;
					if (!var77) {
						var78 = (Client.drawPlayerNames & 1) != 0;
						var77 = var78 && var10.isFriend();
					}

					var78 = var77;
					if (!var77) {
						boolean var13 = (Client.drawPlayerNames & 2) != 0;
						var78 = var13 && var10.isClanMember();
					}

					var9 = var78;
				}

				if (var9) {
					Player var11 = (Player)var0;
					if (var1 < var75) {
						SoundCache.method2689(var0, var0.defaultHeight + 15);
						AbstractFont var12 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
						byte var92 = 9;
						var12.drawCentered(var11.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var92, 16777215, 0);
						var8 = 18;
					}
				}
			}

			int var87 = -2;
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method5064()) {
				SoundCache.method2689(var0, var0.defaultHeight + 15);

				for (HealthBar var88 = (HealthBar)var0.healthBars.last(); var88 != null; var88 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var89 = var88.get(Client.cycle);
					if (var89 == null) {
						if (var88.isEmpty()) {
							var88.remove();
						}
					} else {
						HealthBarDefinition var91 = var88.definition;
						SpritePixels var76 = var91.getBackSprite();
						SpritePixels var14 = var91.getFrontSprite();
						int var16 = 0;
						if (var76 != null && var14 != null) {
							if (var91.widthPadding * 2 < var14.subWidth) {
								var16 = var91.widthPadding;
							}

							var15 = var14.subWidth - var16 * 2;
						} else {
							var15 = var91.width;
						}

						int var17 = 255;
						boolean var18 = true;
						int var19 = Client.cycle - var89.cycle;
						int var20 = var15 * var89.health2 / var91.width;
						int var21;
						int var93;
						if (var89.cycleOffset > var19) {
							var21 = var91.field3316 == 0 ? 0 : var91.field3316 * (var19 / var91.field3316);
							var22 = var15 * var89.health / var91.width;
							var93 = var21 * (var20 - var22) / var89.cycleOffset + var22;
						} else {
							var93 = var20;
							var21 = var91.int5 + var89.cycleOffset - var19;
							if (var91.int3 >= 0) {
								var17 = (var21 << 8) / (var91.int5 - var91.int3);
							}
						}

						if (var89.health2 > 0 && var93 < 1) {
							var93 = 1;
						}

						if (var76 != null && var14 != null) {
							if (var15 == var93) {
								var93 += var16 * 2;
							} else {
								var93 += var16;
							}

							var21 = var76.subHeight;
							var87 += var21;
							var22 = var2 + Client.viewportTempX - (var15 >> 1);
							var23 = var3 + Client.viewportTempY - var87;
							var22 -= var16;
							if (var17 >= 0 && var17 < 255) {
								var76.drawTransAt(var22, var23, var17);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var93 + var22, var21 + var23);
								var14.drawTransAt(var22, var23, var17);
							} else {
								var76.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var93 + var22, var21 + var23);
								var14.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var87 += 2;
						} else {
							var87 += 5;
							if (Client.viewportTempX > -1) {
								var21 = var2 + Client.viewportTempX - (var15 >> 1);
								var22 = var3 + Client.viewportTempY - var87;
								Rasterizer2D.Rasterizer2D_fillRectangle(var21, var22, var93, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var21 + var93, var22, var15 - var93, 5, 16711680);
							}

							var87 += 2;
						}
					}
				}
			}

			if (var87 == -2) {
				var87 += 7;
			}

			var87 += var8;
			if (var1 < var75) {
				var10 = (Player)var0;
				if (var10.isHidden) {
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) {
					SoundCache.method2689(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var10.headIconPk != -1) {
							var87 += 25;
							Client.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87);
						}

						if (var10.headIconPrayer != -1) {
							var87 += 25;
							class169.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					SoundCache.method2689(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var87 += class13.headIconHintSprites[1].subHeight;
						class13.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var87);
					}
				}
			} else {
				NPCComposition var90 = ((NPC)var0).definition;
				if (var90.transforms != null) {
					var90 = var90.transform();
				}

				if (var90.headIconPrayer >= 0 && var90.headIconPrayer < class169.headIconPrayerSprites.length) {
					SoundCache.method2689(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						class169.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30);
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					SoundCache.method2689(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						class13.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field968 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				SoundCache.method2689(var0, var0.defaultHeight);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = ScriptEvent.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = ScriptEvent.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY;
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
				}
			}

			for (int var79 = 0; var79 < 4; ++var79) {
				int var96 = var0.hitSplatCycles[var79];
				int var97 = var0.hitSplatTypes[var79];
				HitSplatDefinition var95 = null;
				int var80 = 0;
				if (var97 >= 0) {
					if (var96 <= Client.cycle) {
						continue;
					}

					var95 = ScriptFrame.method1222(var0.hitSplatTypes[var79]);
					var80 = var95.field3364;
					if (var95 != null && var95.transforms != null) {
						var95 = var95.transform();
						if (var95 == null) {
							var0.hitSplatCycles[var79] = -1;
							continue;
						}
					}
				} else if (var96 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var79];
				HitSplatDefinition var81 = null;
				if (var15 >= 0) {
					var81 = ScriptFrame.method1222(var15);
					if (var81 != null && var81.transforms != null) {
						var81 = var81.transform();
					}
				}

				if (var96 - var80 <= Client.cycle) {
					if (var95 == null) {
						var0.hitSplatCycles[var79] = -1;
					} else {
						SoundCache.method2689(var0, var0.defaultHeight / 2);
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

							SpritePixels var82 = null;
							SpritePixels var83 = null;
							SpritePixels var84 = null;
							SpritePixels var85 = null;
							var22 = 0;
							var23 = 0;
							int var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							SpritePixels var30 = null;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							int var34 = 0;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							var82 = var95.method4764();
							int var43;
							if (var82 != null) {
								var22 = var82.subWidth;
								var43 = var82.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var82.xOffset;
							}

							var83 = var95.method4770();
							if (var83 != null) {
								var23 = var83.subWidth;
								var43 = var83.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var83.xOffset;
							}

							var84 = var95.method4769();
							if (var84 != null) {
								var24 = var84.subWidth;
								var43 = var84.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var84.xOffset;
							}

							var85 = var95.method4766();
							if (var85 != null) {
								var25 = var85.subWidth;
								var43 = var85.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var85.xOffset;
							}

							if (var81 != null) {
								var30 = var81.method4764();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var81.method4770();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var81.method4769();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var81.method4766();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var86 = var95.getFont();
							if (var86 == null) {
								var86 = SecureRandomCallable.fontPlain11;
							}

							Font var44;
							if (var81 != null) {
								var44 = var81.getFont();
								if (var44 == null) {
									var44 = SecureRandomCallable.fontPlain11;
								}
							} else {
								var44 = SecureRandomCallable.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var95.getString(var0.hitSplatValues[var79]);
							int var94 = var86.stringWidth(var45);
							if (var81 != null) {
								var46 = var81.getString(var0.hitSplatValues2[var79]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var84 == null && var85 == null) {
									var49 = 1;
								} else {
									var49 = var94 / var23 + 1;
								}
							}

							if (var81 != null && var35 > 0) {
								if (var32 == null && var33 == null) {
									var50 = 1;
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0;
							int var52 = var51;
							if (var22 > 0) {
								var51 += var22;
							}

							var51 += 2;
							int var53 = var51;
							if (var24 > 0) {
								var51 += var24;
							}

							int var54 = var51;
							int var55 = var51;
							int var56;
							if (var23 > 0) {
								var56 = var23 * var49;
								var51 += var56;
								var55 += (var56 - var94) / 2;
							} else {
								var51 += var94;
							}

							var56 = var51;
							if (var25 > 0) {
								var51 += var25;
							}

							int var57 = 0;
							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62;
							if (var81 != null) {
								var51 += 2;
								var57 = var51;
								if (var34 > 0) {
									var51 += var34;
								}

								var51 += 2;
								var58 = var51;
								if (var36 > 0) {
									var51 += var36;
								}

								var59 = var51;
								var61 = var51;
								if (var35 > 0) {
									var62 = var35 * var50;
									var51 += var62;
									var61 += (var62 - var48) / 2;
								} else {
									var51 += var48;
								}

								var60 = var51;
								if (var37 > 0) {
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var79] - Client.cycle;
							int var63 = var95.field3378 - var62 * var95.field3378 / var95.field3364;
							int var64 = var62 * var95.field3370 / var95.field3364 + -var95.field3370;
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
							int var66 = var64 + (var3 + Client.viewportTempY - 12);
							int var67 = var66;
							int var68 = var66 + var42;
							int var69 = var66 + var95.field3368 + 15;
							int var70 = var69 - var86.maxAscent;
							int var71 = var69 + var86.maxDescent;
							if (var70 < var66) {
								var67 = var70;
							}

							if (var71 > var68) {
								var68 = var71;
							}

							int var72 = 0;
							int var73;
							int var74;
							if (var81 != null) {
								var72 = var66 + var81.field3368 + 15;
								var73 = var72 - var44.maxAscent;
								var74 = var72 + var44.maxDescent;
								if (var73 < var67) {
									;
								}

								if (var74 > var68) {
									;
								}
							}

							var73 = 255;
							if (var95.field3371 >= 0) {
								var73 = (var62 << 8) / (var95.field3364 - var95.field3371);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var82 != null) {
									var82.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var84 != null) {
									var84.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var83 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var83.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73);
									}
								}

								if (var85 != null) {
									var85.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var86.drawAlpha(var45, var65 + var55, var69, var95.textColor, 0, var73);
								if (var81 != null) {
									if (var30 != null) {
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var35 * var74 + (var59 + var65 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var81.textColor, 0, var73);
								}
							} else {
								if (var82 != null) {
									var82.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var84 != null) {
									var84.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var83 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var83.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66);
									}
								}

								if (var85 != null) {
									var85.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var86.draw(var45, var55 + var65, var69, var95.textColor | -16777216, 0);
								if (var81 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var35 * var74 + (var59 + var65 - var39), var66);
										}
									}

									if (var33 != null) {
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var81.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
