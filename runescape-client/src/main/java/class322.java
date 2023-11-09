import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class class322 {
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1276098431
	)
	static int field3521;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 631831443
	)
	public int field3522;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1059584737
	)
	public int field3519;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 513797185
	)
	public int field3520;

	class322() {
	} // L: 8

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1758323842"
	)
	static final int method5990(int var0) {
		return Math.min(Math.max(var0, 128), 383); // L: 3916
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ldi;IIIIII)V",
		garbageValue = "1224741238"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5226
			if (var0 instanceof NPC) { // L: 5227
				NPCComposition var6 = ((NPC)var0).definition; // L: 5228
				if (var6.transforms != null) { // L: 5229
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5230
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5232
			int[] var7 = Players.Players_indices; // L: 5233
			boolean var8 = var1 < var75; // L: 5234
			int var9 = -2; // L: 5235
			if (var0.overheadText != null && (!var8 || !var0.field1174 && (Client.publicChatMode == 4 || !var0.field1165 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 5236 5237
				NameableContainer.method7862(var0, var0.defaultHeight); // L: 5238
				if (Client.viewportTempX > -1 && Client.field755 < Client.field533) { // L: 5239
					Client.field611[Client.field755] = class166.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5240
					Client.field610[Client.field755] = class166.fontBold12.ascent; // L: 5241
					Client.field608[Client.field755] = Client.viewportTempX; // L: 5242
					Client.field609[Client.field755] = Client.viewportTempY - var9; // L: 5243
					Client.field696[Client.field755] = var0.field1189; // L: 5244
					Client.field543[Client.field755] = var0.field1177; // L: 5245
					Client.field528[Client.field755] = var0.overheadTextCyclesRemaining; // L: 5246
					Client.field614[Client.field755] = var0.field1224; // L: 5247
					Client.field616[Client.field755] = var0.overheadText; // L: 5248
					++Client.field755; // L: 5249
					var9 += 12; // L: 5250
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7007()) { // L: 5254
				NameableContainer.method7862(var0, var0.defaultHeight + 15); // L: 5255

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5256
					HealthBarUpdate var11 = var10.getInventorySprite(Client.cycle); // L: 5257
					if (var11 == null) { // L: 5258
						if (var10.isEmpty()) { // L: 5316
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition; // L: 5259
						SpritePixels var79 = var12.method3647(); // L: 5260
						SpritePixels var83 = var12.method3646(); // L: 5261
						int var84 = 0; // L: 5263
						if (var79 != null && var83 != null) { // L: 5264
							if (var12.widthPadding * 2 < var83.subWidth) { // L: 5265
								var84 = var12.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2; // L: 5266
						} else {
							var15 = var12.width; // L: 5268
						}

						int var81 = 255; // L: 5269
						boolean var85 = true; // L: 5270
						int var86 = Client.cycle - var11.cycle; // L: 5271
						int var87 = var15 * var11.health2 / var12.width; // L: 5272
						int var88;
						int var98;
						if (var11.cycleOffset > var86) { // L: 5273
							var88 = var12.field1960 == 0 ? 0 : var12.field1960 * (var86 / var12.field1960); // L: 5274
							var22 = var15 * var11.health / var12.width; // L: 5275
							var98 = var88 * (var87 - var22) / var11.cycleOffset + var22; // L: 5276
						} else {
							var98 = var87; // L: 5279
							var88 = var11.cycleOffset + var12.int5 - var86; // L: 5280
							if (var12.int3 >= 0) { // L: 5281
								var81 = (var88 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var98 < 1) { // L: 5283
							var98 = 1;
						}

						if (var79 != null && var83 != null) { // L: 5284
							if (var15 == var98) { // L: 5285
								var98 += var84 * 2;
							} else {
								var98 += var84; // L: 5286
							}

							var88 = var79.subHeight; // L: 5287
							var9 += var88; // L: 5288
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5289
							var23 = var3 + Client.viewportTempY - var9; // L: 5290
							var22 -= var84; // L: 5291
							if (var81 >= 0 && var81 < 255) { // L: 5292
								var79.drawTransAt(var22, var23, var81); // L: 5293
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var98 + var22, var23 + var88); // L: 5294
								var83.drawTransAt(var22, var23, var81); // L: 5295
							} else {
								var79.drawTransBgAt(var22, var23); // L: 5298
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88); // L: 5299
								var83.drawTransBgAt(var22, var23); // L: 5300
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5302
							var9 += 2; // L: 5303
						} else {
							var9 += 5; // L: 5306
							if (Client.viewportTempX > -1) { // L: 5307
								var88 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5308
								var22 = var3 + Client.viewportTempY - var9; // L: 5309
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280); // L: 5310
								Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var98, var22, var15 - var98, 5, 16711680); // L: 5311
							}

							var9 += 2; // L: 5313
						}
					}
				}
			}

			if (var9 == -2) { // L: 5319
				var9 += 7;
			}

			Player var89;
			if (var8 && var0.playerCycle == Client.cycle && WorldMapRegion.method5288((Player)var0)) { // L: 5320
				var89 = (Player)var0; // L: 5321
				if (var8) { // L: 5322
					NameableContainer.method7862(var0, var0.defaultHeight + 15); // L: 5323
					AbstractFont var90 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 5324
					var9 += 4; // L: 5325
					var90.drawCentered(var89.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5326
					var9 += 18; // L: 5327
				}
			}

			if (var8) { // L: 5330
				var89 = (Player)var0; // L: 5331
				if (var89.isHidden) { // L: 5332
					return;
				}

				if (var89.headIconPk != -1 || var89.headIconPrayer != -1) { // L: 5333
					NameableContainer.method7862(var0, var0.defaultHeight + 15); // L: 5334
					if (Client.viewportTempX > -1) { // L: 5335
						if (var89.headIconPk != -1) { // L: 5336
							var9 += 25; // L: 5337
							NPCComposition.headIconPkSprites[var89.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5338
						}

						if (var89.headIconPrayer != -1) { // L: 5340
							var9 += 25; // L: 5341
							class157.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5342
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 5346
					NameableContainer.method7862(var0, var0.defaultHeight + 15); // L: 5347
					if (Client.viewportTempX > -1) { // L: 5348
						var9 += ReflectionCheck.headIconHintSprites[1].subHeight; // L: 5349
						ReflectionCheck.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5350
					}
				}
			} else {
				NPC var91 = (NPC)var0; // L: 5355
				int[] var92 = var91.method2563(); // L: 5356
				short[] var93 = var91.method2564(); // L: 5357
				if (var93 != null && var92 != null) { // L: 5358
					for (int var13 = 0; var13 < var93.length; ++var13) { // L: 5359
						if (var93[var13] >= 0 && var92[var13] >= 0) { // L: 5360
							long var14 = (long)var92[var13] << 8 | (long)var93[var13]; // L: 5363
							SpritePixels var16 = (SpritePixels)Client.field615.method7714(var14); // L: 5364
							if (var16 == null) { // L: 5365
								SpritePixels[] var17 = WorldMapScaleHandler.method5597(class180.archive8, var92[var13], 0); // L: 5366
								if (var17 != null && var93[var13] < var17.length) { // L: 5367
									var16 = var17[var93[var13]]; // L: 5368
									Client.field615.method7696(var14, var16); // L: 5369
								}
							}

							if (var16 != null) { // L: 5372
								NameableContainer.method7862(var0, var0.defaultHeight + 15); // L: 5373
								if (Client.viewportTempX > -1) { // L: 5374
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5375
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 5380
					NameableContainer.method7862(var0, var0.defaultHeight + 15); // L: 5381
					if (Client.viewportTempX > -1) { // L: 5382
						ReflectionCheck.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) { // L: 5385
				int var77 = var0.hitSplatCycles[var76]; // L: 5386
				int var78 = var0.hitSplatTypes[var76]; // L: 5387
				HitSplatDefinition var96 = null; // L: 5388
				int var80 = 0; // L: 5389
				if (var78 >= 0) { // L: 5390
					if (var77 <= Client.cycle) { // L: 5391
						continue;
					}

					var96 = PlayerComposition.method6053(var0.hitSplatTypes[var76]); // L: 5392
					var80 = var96.field2134; // L: 5393
					if (var96 != null && var96.transforms != null) { // L: 5394
						var96 = var96.transform(); // L: 5395
						if (var96 == null) { // L: 5396
							var0.hitSplatCycles[var76] = -1; // L: 5397
							continue; // L: 5398
						}
					}
				} else if (var77 < 0) { // L: 5402
					continue;
				}

				var15 = var0.hitSplatTypes2[var76]; // L: 5403
				HitSplatDefinition var94 = null; // L: 5404
				if (var15 >= 0) { // L: 5405
					var94 = PlayerComposition.method6053(var15); // L: 5406
					if (var94 != null && var94.transforms != null) { // L: 5407
						var94 = var94.transform();
					}
				}

				if (var77 - var80 <= Client.cycle) { // L: 5409
					if (var96 == null) { // L: 5410
						var0.hitSplatCycles[var76] = -1; // L: 5411
					} else {
						NameableContainer.method7862(var0, var0.defaultHeight / 2); // L: 5414
						if (Client.viewportTempX > -1) { // L: 5415
							boolean var97 = true; // L: 5416
							if (var76 == 1) { // L: 5417
								Client.viewportTempY -= 20; // L: 5418
							}

							if (var76 == 2) { // L: 5420
								Client.viewportTempX -= 15; // L: 5421
								Client.viewportTempY -= 10; // L: 5422
							}

							if (var76 == 3) { // L: 5424
								Client.viewportTempX += 15; // L: 5425
								Client.viewportTempY -= 10; // L: 5426
							}

							SpritePixels var18 = null; // L: 5428
							SpritePixels var19 = null; // L: 5429
							SpritePixels var20 = null; // L: 5430
							SpritePixels var21 = null; // L: 5431
							var22 = 0; // L: 5432
							var23 = 0; // L: 5433
							int var24 = 0; // L: 5434
							int var25 = 0; // L: 5435
							int var26 = 0; // L: 5436
							int var27 = 0; // L: 5437
							int var28 = 0; // L: 5438
							int var29 = 0; // L: 5439
							SpritePixels var30 = null; // L: 5440
							SpritePixels var31 = null; // L: 5441
							SpritePixels var32 = null; // L: 5442
							SpritePixels var33 = null; // L: 5443
							int var34 = 0; // L: 5444
							int var35 = 0; // L: 5445
							int var36 = 0; // L: 5446
							int var37 = 0; // L: 5447
							int var38 = 0; // L: 5448
							int var39 = 0; // L: 5449
							int var40 = 0; // L: 5450
							int var41 = 0; // L: 5451
							int var42 = 0; // L: 5452
							var18 = var96.method3862(); // L: 5453
							int var43;
							if (var18 != null) { // L: 5454
								var22 = var18.subWidth; // L: 5455
								var43 = var18.subHeight; // L: 5456
								if (var43 > var42) { // L: 5457
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5458
							}

							var19 = var96.method3863(); // L: 5460
							if (var19 != null) { // L: 5461
								var23 = var19.subWidth; // L: 5462
								var43 = var19.subHeight; // L: 5463
								if (var43 > var42) { // L: 5464
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5465
							}

							var20 = var96.method3885(); // L: 5467
							if (var20 != null) { // L: 5468
								var24 = var20.subWidth; // L: 5469
								var43 = var20.subHeight; // L: 5470
								if (var43 > var42) { // L: 5471
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5472
							}

							var21 = var96.method3872(); // L: 5474
							if (var21 != null) { // L: 5475
								var25 = var21.subWidth; // L: 5476
								var43 = var21.subHeight; // L: 5477
								if (var43 > var42) { // L: 5478
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5479
							}

							if (var94 != null) { // L: 5481
								var30 = var94.method3862(); // L: 5482
								if (var30 != null) { // L: 5483
									var34 = var30.subWidth; // L: 5484
									var43 = var30.subHeight; // L: 5485
									if (var43 > var42) { // L: 5486
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5487
								}

								var31 = var94.method3863(); // L: 5489
								if (var31 != null) { // L: 5490
									var35 = var31.subWidth; // L: 5491
									var43 = var31.subHeight; // L: 5492
									if (var43 > var42) { // L: 5493
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5494
								}

								var32 = var94.method3885(); // L: 5496
								if (var32 != null) { // L: 5497
									var36 = var32.subWidth; // L: 5498
									var43 = var32.subHeight; // L: 5499
									if (var43 > var42) { // L: 5500
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5501
								}

								var33 = var94.method3872(); // L: 5503
								if (var33 != null) { // L: 5504
									var37 = var33.subWidth; // L: 5505
									var43 = var33.subHeight; // L: 5506
									if (var43 > var42) { // L: 5507
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5508
								}
							}

							Font var82 = var96.getFont(); // L: 5513
							if (var82 == null) { // L: 5514
								var82 = MouseHandler.fontPlain11;
							}

							Font var44;
							if (var94 != null) { // L: 5515
								var44 = var94.getFont(); // L: 5516
								if (var44 == null) { // L: 5517
									var44 = MouseHandler.fontPlain11;
								}
							} else {
								var44 = MouseHandler.fontPlain11; // L: 5519
							}

							String var45 = null; // L: 5520
							String var46 = null; // L: 5521
							boolean var47 = false; // L: 5522
							int var48 = 0; // L: 5523
							var45 = var96.getString(var0.hitSplatValues[var76]); // L: 5524
							int var95 = var82.stringWidth(var45); // L: 5525
							if (var94 != null) { // L: 5526
								var46 = var94.getString(var0.hitSplatValues2[var76]); // L: 5527
								var48 = var44.stringWidth(var46); // L: 5528
							}

							int var49 = 0; // L: 5530
							int var50 = 0; // L: 5531
							if (var23 > 0) { // L: 5532
								if (var20 == null && var21 == null) { // L: 5533
									var49 = 1; // L: 5534
								} else {
									var49 = var95 / var23 + 1;
								}
							}

							if (var94 != null && var35 > 0) { // L: 5536 5537
								if (var32 == null && var33 == null) { // L: 5538
									var50 = 1; // L: 5539
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5542
							int var52 = var51; // L: 5543
							if (var22 > 0) { // L: 5544
								var51 += var22;
							}

							var51 += 2; // L: 5545
							int var53 = var51; // L: 5546
							if (var24 > 0) { // L: 5547
								var51 += var24;
							}

							int var54 = var51; // L: 5548
							int var55 = var51; // L: 5549
							int var56;
							if (var23 > 0) { // L: 5550
								var56 = var49 * var23; // L: 5551
								var51 += var56; // L: 5552
								var55 += (var56 - var95) / 2; // L: 5553
							} else {
								var51 += var95; // L: 5556
							}

							var56 = var51; // L: 5558
							if (var25 > 0) { // L: 5559
								var51 += var25;
							}

							int var57 = 0; // L: 5560
							int var58 = 0; // L: 5561
							int var59 = 0; // L: 5562
							int var60 = 0; // L: 5563
							int var61 = 0; // L: 5564
							int var62;
							if (var94 != null) { // L: 5565
								var51 += 2; // L: 5566
								var57 = var51; // L: 5567
								if (var34 > 0) { // L: 5568
									var51 += var34;
								}

								var51 += 2; // L: 5569
								var58 = var51; // L: 5570
								if (var36 > 0) { // L: 5571
									var51 += var36;
								}

								var59 = var51; // L: 5572
								var61 = var51; // L: 5573
								if (var35 > 0) { // L: 5574
									var62 = var35 * var50; // L: 5575
									var51 += var62; // L: 5576
									var61 += (var62 - var48) / 2; // L: 5577
								} else {
									var51 += var48; // L: 5580
								}

								var60 = var51; // L: 5582
								if (var37 > 0) { // L: 5583
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle; // L: 5585
							int var63 = var96.field2133 - var62 * var96.field2133 / var96.field2134; // L: 5586
							int var64 = var62 * var96.field2140 / var96.field2134 + -var96.field2140; // L: 5587
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5588
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5589
							int var67 = var66; // L: 5590
							int var68 = var42 + var66; // L: 5591
							int var69 = var66 + var96.field2138 + 15; // L: 5592
							int var70 = var69 - var82.maxAscent; // L: 5593
							int var71 = var69 + var82.maxDescent; // L: 5594
							if (var70 < var66) { // L: 5595
								var67 = var70;
							}

							if (var71 > var68) { // L: 5596
								var68 = var71;
							}

							int var72 = 0; // L: 5597
							int var73;
							int var74;
							if (var94 != null) { // L: 5598
								var72 = var66 + var94.field2138 + 15; // L: 5599
								var73 = var72 - var44.maxAscent; // L: 5600
								var74 = var72 + var44.maxDescent; // L: 5601
								if (var73 < var67) { // L: 5602
									;
								}

								if (var74 > var68) { // L: 5603
									;
								}
							}

							var73 = 255; // L: 5605
							if (var96.field2137 >= 0) { // L: 5606
								var73 = (var62 << 8) / (var96.field2134 - var96.field2137);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5607
								if (var18 != null) { // L: 5608
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5609
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5610
									for (var74 = 0; var74 < var49; ++var74) { // L: 5611
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73); // L: 5612
									}
								}

								if (var21 != null) { // L: 5615
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var55 + var65, var69, var96.textColor, 0, var73); // L: 5616
								if (var94 != null) { // L: 5617
									if (var30 != null) { // L: 5618
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5619
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5620
										for (var74 = 0; var74 < var50; ++var74) { // L: 5621
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 5622
										}
									}

									if (var33 != null) { // L: 5625
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var94.textColor, 0, var73); // L: 5626
								}
							} else {
								if (var18 != null) { // L: 5630
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) { // L: 5631
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 5632
									for (var74 = 0; var74 < var49; ++var74) { // L: 5633
										var19.drawTransBgAt(var74 * var23 + (var65 + var54 - var27), var66); // L: 5634
									}
								}

								if (var21 != null) { // L: 5637
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var82.draw(var45, var65 + var55, var69, var96.textColor | -16777216, 0); // L: 5638
								if (var94 != null) { // L: 5639
									if (var30 != null) { // L: 5640
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 5641
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) { // L: 5642
										for (var74 = 0; var74 < var50; ++var74) { // L: 5643
											var31.drawTransBgAt(var74 * var35 + (var59 + var65 - var39), var66); // L: 5644
										}
									}

									if (var33 != null) { // L: 5647
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var94.textColor | -16777216, 0); // L: 5648
								}
							}
						}
					}
				}
			}

		}
	} // L: 5653
}
