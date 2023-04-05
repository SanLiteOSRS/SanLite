import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static IndexedSprite field1017;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1881935603
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -533081883
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lmx;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2011929420"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method6393(var1) || this.archive.method6422(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ldq;IIIIII)V",
		garbageValue = "16777215"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5037
			if (var0 instanceof NPC) { // L: 5038
				NPCComposition var6 = ((NPC)var0).definition; // L: 5039
				if (var6.transforms != null) { // L: 5040
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5041
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5043
			int[] var7 = Players.Players_indices; // L: 5044
			boolean var8 = var1 < var75; // L: 5045
			int var9 = -2; // L: 5046
			if (var0.overheadText != null && (!var8 || !var0.field1161 && (Client.publicChatMode == 4 || !var0.field1160 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5047 5048
				PendingSpawn.method2355(var0, var0.defaultHeight); // L: 5049
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.field581) { // L: 5050
					Client.overheadTextXOffsets[Client.overheadTextCount] = class7.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5051
					Client.overheadTextAscents[Client.overheadTextCount] = class7.fontBold12.ascent; // L: 5052
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 5053
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var9; // L: 5054
					Client.overheadTextColors[Client.overheadTextCount] = var0.field1163; // L: 5055
					Client.overheadTextEffects[Client.overheadTextCount] = var0.field1156; // L: 5056
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 5057
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 5058
					++Client.overheadTextCount; // L: 5059
					var9 += 12; // L: 5060
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method6738()) { // L: 5064
				PendingSpawn.method2355(var0, var0.defaultHeight + 15); // L: 5065

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5066
					HealthBarUpdate var11 = var10.getInventorySprite(Client.cycle); // L: 5067
					if (var11 == null) { // L: 5068
						if (var10.isEmpty()) { // L: 5126
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition; // L: 5069
						SpritePixels var79 = var12.method3637(); // L: 5070
						SpritePixels var83 = var12.getFrontSprite(); // L: 5071
						int var84 = 0; // L: 5073
						if (var79 != null && var83 != null) { // L: 5074
							if (var12.widthPadding * 2 < var83.subWidth) { // L: 5075
								var84 = var12.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2; // L: 5076
						} else {
							var15 = var12.width; // L: 5078
						}

						int var81 = 255; // L: 5079
						boolean var85 = true; // L: 5080
						int var86 = Client.cycle - var11.cycle; // L: 5081
						int var87 = var15 * var11.health2 / var12.width; // L: 5082
						int var88;
						int var98;
						if (var11.cycleOffset > var86) { // L: 5083
							var88 = var12.field1942 == 0 ? 0 : var12.field1942 * (var86 / var12.field1942); // L: 5084
							var22 = var15 * var11.health / var12.width; // L: 5085
							var98 = var88 * (var87 - var22) / var11.cycleOffset + var22; // L: 5086
						} else {
							var98 = var87; // L: 5089
							var88 = var12.int5 + var11.cycleOffset - var86; // L: 5090
							if (var12.int3 >= 0) { // L: 5091
								var81 = (var88 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var98 < 1) { // L: 5093
							var98 = 1;
						}

						if (var79 != null && var83 != null) { // L: 5094
							if (var15 == var98) { // L: 5095
								var98 += var84 * 2;
							} else {
								var98 += var84; // L: 5096
							}

							var88 = var79.subHeight; // L: 5097
							var9 += var88; // L: 5098
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5099
							var23 = var3 + Client.viewportTempY - var9; // L: 5100
							var22 -= var84; // L: 5101
							if (var81 >= 0 && var81 < 255) { // L: 5102
								var79.drawTransAt(var22, var23, var81); // L: 5103
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88); // L: 5104
								var83.drawTransAt(var22, var23, var81); // L: 5105
							} else {
								var79.drawTransBgAt(var22, var23); // L: 5108
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88); // L: 5109
								var83.drawTransBgAt(var22, var23); // L: 5110
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5112
							var9 += 2; // L: 5113
						} else {
							var9 += 5; // L: 5116
							if (Client.viewportTempX > -1) { // L: 5117
								var88 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5118
								var22 = var3 + Client.viewportTempY - var9; // L: 5119
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280); // L: 5120
								Rasterizer2D.Rasterizer2D_fillRectangle(var98 + var88, var22, var15 - var98, 5, 16711680); // L: 5121
							}

							var9 += 2; // L: 5123
						}
					}
				}
			}

			if (var9 == -2) { // L: 5129
				var9 += 7;
			}

			Player var89;
			if (var8 && var0.playerCycle == Client.cycle && SoundCache.method853((Player)var0)) { // L: 5130
				var89 = (Player)var0; // L: 5131
				if (var8) { // L: 5132
					PendingSpawn.method2355(var0, var0.defaultHeight + 15); // L: 5133
					AbstractFont var90 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 5134
					var9 += 4; // L: 5135
					var90.drawCentered(var89.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5136
					var9 += 18; // L: 5137
				}
			}

			if (var8) { // L: 5140
				var89 = (Player)var0; // L: 5141
				if (var89.isHidden) { // L: 5142
					return;
				}

				if (var89.headIconPk != -1 || var89.headIconPrayer != -1) { // L: 5143
					PendingSpawn.method2355(var0, var0.defaultHeight + 15); // L: 5144
					if (Client.viewportTempX > -1) { // L: 5145
						if (var89.headIconPk != -1) { // L: 5146
							var9 += 25; // L: 5147
							class315.headIconPkSprites[var89.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5148
						}

						if (var89.headIconPrayer != -1) { // L: 5150
							var9 += 25; // L: 5151
							class287.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5152
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5156
					PendingSpawn.method2355(var0, var0.defaultHeight + 15); // L: 5157
					if (Client.viewportTempX > -1) { // L: 5158
						var9 += EnumComposition.headIconHintSprites[1].subHeight; // L: 5159
						EnumComposition.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5160
					}
				}
			} else {
				NPC var91 = (NPC)var0; // L: 5165
				int[] var92 = var91.method2560(); // L: 5166
				short[] var93 = var91.method2561(); // L: 5167
				if (var93 != null && var92 != null) { // L: 5168
					for (int var13 = 0; var13 < var93.length; ++var13) { // L: 5169
						if (var93[var13] >= 0 && var92[var13] >= 0) { // L: 5170
							long var14 = (long)var92[var13] << 8 | (long)var93[var13]; // L: 5173
							SpritePixels var16 = (SpritePixels)Client.archive5.method7414(var14); // L: 5174
							if (var16 == null) { // L: 5175
								SpritePixels[] var17 = class70.method2046(class143.archive8, var92[var13], 0); // L: 5176
								if (var17 != null && var93[var13] < var17.length) { // L: 5177
									var16 = var17[var93[var13]]; // L: 5178
									Client.archive5.method7427(var14, var16); // L: 5179
								}
							}

							if (var16 != null) { // L: 5182
								PendingSpawn.method2355(var0, var0.defaultHeight + 15); // L: 5183
								if (Client.viewportTempX > -1) { // L: 5184
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5185
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5190
					PendingSpawn.method2355(var0, var0.defaultHeight + 15); // L: 5191
					if (Client.viewportTempX > -1) { // L: 5192
						EnumComposition.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) { // L: 5195
				int var77 = var0.hitSplatCycles[var76]; // L: 5196
				int var78 = var0.hitSplatTypes[var76]; // L: 5197
				HitSplatDefinition var96 = null; // L: 5198
				int var80 = 0; // L: 5199
				if (var78 >= 0) { // L: 5200
					if (var77 <= Client.cycle) { // L: 5201
						continue;
					}

					var96 = class191.method3664(var0.hitSplatTypes[var76]); // L: 5202
					var80 = var96.field2107; // L: 5203
					if (var96 != null && var96.transforms != null) { // L: 5204
						var96 = var96.transform(); // L: 5205
						if (var96 == null) { // L: 5206
							var0.hitSplatCycles[var76] = -1; // L: 5207
							continue; // L: 5208
						}
					}
				} else if (var77 < 0) { // L: 5212
					continue;
				}

				var15 = var0.hitSplatTypes2[var76]; // L: 5213
				HitSplatDefinition var94 = null; // L: 5214
				if (var15 >= 0) { // L: 5215
					var94 = class191.method3664(var15); // L: 5216
					if (var94 != null && var94.transforms != null) { // L: 5217
						var94 = var94.transform();
					}
				}

				if (var77 - var80 <= Client.cycle) { // L: 5219
					if (var96 == null) { // L: 5220
						var0.hitSplatCycles[var76] = -1; // L: 5221
					} else {
						PendingSpawn.method2355(var0, var0.defaultHeight / 2); // L: 5224
						if (Client.viewportTempX > -1) { // L: 5225
							boolean var97 = true; // L: 5226
							if (var76 == 1) { // L: 5227
								Client.viewportTempY -= 20; // L: 5228
							}

							if (var76 == 2) { // L: 5230
								Client.viewportTempX -= 15; // L: 5231
								Client.viewportTempY -= 10; // L: 5232
							}

							if (var76 == 3) { // L: 5234
								Client.viewportTempX += 15; // L: 5235
								Client.viewportTempY -= 10; // L: 5236
							}

							SpritePixels var18 = null; // L: 5238
							SpritePixels var19 = null; // L: 5239
							SpritePixels var20 = null; // L: 5240
							SpritePixels var21 = null; // L: 5241
							var22 = 0; // L: 5242
							var23 = 0; // L: 5243
							int var24 = 0; // L: 5244
							int var25 = 0; // L: 5245
							int var26 = 0; // L: 5246
							int var27 = 0; // L: 5247
							int var28 = 0; // L: 5248
							int var29 = 0; // L: 5249
							SpritePixels var30 = null; // L: 5250
							SpritePixels var31 = null; // L: 5251
							SpritePixels var32 = null; // L: 5252
							SpritePixels var33 = null; // L: 5253
							int var34 = 0; // L: 5254
							int var35 = 0; // L: 5255
							int var36 = 0; // L: 5256
							int var37 = 0; // L: 5257
							int var38 = 0; // L: 5258
							int var39 = 0; // L: 5259
							int var40 = 0; // L: 5260
							int var41 = 0; // L: 5261
							int var42 = 0; // L: 5262
							var18 = var96.method3853(); // L: 5263
							int var43;
							if (var18 != null) { // L: 5264
								var22 = var18.subWidth; // L: 5265
								var43 = var18.subHeight; // L: 5266
								if (var43 > var42) { // L: 5267
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5268
							}

							var19 = var96.method3833(); // L: 5270
							if (var19 != null) { // L: 5271
								var23 = var19.subWidth; // L: 5272
								var43 = var19.subHeight; // L: 5273
								if (var43 > var42) { // L: 5274
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5275
							}

							var20 = var96.method3828(); // L: 5277
							if (var20 != null) { // L: 5278
								var24 = var20.subWidth; // L: 5279
								var43 = var20.subHeight; // L: 5280
								if (var43 > var42) { // L: 5281
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5282
							}

							var21 = var96.method3829(); // L: 5284
							if (var21 != null) { // L: 5285
								var25 = var21.subWidth; // L: 5286
								var43 = var21.subHeight; // L: 5287
								if (var43 > var42) { // L: 5288
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5289
							}

							if (var94 != null) { // L: 5291
								var30 = var94.method3853(); // L: 5292
								if (var30 != null) { // L: 5293
									var34 = var30.subWidth; // L: 5294
									var43 = var30.subHeight; // L: 5295
									if (var43 > var42) { // L: 5296
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5297
								}

								var31 = var94.method3833(); // L: 5299
								if (var31 != null) { // L: 5300
									var35 = var31.subWidth; // L: 5301
									var43 = var31.subHeight; // L: 5302
									if (var43 > var42) { // L: 5303
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5304
								}

								var32 = var94.method3828(); // L: 5306
								if (var32 != null) { // L: 5307
									var36 = var32.subWidth; // L: 5308
									var43 = var32.subHeight; // L: 5309
									if (var43 > var42) { // L: 5310
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5311
								}

								var33 = var94.method3829(); // L: 5313
								if (var33 != null) { // L: 5314
									var37 = var33.subWidth; // L: 5315
									var43 = var33.subHeight; // L: 5316
									if (var43 > var42) { // L: 5317
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5318
								}
							}

							Font var82 = var96.getFont(); // L: 5323
							if (var82 == null) { // L: 5324
								var82 = Calendar.fontPlain11;
							}

							Font var44;
							if (var94 != null) { // L: 5325
								var44 = var94.getFont(); // L: 5326
								if (var44 == null) { // L: 5327
									var44 = Calendar.fontPlain11;
								}
							} else {
								var44 = Calendar.fontPlain11; // L: 5329
							}

							String var45 = null; // L: 5330
							String var46 = null; // L: 5331
							boolean var47 = false; // L: 5332
							int var48 = 0; // L: 5333
							var45 = var96.getString(var0.hitSplatValues[var76]); // L: 5334
							int var95 = var82.stringWidth(var45); // L: 5335
							if (var94 != null) { // L: 5336
								var46 = var94.getString(var0.hitSplatValues2[var76]); // L: 5337
								var48 = var44.stringWidth(var46); // L: 5338
							}

							int var49 = 0; // L: 5340
							int var50 = 0; // L: 5341
							if (var23 > 0) { // L: 5342
								if (var20 == null && var21 == null) { // L: 5343
									var49 = 1; // L: 5344
								} else {
									var49 = var95 / var23 + 1;
								}
							}

							if (var94 != null && var35 > 0) { // L: 5346 5347
								if (var32 == null && var33 == null) { // L: 5348
									var50 = 1; // L: 5349
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5352
							int var52 = var51; // L: 5353
							if (var22 > 0) {
								var51 += var22; // L: 5354
							}

							var51 += 2; // L: 5355
							int var53 = var51; // L: 5356
							if (var24 > 0) { // L: 5357
								var51 += var24;
							}

							int var54 = var51; // L: 5358
							int var55 = var51; // L: 5359
							int var56;
							if (var23 > 0) { // L: 5360
								var56 = var23 * var49; // L: 5361
								var51 += var56; // L: 5362
								var55 += (var56 - var95) / 2; // L: 5363
							} else {
								var51 += var95; // L: 5366
							}

							var56 = var51; // L: 5368
							if (var25 > 0) { // L: 5369
								var51 += var25;
							}

							int var57 = 0; // L: 5370
							int var58 = 0; // L: 5371
							int var59 = 0; // L: 5372
							int var60 = 0; // L: 5373
							int var61 = 0; // L: 5374
							int var62;
							if (var94 != null) { // L: 5375
								var51 += 2; // L: 5376
								var57 = var51; // L: 5377
								if (var34 > 0) { // L: 5378
									var51 += var34;
								}

								var51 += 2; // L: 5379
								var58 = var51; // L: 5380
								if (var36 > 0) { // L: 5381
									var51 += var36;
								}

								var59 = var51; // L: 5382
								var61 = var51; // L: 5383
								if (var35 > 0) { // L: 5384
									var62 = var35 * var50; // L: 5385
									var51 += var62; // L: 5386
									var61 += (var62 - var48) / 2; // L: 5387
								} else {
									var51 += var48; // L: 5390
								}

								var60 = var51; // L: 5392
								if (var37 > 0) { // L: 5393
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle; // L: 5395
							int var63 = var96.field2112 - var62 * var96.field2112 / var96.field2107; // L: 5396
							int var64 = var62 * var96.field2122 / var96.field2107 + -var96.field2122; // L: 5397
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5398
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5399
							int var67 = var66; // L: 5400
							int var68 = var66 + var42; // L: 5401
							int var69 = var66 + var96.field2106 + 15; // L: 5402
							int var70 = var69 - var82.maxAscent; // L: 5403
							int var71 = var69 + var82.maxDescent; // L: 5404
							if (var70 < var66) { // L: 5405
								var67 = var70;
							}

							if (var71 > var68) { // L: 5406
								var68 = var71;
							}

							int var72 = 0; // L: 5407
							int var73;
							int var74;
							if (var94 != null) { // L: 5408
								var72 = var66 + var94.field2106 + 15; // L: 5409
								var73 = var72 - var44.maxAscent; // L: 5410
								var74 = var72 + var44.maxDescent; // L: 5411
								if (var73 < var67) { // L: 5412
									;
								}

								if (var74 > var68) { // L: 5413
									;
								}
							}

							var73 = 255; // L: 5415
							if (var96.field2114 >= 0) { // L: 5416
								var73 = (var62 << 8) / (var96.field2107 - var96.field2114);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5417
								if (var18 != null) { // L: 5418
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5419
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5420
									for (var74 = 0; var74 < var49; ++var74) { // L: 5421
										var19.drawTransAt(var23 * var74 + (var54 + var65 - var27), var66, var73); // L: 5422
									}
								}

								if (var21 != null) { // L: 5425
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var55 + var65, var69, var96.textColor, 0, var73); // L: 5426
								if (var94 != null) { // L: 5427
									if (var30 != null) { // L: 5428
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5429
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5430
										for (var74 = 0; var74 < var50; ++var74) { // L: 5431
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 5432
										}
									}

									if (var33 != null) { // L: 5435
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var94.textColor, 0, var73); // L: 5436
								}
							} else {
								if (var18 != null) { // L: 5440
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) { // L: 5441
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 5442
									for (var74 = 0; var74 < var49; ++var74) { // L: 5443
										var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66); // L: 5444
									}
								}

								if (var21 != null) { // L: 5447
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var82.draw(var45, var55 + var65, var69, var96.textColor | -16777216, 0); // L: 5448
								if (var94 != null) { // L: 5449
									if (var30 != null) { // L: 5450
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5451
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5452
										for (var74 = 0; var74 < var50; ++var74) { // L: 5453
											var31.drawTransBgAt(var35 * var74 + (var59 + var65 - var39), var66); // L: 5454
										}
									}

									if (var33 != null) { // L: 5457
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var94.textColor | -16777216, 0); // L: 5458
								}
							}
						}
					}
				}
			}

		}
	} // L: 5463
}
