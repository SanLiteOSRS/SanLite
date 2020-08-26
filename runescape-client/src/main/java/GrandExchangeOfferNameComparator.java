import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("r")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		signature = "[Lhq;"
	)
	static Widget[] field115;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "Llr;"
	)
	static Bounds field112;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1454055259
	)
	static int field114;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lf;Lf;I)I",
		garbageValue = "-1190870183"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(II)Ljp;",
		garbageValue = "-615080564"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "1335089944"
	)
	static int method231(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		signature = "(Lbf;IIB)V",
		garbageValue = "2"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = WorldMapRegion.SequenceDefinition_get(var1).field3535;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1009 = 0;
			}

			if (var3 == 2) {
				var0.field1009 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || WorldMapRegion.SequenceDefinition_get(var1).field3537 >= WorldMapRegion.SequenceDefinition_get(var0.sequence).field3537) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1009 = 0;
			var0.field973 = var0.pathLength;
		}

	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		signature = "(Lcg;IIIIII)V",
		garbageValue = "930508889"
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
			if (var1 < var75 && var0.playerCycle == Client.cycle && PrivateChatMode.method6022((Player)var0)) {
				Player var9 = (Player)var0;
				if (var1 < var75) {
					Coord.method4086(var0, var0.defaultHeight + 15);
					AbstractFont var10 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
					byte var11 = 9;
					var10.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var11, 16777215, 0);
					var8 = 18;
				}
			}

			int var76 = -2;
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method4945()) {
				Coord.method4086(var0, var0.defaultHeight + 15);

				for (HealthBar var87 = (HealthBar)var0.healthBars.last(); var87 != null; var87 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var77 = var87.get(Client.cycle);
					if (var77 == null) {
						if (var87.isEmpty()) {
							var87.remove();
						}
					} else {
						HealthBarDefinition var12 = var87.definition;
						SpritePixels var13 = var12.getBackSprite();
						SpritePixels var14 = var12.getFrontSprite();
						int var16 = 0;
						if (var13 != null && var14 != null) {
							if (var12.widthPadding * 2 < var14.subWidth) {
								var16 = var12.widthPadding;
							}

							var15 = var14.subWidth - var16 * 2;
						} else {
							var15 = var12.width;
						}

						int var17 = 255;
						boolean var18 = true;
						int var19 = Client.cycle - var77.cycle;
						int var20 = var15 * var77.health2 / var12.width;
						int var21;
						int var92;
						if (var77.cycleOffset > var19) {
							var21 = var12.field3310 == 0 ? 0 : var12.field3310 * (var19 / var12.field3310);
							var22 = var15 * var77.health / var12.width;
							var92 = var21 * (var20 - var22) / var77.cycleOffset + var22;
						} else {
							var92 = var20;
							var21 = var77.cycleOffset + var12.int5 - var19;
							if (var12.int3 >= 0) {
								var17 = (var21 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var77.health2 > 0 && var92 < 1) {
							var92 = 1;
						}

						if (var13 != null && var14 != null) {
							if (var92 == var15) {
								var92 += var16 * 2;
							} else {
								var92 += var16;
							}

							var21 = var13.subHeight;
							var76 += var21;
							var22 = var2 + Client.viewportTempX - (var15 >> 1);
							var23 = var3 + Client.viewportTempY - var76;
							var22 -= var16;
							if (var17 >= 0 && var17 < 255) {
								var13.drawTransAt(var22, var23, var17);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var92, var21 + var23);
								var14.drawTransAt(var22, var23, var17);
							} else {
								var13.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var92 + var22, var23 + var21);
								var14.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var76 += 2;
						} else {
							var76 += 5;
							if (Client.viewportTempX > -1) {
								var21 = var2 + Client.viewportTempX - (var15 >> 1);
								var22 = var3 + Client.viewportTempY - var76;
								Rasterizer2D.Rasterizer2D_fillRectangle(var21, var22, var92, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var21 + var92, var22, var15 - var92, 5, 16711680);
							}

							var76 += 2;
						}
					}
				}
			}

			if (var76 == -2) {
				var76 += 7;
			}

			var76 += var8;
			if (var1 < var75) {
				Player var88 = (Player)var0;
				if (var88.isHidden) {
					return;
				}

				if (var88.headIconPk != -1 || var88.headIconPrayer != -1) {
					Coord.method4086(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var88.headIconPk != -1) {
							var76 += 25;
							class279.headIconPkSprites[var88.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76);
						}

						if (var88.headIconPrayer != -1) {
							var76 += 25;
							Client.headIconPrayerSprites[var88.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					Coord.method4086(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var76 += Varcs.headIconHintSprites[1].subHeight;
						Varcs.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76);
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition;
				if (var89.transforms != null) {
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < Client.headIconPrayerSprites.length) {
					Coord.method4086(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						Client.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30);
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					Coord.method4086(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						Varcs.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field986 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				Coord.method4086(var0, var0.defaultHeight);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = class4.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = class4.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY;
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
				}
			}

			for (int var78 = 0; var78 < 4; ++var78) {
				int var90 = var0.hitSplatCycles[var78];
				int var79 = var0.hitSplatTypes[var78];
				HitSplatDefinition var91 = null;
				int var80 = 0;
				if (var79 >= 0) {
					if (var90 <= Client.cycle) {
						continue;
					}

					var91 = MusicPatchNode.method3929(var0.hitSplatTypes[var78]);
					var80 = var91.field3356;
					if (var91 != null && var91.transforms != null) {
						var91 = var91.transform();
						if (var91 == null) {
							var0.hitSplatCycles[var78] = -1;
							continue;
						}
					}
				} else if (var90 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var78];
				HitSplatDefinition var81 = null;
				if (var15 >= 0) {
					var81 = MusicPatchNode.method3929(var15);
					if (var81 != null && var81.transforms != null) {
						var81 = var81.transform();
					}
				}

				if (var90 - var80 <= Client.cycle) {
					if (var91 == null) {
						var0.hitSplatCycles[var78] = -1;
					} else {
						Coord.method4086(var0, var0.defaultHeight / 2);
						if (Client.viewportTempX > -1) {
							if (var78 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var78 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var78 == 3) {
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
							var82 = var91.method4668();
							int var43;
							if (var82 != null) {
								var22 = var82.subWidth;
								var43 = var82.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var82.xOffset;
							}

							var83 = var91.method4681();
							if (var83 != null) {
								var23 = var83.subWidth;
								var43 = var83.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var83.xOffset;
							}

							var84 = var91.method4670();
							if (var84 != null) {
								var24 = var84.subWidth;
								var43 = var84.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var84.xOffset;
							}

							var85 = var91.method4678();
							if (var85 != null) {
								var25 = var85.subWidth;
								var43 = var85.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var85.xOffset;
							}

							if (var81 != null) {
								var30 = var81.method4668();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var81.method4681();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var81.method4670();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var81.method4678();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var86 = var91.getFont();
							if (var86 == null) {
								var86 = DynamicObject.fontPlain11;
							}

							Font var44;
							if (var81 != null) {
								var44 = var81.getFont();
								if (var44 == null) {
									var44 = DynamicObject.fontPlain11;
								}
							} else {
								var44 = DynamicObject.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var91.getString(var0.hitSplatValues[var78]);
							int var93 = var86.stringWidth(var45);
							if (var81 != null) {
								var46 = var81.getString(var0.hitSplatValues2[var78]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var84 == null && var85 == null) {
									var49 = 1;
								} else {
									var49 = var93 / var23 + 1;
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
								var56 = var49 * var23;
								var51 += var56;
								var55 += (var56 - var93) / 2;
							} else {
								var51 += var93;
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

							var62 = var0.hitSplatCycles[var78] - Client.cycle;
							int var63 = var91.field3368 - var62 * var91.field3368 / var91.field3356;
							int var64 = var62 * var91.field3362 / var91.field3356 + -var91.field3362;
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
							int var66 = var3 + Client.viewportTempY - 12 + var64;
							int var67 = var66;
							int var68 = var66 + var42;
							int var69 = var66 + var91.field3366 + 15;
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
								var72 = var66 + var81.field3366 + 15;
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
							if (var91.field3355 >= 0) {
								var73 = (var62 << 8) / (var91.field3356 - var91.field3355);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var82 != null) {
									var82.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var84 != null) {
									var84.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var83 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var83.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73);
									}
								}

								if (var85 != null) {
									var85.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var86.drawAlpha(var45, var65 + var55, var69, var91.textColor, 0, var73);
								if (var81 != null) {
									if (var30 != null) {
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var35 * var74 + (var65 + var59 - var39), var66, var73);
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
									var84.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var83 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var83.drawTransBgAt(var74 * var23 + (var54 + var65 - var27), var66);
									}
								}

								if (var85 != null) {
									var85.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var86.draw(var45, var55 + var65, var69, var91.textColor | -16777216, 0);
								if (var81 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var74 * var35 + (var59 + var65 - var39), var66);
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

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		signature = "(Lhq;II)I",
		garbageValue = "1175033265"
	)
	static final int method230(Widget var0, int var1) {
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
						var10 = TileItem.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
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
						var7 = WorldMapLabelSize.localPlayer.combatLevel;
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
						var10 = TileItem.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
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
						var7 = WorldMapSection1.getVarbit(var9);
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
						var7 = WorldMapManager.baseX * 64 + (WorldMapLabelSize.localPlayer.x >> 7);
					}

					if (var6 == 19) {
						var7 = WorldMapLabel.baseY * 64 + (WorldMapLabelSize.localPlayer.y >> 7);
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
