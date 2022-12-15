import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class128 implements class120 {
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1444608091
	)
	@Export("cameraYaw")
	static int cameraYaw;

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lct;IIIIIB)V",
		garbageValue = "0"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5019
			if (var0 instanceof NPC) { // L: 5020
				NPCComposition var6 = ((NPC)var0).definition; // L: 5021
				if (var6.transforms != null) { // L: 5022
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5023
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5025
			int[] var7 = Players.Players_indices; // L: 5026
			byte var8 = 0; // L: 5027
			Player var10;
			if (var1 < var75 && var0.playerCycle == Client.cycle) { // L: 5028
				var10 = (Player)var0; // L: 5030
				boolean var9;
				if (Client.drawPlayerNames == 0) { // L: 5032
					var9 = false; // L: 5033
				} else if (var10 != class155.localPlayer) { // L: 5036
					boolean var11 = (Client.drawPlayerNames & 4) != 0; // L: 5039
					var9 = var11 || SoundCache.method890() && var10.isFriend() || class121.method2887() && var10.isFriendsChatMember(); // L: 5041
				} else {
					var9 = GraphicsObject.method2026(); // L: 5043
				}

				if (var9) { // L: 5045
					Player var76 = (Player)var0; // L: 5046
					if (var1 < var75) { // L: 5047
						ClientPreferences.method2513(var0, var0.defaultHeight + 15); // L: 5048
						AbstractFont var12 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 5049
						byte var13 = 9; // L: 5050
						var12.drawCentered(var76.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var13, 16777215, 0); // L: 5051
						var8 = 18; // L: 5052
					}
				}
			}

			int var89 = -2; // L: 5056
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method6774()) { // L: 5057
				ClientPreferences.method2513(var0, var0.defaultHeight + 15); // L: 5058

				for (HealthBar var90 = (HealthBar)var0.healthBars.last(); var90 != null; var90 = (HealthBar)var0.healthBars.previous()) { // L: 5059
					HealthBarUpdate var98 = var90.get(Client.cycle); // L: 5060
					if (var98 == null) { // L: 5061
						if (var90.isEmpty()) { // L: 5119
							var90.remove();
						}
					} else {
						HealthBarDefinition var93 = var90.definition; // L: 5062
						SpritePixels var79 = var93.method3613(); // L: 5063
						SpritePixels var83 = var93.getFrontSprite(); // L: 5064
						int var84 = 0; // L: 5066
						if (var79 != null && var83 != null) { // L: 5067
							if (var93.widthPadding * 2 < var83.subWidth) { // L: 5068
								var84 = var93.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2; // L: 5069
						} else {
							var15 = var93.width; // L: 5071
						}

						int var81 = 255; // L: 5072
						boolean var85 = true; // L: 5073
						int var86 = Client.cycle - var98.cycle; // L: 5074
						int var87 = var15 * var98.health2 / var93.width; // L: 5075
						int var88;
						int var102;
						if (var98.cycleOffset > var86) { // L: 5076
							var88 = var93.field1976 == 0 ? 0 : var93.field1976 * (var86 / var93.field1976); // L: 5077
							var22 = var15 * var98.health / var93.width; // L: 5078
							var102 = var88 * (var87 - var22) / var98.cycleOffset + var22; // L: 5079
						} else {
							var102 = var87; // L: 5082
							var88 = var93.int5 + var98.cycleOffset - var86; // L: 5083
							if (var93.int3 >= 0) { // L: 5084
								var81 = (var88 << 8) / (var93.int5 - var93.int3);
							}
						}

						if (var98.health2 > 0 && var102 < 1) { // L: 5086
							var102 = 1;
						}

						if (var79 != null && var83 != null) { // L: 5087
							if (var102 == var15) { // L: 5088
								var102 += var84 * 2;
							} else {
								var102 += var84; // L: 5089
							}

							var88 = var79.subHeight; // L: 5090
							var89 += var88; // L: 5091
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5092
							var23 = var3 + Client.viewportTempY - var89; // L: 5093
							var22 -= var84; // L: 5094
							if (var81 >= 0 && var81 < 255) { // L: 5095
								var79.drawTransAt(var22, var23, var81); // L: 5096
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var102, var88 + var23); // L: 5097
								var83.drawTransAt(var22, var23, var81); // L: 5098
							} else {
								var79.drawTransBgAt(var22, var23); // L: 5101
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var102, var88 + var23); // L: 5102
								var83.drawTransBgAt(var22, var23); // L: 5103
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5105
							var89 += 2; // L: 5106
						} else {
							var89 += 5; // L: 5109
							if (Client.viewportTempX > -1) { // L: 5110
								var88 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5111
								var22 = var3 + Client.viewportTempY - var89; // L: 5112
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var102, 5, 65280); // L: 5113
								Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var102, var22, var15 - var102, 5, 16711680); // L: 5114
							}

							var89 += 2; // L: 5116
						}
					}
				}
			}

			if (var89 == -2) { // L: 5122
				var89 += 7;
			}

			var89 += var8; // L: 5123
			if (var1 < var75) { // L: 5124
				var10 = (Player)var0; // L: 5125
				if (var10.isHidden) { // L: 5126
					return;
				}

				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) { // L: 5127
					ClientPreferences.method2513(var0, var0.defaultHeight + 15); // L: 5128
					if (Client.viewportTempX > -1) { // L: 5129
						if (var10.headIconPk != -1) { // L: 5130
							var89 += 25; // L: 5131
							World.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 5132
						}

						if (var10.headIconPrayer != -1) { // L: 5134
							var89 += 25; // L: 5135
							class410.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 5136
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5140
					ClientPreferences.method2513(var0, var0.defaultHeight + 15); // L: 5141
					if (Client.viewportTempX > -1) { // L: 5142
						var89 += class358.headIconHintSprites[1].subHeight; // L: 5143
						class358.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89); // L: 5144
					}
				}
			} else {
				NPC var91 = (NPC)var0; // L: 5149
				int[] var99 = var91.method2546(); // L: 5150
				short[] var94 = var91.method2538(); // L: 5151
				if (var94 != null && var99 != null) { // L: 5152
					for (int var95 = 0; var95 < var94.length; ++var95) { // L: 5153
						if (var94[var95] >= 0 && var99[var95] >= 0) { // L: 5154
							long var14 = (long)var99[var95] << 8 | (long)var94[var95]; // L: 5157
							SpritePixels var16 = (SpritePixels)Client.archive5.method7386(var14); // L: 5158
							if (var16 == null) { // L: 5159
								SpritePixels[] var17 = SequenceDefinition.method4064(ClientPreferences.archive8, var99[var95], 0); // L: 5160
								if (var17 != null && var94[var95] < var17.length) { // L: 5161
									var16 = var17[var94[var95]]; // L: 5162
									Client.archive5.method7374(var14, var16); // L: 5163
								}
							}

							if (var16 != null) { // L: 5166
								ClientPreferences.method2513(var0, var0.defaultHeight + 15); // L: 5167
								if (Client.viewportTempX > -1) { // L: 5168
									var3 -= var16.subHeight; // L: 5169
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), var3 + Client.viewportTempY); // L: 5170
									var3 -= 2; // L: 5171
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5176
					ClientPreferences.method2513(var0, var0.defaultHeight + 15); // L: 5177
					if (Client.viewportTempX > -1) { // L: 5178
						class358.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1187 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5181 5182
				ClientPreferences.method2513(var0, var0.defaultHeight + 15); // L: 5183
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.field606) { // L: 5184
					Client.overheadTextXOffsets[Client.overheadTextCount] = class146.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5185
					Client.overheadTextAscents[Client.overheadTextCount] = class146.fontBold12.ascent; // L: 5186
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5187
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var89; // L: 5188
					Client.overheadTextColors[Client.overheadTextCount] = var0.field1202; // L: 5189
					Client.overheadTextEffects[Client.overheadTextCount] = var0.field1229; // L: 5190
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.field1248; // L: 5191
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5192
					++Client.overheadTextCount; // L: 5193
					var89 += 12; // L: 5194
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) { // L: 5198
				int var92 = var0.hitSplatCycles[var77]; // L: 5199
				int var78 = var0.hitSplatTypes[var77]; // L: 5200
				HitSplatDefinition var100 = null; // L: 5201
				int var80 = 0; // L: 5202
				if (var78 >= 0) { // L: 5203
					if (var92 <= Client.cycle) { // L: 5204
						continue;
					}

					var100 = class364.method6987(var0.hitSplatTypes[var77]); // L: 5205
					var80 = var100.field2132; // L: 5206
					if (var100 != null && var100.transforms != null) { // L: 5207
						var100 = var100.transform(); // L: 5208
						if (var100 == null) { // L: 5209
							var0.hitSplatCycles[var77] = -1; // L: 5210
							continue; // L: 5211
						}
					}
				} else if (var92 < 0) { // L: 5215
					continue;
				}

				var15 = var0.hitSplatTypes2[var77]; // L: 5216
				HitSplatDefinition var96 = null; // L: 5217
				if (var15 >= 0) { // L: 5218
					var96 = class364.method6987(var15); // L: 5219
					if (var96 != null && var96.transforms != null) { // L: 5220
						var96 = var96.transform();
					}
				}

				if (var92 - var80 <= Client.cycle) { // L: 5222
					if (var100 == null) { // L: 5223
						var0.hitSplatCycles[var77] = -1; // L: 5224
					} else {
						ClientPreferences.method2513(var0, var0.defaultHeight / 2); // L: 5227
						if (Client.viewportTempX > -1) { // L: 5228
							boolean var101 = true; // L: 5229
							if (var77 == 1) { // L: 5230
								Client.viewportTempY -= 20; // L: 5231
							}

							if (var77 == 2) { // L: 5233
								Client.viewportTempX -= 15; // L: 5234
								Client.viewportTempY -= 10; // L: 5235
							}

							if (var77 == 3) { // L: 5237
								Client.viewportTempX += 15; // L: 5238
								Client.viewportTempY -= 10; // L: 5239
							}

							SpritePixels var18 = null; // L: 5241
							SpritePixels var19 = null; // L: 5242
							SpritePixels var20 = null; // L: 5243
							SpritePixels var21 = null; // L: 5244
							var22 = 0; // L: 5245
							var23 = 0; // L: 5246
							int var24 = 0; // L: 5247
							int var25 = 0; // L: 5248
							int var26 = 0; // L: 5249
							int var27 = 0; // L: 5250
							int var28 = 0; // L: 5251
							int var29 = 0; // L: 5252
							SpritePixels var30 = null; // L: 5253
							SpritePixels var31 = null; // L: 5254
							SpritePixels var32 = null; // L: 5255
							SpritePixels var33 = null; // L: 5256
							int var34 = 0; // L: 5257
							int var35 = 0; // L: 5258
							int var36 = 0; // L: 5259
							int var37 = 0; // L: 5260
							int var38 = 0; // L: 5261
							int var39 = 0; // L: 5262
							int var40 = 0; // L: 5263
							int var41 = 0; // L: 5264
							int var42 = 0; // L: 5265
							var18 = var100.method3827(); // L: 5266
							int var43;
							if (var18 != null) { // L: 5267
								var22 = var18.subWidth; // L: 5268
								var43 = var18.subHeight; // L: 5269
								if (var43 > var42) { // L: 5270
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5271
							}

							var19 = var100.method3828(); // L: 5273
							if (var19 != null) { // L: 5274
								var23 = var19.subWidth; // L: 5275
								var43 = var19.subHeight; // L: 5276
								if (var43 > var42) { // L: 5277
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5278
							}

							var20 = var100.method3862(); // L: 5280
							if (var20 != null) { // L: 5281
								var24 = var20.subWidth; // L: 5282
								var43 = var20.subHeight; // L: 5283
								if (var43 > var42) { // L: 5284
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5285
							}

							var21 = var100.method3830(); // L: 5287
							if (var21 != null) { // L: 5288
								var25 = var21.subWidth; // L: 5289
								var43 = var21.subHeight; // L: 5290
								if (var43 > var42) { // L: 5291
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5292
							}

							if (var96 != null) { // L: 5294
								var30 = var96.method3827(); // L: 5295
								if (var30 != null) { // L: 5296
									var34 = var30.subWidth; // L: 5297
									var43 = var30.subHeight; // L: 5298
									if (var43 > var42) { // L: 5299
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5300
								}

								var31 = var96.method3828(); // L: 5302
								if (var31 != null) { // L: 5303
									var35 = var31.subWidth; // L: 5304
									var43 = var31.subHeight; // L: 5305
									if (var43 > var42) { // L: 5306
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5307
								}

								var32 = var96.method3862(); // L: 5309
								if (var32 != null) { // L: 5310
									var36 = var32.subWidth; // L: 5311
									var43 = var32.subHeight; // L: 5312
									if (var43 > var42) { // L: 5313
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5314
								}

								var33 = var96.method3830(); // L: 5316
								if (var33 != null) { // L: 5317
									var37 = var33.subWidth; // L: 5318
									var43 = var33.subHeight; // L: 5319
									if (var43 > var42) { // L: 5320
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5321
								}
							}

							Font var82 = var100.getFont(); // L: 5326
							if (var82 == null) { // L: 5327
								var82 = class151.fontPlain11;
							}

							Font var44;
							if (var96 != null) { // L: 5328
								var44 = var96.getFont(); // L: 5329
								if (var44 == null) { // L: 5330
									var44 = class151.fontPlain11;
								}
							} else {
								var44 = class151.fontPlain11; // L: 5332
							}

							String var45 = null; // L: 5333
							String var46 = null; // L: 5334
							boolean var47 = false; // L: 5335
							int var48 = 0; // L: 5336
							var45 = var100.getString(var0.hitSplatValues[var77]); // L: 5337
							int var97 = var82.stringWidth(var45); // L: 5338
							if (var96 != null) { // L: 5339
								var46 = var96.getString(var0.hitSplatValues2[var77]); // L: 5340
								var48 = var44.stringWidth(var46); // L: 5341
							}

							int var49 = 0; // L: 5343
							int var50 = 0; // L: 5344
							if (var23 > 0) { // L: 5345
								if (var20 == null && var21 == null) { // L: 5346
									var49 = 1; // L: 5347
								} else {
									var49 = var97 / var23 + 1;
								}
							}

							if (var96 != null && var35 > 0) { // L: 5349 5350
								if (var32 == null && var33 == null) { // L: 5351
									var50 = 1; // L: 5352
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5355
							int var52 = var51; // L: 5356
							if (var22 > 0) { // L: 5357
								var51 += var22;
							}

							var51 += 2; // L: 5358
							int var53 = var51; // L: 5359
							if (var24 > 0) { // L: 5360
								var51 += var24;
							}

							int var54 = var51; // L: 5361
							int var55 = var51; // L: 5362
							int var56;
							if (var23 > 0) { // L: 5363
								var56 = var49 * var23; // L: 5364
								var51 += var56; // L: 5365
								var55 += (var56 - var97) / 2; // L: 5366
							} else {
								var51 += var97; // L: 5369
							}

							var56 = var51; // L: 5371
							if (var25 > 0) { // L: 5372
								var51 += var25;
							}

							int var57 = 0; // L: 5373
							int var58 = 0; // L: 5374
							int var59 = 0; // L: 5375
							int var60 = 0; // L: 5376
							int var61 = 0; // L: 5377
							int var62;
							if (var96 != null) { // L: 5378
								var51 += 2; // L: 5379
								var57 = var51; // L: 5380
								if (var34 > 0) { // L: 5381
									var51 += var34;
								}

								var51 += 2; // L: 5382
								var58 = var51; // L: 5383
								if (var36 > 0) { // L: 5384
									var51 += var36;
								}

								var59 = var51; // L: 5385
								var61 = var51; // L: 5386
								if (var35 > 0) { // L: 5387
									var62 = var50 * var35; // L: 5388
									var51 += var62; // L: 5389
									var61 += (var62 - var48) / 2; // L: 5390
								} else {
									var51 += var48; // L: 5393
								}

								var60 = var51; // L: 5395
								if (var37 > 0) { // L: 5396
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle; // L: 5398
							int var63 = var100.field2142 - var62 * var100.field2142 / var100.field2132; // L: 5399
							int var64 = var62 * var100.field2137 / var100.field2132 + -var100.field2137; // L: 5400
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5401
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 5402
							int var67 = var66; // L: 5403
							int var68 = var66 + var42; // L: 5404
							int var69 = var66 + var100.field2147 + 15; // L: 5405
							int var70 = var69 - var82.maxAscent; // L: 5406
							int var71 = var69 + var82.maxDescent; // L: 5407
							if (var70 < var66) { // L: 5408
								var67 = var70;
							}

							if (var71 > var68) { // L: 5409
								var68 = var71;
							}

							int var72 = 0; // L: 5410
							int var73;
							int var74;
							if (var96 != null) { // L: 5411
								var72 = var66 + var96.field2147 + 15; // L: 5412
								var73 = var72 - var44.maxAscent; // L: 5413
								var74 = var72 + var44.maxDescent; // L: 5414
								if (var73 < var67) { // L: 5415
									;
								}

								if (var74 > var68) { // L: 5416
									;
								}
							}

							var73 = 255; // L: 5418
							if (var100.field2144 >= 0) { // L: 5419
								var73 = (var62 << 8) / (var100.field2132 - var100.field2144);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5420
								if (var18 != null) { // L: 5421
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5422
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5423
									for (var74 = 0; var74 < var49; ++var74) { // L: 5424
										var19.drawTransAt(var74 * var23 + (var65 + var54 - var27), var66, var73); // L: 5425
									}
								}

								if (var21 != null) { // L: 5428
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var55 + var65, var69, var100.textColor, 0, var73); // L: 5429
								if (var96 != null) { // L: 5430
									if (var30 != null) { // L: 5431
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5432
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5433
										for (var74 = 0; var74 < var50; ++var74) { // L: 5434
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 5435
										}
									}

									if (var33 != null) { // L: 5438
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var96.textColor, 0, var73); // L: 5439
								}
							} else {
								if (var18 != null) { // L: 5443
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) { // L: 5444
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) { // L: 5445
									for (var74 = 0; var74 < var49; ++var74) { // L: 5446
										var19.drawTransBgAt(var74 * var23 + (var54 + var65 - var27), var66); // L: 5447
									}
								}

								if (var21 != null) { // L: 5450
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var82.draw(var45, var65 + var55, var69, var100.textColor | -16777216, 0); // L: 5451
								if (var96 != null) { // L: 5452
									if (var30 != null) { // L: 5453
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 5454
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5455
										for (var74 = 0; var74 < var50; ++var74) { // L: 5456
											var31.drawTransBgAt(var35 * var74 + (var65 + var59 - var39), var66); // L: 5457
										}
									}

									if (var33 != null) { // L: 5460
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var96.textColor | -16777216, 0); // L: 5461
								}
							}
						}
					}
				}
			}

		}
	} // L: 5466
}
