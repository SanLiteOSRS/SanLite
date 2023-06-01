import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = -451714049
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 923164019
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1801136951
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1607662785
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -110385205
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 851910289
	)
	@Export("type")
	int type;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -759801737
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -812584019
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2004773097
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 360510927
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1261472515
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -307495377
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -303781023
	)
	int field2636;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -30555069
	)
	int field2642;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 401273157
	)
	int field2644;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2004980095
	)
	int field2635;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -490459691
	)
	int field2646;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1296926769
	)
	int field2647;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 710396291
	)
	int field2648;

	Occluder() {
	} // L: 23

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "23"
	)
	public static void method4694(int var0, int var1) {
		VarbitComposition var2 = class280.method5641(var0); // L: 33
		int var3 = var2.baseVar; // L: 34
		int var4 = var2.startBit; // L: 35
		int var5 = var2.endBit; // L: 36
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 37
		if (var1 < 0 || var1 > var6) { // L: 38
			var1 = 0;
		}

		var6 <<= var4; // L: 39
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 40
	} // L: 41

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIII)V",
		garbageValue = "-65989095"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5077
			if (var0 instanceof NPC) { // L: 5078
				NPCComposition var6 = ((NPC)var0).definition; // L: 5079
				if (var6.transforms != null) { // L: 5080
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5081
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5083
			int[] var7 = Players.Players_indices; // L: 5084
			boolean var8 = var1 < var75; // L: 5085
			int var9 = -2; // L: 5086
			if (var0.field1160 != null && (!var8 || !var0.field1162 && (Client.publicChatMode == 4 || !var0.field1161 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5087 5088
				class10.method101(var0, var0.defaultHeight); // L: 5089
				if (Client.viewportTempX > -1 && Client.field479 < Client.field584) { // L: 5090
					Client.field588[Client.field479] = class126.fontBold12.stringWidth(var0.field1160) / 2; // L: 5091
					Client.field587[Client.field479] = class126.fontBold12.ascent; // L: 5092
					Client.field585[Client.field479] = Client.viewportTempX; // L: 5093
					Client.field700[Client.field479] = Client.viewportTempY - var9; // L: 5094
					Client.field610[Client.field479] = var0.field1164; // L: 5095
					Client.field590[Client.field479] = var0.field1165; // L: 5096
					Client.field686[Client.field479] = var0.field1163; // L: 5097
					Client.field591[Client.field479] = var0.field1191; // L: 5098
					Client.field515[Client.field479] = var0.field1160; // L: 5099
					++Client.field479; // L: 5100
					var9 += 12; // L: 5101
				}
			}

			int var22;
			int var23;
			int var81;
			int var82;
			if (!var0.healthBars.method7025()) { // L: 5105
				class10.method101(var0, var0.defaultHeight + 15); // L: 5106

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5107
					HealthBarUpdate var11 = var10.getInventorySprite(Client.cycle); // L: 5108
					if (var11 == null) { // L: 5109
						if (var10.isEmpty()) { // L: 5167
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition; // L: 5110
						SpritePixels var79 = var12.getFrontSprite(); // L: 5111
						SpritePixels var85 = var12.method3620(); // L: 5112
						var81 = 0; // L: 5114
						if (var79 != null && var85 != null) { // L: 5115
							if (var12.widthPadding * 2 < var85.subWidth) { // L: 5116
								var81 = var12.widthPadding;
							}

							var82 = var85.subWidth - var81 * 2; // L: 5117
						} else {
							var82 = var12.width; // L: 5119
						}

						int var83 = 255; // L: 5120
						boolean var86 = true; // L: 5121
						int var87 = Client.cycle - var11.cycle; // L: 5122
						int var88 = var82 * var11.health2 / var12.width; // L: 5123
						int var89;
						int var103;
						if (var11.cycleOffset > var87) { // L: 5124
							var89 = var12.field1964 == 0 ? 0 : var12.field1964 * (var87 / var12.field1964); // L: 5125
							var22 = var82 * var11.health / var12.width; // L: 5126
							var103 = var89 * (var88 - var22) / var11.cycleOffset + var22; // L: 5127
						} else {
							var103 = var88; // L: 5130
							var89 = var11.cycleOffset + var12.int5 - var87; // L: 5131
							if (var12.int3 >= 0) { // L: 5132
								var83 = (var89 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var103 < 1) { // L: 5134
							var103 = 1;
						}

						if (var79 != null && var85 != null) { // L: 5135
							if (var103 == var82) { // L: 5136
								var103 += var81 * 2;
							} else {
								var103 += var81; // L: 5137
							}

							var89 = var79.subHeight; // L: 5138
							var9 += var89; // L: 5139
							var22 = var2 + Client.viewportTempX - (var82 >> 1); // L: 5140
							var23 = var3 + Client.viewportTempY - var9; // L: 5141
							var22 -= var81; // L: 5142
							if (var83 >= 0 && var83 < 255) { // L: 5143
								var79.drawTransAt(var22, var23, var83); // L: 5144
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var103 + var22, var89 + var23); // L: 5145
								var85.drawTransAt(var22, var23, var83); // L: 5146
							} else {
								var79.drawTransBgAt(var22, var23); // L: 5149
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var103 + var22, var23 + var89); // L: 5150
								var85.drawTransBgAt(var22, var23); // L: 5151
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5153
							var9 += 2; // L: 5154
						} else {
							var9 += 5; // L: 5157
							if (Client.viewportTempX > -1) { // L: 5158
								var89 = var2 + Client.viewportTempX - (var82 >> 1); // L: 5159
								var22 = var3 + Client.viewportTempY - var9; // L: 5160
								Rasterizer2D.Rasterizer2D_fillRectangle(var89, var22, var103, 5, 65280); // L: 5161
								Rasterizer2D.Rasterizer2D_fillRectangle(var89 + var103, var22, var82 - var103, 5, 16711680); // L: 5162
							}

							var9 += 2; // L: 5164
						}
					}
				}
			}

			if (var9 == -2) { // L: 5170
				var9 += 7;
			}

			Player var90;
			if (var8 && var0.playerCycle == Client.cycle && class158.method3283((Player)var0)) { // L: 5171
				var90 = (Player)var0; // L: 5172
				if (var8) { // L: 5173
					class10.method101(var0, var0.defaultHeight + 15); // L: 5174
					AbstractFont var91 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 5175
					var9 += 4; // L: 5176
					var91.drawCentered(var90.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5177
					var9 += 18; // L: 5178
				}
			}

			if (var8) { // L: 5181
				var90 = (Player)var0; // L: 5182
				if (var90.isHidden) { // L: 5183
					return;
				}

				if (var90.headIconPk != -1 || var90.headIconPrayer != -1) { // L: 5184
					class10.method101(var0, var0.defaultHeight + 15); // L: 5185
					if (Client.viewportTempX > -1) { // L: 5186
						if (var90.headIconPk != -1) { // L: 5187
							var9 += 25; // L: 5188
							UrlRequest.headIconPkSprites[var90.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5189
						}

						if (var90.headIconPrayer != -1) { // L: 5191
							var9 += 25; // L: 5192
							NetCache.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5193
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5197
					class10.method101(var0, var0.defaultHeight + 15); // L: 5198
					if (Client.viewportTempX > -1) { // L: 5199
						var9 += ItemComposition.headIconHintSprites[1].subHeight; // L: 5200
						ItemComposition.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5201
					}
				}
			} else {
				NPC var92 = (NPC)var0; // L: 5206
				int[] var93 = var92.method2562(); // L: 5207
				short[] var94 = var92.method2550(); // L: 5208
				if (var94 != null && var93 != null) { // L: 5209
					for (int var13 = 0; var13 < var94.length; ++var13) { // L: 5210
						if (var94[var13] >= 0 && var93[var13] >= 0) { // L: 5211
							long var14 = (long)var93[var13] << 8 | (long)var94[var13]; // L: 5214
							SpritePixels var16 = (SpritePixels)Client.field772.method7684(var14); // L: 5215
							if (var16 == null) { // L: 5216
								SpritePixels[] var17 = ArchiveLoader.method2219(GameBuild.archive8, var93[var13], 0); // L: 5217
								if (var17 != null && var94[var13] < var17.length) { // L: 5218
									var16 = var17[var94[var13]]; // L: 5219
									Client.field772.method7686(var14, var16); // L: 5220
								}
							}

							if (var16 != null) { // L: 5223
								class10.method101(var0, var0.defaultHeight + 15); // L: 5224
								if (Client.viewportTempX > -1) { // L: 5225
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5226
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5231
					class10.method101(var0, var0.defaultHeight + 15); // L: 5232
					if (Client.viewportTempX > -1) { // L: 5233
						ItemComposition.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) { // L: 5236
				int var77 = var0.hitSplatCycles[var76]; // L: 5237
				int var78 = var0.hitSplatTypes[var76]; // L: 5238
				HitSplatDefinition var101 = null; // L: 5239
				int var80 = 0; // L: 5240
				HitSplatDefinition var96;
				if (var78 >= 0) { // L: 5241
					if (var77 <= Client.cycle) { // L: 5242
						continue;
					}

					var81 = var0.hitSplatTypes[var76]; // L: 5244
					var96 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var81); // L: 5246
					HitSplatDefinition var15;
					if (var96 != null) { // L: 5247
						var15 = var96; // L: 5248
					} else {
						byte[] var18 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var81); // L: 5251
						var96 = new HitSplatDefinition(); // L: 5252
						if (var18 != null) { // L: 5253
							var96.decode(new Buffer(var18));
						}

						HitSplatDefinition.HitSplatDefinition_cached.put(var96, (long)var81); // L: 5254
						var15 = var96; // L: 5255
					}

					var101 = var15; // L: 5257
					var80 = var15.field2124; // L: 5258
					if (var15 != null && var15.transforms != null) { // L: 5259
						var101 = var15.transform(); // L: 5260
						if (var101 == null) { // L: 5261
							var0.hitSplatCycles[var76] = -1; // L: 5262
							continue; // L: 5263
						}
					}
				} else if (var77 < 0) { // L: 5267
					continue;
				}

				var82 = var0.hitSplatTypes2[var76]; // L: 5268
				HitSplatDefinition var95 = null; // L: 5269
				HitSplatDefinition var97;
				if (var82 >= 0) { // L: 5270
					var97 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var82); // L: 5273
					if (var97 != null) { // L: 5274
						var96 = var97; // L: 5275
					} else {
						byte[] var19 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var82); // L: 5278
						var97 = new HitSplatDefinition(); // L: 5279
						if (var19 != null) { // L: 5280
							var97.decode(new Buffer(var19));
						}

						HitSplatDefinition.HitSplatDefinition_cached.put(var97, (long)var82); // L: 5281
						var96 = var97; // L: 5282
					}

					var95 = var96; // L: 5284
					if (var96 != null && var96.transforms != null) { // L: 5285
						var95 = var96.transform();
					}
				}

				if (var77 - var80 <= Client.cycle) { // L: 5287
					if (var101 == null) { // L: 5288
						var0.hitSplatCycles[var76] = -1; // L: 5289
					} else {
						class10.method101(var0, var0.defaultHeight / 2); // L: 5292
						if (Client.viewportTempX > -1) { // L: 5293
							boolean var102 = true; // L: 5294
							if (var76 == 1) { // L: 5295
								Client.viewportTempY -= 20; // L: 5296
							}

							if (var76 == 2) { // L: 5298
								Client.viewportTempX -= 15; // L: 5299
								Client.viewportTempY -= 10; // L: 5300
							}

							if (var76 == 3) { // L: 5302
								Client.viewportTempX += 15; // L: 5303
								Client.viewportTempY -= 10; // L: 5304
							}

							var97 = null; // L: 5306
							SpritePixels var98 = null; // L: 5307
							SpritePixels var20 = null; // L: 5308
							SpritePixels var21 = null; // L: 5309
							var22 = 0; // L: 5310
							var23 = 0; // L: 5311
							int var24 = 0; // L: 5312
							int var25 = 0; // L: 5313
							int var26 = 0; // L: 5314
							int var27 = 0; // L: 5315
							int var28 = 0; // L: 5316
							int var29 = 0; // L: 5317
							SpritePixels var30 = null; // L: 5318
							SpritePixels var31 = null; // L: 5319
							SpritePixels var32 = null; // L: 5320
							SpritePixels var33 = null; // L: 5321
							int var34 = 0; // L: 5322
							int var35 = 0; // L: 5323
							int var36 = 0; // L: 5324
							int var37 = 0; // L: 5325
							int var38 = 0; // L: 5326
							int var39 = 0; // L: 5327
							int var40 = 0; // L: 5328
							int var41 = 0; // L: 5329
							int var42 = 0; // L: 5330
							SpritePixels var99 = var101.method3845(); // L: 5331
							int var43;
							if (var99 != null) { // L: 5332
								var22 = var99.subWidth; // L: 5333
								var43 = var99.subHeight; // L: 5334
								if (var43 > var42) { // L: 5335
									var42 = var43;
								}

								var26 = var99.xOffset; // L: 5336
							}

							var98 = var101.method3832(); // L: 5338
							if (var98 != null) { // L: 5339
								var23 = var98.subWidth; // L: 5340
								var43 = var98.subHeight; // L: 5341
								if (var43 > var42) { // L: 5342
									var42 = var43;
								}

								var27 = var98.xOffset; // L: 5343
							}

							var20 = var101.method3829(); // L: 5345
							if (var20 != null) { // L: 5346
								var24 = var20.subWidth; // L: 5347
								var43 = var20.subHeight; // L: 5348
								if (var43 > var42) { // L: 5349
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5350
							}

							var21 = var101.method3830(); // L: 5352
							if (var21 != null) { // L: 5353
								var25 = var21.subWidth; // L: 5354
								var43 = var21.subHeight; // L: 5355
								if (var43 > var42) { // L: 5356
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5357
							}

							if (var95 != null) { // L: 5359
								var30 = var95.method3845(); // L: 5360
								if (var30 != null) { // L: 5361
									var34 = var30.subWidth; // L: 5362
									var43 = var30.subHeight; // L: 5363
									if (var43 > var42) { // L: 5364
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5365
								}

								var31 = var95.method3832(); // L: 5367
								if (var31 != null) { // L: 5368
									var35 = var31.subWidth; // L: 5369
									var43 = var31.subHeight; // L: 5370
									if (var43 > var42) { // L: 5371
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5372
								}

								var32 = var95.method3829(); // L: 5374
								if (var32 != null) { // L: 5375
									var36 = var32.subWidth; // L: 5376
									var43 = var32.subHeight; // L: 5377
									if (var43 > var42) { // L: 5378
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5379
								}

								var33 = var95.method3830(); // L: 5381
								if (var33 != null) { // L: 5382
									var37 = var33.subWidth; // L: 5383
									var43 = var33.subHeight; // L: 5384
									if (var43 > var42) { // L: 5385
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5386
								}
							}

							Font var84 = var101.getFont(); // L: 5391
							if (var84 == null) { // L: 5392
								var84 = GrandExchangeOfferOwnWorldComparator.fontPlain11;
							}

							Font var44;
							if (var95 != null) { // L: 5393
								var44 = var95.getFont(); // L: 5394
								if (var44 == null) { // L: 5395
									var44 = GrandExchangeOfferOwnWorldComparator.fontPlain11;
								}
							} else {
								var44 = GrandExchangeOfferOwnWorldComparator.fontPlain11; // L: 5397
							}

							String var45 = null; // L: 5398
							String var46 = null; // L: 5399
							boolean var47 = false; // L: 5400
							int var48 = 0; // L: 5401
							var45 = var101.getString(var0.hitSplatValues[var76]); // L: 5402
							int var100 = var84.stringWidth(var45); // L: 5403
							if (var95 != null) { // L: 5404
								var46 = var95.getString(var0.hitSplatValues2[var76]); // L: 5405
								var48 = var44.stringWidth(var46); // L: 5406
							}

							int var49 = 0; // L: 5408
							int var50 = 0; // L: 5409
							if (var23 > 0) { // L: 5410
								if (var20 == null && var21 == null) { // L: 5411
									var49 = 1; // L: 5412
								} else {
									var49 = var100 / var23 + 1;
								}
							}

							if (var95 != null && var35 > 0) { // L: 5414 5415
								if (var32 == null && var33 == null) { // L: 5416
									var50 = 1; // L: 5417
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5420
							int var52 = var51; // L: 5421
							if (var22 > 0) { // L: 5422
								var51 += var22;
							}

							var51 += 2; // L: 5423
							int var53 = var51; // L: 5424
							if (var24 > 0) { // L: 5425
								var51 += var24;
							}

							int var54 = var51; // L: 5426
							int var55 = var51; // L: 5427
							int var56;
							if (var23 > 0) { // L: 5428
								var56 = var49 * var23; // L: 5429
								var51 += var56; // L: 5430
								var55 += (var56 - var100) / 2; // L: 5431
							} else {
								var51 += var100; // L: 5434
							}

							var56 = var51; // L: 5436
							if (var25 > 0) { // L: 5437
								var51 += var25;
							}

							int var57 = 0; // L: 5438
							int var58 = 0; // L: 5439
							int var59 = 0; // L: 5440
							int var60 = 0; // L: 5441
							int var61 = 0; // L: 5442
							int var62;
							if (var95 != null) { // L: 5443
								var51 += 2; // L: 5444
								var57 = var51; // L: 5445
								if (var34 > 0) { // L: 5446
									var51 += var34;
								}

								var51 += 2; // L: 5447
								var58 = var51; // L: 5448
								if (var36 > 0) { // L: 5449
									var51 += var36;
								}

								var59 = var51; // L: 5450
								var61 = var51; // L: 5451
								if (var35 > 0) { // L: 5452
									var62 = var35 * var50; // L: 5453
									var51 += var62; // L: 5454
									var61 += (var62 - var48) / 2; // L: 5455
								} else {
									var51 += var48; // L: 5458
								}

								var60 = var51; // L: 5460
								if (var37 > 0) { // L: 5461
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle; // L: 5463
							int var63 = var101.field2129 - var62 * var101.field2129 / var101.field2124; // L: 5464
							int var64 = var62 * var101.field2116 / var101.field2124 + -var101.field2116; // L: 5465
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5466
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5467
							int var67 = var66; // L: 5468
							int var68 = var42 + var66; // L: 5469
							int var69 = var66 + var101.field2134 + 15; // L: 5470
							int var70 = var69 - var84.maxAscent; // L: 5471
							int var71 = var69 + var84.maxDescent; // L: 5472
							if (var70 < var66) { // L: 5473
								var67 = var70;
							}

							if (var71 > var68) { // L: 5474
								var68 = var71;
							}

							int var72 = 0; // L: 5475
							int var73;
							int var74;
							if (var95 != null) { // L: 5476
								var72 = var66 + var95.field2134 + 15; // L: 5477
								var73 = var72 - var44.maxAscent; // L: 5478
								var74 = var72 + var44.maxDescent; // L: 5479
								if (var73 < var67) { // L: 5480
									;
								}

								if (var74 > var68) { // L: 5481
									;
								}
							}

							var73 = 255; // L: 5483
							if (var101.field2121 >= 0) { // L: 5484
								var73 = (var62 << 8) / (var101.field2124 - var101.field2121);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5485
								if (var99 != null) { // L: 5486
									var99.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5487
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var98 != null) { // L: 5488
									for (var74 = 0; var74 < var49; ++var74) { // L: 5489
										var98.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73); // L: 5490
									}
								}

								if (var21 != null) { // L: 5493
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var84.drawAlpha(var45, var55 + var65, var69, var101.textColor, 0, var73); // L: 5494
								if (var95 != null) { // L: 5495
									if (var30 != null) { // L: 5496
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5497
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5498
										for (var74 = 0; var74 < var50; ++var74) { // L: 5499
											var31.drawTransAt(var35 * var74 + (var59 + var65 - var39), var66, var73); // L: 5500
										}
									}

									if (var33 != null) { // L: 5503
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var95.textColor, 0, var73); // L: 5504
								}
							} else {
								if (var99 != null) { // L: 5508
									var99.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5509
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var98 != null) { // L: 5510
									for (var74 = 0; var74 < var49; ++var74) { // L: 5511
										var98.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66); // L: 5512
									}
								}

								if (var21 != null) { // L: 5515
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var84.draw(var45, var55 + var65, var69, var101.textColor | -16777216, 0); // L: 5516
								if (var95 != null) { // L: 5517
									if (var30 != null) { // L: 5518
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5519
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5520
										for (var74 = 0; var74 < var50; ++var74) { // L: 5521
											var31.drawTransBgAt(var35 * var74 + (var65 + var59 - var39), var66); // L: 5522
										}
									}

									if (var33 != null) { // L: 5525
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var95.textColor | -16777216, 0); // L: 5526
								}
							}
						}
					}
				}
			}

		}
	} // L: 5531
}
