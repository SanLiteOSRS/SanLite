import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1703972791
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 278032625
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lia;Lia;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)Lfl;",
		garbageValue = "-7317"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1893915504"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1578289543"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2139268059"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = WorldMapAreaData.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) {
					break;
				}

				return false;
			case 1:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
					return false;
				}
				break;
			case 2:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) {
					break;
				}

				return false;
			case 1:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) {
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1722248862"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= this.screenY + var3.height;
		} else {
			return false;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "-104"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) {
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) {
				var3[var6 + var4] = -126;
			} else if (var7 == 402) {
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) {
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) {
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) {
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) {
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119;
			} else if (var7 == 352) {
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) {
				var3[var6 + var4] = -117;
			} else if (var7 == 338) {
				var3[var6 + var4] = -116;
			} else if (var7 == 381) {
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) {
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) {
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) {
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) {
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105;
			} else if (var7 == 732) {
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) {
				var3[var6 + var4] = -103;
			} else if (var7 == 353) {
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) {
				var3[var6 + var4] = -101;
			} else if (var7 == 339) {
				var3[var6 + var4] = -100;
			} else if (var7 == 382) {
				var3[var6 + var4] = -98;
			} else if (var7 == 376) {
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63;
			}
		}

		return var5;
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lcj;IIIIIB)V",
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
				} else if (var10 == class35.localPlayer) {
					boolean var11 = (Client.drawPlayerNames & 8) != 0;
					var9 = var11;
				} else {
					var9 = Canvas.method469() || FloorDecoration.method3799() && var10.isFriend() || class14.method223() && var10.isClanMember();
				}

				if (var9) {
					Player var76 = (Player)var0;
					if (var1 < var75) {
						GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15);
						AbstractFont var12 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
						byte var13 = 9;
						var12.drawCentered(var76.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var13, 16777215, 0);
						var8 = 18;
					}
				}
			}

			int var89 = -2;
			int var16;
			int var22;
			int var23;
			int var80;
			if (!var0.healthBars.method5149()) {
				GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15);

				for (HealthBar var90 = (HealthBar)var0.healthBars.last(); var90 != null; var90 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var98 = var90.get(Client.cycle);
					if (var98 == null) {
						if (var90.isEmpty()) {
							var90.remove();
						}
					} else {
						HealthBarDefinition var93 = var90.definition;
						SpritePixels var79 = var93.getBackSprite();
						SpritePixels var83 = var93.getFrontSprite();
						var16 = 0;
						if (var79 != null && var83 != null) {
							if (var93.widthPadding * 2 < var83.subWidth) {
								var16 = var93.widthPadding;
							}

							var80 = var83.subWidth - var16 * 2;
						} else {
							var80 = var93.width;
						}

						int var84 = 255;
						boolean var85 = true;
						int var86 = Client.cycle - var98.cycle;
						int var87 = var80 * var98.health2 / var93.width;
						int var88;
						int var100;
						if (var98.cycleOffset > var86) {
							var88 = var93.field1593 == 0 ? 0 : var93.field1593 * (var86 / var93.field1593);
							var22 = var80 * var98.health / var93.width;
							var100 = var88 * (var87 - var22) / var98.cycleOffset + var22;
						} else {
							var100 = var87;
							var88 = var98.cycleOffset + var93.int5 - var86;
							if (var93.int3 >= 0) {
								var84 = (var88 << 8) / (var93.int5 - var93.int3);
							}
						}

						if (var98.health2 > 0 && var100 < 1) {
							var100 = 1;
						}

						if (var79 != null && var83 != null) {
							if (var100 == var80) {
								var100 += var16 * 2;
							} else {
								var100 += var16;
							}

							var88 = var79.subHeight;
							var89 += var88;
							var22 = var2 + Client.viewportTempX - (var80 >> 1);
							var23 = var3 + Client.viewportTempY - var89;
							var22 -= var16;
							if (var84 >= 0 && var84 < 255) {
								var79.drawTransAt(var22, var23, var84);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var100 + var22, var88 + var23);
								var83.drawTransAt(var22, var23, var84);
							} else {
								var79.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var100, var23 + var88);
								var83.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var89 += 2;
						} else {
							var89 += 5;
							if (Client.viewportTempX > -1) {
								var88 = var2 + Client.viewportTempX - (var80 >> 1);
								var22 = var3 + Client.viewportTempY - var89;
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var100, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var100 + var88, var22, var80 - var100, 5, 16711680);
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
			if (var1 < var75) {
				var10 = (Player)var0;
				if (var10.isHidden) {
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) {
					GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var10.headIconPk != -1) {
							var89 += 25;
							class14.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
						}

						if (var10.headIconPrayer != -1) {
							var89 += 25;
							Varcs.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var89 += class375.headIconHintSprites[1].subHeight;
						class375.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
					}
				}
			} else {
				NPCComposition var91 = ((NPC)var0).definition;
				if (var91.transforms != null) {
					var91 = var91.transform();
				}

				if (var91.headIconPrayer >= 0 && var91.headIconPrayer < Varcs.headIconPrayerSprites.length) {
					GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						Varcs.headIconPrayerSprites[var91.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30);
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						class375.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1223 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = WorldMapArea.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = WorldMapArea.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY;
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) {
				int var92 = var0.hitSplatCycles[var77];
				int var78 = var0.hitSplatTypes[var77];
				HitSplatDefinition var99 = null;
				int var14 = 0;
				HitSplatDefinition var17;
				if (var78 >= 0) {
					if (var92 <= Client.cycle) {
						continue;
					}

					var16 = var0.hitSplatTypes[var77];
					var17 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var16);
					HitSplatDefinition var15;
					if (var17 != null) {
						var15 = var17;
					} else {
						byte[] var18 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var16);
						var17 = new HitSplatDefinition();
						if (var18 != null) {
							var17.decode(new Buffer(var18));
						}

						HitSplatDefinition.HitSplatDefinition_cached.put(var17, (long)var16);
						var15 = var17;
					}

					var99 = var15;
					var14 = var15.field1735;
					if (var15 != null && var15.transforms != null) {
						var99 = var15.transform();
						if (var99 == null) {
							var0.hitSplatCycles[var77] = -1;
							continue;
						}
					}
				} else if (var92 < 0) {
					continue;
				}

				var80 = var0.hitSplatTypes2[var77];
				HitSplatDefinition var81 = null;
				HitSplatDefinition var94;
				if (var80 >= 0) {
					var94 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var80);
					if (var94 != null) {
						var17 = var94;
					} else {
						byte[] var19 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var80);
						var94 = new HitSplatDefinition();
						if (var19 != null) {
							var94.decode(new Buffer(var19));
						}

						HitSplatDefinition.HitSplatDefinition_cached.put(var94, (long)var80);
						var17 = var94;
					}

					var81 = var17;
					if (var17 != null && var17.transforms != null) {
						var81 = var17.transform();
					}
				}

				if (var92 - var14 <= Client.cycle) {
					if (var99 == null) {
						var0.hitSplatCycles[var77] = -1;
					} else {
						GrandExchangeOfferTotalQuantityComparator.method4972(var0, var0.defaultHeight / 2);
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

							var94 = null;
							SpritePixels var95 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
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
							SpritePixels var96 = var99.method2890();
							int var43;
							if (var96 != null) {
								var22 = var96.subWidth;
								var43 = var96.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var96.xOffset;
							}

							var95 = var99.method2893();
							if (var95 != null) {
								var23 = var95.subWidth;
								var43 = var95.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var95.xOffset;
							}

							var20 = var99.method2871();
							if (var20 != null) {
								var24 = var20.subWidth;
								var43 = var20.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var20.xOffset;
							}

							var21 = var99.method2872();
							if (var21 != null) {
								var25 = var21.subWidth;
								var43 = var21.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var21.xOffset;
							}

							if (var81 != null) {
								var30 = var81.method2890();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var81.method2893();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var81.method2871();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var81.method2872();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var82 = var99.getFont();
							if (var82 == null) {
								var82 = class11.fontPlain11;
							}

							Font var44;
							if (var81 != null) {
								var44 = var81.getFont();
								if (var44 == null) {
									var44 = class11.fontPlain11;
								}
							} else {
								var44 = class11.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var99.getString(var0.hitSplatValues[var77]);
							int var97 = var82.stringWidth(var45);
							if (var81 != null) {
								var46 = var81.getString(var0.hitSplatValues2[var77]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var20 == null && var21 == null) {
									var49 = 1;
								} else {
									var49 = var97 / var23 + 1;
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
								var55 += (var56 - var97) / 2;
							} else {
								var51 += var97;
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

							var62 = var0.hitSplatCycles[var77] - Client.cycle;
							int var63 = var99.field1748 - var62 * var99.field1748 / var99.field1735;
							int var64 = var62 * var99.field1749 / var99.field1735 + -var99.field1749;
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
							int var66 = var64 + (var3 + Client.viewportTempY - 12);
							int var67 = var66;
							int var68 = var42 + var66;
							int var69 = var66 + var99.field1753 + 15;
							int var70 = var69 - var82.maxAscent;
							int var71 = var69 + var82.maxDescent;
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
								var72 = var66 + var81.field1753 + 15;
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
							if (var99.field1743 >= 0) {
								var73 = (var62 << 8) / (var99.field1735 - var99.field1743);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var96 != null) {
									var96.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) {
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var95 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var95.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73);
									}
								}

								if (var21 != null) {
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var55 + var65, var69, var99.textColor, 0, var73);
								if (var81 != null) {
									if (var30 != null) {
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var81.textColor, 0, var73);
								}
							} else {
								if (var96 != null) {
									var96.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) {
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var95 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var95.drawTransBgAt(var74 * var23 + (var54 + var65 - var27), var66);
									}
								}

								if (var21 != null) {
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var82.draw(var45, var55 + var65, var69, var99.textColor | -16777216, 0);
								if (var81 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var35 * var74 + (var65 + var59 - var39), var66);
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
