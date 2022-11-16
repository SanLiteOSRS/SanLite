import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class138 {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static IndexedSprite field1609;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 8250672145084732803L
	)
	long field1601;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1057186159
	)
	int field1600;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	IterableNodeDeque field1610;

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	public class138(Buffer var1) {
		this.field1600 = -1; // L: 9
		this.field1610 = new IterableNodeDeque();
		this.method3002(var1); // L: 28
	} // L: 29

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-70"
	)
	void method3002(Buffer var1) {
		this.field1601 = var1.readLong(); // L: 32
		this.field1600 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class157(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class133(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class150(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class142(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class149(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class134(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class139(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class132(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class136(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class153(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class159(this);
			} else if (var2 == 10) {
				var3 = new class145(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class140(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class144(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class154(this);
			}

			((class135)var3).vmethod3254(var1); // L: 53
			this.field1610.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "-58"
	)
	public void method3003(ClanSettings var1) {
		if (var1.field1663 == this.field1601 && this.field1600 == var1.field1664) { // L: 60
			for (class135 var2 = (class135)this.field1610.last(); var2 != null; var2 = (class135)this.field1610.previous()) { // L: 61
				var2.vmethod3248(var1); // L: 62
			}

			++var1.field1664; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "-749000678"
	)
	public static Object method3001(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 25
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIIIII)V",
		garbageValue = "1656345199"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4985
			if (var0 instanceof NPC) { // L: 4986
				NPCComposition var6 = ((NPC)var0).definition; // L: 4987
				if (var6.transforms != null) { // L: 4988
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4989
					return;
				}
			}

			int var75 = Players.Players_count; // L: 4991
			int[] var7 = Players.Players_indices; // L: 4992
			byte var8 = 0; // L: 4993
			if (var1 < var75 && var0.playerCycle == Client.cycle && WorldMapLabel.method5159((Player)var0)) { // L: 4994
				Player var9 = (Player)var0; // L: 4995
				if (var1 < var75) { // L: 4996
					class140.method3021(var0, var0.defaultHeight + 15); // L: 4997
					AbstractFont var10 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4998
					byte var11 = 9; // L: 4999
					var10.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var11, 16777215, 0); // L: 5000
					var8 = 18; // L: 5001
				}
			}

			int var76 = -2; // L: 5004
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method6721()) { // L: 5005
				class140.method3021(var0, var0.defaultHeight + 15); // L: 5006

				for (HealthBar var87 = (HealthBar)var0.healthBars.last(); var87 != null; var87 = (HealthBar)var0.healthBars.previous()) { // L: 5007
					HealthBarUpdate var79 = var87.get(Client.cycle); // L: 5008
					if (var79 == null) { // L: 5009
						if (var87.isEmpty()) { // L: 5067
							var87.remove();
						}
					} else {
						HealthBarDefinition var80 = var87.definition; // L: 5010
						SpritePixels var13 = var80.getBackSprite(); // L: 5011
						SpritePixels var81 = var80.getFrontSprite(); // L: 5012
						int var82 = 0; // L: 5014
						if (var13 != null && var81 != null) { // L: 5015
							if (var80.widthPadding * 2 < var81.subWidth) { // L: 5016
								var82 = var80.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 5017
						} else {
							var15 = var80.width; // L: 5019
						}

						int var17 = 255; // L: 5020
						boolean var83 = true; // L: 5021
						int var84 = Client.cycle - var79.cycle; // L: 5022
						int var85 = var15 * var79.health2 / var80.width; // L: 5023
						int var86;
						int var94;
						if (var79.cycleOffset > var84) { // L: 5024
							var86 = var80.field1926 == 0 ? 0 : var80.field1926 * (var84 / var80.field1926); // L: 5025
							var22 = var15 * var79.health / var80.width; // L: 5026
							var94 = var86 * (var85 - var22) / var79.cycleOffset + var22; // L: 5027
						} else {
							var94 = var85; // L: 5030
							var86 = var79.cycleOffset + var80.int5 - var84; // L: 5031
							if (var80.int3 >= 0) { // L: 5032
								var17 = (var86 << 8) / (var80.int5 - var80.int3);
							}
						}

						if (var79.health2 > 0 && var94 < 1) { // L: 5034
							var94 = 1;
						}

						if (var13 != null && var81 != null) { // L: 5035
							if (var15 == var94) { // L: 5036
								var94 += var82 * 2;
							} else {
								var94 += var82; // L: 5037
							}

							var86 = var13.subHeight; // L: 5038
							var76 += var86; // L: 5039
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5040
							var23 = var3 + Client.viewportTempY - var76; // L: 5041
							var22 -= var82; // L: 5042
							if (var17 >= 0 && var17 < 255) { // L: 5043
								var13.drawTransAt(var22, var23, var17); // L: 5044
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var94, var23 + var86); // L: 5045
								var81.drawTransAt(var22, var23, var17); // L: 5046
							} else {
								var13.drawTransBgAt(var22, var23); // L: 5049
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var94, var86 + var23); // L: 5050
								var81.drawTransBgAt(var22, var23); // L: 5051
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5053
							var76 += 2; // L: 5054
						} else {
							var76 += 5; // L: 5057
							if (Client.viewportTempX > -1) { // L: 5058
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5059
								var22 = var3 + Client.viewportTempY - var76; // L: 5060
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var94, 5, 65280); // L: 5061
								Rasterizer2D.Rasterizer2D_fillRectangle(var94 + var86, var22, var15 - var94, 5, 16711680); // L: 5062
							}

							var76 += 2; // L: 5064
						}
					}
				}
			}

			if (var76 == -2) { // L: 5070
				var76 += 7;
			}

			var76 += var8; // L: 5071
			if (var1 < var75) { // L: 5072
				Player var88 = (Player)var0; // L: 5073
				if (var88.isHidden) { // L: 5074
					return;
				}

				if (var88.headIconPk != -1 || var88.headIconPrayer != -1) { // L: 5075
					class140.method3021(var0, var0.defaultHeight + 15); // L: 5076
					if (Client.viewportTempX > -1) { // L: 5077
						if (var88.headIconPk != -1) { // L: 5078
							var76 += 25; // L: 5079
							Renderable.headIconPkSprites[var88.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 5080
						}

						if (var88.headIconPrayer != -1) { // L: 5082
							var76 += 25; // L: 5083
							class278.headIconPrayerSprites[var88.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 5084
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5088
					class140.method3021(var0, var0.defaultHeight + 15); // L: 5089
					if (Client.viewportTempX > -1) { // L: 5090
						var76 += class162.headIconHintSprites[1].subHeight; // L: 5091
						class162.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 5092
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition; // L: 5097
				if (var89.transforms != null) { // L: 5098
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < class278.headIconPrayerSprites.length) { // L: 5099
					class140.method3021(var0, var0.defaultHeight + 15); // L: 5100
					if (Client.viewportTempX > -1) { // L: 5101
						class278.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 5102
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5105
					class140.method3021(var0, var0.defaultHeight + 15); // L: 5106
					if (Client.viewportTempX > -1) { // L: 5107
						class162.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1155 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5110 5111
				class140.method3021(var0, var0.defaultHeight); // L: 5112
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 5113
					Client.overheadTextXOffsets[Client.overheadTextCount] = UserComparator3.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5114
					Client.overheadTextAscents[Client.overheadTextCount] = UserComparator3.fontBold12.ascent; // L: 5115
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5116
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 5117
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 5118
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 5119
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5120
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5121
					++Client.overheadTextCount; // L: 5122
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) { // L: 5126
				int var90 = var0.hitSplatCycles[var77]; // L: 5127
				int var12 = var0.hitSplatTypes[var77]; // L: 5128
				HitSplatDefinition var91 = null; // L: 5129
				int var14 = 0; // L: 5130
				if (var12 >= 0) { // L: 5131
					if (var90 <= Client.cycle) { // L: 5132
						continue;
					}

					var91 = class158.method3241(var0.hitSplatTypes[var77]); // L: 5133
					var14 = var91.field2056; // L: 5134
					if (var91 != null && var91.transforms != null) { // L: 5135
						var91 = var91.transform(); // L: 5136
						if (var91 == null) { // L: 5137
							var0.hitSplatCycles[var77] = -1; // L: 5138
							continue;
						}
					}
				} else if (var90 < 0) { // L: 5143
					continue;
				}

				var15 = var0.hitSplatTypes2[var77]; // L: 5144
				HitSplatDefinition var16 = null; // L: 5145
				if (var15 >= 0) { // L: 5146
					var16 = class158.method3241(var15); // L: 5147
					if (var16 != null && var16.transforms != null) { // L: 5148
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) { // L: 5150
					if (var91 == null) { // L: 5151
						var0.hitSplatCycles[var77] = -1; // L: 5152
					} else {
						class140.method3021(var0, var0.defaultHeight / 2); // L: 5155
						if (Client.viewportTempX > -1) { // L: 5156
							boolean var92 = true; // L: 5157
							if (var77 == 1) { // L: 5158
								Client.viewportTempY -= 20; // L: 5159
							}

							if (var77 == 2) { // L: 5161
								Client.viewportTempX -= 15; // L: 5162
								Client.viewportTempY -= 10; // L: 5163
							}

							if (var77 == 3) { // L: 5165
								Client.viewportTempX += 15; // L: 5166
								Client.viewportTempY -= 10; // L: 5167
							}

							SpritePixels var18 = null; // L: 5169
							SpritePixels var19 = null; // L: 5170
							SpritePixels var20 = null; // L: 5171
							SpritePixels var21 = null; // L: 5172
							var22 = 0; // L: 5173
							var23 = 0; // L: 5174
							int var24 = 0; // L: 5175
							int var25 = 0; // L: 5176
							int var26 = 0; // L: 5177
							int var27 = 0; // L: 5178
							int var28 = 0; // L: 5179
							int var29 = 0; // L: 5180
							SpritePixels var30 = null; // L: 5181
							SpritePixels var31 = null; // L: 5182
							SpritePixels var32 = null; // L: 5183
							SpritePixels var33 = null; // L: 5184
							int var34 = 0; // L: 5185
							int var35 = 0; // L: 5186
							int var36 = 0; // L: 5187
							int var37 = 0; // L: 5188
							int var38 = 0; // L: 5189
							int var39 = 0; // L: 5190
							int var40 = 0; // L: 5191
							int var41 = 0; // L: 5192
							int var42 = 0; // L: 5193
							var18 = var91.method3703(); // L: 5194
							int var43;
							if (var18 != null) { // L: 5195
								var22 = var18.subWidth; // L: 5196
								var43 = var18.subHeight; // L: 5197
								if (var43 > var42) { // L: 5198
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5199
							}

							var19 = var91.method3693(); // L: 5201
							if (var19 != null) { // L: 5202
								var23 = var19.subWidth; // L: 5203
								var43 = var19.subHeight; // L: 5204
								if (var43 > var42) { // L: 5205
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5206
							}

							var20 = var91.method3685(); // L: 5208
							if (var20 != null) { // L: 5209
								var24 = var20.subWidth; // L: 5210
								var43 = var20.subHeight; // L: 5211
								if (var43 > var42) { // L: 5212
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5213
							}

							var21 = var91.method3712(); // L: 5215
							if (var21 != null) { // L: 5216
								var25 = var21.subWidth; // L: 5217
								var43 = var21.subHeight; // L: 5218
								if (var43 > var42) { // L: 5219
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5220
							}

							if (var16 != null) { // L: 5222
								var30 = var16.method3703(); // L: 5223
								if (var30 != null) { // L: 5224
									var34 = var30.subWidth; // L: 5225
									var43 = var30.subHeight; // L: 5226
									if (var43 > var42) { // L: 5227
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5228
								}

								var31 = var16.method3693(); // L: 5230
								if (var31 != null) { // L: 5231
									var35 = var31.subWidth; // L: 5232
									var43 = var31.subHeight; // L: 5233
									if (var43 > var42) { // L: 5234
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5235
								}

								var32 = var16.method3685(); // L: 5237
								if (var32 != null) { // L: 5238
									var36 = var32.subWidth; // L: 5239
									var43 = var32.subHeight; // L: 5240
									if (var43 > var42) { // L: 5241
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5242
								}

								var33 = var16.method3712(); // L: 5244
								if (var33 != null) { // L: 5245
									var37 = var33.subWidth; // L: 5246
									var43 = var33.subHeight; // L: 5247
									if (var43 > var42) { // L: 5248
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5249
								}
							}

							Font var78 = var91.getFont(); // L: 5254
							if (var78 == null) { // L: 5255
								var78 = ModeWhere.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 5256
								var44 = var16.getFont(); // L: 5257
								if (var44 == null) { // L: 5258
									var44 = ModeWhere.fontPlain11;
								}
							} else {
								var44 = ModeWhere.fontPlain11; // L: 5260
							}

							String var45 = null; // L: 5261
							String var46 = null; // L: 5262
							boolean var47 = false; // L: 5263
							int var48 = 0; // L: 5264
							var45 = var91.getString(var0.hitSplatValues[var77]); // L: 5265
							int var93 = var78.stringWidth(var45); // L: 5266
							if (var16 != null) { // L: 5267
								var46 = var16.getString(var0.hitSplatValues2[var77]); // L: 5268
								var48 = var44.stringWidth(var46); // L: 5269
							}

							int var49 = 0; // L: 5271
							int var50 = 0; // L: 5272
							if (var23 > 0) { // L: 5273
								if (var20 == null && var21 == null) { // L: 5274
									var49 = 1; // L: 5275
								} else {
									var49 = var93 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 5277 5278
								if (var32 == null && var33 == null) { // L: 5279
									var50 = 1; // L: 5280
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5283
							int var52 = var51; // L: 5284
							if (var22 > 0) { // L: 5285
								var51 += var22;
							}

							var51 += 2; // L: 5286
							int var53 = var51; // L: 5287
							if (var24 > 0) { // L: 5288
								var51 += var24;
							}

							int var54 = var51; // L: 5289
							int var55 = var51; // L: 5290
							int var56;
							if (var23 > 0) { // L: 5291
								var56 = var49 * var23; // L: 5292
								var51 += var56; // L: 5293
								var55 += (var56 - var93) / 2; // L: 5294
							} else {
								var51 += var93; // L: 5297
							}

							var56 = var51; // L: 5299
							if (var25 > 0) { // L: 5300
								var51 += var25;
							}

							int var57 = 0; // L: 5301
							int var58 = 0; // L: 5302
							int var59 = 0; // L: 5303
							int var60 = 0; // L: 5304
							int var61 = 0; // L: 5305
							int var62;
							if (var16 != null) { // L: 5306
								var51 += 2; // L: 5307
								var57 = var51; // L: 5308
								if (var34 > 0) {
									var51 += var34; // L: 5309
								}

								var51 += 2; // L: 5310
								var58 = var51; // L: 5311
								if (var36 > 0) { // L: 5312
									var51 += var36;
								}

								var59 = var51; // L: 5313
								var61 = var51; // L: 5314
								if (var35 > 0) { // L: 5315
									var62 = var35 * var50; // L: 5316
									var51 += var62; // L: 5317
									var61 += (var62 - var48) / 2; // L: 5318
								} else {
									var51 += var48; // L: 5321
								}

								var60 = var51; // L: 5323
								if (var37 > 0) { // L: 5324
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle; // L: 5326
							int var63 = var91.field2074 - var62 * var91.field2074 / var91.field2056; // L: 5327
							int var64 = var62 * var91.field2079 / var91.field2056 + -var91.field2079; // L: 5328
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5329
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5330
							int var67 = var66; // L: 5331
							int var68 = var66 + var42; // L: 5332
							int var69 = var66 + var91.field2068 + 15; // L: 5333
							int var70 = var69 - var78.maxAscent; // L: 5334
							int var71 = var69 + var78.maxDescent; // L: 5335
							if (var70 < var66) { // L: 5336
								var67 = var70;
							}

							if (var71 > var68) { // L: 5337
								var68 = var71;
							}

							int var72 = 0; // L: 5338
							int var73;
							int var74;
							if (var16 != null) { // L: 5339
								var72 = var66 + var16.field2068 + 15; // L: 5340
								var73 = var72 - var44.maxAscent; // L: 5341
								var74 = var72 + var44.maxDescent; // L: 5342
								if (var73 < var67) { // L: 5343
									;
								}

								if (var74 > var68) { // L: 5344
									;
								}
							}

							var73 = 255; // L: 5346
							if (var91.field2073 >= 0) { // L: 5347
								var73 = (var62 << 8) / (var91.field2056 - var91.field2073);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5348
								if (var18 != null) { // L: 5349
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5350
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5351
									for (var74 = 0; var74 < var49; ++var74) { // L: 5352
										var19.drawTransAt(var74 * var23 + (var65 + var54 - var27), var66, var73); // L: 5353
									}
								}

								if (var21 != null) { // L: 5356
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var78.drawAlpha(var45, var65 + var55, var69, var91.textColor, 0, var73); // L: 5357
								if (var16 != null) { // L: 5358
									if (var30 != null) { // L: 5359
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5360
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5361
										for (var74 = 0; var74 < var50; ++var74) { // L: 5362
											var31.drawTransAt(var74 * var35 + (var59 + var65 - var39), var66, var73); // L: 5363
										}
									}

									if (var33 != null) { // L: 5366
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var16.textColor, 0, var73); // L: 5367
								}
							} else {
								if (var18 != null) { // L: 5371
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) { // L: 5372
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 5373
									for (var74 = 0; var74 < var49; ++var74) { // L: 5374
										var19.drawTransBgAt(var23 * var74 + (var65 + var54 - var27), var66); // L: 5375
									}
								}

								if (var21 != null) { // L: 5378
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var78.draw(var45, var55 + var65, var69, var91.textColor | -16777216, 0); // L: 5379
								if (var16 != null) { // L: 5380
									if (var30 != null) { // L: 5381
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5382
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5383
										for (var74 = 0; var74 < var50; ++var74) { // L: 5384
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66); // L: 5385
										}
									}

									if (var33 != null) { // L: 5388
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor | -16777216, 0); // L: 5389
								}
							}
						}
					}
				}
			}

		}
	} // L: 5394
}
